package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import com.google.internal.firebase.inappmessaging.p566v1.sdkserving.InAppMessagingSdkServingGrpc;
import oO00ooO0.InterfaceC32462OooO00o;
import oO0OOo0o.AbstractC33060OooO0Oo;
import oO0OOo0o.C33094OoooO;

/* JADX INFO: loaded from: classes8.dex */
public final class GrpcClientModule_ProvidesInAppMessagingSdkServingStubFactory implements Factory<InAppMessagingSdkServingGrpc.InAppMessagingSdkServingBlockingStub> {
    private final InterfaceC32462OooO00o<AbstractC33060OooO0Oo> channelProvider;
    private final InterfaceC32462OooO00o<C33094OoooO> metadataProvider;
    private final GrpcClientModule module;

    public GrpcClientModule_ProvidesInAppMessagingSdkServingStubFactory(GrpcClientModule grpcClientModule, InterfaceC32462OooO00o<AbstractC33060OooO0Oo> interfaceC32462OooO00o, InterfaceC32462OooO00o<C33094OoooO> interfaceC32462OooO00o2) {
        this.module = grpcClientModule;
        this.channelProvider = interfaceC32462OooO00o;
        this.metadataProvider = interfaceC32462OooO00o2;
    }

    public static GrpcClientModule_ProvidesInAppMessagingSdkServingStubFactory create(GrpcClientModule grpcClientModule, InterfaceC32462OooO00o<AbstractC33060OooO0Oo> interfaceC32462OooO00o, InterfaceC32462OooO00o<C33094OoooO> interfaceC32462OooO00o2) {
        return new GrpcClientModule_ProvidesInAppMessagingSdkServingStubFactory(grpcClientModule, interfaceC32462OooO00o, interfaceC32462OooO00o2);
    }

    public static InAppMessagingSdkServingGrpc.InAppMessagingSdkServingBlockingStub providesInAppMessagingSdkServingStub(GrpcClientModule grpcClientModule, AbstractC33060OooO0Oo abstractC33060OooO0Oo, C33094OoooO c33094OoooO) {
        return (InAppMessagingSdkServingGrpc.InAppMessagingSdkServingBlockingStub) Preconditions.checkNotNullFromProvides(grpcClientModule.providesInAppMessagingSdkServingStub(abstractC33060OooO0Oo, c33094OoooO));
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public InAppMessagingSdkServingGrpc.InAppMessagingSdkServingBlockingStub get() {
        return providesInAppMessagingSdkServingStub(this.module, this.channelProvider.get(), this.metadataProvider.get());
    }
}
