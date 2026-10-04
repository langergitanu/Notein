package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.UserEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: loaded from: classes9.dex */
public final class o0O0O0o0 extends AbstractC20449OooO0Oo {
    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        UserEntity userEntity = (UserEntity) obj;
        if (userEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, userEntity.getId());
        }
        if (userEntity.getNickname() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, userEntity.getNickname());
        }
        if (userEntity.getRegion() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, userEntity.getRegion());
        }
        if (userEntity.getMobile() == null) {
            interfaceC24749OooO0Oo.OooO0oO(4);
        } else {
            interfaceC24749OooO0Oo.o000000O(4, userEntity.getMobile());
        }
        if (userEntity.getGender() == null) {
            interfaceC24749OooO0Oo.OooO0oO(5);
        } else {
            interfaceC24749OooO0Oo.o000000O(5, userEntity.getGender());
        }
        if (userEntity.getHwOpenID() == null) {
            interfaceC24749OooO0Oo.OooO0oO(6);
        } else {
            interfaceC24749OooO0Oo.o000000O(6, userEntity.getHwOpenID());
        }
        if (userEntity.getWxOpenID() == null) {
            interfaceC24749OooO0Oo.OooO0oO(7);
        } else {
            interfaceC24749OooO0Oo.o000000O(7, userEntity.getWxOpenID());
        }
        if (userEntity.getXiaomiUnionID() == null) {
            interfaceC24749OooO0Oo.OooO0oO(8);
        } else {
            interfaceC24749OooO0Oo.o000000O(8, userEntity.getXiaomiUnionID());
        }
        if (userEntity.getHonorOpenID() == null) {
            interfaceC24749OooO0Oo.OooO0oO(9);
        } else {
            interfaceC24749OooO0Oo.o000000O(9, userEntity.getHonorOpenID());
        }
        if (userEntity.getPassword() == null) {
            interfaceC24749OooO0Oo.OooO0oO(10);
        } else {
            interfaceC24749OooO0Oo.o000000O(10, userEntity.getPassword());
        }
        if (userEntity.getAvatar() == null) {
            interfaceC24749OooO0Oo.OooO0oO(11);
        } else {
            interfaceC24749OooO0Oo.o000000O(11, userEntity.getAvatar());
        }
        if (userEntity.getCreationTime() == null) {
            interfaceC24749OooO0Oo.OooO0oO(12);
        } else {
            interfaceC24749OooO0Oo.o000000O(12, userEntity.getCreationTime());
        }
        if (userEntity.getMembership() == null) {
            interfaceC24749OooO0Oo.OooO0oO(13);
        } else {
            interfaceC24749OooO0Oo.OooO0o(13, userEntity.getMembership().intValue());
        }
        if (userEntity.getOfferFreeTrial() == null) {
            interfaceC24749OooO0Oo.OooO0oO(14);
        } else {
            interfaceC24749OooO0Oo.OooO0o(14, userEntity.getOfferFreeTrial().intValue());
        }
        if (userEntity.getOnFreeTrial() == null) {
            interfaceC24749OooO0Oo.OooO0oO(15);
        } else {
            interfaceC24749OooO0Oo.OooO0o(15, userEntity.getOnFreeTrial().intValue());
        }
        if (userEntity.getFreeTrialStartTime() == null) {
            interfaceC24749OooO0Oo.OooO0oO(16);
        } else {
            interfaceC24749OooO0Oo.o000000O(16, userEntity.getFreeTrialStartTime());
        }
        if (userEntity.getFreeTrialEndTime() == null) {
            interfaceC24749OooO0Oo.OooO0oO(17);
        } else {
            interfaceC24749OooO0Oo.o000000O(17, userEntity.getFreeTrialEndTime());
        }
        if (userEntity.getMembershipStartTime() == null) {
            interfaceC24749OooO0Oo.OooO0oO(18);
        } else {
            interfaceC24749OooO0Oo.o000000O(18, userEntity.getMembershipStartTime());
        }
        if (userEntity.getMembershipEndTime() == null) {
            interfaceC24749OooO0Oo.OooO0oO(19);
        } else {
            interfaceC24749OooO0Oo.o000000O(19, userEntity.getMembershipEndTime());
        }
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `UserEntity` (`id`,`nickname`,`region`,`mobile`,`gender`,`hw_open_id`,`wx_open_id`,`xiaomi_union_id`,`honor_open_id`,`password`,`avatar`,`creation_time`,`membership`,`offer_free_trial`,`on_free_trial`,`free_trial_start_time`,`free_trial_end_time`,`membership_start_time`,`membership_end_time`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }
}
