package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.internal.SharedPreferencesUtils;
import com.google.firebase.inappmessaging.internal.TestDeviceHelper;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class ApiClientModule_ProvidesTestDeviceHelperFactory implements Factory<TestDeviceHelper> {
    private final ApiClientModule module;
    private final InterfaceC32462OooO00o<SharedPreferencesUtils> sharedPreferencesUtilsProvider;

    public ApiClientModule_ProvidesTestDeviceHelperFactory(ApiClientModule apiClientModule, InterfaceC32462OooO00o<SharedPreferencesUtils> interfaceC32462OooO00o) {
        this.module = apiClientModule;
        this.sharedPreferencesUtilsProvider = interfaceC32462OooO00o;
    }

    public static ApiClientModule_ProvidesTestDeviceHelperFactory create(ApiClientModule apiClientModule, InterfaceC32462OooO00o<SharedPreferencesUtils> interfaceC32462OooO00o) {
        return new ApiClientModule_ProvidesTestDeviceHelperFactory(apiClientModule, interfaceC32462OooO00o);
    }

    public static TestDeviceHelper providesTestDeviceHelper(ApiClientModule apiClientModule, SharedPreferencesUtils sharedPreferencesUtils) {
        return (TestDeviceHelper) Preconditions.checkNotNullFromProvides(apiClientModule.providesTestDeviceHelper(sharedPreferencesUtils));
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public TestDeviceHelper get() {
        return providesTestDeviceHelper(this.module, this.sharedPreferencesUtilsProvider.get());
    }
}
