package com.google.firebase.inappmessaging.internal.injection.modules;

import android.app.Application;
import com.google.firebase.inappmessaging.dagger.Module;
import com.google.firebase.inappmessaging.dagger.Provides;
import com.google.firebase.inappmessaging.internal.ForegroundNotifier;
import com.google.firebase.inappmessaging.internal.injection.qualifiers.AppForeground;
import oO00o0oO.C32389OooO0Oo;
import oO0OOoOO.AbstractC33127OooO00o;

/* JADX INFO: loaded from: classes8.dex */
@Module
public class ForegroundFlowableModule {
    @Provides
    @AppForeground
    public AbstractC33127OooO00o<String> providesAppForegroundEventStream(Application application) {
        ForegroundNotifier foregroundNotifier = new ForegroundNotifier();
        AbstractC33127OooO00o<String> abstractC33127OooO00oForegroundFlowable = foregroundNotifier.foregroundFlowable();
        abstractC33127OooO00oForegroundFlowable.OooO0o0(new C32389OooO0Oo());
        application.registerActivityLifecycleCallbacks(foregroundNotifier);
        return abstractC33127OooO00oForegroundFlowable;
    }
}
