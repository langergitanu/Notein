package com.google.firebase.functions;

import com.google.firebase.FirebaseOptions;
import com.google.firebase.functions.FunctionsComponent;
import com.google.firebase.functions.dagger.internal.Factory;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class FunctionsComponent_MainModule_Companion_BindProjectIdFactory implements Factory<String> {
    private final InterfaceC32462OooO00o<FirebaseOptions> optionsProvider;

    public FunctionsComponent_MainModule_Companion_BindProjectIdFactory(InterfaceC32462OooO00o<FirebaseOptions> interfaceC32462OooO00o) {
        this.optionsProvider = interfaceC32462OooO00o;
    }

    public static String bindProjectId(FirebaseOptions firebaseOptions) {
        return FunctionsComponent.MainModule.INSTANCE.bindProjectId(firebaseOptions);
    }

    public static FunctionsComponent_MainModule_Companion_BindProjectIdFactory create(InterfaceC32462OooO00o<FirebaseOptions> interfaceC32462OooO00o) {
        return new FunctionsComponent_MainModule_Companion_BindProjectIdFactory(interfaceC32462OooO00o);
    }

    @Override // com.google.firebase.functions.dagger.internal.Factory, com.google.firebase.functions.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public String get() {
        return bindProjectId(this.optionsProvider.get());
    }
}
