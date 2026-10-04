package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.UserEntity;
import com.orion.notein.domain.models.User;

/* JADX INFO: loaded from: classes9.dex */
public class UserMapperImpl implements UserMapper {
    @Override // com.orion.notein.domain.mapper.UserMapper
    public UserEntity toEntity(User user) {
        if (user == null) {
            return null;
        }
        return new UserEntity(user.getId(), user.getNickname(), user.getRegion(), user.getMobile(), user.getGender(), user.getHwOpenID(), user.getWxOpenID(), user.getXiaomiUnionID(), user.getHonorOpenID(), user.getPassword(), user.getAvatar(), user.getCreationTime(), user.getMembership(), user.getOfferFreeTrial(), user.getOnFreeTrial(), user.getFreeTrialStartTime(), user.getFreeTrialEndTime(), user.getMembershipStartTime(), user.getMembershipEndTime());
    }

    @Override // com.orion.notein.domain.mapper.UserMapper
    public User toUser(UserEntity userEntity) {
        if (userEntity == null) {
            return null;
        }
        return new User(userEntity.getId(), userEntity.getMobile(), userEntity.getNickname(), userEntity.getGender(), userEntity.getHwOpenID(), userEntity.getWxOpenID(), userEntity.getXiaomiUnionID(), userEntity.getHonorOpenID(), userEntity.getPassword(), userEntity.getRegion(), userEntity.getAvatar(), userEntity.getCreationTime(), userEntity.getMembership(), userEntity.getOfferFreeTrial(), userEntity.getOnFreeTrial(), userEntity.getFreeTrialStartTime(), userEntity.getFreeTrialEndTime(), userEntity.getMembershipStartTime(), userEntity.getMembershipEndTime());
    }
}
