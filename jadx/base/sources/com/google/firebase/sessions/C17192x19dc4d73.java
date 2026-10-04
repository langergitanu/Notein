package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Preconditions;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: renamed from: com.google.firebase.sessions.FirebaseSessionsComponent_MainModule_Companion_ApplicationInfoFactory */
/* JADX INFO: loaded from: classes8.dex */
public final class C17192x19dc4d73 implements Factory<ApplicationInfo> {
    private final InterfaceC32462OooO00o<FirebaseApp> firebaseAppProvider;

    public C17192x19dc4d73(InterfaceC32462OooO00o<FirebaseApp> interfaceC32462OooO00o) {
        this.firebaseAppProvider = interfaceC32462OooO00o;
    }

    public static ApplicationInfo applicationInfo(FirebaseApp firebaseApp) {
        return (ApplicationInfo) Preconditions.checkNotNullFromProvides(FirebaseSessionsComponent.MainModule.INSTANCE.applicationInfo(firebaseApp));
    }

    public static C17192x19dc4d73 create(InterfaceC32462OooO00o<FirebaseApp> interfaceC32462OooO00o) {
        return new C17192x19dc4d73(interfaceC32462OooO00o);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public ApplicationInfo get() {
        return applicationInfo(this.firebaseAppProvider.get());
    }
}
