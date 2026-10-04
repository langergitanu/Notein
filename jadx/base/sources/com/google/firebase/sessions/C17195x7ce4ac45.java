package com.google.firebase.sessions;

import com.google.firebase.sessions.FirebaseSessionsComponent;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Preconditions;

/* JADX INFO: renamed from: com.google.firebase.sessions.FirebaseSessionsComponent_MainModule_Companion_TimeProviderFactory */
/* JADX INFO: loaded from: classes8.dex */
public final class C17195x7ce4ac45 implements Factory<TimeProvider> {

    /* JADX INFO: renamed from: com.google.firebase.sessions.FirebaseSessionsComponent_MainModule_Companion_TimeProviderFactory$InstanceHolder */
    public static final class InstanceHolder {
        private static final C17195x7ce4ac45 INSTANCE = new C17195x7ce4ac45();

        private InstanceHolder() {
        }
    }

    public static C17195x7ce4ac45 create() {
        return InstanceHolder.INSTANCE;
    }

    public static TimeProvider timeProvider() {
        return (TimeProvider) Preconditions.checkNotNullFromProvides(FirebaseSessionsComponent.MainModule.INSTANCE.timeProvider());
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public TimeProvider get() {
        return timeProvider();
    }
}
