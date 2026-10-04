package com.huawei.hms.support.api.entity.hwid;

import com.huawei.hms.support.api.hwid.HuaweiIdGetTokenOptions;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParams;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class HuaweiIdSignInRequest {

    /* JADX INFO: renamed from: a */
    HuaweiIdAuthParams f56919a;

    /* JADX INFO: renamed from: b */
    HuaweiIdGetTokenOptions f56920b;

    public static HuaweiIdSignInRequest fromJson(String str) throws JSONException {
        if (str == null) {
            return null;
        }
        return new HuaweiIdSignInRequest().objectFromJson(new JSONObject(str));
    }

    public HuaweiIdAuthParams getHuaweiIdAuthParams() {
        return this.f56919a;
    }

    public HuaweiIdGetTokenOptions getHuaweiIdGetTokenOptions() {
        return this.f56920b;
    }

    public HuaweiIdSignInRequest objectFromJson(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        JSONObject jSONObject3 = jSONObject.getJSONObject("huaweiIdSignInOptions");
        if (jSONObject3 != null) {
            this.f56919a = HuaweiIdAuthParams.fromJsonObject(jSONObject3);
        }
        if (jSONObject.has("huaweiIdGetTokenOptions") && (jSONObject2 = jSONObject.getJSONObject("huaweiIdGetTokenOptions")) != null && jSONObject2.length() > 0) {
            this.f56920b = HuaweiIdGetTokenOptions.fromJsonObject(jSONObject2);
        }
        return this;
    }

    public void setHuaweiIdAuthParams(HuaweiIdAuthParams huaweiIdAuthParams) {
        this.f56919a = huaweiIdAuthParams;
    }

    public void setHuaweiIdGetTokenOptions(HuaweiIdGetTokenOptions huaweiIdGetTokenOptions) {
        this.f56920b = huaweiIdGetTokenOptions;
    }

    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        HuaweiIdAuthParams huaweiIdAuthParams = this.f56919a;
        if (huaweiIdAuthParams != null) {
            jSONObject.put("huaweiIdSignInOptions", huaweiIdAuthParams.toJsonObject());
        }
        HuaweiIdGetTokenOptions huaweiIdGetTokenOptions = this.f56920b;
        if (huaweiIdGetTokenOptions != null) {
            jSONObject.put("huaweiIdGetTokenOptions", huaweiIdGetTokenOptions.toJsonObject());
        }
        return jSONObject.toString();
    }
}
