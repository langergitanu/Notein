package com.huawei.hms.hwid;

import android.text.TextUtils;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.hwid.SignOutResult;
import o0O00OOO.C25834OooO0oO;
import org.json.JSONException;

/* JADX INFO: renamed from: com.huawei.hms.hwid.n */
/* JADX INFO: loaded from: classes8.dex */
public class C18067n extends TaskApiCall<C18055c, Void> {
    public C18067n(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(C18055c c18055c, ResponseErrorCode responseErrorCode, String str, C25834OooO0oO<Void> c25834OooO0oO) {
        m77697a(responseErrorCode, str);
        if (TextUtils.isEmpty(str)) {
            c25834OooO0oO.OooO00o(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            return;
        }
        try {
            SignOutResult signOutResultFromJson = new SignOutResult().fromJson(str);
            if (signOutResultFromJson.isSuccess()) {
                c25834OooO0oO.OooO0O0(null);
                return;
            }
            Status status = signOutResultFromJson.getStatus();
            C18049ao.m77646a(responseErrorCode, status);
            c25834OooO0oO.OooO00o(new ApiException(status));
        } catch (JSONException unused) {
            Status status2 = new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason());
            C18049ao.m77646a(responseErrorCode, status2);
            c25834OooO0oO.OooO00o(new ApiException(status2));
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 1;
    }

    /* JADX INFO: renamed from: a */
    private void m77697a(ResponseErrorCode responseErrorCode, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("headerErrorCode:" + responseErrorCode.getErrorCode());
        C18053as.m77659b("[AccountSDK]AccountSignOutTaskApiCall", sb.toString(), true);
    }
}
