package com.google.firebase.sessions;

import com.google.firebase.sessions.dagger.internal.Factory;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class SessionGenerator_Factory implements Factory<SessionGenerator> {
    private final InterfaceC32462OooO00o<TimeProvider> timeProvider;
    private final InterfaceC32462OooO00o<UuidGenerator> uuidGeneratorProvider;

    public SessionGenerator_Factory(InterfaceC32462OooO00o<TimeProvider> interfaceC32462OooO00o, InterfaceC32462OooO00o<UuidGenerator> interfaceC32462OooO00o2) {
        this.timeProvider = interfaceC32462OooO00o;
        this.uuidGeneratorProvider = interfaceC32462OooO00o2;
    }

    public static SessionGenerator_Factory create(InterfaceC32462OooO00o<TimeProvider> interfaceC32462OooO00o, InterfaceC32462OooO00o<UuidGenerator> interfaceC32462OooO00o2) {
        return new SessionGenerator_Factory(interfaceC32462OooO00o, interfaceC32462OooO00o2);
    }

    public static SessionGenerator newInstance(TimeProvider timeProvider, UuidGenerator uuidGenerator) {
        return new SessionGenerator(timeProvider, uuidGenerator);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public SessionGenerator get() {
        return newInstance(this.timeProvider.get(), this.uuidGeneratorProvider.get());
    }
}
