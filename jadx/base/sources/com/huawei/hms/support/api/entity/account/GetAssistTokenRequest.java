package com.huawei.hms.support.api.entity.account;

import android.text.TextUtils;
import com.huawei.hms.support.feature.result.CommonConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class GetAssistTokenRequest {

    /* JADX INFO: renamed from: a */
    private String f56914a;

    /* JADX INFO: renamed from: b */
    private String f56915b;

    /* JADX INFO: renamed from: c */
    private String f56916c;

    public GetAssistTokenRequest(String str) {
        this.f56914a = str;
    }

    public String getSessionId() {
        return this.f56916c;
    }

    public String getUserIdentify() {
        return this.f56915b;
    }

    public void setSessionId(String str) {
        this.f56916c = str;
    }

    public void setUserIdentify(String str) {
        this.f56915b = str;
    }

    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.f56914a)) {
            jSONObject.putOpt(CommonConstant.KEY_ACCESS_TOKEN, this.f56914a);
        }
        if (!TextUtils.isEmpty(this.f56915b)) {
            jSONObject.putOpt(CommonConstant.KEY_USER_IDENTIFY, this.f56915b);
        }
        if (!TextUtils.isEmpty(this.f56916c)) {
            jSONObject.putOpt("sessionId", this.f56916c);
        }
        return jSONObject.toString();
    }
}
