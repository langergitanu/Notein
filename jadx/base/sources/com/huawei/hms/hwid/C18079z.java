package com.huawei.hms.hwid;

import android.text.TextUtils;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.common.CommonNaming;
import com.huawei.hms.support.api.hwid.RevokeAccessResult;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import o0O00OOO.C25834OooO0oO;

/* JADX INFO: renamed from: com.huawei.hms.hwid.z */
/* JADX INFO: loaded from: classes8.dex */
public class C18079z extends TaskApiCall<C18074u, Void> {
    public C18079z(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(C18074u c18074u, ResponseErrorCode responseErrorCode, String str, C25834OooO0oO<Void> c25834OooO0oO) {
        int errorCode;
        C18053as.m77659b("HuaweiIdCancelAuthorizationTaskApiCall", "HuaweiIdCancelAuthorizationTaskApiCall doExecute", true);
        C18077x.m77713a();
        if (TextUtils.isEmpty(str)) {
            errorCode = responseErrorCode.getErrorCode();
            c25834OooO0oO.OooO00o(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        } else {
            RevokeAccessResult beanFromJsonStr = new RevokeAccessResult().getBeanFromJsonStr(str);
            if (beanFromJsonStr.getErrorCode() != null) {
                errorCode = beanFromJsonStr.getErrorCode().intValue();
                c25834OooO0oO.OooO00o(new ApiException(new Status(beanFromJsonStr.getErrorCode().intValue(), beanFromJsonStr.getErrorMsg())));
            } else {
                c25834OooO0oO.OooO0O0(null);
                errorCode = 0;
            }
        }
        if (c18074u != null) {
            HiAnalyticsClient.reportExit(c18074u.getContext(), CommonNaming.revokeAccess, getTransactionId(), C18052ar.m77657a(errorCode), errorCode);
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 1;
    }
}
