package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.events.Subscriber;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.internal.DataCollectionHelper;
import com.google.firebase.inappmessaging.internal.SharedPreferencesUtils;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class ApiClientModule_ProvidesDataCollectionHelperFactory implements Factory<DataCollectionHelper> {
    private final InterfaceC32462OooO00o<Subscriber> firebaseEventSubscriberProvider;
    private final ApiClientModule module;
    private final InterfaceC32462OooO00o<SharedPreferencesUtils> sharedPreferencesUtilsProvider;

    public ApiClientModule_ProvidesDataCollectionHelperFactory(ApiClientModule apiClientModule, InterfaceC32462OooO00o<SharedPreferencesUtils> interfaceC32462OooO00o, InterfaceC32462OooO00o<Subscriber> interfaceC32462OooO00o2) {
        this.module = apiClientModule;
        this.sharedPreferencesUtilsProvider = interfaceC32462OooO00o;
        this.firebaseEventSubscriberProvider = interfaceC32462OooO00o2;
    }

    public static ApiClientModule_ProvidesDataCollectionHelperFactory create(ApiClientModule apiClientModule, InterfaceC32462OooO00o<SharedPreferencesUtils> interfaceC32462OooO00o, InterfaceC32462OooO00o<Subscriber> interfaceC32462OooO00o2) {
        return new ApiClientModule_ProvidesDataCollectionHelperFactory(apiClientModule, interfaceC32462OooO00o, interfaceC32462OooO00o2);
    }

    public static DataCollectionHelper providesDataCollectionHelper(ApiClientModule apiClientModule, SharedPreferencesUtils sharedPreferencesUtils, Subscriber subscriber) {
        return (DataCollectionHelper) Preconditions.checkNotNullFromProvides(apiClientModule.providesDataCollectionHelper(sharedPreferencesUtils, subscriber));
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public DataCollectionHelper get() {
        return providesDataCollectionHelper(this.module, this.sharedPreferencesUtilsProvider.get(), this.firebaseEventSubscriberProvider.get());
    }
}
