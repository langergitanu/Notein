package com.google.firebase.inappmessaging.display.internal;

import com.bumptech.glide.OooOOO0;
import com.google.firebase.inappmessaging.display.dagger.internal.Factory;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class FiamImageLoader_Factory implements Factory<FiamImageLoader> {
    private final InterfaceC32462OooO00o<OooOOO0> requestManagerProvider;

    public FiamImageLoader_Factory(InterfaceC32462OooO00o<OooOOO0> interfaceC32462OooO00o) {
        this.requestManagerProvider = interfaceC32462OooO00o;
    }

    public static FiamImageLoader_Factory create(InterfaceC32462OooO00o<OooOOO0> interfaceC32462OooO00o) {
        return new FiamImageLoader_Factory(interfaceC32462OooO00o);
    }

    public static FiamImageLoader newInstance(OooOOO0 oooOOO0) {
        return new FiamImageLoader(oooOOO0);
    }

    @Override // com.google.firebase.inappmessaging.display.dagger.internal.Factory, com.google.firebase.inappmessaging.display.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public FiamImageLoader get() {
        return newInstance(this.requestManagerProvider.get());
    }
}
