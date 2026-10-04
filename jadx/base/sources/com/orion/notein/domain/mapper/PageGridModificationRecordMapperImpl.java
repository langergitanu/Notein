package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.cache.PageGridModificationRecordEntity;
import com.orion.notein.domain.models.cache.PageGridModificationRecord;

/* JADX INFO: loaded from: classes9.dex */
public class PageGridModificationRecordMapperImpl extends PageGridModificationRecordMapper {
    @Override // com.orion.notein.domain.mapper.PageGridModificationRecordMapper
    public PageGridModificationRecordEntity toEntity(PageGridModificationRecord pageGridModificationRecord) {
        if (pageGridModificationRecord == null) {
            return null;
        }
        return new PageGridModificationRecordEntity(pageGridModificationRecord.getPageId(), pageGridModificationRecord.getPageGridX(), pageGridModificationRecord.getPageGridY(), pageGridModificationRecord.getLastModificationTime());
    }

    @Override // com.orion.notein.domain.mapper.PageGridModificationRecordMapper
    public PageGridModificationRecord toModel(PageGridModificationRecordEntity pageGridModificationRecordEntity) {
        if (pageGridModificationRecordEntity == null) {
            return null;
        }
        return new PageGridModificationRecord(pageGridModificationRecordEntity.getPageId(), pageGridModificationRecordEntity.getPageGridX(), pageGridModificationRecordEntity.getPageGridY(), pageGridModificationRecordEntity.getLastModificationTime());
    }
}
