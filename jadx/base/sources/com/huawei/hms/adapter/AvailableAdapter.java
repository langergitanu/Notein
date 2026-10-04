package com.huawei.hms.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.p574ui.NotInstalledHmsAdapter;
import com.huawei.hms.adapter.p574ui.UpdateAdapter;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.adapter.sysobs.SystemObserver;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.note.AppSpoofResolution;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.UIUtil;

/* JADX INFO: loaded from: classes5.dex */
public class AvailableAdapter {

    /* JADX INFO: renamed from: a */
    public final int f52372a;

    /* JADX INFO: renamed from: b */
    public AvailableCallBack f52373b;

    /* JADX INFO: renamed from: d */
    public SystemObserver f52375d = new C17707a();

    /* JADX INFO: renamed from: c */
    public boolean f52374c = false;

    public interface AvailableCallBack {
        void onComplete(int i);
    }

    /* JADX INFO: renamed from: com.huawei.hms.adapter.AvailableAdapter$a */
    public class C17707a implements SystemObserver {
        public C17707a() {
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onNoticeResult(int i) {
            AvailableCallBack availableCallBackM75735a = AvailableAdapter.this.m75735a();
            if (availableCallBackM75735a == null) {
                HMSLog.m80172e("AvailableAdapter", "onNoticeResult baseCallBack null");
                return true;
            }
            availableCallBackM75735a.onComplete(i);
            return true;
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onSolutionResult(Intent intent, String str) {
            return false;
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onUpdateResult(int i) {
            AvailableCallBack availableCallBackM75735a = AvailableAdapter.this.m75735a();
            if (availableCallBackM75735a == null) {
                HMSLog.m80172e("AvailableAdapter", "onUpdateResult baseCallBack null");
                return true;
            }
            availableCallBackM75735a.onComplete(i);
            return true;
        }
    }

    public AvailableAdapter(int i) {
        this.f52372a = i;
    }

    public int checkHuaweiMobileServicesForUpdate(Context context) {
        Checker.checkNonNull(context, "context must not be null.");
        int iM75734a = m75734a(context);
        if (iM75734a != 0 || !HMSPackageManager.getInstance(context).isApkNeedUpdate(this.f52372a)) {
            return iM75734a;
        }
        HMSLog.m80174i("AvailableAdapter", "The current version does not meet the target version requirements");
        return 2;
    }

    public int isHuaweiMobileServicesAvailable(Context context) {
        Checker.checkNonNull(context, "context must not be null.");
        int iM75734a = m75734a(context);
        if (iM75734a != 0 || !HMSPackageManager.getInstance(context).isApkUpdateNecessary(this.f52372a)) {
            return iM75734a;
        }
        HMSLog.m80174i("AvailableAdapter", "The current version does not meet the minimum version requirements");
        return 2;
    }

    public boolean isUserNoticeError(int i) {
        return i == 29;
    }

    public boolean isUserResolvableError(int i) {
        return i == 1 || i == 2;
    }

    public void setCalledBySolutionInstallHms(boolean z) {
        this.f52374c = z;
    }

    public void startNotice(Activity activity, AvailableCallBack availableCallBack) {
        if (activity == null || availableCallBack == null) {
            return;
        }
        if (UIUtil.isBackground(activity)) {
            HMSLog.m80174i("AvailableAdapter", "current app is in Background");
            availableCallBack.onComplete(28);
        } else {
            HMSLog.m80174i("AvailableAdapter", "startNotice");
            this.f52373b = availableCallBack;
            SystemManager.getSystemNotifier().registerObserver(this.f52375d);
            activity.startActivity(BridgeActivity.getIntentStartBridgeActivity(activity, AppSpoofResolution.class.getName()));
        }
    }

    public void startResolution(Activity activity, AvailableCallBack availableCallBack) {
        if (activity == null || availableCallBack == null) {
            return;
        }
        if (UIUtil.isBackground(activity)) {
            HMSLog.m80174i("AvailableAdapter", "current app is in Background");
            availableCallBack.onComplete(28);
            return;
        }
        if (!m75737a(activity)) {
            m75736a(activity, availableCallBack);
            return;
        }
        HMSLog.m80174i("AvailableAdapter", "startResolution");
        this.f52373b = availableCallBack;
        SystemManager.getSystemNotifier().registerObserver(this.f52375d);
        Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(activity, UpdateAdapter.class.getName());
        intentStartBridgeActivity.putExtra(CommonCode.MapKey.UPDATE_VERSION, this.f52372a);
        if (this.f52374c) {
            intentStartBridgeActivity.putExtra("installHMS", "installHMS");
        }
        intentStartBridgeActivity.putExtra(CommonCode.MapKey.NEW_UPDATE, true);
        activity.startActivity(intentStartBridgeActivity);
    }

    /* JADX INFO: renamed from: a */
    public final int m75734a(Context context) {
        PackageManagerHelper.PackageStates hMSPackageStatesForMultiService = HMSPackageManager.getInstance(context).getHMSPackageStatesForMultiService();
        if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(hMSPackageStatesForMultiService)) {
            HMSLog.m80174i("AvailableAdapter", "HMS is not installed");
            return 1;
        }
        if (PackageManagerHelper.PackageStates.SPOOF.equals(hMSPackageStatesForMultiService)) {
            HMSLog.m80174i("AvailableAdapter", "HMS is spoofed");
            return 29;
        }
        if (!PackageManagerHelper.PackageStates.DISABLED.equals(hMSPackageStatesForMultiService)) {
            return 0;
        }
        HMSLog.m80174i("AvailableAdapter", "HMS is disabled");
        return 3;
    }

    /* JADX INFO: renamed from: a */
    public final void m75736a(Activity activity, AvailableCallBack availableCallBack) {
        HMSLog.m80174i("AvailableAdapter", "<showHmsApkNotInstalledDialog> startResolution");
        if (NotInstalledHmsAdapter.getShowLock()) {
            this.f52373b = availableCallBack;
            SystemManager.getSystemNotifier().registerObserver(this.f52375d);
            activity.startActivity(BridgeActivity.getIntentStartBridgeActivity(activity, NotInstalledHmsAdapter.class.getName()));
            return;
        }
        availableCallBack.onComplete(31);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m75737a(Activity activity) {
        if (HMSPackageManager.getInstance(activity).getHmsVersionCode() < 40000000) {
            return false;
        }
        HMSLog.m80174i("AvailableAdapter", "enter 4.0 HmsCore upgrade process");
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final AvailableCallBack m75735a() {
        return this.f52373b;
    }
}
