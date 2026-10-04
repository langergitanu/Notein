package com.huawei.hms.hwid;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcelable;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.common.ActivityMgr;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.utils.UIUtil;
import o0O00OOO.C25834OooO0oO;

/* JADX INFO: renamed from: com.huawei.hms.hwid.k */
/* JADX INFO: loaded from: classes8.dex */
public class C18064k extends TaskApiCall<C18055c, Intent> {
    public C18064k(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(C18055c c18055c, ResponseErrorCode responseErrorCode, String str, C25834OooO0oO<Intent> c25834OooO0oO) {
        if (responseErrorCode.getStatusCode() == 0 && responseErrorCode.getErrorCode() == 0) {
            C18053as.m77659b("AccountNoticeTaskApiCall", "Jos Notice onResult success.", true);
            m77694a(responseErrorCode.getParcelable(), c18055c, responseErrorCode, c25834OooO0oO);
        } else {
            C18053as.m77660c("AccountNoticeTaskApiCall", "Jos Notice onResult failed:" + responseErrorCode.getErrorCode() + ",ErrReason:" + responseErrorCode.getErrorReason(), true);
        }
        if (c18055c != null) {
            HiAnalyticsClient.reportExit(c18055c.getContext(), getUri(), getTransactionId(), responseErrorCode.getStatusCode(), responseErrorCode.getErrorCode());
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 1;
    }

    /* JADX INFO: renamed from: a */
    private void m77694a(Parcelable parcelable, C18055c c18055c, ResponseErrorCode responseErrorCode, C25834OooO0oO<Intent> c25834OooO0oO) {
        Activity currentActivity = ActivityMgr.INST.getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing() || currentActivity.isDestroyed()) {
            C18053as.m77659b("AccountNoticeTaskApiCall", "launchNoticeActivity failed, launchActivity is invalid", true);
            return;
        }
        if (parcelable instanceof Intent) {
            try {
                currentActivity.startActivity((Intent) parcelable);
            } catch (Exception unused) {
                C18053as.m77661d("AccountNoticeTaskApiCall", "Jos Notice startActivity meet exception", true);
            }
        } else if (parcelable instanceof PendingIntent) {
            PendingIntent pendingIntent = (PendingIntent) parcelable;
            try {
                if (UIUtil.isBackground(c18055c.getContext())) {
                    C18053as.m77659b("AccountNoticeTaskApiCall", "ui isBackground.", true);
                    c25834OooO0oO.OooO00o(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason(), pendingIntent)));
                } else {
                    currentActivity.startIntentSender(pendingIntent.getIntentSender(), null, 0, 0, 0);
                }
            } catch (IntentSender.SendIntentException unused2) {
                C18053as.m77661d("AccountNoticeTaskApiCall", "Jos Notice startIntentSender meet exception", true);
            }
        }
    }
}
