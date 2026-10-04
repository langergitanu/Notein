package com.huawei.hms.support.api.entity.account;

import com.huawei.hms.support.feature.result.CommonConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class AccountStartAssistLoginRequest {

    /* JADX INFO: renamed from: a */
    private String f56913a;

    public AccountStartAssistLoginRequest() {
    }

    public static AccountStartAssistLoginRequest fromJson(String str) throws JSONException {
        if (str == null) {
            return null;
        }
        return new AccountStartAssistLoginRequest().objectFromJson(new JSONObject(str));
    }

    public AccountStartAssistLoginRequest objectFromJson(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            this.f56913a = jSONObject.getString(CommonConstant.KEY_ASSIST_TOKEN);
        }
        return this;
    }

    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.f56913a;
        if (str != null) {
            jSONObject.put(CommonConstant.KEY_ASSIST_TOKEN, str);
        }
        return jSONObject.toString();
    }

    public AccountStartAssistLoginRequest(String str) {
        this.f56913a = str;
    }
}
