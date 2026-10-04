package com.alipay.share.sdk.openapi;

import android.os.Bundle;
import com.alipay.share.sdk.Constant;

/* JADX INFO: loaded from: base.apk:libs/libapshare.jar:com/alipay/share/sdk/openapi/BaseReq.class */
public abstract class BaseReq {
    public String transaction;

    public abstract int getType();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean checkArgs();

    public void toBundle(Bundle bundle) {
        bundle.putInt(Constant.EXTRA_COMMAND_TYPE, getType());
        bundle.putString(Constant.EXTRA_BASEREQ_TRANSACTION, this.transaction);
    }

    public void fromBundle(Bundle bundle) {
        this.transaction = bundle.getString(Constant.EXTRA_BASEREQ_TRANSACTION);
    }
}
