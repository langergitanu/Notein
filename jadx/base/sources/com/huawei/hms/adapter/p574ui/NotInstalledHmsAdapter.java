package com.huawei.hms.adapter.p574ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.p589ui.NotInstalledHmsDialogHelper;

/* JADX INFO: loaded from: classes5.dex */
public class NotInstalledHmsAdapter implements IBridgeActivityDelegate {

    /* JADX INFO: renamed from: c */
    public static final Object f52387c = new Object();

    /* JADX INFO: renamed from: d */
    public static boolean f52388d;

    /* JADX INFO: renamed from: a */
    public Activity f52389a;

    /* JADX INFO: renamed from: b */
    public Dialog f52390b;

    /* JADX INFO: renamed from: com.huawei.hms.adapter.ui.NotInstalledHmsAdapter$a */
    public static class DialogInterfaceOnCancelListenerC17713a implements DialogInterface.OnCancelListener {

        /* JADX INFO: renamed from: a */
        public final Activity f52391a;

        public DialogInterfaceOnCancelListenerC17713a(Activity activity) {
            this.f52391a = activity;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            HMSLog.m80174i("NotInstalledHmsAdapter", "<Dialog onCancel>");
            SystemManager.getInstance().notifyUpdateResult(13);
            this.f52391a.finish();
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.adapter.ui.NotInstalledHmsAdapter$b */
    public static class DialogInterfaceOnClickListenerC17714b implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final Activity f52392a;

        public DialogInterfaceOnClickListenerC17714b(Activity activity) {
            this.f52392a = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            HMSLog.m80174i("NotInstalledHmsAdapter", "<Dialog onClick>");
            SystemManager.getInstance().notifyUpdateResult(30);
            this.f52392a.finish();
        }
    }

    public static boolean getShowLock() {
        synchronized (f52387c) {
            try {
                HMSLog.m80174i("NotInstalledHmsAdapter", "<canShowDialog> sIsShowingDialog: " + f52388d);
                if (f52388d) {
                    return false;
                }
                f52388d = true;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m75742a(Activity activity) {
        Dialog dialog = this.f52390b;
        if (dialog != null && dialog.isShowing()) {
            this.f52390b.setOnCancelListener(null);
            this.f52390b.cancel();
        }
        this.f52390b = NotInstalledHmsDialogHelper.getDialogBuilder(activity).setPositiveButton(NotInstalledHmsDialogHelper.getConfirmResId(activity), new DialogInterfaceOnClickListenerC17714b(activity)).setOnCancelListener(new DialogInterfaceOnCancelListenerC17713a(activity)).show();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        HMSLog.m80174i("NotInstalledHmsAdapter", "<getRequestCode>");
        return 0;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        HMSLog.m80174i("NotInstalledHmsAdapter", "<onBridgeActivityCreate>");
        if (activity == null || activity.isFinishing()) {
            HMSLog.m80172e("NotInstalledHmsAdapter", "<onBridgeActivityCreate> activity is null or finishing");
        } else {
            this.f52389a = activity;
            m75742a(activity);
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.m80174i("NotInstalledHmsAdapter", "<onBridgeActivityDestroy>");
        synchronized (f52387c) {
            f52388d = false;
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        HMSLog.m80174i("NotInstalledHmsAdapter", "<onBridgeActivityResult>");
        return false;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        HMSLog.m80174i("NotInstalledHmsAdapter", "<onBridgeConfigurationChanged>");
        Activity activity = this.f52389a;
        if (activity == null || activity.isFinishing()) {
            HMSLog.m80172e("NotInstalledHmsAdapter", "<onBridgeConfigurationChanged> mActivity is null or finishing");
        } else {
            m75742a(this.f52389a);
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
        HMSLog.m80174i("NotInstalledHmsAdapter", "<onKeyUp>");
    }
}
