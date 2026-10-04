package com.google.firebase.inappmessaging.internal;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.internal.firebase.inappmessaging.p566v1.sdkserving.InAppMessagingSdkServingGrpc;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class GrpcClient_Factory implements Factory<GrpcClient> {
    private final InterfaceC32462OooO00o<InAppMessagingSdkServingGrpc.InAppMessagingSdkServingBlockingStub> stubProvider;

    public GrpcClient_Factory(InterfaceC32462OooO00o<InAppMessagingSdkServingGrpc.InAppMessagingSdkServingBlockingStub> interfaceC32462OooO00o) {
        this.stubProvider = interfaceC32462OooO00o;
    }

    public static GrpcClient_Factory create(InterfaceC32462OooO00o<InAppMessagingSdkServingGrpc.InAppMessagingSdkServingBlockingStub> interfaceC32462OooO00o) {
        return new GrpcClient_Factory(interfaceC32462OooO00o);
    }

    public static GrpcClient newInstance(InAppMessagingSdkServingGrpc.InAppMessagingSdkServingBlockingStub inAppMessagingSdkServingBlockingStub) {
        return new GrpcClient(inAppMessagingSdkServingBlockingStub);
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public GrpcClient get() {
        return newInstance(this.stubProvider.get());
    }
}
