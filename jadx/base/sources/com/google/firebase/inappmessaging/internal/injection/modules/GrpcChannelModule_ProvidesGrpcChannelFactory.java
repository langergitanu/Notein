package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import oO00ooO0.InterfaceC32462OooO00o;
import oO0OOo0o.AbstractC33060OooO0Oo;

/* JADX INFO: loaded from: classes8.dex */
public final class GrpcChannelModule_ProvidesGrpcChannelFactory implements Factory<AbstractC33060OooO0Oo> {
    private final InterfaceC32462OooO00o<String> hostProvider;
    private final GrpcChannelModule module;

    public GrpcChannelModule_ProvidesGrpcChannelFactory(GrpcChannelModule grpcChannelModule, InterfaceC32462OooO00o<String> interfaceC32462OooO00o) {
        this.module = grpcChannelModule;
        this.hostProvider = interfaceC32462OooO00o;
    }

    public static GrpcChannelModule_ProvidesGrpcChannelFactory create(GrpcChannelModule grpcChannelModule, InterfaceC32462OooO00o<String> interfaceC32462OooO00o) {
        return new GrpcChannelModule_ProvidesGrpcChannelFactory(grpcChannelModule, interfaceC32462OooO00o);
    }

    public static AbstractC33060OooO0Oo providesGrpcChannel(GrpcChannelModule grpcChannelModule, String str) {
        return (AbstractC33060OooO0Oo) Preconditions.checkNotNullFromProvides(grpcChannelModule.providesGrpcChannel(str));
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public AbstractC33060OooO0Oo get() {
        return providesGrpcChannel(this.module, this.hostProvider.get());
    }
}
