package com.huawei.hms.hwid;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.hwid.af */
/* JADX INFO: loaded from: classes8.dex */
public class C18040af {

    /* JADX INFO: renamed from: a */
    private String f53951a;

    public C18040af() {
    }

    /* JADX INFO: renamed from: a */
    public String m77615a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("packageName", this.f53951a);
            return jSONObject.toString();
        } catch (JSONException unused) {
            C18053as.m77661d("ReadSmsInputBean", "toJson failed", true);
            return null;
        }
    }

    public C18040af(String str) {
        this.f53951a = str;
    }
}
