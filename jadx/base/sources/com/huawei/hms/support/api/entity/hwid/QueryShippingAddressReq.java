package com.huawei.hms.support.api.entity.hwid;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.hwid.C18053as;
import com.huawei.hms.support.hwid.result.AuthHuaweiId;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class QueryShippingAddressReq implements IMessageEntity {
    private static final String KEY_ACCESSTOKEN = "KEY_ACCESSTOKEN";
    private static final String KEY_OPENID = "KEY_OPENID";
    private static final String KEY_USERID = "KEY_USERID";
    private static final String TAG = "QueryShippingAddressReq";

    @Packed
    public String mLocalJsonObject;

    public QueryShippingAddressReq() {
    }

    private JSONObject getJsonObj() {
        if (this.mLocalJsonObject == null) {
            return null;
        }
        try {
            return new JSONObject(this.mLocalJsonObject);
        } catch (JSONException e) {
            C18053as.m77661d(TAG, "getJsonObj has some error ".concat(e.getClass().getSimpleName()), true);
            return null;
        }
    }

    public String getAccessToken() {
        JSONObject jsonObj = getJsonObj();
        if (jsonObj == null) {
            return "";
        }
        try {
            return jsonObj.getString(KEY_ACCESSTOKEN);
        } catch (JSONException e) {
            C18053as.m77661d(TAG, "getAccessToken has some error ".concat(e.getClass().getSimpleName()), true);
            return "";
        }
    }

    public String getOpenId() {
        JSONObject jsonObj = getJsonObj();
        if (jsonObj == null) {
            return "";
        }
        try {
            return jsonObj.getString(KEY_OPENID);
        } catch (JSONException e) {
            C18053as.m77661d(TAG, "getOpenId has some error ".concat(e.getClass().getSimpleName()), true);
            return "";
        }
    }

    public String getUserID() {
        JSONObject jsonObj = getJsonObj();
        if (jsonObj == null) {
            return "";
        }
        try {
            return jsonObj.getString(KEY_USERID);
        } catch (JSONException e) {
            C18053as.m77661d(TAG, "getUserID has some error ".concat(e.getClass().getSimpleName()), true);
            return "";
        }
    }

    public QueryShippingAddressReq(AuthHuaweiId authHuaweiId) {
        if (authHuaweiId == null) {
            C18053as.m77659b(TAG, "authHuaweiId is null !", true);
            this.mLocalJsonObject = new JSONObject().toString();
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(KEY_ACCESSTOKEN, authHuaweiId.getAccessToken());
            jSONObject.put(KEY_OPENID, authHuaweiId.getOpenId());
            jSONObject.put(KEY_USERID, authHuaweiId.getUid());
            this.mLocalJsonObject = jSONObject.toString();
        } catch (JSONException e) {
            C18053as.m77661d(TAG, "Constructor has some error ".concat(e.getClass().getSimpleName()), true);
            this.mLocalJsonObject = new JSONObject().toString();
        }
    }
}
