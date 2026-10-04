package com.huawei.hms.support.api.entity.hwid;

import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: loaded from: classes9.dex */
public class QueryShippingAddressResp extends IHwIDRespEntity {

    @Checked(permission = CommonConstant.PERMISSION.SHIPPING_ADDRESS, scope = CommonConstant.SCOPE.SCOPE_ACCOUNT_SHIPPING_ADDRESS, value = CommonConstant.RETKEY.SHIPPING_ADDRESS)
    private ShippingAddressParcelable shippingAddressParcelable;

    public ShippingAddressParcelable getShippingAddressParcelable() {
        return this.shippingAddressParcelable;
    }
}
