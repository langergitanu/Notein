package com.google.firebase.inappmessaging.internal.injection.modules;

import android.app.Application;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.internal.ProtoStorageClient;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.injection.modules.ProtoStorageClientModule_ProvidesProtoStorageClientForLimiterStoreFactory */
/* JADX INFO: loaded from: classes8.dex */
public final class C17154x2680546d implements Factory<ProtoStorageClient> {
    private final InterfaceC32462OooO00o<Application> applicationProvider;
    private final ProtoStorageClientModule module;

    public C17154x2680546d(ProtoStorageClientModule protoStorageClientModule, InterfaceC32462OooO00o<Application> interfaceC32462OooO00o) {
        this.module = protoStorageClientModule;
        this.applicationProvider = interfaceC32462OooO00o;
    }

    public static C17154x2680546d create(ProtoStorageClientModule protoStorageClientModule, InterfaceC32462OooO00o<Application> interfaceC32462OooO00o) {
        return new C17154x2680546d(protoStorageClientModule, interfaceC32462OooO00o);
    }

    public static ProtoStorageClient providesProtoStorageClientForLimiterStore(ProtoStorageClientModule protoStorageClientModule, Application application) {
        return (ProtoStorageClient) Preconditions.checkNotNullFromProvides(protoStorageClientModule.providesProtoStorageClientForLimiterStore(application));
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public ProtoStorageClient get() {
        return providesProtoStorageClientForLimiterStore(this.module, this.applicationProvider.get());
    }
}
