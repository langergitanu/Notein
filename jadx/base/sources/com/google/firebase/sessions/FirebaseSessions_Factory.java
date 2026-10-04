package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.settings.SessionsSettings;
import oO00ooO0.InterfaceC32462OooO00o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes8.dex */
public final class FirebaseSessions_Factory implements Factory<FirebaseSessions> {
    private final InterfaceC32462OooO00o<InterfaceC34415OooO0oo> backgroundDispatcherProvider;
    private final InterfaceC32462OooO00o<FirebaseApp> firebaseAppProvider;
    private final InterfaceC32462OooO00o<SessionsActivityLifecycleCallbacks> sessionsActivityLifecycleCallbacksProvider;
    private final InterfaceC32462OooO00o<SessionsSettings> settingsProvider;

    public FirebaseSessions_Factory(InterfaceC32462OooO00o<FirebaseApp> interfaceC32462OooO00o, InterfaceC32462OooO00o<SessionsSettings> interfaceC32462OooO00o2, InterfaceC32462OooO00o<InterfaceC34415OooO0oo> interfaceC32462OooO00o3, InterfaceC32462OooO00o<SessionsActivityLifecycleCallbacks> interfaceC32462OooO00o4) {
        this.firebaseAppProvider = interfaceC32462OooO00o;
        this.settingsProvider = interfaceC32462OooO00o2;
        this.backgroundDispatcherProvider = interfaceC32462OooO00o3;
        this.sessionsActivityLifecycleCallbacksProvider = interfaceC32462OooO00o4;
    }

    public static FirebaseSessions_Factory create(InterfaceC32462OooO00o<FirebaseApp> interfaceC32462OooO00o, InterfaceC32462OooO00o<SessionsSettings> interfaceC32462OooO00o2, InterfaceC32462OooO00o<InterfaceC34415OooO0oo> interfaceC32462OooO00o3, InterfaceC32462OooO00o<SessionsActivityLifecycleCallbacks> interfaceC32462OooO00o4) {
        return new FirebaseSessions_Factory(interfaceC32462OooO00o, interfaceC32462OooO00o2, interfaceC32462OooO00o3, interfaceC32462OooO00o4);
    }

    public static FirebaseSessions newInstance(FirebaseApp firebaseApp, SessionsSettings sessionsSettings, InterfaceC34415OooO0oo interfaceC34415OooO0oo, SessionsActivityLifecycleCallbacks sessionsActivityLifecycleCallbacks) {
        return new FirebaseSessions(firebaseApp, sessionsSettings, interfaceC34415OooO0oo, sessionsActivityLifecycleCallbacks);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public FirebaseSessions get() {
        return newInstance(this.firebaseAppProvider.get(), this.settingsProvider.get(), this.backgroundDispatcherProvider.get(), this.sessionsActivityLifecycleCallbacksProvider.get());
    }
}
