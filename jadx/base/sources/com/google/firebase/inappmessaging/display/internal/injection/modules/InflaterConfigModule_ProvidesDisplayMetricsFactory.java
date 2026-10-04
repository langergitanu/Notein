package com.google.firebase.inappmessaging.display.internal.injection.modules;

import android.app.Application;
import android.util.DisplayMetrics;
import com.google.firebase.inappmessaging.display.dagger.internal.Factory;
import com.google.firebase.inappmessaging.display.dagger.internal.Preconditions;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class InflaterConfigModule_ProvidesDisplayMetricsFactory implements Factory<DisplayMetrics> {
    private final InterfaceC32462OooO00o<Application> applicationProvider;
    private final InflaterConfigModule module;

    public InflaterConfigModule_ProvidesDisplayMetricsFactory(InflaterConfigModule inflaterConfigModule, InterfaceC32462OooO00o<Application> interfaceC32462OooO00o) {
        this.module = inflaterConfigModule;
        this.applicationProvider = interfaceC32462OooO00o;
    }

    public static InflaterConfigModule_ProvidesDisplayMetricsFactory create(InflaterConfigModule inflaterConfigModule, InterfaceC32462OooO00o<Application> interfaceC32462OooO00o) {
        return new InflaterConfigModule_ProvidesDisplayMetricsFactory(inflaterConfigModule, interfaceC32462OooO00o);
    }

    public static DisplayMetrics providesDisplayMetrics(InflaterConfigModule inflaterConfigModule, Application application) {
        return (DisplayMetrics) Preconditions.checkNotNullFromProvides(inflaterConfigModule.providesDisplayMetrics(application));
    }

    @Override // com.google.firebase.inappmessaging.display.dagger.internal.Factory, com.google.firebase.inappmessaging.display.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public DisplayMetrics get() {
        return providesDisplayMetrics(this.module, this.applicationProvider.get());
    }
}
