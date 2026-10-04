package com.huawei.hms.support.common;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.huawei.hms.network.embedded.C18374u4;
import com.huawei.hms.support.log.HMSLog;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes9.dex */
public final class ActivityMgr implements Application.ActivityLifecycleCallbacks {
    public static final ActivityMgr INST = new ActivityMgr();

    /* JADX INFO: renamed from: a */
    public WeakReference<Activity> f56927a;

    /* JADX INFO: renamed from: a */
    public static String m80112a(Object obj) {
        if (obj == null) {
            return CloudMetaExtra.DEFINE_NON_PARENT_ID;
        }
        return obj.getClass().getName() + '@' + Integer.toHexString(obj.hashCode());
    }

    public Activity getCurrentActivity() {
        if (this.f56927a == null) {
            HMSLog.m80174i("ActivityMgr", "mCurrentActivity is " + this.f56927a);
            return null;
        }
        HMSLog.m80174i("ActivityMgr", "mCurrentActivity.get() is " + this.f56927a.get());
        return this.f56927a.get();
    }

    public void init(Application application) {
        HMSLog.m80169d("ActivityMgr", C18374u4.f56270c);
        if (application == null) {
            HMSLog.m80175w("ActivityMgr", "init failed for app is null");
            return;
        }
        ActivityMgr activityMgr = INST;
        application.unregisterActivityLifecycleCallbacks(activityMgr);
        application.registerActivityLifecycleCallbacks(activityMgr);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        HMSLog.m80169d("ActivityMgr", "onCreated:" + m80112a(activity));
        this.f56927a = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        HMSLog.m80169d("ActivityMgr", "onResumed:" + m80112a(activity));
        this.f56927a = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        HMSLog.m80169d("ActivityMgr", "onStarted:" + m80112a(activity));
        this.f56927a = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
