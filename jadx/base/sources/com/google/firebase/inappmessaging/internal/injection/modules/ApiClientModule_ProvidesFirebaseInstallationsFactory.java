package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import com.google.firebase.installations.FirebaseInstallationsApi;

/* JADX INFO: loaded from: classes8.dex */
public final class ApiClientModule_ProvidesFirebaseInstallationsFactory implements Factory<FirebaseInstallationsApi> {
    private final ApiClientModule module;

    public ApiClientModule_ProvidesFirebaseInstallationsFactory(ApiClientModule apiClientModule) {
        this.module = apiClientModule;
    }

    public static ApiClientModule_ProvidesFirebaseInstallationsFactory create(ApiClientModule apiClientModule) {
        return new ApiClientModule_ProvidesFirebaseInstallationsFactory(apiClientModule);
    }

    public static FirebaseInstallationsApi providesFirebaseInstallations(ApiClientModule apiClientModule) {
        return (FirebaseInstallationsApi) Preconditions.checkNotNullFromProvides(apiClientModule.providesFirebaseInstallations());
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public FirebaseInstallationsApi get() {
        return providesFirebaseInstallations(this.module);
    }
}
