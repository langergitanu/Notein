package o0OO000o;

import com.aspose.slides.C22213OooOoOO;
import com.aspose.slides.C22215OooOoo0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hihonor.honorid.core.data.ChildrenInfo;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.data.p602db.NoteContentDatabase_Impl;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.penkit.models.LayerInfo;
import java.util.HashMap;
import java.util.HashSet;
import o000oo0.AbstractC24678OooOoO0;
import o000ooOO.C24734OooO0O0;
import o000ooOO.OooOOOO;
import o000ooo.C24746OooO00o;
import o000ooo.InterfaceC24747OooO0O0;

/* JADX INFO: renamed from: o0OO000o.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26467OooO0oO extends AbstractC24678OooOoO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ NoteContentDatabase_Impl f90933OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26467OooO0oO(NoteContentDatabase_Impl noteContentDatabase_Impl) {
        super(25, "27e87b81a4bdf0fd1ac633ae56b692f5", "49a2aeedcf5c86ddb3a381fb3b44f1fb");
        this.f90933OooO0Oo = noteContentDatabase_Impl;
    }

    @Override // o000oo0.AbstractC24678OooOoO0
    public final void OooO00o(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) throws Exception {
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `NoteContentEntity` (`id` TEXT NOT NULL, `page_list` TEXT, `page_layer_list` TEXT, `outline_list` TEXT NOT NULL, `default_page_id` TEXT NOT NULL, `pdf_info_id` TEXT, `saved_page_index` INTEGER NOT NULL, `activated_page_layer_id` TEXT NOT NULL, `zoom` REAL NOT NULL, `unbounded_page_offset_x` REAL NOT NULL, `unbounded_page_offset_y` REAL NOT NULL, `page_offset_json` TEXT NOT NULL DEFAULT '{\"offset_x\":0,\"offset_y\":0}', `unbounded_note` INTEGER NOT NULL, `creation_time` INTEGER NOT NULL, `last_modification_time` INTEGER NOT NULL, `extras` TEXT NOT NULL, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `PageEntity` (`id` TEXT NOT NULL, `note_id` TEXT NOT NULL, `paper_spec` TEXT, `page_orientation` TEXT NOT NULL, `paper_theme` TEXT, `padding_color` INTEGER NOT NULL, `paper_padding` TEXT, `padding_style_json` TEXT, `creation_time` INTEGER NOT NULL, `last_modification_time` INTEGER NOT NULL, `tn_path` TEXT NOT NULL, `unbounded` INTEGER NOT NULL, `source` INTEGER NOT NULL, `recover_note_id` TEXT NOT NULL, `recover_note_title` TEXT NOT NULL, `recover_index` INTEGER NOT NULL, `is_in_trash_bin` INTEGER NOT NULL, `history_page_id_list` TEXT, `rotation_direction_index` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `PdfInfoEntity` (`id` TEXT NOT NULL, `pdf_path` TEXT NOT NULL, `tn_path` TEXT NOT NULL, `password` TEXT, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `StrokeEntity` (`id` TEXT NOT NULL, `page_id` TEXT NOT NULL, `layer_id` TEXT NOT NULL, `creation_time` INTEGER NOT NULL, `record_json` TEXT, `ink_stroke_json` TEXT, `ink_stroke_blob` BLOB, `left` REAL, `top` REAL, `right` REAL, `bottom` REAL, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `ImageEntity` (`id` TEXT NOT NULL, `uri` TEXT NOT NULL, `layer` INTEGER NOT NULL, `layer_id` TEXT NOT NULL, `bounds` TEXT, `rotation` REAL NOT NULL, `page_id` TEXT NOT NULL, `creation_time` INTEGER NOT NULL, `last_modification_time` INTEGER NOT NULL, `left` REAL, `top` REAL, `right` REAL, `bottom` REAL, `fixed` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `OutlineEntity` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `parent_id` TEXT, `page_id` TEXT NOT NULL, `note_id` TEXT NOT NULL, `quote_id` TEXT, `children` TEXT NOT NULL, `creation_time` INTEGER NOT NULL, `last_modification_time` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `CommentEntity` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `page_id` TEXT NOT NULL, `note_id` TEXT NOT NULL, `quote_id` TEXT, `creation_time` INTEGER NOT NULL, `last_modification_time` INTEGER NOT NULL, `sort_key` INTEGER, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `QuoteEntity` (`id` TEXT NOT NULL, `page_id` TEXT NOT NULL, `type` INTEGER NOT NULL, `color` INTEGER NOT NULL, `bg_color` INTEGER NOT NULL, `underline_color` INTEGER NOT NULL, `label_rect` TEXT NOT NULL, `rect_list` TEXT NOT NULL, `text` TEXT NOT NULL, `anno_item_id_list` TEXT, `link_type` INTEGER NOT NULL, `link_id` TEXT NOT NULL, `layer_id` TEXT NOT NULL, `creation_time` INTEGER NOT NULL, `is_vertical_pdf_text` INTEGER NOT NULL, `is_rtl_or_btt_pdf_text` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `TextBoxEntity` (`id` TEXT NOT NULL, `page_id` TEXT NOT NULL, `text` TEXT NOT NULL, `text_size` REAL NOT NULL, `box_width` REAL NOT NULL, `box_height` REAL NOT NULL, `line_height` REAL NOT NULL, `background_color` INTEGER NOT NULL, `bounds` TEXT, `layer` INTEGER NOT NULL, `layer_id` TEXT NOT NULL, `default_text_color` INTEGER NOT NULL, `creation_time` INTEGER NOT NULL, `local_transform_json` TEXT, `left` REAL, `top` REAL, `right` REAL, `bottom` REAL, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `ShapeEntity` (`id` TEXT NOT NULL, `page_id` TEXT NOT NULL, `color` INTEGER NOT NULL, `width` REAL NOT NULL, `points` TEXT NOT NULL, `type` INTEGER NOT NULL, `blend_mode` INTEGER NOT NULL, `layer_id` TEXT NOT NULL, `tape_like` INTEGER NOT NULL, `style` INTEGER NOT NULL, `opacity_of_fill_color` INTEGER NOT NULL, `creation_time` INTEGER NOT NULL, `left` REAL, `top` REAL, `right` REAL, `bottom` REAL, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `DualLinkRefEntity` (`id` TEXT NOT NULL, `note_id` TEXT NOT NULL, `page_id` TEXT NOT NULL, `bounds` TEXT NOT NULL, `item_id` TEXT, `source_id` TEXT, `source_note_id` TEXT, `creation_time` INTEGER NOT NULL, `last_modification_time` INTEGER NOT NULL, `left` REAL, `top` REAL, `right` REAL, `bottom` REAL, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `DualLinkSourceEntity` (`id` TEXT NOT NULL, `note_id` TEXT NOT NULL, `page_id` TEXT NOT NULL, `type` INTEGER NOT NULL, `bounds` TEXT NOT NULL, `text_bounds` TEXT NOT NULL, `ref_id` TEXT, `ref_note_id` TEXT, `creation_time` INTEGER NOT NULL, `last_modification_time` INTEGER NOT NULL, `left` REAL, `top` REAL, `right` REAL, `bottom` REAL, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `PageLayerEntity` (`id` TEXT NOT NULL, `note_id` TEXT NOT NULL, `visible` INTEGER NOT NULL, `extras` TEXT, `name` TEXT, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `HyperLinkEntity` (`id` TEXT NOT NULL, `bounds` TEXT, `page_id` TEXT NOT NULL, `type` INTEGER NOT NULL, `destination` TEXT NOT NULL, `extras` TEXT, `creation_time` INTEGER NOT NULL, `last_modification_time` INTEGER NOT NULL, `left` REAL, `top` REAL, `right` REAL, `bottom` REAL, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `QuoteTextAnnoEntity` (`id` TEXT NOT NULL, `username` TEXT NOT NULL, `type` INTEGER NOT NULL, `text` TEXT NOT NULL, `creation_time` INTEGER NOT NULL, `last_modified_time` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `AudioFileEntity` (`id` TEXT NOT NULL, `file_path` TEXT NOT NULL, `audio_name` TEXT NOT NULL, `duration` INTEGER NOT NULL, `play_speed` REAL NOT NULL, `creation_time` INTEGER NOT NULL, `last_modification_time` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `AudioSyncRecordEntity` (`id` TEXT NOT NULL, `audio_id` TEXT NOT NULL, `audio_position` INTEGER NOT NULL, `display_item_id` TEXT NOT NULL, `display_item_type` INTEGER NOT NULL, `creation_time` INTEGER NOT NULL, `last_modification_time` INTEGER NOT NULL, `deleted` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS `NoteAudioFileIdsFieldEntity` (`id` TEXT NOT NULL, `note_id` TEXT NOT NULL, `audio_file_ids` TEXT NOT NULL, PRIMARY KEY(`id`))");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '27e87b81a4bdf0fd1ac633ae56b692f5')");
    }

    @Override // o000oo0.AbstractC24678OooOoO0
    public final void OooO0O0(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) throws Exception {
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `NoteContentEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `PageEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `PdfInfoEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `StrokeEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `ImageEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `OutlineEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `CommentEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `QuoteEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `TextBoxEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `ShapeEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `DualLinkRefEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `DualLinkSourceEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `PageLayerEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `HyperLinkEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `QuoteTextAnnoEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `AudioFileEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `AudioSyncRecordEntity`");
        C24746OooO00o.OooO0o0(interfaceC24747OooO0O0, "DROP TABLE IF EXISTS `NoteAudioFileIdsFieldEntity`");
    }

    @Override // o000oo0.AbstractC24678OooOoO0
    public final void OooO0OO(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) {
    }

    @Override // o000oo0.AbstractC24678OooOoO0
    public final void OooO0Oo(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) throws Exception {
        this.f90933OooO0Oo.OooOOo0(interfaceC24747OooO0O0);
    }

    @Override // o000oo0.AbstractC24678OooOoO0
    public final void OooO0o(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) throws Exception {
        C24734OooO0O0.OooO0O0(interfaceC24747OooO0O0);
    }

    @Override // o000oo0.AbstractC24678OooOoO0
    public final void OooO0o0(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) {
    }

    @Override // o000oo0.AbstractC24678OooOoO0
    public final AbstractC24678OooOoO0.OooO00o OooO0oO(InterfaceC24747OooO0O0 interfaceC24747OooO0O0) {
        HashMap map = new HashMap(16);
        map.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map.put("page_list", new OooOOOO.OooO00o("page_list", "TEXT", false, 0, null, 1));
        map.put("page_layer_list", new OooOOOO.OooO00o("page_layer_list", "TEXT", false, 0, null, 1));
        map.put("outline_list", new OooOOOO.OooO00o("outline_list", "TEXT", true, 0, null, 1));
        map.put("default_page_id", new OooOOOO.OooO00o("default_page_id", "TEXT", true, 0, null, 1));
        map.put("pdf_info_id", new OooOOOO.OooO00o("pdf_info_id", "TEXT", false, 0, null, 1));
        map.put("saved_page_index", new OooOOOO.OooO00o("saved_page_index", "INTEGER", true, 0, null, 1));
        map.put("activated_page_layer_id", new OooOOOO.OooO00o("activated_page_layer_id", "TEXT", true, 0, null, 1));
        map.put("zoom", new OooOOOO.OooO00o("zoom", "REAL", true, 0, null, 1));
        map.put("unbounded_page_offset_x", new OooOOOO.OooO00o("unbounded_page_offset_x", "REAL", true, 0, null, 1));
        map.put("unbounded_page_offset_y", new OooOOOO.OooO00o("unbounded_page_offset_y", "REAL", true, 0, null, 1));
        map.put("page_offset_json", new OooOOOO.OooO00o("page_offset_json", "TEXT", true, 0, "'{\"offset_x\":0,\"offset_y\":0}'", 1));
        map.put("unbounded_note", new OooOOOO.OooO00o("unbounded_note", "INTEGER", true, 0, null, 1));
        map.put("creation_time", new OooOOOO.OooO00o("creation_time", "INTEGER", true, 0, null, 1));
        map.put("last_modification_time", new OooOOOO.OooO00o("last_modification_time", "INTEGER", true, 0, null, 1));
        OooOOOO oooOOOO = new OooOOOO("NoteContentEntity", map, C22215OooOoo0.OooO0O0(map, "extras", new OooOOOO.OooO00o("extras", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o = OooOOOO.OooO00o(interfaceC24747OooO0O0, "NoteContentEntity");
        if (!oooOOOO.equals(oooOOOOOooO00o)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("NoteContentEntity(com.orion.notein.data.db.entity.NoteContentEntity).\n Expected:\n", oooOOOO, "\n Found:\n", oooOOOOOooO00o));
        }
        HashMap map2 = new HashMap(19);
        map2.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map2.put("note_id", new OooOOOO.OooO00o("note_id", "TEXT", true, 0, null, 1));
        map2.put("paper_spec", new OooOOOO.OooO00o("paper_spec", "TEXT", false, 0, null, 1));
        map2.put("page_orientation", new OooOOOO.OooO00o("page_orientation", "TEXT", true, 0, null, 1));
        map2.put(LayerInfo.PAPER_THEME_LAYER_ID, new OooOOOO.OooO00o(LayerInfo.PAPER_THEME_LAYER_ID, "TEXT", false, 0, null, 1));
        map2.put("padding_color", new OooOOOO.OooO00o("padding_color", "INTEGER", true, 0, null, 1));
        map2.put("paper_padding", new OooOOOO.OooO00o("paper_padding", "TEXT", false, 0, null, 1));
        map2.put("padding_style_json", new OooOOOO.OooO00o("padding_style_json", "TEXT", false, 0, null, 1));
        map2.put("creation_time", new OooOOOO.OooO00o("creation_time", "INTEGER", true, 0, null, 1));
        map2.put("last_modification_time", new OooOOOO.OooO00o("last_modification_time", "INTEGER", true, 0, null, 1));
        map2.put("tn_path", new OooOOOO.OooO00o("tn_path", "TEXT", true, 0, null, 1));
        map2.put("unbounded", new OooOOOO.OooO00o("unbounded", "INTEGER", true, 0, null, 1));
        map2.put("source", new OooOOOO.OooO00o("source", "INTEGER", true, 0, null, 1));
        map2.put("recover_note_id", new OooOOOO.OooO00o("recover_note_id", "TEXT", true, 0, null, 1));
        map2.put("recover_note_title", new OooOOOO.OooO00o("recover_note_title", "TEXT", true, 0, null, 1));
        map2.put("recover_index", new OooOOOO.OooO00o("recover_index", "INTEGER", true, 0, null, 1));
        map2.put("is_in_trash_bin", new OooOOOO.OooO00o("is_in_trash_bin", "INTEGER", true, 0, null, 1));
        map2.put("history_page_id_list", new OooOOOO.OooO00o("history_page_id_list", "TEXT", false, 0, null, 1));
        OooOOOO oooOOOO2 = new OooOOOO("PageEntity", map2, C22215OooOoo0.OooO0O0(map2, "rotation_direction_index", new OooOOOO.OooO00o("rotation_direction_index", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o2 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "PageEntity");
        if (!oooOOOO2.equals(oooOOOOOooO00o2)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("PageEntity(com.orion.notein.data.db.entity.PageEntity).\n Expected:\n", oooOOOO2, "\n Found:\n", oooOOOOOooO00o2));
        }
        HashMap map3 = new HashMap(4);
        map3.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map3.put("pdf_path", new OooOOOO.OooO00o("pdf_path", "TEXT", true, 0, null, 1));
        map3.put("tn_path", new OooOOOO.OooO00o("tn_path", "TEXT", true, 0, null, 1));
        OooOOOO oooOOOO3 = new OooOOOO("PdfInfoEntity", map3, C22215OooOoo0.OooO0O0(map3, "password", new OooOOOO.OooO00o("password", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o3 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "PdfInfoEntity");
        if (!oooOOOO3.equals(oooOOOOOooO00o3)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("PdfInfoEntity(com.orion.notein.data.db.entity.PdfInfoEntity).\n Expected:\n", oooOOOO3, "\n Found:\n", oooOOOOOooO00o3));
        }
        HashMap map4 = new HashMap(11);
        map4.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map4.put("page_id", new OooOOOO.OooO00o("page_id", "TEXT", true, 0, null, 1));
        map4.put("layer_id", new OooOOOO.OooO00o("layer_id", "TEXT", true, 0, null, 1));
        map4.put("creation_time", new OooOOOO.OooO00o("creation_time", "INTEGER", true, 0, null, 1));
        map4.put("record_json", new OooOOOO.OooO00o("record_json", "TEXT", false, 0, null, 1));
        map4.put("ink_stroke_json", new OooOOOO.OooO00o("ink_stroke_json", "TEXT", false, 0, null, 1));
        map4.put("ink_stroke_blob", new OooOOOO.OooO00o("ink_stroke_blob", "BLOB", false, 0, null, 1));
        map4.put("left", new OooOOOO.OooO00o("left", "REAL", false, 0, null, 1));
        map4.put("top", new OooOOOO.OooO00o("top", "REAL", false, 0, null, 1));
        map4.put("right", new OooOOOO.OooO00o("right", "REAL", false, 0, null, 1));
        OooOOOO oooOOOO4 = new OooOOOO("StrokeEntity", map4, C22215OooOoo0.OooO0O0(map4, "bottom", new OooOOOO.OooO00o("bottom", "REAL", false, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o4 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "StrokeEntity");
        if (!oooOOOO4.equals(oooOOOOOooO00o4)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("StrokeEntity(com.orion.notein.data.db.entity.StrokeEntity).\n Expected:\n", oooOOOO4, "\n Found:\n", oooOOOOOooO00o4));
        }
        HashMap map5 = new HashMap(14);
        map5.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map5.put("uri", new OooOOOO.OooO00o("uri", "TEXT", true, 0, null, 1));
        map5.put("layer", new OooOOOO.OooO00o("layer", "INTEGER", true, 0, null, 1));
        map5.put("layer_id", new OooOOOO.OooO00o("layer_id", "TEXT", true, 0, null, 1));
        map5.put("bounds", new OooOOOO.OooO00o("bounds", "TEXT", false, 0, null, 1));
        map5.put("rotation", new OooOOOO.OooO00o("rotation", "REAL", true, 0, null, 1));
        map5.put("page_id", new OooOOOO.OooO00o("page_id", "TEXT", true, 0, null, 1));
        map5.put("creation_time", new OooOOOO.OooO00o("creation_time", "INTEGER", true, 0, null, 1));
        map5.put("last_modification_time", new OooOOOO.OooO00o("last_modification_time", "INTEGER", true, 0, null, 1));
        map5.put("left", new OooOOOO.OooO00o("left", "REAL", false, 0, null, 1));
        map5.put("top", new OooOOOO.OooO00o("top", "REAL", false, 0, null, 1));
        map5.put("right", new OooOOOO.OooO00o("right", "REAL", false, 0, null, 1));
        map5.put("bottom", new OooOOOO.OooO00o("bottom", "REAL", false, 0, null, 1));
        OooOOOO oooOOOO5 = new OooOOOO("ImageEntity", map5, C22215OooOoo0.OooO0O0(map5, "fixed", new OooOOOO.OooO00o("fixed", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o5 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "ImageEntity");
        if (!oooOOOO5.equals(oooOOOOOooO00o5)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("ImageEntity(com.orion.notein.data.db.entity.ImageEntity).\n Expected:\n", oooOOOO5, "\n Found:\n", oooOOOOOooO00o5));
        }
        HashMap map6 = new HashMap(9);
        map6.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map6.put(NoteMeta.PROPERTY_TITLE, new OooOOOO.OooO00o(NoteMeta.PROPERTY_TITLE, "TEXT", true, 0, null, 1));
        map6.put("parent_id", new OooOOOO.OooO00o("parent_id", "TEXT", false, 0, null, 1));
        map6.put("page_id", new OooOOOO.OooO00o("page_id", "TEXT", true, 0, null, 1));
        map6.put("note_id", new OooOOOO.OooO00o("note_id", "TEXT", true, 0, null, 1));
        map6.put("quote_id", new OooOOOO.OooO00o("quote_id", "TEXT", false, 0, null, 1));
        map6.put(ChildrenInfo.TAG_CHILDREN_INFO, new OooOOOO.OooO00o(ChildrenInfo.TAG_CHILDREN_INFO, "TEXT", true, 0, null, 1));
        map6.put("creation_time", new OooOOOO.OooO00o("creation_time", "INTEGER", true, 0, null, 1));
        OooOOOO oooOOOO6 = new OooOOOO("OutlineEntity", map6, C22215OooOoo0.OooO0O0(map6, "last_modification_time", new OooOOOO.OooO00o("last_modification_time", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o6 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "OutlineEntity");
        if (!oooOOOO6.equals(oooOOOOOooO00o6)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("OutlineEntity(com.orion.notein.data.db.entity.OutlineEntity).\n Expected:\n", oooOOOO6, "\n Found:\n", oooOOOOOooO00o6));
        }
        HashMap map7 = new HashMap(8);
        map7.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map7.put(NoteMeta.PROPERTY_TITLE, new OooOOOO.OooO00o(NoteMeta.PROPERTY_TITLE, "TEXT", true, 0, null, 1));
        map7.put("page_id", new OooOOOO.OooO00o("page_id", "TEXT", true, 0, null, 1));
        map7.put("note_id", new OooOOOO.OooO00o("note_id", "TEXT", true, 0, null, 1));
        map7.put("quote_id", new OooOOOO.OooO00o("quote_id", "TEXT", false, 0, null, 1));
        map7.put("creation_time", new OooOOOO.OooO00o("creation_time", "INTEGER", true, 0, null, 1));
        map7.put("last_modification_time", new OooOOOO.OooO00o("last_modification_time", "INTEGER", true, 0, null, 1));
        OooOOOO oooOOOO7 = new OooOOOO("CommentEntity", map7, C22215OooOoo0.OooO0O0(map7, "sort_key", new OooOOOO.OooO00o("sort_key", "INTEGER", false, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o7 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "CommentEntity");
        if (!oooOOOO7.equals(oooOOOOOooO00o7)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("CommentEntity(com.orion.notein.data.db.entity.CommentEntity).\n Expected:\n", oooOOOO7, "\n Found:\n", oooOOOOOooO00o7));
        }
        HashMap map8 = new HashMap(16);
        map8.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map8.put("page_id", new OooOOOO.OooO00o("page_id", "TEXT", true, 0, null, 1));
        map8.put(C18437z2.f56754h, new OooOOOO.OooO00o(C18437z2.f56754h, "INTEGER", true, 0, null, 1));
        map8.put("color", new OooOOOO.OooO00o("color", "INTEGER", true, 0, null, 1));
        map8.put("bg_color", new OooOOOO.OooO00o("bg_color", "INTEGER", true, 0, null, 1));
        map8.put("underline_color", new OooOOOO.OooO00o("underline_color", "INTEGER", true, 0, null, 1));
        map8.put("label_rect", new OooOOOO.OooO00o("label_rect", "TEXT", true, 0, null, 1));
        map8.put("rect_list", new OooOOOO.OooO00o("rect_list", "TEXT", true, 0, null, 1));
        map8.put("text", new OooOOOO.OooO00o("text", "TEXT", true, 0, null, 1));
        map8.put("anno_item_id_list", new OooOOOO.OooO00o("anno_item_id_list", "TEXT", false, 0, null, 1));
        map8.put("link_type", new OooOOOO.OooO00o("link_type", "INTEGER", true, 0, null, 1));
        map8.put("link_id", new OooOOOO.OooO00o("link_id", "TEXT", true, 0, null, 1));
        map8.put("layer_id", new OooOOOO.OooO00o("layer_id", "TEXT", true, 0, null, 1));
        map8.put("creation_time", new OooOOOO.OooO00o("creation_time", "INTEGER", true, 0, null, 1));
        map8.put("is_vertical_pdf_text", new OooOOOO.OooO00o("is_vertical_pdf_text", "INTEGER", true, 0, null, 1));
        OooOOOO oooOOOO8 = new OooOOOO("QuoteEntity", map8, C22215OooOoo0.OooO0O0(map8, "is_rtl_or_btt_pdf_text", new OooOOOO.OooO00o("is_rtl_or_btt_pdf_text", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o8 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "QuoteEntity");
        if (!oooOOOO8.equals(oooOOOOOooO00o8)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("QuoteEntity(com.orion.notein.data.db.entity.QuoteEntity).\n Expected:\n", oooOOOO8, "\n Found:\n", oooOOOOOooO00o8));
        }
        HashMap map9 = new HashMap(18);
        map9.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map9.put("page_id", new OooOOOO.OooO00o("page_id", "TEXT", true, 0, null, 1));
        map9.put("text", new OooOOOO.OooO00o("text", "TEXT", true, 0, null, 1));
        map9.put("text_size", new OooOOOO.OooO00o("text_size", "REAL", true, 0, null, 1));
        map9.put("box_width", new OooOOOO.OooO00o("box_width", "REAL", true, 0, null, 1));
        map9.put("box_height", new OooOOOO.OooO00o("box_height", "REAL", true, 0, null, 1));
        map9.put("line_height", new OooOOOO.OooO00o("line_height", "REAL", true, 0, null, 1));
        map9.put("background_color", new OooOOOO.OooO00o("background_color", "INTEGER", true, 0, null, 1));
        map9.put("bounds", new OooOOOO.OooO00o("bounds", "TEXT", false, 0, null, 1));
        map9.put("layer", new OooOOOO.OooO00o("layer", "INTEGER", true, 0, null, 1));
        map9.put("layer_id", new OooOOOO.OooO00o("layer_id", "TEXT", true, 0, null, 1));
        map9.put("default_text_color", new OooOOOO.OooO00o("default_text_color", "INTEGER", true, 0, null, 1));
        map9.put("creation_time", new OooOOOO.OooO00o("creation_time", "INTEGER", true, 0, null, 1));
        map9.put("local_transform_json", new OooOOOO.OooO00o("local_transform_json", "TEXT", false, 0, null, 1));
        map9.put("left", new OooOOOO.OooO00o("left", "REAL", false, 0, null, 1));
        map9.put("top", new OooOOOO.OooO00o("top", "REAL", false, 0, null, 1));
        map9.put("right", new OooOOOO.OooO00o("right", "REAL", false, 0, null, 1));
        OooOOOO oooOOOO9 = new OooOOOO("TextBoxEntity", map9, C22215OooOoo0.OooO0O0(map9, "bottom", new OooOOOO.OooO00o("bottom", "REAL", false, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o9 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "TextBoxEntity");
        if (!oooOOOO9.equals(oooOOOOOooO00o9)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("TextBoxEntity(com.orion.notein.data.db.entity.TextBoxEntity).\n Expected:\n", oooOOOO9, "\n Found:\n", oooOOOOOooO00o9));
        }
        HashMap map10 = new HashMap(16);
        map10.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map10.put("page_id", new OooOOOO.OooO00o("page_id", "TEXT", true, 0, null, 1));
        map10.put("color", new OooOOOO.OooO00o("color", "INTEGER", true, 0, null, 1));
        map10.put("width", new OooOOOO.OooO00o("width", "REAL", true, 0, null, 1));
        map10.put("points", new OooOOOO.OooO00o("points", "TEXT", true, 0, null, 1));
        map10.put(C18437z2.f56754h, new OooOOOO.OooO00o(C18437z2.f56754h, "INTEGER", true, 0, null, 1));
        map10.put("blend_mode", new OooOOOO.OooO00o("blend_mode", "INTEGER", true, 0, null, 1));
        map10.put("layer_id", new OooOOOO.OooO00o("layer_id", "TEXT", true, 0, null, 1));
        map10.put("tape_like", new OooOOOO.OooO00o("tape_like", "INTEGER", true, 0, null, 1));
        map10.put("style", new OooOOOO.OooO00o("style", "INTEGER", true, 0, null, 1));
        map10.put("opacity_of_fill_color", new OooOOOO.OooO00o("opacity_of_fill_color", "INTEGER", true, 0, null, 1));
        map10.put("creation_time", new OooOOOO.OooO00o("creation_time", "INTEGER", true, 0, null, 1));
        map10.put("left", new OooOOOO.OooO00o("left", "REAL", false, 0, null, 1));
        map10.put("top", new OooOOOO.OooO00o("top", "REAL", false, 0, null, 1));
        map10.put("right", new OooOOOO.OooO00o("right", "REAL", false, 0, null, 1));
        OooOOOO oooOOOO10 = new OooOOOO("ShapeEntity", map10, C22215OooOoo0.OooO0O0(map10, "bottom", new OooOOOO.OooO00o("bottom", "REAL", false, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o10 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "ShapeEntity");
        if (!oooOOOO10.equals(oooOOOOOooO00o10)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("ShapeEntity(com.orion.notein.data.db.entity.ShapeEntity).\n Expected:\n", oooOOOO10, "\n Found:\n", oooOOOOOooO00o10));
        }
        HashMap map11 = new HashMap(13);
        map11.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map11.put("note_id", new OooOOOO.OooO00o("note_id", "TEXT", true, 0, null, 1));
        map11.put("page_id", new OooOOOO.OooO00o("page_id", "TEXT", true, 0, null, 1));
        map11.put("bounds", new OooOOOO.OooO00o("bounds", "TEXT", true, 0, null, 1));
        map11.put(FirebaseAnalytics.Param.ITEM_ID, new OooOOOO.OooO00o(FirebaseAnalytics.Param.ITEM_ID, "TEXT", false, 0, null, 1));
        map11.put("source_id", new OooOOOO.OooO00o("source_id", "TEXT", false, 0, null, 1));
        map11.put("source_note_id", new OooOOOO.OooO00o("source_note_id", "TEXT", false, 0, null, 1));
        map11.put("creation_time", new OooOOOO.OooO00o("creation_time", "INTEGER", true, 0, null, 1));
        map11.put("last_modification_time", new OooOOOO.OooO00o("last_modification_time", "INTEGER", true, 0, null, 1));
        map11.put("left", new OooOOOO.OooO00o("left", "REAL", false, 0, null, 1));
        map11.put("top", new OooOOOO.OooO00o("top", "REAL", false, 0, null, 1));
        map11.put("right", new OooOOOO.OooO00o("right", "REAL", false, 0, null, 1));
        OooOOOO oooOOOO11 = new OooOOOO("DualLinkRefEntity", map11, C22215OooOoo0.OooO0O0(map11, "bottom", new OooOOOO.OooO00o("bottom", "REAL", false, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o11 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "DualLinkRefEntity");
        if (!oooOOOO11.equals(oooOOOOOooO00o11)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("DualLinkRefEntity(com.orion.notein.data.db.entity.DualLinkRefEntity).\n Expected:\n", oooOOOO11, "\n Found:\n", oooOOOOOooO00o11));
        }
        HashMap map12 = new HashMap(14);
        map12.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map12.put("note_id", new OooOOOO.OooO00o("note_id", "TEXT", true, 0, null, 1));
        map12.put("page_id", new OooOOOO.OooO00o("page_id", "TEXT", true, 0, null, 1));
        map12.put(C18437z2.f56754h, new OooOOOO.OooO00o(C18437z2.f56754h, "INTEGER", true, 0, null, 1));
        map12.put("bounds", new OooOOOO.OooO00o("bounds", "TEXT", true, 0, null, 1));
        map12.put("text_bounds", new OooOOOO.OooO00o("text_bounds", "TEXT", true, 0, null, 1));
        map12.put("ref_id", new OooOOOO.OooO00o("ref_id", "TEXT", false, 0, null, 1));
        map12.put("ref_note_id", new OooOOOO.OooO00o("ref_note_id", "TEXT", false, 0, null, 1));
        map12.put("creation_time", new OooOOOO.OooO00o("creation_time", "INTEGER", true, 0, null, 1));
        map12.put("last_modification_time", new OooOOOO.OooO00o("last_modification_time", "INTEGER", true, 0, null, 1));
        map12.put("left", new OooOOOO.OooO00o("left", "REAL", false, 0, null, 1));
        map12.put("top", new OooOOOO.OooO00o("top", "REAL", false, 0, null, 1));
        map12.put("right", new OooOOOO.OooO00o("right", "REAL", false, 0, null, 1));
        OooOOOO oooOOOO12 = new OooOOOO("DualLinkSourceEntity", map12, C22215OooOoo0.OooO0O0(map12, "bottom", new OooOOOO.OooO00o("bottom", "REAL", false, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o12 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "DualLinkSourceEntity");
        if (!oooOOOO12.equals(oooOOOOOooO00o12)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("DualLinkSourceEntity(com.orion.notein.data.db.entity.DualLinkSourceEntity).\n Expected:\n", oooOOOO12, "\n Found:\n", oooOOOOOooO00o12));
        }
        HashMap map13 = new HashMap(5);
        map13.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map13.put("note_id", new OooOOOO.OooO00o("note_id", "TEXT", true, 0, null, 1));
        map13.put("visible", new OooOOOO.OooO00o("visible", "INTEGER", true, 0, null, 1));
        map13.put("extras", new OooOOOO.OooO00o("extras", "TEXT", false, 0, null, 1));
        OooOOOO oooOOOO13 = new OooOOOO("PageLayerEntity", map13, C22215OooOoo0.OooO0O0(map13, "name", new OooOOOO.OooO00o("name", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o13 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "PageLayerEntity");
        if (!oooOOOO13.equals(oooOOOOOooO00o13)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("PageLayerEntity(com.orion.notein.data.db.entity.PageLayerEntity).\n Expected:\n", oooOOOO13, "\n Found:\n", oooOOOOOooO00o13));
        }
        HashMap map14 = new HashMap(12);
        map14.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map14.put("bounds", new OooOOOO.OooO00o("bounds", "TEXT", false, 0, null, 1));
        map14.put("page_id", new OooOOOO.OooO00o("page_id", "TEXT", true, 0, null, 1));
        map14.put(C18437z2.f56754h, new OooOOOO.OooO00o(C18437z2.f56754h, "INTEGER", true, 0, null, 1));
        map14.put(FirebaseAnalytics.Param.DESTINATION, new OooOOOO.OooO00o(FirebaseAnalytics.Param.DESTINATION, "TEXT", true, 0, null, 1));
        map14.put("extras", new OooOOOO.OooO00o("extras", "TEXT", false, 0, null, 1));
        map14.put("creation_time", new OooOOOO.OooO00o("creation_time", "INTEGER", true, 0, null, 1));
        map14.put("last_modification_time", new OooOOOO.OooO00o("last_modification_time", "INTEGER", true, 0, null, 1));
        map14.put("left", new OooOOOO.OooO00o("left", "REAL", false, 0, null, 1));
        map14.put("top", new OooOOOO.OooO00o("top", "REAL", false, 0, null, 1));
        map14.put("right", new OooOOOO.OooO00o("right", "REAL", false, 0, null, 1));
        OooOOOO oooOOOO14 = new OooOOOO("HyperLinkEntity", map14, C22215OooOoo0.OooO0O0(map14, "bottom", new OooOOOO.OooO00o("bottom", "REAL", false, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o14 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "HyperLinkEntity");
        if (!oooOOOO14.equals(oooOOOOOooO00o14)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("HyperLinkEntity(com.orion.notein.data.db.entity.HyperLinkEntity).\n Expected:\n", oooOOOO14, "\n Found:\n", oooOOOOOooO00o14));
        }
        HashMap map15 = new HashMap(6);
        map15.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map15.put("username", new OooOOOO.OooO00o("username", "TEXT", true, 0, null, 1));
        map15.put(C18437z2.f56754h, new OooOOOO.OooO00o(C18437z2.f56754h, "INTEGER", true, 0, null, 1));
        map15.put("text", new OooOOOO.OooO00o("text", "TEXT", true, 0, null, 1));
        map15.put("creation_time", new OooOOOO.OooO00o("creation_time", "INTEGER", true, 0, null, 1));
        OooOOOO oooOOOO15 = new OooOOOO("QuoteTextAnnoEntity", map15, C22215OooOoo0.OooO0O0(map15, "last_modified_time", new OooOOOO.OooO00o("last_modified_time", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o15 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "QuoteTextAnnoEntity");
        if (!oooOOOO15.equals(oooOOOOOooO00o15)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("QuoteTextAnnoEntity(com.orion.notein.data.db.entity.QuoteTextAnnoEntity).\n Expected:\n", oooOOOO15, "\n Found:\n", oooOOOOOooO00o15));
        }
        HashMap map16 = new HashMap(7);
        map16.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map16.put("file_path", new OooOOOO.OooO00o("file_path", "TEXT", true, 0, null, 1));
        map16.put("audio_name", new OooOOOO.OooO00o("audio_name", "TEXT", true, 0, null, 1));
        map16.put("duration", new OooOOOO.OooO00o("duration", "INTEGER", true, 0, null, 1));
        map16.put("play_speed", new OooOOOO.OooO00o("play_speed", "REAL", true, 0, null, 1));
        map16.put("creation_time", new OooOOOO.OooO00o("creation_time", "INTEGER", true, 0, null, 1));
        OooOOOO oooOOOO16 = new OooOOOO("AudioFileEntity", map16, C22215OooOoo0.OooO0O0(map16, "last_modification_time", new OooOOOO.OooO00o("last_modification_time", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o16 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "AudioFileEntity");
        if (!oooOOOO16.equals(oooOOOOOooO00o16)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("AudioFileEntity(com.orion.notein.data.db.entity.AudioFileEntity).\n Expected:\n", oooOOOO16, "\n Found:\n", oooOOOOOooO00o16));
        }
        HashMap map17 = new HashMap(8);
        map17.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map17.put("audio_id", new OooOOOO.OooO00o("audio_id", "TEXT", true, 0, null, 1));
        map17.put("audio_position", new OooOOOO.OooO00o("audio_position", "INTEGER", true, 0, null, 1));
        map17.put("display_item_id", new OooOOOO.OooO00o("display_item_id", "TEXT", true, 0, null, 1));
        map17.put("display_item_type", new OooOOOO.OooO00o("display_item_type", "INTEGER", true, 0, null, 1));
        map17.put("creation_time", new OooOOOO.OooO00o("creation_time", "INTEGER", true, 0, null, 1));
        map17.put("last_modification_time", new OooOOOO.OooO00o("last_modification_time", "INTEGER", true, 0, null, 1));
        OooOOOO oooOOOO17 = new OooOOOO("AudioSyncRecordEntity", map17, C22215OooOoo0.OooO0O0(map17, "deleted", new OooOOOO.OooO00o("deleted", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o17 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "AudioSyncRecordEntity");
        if (!oooOOOO17.equals(oooOOOOOooO00o17)) {
            return new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("AudioSyncRecordEntity(com.orion.notein.data.db.entity.AudioSyncRecordEntity).\n Expected:\n", oooOOOO17, "\n Found:\n", oooOOOOOooO00o17));
        }
        HashMap map18 = new HashMap(3);
        map18.put("id", new OooOOOO.OooO00o("id", "TEXT", true, 1, null, 1));
        map18.put("note_id", new OooOOOO.OooO00o("note_id", "TEXT", true, 0, null, 1));
        OooOOOO oooOOOO18 = new OooOOOO("NoteAudioFileIdsFieldEntity", map18, C22215OooOoo0.OooO0O0(map18, "audio_file_ids", new OooOOOO.OooO00o("audio_file_ids", "TEXT", true, 0, null, 1), 0), new HashSet(0));
        OooOOOO oooOOOOOooO00o18 = OooOOOO.OooO00o(interfaceC24747OooO0O0, "NoteAudioFileIdsFieldEntity");
        return !oooOOOO18.equals(oooOOOOOooO00o18) ? new AbstractC24678OooOoO0.OooO00o(false, C22213OooOoOO.OooO0OO("NoteAudioFileIdsFieldEntity(com.orion.notein.data.db.entity.NoteAudioFileIdsFieldEntity).\n Expected:\n", oooOOOO18, "\n Found:\n", oooOOOOOooO00o18)) : new AbstractC24678OooOoO0.OooO00o(true, null);
    }
}
