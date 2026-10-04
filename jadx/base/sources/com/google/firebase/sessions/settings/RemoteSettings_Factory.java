package com.google.firebase.sessions.settings;

import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.TimeProvider;
import com.google.firebase.sessions.dagger.internal.Factory;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class RemoteSettings_Factory implements Factory<RemoteSettings> {
    private final InterfaceC32462OooO00o<ApplicationInfo> appInfoProvider;
    private final InterfaceC32462OooO00o<CrashlyticsSettingsFetcher> configsFetcherProvider;
    private final InterfaceC32462OooO00o<FirebaseInstallationsApi> firebaseInstallationsApiProvider;
    private final InterfaceC32462OooO00o<SettingsCache> settingsCacheProvider;
    private final InterfaceC32462OooO00o<TimeProvider> timeProvider;

    public RemoteSettings_Factory(InterfaceC32462OooO00o<TimeProvider> interfaceC32462OooO00o, InterfaceC32462OooO00o<FirebaseInstallationsApi> interfaceC32462OooO00o2, InterfaceC32462OooO00o<ApplicationInfo> interfaceC32462OooO00o3, InterfaceC32462OooO00o<CrashlyticsSettingsFetcher> interfaceC32462OooO00o4, InterfaceC32462OooO00o<SettingsCache> interfaceC32462OooO00o5) {
        this.timeProvider = interfaceC32462OooO00o;
        this.firebaseInstallationsApiProvider = interfaceC32462OooO00o2;
        this.appInfoProvider = interfaceC32462OooO00o3;
        this.configsFetcherProvider = interfaceC32462OooO00o4;
        this.settingsCacheProvider = interfaceC32462OooO00o5;
    }

    public static RemoteSettings_Factory create(InterfaceC32462OooO00o<TimeProvider> interfaceC32462OooO00o, InterfaceC32462OooO00o<FirebaseInstallationsApi> interfaceC32462OooO00o2, InterfaceC32462OooO00o<ApplicationInfo> interfaceC32462OooO00o3, InterfaceC32462OooO00o<CrashlyticsSettingsFetcher> interfaceC32462OooO00o4, InterfaceC32462OooO00o<SettingsCache> interfaceC32462OooO00o5) {
        return new RemoteSettings_Factory(interfaceC32462OooO00o, interfaceC32462OooO00o2, interfaceC32462OooO00o3, interfaceC32462OooO00o4, interfaceC32462OooO00o5);
    }

    public static RemoteSettings newInstance(TimeProvider timeProvider, FirebaseInstallationsApi firebaseInstallationsApi, ApplicationInfo applicationInfo, CrashlyticsSettingsFetcher crashlyticsSettingsFetcher, SettingsCache settingsCache) {
        return new RemoteSettings(timeProvider, firebaseInstallationsApi, applicationInfo, crashlyticsSettingsFetcher, settingsCache);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public RemoteSettings get() {
        return newInstance(this.timeProvider.get(), this.firebaseInstallationsApiProvider.get(), this.appInfoProvider.get(), this.configsFetcherProvider.get(), this.settingsCacheProvider.get());
    }
}
