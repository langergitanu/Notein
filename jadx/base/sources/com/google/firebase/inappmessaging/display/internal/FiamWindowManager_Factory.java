package com.google.firebase.inappmessaging.display.internal;

import com.google.firebase.inappmessaging.display.dagger.internal.Factory;

/* JADX INFO: loaded from: classes8.dex */
public final class FiamWindowManager_Factory implements Factory<FiamWindowManager> {

    public static final class InstanceHolder {
        private static final FiamWindowManager_Factory INSTANCE = new FiamWindowManager_Factory();

        private InstanceHolder() {
        }
    }

    public static FiamWindowManager_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static FiamWindowManager newInstance() {
        return new FiamWindowManager();
    }

    @Override // com.google.firebase.inappmessaging.display.dagger.internal.Factory, com.google.firebase.inappmessaging.display.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public FiamWindowManager get() {
        return newInstance();
    }
}
