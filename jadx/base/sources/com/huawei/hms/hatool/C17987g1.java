package com.huawei.hms.hatool;

import android.os.Build;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.hatool.g1 */
/* JADX INFO: loaded from: classes8.dex */
public class C17987g1 extends AbstractC18012p {

    /* JADX INFO: renamed from: f */
    public String f53789f;

    /* JADX INFO: renamed from: g */
    public String f53790g;

    /* JADX INFO: renamed from: h */
    public String f53791h;

    @Override // com.huawei.hms.hatool.InterfaceC18018s
    /* JADX INFO: renamed from: a */
    public JSONObject mo77296a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("_rom_ver", this.f53791h);
        jSONObject.put("_emui_ver", this.f53899a);
        jSONObject.put("_model", Build.MODEL);
        jSONObject.put("_mcc", this.f53789f);
        jSONObject.put("_mnc", this.f53790g);
        jSONObject.put("_package_name", this.f53900b);
        jSONObject.put("_app_ver", this.f53901c);
        jSONObject.put("_lib_ver", "2.2.0.313");
        jSONObject.put("_channel", this.f53902d);
        jSONObject.put("_lib_name", "hianalytics");
        jSONObject.put("_oaid_tracking_flag", this.f53903e);
        return jSONObject;
    }

    /* JADX INFO: renamed from: f */
    public void m77336f(String str) {
        this.f53789f = str;
    }

    /* JADX INFO: renamed from: g */
    public void m77337g(String str) {
        this.f53790g = str;
    }

    /* JADX INFO: renamed from: h */
    public void m77338h(String str) {
        this.f53791h = str;
    }
}
