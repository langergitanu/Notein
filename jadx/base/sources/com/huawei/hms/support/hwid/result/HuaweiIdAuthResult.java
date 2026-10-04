package com.huawei.hms.support.hwid.result;

import android.text.TextUtils;
import com.huawei.hms.support.feature.result.AbstractAuthResult;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class HuaweiIdAuthResult extends AbstractAuthResult {
    private AuthHuaweiId authHuaweiId;

    public HuaweiIdAuthResult fromJson(String str) throws JSONException {
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            jsonToSuper(jSONObject);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("signInHuaweiId");
            if (jSONObjectOptJSONObject != null) {
                this.authHuaweiId = AuthHuaweiId.fromJson(jSONObjectOptJSONObject);
            }
        }
        return this;
    }

    public AuthHuaweiId getHuaweiId() {
        return this.authHuaweiId;
    }

    public void setAuthHuaweiId(AuthHuaweiId authHuaweiId) {
        this.authHuaweiId = authHuaweiId;
    }

    public String toJson() throws JSONException {
        return toJsonObject().toString();
    }

    public JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObjectSuperToJson = superToJson();
        AuthHuaweiId authHuaweiId = this.authHuaweiId;
        if (authHuaweiId != null) {
            jSONObjectSuperToJson.put("signInHuaweiId", authHuaweiId.toJsonObject());
        }
        return jSONObjectSuperToJson;
    }
}
