package com.google.firebase.inappmessaging.internal;

import com.google.firebase.FirebaseApp;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class SharedPreferencesUtils_Factory implements Factory<SharedPreferencesUtils> {
    private final InterfaceC32462OooO00o<FirebaseApp> firebaseAppProvider;

    public SharedPreferencesUtils_Factory(InterfaceC32462OooO00o<FirebaseApp> interfaceC32462OooO00o) {
        this.firebaseAppProvider = interfaceC32462OooO00o;
    }

    public static SharedPreferencesUtils_Factory create(InterfaceC32462OooO00o<FirebaseApp> interfaceC32462OooO00o) {
        return new SharedPreferencesUtils_Factory(interfaceC32462OooO00o);
    }

    public static SharedPreferencesUtils newInstance(FirebaseApp firebaseApp) {
        return new SharedPreferencesUtils(firebaseApp);
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public SharedPreferencesUtils get() {
        return newInstance(this.firebaseAppProvider.get());
    }
}
