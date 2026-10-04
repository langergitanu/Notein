package com.alipay.share.sdk.openapi;

import android.os.Bundle;
import com.alipay.share.sdk.Constant;
import com.alipay.share.sdk.openapi.APMediaMessage;
import com.alipay.share.sdk.openapi.p013ui.C0202Ui;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

/* JADX INFO: loaded from: base.apk:libs/libapshare.jar:com/alipay/share/sdk/openapi/APFundObject.class */
public class APFundObject implements APMediaMessage.IMediaObject {
    public String webpageUrl;
    public String fundTag;
    public String fundName;
    public String fundCode;
    public String fundPrice;
    public String extraDesc1;
    public String extraDesc2;
    public String extraValue1;
    public String extraValue2;
    public long time;

    /* JADX INFO: renamed from: ui */
    public C0202Ui f182ui;

    /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: SSATransform
        java.lang.ArrayIndexOutOfBoundsException
        */
    public APFundObject(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            r0 = r2
            r0.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.share.sdk.openapi.APFundObject.mo27882k4(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0000: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('bundle' android.os.Bundle)]) (LINE:66), block:B:2:0x0000 */
    static {
        Bundle bundle;
        bundle.putString(Constant.EXTRA_WEB_PAGE_OBJECT_URL, this.webpageUrl);
        bundle.putString(Constant.EXTRA_FUND_TAG, this.fundTag);
        bundle.putString(Constant.EXTRA_FUND_TITLE, this.fundName);
        bundle.putString(Constant.EXTRA_FUND_CODE, this.fundCode);
        bundle.putString(Constant.EXTRA_FUND_PRICE, this.fundPrice);
        bundle.putString(Constant.EXTRA_FUND_EXTRA_DESC1, this.extraDesc1);
        bundle.putString(Constant.EXTRA_FUND_EXTRA_DESC2, this.extraDesc2);
        bundle.putString(Constant.EXTRA_FUND_EXTRA_VALUE1, this.extraValue1);
        bundle.putString(Constant.EXTRA_FUND_EXTRA_VALUE2, this.extraValue2);
        bundle.putLong(Constant.EXTRA_FUND_TIME, this.time);
        if (this.f182ui != null) {
            JSONStringer jsonStringer = new JSONStringer();
            try {
                jsonStringer.object();
                jsonStringer.key("skin").value(this.f182ui.skin);
                if (this.f182ui.style != null) {
                    JSONObject style = new JSONObject();
                    style.put("tagBgColor", this.f182ui.style.tagBgColor);
                    style.put("priceColor", this.f182ui.style.priceColor);
                    style.put("tip1Color", this.f182ui.style.tip1Color);
                    style.put("tip2Color", this.f182ui.style.tip2Color);
                    style.put("dayIncreaseColor", this.f182ui.style.dayIncreaseColor);
                    style.put("weekIncreaseColor", this.f182ui.style.weekIncreaseColor);
                    style.put("timeColor", this.f182ui.style.timeColor);
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

    /* JADX INFO: renamed from: <init>, reason: not valid java name */
    public void m80684init() {
    }

    /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: SSATransform
        java.lang.ArrayIndexOutOfBoundsException
        */
    /* JADX INFO: renamed from: <init>, reason: not valid java name */
    public void m80685init(com.aspose.slides.p559ms.System.Xml.AbstractC13912i5 r3) {
        /*
            r2 = this;
            r0 = 122(0x7a, float:1.71E-43)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.share.sdk.openapi.APFundObject.m80685init(com.aspose.slides.ms.System.Xml.i5):void");
    }

    /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: SSATransform
        java.lang.ArrayIndexOutOfBoundsException
        */
    /* JADX INFO: renamed from: k4 */
    public byte m231k4(com.aspose.slides.internal.p332p7.pya r3, byte r4) {
        /*
            r2 = this;
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.share.sdk.openapi.APFundObject.m231k4(com.aspose.slides.internal.p7.pya, byte):byte");
    }
}
