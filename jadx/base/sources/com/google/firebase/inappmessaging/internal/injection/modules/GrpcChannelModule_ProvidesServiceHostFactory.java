package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public final class GrpcChannelModule_ProvidesServiceHostFactory implements Factory<String> {
    private final GrpcChannelModule module;

    public GrpcChannelModule_ProvidesServiceHostFactory(GrpcChannelModule grpcChannelModule) {
        this.module = grpcChannelModule;
    }

    public static GrpcChannelModule_ProvidesServiceHostFactory create(GrpcChannelModule grpcChannelModule) {
        return new GrpcChannelModule_ProvidesServiceHostFactory(grpcChannelModule);
    }

    public static String providesServiceHost(GrpcChannelModule grpcChannelModule) {
        return (String) Preconditions.checkNotNullFromProvides(grpcChannelModule.providesServiceHost());
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public String get() {
        return providesServiceHost(this.module);
    }
}
