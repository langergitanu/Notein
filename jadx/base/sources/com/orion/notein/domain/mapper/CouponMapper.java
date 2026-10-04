package com.orion.notein.domain.mapper;

import com.orion.notein.data.p602db.entity.CouponEntity;
import com.orion.notein.domain.models.transactions.Coupon;

/* JADX INFO: loaded from: classes9.dex */
public abstract class CouponMapper {
    public abstract Coupon toCoupon(CouponEntity couponEntity);

    public abstract CouponEntity toEntity(Coupon coupon);
}
