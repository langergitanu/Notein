package com.google.firebase.inappmessaging.internal.time;

import com.google.firebase.inappmessaging.dagger.internal.Factory;

/* JADX INFO: loaded from: classes8.dex */
public final class SystemClock_Factory implements Factory<SystemClock> {

    public static final class InstanceHolder {
        private static final SystemClock_Factory INSTANCE = new SystemClock_Factory();

        private InstanceHolder() {
        }
    }

    public static SystemClock_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SystemClock newInstance() {
        return new SystemClock();
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public SystemClock get() {
        return newInstance();
    }
}
