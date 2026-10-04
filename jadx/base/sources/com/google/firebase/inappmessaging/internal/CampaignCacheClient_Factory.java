package com.google.firebase.inappmessaging.internal;

import android.app.Application;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.internal.time.Clock;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class CampaignCacheClient_Factory implements Factory<CampaignCacheClient> {
    private final InterfaceC32462OooO00o<Application> applicationProvider;
    private final InterfaceC32462OooO00o<Clock> clockProvider;
    private final InterfaceC32462OooO00o<ProtoStorageClient> storageClientProvider;

    public CampaignCacheClient_Factory(InterfaceC32462OooO00o<ProtoStorageClient> interfaceC32462OooO00o, InterfaceC32462OooO00o<Application> interfaceC32462OooO00o2, InterfaceC32462OooO00o<Clock> interfaceC32462OooO00o3) {
        this.storageClientProvider = interfaceC32462OooO00o;
        this.applicationProvider = interfaceC32462OooO00o2;
        this.clockProvider = interfaceC32462OooO00o3;
    }

    public static CampaignCacheClient_Factory create(InterfaceC32462OooO00o<ProtoStorageClient> interfaceC32462OooO00o, InterfaceC32462OooO00o<Application> interfaceC32462OooO00o2, InterfaceC32462OooO00o<Clock> interfaceC32462OooO00o3) {
        return new CampaignCacheClient_Factory(interfaceC32462OooO00o, interfaceC32462OooO00o2, interfaceC32462OooO00o3);
    }

    public static CampaignCacheClient newInstance(ProtoStorageClient protoStorageClient, Application application, Clock clock) {
        return new CampaignCacheClient(protoStorageClient, application, clock);
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public CampaignCacheClient get() {
        return newInstance(this.storageClientProvider.get(), this.applicationProvider.get(), this.clockProvider.get());
    }
}
