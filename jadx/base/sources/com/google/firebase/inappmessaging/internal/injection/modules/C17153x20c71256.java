package com.google.firebase.inappmessaging.internal.injection.modules;

import android.app.Application;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.internal.ProtoStorageClient;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.injection.modules.ProtoStorageClientModule_ProvidesProtoStorageClientForImpressionStoreFactory */
/* JADX INFO: loaded from: classes8.dex */
public final class C17153x20c71256 implements Factory<ProtoStorageClient> {
    private final InterfaceC32462OooO00o<Application> applicationProvider;
    private final ProtoStorageClientModule module;

    public C17153x20c71256(ProtoStorageClientModule protoStorageClientModule, InterfaceC32462OooO00o<Application> interfaceC32462OooO00o) {
        this.module = protoStorageClientModule;
        this.applicationProvider = interfaceC32462OooO00o;
    }

    public static C17153x20c71256 create(ProtoStorageClientModule protoStorageClientModule, InterfaceC32462OooO00o<Application> interfaceC32462OooO00o) {
        return new C17153x20c71256(protoStorageClientModule, interfaceC32462OooO00o);
    }

    public static ProtoStorageClient providesProtoStorageClientForImpressionStore(ProtoStorageClientModule protoStorageClientModule, Application application) {
        return (ProtoStorageClient) Preconditions.checkNotNullFromProvides(protoStorageClientModule.providesProtoStorageClientForImpressionStore(application));
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public ProtoStorageClient get() {
        return providesProtoStorageClientForImpressionStore(this.module, this.applicationProvider.get());
    }
}
