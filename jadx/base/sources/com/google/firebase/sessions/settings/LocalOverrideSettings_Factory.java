package com.google.firebase.sessions.settings;

import android.content.Context;
import com.google.firebase.sessions.dagger.internal.Factory;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class LocalOverrideSettings_Factory implements Factory<LocalOverrideSettings> {
    private final InterfaceC32462OooO00o<Context> appContextProvider;

    public LocalOverrideSettings_Factory(InterfaceC32462OooO00o<Context> interfaceC32462OooO00o) {
        this.appContextProvider = interfaceC32462OooO00o;
    }

    public static LocalOverrideSettings_Factory create(InterfaceC32462OooO00o<Context> interfaceC32462OooO00o) {
        return new LocalOverrideSettings_Factory(interfaceC32462OooO00o);
    }

    public static LocalOverrideSettings newInstance(Context context) {
        return new LocalOverrideSettings(context);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public LocalOverrideSettings get() {
        return newInstance(this.appContextProvider.get());
    }
}
