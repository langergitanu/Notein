package com.google.firebase.inappmessaging.internal.injection.modules;

import android.app.Application;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.internal.ProtoStorageClient;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.injection.modules.ProtoStorageClientModule_ProvidesProtoStorageClientForCampaignFactory */
/* JADX INFO: loaded from: classes8.dex */
public final class C17152x58415996 implements Factory<ProtoStorageClient> {
    private final InterfaceC32462OooO00o<Application> applicationProvider;
    private final ProtoStorageClientModule module;

    public C17152x58415996(ProtoStorageClientModule protoStorageClientModule, InterfaceC32462OooO00o<Application> interfaceC32462OooO00o) {
        this.module = protoStorageClientModule;
        this.applicationProvider = interfaceC32462OooO00o;
    }

    public static C17152x58415996 create(ProtoStorageClientModule protoStorageClientModule, InterfaceC32462OooO00o<Application> interfaceC32462OooO00o) {
        return new C17152x58415996(protoStorageClientModule, interfaceC32462OooO00o);
    }

    public static ProtoStorageClient providesProtoStorageClientForCampaign(ProtoStorageClientModule protoStorageClientModule, Application application) {
        return (ProtoStorageClient) Preconditions.checkNotNullFromProvides(protoStorageClientModule.providesProtoStorageClientForCampaign(application));
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public ProtoStorageClient get() {
        return providesProtoStorageClientForCampaign(this.module, this.applicationProvider.get());
    }
}
