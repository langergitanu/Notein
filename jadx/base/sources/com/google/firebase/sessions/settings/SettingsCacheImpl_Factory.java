package com.google.firebase.sessions.settings;

import com.google.firebase.sessions.TimeProvider;
import com.google.firebase.sessions.dagger.internal.Factory;
import o0000o0O.OooOO0;
import oO00ooO0.InterfaceC32462OooO00o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes8.dex */
public final class SettingsCacheImpl_Factory implements Factory<SettingsCacheImpl> {
    private final InterfaceC32462OooO00o<InterfaceC34415OooO0oo> backgroundDispatcherProvider;
    private final InterfaceC32462OooO00o<OooOO0<SessionConfigs>> sessionConfigsDataStoreProvider;
    private final InterfaceC32462OooO00o<TimeProvider> timeProvider;

    public SettingsCacheImpl_Factory(InterfaceC32462OooO00o<InterfaceC34415OooO0oo> interfaceC32462OooO00o, InterfaceC32462OooO00o<TimeProvider> interfaceC32462OooO00o2, InterfaceC32462OooO00o<OooOO0<SessionConfigs>> interfaceC32462OooO00o3) {
        this.backgroundDispatcherProvider = interfaceC32462OooO00o;
        this.timeProvider = interfaceC32462OooO00o2;
        this.sessionConfigsDataStoreProvider = interfaceC32462OooO00o3;
    }

    public static SettingsCacheImpl_Factory create(InterfaceC32462OooO00o<InterfaceC34415OooO0oo> interfaceC32462OooO00o, InterfaceC32462OooO00o<TimeProvider> interfaceC32462OooO00o2, InterfaceC32462OooO00o<OooOO0<SessionConfigs>> interfaceC32462OooO00o3) {
        return new SettingsCacheImpl_Factory(interfaceC32462OooO00o, interfaceC32462OooO00o2, interfaceC32462OooO00o3);
    }

    public static SettingsCacheImpl newInstance(InterfaceC34415OooO0oo interfaceC34415OooO0oo, TimeProvider timeProvider, OooOO0<SessionConfigs> oooOO02) {
        return new SettingsCacheImpl(interfaceC34415OooO0oo, timeProvider, oooOO02);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public SettingsCacheImpl get() {
        return newInstance(this.backgroundDispatcherProvider.get(), this.timeProvider.get(), this.sessionConfigsDataStoreProvider.get());
    }
}
