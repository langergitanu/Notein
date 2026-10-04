package com.google.firebase.functions;

import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.functions.dagger.internal.Factory;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.concurrent.Executor;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class FirebaseContextProvider_Factory implements Factory<FirebaseContextProvider> {
    private final InterfaceC32462OooO00o<Deferred<InteropAppCheckTokenProvider>> appCheckDeferredProvider;
    private final InterfaceC32462OooO00o<Executor> executorProvider;
    private final InterfaceC32462OooO00o<Provider<FirebaseInstanceIdInternal>> instanceIdProvider;
    private final InterfaceC32462OooO00o<Provider<InternalAuthProvider>> tokenProvider;

    public FirebaseContextProvider_Factory(InterfaceC32462OooO00o<Provider<InternalAuthProvider>> interfaceC32462OooO00o, InterfaceC32462OooO00o<Provider<FirebaseInstanceIdInternal>> interfaceC32462OooO00o2, InterfaceC32462OooO00o<Deferred<InteropAppCheckTokenProvider>> interfaceC32462OooO00o3, InterfaceC32462OooO00o<Executor> interfaceC32462OooO00o4) {
        this.tokenProvider = interfaceC32462OooO00o;
        this.instanceIdProvider = interfaceC32462OooO00o2;
        this.appCheckDeferredProvider = interfaceC32462OooO00o3;
        this.executorProvider = interfaceC32462OooO00o4;
    }

    public static FirebaseContextProvider_Factory create(InterfaceC32462OooO00o<Provider<InternalAuthProvider>> interfaceC32462OooO00o, InterfaceC32462OooO00o<Provider<FirebaseInstanceIdInternal>> interfaceC32462OooO00o2, InterfaceC32462OooO00o<Deferred<InteropAppCheckTokenProvider>> interfaceC32462OooO00o3, InterfaceC32462OooO00o<Executor> interfaceC32462OooO00o4) {
        return new FirebaseContextProvider_Factory(interfaceC32462OooO00o, interfaceC32462OooO00o2, interfaceC32462OooO00o3, interfaceC32462OooO00o4);
    }

    public static FirebaseContextProvider newInstance(Provider<InternalAuthProvider> provider, Provider<FirebaseInstanceIdInternal> provider2, Deferred<InteropAppCheckTokenProvider> deferred, Executor executor) {
        return new FirebaseContextProvider(provider, provider2, deferred, executor);
    }

    @Override // com.google.firebase.functions.dagger.internal.Factory, com.google.firebase.functions.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public FirebaseContextProvider get() {
        return newInstance(this.tokenProvider.get(), this.instanceIdProvider.get(), this.appCheckDeferredProvider.get(), this.executorProvider.get());
    }
}
