package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.NoteinMessageEntity;
import com.orion.notein.domain.models.message.NoteinMessage;

/* JADX INFO: loaded from: classes9.dex */
public abstract class NoteinMessageMapper {
    public abstract NoteinMessageEntity toEntity(NoteinMessage noteinMessage);

    public abstract NoteinMessage toNoteinMessage(NoteinMessageEntity noteinMessageEntity);
}
