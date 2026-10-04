package com.google.firebase.sessions.dagger.internal;

import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class Providers {
    private Providers() {
    }

    public static <T> Provider<T> asDaggerProvider(final InterfaceC32462OooO00o<T> interfaceC32462OooO00o) {
        Preconditions.checkNotNull(interfaceC32462OooO00o);
        return new Provider<T>() { // from class: com.google.firebase.sessions.dagger.internal.Providers.1
            @Override // com.google.firebase.sessions.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
            public T get() {
                return (T) interfaceC32462OooO00o.get();
            }
        };
    }
}
