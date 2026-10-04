package com.alipay.share.sdk.openapi;

import android.os.Bundle;
import android.util.Log;
import com.alipay.share.sdk.Constant;
import com.alipay.share.sdk.openapi.APMediaMessage;

/* JADX INFO: loaded from: base.apk:libs/libapshare.jar:com/alipay/share/sdk/openapi/APTextObject.class */
public class APTextObject implements APMediaMessage.IMediaObject {
    private static final String TAG = "APSDK.ZFBTextObject";
    public String text;

    public APTextObject() {
    }

    public APTextObject(String text) {
        this.text = text;
    }

    public void serialize(Bundle bundle) {
        bundle.putString(Constant.EXTRA_TEXT_OBJECT_TEXT, this.text);
    }

    public void unserialize(Bundle bundle) {
        this.text = bundle.getString(Constant.EXTRA_TEXT_OBJECT_TEXT);
    }

    public int type() {
        return 11;
    }

    public boolean checkArgs() {
        if (this.text != null && this.text.length() != 0 && this.text.length() <= 10240) {
            return true;
        }
        Log.e(TAG, "checkArgs fail, text is invalid");
        return false;
    }
}
