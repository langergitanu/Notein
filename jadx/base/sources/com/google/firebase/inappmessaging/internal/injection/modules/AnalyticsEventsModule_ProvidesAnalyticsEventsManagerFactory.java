package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.internal.AnalyticsEventsManager;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class AnalyticsEventsModule_ProvidesAnalyticsEventsManagerFactory implements Factory<AnalyticsEventsManager> {
    private final InterfaceC32462OooO00o<AnalyticsConnector> analyticsConnectorProvider;
    private final AnalyticsEventsModule module;

    public AnalyticsEventsModule_ProvidesAnalyticsEventsManagerFactory(AnalyticsEventsModule analyticsEventsModule, InterfaceC32462OooO00o<AnalyticsConnector> interfaceC32462OooO00o) {
        this.module = analyticsEventsModule;
        this.analyticsConnectorProvider = interfaceC32462OooO00o;
    }

    public static AnalyticsEventsModule_ProvidesAnalyticsEventsManagerFactory create(AnalyticsEventsModule analyticsEventsModule, InterfaceC32462OooO00o<AnalyticsConnector> interfaceC32462OooO00o) {
        return new AnalyticsEventsModule_ProvidesAnalyticsEventsManagerFactory(analyticsEventsModule, interfaceC32462OooO00o);
    }

    public static AnalyticsEventsManager providesAnalyticsEventsManager(AnalyticsEventsModule analyticsEventsModule, AnalyticsConnector analyticsConnector) {
        return (AnalyticsEventsManager) Preconditions.checkNotNullFromProvides(analyticsEventsModule.providesAnalyticsEventsManager(analyticsConnector));
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public AnalyticsEventsManager get() {
        return providesAnalyticsEventsManager(this.module, this.analyticsConnectorProvider.get());
    }
}
