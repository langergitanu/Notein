package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.cache.PdfTextCacheEntity;
import com.orion.notein.data.p602db.entity.cache.PdfTextCacheEntityWithoutElementsJson;
import com.orion.notein.domain.models.cache.PdfTextCache;
import com.orion.notein.domain.models.cache.PdfTextCacheWithoutElements;

/* JADX INFO: loaded from: classes9.dex */
public class PdfTextCacheMapperImpl extends PdfTextCacheMapper {
    @Override // com.orion.notein.domain.mapper.PdfTextCacheMapper
    public PdfTextCacheEntity toEntity(PdfTextCache pdfTextCache) {
        if (pdfTextCache == null) {
            return null;
        }
        PdfTextCacheEntity pdfTextCacheEntity = new PdfTextCacheEntity();
        pdfTextCacheEntity.setPdfFilePath(pdfTextCache.getPdfFilePath());
        pdfTextCacheEntity.setPdfFileMd5(pdfTextCache.getPdfFileMd5());
        pdfTextCacheEntity.setPdfPageIndex(pdfTextCache.getPdfPageIndex());
        pdfTextCacheEntity.setCreationTime(pdfTextCache.getCreationTime());
        pdfTextCacheEntity.setText(pdfTextCache.getText());
        fillEntity(pdfTextCache, pdfTextCacheEntity);
        return pdfTextCacheEntity;
    }

    @Override // com.orion.notein.domain.mapper.PdfTextCacheMapper
    public PdfTextCache toModel(PdfTextCacheEntity pdfTextCacheEntity) {
        if (pdfTextCacheEntity == null) {
            return null;
        }
        PdfTextCache pdfTextCache = new PdfTextCache();
        pdfTextCache.setPdfFileMd5(pdfTextCacheEntity.getPdfFileMd5());
        pdfTextCache.setPdfPageIndex(pdfTextCacheEntity.getPdfPageIndex());
        pdfTextCache.setPdfFilePath(pdfTextCacheEntity.getPdfFilePath());
        pdfTextCache.setCreationTime(pdfTextCacheEntity.getCreationTime());
        pdfTextCache.setText(pdfTextCacheEntity.getText());
        fillModel(pdfTextCacheEntity, pdfTextCache);
        return pdfTextCache;
    }

    @Override // com.orion.notein.domain.mapper.PdfTextCacheMapper
    public PdfTextCacheEntityWithoutElementsJson toEntity(PdfTextCacheWithoutElements pdfTextCacheWithoutElements) {
        if (pdfTextCacheWithoutElements == null) {
            return null;
        }
        PdfTextCacheEntityWithoutElementsJson pdfTextCacheEntityWithoutElementsJson = new PdfTextCacheEntityWithoutElementsJson();
        pdfTextCacheEntityWithoutElementsJson.setPdfFileMd5(pdfTextCacheWithoutElements.getPdfFileMd5());
        pdfTextCacheEntityWithoutElementsJson.setPdfPageIndex(pdfTextCacheWithoutElements.getPdfPageIndex());
        pdfTextCacheEntityWithoutElementsJson.setPdfFilePath(pdfTextCacheWithoutElements.getPdfFilePath());
        pdfTextCacheEntityWithoutElementsJson.setCreationTime(pdfTextCacheWithoutElements.getCreationTime());
        pdfTextCacheEntityWithoutElementsJson.setText(pdfTextCacheWithoutElements.getText());
        return pdfTextCacheEntityWithoutElementsJson;
    }

    @Override // com.orion.notein.domain.mapper.PdfTextCacheMapper
    public PdfTextCacheWithoutElements toModel(PdfTextCacheEntityWithoutElementsJson pdfTextCacheEntityWithoutElementsJson) {
        if (pdfTextCacheEntityWithoutElementsJson == null) {
            return null;
        }
        PdfTextCacheWithoutElements pdfTextCacheWithoutElements = new PdfTextCacheWithoutElements();
        pdfTextCacheWithoutElements.setPdfFileMd5(pdfTextCacheEntityWithoutElementsJson.getPdfFileMd5());
        pdfTextCacheWithoutElements.setPdfPageIndex(pdfTextCacheEntityWithoutElementsJson.getPdfPageIndex());
        pdfTextCacheWithoutElements.setPdfFilePath(pdfTextCacheEntityWithoutElementsJson.getPdfFilePath());
        pdfTextCacheWithoutElements.setCreationTime(pdfTextCacheEntityWithoutElementsJson.getCreationTime());
        pdfTextCacheWithoutElements.setText(pdfTextCacheEntityWithoutElementsJson.getText());
        return pdfTextCacheWithoutElements;
    }
}
