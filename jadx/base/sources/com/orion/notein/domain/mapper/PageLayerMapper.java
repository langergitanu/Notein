package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.PageLayerEntity;
import com.orion.notein.domain.models.page.PageLayer;

/* JADX INFO: loaded from: classes9.dex */
public abstract class PageLayerMapper {
    public abstract PageLayerEntity toEntity(PageLayer pageLayer);

    public abstract PageLayer toPageLayer(PageLayerEntity pageLayerEntity);
}
