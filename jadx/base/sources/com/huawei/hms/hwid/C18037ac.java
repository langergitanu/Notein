package com.huawei.hms.hwid;

import android.text.TextUtils;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.common.CommonNaming;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParams;
import com.huawei.hms.support.hwid.result.AuthHuaweiId;
import com.huawei.hms.support.hwid.result.HuaweiIdAuthResult;
import com.huawei.hms.utils.Util;
import o0O00OOO.C25834OooO0oO;
import org.json.JSONException;

/* JADX INFO: renamed from: com.huawei.hms.hwid.ac */
/* JADX INFO: loaded from: classes8.dex */
public class C18037ac extends TaskApiCall<C18074u, AuthHuaweiId> {
    public C18037ac(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(C18074u c18074u, ResponseErrorCode responseErrorCode, String str, C25834OooO0oO<AuthHuaweiId> c25834OooO0oO) {
        AuthHuaweiId huaweiId;
        int i;
        C18053as.m77659b("[HUAWEIIDSDK]SignInTaskApiCall", "ResponseErrorCode.status:" + String.valueOf(responseErrorCode.getErrorCode()), true);
        int errorCode = responseErrorCode.getErrorCode();
        if (TextUtils.isEmpty(str)) {
            C18053as.m77659b("[HUAWEIIDSDK]SignInTaskApiCall", "signIn complete, response is null, failed", true);
            c25834OooO0oO.OooO00o(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            i = errorCode;
            huaweiId = null;
        } else {
            try {
                HuaweiIdAuthResult huaweiIdAuthResultFromJson = new HuaweiIdAuthResult().fromJson(str);
                errorCode = huaweiIdAuthResultFromJson.getStatus().getStatusCode();
                if (huaweiIdAuthResultFromJson.isSuccess()) {
                    C18053as.m77659b("[HUAWEIIDSDK]SignInTaskApiCall", "signIn success", true);
                    new C18076w(c18074u.getContext()).m77709a();
                    huaweiId = huaweiIdAuthResultFromJson.getHuaweiId();
                    try {
                        c25834OooO0oO.OooO0O0(huaweiIdAuthResultFromJson.getHuaweiId());
                    } catch (JSONException unused) {
                        C18053as.m77660c("[HUAWEIIDSDK]SignInTaskApiCall", "signIn complete, but parser json exception", true);
                        c25834OooO0oO.OooO00o(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
                    }
                } else {
                    C18053as.m77659b("[HUAWEIIDSDK]SignInTaskApiCall", "signIn failed", true);
                    c25834OooO0oO.OooO00o(new ApiException(huaweiIdAuthResultFromJson.getStatus()));
                    huaweiId = null;
                }
            } catch (JSONException unused2) {
                huaweiId = null;
            }
            i = errorCode;
        }
        C18078y.m77716a().m77718a(huaweiId, (HuaweiIdAuthParams) null);
        if (c18074u != null) {
            HiAnalyticsClient.reportExit(c18074u.getContext(), CommonNaming.silentSignIn, getTransactionId(), Util.getAppId(c18074u.getContext()), C18052ar.m77657a(i), i, 60400302);
        }
        C18053as.m77659b("[HUAWEIIDSDK]SignInTaskApiCall", "report: api=hwid.silentSignInversion=60400302", true);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 1;
    }
}
