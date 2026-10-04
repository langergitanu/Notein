package com.google.firebase.sessions.settings;

import com.google.firebase.sessions.dagger.internal.Factory;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class SessionsSettings_Factory implements Factory<SessionsSettings> {
    private final InterfaceC32462OooO00o<SettingsProvider> localOverrideSettingsProvider;
    private final InterfaceC32462OooO00o<SettingsProvider> remoteSettingsProvider;

    public SessionsSettings_Factory(InterfaceC32462OooO00o<SettingsProvider> interfaceC32462OooO00o, InterfaceC32462OooO00o<SettingsProvider> interfaceC32462OooO00o2) {
        this.localOverrideSettingsProvider = interfaceC32462OooO00o;
        this.remoteSettingsProvider = interfaceC32462OooO00o2;
    }

    public static SessionsSettings_Factory create(InterfaceC32462OooO00o<SettingsProvider> interfaceC32462OooO00o, InterfaceC32462OooO00o<SettingsProvider> interfaceC32462OooO00o2) {
        return new SessionsSettings_Factory(interfaceC32462OooO00o, interfaceC32462OooO00o2);
    }

    public static SessionsSettings newInstance(SettingsProvider settingsProvider, SettingsProvider settingsProvider2) {
        return new SessionsSettings(settingsProvider, settingsProvider2);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public SessionsSettings get() {
        return newInstance(this.localOverrideSettingsProvider.get(), this.remoteSettingsProvider.get());
    }
}
