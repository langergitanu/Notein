package com.huawei.hms.hwid;

import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import o0O00OOO.C25834OooO0oO;

/* JADX INFO: renamed from: com.huawei.hms.hwid.ak */
/* JADX INFO: loaded from: classes8.dex */
public class C18045ak extends TaskApiCall<C18043ai, Void> {
    public C18045ak(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(C18043ai c18043ai, ResponseErrorCode responseErrorCode, String str, C25834OooO0oO<Void> c25834OooO0oO) {
        C18041ag c18041agM77616b = C18041ag.m77616b(str);
        Integer numM77617a = c18041agM77616b.m77617a();
        String strM77620b = c18041agM77616b.m77620b();
        if (numM77617a == null) {
            numM77617a = Integer.valueOf(responseErrorCode.getErrorCode());
            strM77620b = responseErrorCode.getErrorReason();
        }
        if (m77625a(responseErrorCode, c18041agM77616b.m77617a())) {
            c25834OooO0oO.OooO0O0(null);
        } else {
            c25834OooO0oO.OooO00o(new ApiException(new Status(numM77617a.intValue(), strM77620b)));
        }
        if (c18043ai != null) {
            HiAnalyticsClient.reportExit(c18043ai.getContext(), getUri(), getTransactionId(), C18052ar.m77657a(numM77617a.intValue()), numM77617a.intValue());
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 1;
    }

    /* JADX INFO: renamed from: a */
    private boolean m77625a(ResponseErrorCode responseErrorCode, Integer num) {
        return num == null ? responseErrorCode.getStatusCode() == 0 : num.intValue() == 0;
    }
}
