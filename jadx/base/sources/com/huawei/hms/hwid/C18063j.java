package com.huawei.hms.hwid;

import android.app.PendingIntent;
import android.text.TextUtils;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.ResolvableApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.account.AccountNaming;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import o0O00OOO.C25834OooO0oO;

/* JADX INFO: renamed from: com.huawei.hms.hwid.j */
/* JADX INFO: loaded from: classes8.dex */
public class C18063j extends TaskApiCall<C18055c, Void> {
    public C18063j(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(C18055c c18055c, ResponseErrorCode responseErrorCode, String str, C25834OooO0oO<Void> c25834OooO0oO) {
        C18053as.m77659b("AccountLogoutTaskApiCall", "AccountLogoutTaskApiCall doExecute", true);
        m77691a(responseErrorCode);
        if (responseErrorCode.getErrorCode() == 0) {
            if (TextUtils.isEmpty(str)) {
                c25834OooO0oO.OooO00o(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
                m77692a(c18055c, responseErrorCode);
                return;
            } else {
                c25834OooO0oO.OooO0O0(null);
                m77692a(c18055c, responseErrorCode);
                return;
            }
        }
        if (CommonCode.Resolution.HAS_RESOLUTION.equals(responseErrorCode.getResolution())) {
            C18053as.m77659b("AccountLogoutTaskApiCall", "hms apk version is low or is not exist.", true);
            c25834OooO0oO.OooO00o(new ResolvableApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason(), (PendingIntent) responseErrorCode.getParcelable())));
        } else {
            C18053as.m77659b("AccountLogoutTaskApiCall", "AccountLogoutTaskApiCall callback.", true);
            if (responseErrorCode.getErrorCode() != 2031) {
                c25834OooO0oO.OooO00o(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            }
        }
        c25834OooO0oO.OooO0O0(null);
        m77692a(c18055c, responseErrorCode);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 16;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return 60000000;
    }

    /* JADX INFO: renamed from: a */
    private void m77692a(C18055c c18055c, ResponseErrorCode responseErrorCode) {
        if (c18055c == null || responseErrorCode == null) {
            return;
        }
        HiAnalyticsClient.reportExit(c18055c.getContext(), AccountNaming.logout, getTransactionId(), C18052ar.m77657a(responseErrorCode.getErrorCode()), responseErrorCode.getErrorCode());
    }

    /* JADX INFO: renamed from: a */
    private void m77691a(ResponseErrorCode responseErrorCode) {
        StringBuilder sb = new StringBuilder();
        sb.append("headerErrorCode:" + responseErrorCode.getErrorCode());
        C18053as.m77659b("AccountLogoutTaskApiCall", sb.toString(), true);
    }
}
