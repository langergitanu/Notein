package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.ColorSetEntity;
import com.orion.notein.domain.models.note.ColorSet;

/* JADX INFO: loaded from: classes9.dex */
public interface ColorSetMapper {
    ColorSetEntity toEntity(ColorSet colorSet);

    ColorSet toModel(ColorSetEntity colorSetEntity);
}
