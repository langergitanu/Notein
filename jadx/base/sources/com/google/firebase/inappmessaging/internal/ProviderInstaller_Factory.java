package com.google.firebase.inappmessaging.internal;

import android.app.Application;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class ProviderInstaller_Factory implements Factory<ProviderInstaller> {
    private final InterfaceC32462OooO00o<Application> applicationProvider;

    public ProviderInstaller_Factory(InterfaceC32462OooO00o<Application> interfaceC32462OooO00o) {
        this.applicationProvider = interfaceC32462OooO00o;
    }

    public static ProviderInstaller_Factory create(InterfaceC32462OooO00o<Application> interfaceC32462OooO00o) {
        return new ProviderInstaller_Factory(interfaceC32462OooO00o);
    }

    public static ProviderInstaller newInstance(Application application) {
        return new ProviderInstaller(application);
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public ProviderInstaller get() {
        return newInstance(this.applicationProvider.get());
    }
}
