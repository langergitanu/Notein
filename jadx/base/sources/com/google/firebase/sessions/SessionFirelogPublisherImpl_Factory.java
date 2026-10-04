package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.settings.SessionsSettings;
import oO00ooO0.InterfaceC32462OooO00o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes8.dex */
public final class SessionFirelogPublisherImpl_Factory implements Factory<SessionFirelogPublisherImpl> {
    private final InterfaceC32462OooO00o<InterfaceC34415OooO0oo> backgroundDispatcherProvider;
    private final InterfaceC32462OooO00o<EventGDTLoggerInterface> eventGDTLoggerProvider;
    private final InterfaceC32462OooO00o<FirebaseApp> firebaseAppProvider;
    private final InterfaceC32462OooO00o<FirebaseInstallationsApi> firebaseInstallationsProvider;
    private final InterfaceC32462OooO00o<SessionsSettings> sessionSettingsProvider;

    public SessionFirelogPublisherImpl_Factory(InterfaceC32462OooO00o<FirebaseApp> interfaceC32462OooO00o, InterfaceC32462OooO00o<FirebaseInstallationsApi> interfaceC32462OooO00o2, InterfaceC32462OooO00o<SessionsSettings> interfaceC32462OooO00o3, InterfaceC32462OooO00o<EventGDTLoggerInterface> interfaceC32462OooO00o4, InterfaceC32462OooO00o<InterfaceC34415OooO0oo> interfaceC32462OooO00o5) {
        this.firebaseAppProvider = interfaceC32462OooO00o;
        this.firebaseInstallationsProvider = interfaceC32462OooO00o2;
        this.sessionSettingsProvider = interfaceC32462OooO00o3;
        this.eventGDTLoggerProvider = interfaceC32462OooO00o4;
        this.backgroundDispatcherProvider = interfaceC32462OooO00o5;
    }

    public static SessionFirelogPublisherImpl_Factory create(InterfaceC32462OooO00o<FirebaseApp> interfaceC32462OooO00o, InterfaceC32462OooO00o<FirebaseInstallationsApi> interfaceC32462OooO00o2, InterfaceC32462OooO00o<SessionsSettings> interfaceC32462OooO00o3, InterfaceC32462OooO00o<EventGDTLoggerInterface> interfaceC32462OooO00o4, InterfaceC32462OooO00o<InterfaceC34415OooO0oo> interfaceC32462OooO00o5) {
        return new SessionFirelogPublisherImpl_Factory(interfaceC32462OooO00o, interfaceC32462OooO00o2, interfaceC32462OooO00o3, interfaceC32462OooO00o4, interfaceC32462OooO00o5);
    }

    public static SessionFirelogPublisherImpl newInstance(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, SessionsSettings sessionsSettings, EventGDTLoggerInterface eventGDTLoggerInterface, InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        return new SessionFirelogPublisherImpl(firebaseApp, firebaseInstallationsApi, sessionsSettings, eventGDTLoggerInterface, interfaceC34415OooO0oo);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public SessionFirelogPublisherImpl get() {
        return newInstance(this.firebaseAppProvider.get(), this.firebaseInstallationsProvider.get(), this.sessionSettingsProvider.get(), this.eventGDTLoggerProvider.get(), this.backgroundDispatcherProvider.get());
    }
}
