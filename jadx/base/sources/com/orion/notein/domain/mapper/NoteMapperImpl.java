package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.NoteEntity;
import com.orion.notein.domain.models.note.Note;
import com.orion.notein.domain.models.note.PdfInfo;
import com.orion.notein.domain.models.page.Page;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class NoteMapperImpl extends NoteMapper {
    private String noteDefaultPageId(Note note) {
        Page defaultPage;
        String id;
        if (note == null || (defaultPage = note.getDefaultPage()) == null || (id = defaultPage.getId()) == null) {
            return null;
        }
        return id;
    }

    private String notePdfInfoId(Note note) {
        PdfInfo pdfInfo;
        String id;
        if (note == null || (pdfInfo = note.getPdfInfo()) == null || (id = pdfInfo.getId()) == null) {
            return null;
        }
        return id;
    }

    @Override // com.orion.notein.domain.mapper.NoteMapper
    public NoteEntity toEntity(Note note) {
        if (note == null) {
            return null;
        }
        String strNoteDefaultPageId = noteDefaultPageId(note);
        String strNotePdfInfoId = notePdfInfoId(note);
        String parentId = note.getParentId();
        String recoverParentId = note.getRecoverParentId();
        boolean favorite = note.getFavorite();
        boolean inTrashBin = note.getInTrashBin();
        List<String> outlines = note.getOutlines();
        NoteEntity noteEntity = new NoteEntity(note.getId(), note.getUserId(), note.getTitle(), parentId, recoverParentId, null, null, outlines != null ? new ArrayList(outlines) : null, favorite, strNoteDefaultPageId, note.getTnPath(), strNotePdfInfoId, inTrashBin, note.getSavedPageIndex(), note.getActivatedPageLayerId(), note.getZoom(), note.getUnboundedNote(), note.getCreationTime(), note.getLastModificationTime(), note.getSortKey());
        fillEntity(note, noteEntity);
        return noteEntity;
    }

    @Override // com.orion.notein.domain.mapper.NoteMapper
    public Note toNote(NoteEntity noteEntity) {
        if (noteEntity == null) {
            return null;
        }
        Note note = new Note();
        note.setId(noteEntity.getId());
        note.setUserId(noteEntity.getUserId());
        note.setParentId(noteEntity.getParentId());
        note.setRecoverParentId(noteEntity.getRecoverParentId());
        note.setTitle(noteEntity.getTitle());
        note.setFavorite(noteEntity.getFavorite());
        List<String> outlines = noteEntity.getOutlines();
        if (outlines != null) {
            note.setOutlines(new ArrayList(outlines));
        }
        note.setCreationTime(noteEntity.getCreationTime());
        note.setLastModificationTime(noteEntity.getLastModificationTime());
        note.setTnPath(noteEntity.getTnPath());
        note.setInTrashBin(noteEntity.getInTrashBin());
        note.setSavedPageIndex(noteEntity.getSavedPageIndex());
        note.setZoom(noteEntity.getZoom());
        note.setSortKey(noteEntity.getSortKey());
        note.setUnboundedNote(noteEntity.getUnboundedNote());
        fillModel(noteEntity, note);
        return note;
    }
}
