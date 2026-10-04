package com.google.firebase.inappmessaging.internal.injection.components;

import android.app.Application;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.events.Subscriber;
import com.google.firebase.inappmessaging.FirebaseInAppMessaging;
import com.google.firebase.inappmessaging.FirebaseInAppMessaging_Factory;
import com.google.firebase.inappmessaging.dagger.internal.DoubleCheck;
import com.google.firebase.inappmessaging.dagger.internal.InstanceFactory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.dagger.internal.Provider;
import com.google.firebase.inappmessaging.internal.AbtIntegrationHelper;
import com.google.firebase.inappmessaging.internal.AnalyticsEventsManager;
import com.google.firebase.inappmessaging.internal.ApiClient;
import com.google.firebase.inappmessaging.internal.CampaignCacheClient;
import com.google.firebase.inappmessaging.internal.DataCollectionHelper;
import com.google.firebase.inappmessaging.internal.DeveloperListenerManager;
import com.google.firebase.inappmessaging.internal.DisplayCallbacksFactory;
import com.google.firebase.inappmessaging.internal.DisplayCallbacksFactory_Factory;
import com.google.firebase.inappmessaging.internal.GrpcClient;
import com.google.firebase.inappmessaging.internal.GrpcClient_Factory;
import com.google.firebase.inappmessaging.internal.ImpressionStorageClient;
import com.google.firebase.inappmessaging.internal.InAppMessageStreamManager;
import com.google.firebase.inappmessaging.internal.InAppMessageStreamManager_Factory;
import com.google.firebase.inappmessaging.internal.MetricsLoggerClient;
import com.google.firebase.inappmessaging.internal.ProgramaticContextualTriggers;
import com.google.firebase.inappmessaging.internal.ProviderInstaller;
import com.google.firebase.inappmessaging.internal.RateLimiterClient;
import com.google.firebase.inappmessaging.internal.Schedulers;
import com.google.firebase.inappmessaging.internal.SharedPreferencesUtils;
import com.google.firebase.inappmessaging.internal.TestDeviceHelper;
import com.google.firebase.inappmessaging.internal.injection.components.AppComponent;
import com.google.firebase.inappmessaging.internal.injection.modules.ApiClientModule;
import com.google.firebase.inappmessaging.internal.injection.modules.ApiClientModule_ProvidesApiClientFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ApiClientModule_ProvidesDataCollectionHelperFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ApiClientModule_ProvidesFirebaseAppFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ApiClientModule_ProvidesFirebaseInstallationsFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ApiClientModule_ProvidesSharedPreferencesUtilsFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ApiClientModule_ProvidesTestDeviceHelperFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.GrpcClientModule;
import com.google.firebase.inappmessaging.internal.injection.modules.GrpcClientModule_ProvidesApiKeyHeadersFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.GrpcClientModule_ProvidesInAppMessagingSdkServingStubFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.TransportClientModule_ProvidesMetricsLoggerClientFactory;
import com.google.firebase.inappmessaging.internal.time.Clock;
import com.google.firebase.inappmessaging.model.RateLimit;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.internal.firebase.inappmessaging.p566v1.sdkserving.InAppMessagingSdkServingGrpc;
import java.util.concurrent.Executor;
import oO0OOo0o.AbstractC33060OooO0Oo;
import oO0OOo0o.C33094OoooO;
import oO0OOoOO.AbstractC33127OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class DaggerAppComponent {

    public static final class AppComponentImpl implements AppComponent {
        private Provider<AbtIntegrationHelper> abtIntegrationHelperProvider;
        private Provider<AnalyticsConnector> analyticsConnectorProvider;
        private Provider<AnalyticsEventsManager> analyticsEventsManagerProvider;
        private final ApiClientModule apiClientModule;
        private final AppComponentImpl appComponentImpl;
        private Provider<AbstractC33127OooO00o<String>> appForegroundEventFlowableProvider;
        private Provider<RateLimit> appForegroundRateLimitProvider;
        private Provider<Application> applicationProvider;
        private Provider<Executor> blockingExecutorProvider;
        private Provider<CampaignCacheClient> campaignCacheClientProvider;
        private Provider<Clock> clockProvider;
        private Provider<DeveloperListenerManager> developerListenerManagerProvider;
        private Provider<DisplayCallbacksFactory> displayCallbacksFactoryProvider;
        private Provider<Subscriber> firebaseEventsSubscriberProvider;
        private Provider<FirebaseInAppMessaging> firebaseInAppMessagingProvider;
        private Provider<AbstractC33060OooO0Oo> gRPCChannelProvider;
        private Provider<GrpcClient> grpcClientProvider;
        private Provider<ImpressionStorageClient> impressionStorageClientProvider;
        private Provider<InAppMessageStreamManager> inAppMessageStreamManagerProvider;
        private Provider<Executor> lightWeightExecutorProvider;
        private Provider<AbstractC33127OooO00o<String>> programmaticContextualTriggerFlowableProvider;
        private Provider<ProgramaticContextualTriggers> programmaticContextualTriggersProvider;
        private Provider<ProviderInstaller> providerInstallerProvider;
        private Provider<ApiClient> providesApiClientProvider;
        private Provider<C33094OoooO> providesApiKeyHeadersProvider;
        private Provider<DataCollectionHelper> providesDataCollectionHelperProvider;
        private Provider<FirebaseApp> providesFirebaseAppProvider;
        private Provider<FirebaseInstallationsApi> providesFirebaseInstallationsProvider;
        private Provider<InAppMessagingSdkServingGrpc.InAppMessagingSdkServingBlockingStub> providesInAppMessagingSdkServingStubProvider;
        private Provider<MetricsLoggerClient> providesMetricsLoggerClientProvider;
        private Provider<SharedPreferencesUtils> providesSharedPreferencesUtilsProvider;
        private Provider<TestDeviceHelper> providesTestDeviceHelperProvider;
        private Provider<RateLimiterClient> rateLimiterClientProvider;
        private Provider<Schedulers> schedulersProvider;
        private Provider<TransportFactory> transportFactoryProvider;
        private final UniversalComponent universalComponent;

        public static final class AnalyticsConnectorProvider implements Provider<AnalyticsConnector> {
            private final UniversalComponent universalComponent;

            public AnalyticsConnectorProvider(UniversalComponent universalComponent) {
                this.universalComponent = universalComponent;
            }

            @Override // com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
            public AnalyticsConnector get() {
                return (AnalyticsConnector) Preconditions.checkNotNullFromComponent(this.universalComponent.analyticsConnector());
            }
        }

        public static final class AnalyticsEventsManagerProvider implements Provider<AnalyticsEventsManager> {
            private final UniversalComponent universalComponent;

            public AnalyticsEventsManagerProvider(UniversalComponent universalComponent) {
                this.universalComponent = universalComponent;
            }

            @Override // com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
            public AnalyticsEventsManager get() {
                return (AnalyticsEventsManager) Preconditions.checkNotNullFromComponent(this.universalComponent.analyticsEventsManager());
            }
        }

        public static final class AppForegroundEventFlowableProvider implements Provider<AbstractC33127OooO00o<String>> {
            private final UniversalComponent universalComponent;

            public AppForegroundEventFlowableProvider(UniversalComponent universalComponent) {
                this.universalComponent = universalComponent;
            }

            @Override // com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
            public AbstractC33127OooO00o<String> get() {
                return (AbstractC33127OooO00o) Preconditions.checkNotNullFromComponent(this.universalComponent.appForegroundEventFlowable());
            }
        }

        public static final class AppForegroundRateLimitProvider implements Provider<RateLimit> {
            private final UniversalComponent universalComponent;

            public AppForegroundRateLimitProvider(UniversalComponent universalComponent) {
                this.universalComponent = universalComponent;
            }

            @Override // com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
            public RateLimit get() {
                return (RateLimit) Preconditions.checkNotNullFromComponent(this.universalComponent.appForegroundRateLimit());
            }
        }

        public static final class ApplicationProvider implements Provider<Application> {
            private final UniversalComponent universalComponent;

            public ApplicationProvider(UniversalComponent universalComponent) {
                this.universalComponent = universalComponent;
            }

            @Override // com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
            public Application get() {
                return (Application) Preconditions.checkNotNullFromComponent(this.universalComponent.application());
            }
        }

        public static final class BlockingExecutorProvider implements Provider<Executor> {
            private final UniversalComponent universalComponent;

            public BlockingExecutorProvider(UniversalComponent universalComponent) {
                this.universalComponent = universalComponent;
            }

            @Override // com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
            public Executor get() {
                return (Executor) Preconditions.checkNotNullFromComponent(this.universalComponent.blockingExecutor());
            }
        }

        public static final class CampaignCacheClientProvider implements Provider<CampaignCacheClient> {
            private final UniversalComponent universalComponent;

            public CampaignCacheClientProvider(UniversalComponent universalComponent) {
                this.universalComponent = universalComponent;
            }

            @Override // com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
            public CampaignCacheClient get() {
                return (CampaignCacheClient) Preconditions.checkNotNullFromComponent(this.universalComponent.campaignCacheClient());
            }
        }

        public static final class ClockProvider implements Provider<Clock> {
            private final UniversalComponent universalComponent;

            public ClockProvider(UniversalComponent universalComponent) {
                this.universalComponent = universalComponent;
            }

            @Override // com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
            public Clock get() {
                return (Clock) Preconditions.checkNotNullFromComponent(this.universalComponent.clock());
            }
        }

        public static final class DeveloperListenerManagerProvider implements Provider<DeveloperListenerManager> {
            private final UniversalComponent universalComponent;

            public DeveloperListenerManagerProvider(UniversalComponent universalComponent) {
                this.universalComponent = universalComponent;
            }

            @Override // com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
            public DeveloperListenerManager get() {
                return (DeveloperListenerManager) Preconditions.checkNotNullFromComponent(this.universalComponent.developerListenerManager());
            }
        }

        public static final class FirebaseEventsSubscriberProvider implements Provider<Subscriber> {
            private final UniversalComponent universalComponent;

            public FirebaseEventsSubscriberProvider(UniversalComponent universalComponent) {
                this.universalComponent = universalComponent;
            }

            @Override // com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
            public Subscriber get() {
                return (Subscriber) Preconditions.checkNotNullFromComponent(this.universalComponent.firebaseEventsSubscriber());
            }
        }

        public static final class GRPCChannelProvider implements Provider<AbstractC33060OooO0Oo> {
            private final UniversalComponent universalComponent;

            public GRPCChannelProvider(UniversalComponent universalComponent) {
                this.universalComponent = universalComponent;
            }

            @Override // com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
            public AbstractC33060OooO0Oo get() {
                return (AbstractC33060OooO0Oo) Preconditions.checkNotNullFromComponent(this.universalComponent.gRPCChannel());
            }
        }

        public static final class ImpressionStorageClientProvider implements Provider<ImpressionStorageClient> {
            private final UniversalComponent universalComponent;

            public ImpressionStorageClientProvider(UniversalComponent universalComponent) {
                this.universalComponent = universalComponent;
            }

            @Override // com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
            public ImpressionStorageClient get() {
                return (ImpressionStorageClient) Preconditions.checkNotNullFromComponent(this.universalComponent.impressionStorageClient());
            }
        }

        public static final class LightWeightExecutorProvider implements Provider<Executor> {
            private final UniversalComponent universalComponent;

            public LightWeightExecutorProvider(UniversalComponent universalComponent) {
                this.universalComponent = universalComponent;
            }

            @Override // com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
            public Executor get() {
                return (Executor) Preconditions.checkNotNullFromComponent(this.universalComponent.lightWeightExecutor());
            }
        }

        public static final class ProgrammaticContextualTriggerFlowableProvider implements Provider<AbstractC33127OooO00o<String>> {
            private final UniversalComponent universalComponent;

            public ProgrammaticContextualTriggerFlowableProvider(UniversalComponent universalComponent) {
                this.universalComponent = universalComponent;
            }

            @Override // com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
            public AbstractC33127OooO00o<String> get() {
                return (AbstractC33127OooO00o) Preconditions.checkNotNullFromComponent(this.universalComponent.programmaticContextualTriggerFlowable());
            }
        }

        public static final class ProgrammaticContextualTriggersProvider implements Provider<ProgramaticContextualTriggers> {
            private final UniversalComponent universalComponent;

            public ProgrammaticContextualTriggersProvider(UniversalComponent universalComponent) {
                this.universalComponent = universalComponent;
            }

            @Override // com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
            public ProgramaticContextualTriggers get() {
                return (ProgramaticContextualTriggers) Preconditions.checkNotNullFromComponent(this.universalComponent.programmaticContextualTriggers());
            }
        }

        public static final class ProviderInstallerProvider implements Provider<ProviderInstaller> {
            private final UniversalComponent universalComponent;

            public ProviderInstallerProvider(UniversalComponent universalComponent) {
                this.universalComponent = universalComponent;
            }

            @Override // com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
            public ProviderInstaller get() {
                return (ProviderInstaller) Preconditions.checkNotNullFromComponent(this.universalComponent.providerInstaller());
            }
        }

        public static final class RateLimiterClientProvider implements Provider<RateLimiterClient> {
            private final UniversalComponent universalComponent;

            public RateLimiterClientProvider(UniversalComponent universalComponent) {
                this.universalComponent = universalComponent;
            }

            @Override // com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
            public RateLimiterClient get() {
                return (RateLimiterClient) Preconditions.checkNotNullFromComponent(this.universalComponent.rateLimiterClient());
            }
        }

        public static final class SchedulersProvider implements Provider<Schedulers> {
            private final UniversalComponent universalComponent;

            public SchedulersProvider(UniversalComponent universalComponent) {
                this.universalComponent = universalComponent;
            }

            @Override // com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
            public Schedulers get() {
                return (Schedulers) Preconditions.checkNotNullFromComponent(this.universalComponent.schedulers());
            }
        }

        private DataCollectionHelper dataCollectionHelper() {
            ApiClientModule apiClientModule = this.apiClientModule;
            return ApiClientModule_ProvidesDataCollectionHelperFactory.providesDataCollectionHelper(apiClientModule, ApiClientModule_ProvidesSharedPreferencesUtilsFactory.providesSharedPreferencesUtils(apiClientModule), (Subscriber) Preconditions.checkNotNullFromComponent(this.universalComponent.firebaseEventsSubscriber()));
        }

        private void initialize(ApiClientModule apiClientModule, GrpcClientModule grpcClientModule, UniversalComponent universalComponent, AbtIntegrationHelper abtIntegrationHelper, TransportFactory transportFactory) {
            this.appForegroundEventFlowableProvider = new AppForegroundEventFlowableProvider(universalComponent);
            this.programmaticContextualTriggerFlowableProvider = new ProgrammaticContextualTriggerFlowableProvider(universalComponent);
            this.campaignCacheClientProvider = new CampaignCacheClientProvider(universalComponent);
            this.clockProvider = new ClockProvider(universalComponent);
            this.gRPCChannelProvider = new GRPCChannelProvider(universalComponent);
            GrpcClientModule_ProvidesApiKeyHeadersFactory grpcClientModule_ProvidesApiKeyHeadersFactoryCreate = GrpcClientModule_ProvidesApiKeyHeadersFactory.create(grpcClientModule);
            this.providesApiKeyHeadersProvider = grpcClientModule_ProvidesApiKeyHeadersFactoryCreate;
            Provider<InAppMessagingSdkServingGrpc.InAppMessagingSdkServingBlockingStub> provider = DoubleCheck.provider(GrpcClientModule_ProvidesInAppMessagingSdkServingStubFactory.create(grpcClientModule, this.gRPCChannelProvider, grpcClientModule_ProvidesApiKeyHeadersFactoryCreate));
            this.providesInAppMessagingSdkServingStubProvider = provider;
            this.grpcClientProvider = DoubleCheck.provider(GrpcClient_Factory.create(provider));
            this.applicationProvider = new ApplicationProvider(universalComponent);
            ProviderInstallerProvider providerInstallerProvider = new ProviderInstallerProvider(universalComponent);
            this.providerInstallerProvider = providerInstallerProvider;
            this.providesApiClientProvider = DoubleCheck.provider(ApiClientModule_ProvidesApiClientFactory.create(apiClientModule, this.grpcClientProvider, this.applicationProvider, providerInstallerProvider));
            this.analyticsEventsManagerProvider = new AnalyticsEventsManagerProvider(universalComponent);
            this.schedulersProvider = new SchedulersProvider(universalComponent);
            this.impressionStorageClientProvider = new ImpressionStorageClientProvider(universalComponent);
            this.rateLimiterClientProvider = new RateLimiterClientProvider(universalComponent);
            this.appForegroundRateLimitProvider = new AppForegroundRateLimitProvider(universalComponent);
            ApiClientModule_ProvidesSharedPreferencesUtilsFactory apiClientModule_ProvidesSharedPreferencesUtilsFactoryCreate = ApiClientModule_ProvidesSharedPreferencesUtilsFactory.create(apiClientModule);
            this.providesSharedPreferencesUtilsProvider = apiClientModule_ProvidesSharedPreferencesUtilsFactoryCreate;
            this.providesTestDeviceHelperProvider = ApiClientModule_ProvidesTestDeviceHelperFactory.create(apiClientModule, apiClientModule_ProvidesSharedPreferencesUtilsFactoryCreate);
            this.providesFirebaseInstallationsProvider = ApiClientModule_ProvidesFirebaseInstallationsFactory.create(apiClientModule);
            FirebaseEventsSubscriberProvider firebaseEventsSubscriberProvider = new FirebaseEventsSubscriberProvider(universalComponent);
            this.firebaseEventsSubscriberProvider = firebaseEventsSubscriberProvider;
            this.providesDataCollectionHelperProvider = ApiClientModule_ProvidesDataCollectionHelperFactory.create(apiClientModule, this.providesSharedPreferencesUtilsProvider, firebaseEventsSubscriberProvider);
            this.abtIntegrationHelperProvider = InstanceFactory.create(abtIntegrationHelper);
            BlockingExecutorProvider blockingExecutorProvider = new BlockingExecutorProvider(universalComponent);
            this.blockingExecutorProvider = blockingExecutorProvider;
            this.inAppMessageStreamManagerProvider = DoubleCheck.provider(InAppMessageStreamManager_Factory.create(this.appForegroundEventFlowableProvider, this.programmaticContextualTriggerFlowableProvider, this.campaignCacheClientProvider, this.clockProvider, this.providesApiClientProvider, this.analyticsEventsManagerProvider, this.schedulersProvider, this.impressionStorageClientProvider, this.rateLimiterClientProvider, this.appForegroundRateLimitProvider, this.providesTestDeviceHelperProvider, this.providesFirebaseInstallationsProvider, this.providesDataCollectionHelperProvider, this.abtIntegrationHelperProvider, blockingExecutorProvider));
            this.programmaticContextualTriggersProvider = new ProgrammaticContextualTriggersProvider(universalComponent);
            this.providesFirebaseAppProvider = ApiClientModule_ProvidesFirebaseAppFactory.create(apiClientModule);
            this.transportFactoryProvider = InstanceFactory.create(transportFactory);
            this.analyticsConnectorProvider = new AnalyticsConnectorProvider(universalComponent);
            DeveloperListenerManagerProvider developerListenerManagerProvider = new DeveloperListenerManagerProvider(universalComponent);
            this.developerListenerManagerProvider = developerListenerManagerProvider;
            Provider<MetricsLoggerClient> provider2 = DoubleCheck.provider(TransportClientModule_ProvidesMetricsLoggerClientFactory.create(this.providesFirebaseAppProvider, this.transportFactoryProvider, this.analyticsConnectorProvider, this.providesFirebaseInstallationsProvider, this.clockProvider, developerListenerManagerProvider, this.blockingExecutorProvider));
            this.providesMetricsLoggerClientProvider = provider2;
            this.displayCallbacksFactoryProvider = DisplayCallbacksFactory_Factory.create(this.impressionStorageClientProvider, this.clockProvider, this.schedulersProvider, this.rateLimiterClientProvider, this.campaignCacheClientProvider, this.appForegroundRateLimitProvider, provider2, this.providesDataCollectionHelperProvider);
            LightWeightExecutorProvider lightWeightExecutorProvider = new LightWeightExecutorProvider(universalComponent);
            this.lightWeightExecutorProvider = lightWeightExecutorProvider;
            this.firebaseInAppMessagingProvider = DoubleCheck.provider(FirebaseInAppMessaging_Factory.create(this.inAppMessageStreamManagerProvider, this.programmaticContextualTriggersProvider, this.providesDataCollectionHelperProvider, this.providesFirebaseInstallationsProvider, this.displayCallbacksFactoryProvider, this.developerListenerManagerProvider, lightWeightExecutorProvider));
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.AppComponent
        public DisplayCallbacksFactory displayCallbacksFactory() {
            return new DisplayCallbacksFactory((ImpressionStorageClient) Preconditions.checkNotNullFromComponent(this.universalComponent.impressionStorageClient()), (Clock) Preconditions.checkNotNullFromComponent(this.universalComponent.clock()), (Schedulers) Preconditions.checkNotNullFromComponent(this.universalComponent.schedulers()), (RateLimiterClient) Preconditions.checkNotNullFromComponent(this.universalComponent.rateLimiterClient()), (CampaignCacheClient) Preconditions.checkNotNullFromComponent(this.universalComponent.campaignCacheClient()), (RateLimit) Preconditions.checkNotNullFromComponent(this.universalComponent.appForegroundRateLimit()), (MetricsLoggerClient) this.providesMetricsLoggerClientProvider.get(), dataCollectionHelper());
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.AppComponent
        public FirebaseInAppMessaging providesFirebaseInAppMessaging() {
            return (FirebaseInAppMessaging) this.firebaseInAppMessagingProvider.get();
        }

        private AppComponentImpl(ApiClientModule apiClientModule, GrpcClientModule grpcClientModule, UniversalComponent universalComponent, AbtIntegrationHelper abtIntegrationHelper, TransportFactory transportFactory) {
            this.appComponentImpl = this;
            this.universalComponent = universalComponent;
            this.apiClientModule = apiClientModule;
            initialize(apiClientModule, grpcClientModule, universalComponent, abtIntegrationHelper, transportFactory);
        }
    }

    public static final class Builder implements AppComponent.Builder {
        private AbtIntegrationHelper abtIntegrationHelper;
        private ApiClientModule apiClientModule;
        private GrpcClientModule grpcClientModule;
        private TransportFactory transportFactory;
        private UniversalComponent universalComponent;

        private Builder() {
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.AppComponent.Builder
        public AppComponent build() {
            Preconditions.checkBuilderRequirement(this.abtIntegrationHelper, AbtIntegrationHelper.class);
            Preconditions.checkBuilderRequirement(this.apiClientModule, ApiClientModule.class);
            Preconditions.checkBuilderRequirement(this.grpcClientModule, GrpcClientModule.class);
            Preconditions.checkBuilderRequirement(this.universalComponent, UniversalComponent.class);
            Preconditions.checkBuilderRequirement(this.transportFactory, TransportFactory.class);
            return new AppComponentImpl(this.apiClientModule, this.grpcClientModule, this.universalComponent, this.abtIntegrationHelper, this.transportFactory);
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.AppComponent.Builder
        public Builder abtIntegrationHelper(AbtIntegrationHelper abtIntegrationHelper) {
            this.abtIntegrationHelper = (AbtIntegrationHelper) Preconditions.checkNotNull(abtIntegrationHelper);
            return this;
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.AppComponent.Builder
        public Builder apiClientModule(ApiClientModule apiClientModule) {
            this.apiClientModule = (ApiClientModule) Preconditions.checkNotNull(apiClientModule);
            return this;
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.AppComponent.Builder
        public Builder grpcClientModule(GrpcClientModule grpcClientModule) {
            this.grpcClientModule = (GrpcClientModule) Preconditions.checkNotNull(grpcClientModule);
            return this;
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.AppComponent.Builder
        public Builder transportFactory(TransportFactory transportFactory) {
            this.transportFactory = (TransportFactory) Preconditions.checkNotNull(transportFactory);
            return this;
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.AppComponent.Builder
        public Builder universalComponent(UniversalComponent universalComponent) {
            this.universalComponent = (UniversalComponent) Preconditions.checkNotNull(universalComponent);
            return this;
        }
    }

    private DaggerAppComponent() {
    }

    public static AppComponent.Builder builder() {
        return new Builder();
    }
}
