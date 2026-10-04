package com.huawei.hms.hwid;

import android.text.TextUtils;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.common.CommonNaming;
import com.huawei.hms.support.api.hwid.SignOutResult;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import o0O00OOO.C25834OooO0oO;
import org.json.JSONException;

/* JADX INFO: renamed from: com.huawei.hms.hwid.ad */
/* JADX INFO: loaded from: classes8.dex */
public class C18038ad extends TaskApiCall<C18074u, Void> {
    public C18038ad(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(C18074u c18074u, ResponseErrorCode responseErrorCode, String str, C25834OooO0oO<Void> c25834OooO0oO) {
        m77611a(responseErrorCode, str);
        int errorCode = responseErrorCode.getErrorCode();
        if (TextUtils.isEmpty(str)) {
            c25834OooO0oO.OooO00o(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        } else {
            try {
                SignOutResult signOutResultFromJson = new SignOutResult().fromJson(str);
                errorCode = signOutResultFromJson.getStatus().getStatusCode();
                if (signOutResultFromJson.isSuccess()) {
                    c25834OooO0oO.OooO0O0(null);
                } else {
                    c25834OooO0oO.OooO00o(new ApiException(signOutResultFromJson.getStatus()));
                }
            } catch (JSONException unused) {
                c25834OooO0oO.OooO00o(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            }
        }
        if (c18074u != null) {
            HiAnalyticsClient.reportExit(c18074u.getContext(), CommonNaming.signout, getTransactionId(), C18052ar.m77657a(errorCode), errorCode);
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 1;
    }

    /* JADX INFO: renamed from: a */
    private void m77611a(ResponseErrorCode responseErrorCode, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("headerErrorCode:" + responseErrorCode.getErrorCode());
        C18053as.m77659b("[HUAWEIIDSDK]HuaweiIdSignOutTaskApiCall", sb.toString(), true);
    }
}
