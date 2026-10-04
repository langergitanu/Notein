package com.google.firebase.sessions;

import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.settings.SessionsSettings;
import oO00ooO0.InterfaceC32462OooO00o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes8.dex */
public final class SharedSessionRepositoryImpl_Factory implements Factory<SharedSessionRepositoryImpl> {
    private final InterfaceC32462OooO00o<InterfaceC34415OooO0oo> backgroundDispatcherProvider;
    private final InterfaceC32462OooO00o<ProcessDataManager> processDataManagerProvider;
    private final InterfaceC32462OooO00o<o0000o0O.OooOO0<SessionData>> sessionDataStoreProvider;
    private final InterfaceC32462OooO00o<SessionFirelogPublisher> sessionFirelogPublisherProvider;
    private final InterfaceC32462OooO00o<SessionGenerator> sessionGeneratorProvider;
    private final InterfaceC32462OooO00o<SessionsSettings> sessionsSettingsProvider;
    private final InterfaceC32462OooO00o<TimeProvider> timeProvider;

    public SharedSessionRepositoryImpl_Factory(InterfaceC32462OooO00o<SessionsSettings> interfaceC32462OooO00o, InterfaceC32462OooO00o<SessionGenerator> interfaceC32462OooO00o2, InterfaceC32462OooO00o<SessionFirelogPublisher> interfaceC32462OooO00o3, InterfaceC32462OooO00o<TimeProvider> interfaceC32462OooO00o4, InterfaceC32462OooO00o<o0000o0O.OooOO0<SessionData>> interfaceC32462OooO00o5, InterfaceC32462OooO00o<ProcessDataManager> interfaceC32462OooO00o6, InterfaceC32462OooO00o<InterfaceC34415OooO0oo> interfaceC32462OooO00o7) {
        this.sessionsSettingsProvider = interfaceC32462OooO00o;
        this.sessionGeneratorProvider = interfaceC32462OooO00o2;
        this.sessionFirelogPublisherProvider = interfaceC32462OooO00o3;
        this.timeProvider = interfaceC32462OooO00o4;
        this.sessionDataStoreProvider = interfaceC32462OooO00o5;
        this.processDataManagerProvider = interfaceC32462OooO00o6;
        this.backgroundDispatcherProvider = interfaceC32462OooO00o7;
    }

    public static SharedSessionRepositoryImpl_Factory create(InterfaceC32462OooO00o<SessionsSettings> interfaceC32462OooO00o, InterfaceC32462OooO00o<SessionGenerator> interfaceC32462OooO00o2, InterfaceC32462OooO00o<SessionFirelogPublisher> interfaceC32462OooO00o3, InterfaceC32462OooO00o<TimeProvider> interfaceC32462OooO00o4, InterfaceC32462OooO00o<o0000o0O.OooOO0<SessionData>> interfaceC32462OooO00o5, InterfaceC32462OooO00o<ProcessDataManager> interfaceC32462OooO00o6, InterfaceC32462OooO00o<InterfaceC34415OooO0oo> interfaceC32462OooO00o7) {
        return new SharedSessionRepositoryImpl_Factory(interfaceC32462OooO00o, interfaceC32462OooO00o2, interfaceC32462OooO00o3, interfaceC32462OooO00o4, interfaceC32462OooO00o5, interfaceC32462OooO00o6, interfaceC32462OooO00o7);
    }

    public static SharedSessionRepositoryImpl newInstance(SessionsSettings sessionsSettings, SessionGenerator sessionGenerator, SessionFirelogPublisher sessionFirelogPublisher, TimeProvider timeProvider, o0000o0O.OooOO0<SessionData> oooOO02, ProcessDataManager processDataManager, InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        return new SharedSessionRepositoryImpl(sessionsSettings, sessionGenerator, sessionFirelogPublisher, timeProvider, oooOO02, processDataManager, interfaceC34415OooO0oo);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public SharedSessionRepositoryImpl get() {
        return newInstance(this.sessionsSettingsProvider.get(), this.sessionGeneratorProvider.get(), this.sessionFirelogPublisherProvider.get(), this.timeProvider.get(), this.sessionDataStoreProvider.get(), this.processDataManagerProvider.get(), this.backgroundDispatcherProvider.get());
    }
}
