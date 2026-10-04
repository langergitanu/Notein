package com.google.firebase.sessions;

import com.google.firebase.sessions.dagger.internal.Factory;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class SessionsActivityLifecycleCallbacks_Factory implements Factory<SessionsActivityLifecycleCallbacks> {
    private final InterfaceC32462OooO00o<SharedSessionRepository> sharedSessionRepositoryProvider;

    public SessionsActivityLifecycleCallbacks_Factory(InterfaceC32462OooO00o<SharedSessionRepository> interfaceC32462OooO00o) {
        this.sharedSessionRepositoryProvider = interfaceC32462OooO00o;
    }

    public static SessionsActivityLifecycleCallbacks_Factory create(InterfaceC32462OooO00o<SharedSessionRepository> interfaceC32462OooO00o) {
        return new SessionsActivityLifecycleCallbacks_Factory(interfaceC32462OooO00o);
    }

    public static SessionsActivityLifecycleCallbacks newInstance(SharedSessionRepository sharedSessionRepository) {
        return new SessionsActivityLifecycleCallbacks(sharedSessionRepository);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public SessionsActivityLifecycleCallbacks get() {
        return newInstance(this.sharedSessionRepositoryProvider.get());
    }
}
