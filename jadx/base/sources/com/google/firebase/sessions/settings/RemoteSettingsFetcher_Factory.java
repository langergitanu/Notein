package com.google.firebase.sessions.settings;

import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.dagger.internal.Factory;
import oO00ooO0.InterfaceC32462OooO00o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes8.dex */
public final class RemoteSettingsFetcher_Factory implements Factory<RemoteSettingsFetcher> {
    private final InterfaceC32462OooO00o<ApplicationInfo> appInfoProvider;
    private final InterfaceC32462OooO00o<InterfaceC34415OooO0oo> blockingDispatcherProvider;

    public RemoteSettingsFetcher_Factory(InterfaceC32462OooO00o<ApplicationInfo> interfaceC32462OooO00o, InterfaceC32462OooO00o<InterfaceC34415OooO0oo> interfaceC32462OooO00o2) {
        this.appInfoProvider = interfaceC32462OooO00o;
        this.blockingDispatcherProvider = interfaceC32462OooO00o2;
    }

    public static RemoteSettingsFetcher_Factory create(InterfaceC32462OooO00o<ApplicationInfo> interfaceC32462OooO00o, InterfaceC32462OooO00o<InterfaceC34415OooO0oo> interfaceC32462OooO00o2) {
        return new RemoteSettingsFetcher_Factory(interfaceC32462OooO00o, interfaceC32462OooO00o2);
    }

    public static RemoteSettingsFetcher newInstance(ApplicationInfo applicationInfo, InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        return new RemoteSettingsFetcher(applicationInfo, interfaceC34415OooO0oo);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public RemoteSettingsFetcher get() {
        return newInstance(this.appInfoProvider.get(), this.blockingDispatcherProvider.get());
    }
}
