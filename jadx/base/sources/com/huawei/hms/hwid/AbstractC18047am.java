package com.huawei.hms.hwid;

import Oooo0oO.C21111o0ooOoO;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.hwid.am */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC18047am {

    /* JADX INFO: renamed from: a */
    protected String f53954a;

    /* JADX INFO: renamed from: b */
    protected String f53955b;

    /* JADX INFO: renamed from: c */
    protected long f53956c;

    /* JADX INFO: renamed from: d */
    protected String f53957d;

    /* JADX INFO: renamed from: a */
    public String m77629a() {
        return this.f53954a;
    }

    /* JADX INFO: renamed from: b */
    public void m77632b(String str) {
        this.f53954a = str;
    }

    /* JADX INFO: renamed from: c */
    public void m77634c(String str) {
        this.f53955b = str;
    }

    /* JADX INFO: renamed from: d */
    public void m77636d(String str) {
        this.f53957d = str;
    }

    /* JADX INFO: renamed from: e */
    public JSONObject m77637e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(RemoteConfigConstants.RequestFieldKey.APP_ID, this.f53954a);
        jSONObject.putOpt("packageName", this.f53955b);
        jSONObject.put("hmsSdkVersion", this.f53956c);
        jSONObject.putOpt("subAppId", this.f53957d);
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HuaweiIdCpClientInfo{appId='");
        sb.append(this.f53954a);
        sb.append("', packageName='");
        sb.append(this.f53955b);
        sb.append("', hmsSdkVersion=");
        sb.append(this.f53956c);
        sb.append("', subAppId=");
        return C21111o0ooOoO.OooO0OO(this.f53957d, '}', sb);
    }

    /* JADX INFO: renamed from: a */
    public void m77630a(long j) {
        this.f53956c = j;
    }

    /* JADX INFO: renamed from: b */
    public long m77631b() {
        return this.f53956c;
    }

    /* JADX INFO: renamed from: c */
    public String m77633c() {
        return this.f53957d;
    }

    /* JADX INFO: renamed from: d */
    public String m77635d() throws JSONException {
        return m77637e().toString();
    }
}
