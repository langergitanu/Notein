package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.NotePlaceholderEntity;
import com.orion.notein.domain.models.note.NotePlaceHolder;

/* JADX INFO: loaded from: classes9.dex */
public abstract class NotePlaceholderMapper {
    public abstract NotePlaceholderEntity toEntity(NotePlaceHolder notePlaceHolder);

    public abstract NotePlaceHolder toNotePlaceholder(NotePlaceholderEntity notePlaceholderEntity);
}
