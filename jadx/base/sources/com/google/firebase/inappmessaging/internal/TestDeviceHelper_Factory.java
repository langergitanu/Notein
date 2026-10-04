package com.google.firebase.inappmessaging.internal;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class TestDeviceHelper_Factory implements Factory<TestDeviceHelper> {
    private final InterfaceC32462OooO00o<SharedPreferencesUtils> sharedPreferencesUtilsProvider;

    public TestDeviceHelper_Factory(InterfaceC32462OooO00o<SharedPreferencesUtils> interfaceC32462OooO00o) {
        this.sharedPreferencesUtilsProvider = interfaceC32462OooO00o;
    }

    public static TestDeviceHelper_Factory create(InterfaceC32462OooO00o<SharedPreferencesUtils> interfaceC32462OooO00o) {
        return new TestDeviceHelper_Factory(interfaceC32462OooO00o);
    }

    public static TestDeviceHelper newInstance(SharedPreferencesUtils sharedPreferencesUtils) {
        return new TestDeviceHelper(sharedPreferencesUtils);
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public TestDeviceHelper get() {
        return newInstance(this.sharedPreferencesUtilsProvider.get());
    }
}
