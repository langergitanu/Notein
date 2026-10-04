package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.NoteinFirebaseUserEntity;
import com.orion.notein.domain.models.NoteinFirebaseUser;

/* JADX INFO: loaded from: classes9.dex */
public class NoteinFirebaseUserMapperImpl implements NoteinFirebaseUserMapper {
    @Override // com.orion.notein.domain.mapper.NoteinFirebaseUserMapper
    public NoteinFirebaseUserEntity toEntity(NoteinFirebaseUser noteinFirebaseUser) {
        if (noteinFirebaseUser == null) {
            return null;
        }
        return new NoteinFirebaseUserEntity(noteinFirebaseUser.getId(), noteinFirebaseUser.getFirebaseUid(), noteinFirebaseUser.getConcatEmail(), noteinFirebaseUser.getCreationTime());
    }

    @Override // com.orion.notein.domain.mapper.NoteinFirebaseUserMapper
    public NoteinFirebaseUser toModel(NoteinFirebaseUserEntity noteinFirebaseUserEntity) {
        if (noteinFirebaseUserEntity == null) {
            return null;
        }
        return new NoteinFirebaseUser(noteinFirebaseUserEntity.getId(), noteinFirebaseUserEntity.getFirebaseUid(), noteinFirebaseUserEntity.getConcatEmail(), noteinFirebaseUserEntity.getCreationTime());
    }
}
