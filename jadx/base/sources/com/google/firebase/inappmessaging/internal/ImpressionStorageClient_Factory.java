package com.google.firebase.inappmessaging.internal;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class ImpressionStorageClient_Factory implements Factory<ImpressionStorageClient> {
    private final InterfaceC32462OooO00o<ProtoStorageClient> storageClientProvider;

    public ImpressionStorageClient_Factory(InterfaceC32462OooO00o<ProtoStorageClient> interfaceC32462OooO00o) {
        this.storageClientProvider = interfaceC32462OooO00o;
    }

    public static ImpressionStorageClient_Factory create(InterfaceC32462OooO00o<ProtoStorageClient> interfaceC32462OooO00o) {
        return new ImpressionStorageClient_Factory(interfaceC32462OooO00o);
    }

    public static ImpressionStorageClient newInstance(ProtoStorageClient protoStorageClient) {
        return new ImpressionStorageClient(protoStorageClient);
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public ImpressionStorageClient get() {
        return newInstance(this.storageClientProvider.get());
    }
}
