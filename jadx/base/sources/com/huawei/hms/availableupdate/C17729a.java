package com.huawei.hms.availableupdate;

import android.app.Activity;
import com.huawei.hms.support.log.HMSLog;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.huawei.hms.availableupdate.a */
/* JADX INFO: loaded from: classes6.dex */
public class C17729a {

    /* JADX INFO: renamed from: b */
    public static final C17729a f52477b = new C17729a();

    /* JADX INFO: renamed from: a */
    public WeakReference<Activity> f52478a;

    /* JADX WARN: Type inference failed for: r0v1, types: [android.app.Activity, java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v3, types: [void] */
    /* JADX INFO: renamed from: a */
    public boolean m75813a(Activity activity) {
        HMSLog.m80174i("UpdateAdapterMgr", "onActivityCreate");
        ?? M75812a = m75812a();
        if (M75812a == 0 || M75812a.printStackTrace() != 0) {
            this.f52478a = new WeakReference<>(activity);
            return true;
        }
        activity.finish();
        HMSLog.m80174i("UpdateAdapterMgr", "finish one");
        return false;
    }

    /* JADX INFO: renamed from: b */
    public void m75814b(Activity activity) {
        HMSLog.m80174i("UpdateAdapterMgr", "onActivityDestroy");
        Activity activityM75812a = m75812a();
        if (activity == null || !activity.equals(activityM75812a)) {
            return;
        }
        HMSLog.m80174i("UpdateAdapterMgr", "reset");
        this.f52478a = null;
    }

    /* JADX INFO: renamed from: a */
    public final Activity m75812a() {
        WeakReference<Activity> weakReference = this.f52478a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
