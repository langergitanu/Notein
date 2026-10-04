package com.google.firebase.functions;

import com.google.firebase.functions.FunctionsMultiResourceComponent;
import com.google.firebase.functions.dagger.internal.Factory;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class FunctionsMultiResourceComponent_Factory implements Factory<FunctionsMultiResourceComponent> {
    private final InterfaceC32462OooO00o<FunctionsMultiResourceComponent.FirebaseFunctionsFactory> functionsFactoryProvider;

    public FunctionsMultiResourceComponent_Factory(InterfaceC32462OooO00o<FunctionsMultiResourceComponent.FirebaseFunctionsFactory> interfaceC32462OooO00o) {
        this.functionsFactoryProvider = interfaceC32462OooO00o;
    }

    public static FunctionsMultiResourceComponent_Factory create(InterfaceC32462OooO00o<FunctionsMultiResourceComponent.FirebaseFunctionsFactory> interfaceC32462OooO00o) {
        return new FunctionsMultiResourceComponent_Factory(interfaceC32462OooO00o);
    }

    public static FunctionsMultiResourceComponent newInstance(FunctionsMultiResourceComponent.FirebaseFunctionsFactory firebaseFunctionsFactory) {
        return new FunctionsMultiResourceComponent(firebaseFunctionsFactory);
    }

    @Override // com.google.firebase.functions.dagger.internal.Factory, com.google.firebase.functions.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public FunctionsMultiResourceComponent get() {
        return newInstance(this.functionsFactoryProvider.get());
    }
}
