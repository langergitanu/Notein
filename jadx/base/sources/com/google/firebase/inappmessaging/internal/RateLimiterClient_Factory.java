package com.google.firebase.inappmessaging.internal;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.internal.time.Clock;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class RateLimiterClient_Factory implements Factory<RateLimiterClient> {
    private final InterfaceC32462OooO00o<Clock> clockProvider;
    private final InterfaceC32462OooO00o<ProtoStorageClient> storageClientProvider;

    public RateLimiterClient_Factory(InterfaceC32462OooO00o<ProtoStorageClient> interfaceC32462OooO00o, InterfaceC32462OooO00o<Clock> interfaceC32462OooO00o2) {
        this.storageClientProvider = interfaceC32462OooO00o;
        this.clockProvider = interfaceC32462OooO00o2;
    }

    public static RateLimiterClient_Factory create(InterfaceC32462OooO00o<ProtoStorageClient> interfaceC32462OooO00o, InterfaceC32462OooO00o<Clock> interfaceC32462OooO00o2) {
        return new RateLimiterClient_Factory(interfaceC32462OooO00o, interfaceC32462OooO00o2);
    }

    public static RateLimiterClient newInstance(ProtoStorageClient protoStorageClient, Clock clock) {
        return new RateLimiterClient(protoStorageClient, clock);
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public RateLimiterClient get() {
        return newInstance(this.storageClientProvider.get(), this.clockProvider.get());
    }
}
