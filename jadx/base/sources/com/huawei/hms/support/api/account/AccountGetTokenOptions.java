package com.huawei.hms.support.api.account;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class AccountGetTokenOptions {

    /* JADX INFO: renamed from: a */
    private String f56903a;

    /* JADX INFO: renamed from: b */
    private boolean f56904b;

    public AccountGetTokenOptions(String str, boolean z) {
        this.f56903a = str;
        this.f56904b = z;
    }

    public static AccountGetTokenOptions fromJsonObject(JSONObject jSONObject) throws JSONException {
        return new AccountGetTokenOptions(jSONObject.optString("accountName"), Boolean.getBoolean(jSONObject.optString("fromGetToken")));
    }

    public String getAccountName() {
        return this.f56903a;
    }

    public boolean isFromGetToken() {
        return this.f56904b;
    }

    public void setAccountName(String str) {
        this.f56903a = str;
    }

    public void setFromGetToken(boolean z) {
        this.f56904b = z;
    }

    public JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.f56903a)) {
            jSONObject.put("accountName", this.f56903a);
        }
        jSONObject.put("fromGetToken", this.f56904b);
        return jSONObject;
    }
}
