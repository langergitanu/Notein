package com.google.firebase.inappmessaging.display.internal;

import android.app.Application;
import com.google.firebase.inappmessaging.display.dagger.internal.Factory;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class BindingWrapperFactory_Factory implements Factory<BindingWrapperFactory> {
    private final InterfaceC32462OooO00o<Application> applicationProvider;

    public BindingWrapperFactory_Factory(InterfaceC32462OooO00o<Application> interfaceC32462OooO00o) {
        this.applicationProvider = interfaceC32462OooO00o;
    }

    public static BindingWrapperFactory_Factory create(InterfaceC32462OooO00o<Application> interfaceC32462OooO00o) {
        return new BindingWrapperFactory_Factory(interfaceC32462OooO00o);
    }

    public static BindingWrapperFactory newInstance(Application application) {
        return new BindingWrapperFactory(application);
    }

    @Override // com.google.firebase.inappmessaging.display.dagger.internal.Factory, com.google.firebase.inappmessaging.display.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public BindingWrapperFactory get() {
        return newInstance(this.applicationProvider.get());
    }
}
