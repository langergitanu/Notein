package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.NoteMetaEntity;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.note.PdfInfo;

/* JADX INFO: loaded from: classes9.dex */
public abstract class NoteMetaMapper {
    public void fillModel(NoteMetaEntity noteMetaEntity, NoteMeta noteMeta) {
        String pdfInfoId = noteMetaEntity.getPdfInfoId();
        if (pdfInfoId != null) {
            PdfInfo pdfInfo = new PdfInfo();
            pdfInfo.setId(pdfInfoId);
            noteMeta.setPdfInfo(pdfInfo);
        }
    }

    public abstract NoteMetaEntity toEntity(NoteMeta noteMeta);

    public abstract NoteMeta toModel(NoteMetaEntity noteMetaEntity);
}
