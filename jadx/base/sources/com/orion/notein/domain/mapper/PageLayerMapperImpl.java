package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.PageLayerEntity;
import com.orion.notein.domain.models.page.PageLayer;

/* JADX INFO: loaded from: classes9.dex */
public class PageLayerMapperImpl extends PageLayerMapper {
    @Override // com.orion.notein.domain.mapper.PageLayerMapper
    public PageLayerEntity toEntity(PageLayer pageLayer) {
        if (pageLayer == null) {
            return null;
        }
        return new PageLayerEntity(pageLayer.getId(), pageLayer.getNoteId(), pageLayer.getVisible(), pageLayer.getExtras(), pageLayer.getName());
    }

    @Override // com.orion.notein.domain.mapper.PageLayerMapper
    public PageLayer toPageLayer(PageLayerEntity pageLayerEntity) {
        if (pageLayerEntity == null) {
            return null;
        }
        return new PageLayer(pageLayerEntity.getId(), pageLayerEntity.getNoteId(), pageLayerEntity.getVisible(), pageLayerEntity.getExtras(), pageLayerEntity.getName());
    }
}
