package com.huawei.hms.hwid;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.hwid.ag */
/* JADX INFO: loaded from: classes8.dex */
public class C18041ag {

    /* JADX INFO: renamed from: a */
    private Integer f53952a;

    /* JADX INFO: renamed from: b */
    private String f53953b;

    /* JADX INFO: renamed from: a */
    public Integer m77617a() {
        return this.f53952a;
    }

    /* JADX INFO: renamed from: b */
    public String m77620b() {
        return this.f53953b;
    }

    /* JADX INFO: renamed from: b */
    public static C18041ag m77616b(String str) {
        if (TextUtils.isEmpty(str)) {
            return new C18041ag();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Integer numValueOf = jSONObject.has("errorCode") ? Integer.valueOf(jSONObject.getInt("errorCode")) : null;
            String string = jSONObject.has("errorMsg") ? jSONObject.getString("errorMsg") : null;
            C18041ag c18041ag = new C18041ag();
            c18041ag.m77618a(numValueOf);
            c18041ag.m77619a(string);
            return c18041ag;
        } catch (JSONException unused) {
            C18053as.m77661d("ReadSmsOutputBean", "ReadSmsOutputBean json parse falied", true);
            return new C18041ag();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m77618a(Integer num) {
        this.f53952a = num;
    }

    /* JADX INFO: renamed from: a */
    public void m77619a(String str) {
        this.f53953b = str;
    }
}
