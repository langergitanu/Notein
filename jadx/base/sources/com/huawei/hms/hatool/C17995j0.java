package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.hatool.j0 */
/* JADX INFO: loaded from: classes8.dex */
public class C17995j0 implements InterfaceRunnableC18007n0 {

    /* JADX INFO: renamed from: a */
    public Context f53817a = AbstractC17970b.m77230i();

    /* JADX INFO: renamed from: b */
    public String f53818b;

    /* JADX INFO: renamed from: c */
    public JSONObject f53819c;

    /* JADX INFO: renamed from: d */
    public String f53820d;

    /* JADX INFO: renamed from: e */
    public String f53821e;

    /* JADX INFO: renamed from: f */
    public String f53822f;

    /* JADX INFO: renamed from: g */
    public String f53823g;

    /* JADX INFO: renamed from: h */
    public Boolean f53824h;

    public C17995j0(String str, JSONObject jSONObject, String str2, String str3, long j) {
        this.f53818b = str;
        this.f53819c = jSONObject;
        this.f53820d = str2;
        this.f53821e = str3;
        this.f53822f = String.valueOf(j);
        if (AbstractC17967a.m77196i(str2, "oper")) {
            C17983f0 c17983f0M77295a = C17980e0.m77292a().m77295a(str2, j);
            this.f53823g = c17983f0M77295a.m77316a();
            this.f53824h = Boolean.valueOf(c17983f0M77295a.m77318b());
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray;
        C18030y.m77586c("hmsSdk", "Begin to run EventRecordTask...");
        int iM77228h = AbstractC17970b.m77228h();
        int iM77252k = AbstractC17973c.m77252k(this.f53820d, this.f53821e);
        if (C18015q0.m77513a(this.f53817a, "stat_v2_1", iM77228h * 1048576)) {
            C18030y.m77586c("hmsSdk", "stat sp file reach max limited size, discard new event");
            C17989h0.m77341a().m77346a("", "alltype");
            return;
        }
        C18014q c18014q = new C18014q();
        c18014q.m77504b(this.f53818b);
        c18014q.m77501a(this.f53819c.toString());
        c18014q.m77508d(this.f53821e);
        c18014q.m77506c(this.f53822f);
        c18014q.m77510f(this.f53823g);
        Boolean bool = this.f53824h;
        c18014q.m77509e(bool == null ? null : String.valueOf(bool));
        try {
            JSONObject jSONObjectM77507d = c18014q.m77507d();
            String strM77547a = AbstractC18023u0.m77547a(this.f53820d, this.f53821e);
            String strM77329a = C17986g0.m77329a(this.f53817a, "stat_v2_1", strM77547a, "");
            try {
                jSONArray = !TextUtils.isEmpty(strM77329a) ? new JSONArray(strM77329a) : new JSONArray();
            } catch (JSONException unused) {
                C18030y.m77588d("hmsSdk", "Cached data corrupted: stat_v2_1");
                jSONArray = new JSONArray();
            }
            jSONArray.put(jSONObjectM77507d);
            C17986g0.m77334b(this.f53817a, "stat_v2_1", strM77547a, jSONArray.toString());
            if (jSONArray.toString().length() > iM77252k * 1024) {
                C17989h0.m77341a().m77346a(this.f53820d, this.f53821e);
            }
        } catch (JSONException unused2) {
            C18030y.m77590e("hmsSdk", "eventRecord toJson error! The record failed.");
        }
    }
}
