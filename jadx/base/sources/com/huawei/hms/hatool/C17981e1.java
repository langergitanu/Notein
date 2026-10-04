package com.huawei.hms.hatool;

import com.hihonor.honorid.core.data.DeviceInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.hatool.e1 */
/* JADX INFO: loaded from: classes8.dex */
public class C17981e1 extends AbstractC18006n {

    /* JADX INFO: renamed from: b */
    public String f53775b = "";

    /* JADX INFO: renamed from: c */
    public String f53776c = "";

    /* JADX INFO: renamed from: d */
    public String f53777d = "";

    /* JADX INFO: renamed from: e */
    public String f53778e = "";

    /* JADX INFO: renamed from: f */
    public String f53779f = "";

    /* JADX INFO: renamed from: g */
    public String f53780g;

    @Override // com.huawei.hms.hatool.InterfaceC18018s
    /* JADX INFO: renamed from: a */
    public JSONObject mo77296a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("androidid", this.f53881a);
        jSONObject.put("oaid", this.f53780g);
        jSONObject.put(DeviceInfo.TAG_UUID, this.f53779f);
        jSONObject.put("upid", this.f53778e);
        jSONObject.put("imei", this.f53775b);
        jSONObject.put("sn", this.f53776c);
        jSONObject.put("udid", this.f53777d);
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public void m77297b(String str) {
        this.f53775b = str;
    }

    /* JADX INFO: renamed from: c */
    public void m77298c(String str) {
        this.f53780g = str;
    }

    /* JADX INFO: renamed from: d */
    public void m77299d(String str) {
        this.f53776c = str;
    }

    /* JADX INFO: renamed from: e */
    public void m77300e(String str) {
        this.f53777d = str;
    }

    /* JADX INFO: renamed from: f */
    public void m77301f(String str) {
        this.f53778e = str;
    }

    /* JADX INFO: renamed from: g */
    public void m77302g(String str) {
        this.f53779f = str;
    }
}
