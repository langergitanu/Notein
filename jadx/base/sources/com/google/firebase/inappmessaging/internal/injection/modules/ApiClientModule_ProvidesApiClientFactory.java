package com.google.firebase.inappmessaging.internal.injection.modules;

import android.app.Application;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.internal.ApiClient;
import com.google.firebase.inappmessaging.internal.GrpcClient;
import com.google.firebase.inappmessaging.internal.ProviderInstaller;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class ApiClientModule_ProvidesApiClientFactory implements Factory<ApiClient> {
    private final InterfaceC32462OooO00o<Application> applicationProvider;
    private final InterfaceC32462OooO00o<GrpcClient> grpcClientProvider;
    private final ApiClientModule module;
    private final InterfaceC32462OooO00o<ProviderInstaller> providerInstallerProvider;

    public ApiClientModule_ProvidesApiClientFactory(ApiClientModule apiClientModule, InterfaceC32462OooO00o<GrpcClient> interfaceC32462OooO00o, InterfaceC32462OooO00o<Application> interfaceC32462OooO00o2, InterfaceC32462OooO00o<ProviderInstaller> interfaceC32462OooO00o3) {
        this.module = apiClientModule;
        this.grpcClientProvider = interfaceC32462OooO00o;
        this.applicationProvider = interfaceC32462OooO00o2;
        this.providerInstallerProvider = interfaceC32462OooO00o3;
    }

    public static ApiClientModule_ProvidesApiClientFactory create(ApiClientModule apiClientModule, InterfaceC32462OooO00o<GrpcClient> interfaceC32462OooO00o, InterfaceC32462OooO00o<Application> interfaceC32462OooO00o2, InterfaceC32462OooO00o<ProviderInstaller> interfaceC32462OooO00o3) {
        return new ApiClientModule_ProvidesApiClientFactory(apiClientModule, interfaceC32462OooO00o, interfaceC32462OooO00o2, interfaceC32462OooO00o3);
    }

    public static ApiClient providesApiClient(ApiClientModule apiClientModule, InterfaceC32462OooO00o<GrpcClient> interfaceC32462OooO00o, Application application, ProviderInstaller providerInstaller) {
        return (ApiClient) Preconditions.checkNotNullFromProvides(apiClientModule.providesApiClient(interfaceC32462OooO00o, application, providerInstaller));
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public ApiClient get() {
        return providesApiClient(this.module, this.grpcClientProvider, this.applicationProvider.get(), this.providerInstallerProvider.get());
    }
}
