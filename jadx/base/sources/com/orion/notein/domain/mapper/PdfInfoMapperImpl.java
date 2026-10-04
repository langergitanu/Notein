package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.PdfInfoEntity;
import com.orion.notein.domain.models.note.PdfInfo;

/* JADX INFO: loaded from: classes9.dex */
public class PdfInfoMapperImpl implements PdfInfoMapper {
    @Override // com.orion.notein.domain.mapper.PdfInfoMapper
    public PdfInfoEntity toEntity(PdfInfo pdfInfo) {
        if (pdfInfo == null) {
            return null;
        }
        return new PdfInfoEntity(pdfInfo.getId(), pdfInfo.getPdfPath(), pdfInfo.getTnPath(), pdfInfo.getPassword());
    }

    @Override // com.orion.notein.domain.mapper.PdfInfoMapper
    public PdfInfo toPdfInfo(PdfInfoEntity pdfInfoEntity) {
        if (pdfInfoEntity == null) {
            return null;
        }
        PdfInfo pdfInfo = new PdfInfo();
        pdfInfo.setId(pdfInfoEntity.getId());
        pdfInfo.setPdfPath(pdfInfoEntity.getPdfPath());
        pdfInfo.setTnPath(pdfInfoEntity.getTnPath());
        pdfInfo.setPassword(pdfInfoEntity.getPassword());
        return pdfInfo;
    }
}
