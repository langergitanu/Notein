package com.huawei.hms.support.api.hwid;

import android.text.TextUtils;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.hwid.C18053as;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class RevokeAccessResult extends Result {
    private static final String TAG = "[HUAWEIIDSDK]RevokeAccessResult";

    @Packed
    private Integer errorCode;

    @Packed
    private String errorMsg;

    public RevokeAccessResult() {
    }

    private void jsonToSuper(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("status");
        if (jSONObjectOptJSONObject != null) {
            setStatus(new Status(jSONObjectOptJSONObject.optInt(HiAnalyticsConstant.HaKey.BI_KEY_RESULT), jSONObjectOptJSONObject.optString("statusMessage", null)));
        }
    }

    public RevokeAccessResult fromJson(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        jsonToSuper(new JSONObject(str));
        return this;
    }

    public RevokeAccessResult getBeanFromJsonStr(String str) {
        C18053as.m77659b(TAG, "getBeanFromJsonStr begin.", true);
        boolean zIsEmpty = TextUtils.isEmpty(str);
        Integer numValueOf = Integer.valueOf(CommonConstant.RETCODE.SIGN_IN_PARAMS_ERROR);
        if (zIsEmpty) {
            return new RevokeAccessResult(numValueOf, "body is empty");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Integer numValueOf2 = jSONObject.has("errorCode") ? Integer.valueOf(jSONObject.getInt("errorCode")) : null;
            return (numValueOf2 == null || numValueOf2.intValue() != 0) ? new RevokeAccessResult(numValueOf2, jSONObject.optString("errorMsg")) : new RevokeAccessResult();
        } catch (JSONException unused) {
            C18053as.m77661d(TAG, "JSONException", true);
            return new RevokeAccessResult(numValueOf, "JSONException");
        }
    }

    public Integer getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public boolean isSuccess() {
        return getStatus().isSuccess();
    }

    public void setErrorCode(Integer num) {
        this.errorCode = num;
    }

    public void setErrorMsg(String str) {
        this.errorMsg = str;
    }

    public RevokeAccessResult(Integer num, String str) {
        this.errorCode = num;
        this.errorMsg = str;
    }

    public RevokeAccessResult(Status status) {
        setStatus(status);
    }
}
