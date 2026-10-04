package com.alipay.share.sdk.openapi;

import android.content.Intent;

/* JADX INFO: loaded from: base.apk:libs/libapshare.jar:com/alipay/share/sdk/openapi/IAPApi.class */
public interface IAPApi {
    boolean isZFBAppInstalled();

    boolean handleIntent(Intent intent, IAPAPIEventHandler iAPAPIEventHandler);

    boolean isZFBSupportAPI();

    boolean openZFBApp();

    boolean sendReq(BaseReq baseReq);

    int getZFBVersionCode();
}
