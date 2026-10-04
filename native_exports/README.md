# Notein Native Export (`.in`) — Format Analysis

Samples: `Calculus.in` (15.7 MB, 117 pages, 28,963 strokes, 663 shapes),
`Notein_LMVT_Clean_Test.in` (14.5 KB, 2 pages, 43 strokes).
Analysis: pure static inspection (ZIP + SQLite), no execution.
Author: opencode

---

## 1. Verdict — YES, extremely useful

`.in` is a **ZIP archive** (`PK`) containing a **SQLite/Room database + JSON sidecars**.
This is a clean, proven, fully-inspectable format and an excellent template for `.thunder`.
We should adopt the same shape (with fixes — see §6).

---

## 2. Container layout

```
Calculus.in  (= ZIP, deflate)
├── note_database_note_<noteId>_db          ← SQLite (main)
├── note_database_note_<noteId>_db-wal      ← SQLite WAL (optional)
├── note_database_note_<noteId>_db-shm      ← SQLite shared-mem (optional)
├── note_meta.json
├── note_extra.json
├── note_in_flag.json
├── note_label.json
└── notepdf_lost_info.json
```

- DB is **Room-generated** (SQLite `user_version = 25`, `room_master_table` identity hash).
- Sidecars are kotlinx-serialization JSON. Deltas (`-wal`/`-shm`) are included when present.

### JSON sidecars
- `note_meta.json`: `id`, `title`, `creationTime`, `lastModificationTime`, `lastOpenedTime`,
  `favorite`, `inTrashBin`, `lockAdded`, `totalPagesCount`, `unboundedNote`, `userId`,
  `usingOwnPdf`, `tnPath`, `tnWidth`, `tnHeight`.
- `note_extra.json`: `{"OooO00o":45}` (obfuscated key — a flaw).
- `note_in_flag.json`: 5 booleans with obfuscated keys (`OooO00o...` — a flaw).
- `note_label.json`: `{"note_labels":[],"page_id_to_labels_map":{}}`.
- `notepdf_lost_info.json`: empty.

---

## 3. Database schema (the important part)

Per-note DB. Note: this is **per-document content**, separate from Notein's global index DB
(the one with folders/notes list we found in jadx).

| Table | Purpose | Calculus rows |
|---|---|---|
| `NoteContentEntity` | note-level root: `page_list` (JSON array of page ids), `page_layer_list`, `outline_list`, `default_page_id`, `saved_page_index`, `zoom`, `unbounded_page_offset_x/y`, `page_offset_json`, `unbounded_note`, timestamps, `extras` | 1 |
| `PageEntity` | one row/page: `paper_spec` (JSON), `page_orientation` (HORIZONTAL/VERTICAL), `paper_theme` (typed JSON), `padding_color`, `paper_padding`, `padding_style_json`, `tn_path`, `unbounded`, `source`, `recover_*`, `is_in_trash_bin`, `history_page_id_list`, `rotation_direction_index` | 118 |
| `StrokeEntity` | `page_id`, `layer_id`, `record_json`, `ink_stroke_json`, `ink_stroke_blob` (BLOB), `left/top/right/bottom` (bounds) | 28,963 |
| `ShapeEntity` | `page_id`, `color`, `width`, `points` (JSON), `type`, `blend_mode`, `layer_id`, `tape_like`, `style`, `opacity_of_fill_color`, bounds | 663 |
| `TextBoxEntity` | `text`, `text_size`, `box_width/height`, `line_height`, `background_color`, `bounds`, `layer`, `local_transform_json`, `default_text_color` | 0 |
| `ImageEntity` | `uri`, `layer`, `layer_id`, `bounds`, `rotation`, `fixed`, bounds | 0 |
| `OutlineEntity` | `title`, `parent_id`, `page_id`, `quote_id`, `children` | 0 |
| `CommentEntity` | `title`, `quote_id`, `sort_key` | 0 |
| `QuoteEntity`/`QuoteTextAnnoEntity` | highlights/annotations on text/PDF | 0 |
| `HyperLinkEntity` | links with bounds + destination | 0 |
| `PageLayerEntity` | layers per page: `visible`, `name`, `extras` | 2 |
| `DualLinkRefEntity`/`DualLinkSourceEntity` | note-to-note links | 0 |
| `AudioFileEntity`/`AudioSyncRecordEntity`/`NoteAudioFileIdsFieldEntity` | audio recording notes | 0 |
| `PdfInfoEntity` | `pdf_path`, `tn_path`, `password` | 0 |
| `android_metadata`, `room_master_table` | Room bookkeeping | — |

**Every content row carries a bounding box** (`left/top/right/bottom`) — used as a spatial index
for hit-testing and render culling. Kept redundant with the geometry for query speed.

---

## 4. Stroke storage — two generations

`StrokeEntity` shows the format's evolution:

1. **Legacy: `record_json`** (e.g. 63 rows in Calculus) — custom JSON:
   ```json
   {"id":"...","type":5,"color":-543488,"width":2.377552,
    "points":[{"x":1402.78,"y":989.59,"p":1.0,"action":0},
              {"x":1405.37,"y":993.76,"p":1.0,"action":1}],
    "bounds":{...},"layerId":"default","creationTime":1787751854576}
   ```
   (`p` = pressure, `action` = 0/1 down/up.)

2. **Current: `ink_stroke_blob`** (28,900 rows) — the **raw AndroidX Ink `InkStrokeProto`
   protobuf**, exactly the message decoded from `InkStrokeProtoSerializer`:
   ```
   0A 24 <id>            field 1  = id
   12 07 "default"       field 2  = layer_id
   18 <varint>           field 3  = creation_time
   25 <4 bytes>          field 4  = brush_size (float)
   28 <varint>           field 5  = brush_color
   35 <4 bytes>          field 6  = brush_epsilon
   3A 13 "notein-ballpoint-v1"  field 7 = brush_family_id
   40 01                 field 8  = tool_type
   4D <4 bytes>          field 9  = stroke_unit_length_cm
   9A 02 <packed x,y>    field 10 = input_xy
   ...                              field 11 = input_attrs (5 floats/point)
   ...                              field 12/13 = stroke_to_world / world_to_view
   ```
   The small file's one stroke decodes cleanly with these tags. This confirms blobs are
   **portable AndroidX Ink strokes** — no Notein-proprietary encoding.

Takeaway: `.thunder` should store strokes as **AndroidX Ink protobuf blobs** (same as the modern
path), optionally with a `record_json` fallback for tools that can't produce protobuf.

---

## 5. Sampling notes

- Paper: A4, `HORIZONTAL`, `preciseWidth 1240` × `preciseHeight 1754` (px), `paper_theme` typed by
  Kotlin FQCN (e.g. `...papertheme.LocalResPaperTheme`, `LambdaPaperTheme`, `BlankPaperStyle`).
- Page orientation is per page (`HORIZONTAL` in these files) → our portrait/landscape feature maps
  directly.
- Coordinates are page-space floats; bounds are precomputed.

---

## 6. Flaws to fix in `.thunder`

1. **Not fully self-contained.** `tn_path` (page thumbnails) and `ImageEntity.uri`,
   `PdfInfoEntity.pdf_path` point to the app's private storage — external assets are **not packed**
   into the ZIP. A `.thunder` must embed images/PDFs/thumbnails/audio so it is portable.
2. **Obfuscated JSON keys** (`note_extra.json`, `note_in_flag.json`) — fragile. Use readable,
   versioned keys.
3. **No explicit format-version manifest** (only SQLite `user_version` + Room identity hash). Add a
   `manifest.json` with `format_version`, `app_version`, `schema_version`, counts, checksum.
4. **Room identity-hash coupling** — a change to the schema can make old exports unreadable. Version
   explicitly and provide migrations.
5. **Whole-DB dump** — for 1000+ page notes, importing means reading the entire DB. Versioned,
   page-addressable layout enables lazy loading. (SQLite is fine if we query per visible page.)

---

## 7. Proposed `.thunder` v1 (template: Notein `.in` + fixes)

```
note.thunder  (ZIP, deflate)
├── manifest.json          # format_version, app_version, schema_version, note meta, checksum
├── note.sqlite            # Room DB: same table family as §3
├── assets/
│   ├── images/            # embedded (uri rewritten to relative path)
│   ├── pdf/
│   ├── audio/
│   └── thumbnails/
└── preview.png            # cover thumbnail
```

Rules:
- Strokes stored as **AndroidX Ink `InkStrokeProto` blobs** (+ bounds).
- Assets **embedded** and paths made relative (fix §6.1).
- `manifest.json` with explicit versions + checksum (fix §6.3).
- Human-readable JSON keys (fix §6.2).
- One note per `.thunder`; folders are metadata in the global DB (like Notein).

---

## 8. Portability test result (the user's experiment)

You edited the extracted SQLite DB, re-imported, and the injected strokes appeared — confirming
the content format is an open, editable DB. That worked because import is a **batch** operation:
the app was closed and the file replaced, then re-opened. **Live** injection failed because the
running app holds the DB open in private storage and never re-reads it. See the accompanying
`docs/thunder-format-proposal.md` for how ThunderNotes can make live injection a first-class,
root-free feature.