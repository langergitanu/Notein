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

/* JADX INFO: renamed from: com.huawei.hms.hwid.ae */
/* JADX INFO: loaded from: classes8.dex */
public class C18039ae extends TaskApiCall<C18074u, Intent> {
    public C18039ae(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(C18074u c18074u, ResponseErrorCode responseErrorCode, String str, C25834OooO0oO<Intent> c25834OooO0oO) {
        if (responseErrorCode.getStatusCode() == 0 && responseErrorCode.getErrorCode() == 0) {
            C18053as.m77659b("NoticeTaskApiCall", "Jos Notice onResult success.", true);
            m77613a(responseErrorCode.getParcelable(), c18074u, responseErrorCode, c25834OooO0oO);
        } else {
            C18053as.m77660c("NoticeTaskApiCall", "Jos Notice onResult failed, ErrCode" + responseErrorCode.getErrorCode(), true);
        }
        if (c18074u != null) {
            HiAnalyticsClient.reportExit(c18074u.getContext(), getUri(), getTransactionId(), responseErrorCode.getStatusCode(), responseErrorCode.getErrorCode());
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 1;
    }

    /* JADX INFO: renamed from: a */
    private void m77613a(Parcelable parcelable, C18074u c18074u, ResponseErrorCode responseErrorCode, C25834OooO0oO<Intent> c25834OooO0oO) {
        Activity currentActivity = ActivityMgr.INST.getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing() || currentActivity.isDestroyed()) {
            C18053as.m77659b("NoticeTaskApiCall", "launchNoticeActivity failed, activity is invalid", true);
            return;
        }
        if (parcelable instanceof Intent) {
            try {
                currentActivity.startActivity((Intent) parcelable);
            } catch (Exception unused) {
                C18053as.m77661d("NoticeTaskApiCall", "Jos Notice startActivity meet exception", true);
            }
        } else if (parcelable instanceof PendingIntent) {
            PendingIntent pendingIntent = (PendingIntent) parcelable;
            try {
                if (UIUtil.isBackground(c18074u.getContext())) {
                    C18053as.m77659b("NoticeTaskApiCall", "ui isBackground.", true);
                    c25834OooO0oO.OooO00o(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason(), pendingIntent)));
                } else {
                    currentActivity.startIntentSender(pendingIntent.getIntentSender(), null, 0, 0, 0);
                }
            } catch (IntentSender.SendIntentException unused2) {
                C18053as.m77661d("NoticeTaskApiCall", "Jos Notice startIntentSender meet exception", true);
            }
        }
    }
}
