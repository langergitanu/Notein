package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Preconditions;
import oO00ooO0.InterfaceC32462OooO00o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: com.google.firebase.sessions.FirebaseSessionsComponent_MainModule_Companion_SessionDataStoreFactory */
/* JADX INFO: loaded from: classes8.dex */
public final class C17194xa7e684e2 implements Factory<o0000o0O.OooOO0<SessionData>> {
    private final InterfaceC32462OooO00o<Context> appContextProvider;
    private final InterfaceC32462OooO00o<InterfaceC34415OooO0oo> blockingDispatcherProvider;
    private final InterfaceC32462OooO00o<SessionDataSerializer> sessionDataSerializerProvider;

    public C17194xa7e684e2(InterfaceC32462OooO00o<Context> interfaceC32462OooO00o, InterfaceC32462OooO00o<InterfaceC34415OooO0oo> interfaceC32462OooO00o2, InterfaceC32462OooO00o<SessionDataSerializer> interfaceC32462OooO00o3) {
        this.appContextProvider = interfaceC32462OooO00o;
        this.blockingDispatcherProvider = interfaceC32462OooO00o2;
        this.sessionDataSerializerProvider = interfaceC32462OooO00o3;
    }

    public static C17194xa7e684e2 create(InterfaceC32462OooO00o<Context> interfaceC32462OooO00o, InterfaceC32462OooO00o<InterfaceC34415OooO0oo> interfaceC32462OooO00o2, InterfaceC32462OooO00o<SessionDataSerializer> interfaceC32462OooO00o3) {
        return new C17194xa7e684e2(interfaceC32462OooO00o, interfaceC32462OooO00o2, interfaceC32462OooO00o3);
    }

    public static o0000o0O.OooOO0<SessionData> sessionDataStore(Context context, InterfaceC34415OooO0oo interfaceC34415OooO0oo, SessionDataSerializer sessionDataSerializer) {
        return (o0000o0O.OooOO0) Preconditions.checkNotNullFromProvides(FirebaseSessionsComponent.MainModule.INSTANCE.sessionDataStore(context, interfaceC34415OooO0oo, sessionDataSerializer));
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public o0000o0O.OooOO0<SessionData> get() {
        return sessionDataStore(this.appContextProvider.get(), this.blockingDispatcherProvider.get(), this.sessionDataSerializerProvider.get());
    }
}
