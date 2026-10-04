package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.internal.DeveloperListenerManager;
import java.util.concurrent.Executor;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class ApplicationModule_DeveloperListenerManagerFactory implements Factory<DeveloperListenerManager> {
    private final InterfaceC32462OooO00o<Executor> backgroundExecutorProvider;
    private final ApplicationModule module;

    public ApplicationModule_DeveloperListenerManagerFactory(ApplicationModule applicationModule, InterfaceC32462OooO00o<Executor> interfaceC32462OooO00o) {
        this.module = applicationModule;
        this.backgroundExecutorProvider = interfaceC32462OooO00o;
    }

    public static ApplicationModule_DeveloperListenerManagerFactory create(ApplicationModule applicationModule, InterfaceC32462OooO00o<Executor> interfaceC32462OooO00o) {
        return new ApplicationModule_DeveloperListenerManagerFactory(applicationModule, interfaceC32462OooO00o);
    }

    public static DeveloperListenerManager developerListenerManager(ApplicationModule applicationModule, Executor executor) {
        return (DeveloperListenerManager) Preconditions.checkNotNullFromProvides(applicationModule.developerListenerManager(executor));
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public DeveloperListenerManager get() {
        return developerListenerManager(this.module, this.backgroundExecutorProvider.get());
    }
}
