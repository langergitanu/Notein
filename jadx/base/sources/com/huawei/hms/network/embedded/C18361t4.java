package com.huawei.hms.network.embedded;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.framework.common.ContextHolder;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.t4 */
/* JADX INFO: loaded from: classes9.dex */
public class C18361t4 {

    /* JADX INFO: renamed from: b */
    public static final String f56218b = "activity";

    /* JADX INFO: renamed from: a */
    public Application.ActivityLifecycleCallbacks f56219a;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.t4$a */
    public class a implements Application.ActivityLifecycleCallbacks {
        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C18143d5.reportSysEvent(Long.valueOf(System.currentTimeMillis()), C18361t4.f56218b, activity.getComponentName().getClassName() + "_onCreate");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            C18143d5.reportSysEvent(Long.valueOf(System.currentTimeMillis()), C18361t4.f56218b, activity.getComponentName().getClassName() + "_onDestroyed");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.t4$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static C18361t4 f56221a = new C18361t4(null);
    }

    public C18361t4() {
    }

    public static C18361t4 getInstance() {
        return b.f56221a;
    }

    public void init() {
        Context appContext = ContextHolder.getAppContext();
        if (appContext instanceof Application) {
            a aVar = new a();
            this.f56219a = aVar;
            ((Application) appContext).registerActivityLifecycleCallbacks(aVar);
        }
    }

    public /* synthetic */ C18361t4(a aVar) {
        this();
    }
}
