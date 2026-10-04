package com.google.firebase.inappmessaging.internal;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.internal.time.Clock;
import com.google.firebase.inappmessaging.model.RateLimit;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class DisplayCallbacksFactory_Factory implements Factory<DisplayCallbacksFactory> {
    private final InterfaceC32462OooO00o<RateLimit> appForegroundRateLimitProvider;
    private final InterfaceC32462OooO00o<CampaignCacheClient> campaignCacheClientProvider;
    private final InterfaceC32462OooO00o<Clock> clockProvider;
    private final InterfaceC32462OooO00o<DataCollectionHelper> dataCollectionHelperProvider;
    private final InterfaceC32462OooO00o<ImpressionStorageClient> impressionStorageClientProvider;
    private final InterfaceC32462OooO00o<MetricsLoggerClient> metricsLoggerClientProvider;
    private final InterfaceC32462OooO00o<RateLimiterClient> rateLimiterClientProvider;
    private final InterfaceC32462OooO00o<Schedulers> schedulersProvider;

    public DisplayCallbacksFactory_Factory(InterfaceC32462OooO00o<ImpressionStorageClient> interfaceC32462OooO00o, InterfaceC32462OooO00o<Clock> interfaceC32462OooO00o2, InterfaceC32462OooO00o<Schedulers> interfaceC32462OooO00o3, InterfaceC32462OooO00o<RateLimiterClient> interfaceC32462OooO00o4, InterfaceC32462OooO00o<CampaignCacheClient> interfaceC32462OooO00o5, InterfaceC32462OooO00o<RateLimit> interfaceC32462OooO00o6, InterfaceC32462OooO00o<MetricsLoggerClient> interfaceC32462OooO00o7, InterfaceC32462OooO00o<DataCollectionHelper> interfaceC32462OooO00o8) {
        this.impressionStorageClientProvider = interfaceC32462OooO00o;
        this.clockProvider = interfaceC32462OooO00o2;
        this.schedulersProvider = interfaceC32462OooO00o3;
        this.rateLimiterClientProvider = interfaceC32462OooO00o4;
        this.campaignCacheClientProvider = interfaceC32462OooO00o5;
        this.appForegroundRateLimitProvider = interfaceC32462OooO00o6;
        this.metricsLoggerClientProvider = interfaceC32462OooO00o7;
        this.dataCollectionHelperProvider = interfaceC32462OooO00o8;
    }

    public static DisplayCallbacksFactory_Factory create(InterfaceC32462OooO00o<ImpressionStorageClient> interfaceC32462OooO00o, InterfaceC32462OooO00o<Clock> interfaceC32462OooO00o2, InterfaceC32462OooO00o<Schedulers> interfaceC32462OooO00o3, InterfaceC32462OooO00o<RateLimiterClient> interfaceC32462OooO00o4, InterfaceC32462OooO00o<CampaignCacheClient> interfaceC32462OooO00o5, InterfaceC32462OooO00o<RateLimit> interfaceC32462OooO00o6, InterfaceC32462OooO00o<MetricsLoggerClient> interfaceC32462OooO00o7, InterfaceC32462OooO00o<DataCollectionHelper> interfaceC32462OooO00o8) {
        return new DisplayCallbacksFactory_Factory(interfaceC32462OooO00o, interfaceC32462OooO00o2, interfaceC32462OooO00o3, interfaceC32462OooO00o4, interfaceC32462OooO00o5, interfaceC32462OooO00o6, interfaceC32462OooO00o7, interfaceC32462OooO00o8);
    }

    public static DisplayCallbacksFactory newInstance(ImpressionStorageClient impressionStorageClient, Clock clock, Schedulers schedulers, RateLimiterClient rateLimiterClient, CampaignCacheClient campaignCacheClient, RateLimit rateLimit, MetricsLoggerClient metricsLoggerClient, DataCollectionHelper dataCollectionHelper) {
        return new DisplayCallbacksFactory(impressionStorageClient, clock, schedulers, rateLimiterClient, campaignCacheClient, rateLimit, metricsLoggerClient, dataCollectionHelper);
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public DisplayCallbacksFactory get() {
        return newInstance(this.impressionStorageClientProvider.get(), this.clockProvider.get(), this.schedulersProvider.get(), this.rateLimiterClientProvider.get(), this.campaignCacheClientProvider.get(), this.appForegroundRateLimitProvider.get(), this.metricsLoggerClientProvider.get(), this.dataCollectionHelperProvider.get());
    }
}
