package com.huawei.hms.hwid;

import android.text.TextUtils;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.hwid.RevokeAccessResult;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import o0O00OOO.C25834OooO0oO;

/* JADX INFO: renamed from: com.huawei.hms.hwid.h */
/* JADX INFO: loaded from: classes8.dex */
public class C18060h extends TaskApiCall<C18055c, Void> {
    public C18060h(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(C18055c c18055c, ResponseErrorCode responseErrorCode, String str, C25834OooO0oO<Void> c25834OooO0oO) {
        int iIntValue;
        C18053as.m77659b("AccountCancelAuthorizationTaskApiCall", "AccountCancelAuthorizationTaskApiCall doExecute", true);
        C18058f.m77671a();
        if (TextUtils.isEmpty(str)) {
            int errorCode = responseErrorCode.getErrorCode();
            c25834OooO0oO.OooO00o(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            iIntValue = errorCode;
        } else {
            if ("{}".equals(str)) {
                C18053as.m77659b("AccountCancelAuthorizationTaskApiCall", "signIn complete, body is null", true);
                c25834OooO0oO.OooO00o(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
                return;
            }
            RevokeAccessResult beanFromJsonStr = new RevokeAccessResult().getBeanFromJsonStr(str);
            if (beanFromJsonStr.getErrorCode() != null) {
                iIntValue = beanFromJsonStr.getErrorCode().intValue();
                c25834OooO0oO.OooO00o(new ApiException(new Status(beanFromJsonStr.getErrorCode().intValue(), beanFromJsonStr.getErrorMsg())));
            } else {
                if (responseErrorCode.getErrorCode() == 1212) {
                    C18053as.m77659b("AccountCancelAuthorizationTaskApiCall", "AccountCancelAuthorizationTaskApiCall 1212", true);
                    Status status = new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason());
                    C18049ao.m77646a(responseErrorCode, status);
                    c25834OooO0oO.OooO00o(new ApiException(status));
                } else {
                    c25834OooO0oO.OooO0O0(null);
                }
                iIntValue = 0;
            }
        }
        if (c18055c != null) {
            HiAnalyticsClient.reportExit(c18055c.getContext(), getUri(), getTransactionId(), C18052ar.m77657a(iIntValue), iIntValue);
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 1;
    }
}
