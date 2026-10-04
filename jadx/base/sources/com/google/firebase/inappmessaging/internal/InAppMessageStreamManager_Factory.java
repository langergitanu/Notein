package com.google.firebase.inappmessaging.internal;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.internal.time.Clock;
import com.google.firebase.inappmessaging.model.RateLimit;
import com.google.firebase.installations.FirebaseInstallationsApi;
import java.util.concurrent.Executor;
import oO00ooO0.InterfaceC32462OooO00o;
import oO0OOoOO.AbstractC33127OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class InAppMessageStreamManager_Factory implements Factory<InAppMessageStreamManager> {
    private final InterfaceC32462OooO00o<AbtIntegrationHelper> abtIntegrationHelperProvider;
    private final InterfaceC32462OooO00o<AnalyticsEventsManager> analyticsEventsManagerProvider;
    private final InterfaceC32462OooO00o<ApiClient> apiClientProvider;
    private final InterfaceC32462OooO00o<AbstractC33127OooO00o<String>> appForegroundEventFlowableProvider;
    private final InterfaceC32462OooO00o<RateLimit> appForegroundRateLimitProvider;
    private final InterfaceC32462OooO00o<Executor> blockingExecutorProvider;
    private final InterfaceC32462OooO00o<CampaignCacheClient> campaignCacheClientProvider;
    private final InterfaceC32462OooO00o<Clock> clockProvider;
    private final InterfaceC32462OooO00o<DataCollectionHelper> dataCollectionHelperProvider;
    private final InterfaceC32462OooO00o<FirebaseInstallationsApi> firebaseInstallationsProvider;
    private final InterfaceC32462OooO00o<ImpressionStorageClient> impressionStorageClientProvider;
    private final InterfaceC32462OooO00o<AbstractC33127OooO00o<String>> programmaticTriggerEventFlowableProvider;
    private final InterfaceC32462OooO00o<RateLimiterClient> rateLimiterClientProvider;
    private final InterfaceC32462OooO00o<Schedulers> schedulersProvider;
    private final InterfaceC32462OooO00o<TestDeviceHelper> testDeviceHelperProvider;

    public InAppMessageStreamManager_Factory(InterfaceC32462OooO00o<AbstractC33127OooO00o<String>> interfaceC32462OooO00o, InterfaceC32462OooO00o<AbstractC33127OooO00o<String>> interfaceC32462OooO00o2, InterfaceC32462OooO00o<CampaignCacheClient> interfaceC32462OooO00o3, InterfaceC32462OooO00o<Clock> interfaceC32462OooO00o4, InterfaceC32462OooO00o<ApiClient> interfaceC32462OooO00o5, InterfaceC32462OooO00o<AnalyticsEventsManager> interfaceC32462OooO00o6, InterfaceC32462OooO00o<Schedulers> interfaceC32462OooO00o7, InterfaceC32462OooO00o<ImpressionStorageClient> interfaceC32462OooO00o8, InterfaceC32462OooO00o<RateLimiterClient> interfaceC32462OooO00o9, InterfaceC32462OooO00o<RateLimit> interfaceC32462OooO00o10, InterfaceC32462OooO00o<TestDeviceHelper> interfaceC32462OooO00o11, InterfaceC32462OooO00o<FirebaseInstallationsApi> interfaceC32462OooO00o12, InterfaceC32462OooO00o<DataCollectionHelper> interfaceC32462OooO00o13, InterfaceC32462OooO00o<AbtIntegrationHelper> interfaceC32462OooO00o14, InterfaceC32462OooO00o<Executor> interfaceC32462OooO00o15) {
        this.appForegroundEventFlowableProvider = interfaceC32462OooO00o;
        this.programmaticTriggerEventFlowableProvider = interfaceC32462OooO00o2;
        this.campaignCacheClientProvider = interfaceC32462OooO00o3;
        this.clockProvider = interfaceC32462OooO00o4;
        this.apiClientProvider = interfaceC32462OooO00o5;
        this.analyticsEventsManagerProvider = interfaceC32462OooO00o6;
        this.schedulersProvider = interfaceC32462OooO00o7;
        this.impressionStorageClientProvider = interfaceC32462OooO00o8;
        this.rateLimiterClientProvider = interfaceC32462OooO00o9;
        this.appForegroundRateLimitProvider = interfaceC32462OooO00o10;
        this.testDeviceHelperProvider = interfaceC32462OooO00o11;
        this.firebaseInstallationsProvider = interfaceC32462OooO00o12;
        this.dataCollectionHelperProvider = interfaceC32462OooO00o13;
        this.abtIntegrationHelperProvider = interfaceC32462OooO00o14;
        this.blockingExecutorProvider = interfaceC32462OooO00o15;
    }

    public static InAppMessageStreamManager_Factory create(InterfaceC32462OooO00o<AbstractC33127OooO00o<String>> interfaceC32462OooO00o, InterfaceC32462OooO00o<AbstractC33127OooO00o<String>> interfaceC32462OooO00o2, InterfaceC32462OooO00o<CampaignCacheClient> interfaceC32462OooO00o3, InterfaceC32462OooO00o<Clock> interfaceC32462OooO00o4, InterfaceC32462OooO00o<ApiClient> interfaceC32462OooO00o5, InterfaceC32462OooO00o<AnalyticsEventsManager> interfaceC32462OooO00o6, InterfaceC32462OooO00o<Schedulers> interfaceC32462OooO00o7, InterfaceC32462OooO00o<ImpressionStorageClient> interfaceC32462OooO00o8, InterfaceC32462OooO00o<RateLimiterClient> interfaceC32462OooO00o9, InterfaceC32462OooO00o<RateLimit> interfaceC32462OooO00o10, InterfaceC32462OooO00o<TestDeviceHelper> interfaceC32462OooO00o11, InterfaceC32462OooO00o<FirebaseInstallationsApi> interfaceC32462OooO00o12, InterfaceC32462OooO00o<DataCollectionHelper> interfaceC32462OooO00o13, InterfaceC32462OooO00o<AbtIntegrationHelper> interfaceC32462OooO00o14, InterfaceC32462OooO00o<Executor> interfaceC32462OooO00o15) {
        return new InAppMessageStreamManager_Factory(interfaceC32462OooO00o, interfaceC32462OooO00o2, interfaceC32462OooO00o3, interfaceC32462OooO00o4, interfaceC32462OooO00o5, interfaceC32462OooO00o6, interfaceC32462OooO00o7, interfaceC32462OooO00o8, interfaceC32462OooO00o9, interfaceC32462OooO00o10, interfaceC32462OooO00o11, interfaceC32462OooO00o12, interfaceC32462OooO00o13, interfaceC32462OooO00o14, interfaceC32462OooO00o15);
    }

    public static InAppMessageStreamManager newInstance(AbstractC33127OooO00o<String> abstractC33127OooO00o, AbstractC33127OooO00o<String> abstractC33127OooO00o2, CampaignCacheClient campaignCacheClient, Clock clock, ApiClient apiClient, AnalyticsEventsManager analyticsEventsManager, Schedulers schedulers, ImpressionStorageClient impressionStorageClient, RateLimiterClient rateLimiterClient, RateLimit rateLimit, TestDeviceHelper testDeviceHelper, FirebaseInstallationsApi firebaseInstallationsApi, DataCollectionHelper dataCollectionHelper, AbtIntegrationHelper abtIntegrationHelper, Executor executor) {
        return new InAppMessageStreamManager(abstractC33127OooO00o, abstractC33127OooO00o2, campaignCacheClient, clock, apiClient, analyticsEventsManager, schedulers, impressionStorageClient, rateLimiterClient, rateLimit, testDeviceHelper, firebaseInstallationsApi, dataCollectionHelper, abtIntegrationHelper, executor);
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public InAppMessageStreamManager get() {
        return newInstance(this.appForegroundEventFlowableProvider.get(), this.programmaticTriggerEventFlowableProvider.get(), this.campaignCacheClientProvider.get(), this.clockProvider.get(), this.apiClientProvider.get(), this.analyticsEventsManagerProvider.get(), this.schedulersProvider.get(), this.impressionStorageClientProvider.get(), this.rateLimiterClientProvider.get(), this.appForegroundRateLimitProvider.get(), this.testDeviceHelperProvider.get(), this.firebaseInstallationsProvider.get(), this.dataCollectionHelperProvider.get(), this.abtIntegrationHelperProvider.get(), this.blockingExecutorProvider.get());
    }
}
