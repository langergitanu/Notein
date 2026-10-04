package com.android.billingclient.api;

import android.text.TextUtils;
import com.microsoft.identity.common.internal.providers.oauth2.ResponseType;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Purchase {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f67096OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f67097OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final JSONObject f67098OooO0OO;

    public Purchase(String str, String str2) throws JSONException {
        this.f67096OooO00o = str;
        this.f67097OooO0O0 = str2;
        this.f67098OooO0OO = new JSONObject(str);
    }

    public final ArrayList OooO00o() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f67098OooO0OO;
        if (jSONObject.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayList.add(jSONObject.optString("productId"));
        }
        return arrayList;
    }

    public final int OooO0O0() {
        return this.f67098OooO0OO.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public final String OooO0OO() {
        JSONObject jSONObject = this.f67098OooO0OO;
        return jSONObject.optString(ResponseType.TOKEN, jSONObject.optString("purchaseToken"));
    }

    public final boolean OooO0Oo() {
        return this.f67098OooO0OO.optBoolean("acknowledged", true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f67096OooO00o, purchase.f67096OooO00o) && TextUtils.equals(this.f67097OooO0O0, purchase.f67097OooO0O0);
    }

    public final int hashCode() {
        return this.f67096OooO00o.hashCode();
    }

    public final String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f67096OooO00o));
    }
}
