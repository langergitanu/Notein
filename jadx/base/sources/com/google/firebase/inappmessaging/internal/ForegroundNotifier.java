package com.google.firebase.inappmessaging.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import o0Oo0oOo.o00Oo0;
import oO0OOOOo.C32977OooOOo;
import oO0OOoOO.AbstractC33127OooO00o;
import oO0OooOO.AbstractC33491OooO0o0;
import ooOOOOoO.C35058OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public class ForegroundNotifier implements Application.ActivityLifecycleCallbacks {
    public static final long DELAY_MILLIS = 1000;
    private Runnable check;
    private final Handler handler = new Handler();
    private boolean foreground = false;
    private boolean paused = true;
    private final C35058OooO00o<String> foregroundSubject = new C35058OooO00o<>();

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onActivityPaused$0() {
        boolean z = this.foreground;
        this.foreground = !(z && this.paused) && z;
    }

    public AbstractC33127OooO00o<String> foregroundFlowable() {
        C35058OooO00o<String> c35058OooO00o = this.foregroundSubject;
        c35058OooO00o.getClass();
        oO0OOOOo.OooOOO oooOOO = new oO0OOOOo.OooOOO(c35058OooO00o);
        int i = AbstractC33491OooO0o0.f120996OooOo0o;
        o00Oo0.OooO0O0(i, "bufferSize");
        return new C32977OooOOo(oooOOO, i).OooO0O0();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.paused = true;
        Runnable runnable = this.check;
        if (runnable != null) {
            this.handler.removeCallbacks(runnable);
        }
        Handler handler = this.handler;
        OooOOOO oooOOOO = new OooOOOO(this, 0);
        this.check = oooOOOO;
        handler.postDelayed(oooOOOO, 1000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.paused = false;
        boolean z = this.foreground;
        this.foreground = true;
        Runnable runnable = this.check;
        if (runnable != null) {
            this.handler.removeCallbacks(runnable);
        }
        if (z) {
            return;
        }
        Logging.logi("went foreground");
        this.foregroundSubject.onNext(InAppMessageStreamManager.ON_FOREGROUND);
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
