package com.huawei.hms.hatool;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.hatool.f1 */
/* JADX INFO: loaded from: classes8.dex */
public class C17984f1 extends AbstractC18009o {

    /* JADX INFO: renamed from: g */
    public String f53788g = "";

    @Override // com.huawei.hms.hatool.InterfaceC18018s
    /* JADX INFO: renamed from: a */
    public JSONObject mo77296a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("protocol_version", "1");
        jSONObject.put("compress_mode", "1");
        jSONObject.put("serviceid", this.f53885d);
        jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, this.f53882a);
        jSONObject.put("hmac", this.f53788g);
        jSONObject.put("chifer", this.f53887f);
        jSONObject.put("timestamp", this.f53883b);
        jSONObject.put("servicetag", this.f53884c);
        jSONObject.put("requestid", this.f53886e);
        return jSONObject;
    }

    /* JADX INFO: renamed from: g */
    public void m77323g(String str) {
        this.f53788g = str;
    }
}
