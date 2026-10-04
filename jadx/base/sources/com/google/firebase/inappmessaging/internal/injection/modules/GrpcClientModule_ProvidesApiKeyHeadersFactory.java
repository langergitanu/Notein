package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import oO0OOo0o.C33094OoooO;

/* JADX INFO: loaded from: classes8.dex */
public final class GrpcClientModule_ProvidesApiKeyHeadersFactory implements Factory<C33094OoooO> {
    private final GrpcClientModule module;

    public GrpcClientModule_ProvidesApiKeyHeadersFactory(GrpcClientModule grpcClientModule) {
        this.module = grpcClientModule;
    }

    public static GrpcClientModule_ProvidesApiKeyHeadersFactory create(GrpcClientModule grpcClientModule) {
        return new GrpcClientModule_ProvidesApiKeyHeadersFactory(grpcClientModule);
    }

    public static C33094OoooO providesApiKeyHeaders(GrpcClientModule grpcClientModule) {
        return (C33094OoooO) Preconditions.checkNotNullFromProvides(grpcClientModule.providesApiKeyHeaders());
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public C33094OoooO get() {
        return providesApiKeyHeaders(this.module);
    }
}
