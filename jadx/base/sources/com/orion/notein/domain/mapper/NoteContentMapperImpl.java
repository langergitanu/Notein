package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.NoteContentEntity;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.PdfInfo;
import com.orion.notein.domain.models.page.Page;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class NoteContentMapperImpl extends NoteContentMapper {
    private String contentDefaultPageId(NoteContent noteContent) {
        Page defaultPage;
        String id;
        if (noteContent == null || (defaultPage = noteContent.getDefaultPage()) == null || (id = defaultPage.getId()) == null) {
            return null;
        }
        return id;
    }

    private String contentPdfInfoId(NoteContent noteContent) {
        PdfInfo pdfInfo;
        String id;
        if (noteContent == null || (pdfInfo = noteContent.getPdfInfo()) == null || (id = pdfInfo.getId()) == null) {
            return null;
        }
        return id;
    }

    @Override // com.orion.notein.domain.mapper.NoteContentMapper
    public NoteContentEntity toEntity(NoteContent noteContent) {
        if (noteContent == null) {
            return null;
        }
        NoteContentEntity noteContentEntity = new NoteContentEntity();
        noteContentEntity.setDefaultPageId(contentDefaultPageId(noteContent));
        noteContentEntity.setPdfInfoId(contentPdfInfoId(noteContent));
        noteContentEntity.setId(noteContent.getId());
        List<String> outlines = noteContent.getOutlines();
        if (outlines != null) {
            noteContentEntity.setOutlines(new ArrayList(outlines));
        }
        noteContentEntity.setSavedPageIndex(noteContent.getSavedPageIndex());
        noteContentEntity.setActivatedPageLayerId(noteContent.getActivatedPageLayerId());
        noteContentEntity.setZoom(noteContent.getZoom());
        noteContentEntity.setUnboundedPageOffsetX(noteContent.getUnboundedPageOffsetX());
        noteContentEntity.setUnboundedPageOffsetY(noteContent.getUnboundedPageOffsetY());
        noteContentEntity.setUnboundedNote(noteContent.getUnboundedNote());
        noteContentEntity.setCreationTime(noteContent.getCreationTime());
        noteContentEntity.setLastModificationTime(noteContent.getLastModificationTime());
        fillEntity(noteContent, noteContentEntity);
        return noteContentEntity;
    }

    @Override // com.orion.notein.domain.mapper.NoteContentMapper
    public NoteContent toModel(NoteContentEntity noteContentEntity) {
        if (noteContentEntity == null) {
            return null;
        }
        NoteContent noteContent = new NoteContent();
        noteContent.setId(noteContentEntity.getId());
        List<String> outlines = noteContentEntity.getOutlines();
        if (outlines != null) {
            noteContent.setOutlines(new ArrayList(outlines));
        }
        noteContent.setSavedPageIndex(noteContentEntity.getSavedPageIndex());
        noteContent.setZoom(noteContentEntity.getZoom());
        noteContent.setUnboundedNote(noteContentEntity.getUnboundedNote());
        noteContent.setCreationTime(noteContentEntity.getCreationTime());
        noteContent.setLastModificationTime(noteContentEntity.getLastModificationTime());
        fillModel(noteContentEntity, noteContent);
        return noteContent;
    }
}
