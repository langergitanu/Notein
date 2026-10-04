package com.huawei.hms.adapter.p574ui;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.datastore.preferences.protobuf.C21791OooO0o0;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.availableupdate.C17729a;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.kpms.KpmsConstant;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
public class UpdateAdapter implements IBridgeActivityDelegate {

    /* JADX INFO: renamed from: a */
    public WeakReference<Activity> f52393a;

    /* JADX INFO: renamed from: b */
    public int f52394b;

    /* JADX INFO: renamed from: c */
    public boolean f52395c = false;

    /* JADX INFO: renamed from: a */
    public final boolean m75746a(Intent intent, Activity activity) {
        if (!intent.getBooleanExtra(CommonCode.MapKey.NEW_UPDATE, false)) {
            return false;
        }
        HMSLog.m80174i("UpdateAdapter", "4.0 framework HMSCore upgrade process");
        String hMSPackageName = HMSPackageManager.getInstance(activity.getApplicationContext()).getHMSPackageName();
        ComponentName componentName = new ComponentName(hMSPackageName, "com.huawei.hms.fwksdk.stub.UpdateStubActivity");
        Intent intent2 = new Intent();
        intent2.putExtra(KpmsConstant.CALLER_PACKAGE_NAME, activity.getApplicationContext().getPackageName());
        intent2.putExtra(KpmsConstant.UPDATE_PACKAGE_NAME, hMSPackageName);
        intent2.setComponent(componentName);
        activity.startActivityForResult(intent2, 1001);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final Activity m75747b() {
        WeakReference<Activity> weakReference = this.f52393a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: renamed from: c */
    public final void m75748c() {
        SystemManager.getInstance().notifyUpdateResult(8);
        m75743a();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 1001;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        if (activity == null) {
            HMSLog.m80174i("UpdateAdapter", "activity == null");
            m75748c();
            return;
        }
        activity.getApplicationContext();
        this.f52393a = new WeakReference<>(activity);
        if (C17729a.f52477b.m75813a(m75747b())) {
            Intent intent = activity.getIntent();
            if (intent == null) {
                m75748c();
                return;
            }
            int intExtra = intent.getIntExtra(CommonCode.MapKey.UPDATE_VERSION, 0);
            this.f52394b = intExtra;
            if (intExtra == 0) {
                m75748c();
                return;
            }
            if (intent.hasExtra("installHMS")) {
                this.f52395c = true;
            }
            m75746a(intent, activity);
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.m80174i("UpdateAdapter", "onBridgeActivityDestroy");
        C17729a.f52477b.m75814b(m75747b());
        this.f52393a = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        if (i != getRequestCode()) {
            return false;
        }
        C21791OooO0o0.OooO0OO(i2, "onBridgeActivityResult ", "UpdateAdapter");
        if (i2 == -1) {
            if (intent != null) {
                if (intent.getIntExtra(KpmsConstant.KIT_UPDATE_RESULT, 0) == 1) {
                    HMSLog.m80174i("UpdateAdapter", "new framework update process,Error resolved successfully!");
                    SystemManager.getInstance().notifyUpdateResult(0);
                    m75743a();
                    return true;
                }
                m75744a(intent);
            }
        } else if (i2 == 0) {
            HMSLog.m80174i("UpdateAdapter", "Activity.RESULT_CANCELED");
            Activity activityM75747b = m75747b();
            if (activityM75747b == null) {
                return true;
            }
            String hMSPackageName = HMSPackageManager.getInstance(activityM75747b.getApplicationContext()).getHMSPackageName();
            if (this.f52395c || m75745a(activityM75747b, hMSPackageName, this.f52394b)) {
                HMSLog.m80174i("UpdateAdapter", "Resolve error, process canceled by user clicking back button!");
                SystemManager.getInstance().notifyUpdateResult(13);
            } else {
                SystemManager.getInstance().notifyUpdateResult(0);
            }
        } else if (i2 == 1) {
            SystemManager.getInstance().notifyUpdateResult(28);
        }
        m75743a();
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        HMSLog.m80174i("UpdateAdapter", "onBridgeConfigurationChanged");
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
        HMSLog.m80174i("UpdateAdapter", "On key up when resolve conn error");
    }

    /* JADX INFO: renamed from: a */
    public final void m75744a(Intent intent) {
        int intExtra = intent.getIntExtra(BridgeActivity.EXTRA_RESULT, -1);
        if (intExtra == 0) {
            HMSLog.m80174i("UpdateAdapter", "Error resolved successfully!");
            SystemManager.getInstance().notifyUpdateResult(0);
        } else if (intExtra == 13) {
            HMSLog.m80174i("UpdateAdapter", "Resolve error process canceled by user!");
            SystemManager.getInstance().notifyUpdateResult(13);
        } else if (intExtra == 8) {
            HMSLog.m80174i("UpdateAdapter", "Internal error occurred, recommended retry.");
            SystemManager.getInstance().notifyUpdateResult(8);
        } else {
            HMSLog.m80174i("UpdateAdapter", "Other error codes.");
            SystemManager.getInstance().notifyUpdateResult(intExtra);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m75743a() {
        Activity activityM75747b = m75747b();
        if (activityM75747b == null || activityM75747b.isFinishing()) {
            return;
        }
        activityM75747b.finish();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m75745a(Context context, String str, int i) {
        if (context != null && !TextUtils.isEmpty(str) && i != 0) {
            PackageManagerHelper packageManagerHelper = new PackageManagerHelper(context);
            if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(packageManagerHelper.getPackageStates(str)) || packageManagerHelper.getPackageVersionCode(str) < i) {
                return true;
            }
        }
        return false;
    }
}
