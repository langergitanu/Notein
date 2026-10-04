package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.LabelEntity;
import com.orion.notein.domain.models.Label;

/* JADX INFO: loaded from: classes9.dex */
public interface LabelMapper {
    LabelEntity toEntity(Label label);

    Label toModel(LabelEntity labelEntity);
}
