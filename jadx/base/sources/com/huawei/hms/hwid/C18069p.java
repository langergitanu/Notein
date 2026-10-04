package com.huawei.hms.hwid;

import android.text.TextUtils;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.account.result.AssistTokenResult;
import com.huawei.hms.support.account.result.GetAssistTokenResult;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.account.AccountNaming;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import o0O00OOO.C25834OooO0oO;
import org.json.JSONException;

/* JADX INFO: renamed from: com.huawei.hms.hwid.p */
/* JADX INFO: loaded from: classes8.dex */
public class C18069p extends TaskApiCall<C18055c, AssistTokenResult> {
    public C18069p(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(C18055c c18055c, ResponseErrorCode responseErrorCode, String str, C25834OooO0oO<AssistTokenResult> c25834OooO0oO) {
        int errorCode = responseErrorCode.getErrorCode();
        if (TextUtils.isEmpty(str) || "{}".equals(str)) {
            C18053as.m77659b("[AccountSDK]GetAssistTokenTaskApiCall", "getAssistToken complete, response or body is null, failed", true);
            m77700a(c18055c, errorCode);
            c25834OooO0oO.OooO00o(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            return;
        }
        try {
            AssistTokenResult assistTokenResult = new AssistTokenResult();
            GetAssistTokenResult getAssistTokenResultFromJson = new GetAssistTokenResult().fromJson(str);
            if (!getAssistTokenResultFromJson.isSuccess()) {
                C18053as.m77659b("[AccountSDK]GetAssistTokenTaskApiCall", "getAssistToken failed", true);
                m77700a(c18055c, errorCode);
                c25834OooO0oO.OooO00o(new ApiException(getAssistTokenResultFromJson.getStatus()));
            } else {
                C18053as.m77659b("[AccountSDK]GetAssistTokenTaskApiCall", "getAssistToken success", true);
                m77700a(c18055c, errorCode);
                assistTokenResult.setAssistToken(getAssistTokenResultFromJson.getAssistToken());
                c25834OooO0oO.OooO0O0(assistTokenResult);
            }
        } catch (JSONException unused) {
            C18053as.m77661d("[AccountSDK]GetAssistTokenTaskApiCall", "getAssistToken complete, but parser json exception", true);
            m77700a(c18055c, errorCode);
            c25834OooO0oO.OooO00o(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
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

    /* JADX INFO: renamed from: a */
    private void m77700a(C18055c c18055c, int i) {
        if (c18055c != null) {
            HiAnalyticsClient.reportExit(c18055c.getContext(), AccountNaming.getAssistToken, getTransactionId(), C18052ar.m77657a(i), i);
        }
    }
}
