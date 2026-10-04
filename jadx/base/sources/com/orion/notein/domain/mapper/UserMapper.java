package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.UserEntity;
import com.orion.notein.domain.models.User;

/* JADX INFO: loaded from: classes9.dex */
public interface UserMapper {
    UserEntity toEntity(User user);

    User toUser(UserEntity userEntity);
}
