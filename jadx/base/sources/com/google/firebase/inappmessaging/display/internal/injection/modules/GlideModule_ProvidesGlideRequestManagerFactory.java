package com.google.firebase.inappmessaging.display.internal.injection.modules;

import android.app.Application;
import com.bumptech.glide.OooOOO0;
import com.google.firebase.inappmessaging.display.dagger.internal.Factory;
import com.google.firebase.inappmessaging.display.dagger.internal.Preconditions;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class GlideModule_ProvidesGlideRequestManagerFactory implements Factory<OooOOO0> {
    private final InterfaceC32462OooO00o<Application> applicationProvider;
    private final GlideModule module;

    public GlideModule_ProvidesGlideRequestManagerFactory(GlideModule glideModule, InterfaceC32462OooO00o<Application> interfaceC32462OooO00o) {
        this.module = glideModule;
        this.applicationProvider = interfaceC32462OooO00o;
    }

    public static GlideModule_ProvidesGlideRequestManagerFactory create(GlideModule glideModule, InterfaceC32462OooO00o<Application> interfaceC32462OooO00o) {
        return new GlideModule_ProvidesGlideRequestManagerFactory(glideModule, interfaceC32462OooO00o);
    }

    public static OooOOO0 providesGlideRequestManager(GlideModule glideModule, Application application) {
        return (OooOOO0) Preconditions.checkNotNullFromProvides(glideModule.providesGlideRequestManager(application));
    }

    @Override // com.google.firebase.inappmessaging.display.dagger.internal.Factory, com.google.firebase.inappmessaging.display.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public OooOOO0 get() {
        return providesGlideRequestManager(this.module, this.applicationProvider.get());
    }
}
