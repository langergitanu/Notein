package com.alipay.share.sdk.openapi;

import android.os.Bundle;
import android.util.Log;
import com.alipay.share.sdk.Constant;
import com.alipay.share.sdk.openapi.APMediaMessage;

/* JADX INFO: loaded from: base.apk:libs/libapshare.jar:com/alipay/share/sdk/openapi/APWebPageObject.class */
public class APWebPageObject implements APMediaMessage.IMediaObject {
    private String TAG = "APSDK.ZFBWebPageObject";
    public String webpageUrl;

    public APWebPageObject() {
    }

    public APWebPageObject(String webpageUrl) {
        this.webpageUrl = webpageUrl;
    }

    public void serialize(Bundle bundle) {
        bundle.putString(Constant.EXTRA_WEB_PAGE_OBJECT_URL, this.webpageUrl);
    }

    public void unserialize(Bundle bundle) {
        this.webpageUrl = bundle.getString(Constant.EXTRA_WEB_PAGE_OBJECT_URL);
    }

    public int type() {
        return 1001;
    }

    public boolean checkArgs() {
        if (this.webpageUrl != null && this.webpageUrl.length() != 0 && this.webpageUrl.length() <= 10240) {
            return true;
        }
        Log.e(this.TAG, "checkArgs fail, webpageUrl is invalid");
        return false;
    }
}
