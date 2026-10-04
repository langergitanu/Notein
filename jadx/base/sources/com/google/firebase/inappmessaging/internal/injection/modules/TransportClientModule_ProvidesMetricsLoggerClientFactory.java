package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.internal.DeveloperListenerManager;
import com.google.firebase.inappmessaging.internal.MetricsLoggerClient;
import com.google.firebase.inappmessaging.internal.time.Clock;
import com.google.firebase.installations.FirebaseInstallationsApi;
import java.util.concurrent.Executor;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class TransportClientModule_ProvidesMetricsLoggerClientFactory implements Factory<MetricsLoggerClient> {
    private final InterfaceC32462OooO00o<AnalyticsConnector> analyticsConnectorProvider;
    private final InterfaceC32462OooO00o<FirebaseApp> appProvider;
    private final InterfaceC32462OooO00o<Executor> blockingExecutorProvider;
    private final InterfaceC32462OooO00o<Clock> clockProvider;
    private final InterfaceC32462OooO00o<DeveloperListenerManager> developerListenerManagerProvider;
    private final InterfaceC32462OooO00o<FirebaseInstallationsApi> firebaseInstallationsProvider;
    private final InterfaceC32462OooO00o<TransportFactory> transportFactoryProvider;

    public TransportClientModule_ProvidesMetricsLoggerClientFactory(InterfaceC32462OooO00o<FirebaseApp> interfaceC32462OooO00o, InterfaceC32462OooO00o<TransportFactory> interfaceC32462OooO00o2, InterfaceC32462OooO00o<AnalyticsConnector> interfaceC32462OooO00o3, InterfaceC32462OooO00o<FirebaseInstallationsApi> interfaceC32462OooO00o4, InterfaceC32462OooO00o<Clock> interfaceC32462OooO00o5, InterfaceC32462OooO00o<DeveloperListenerManager> interfaceC32462OooO00o6, InterfaceC32462OooO00o<Executor> interfaceC32462OooO00o7) {
        this.appProvider = interfaceC32462OooO00o;
        this.transportFactoryProvider = interfaceC32462OooO00o2;
        this.analyticsConnectorProvider = interfaceC32462OooO00o3;
        this.firebaseInstallationsProvider = interfaceC32462OooO00o4;
        this.clockProvider = interfaceC32462OooO00o5;
        this.developerListenerManagerProvider = interfaceC32462OooO00o6;
        this.blockingExecutorProvider = interfaceC32462OooO00o7;
    }

    public static TransportClientModule_ProvidesMetricsLoggerClientFactory create(InterfaceC32462OooO00o<FirebaseApp> interfaceC32462OooO00o, InterfaceC32462OooO00o<TransportFactory> interfaceC32462OooO00o2, InterfaceC32462OooO00o<AnalyticsConnector> interfaceC32462OooO00o3, InterfaceC32462OooO00o<FirebaseInstallationsApi> interfaceC32462OooO00o4, InterfaceC32462OooO00o<Clock> interfaceC32462OooO00o5, InterfaceC32462OooO00o<DeveloperListenerManager> interfaceC32462OooO00o6, InterfaceC32462OooO00o<Executor> interfaceC32462OooO00o7) {
        return new TransportClientModule_ProvidesMetricsLoggerClientFactory(interfaceC32462OooO00o, interfaceC32462OooO00o2, interfaceC32462OooO00o3, interfaceC32462OooO00o4, interfaceC32462OooO00o5, interfaceC32462OooO00o6, interfaceC32462OooO00o7);
    }

    public static MetricsLoggerClient providesMetricsLoggerClient(FirebaseApp firebaseApp, TransportFactory transportFactory, AnalyticsConnector analyticsConnector, FirebaseInstallationsApi firebaseInstallationsApi, Clock clock, DeveloperListenerManager developerListenerManager, Executor executor) {
        return (MetricsLoggerClient) Preconditions.checkNotNullFromProvides(TransportClientModule.providesMetricsLoggerClient(firebaseApp, transportFactory, analyticsConnector, firebaseInstallationsApi, clock, developerListenerManager, executor));
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public MetricsLoggerClient get() {
        return providesMetricsLoggerClient(this.appProvider.get(), this.transportFactoryProvider.get(), this.analyticsConnectorProvider.get(), this.firebaseInstallationsProvider.get(), this.clockProvider.get(), this.developerListenerManagerProvider.get(), this.blockingExecutorProvider.get());
    }
}
