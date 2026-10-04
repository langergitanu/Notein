package com.google.firebase.inappmessaging.display.internal;

import com.google.firebase.inappmessaging.display.dagger.internal.Factory;

/* JADX INFO: loaded from: classes8.dex */
public final class FiamAnimator_Factory implements Factory<FiamAnimator> {

    public static final class InstanceHolder {
        private static final FiamAnimator_Factory INSTANCE = new FiamAnimator_Factory();

        private InstanceHolder() {
        }
    }

    public static FiamAnimator_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static FiamAnimator newInstance() {
        return new FiamAnimator();
    }

    @Override // com.google.firebase.inappmessaging.display.dagger.internal.Factory, com.google.firebase.inappmessaging.display.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public FiamAnimator get() {
        return newInstance();
    }
}
