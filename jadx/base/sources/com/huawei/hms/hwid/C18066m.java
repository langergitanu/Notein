package com.huawei.hms.hwid;

import android.text.TextUtils;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.account.request.AccountAuthParams;
import com.huawei.hms.support.account.result.AccountAuthResult;
import com.huawei.hms.support.account.result.AuthAccount;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import o0O00OOO.C25834OooO0oO;
import org.json.JSONException;

/* JADX INFO: renamed from: com.huawei.hms.hwid.m */
/* JADX INFO: loaded from: classes8.dex */
public class C18066m extends TaskApiCall<C18055c, AuthAccount> {
    public C18066m(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void doExecute(C18055c c18055c, ResponseErrorCode responseErrorCode, String str, C25834OooO0oO<AuthAccount> c25834OooO0oO) {
        AuthAccount account;
        AccountAuthResult accountAuthResultFromJson;
        C18053as.m77659b("[AccountSDK]AccountSignInTaskApiCall", "ResponseErrorCode.status:" + String.valueOf(responseErrorCode.getErrorCode()), true);
        int errorCode = responseErrorCode.getErrorCode();
        if (TextUtils.isEmpty(str)) {
            C18053as.m77659b("[AccountSDK]AccountSignInTaskApiCall", "signIn complete, response is null, failed", true);
            c25834OooO0oO.OooO00o(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        } else {
            if ("{}".equals(str)) {
                C18053as.m77659b("[AccountSDK]AccountSignInTaskApiCall", "signIn complete, body is null", true);
                c25834OooO0oO.OooO00o(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
                return;
            }
            try {
                accountAuthResultFromJson = new AccountAuthResult().fromJson(str);
                errorCode = accountAuthResultFromJson.getStatus().getStatusCode();
            } catch (JSONException unused) {
                account = null;
            }
            if (accountAuthResultFromJson.isSuccess()) {
                C18053as.m77659b("[AccountSDK]AccountSignInTaskApiCall", "signIn success", true);
                new C18057e(c18055c.getContext()).m77665a();
                account = accountAuthResultFromJson.getAccount();
                try {
                    c25834OooO0oO.OooO0O0(accountAuthResultFromJson.getAccount());
                } catch (JSONException unused2) {
                    C18053as.m77660c("[AccountSDK]AccountSignInTaskApiCall", "signIn complete, but parser json exception", true);
                    Status status = new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason());
                    C18049ao.m77646a(responseErrorCode, status);
                    c25834OooO0oO.OooO00o(new ApiException(status));
                }
                C18059g.m77675a().m77677a(account, (AccountAuthParams) null);
                if (c18055c == null) {
                    HiAnalyticsClient.reportExit(c18055c.getContext(), getUri(), getTransactionId(), C18052ar.m77657a(errorCode), errorCode);
                    return;
                }
                return;
            }
            C18053as.m77659b("[AccountSDK]AccountSignInTaskApiCall", "signIn failed", true);
            Status status2 = accountAuthResultFromJson.getStatus();
            C18049ao.m77646a(responseErrorCode, status2);
            c25834OooO0oO.OooO00o(new ApiException(status2));
        }
        account = null;
        C18059g.m77675a().m77677a(account, (AccountAuthParams) null);
        if (c18055c == null) {
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 1;
    }
}
