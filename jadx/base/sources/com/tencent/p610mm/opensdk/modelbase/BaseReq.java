package com.tencent.p610mm.opensdk.modelbase;

import android.os.Bundle;
import com.tencent.p610mm.opensdk.channel.p611a.C18915a;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BaseReq {
    public String openId;
    public String transaction;

    public abstract boolean checkArgs();

    public void fromBundle(Bundle bundle) {
        this.transaction = C18915a.m80568a(bundle, "_wxapi_basereq_transaction");
        this.openId = C18915a.m80568a(bundle, "_wxapi_basereq_openid");
    }

    public abstract int getType();

    public void toBundle(Bundle bundle) {
        bundle.putInt("_wxapi_command_type", getType());
        bundle.putString("_wxapi_basereq_transaction", this.transaction);
        bundle.putString("_wxapi_basereq_openid", this.openId);
    }
}
