package com.alipay.share.sdk.openapi;

import android.os.Bundle;
import android.util.Log;
import com.alipay.share.sdk.Constant;
import com.alipay.share.sdk.openapi.APMediaMessage;
import com.alipay.share.sdk.openapi.p013ui.C0202Ui;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

/* JADX INFO: loaded from: base.apk:libs/libapshare.jar:com/alipay/share/sdk/openapi/APTaobaoGoodsObject.class */
public class APTaobaoGoodsObject implements APMediaMessage.IMediaObject {
    private static final String TAG = "APSDK.APTaobaoObject";
    public String webpageUrl;
    public String tag1;
    public String tag2;

    /* JADX INFO: renamed from: ui */
    public C0202Ui f183ui;

    public APTaobaoGoodsObject() {
    }

    public APTaobaoGoodsObject(String webpageUrl) {
        this.webpageUrl = webpageUrl;
    }

    public void serialize(Bundle bundle) {
        bundle.putString(Constant.EXTRA_WEB_PAGE_OBJECT_URL, this.webpageUrl);
        bundle.putString(Constant.EXTRA_TAOBAO_TAG1, this.tag1);
        bundle.putString(Constant.EXTRA_TAOBAO_TAG2, this.tag2);
        if (this.f183ui != null) {
            JSONStringer jsonStringer = new JSONStringer();
            try {
                jsonStringer.object();
                jsonStringer.key("skin").value(this.f183ui.skin);
                if (this.f183ui.style != null) {
                    JSONObject style = new JSONObject();
                    style.put("midTitleColor", this.f183ui.style.midTitleColor);
                    style.put("mColor", this.f183ui.style.mColor);
                    style.put("mWithoutLine", this.f183ui.style.mWithoutLine);
                    style.put("tip1BgColor", this.f183ui.style.tip1BgColor);
                    style.put("tip2BgColor", this.f183ui.style.tip2BgColor);
                    jsonStringer.key("style").value(style);
                }
                jsonStringer.endObject();
                String ret = jsonStringer.toString();
                bundle.putString(Constant.EXTRA_UI, ret);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void unserialize(Bundle bundle) {
    }

    public int type() {
        return 1010;
    }

    public boolean checkArgs() {
        if (this.webpageUrl != null && this.webpageUrl.length() != 0 && this.webpageUrl.length() <= 10240) {
            return true;
        }
        Log.e(TAG, "checkArgs fail, webpageUrl is invalid");
        return false;
    }
}
