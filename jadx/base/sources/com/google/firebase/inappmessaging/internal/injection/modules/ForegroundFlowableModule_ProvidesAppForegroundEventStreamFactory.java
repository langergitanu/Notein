package com.google.firebase.inappmessaging.internal.injection.modules;

import android.app.Application;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import oO00ooO0.InterfaceC32462OooO00o;
import oO0OOoOO.AbstractC33127OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class ForegroundFlowableModule_ProvidesAppForegroundEventStreamFactory implements Factory<AbstractC33127OooO00o<String>> {
    private final InterfaceC32462OooO00o<Application> applicationProvider;
    private final ForegroundFlowableModule module;

    public ForegroundFlowableModule_ProvidesAppForegroundEventStreamFactory(ForegroundFlowableModule foregroundFlowableModule, InterfaceC32462OooO00o<Application> interfaceC32462OooO00o) {
        this.module = foregroundFlowableModule;
        this.applicationProvider = interfaceC32462OooO00o;
    }

    public static ForegroundFlowableModule_ProvidesAppForegroundEventStreamFactory create(ForegroundFlowableModule foregroundFlowableModule, InterfaceC32462OooO00o<Application> interfaceC32462OooO00o) {
        return new ForegroundFlowableModule_ProvidesAppForegroundEventStreamFactory(foregroundFlowableModule, interfaceC32462OooO00o);
    }

    public static AbstractC33127OooO00o<String> providesAppForegroundEventStream(ForegroundFlowableModule foregroundFlowableModule, Application application) {
        return (AbstractC33127OooO00o) Preconditions.checkNotNullFromProvides(foregroundFlowableModule.providesAppForegroundEventStream(application));
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public AbstractC33127OooO00o<String> get() {
        return providesAppForegroundEventStream(this.module, this.applicationProvider.get());
    }
}
