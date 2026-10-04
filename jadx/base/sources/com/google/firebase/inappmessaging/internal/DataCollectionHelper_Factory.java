package com.google.firebase.inappmessaging.internal;

import com.google.firebase.FirebaseApp;
import com.google.firebase.events.Subscriber;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class DataCollectionHelper_Factory implements Factory<DataCollectionHelper> {
    private final InterfaceC32462OooO00o<FirebaseApp> firebaseAppProvider;
    private final InterfaceC32462OooO00o<Subscriber> firebaseEventsSubscriberProvider;
    private final InterfaceC32462OooO00o<SharedPreferencesUtils> sharedPreferencesUtilsProvider;

    public DataCollectionHelper_Factory(InterfaceC32462OooO00o<FirebaseApp> interfaceC32462OooO00o, InterfaceC32462OooO00o<SharedPreferencesUtils> interfaceC32462OooO00o2, InterfaceC32462OooO00o<Subscriber> interfaceC32462OooO00o3) {
        this.firebaseAppProvider = interfaceC32462OooO00o;
        this.sharedPreferencesUtilsProvider = interfaceC32462OooO00o2;
        this.firebaseEventsSubscriberProvider = interfaceC32462OooO00o3;
    }

    public static DataCollectionHelper_Factory create(InterfaceC32462OooO00o<FirebaseApp> interfaceC32462OooO00o, InterfaceC32462OooO00o<SharedPreferencesUtils> interfaceC32462OooO00o2, InterfaceC32462OooO00o<Subscriber> interfaceC32462OooO00o3) {
        return new DataCollectionHelper_Factory(interfaceC32462OooO00o, interfaceC32462OooO00o2, interfaceC32462OooO00o3);
    }

    public static DataCollectionHelper newInstance(FirebaseApp firebaseApp, SharedPreferencesUtils sharedPreferencesUtils, Subscriber subscriber) {
        return new DataCollectionHelper(firebaseApp, sharedPreferencesUtils, subscriber);
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public DataCollectionHelper get() {
        return newInstance(this.firebaseAppProvider.get(), this.sharedPreferencesUtilsProvider.get(), this.firebaseEventsSubscriberProvider.get());
    }
}
