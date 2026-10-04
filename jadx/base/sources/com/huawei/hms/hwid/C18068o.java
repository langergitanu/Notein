package com.huawei.hms.hwid;

import android.text.TextUtils;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.hwid.StartAssistLoginResult;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import o0O00OOO.C25834OooO0oO;
import org.json.JSONException;

/* JADX INFO: renamed from: com.huawei.hms.hwid.o */
/* JADX INFO: loaded from: classes8.dex */
public class C18068o extends TaskApiCall<C18055c, Void> {
    public C18068o(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(C18055c c18055c, ResponseErrorCode responseErrorCode, String str, C25834OooO0oO<Void> c25834OooO0oO) {
        int i;
        C18053as.m77659b("AccountCancelAuthorizationTaskApiCall", "AccountStartAssistLoginTaskApiCall doExecute", true);
        if (TextUtils.isEmpty(str)) {
            int errorCode = responseErrorCode.getErrorCode();
            c25834OooO0oO.OooO00o(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            i = errorCode;
        } else {
            if ("{}".equals(str)) {
                C18053as.m77659b("AccountCancelAuthorizationTaskApiCall", "signIn complete, body is null", true);
                c25834OooO0oO.OooO00o(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
                return;
            }
            try {
                StartAssistLoginResult startAssistLoginResultFromJson = new StartAssistLoginResult().fromJson(str);
                if (startAssistLoginResultFromJson.isSuccess()) {
                    c25834OooO0oO.OooO0O0(null);
                } else {
                    c25834OooO0oO.OooO00o(new ApiException(startAssistLoginResultFromJson.getStatus()));
                }
            } catch (JSONException unused) {
                C18053as.m77660c("AccountCancelAuthorizationTaskApiCall", "tartAssistLogin complete, but parser json exception", true);
                c25834OooO0oO.OooO00o(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            }
            i = 0;
        }
        if (c18055c != null) {
            HiAnalyticsClient.reportExit(c18055c.getContext(), getUri(), getTransactionId(), C18052ar.m77657a(i), i);
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 14;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return 60000000;
    }
}
