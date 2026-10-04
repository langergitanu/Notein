package com.google.firebase.functions;

import com.google.firebase.functions.FunctionsMultiResourceComponent;
import com.google.firebase.functions.dagger.internal.InstanceFactory;
import com.google.firebase.functions.dagger.internal.Provider;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class FunctionsMultiResourceComponent_FirebaseFunctionsFactory_Impl implements FunctionsMultiResourceComponent.FirebaseFunctionsFactory {
    private final FirebaseFunctions_Factory delegateFactory;

    public FunctionsMultiResourceComponent_FirebaseFunctionsFactory_Impl(FirebaseFunctions_Factory firebaseFunctions_Factory) {
        this.delegateFactory = firebaseFunctions_Factory;
    }

    public static Provider<FunctionsMultiResourceComponent.FirebaseFunctionsFactory> createFactoryProvider(FirebaseFunctions_Factory firebaseFunctions_Factory) {
        return InstanceFactory.create(new FunctionsMultiResourceComponent_FirebaseFunctionsFactory_Impl(firebaseFunctions_Factory));
    }

    @Override // com.google.firebase.functions.FunctionsMultiResourceComponent.FirebaseFunctionsFactory
    public FirebaseFunctions create(String str) {
        return this.delegateFactory.get(str);
    }

    public static InterfaceC32462OooO00o<FunctionsMultiResourceComponent.FirebaseFunctionsFactory> create(FirebaseFunctions_Factory firebaseFunctions_Factory) {
        return InstanceFactory.create(new FunctionsMultiResourceComponent_FirebaseFunctionsFactory_Impl(firebaseFunctions_Factory));
    }
}
