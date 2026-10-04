package com.alipay.share.sdk.openapi;

import android.content.Context;

/* JADX INFO: loaded from: base.apk:libs/libapshare.jar:com/alipay/share/sdk/openapi/APAPIFactory.class */
public class APAPIFactory {
    private APAPIFactory() {
    }

    public static IAPApi createZFBApi(Context context, String appId, boolean needSignatureCheck) {
        return new APApiImlV1(context, appId, needSignatureCheck);
    }

    public static IAPApi createZFBApi(Context context, String appId) {
        return new APApiImlV1(context, appId);
    }
}
