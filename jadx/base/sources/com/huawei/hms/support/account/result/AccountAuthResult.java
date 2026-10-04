package com.huawei.hms.support.account.result;

import android.text.TextUtils;
import com.huawei.hms.support.feature.result.AbstractAuthResult;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class AccountAuthResult extends AbstractAuthResult {
    private static final String TAG_ENTITY = "signInHuaweiId";
    private AuthAccount authAccount;

    public AccountAuthResult fromJson(String str) throws JSONException {
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            jsonToSuper(jSONObject);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(TAG_ENTITY);
            if (jSONObjectOptJSONObject != null) {
                this.authAccount = AuthAccount.fromJson(jSONObjectOptJSONObject);
            }
        }
        return this;
    }

    public AuthAccount getAccount() {
        return this.authAccount;
    }

    public void setAuthAccount(AuthAccount authAccount) {
        this.authAccount = authAccount;
    }

    public String toJson() throws JSONException {
        return toJsonObject().toString();
    }

    public JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObjectSuperToJson = superToJson();
        AuthAccount authAccount = this.authAccount;
        if (authAccount != null) {
            jSONObjectSuperToJson.put(TAG_ENTITY, authAccount.toJsonObject());
        }
        return jSONObjectSuperToJson;
    }
}
