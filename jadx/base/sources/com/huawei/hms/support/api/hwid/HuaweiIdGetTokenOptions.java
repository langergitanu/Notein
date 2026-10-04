package com.huawei.hms.support.api.hwid;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class HuaweiIdGetTokenOptions {

    /* JADX INFO: renamed from: a */
    private String f56925a;

    /* JADX INFO: renamed from: b */
    private boolean f56926b;

    public HuaweiIdGetTokenOptions(String str, boolean z) {
        this.f56925a = str;
        this.f56926b = z;
    }

    public static HuaweiIdGetTokenOptions fromJsonObject(JSONObject jSONObject) throws JSONException {
        return new HuaweiIdGetTokenOptions(jSONObject.optString("accountName"), Boolean.getBoolean(jSONObject.optString("fromGetToken")));
    }

    public String getAccountName() {
        return this.f56925a;
    }

    public boolean isFromGetToken() {
        return this.f56926b;
    }

    public void setAccountName(String str) {
        this.f56925a = str;
    }

    public void setFromGetToken(boolean z) {
        this.f56926b = z;
    }

    public JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.f56925a)) {
            jSONObject.put("accountName", this.f56925a);
        }
        jSONObject.put("fromGetToken", this.f56926b);
        return jSONObject;
    }
}
