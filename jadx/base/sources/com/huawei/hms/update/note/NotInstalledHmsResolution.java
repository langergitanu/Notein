package com.huawei.hms.update.note;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.availableupdate.C17731c;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.p589ui.NotInstalledHmsDialogHelper;

/* JADX INFO: loaded from: classes9.dex */
public class NotInstalledHmsResolution implements IBridgeActivityDelegate {

    /* JADX INFO: renamed from: a */
    public Dialog f56984a;

    /* JADX INFO: renamed from: b */
    public Activity f56985b;

    /* JADX INFO: renamed from: com.huawei.hms.update.note.NotInstalledHmsResolution$a */
    public static class DialogInterfaceOnClickListenerC18495a implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final Activity f56986a;

        public DialogInterfaceOnClickListenerC18495a(Activity activity) {
            this.f56986a = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            HMSLog.m80174i("NotInstalledHmsResolution", "<Dialog onClick>");
            this.f56986a.finish();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m80183a(Activity activity) {
        m80182a();
        this.f56984a = NotInstalledHmsDialogHelper.getDialogBuilder(activity).setPositiveButton(NotInstalledHmsDialogHelper.getConfirmResId(activity), new DialogInterfaceOnClickListenerC18495a(activity)).show();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        HMSLog.m80174i("NotInstalledHmsResolution", "<Resolution getRequestCode>");
        return 0;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        HMSLog.m80174i("NotInstalledHmsResolution", "<Resolution onBridgeActivityCreate>");
        if (activity == null || activity.isFinishing()) {
            HMSLog.m80172e("NotInstalledHmsResolution", "<Resolution onBridgeActivityCreate> activity is null or finishing");
            return;
        }
        this.f56985b = activity;
        C17731c.f52483b.m75819a(activity);
        m80183a(activity);
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.m80174i("NotInstalledHmsResolution", "<Resolution onBridgeActivityDestroy>");
        m80182a();
        C17731c.f52483b.m75820b(this.f56985b);
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        HMSLog.m80174i("NotInstalledHmsResolution", "<Resolution onBridgeActivityResult>");
        return false;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        HMSLog.m80174i("NotInstalledHmsResolution", "<Resolution onBridgeConfigurationChanged>");
        Activity activity = this.f56985b;
        if (activity == null || activity.isFinishing()) {
            HMSLog.m80172e("NotInstalledHmsResolution", "<Resolution onBridgeActivityCreate> mActivity is null or finishing");
        } else {
            m80183a(this.f56985b);
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
        HMSLog.m80174i("NotInstalledHmsResolution", "<Resolution onKeyUp>");
    }

    /* JADX INFO: renamed from: a */
    public final void m80182a() {
        Dialog dialog = this.f56984a;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.f56984a.cancel();
    }
}
