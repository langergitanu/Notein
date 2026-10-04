package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.sessions.dagger.internal.Factory;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class ProcessDataManagerImpl_Factory implements Factory<ProcessDataManagerImpl> {
    private final InterfaceC32462OooO00o<Context> appContextProvider;
    private final InterfaceC32462OooO00o<UuidGenerator> uuidGeneratorProvider;

    public ProcessDataManagerImpl_Factory(InterfaceC32462OooO00o<Context> interfaceC32462OooO00o, InterfaceC32462OooO00o<UuidGenerator> interfaceC32462OooO00o2) {
        this.appContextProvider = interfaceC32462OooO00o;
        this.uuidGeneratorProvider = interfaceC32462OooO00o2;
    }

    public static ProcessDataManagerImpl_Factory create(InterfaceC32462OooO00o<Context> interfaceC32462OooO00o, InterfaceC32462OooO00o<UuidGenerator> interfaceC32462OooO00o2) {
        return new ProcessDataManagerImpl_Factory(interfaceC32462OooO00o, interfaceC32462OooO00o2);
    }

    public static ProcessDataManagerImpl newInstance(Context context, UuidGenerator uuidGenerator) {
        return new ProcessDataManagerImpl(context, uuidGenerator);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public ProcessDataManagerImpl get() {
        return newInstance(this.appContextProvider.get(), this.uuidGeneratorProvider.get());
    }
}
