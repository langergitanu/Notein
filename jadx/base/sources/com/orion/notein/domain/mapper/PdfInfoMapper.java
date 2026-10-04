package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.PdfInfoEntity;
import com.orion.notein.domain.models.note.PdfInfo;

/* JADX INFO: loaded from: classes9.dex */
public interface PdfInfoMapper {
    PdfInfoEntity toEntity(PdfInfo pdfInfo);

    PdfInfo toPdfInfo(PdfInfoEntity pdfInfoEntity);
}
