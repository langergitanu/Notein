package com.huawei.hms.support.feature.result;

import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractAuthResult extends Result {
    public boolean isSuccess() {
        return getStatus().isSuccess();
    }

    public void jsonToSuper(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("status");
        if (jSONObjectOptJSONObject != null) {
            setStatus(new Status(jSONObjectOptJSONObject.optInt(HiAnalyticsConstant.HaKey.BI_KEY_RESULT), jSONObjectOptJSONObject.optString("statusMessage", null)));
        }
    }

    public JSONObject superToJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (getStatus() != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, getStatus().getStatusCode());
            if (getStatus().getStatusMessage() != null) {
                jSONObject2.put("statusMessage", getStatus().getStatusMessage());
            }
            jSONObject.put("status", jSONObject2);
        }
        return jSONObject;
    }
}
