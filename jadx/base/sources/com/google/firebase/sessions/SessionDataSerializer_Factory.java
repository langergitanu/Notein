package com.google.firebase.sessions;

import com.google.firebase.sessions.dagger.internal.Factory;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class SessionDataSerializer_Factory implements Factory<SessionDataSerializer> {
    private final InterfaceC32462OooO00o<SessionGenerator> sessionGeneratorProvider;

    public SessionDataSerializer_Factory(InterfaceC32462OooO00o<SessionGenerator> interfaceC32462OooO00o) {
        this.sessionGeneratorProvider = interfaceC32462OooO00o;
    }

    public static SessionDataSerializer_Factory create(InterfaceC32462OooO00o<SessionGenerator> interfaceC32462OooO00o) {
        return new SessionDataSerializer_Factory(interfaceC32462OooO00o);
    }

    public static SessionDataSerializer newInstance(SessionGenerator sessionGenerator) {
        return new SessionDataSerializer(sessionGenerator);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public SessionDataSerializer get() {
        return newInstance(this.sessionGeneratorProvider.get());
    }
}
