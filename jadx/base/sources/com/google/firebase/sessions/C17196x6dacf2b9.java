package com.google.firebase.sessions;

import com.google.firebase.sessions.FirebaseSessionsComponent;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Preconditions;

/* JADX INFO: renamed from: com.google.firebase.sessions.FirebaseSessionsComponent_MainModule_Companion_UuidGeneratorFactory */
/* JADX INFO: loaded from: classes8.dex */
public final class C17196x6dacf2b9 implements Factory<UuidGenerator> {

    /* JADX INFO: renamed from: com.google.firebase.sessions.FirebaseSessionsComponent_MainModule_Companion_UuidGeneratorFactory$InstanceHolder */
    public static final class InstanceHolder {
        private static final C17196x6dacf2b9 INSTANCE = new C17196x6dacf2b9();

        private InstanceHolder() {
        }
    }

    public static C17196x6dacf2b9 create() {
        return InstanceHolder.INSTANCE;
    }

    public static UuidGenerator uuidGenerator() {
        return (UuidGenerator) Preconditions.checkNotNullFromProvides(FirebaseSessionsComponent.MainModule.INSTANCE.uuidGenerator());
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public UuidGenerator get() {
        return uuidGenerator();
    }
}
