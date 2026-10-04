package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.NoteinFirebaseUserEntity;
import com.orion.notein.domain.models.NoteinFirebaseUser;

/* JADX INFO: loaded from: classes9.dex */
public interface NoteinFirebaseUserMapper {
    NoteinFirebaseUserEntity toEntity(NoteinFirebaseUser noteinFirebaseUser);

    NoteinFirebaseUser toModel(NoteinFirebaseUserEntity noteinFirebaseUserEntity);
}
