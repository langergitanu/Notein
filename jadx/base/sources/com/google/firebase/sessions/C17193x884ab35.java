package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Preconditions;
import com.google.firebase.sessions.settings.SessionConfigs;
import oO00ooO0.InterfaceC32462OooO00o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: com.google.firebase.sessions.FirebaseSessionsComponent_MainModule_Companion_SessionConfigsDataStoreFactory */
/* JADX INFO: loaded from: classes8.dex */
public final class C17193x884ab35 implements Factory<o0000o0O.OooOO0<SessionConfigs>> {
    private final InterfaceC32462OooO00o<Context> appContextProvider;
    private final InterfaceC32462OooO00o<InterfaceC34415OooO0oo> blockingDispatcherProvider;

    public C17193x884ab35(InterfaceC32462OooO00o<Context> interfaceC32462OooO00o, InterfaceC32462OooO00o<InterfaceC34415OooO0oo> interfaceC32462OooO00o2) {
        this.appContextProvider = interfaceC32462OooO00o;
        this.blockingDispatcherProvider = interfaceC32462OooO00o2;
    }

    public static C17193x884ab35 create(InterfaceC32462OooO00o<Context> interfaceC32462OooO00o, InterfaceC32462OooO00o<InterfaceC34415OooO0oo> interfaceC32462OooO00o2) {
        return new C17193x884ab35(interfaceC32462OooO00o, interfaceC32462OooO00o2);
    }

    public static o0000o0O.OooOO0<SessionConfigs> sessionConfigsDataStore(Context context, InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        return (o0000o0O.OooOO0) Preconditions.checkNotNullFromProvides(FirebaseSessionsComponent.MainModule.INSTANCE.sessionConfigsDataStore(context, interfaceC34415OooO0oo));
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public o0000o0O.OooOO0<SessionConfigs> get() {
        return sessionConfigsDataStore(this.appContextProvider.get(), this.blockingDispatcherProvider.get());
    }
}
