package com.huawei.hms.hwid;

import android.text.TextUtils;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import o0O00OOO.C25834OooO0oO;

/* JADX INFO: renamed from: com.huawei.hms.hwid.aa */
/* JADX INFO: loaded from: classes8.dex */
public class C18035aa extends TaskApiCall<C18074u, Void> {
    public C18035aa(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(C18074u c18074u, ResponseErrorCode responseErrorCode, String str, C25834OooO0oO<Void> c25834OooO0oO) {
        m77608a(responseErrorCode, str);
        if (TextUtils.isEmpty(str)) {
            c25834OooO0oO.OooO00o(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        } else if (responseErrorCode.getErrorCode() == 0) {
            c25834OooO0oO.OooO0O0(null);
        } else {
            c25834OooO0oO.OooO00o(new ApiException(new Status(responseErrorCode.getErrorCode())));
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 1;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return 40000300;
    }

    /* JADX INFO: renamed from: a */
    private void m77608a(ResponseErrorCode responseErrorCode, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("headerErrorCode:" + responseErrorCode.getErrorCode());
        C18053as.m77659b("[HUAWEIIDSDK]HuaweiIdDeleteAuthInfoTaskApiCall", sb.toString(), true);
    }
}
