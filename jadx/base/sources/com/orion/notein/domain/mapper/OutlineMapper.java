package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.OutlineEntity;
import com.orion.notein.domain.models.note.Outline;

/* JADX INFO: loaded from: classes9.dex */
public interface OutlineMapper {
    OutlineEntity toEntity(Outline outline);

    Outline toModel(OutlineEntity outlineEntity);
}
