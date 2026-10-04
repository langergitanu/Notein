package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.CouponEntity;
import com.orion.notein.domain.models.transactions.Coupon;

/* JADX INFO: loaded from: classes9.dex */
public class CouponMapperImpl extends CouponMapper {
    @Override // com.orion.notein.domain.mapper.CouponMapper
    public Coupon toCoupon(CouponEntity couponEntity) {
        if (couponEntity == null) {
            return null;
        }
        return new Coupon(couponEntity.getId(), couponEntity.getUid(), couponEntity.getProductCode(), couponEntity.getType(), couponEntity.getValue(), couponEntity.getStatus(), couponEntity.getEffectAt(), couponEntity.getExpireAt());
    }

    @Override // com.orion.notein.domain.mapper.CouponMapper
    public CouponEntity toEntity(Coupon coupon) {
        if (coupon == null) {
            return null;
        }
        return new CouponEntity(coupon.getId(), coupon.getUid(), coupon.getProductCode(), coupon.getType(), coupon.getValue(), coupon.getStatus(), coupon.getEffectAt(), coupon.getExpireAt());
    }
}
