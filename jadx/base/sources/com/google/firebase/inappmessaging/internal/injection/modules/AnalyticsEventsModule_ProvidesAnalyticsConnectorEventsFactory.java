package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.internal.AnalyticsEventsManager;
import oO00ooO0.InterfaceC32462OooO00o;
import oO0OOoOO.AbstractC33127OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class AnalyticsEventsModule_ProvidesAnalyticsConnectorEventsFactory implements Factory<AbstractC33127OooO00o<String>> {
    private final InterfaceC32462OooO00o<AnalyticsEventsManager> analyticsEventsManagerProvider;
    private final AnalyticsEventsModule module;

    public AnalyticsEventsModule_ProvidesAnalyticsConnectorEventsFactory(AnalyticsEventsModule analyticsEventsModule, InterfaceC32462OooO00o<AnalyticsEventsManager> interfaceC32462OooO00o) {
        this.module = analyticsEventsModule;
        this.analyticsEventsManagerProvider = interfaceC32462OooO00o;
    }

    public static AnalyticsEventsModule_ProvidesAnalyticsConnectorEventsFactory create(AnalyticsEventsModule analyticsEventsModule, InterfaceC32462OooO00o<AnalyticsEventsManager> interfaceC32462OooO00o) {
        return new AnalyticsEventsModule_ProvidesAnalyticsConnectorEventsFactory(analyticsEventsModule, interfaceC32462OooO00o);
    }

    public static AbstractC33127OooO00o<String> providesAnalyticsConnectorEvents(AnalyticsEventsModule analyticsEventsModule, AnalyticsEventsManager analyticsEventsManager) {
        return (AbstractC33127OooO00o) Preconditions.checkNotNullFromProvides(analyticsEventsModule.providesAnalyticsConnectorEvents(analyticsEventsManager));
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public AbstractC33127OooO00o<String> get() {
        return providesAnalyticsConnectorEvents(this.module, this.analyticsEventsManagerProvider.get());
    }
}
