package com.google.firebase.inappmessaging.internal;

import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import java.util.concurrent.Executor;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class AbtIntegrationHelper_Factory implements Factory<AbtIntegrationHelper> {
    private final InterfaceC32462OooO00o<FirebaseABTesting> abTestingProvider;
    private final InterfaceC32462OooO00o<Executor> blockingExecutorProvider;

    public AbtIntegrationHelper_Factory(InterfaceC32462OooO00o<FirebaseABTesting> interfaceC32462OooO00o, InterfaceC32462OooO00o<Executor> interfaceC32462OooO00o2) {
        this.abTestingProvider = interfaceC32462OooO00o;
        this.blockingExecutorProvider = interfaceC32462OooO00o2;
    }

    public static AbtIntegrationHelper_Factory create(InterfaceC32462OooO00o<FirebaseABTesting> interfaceC32462OooO00o, InterfaceC32462OooO00o<Executor> interfaceC32462OooO00o2) {
        return new AbtIntegrationHelper_Factory(interfaceC32462OooO00o, interfaceC32462OooO00o2);
    }

    public static AbtIntegrationHelper newInstance(FirebaseABTesting firebaseABTesting, Executor executor) {
        return new AbtIntegrationHelper(firebaseABTesting, executor);
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public AbtIntegrationHelper get() {
        return newInstance(this.abTestingProvider.get(), this.blockingExecutorProvider.get());
    }
}
