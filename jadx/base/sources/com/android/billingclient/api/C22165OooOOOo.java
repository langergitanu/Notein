package com.android.billingclient.api;

import Oooo0oO.C21023OooO0Oo;
import android.text.TextUtils;
import com.huawei.hms.network.embedded.C18437z2;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.android.billingclient.api.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22165OooOOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f66982OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f66983OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f66984OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f66985OooO0Oo;

    public C22165OooOOOo(String str) throws JSONException {
        this.f66982OooO00o = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f66983OooO0O0 = jSONObject.optString("productId");
        String strOptString = jSONObject.optString(C18437z2.f56754h);
        this.f66984OooO0OO = strOptString;
        this.f66985OooO0Oo = jSONObject.has(HiAnalyticsConstant.HaKey.BI_KEY_RESULT) ? jSONObject.optInt(HiAnalyticsConstant.HaKey.BI_KEY_RESULT) : 0;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        jSONObject.optString("serializedDocid");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C22165OooOOOo) {
            return TextUtils.equals(this.f66982OooO00o, ((C22165OooOOOo) obj).f66982OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f66982OooO00o.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnfetchedProduct{productId='");
        sb.append(this.f66983OooO0O0);
        sb.append("', productType='");
        sb.append(this.f66984OooO0OO);
        sb.append("', statusCode=");
        return C21023OooO0Oo.OooO0OO("}", this.f66985OooO0Oo, sb);
    }
}
