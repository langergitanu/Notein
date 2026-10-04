package com.google.firebase.inappmessaging.internal;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import oO00ooO0.InterfaceC32462OooO00o;
import oO0OooOO.AbstractC33500OooOOOo;

/* JADX INFO: loaded from: classes8.dex */
public final class Schedulers_Factory implements Factory<Schedulers> {
    private final InterfaceC32462OooO00o<AbstractC33500OooOOOo> computeSchedulerProvider;
    private final InterfaceC32462OooO00o<AbstractC33500OooOOOo> ioSchedulerProvider;
    private final InterfaceC32462OooO00o<AbstractC33500OooOOOo> mainThreadSchedulerProvider;

    public Schedulers_Factory(InterfaceC32462OooO00o<AbstractC33500OooOOOo> interfaceC32462OooO00o, InterfaceC32462OooO00o<AbstractC33500OooOOOo> interfaceC32462OooO00o2, InterfaceC32462OooO00o<AbstractC33500OooOOOo> interfaceC32462OooO00o3) {
        this.ioSchedulerProvider = interfaceC32462OooO00o;
        this.computeSchedulerProvider = interfaceC32462OooO00o2;
        this.mainThreadSchedulerProvider = interfaceC32462OooO00o3;
    }

    public static Schedulers_Factory create(InterfaceC32462OooO00o<AbstractC33500OooOOOo> interfaceC32462OooO00o, InterfaceC32462OooO00o<AbstractC33500OooOOOo> interfaceC32462OooO00o2, InterfaceC32462OooO00o<AbstractC33500OooOOOo> interfaceC32462OooO00o3) {
        return new Schedulers_Factory(interfaceC32462OooO00o, interfaceC32462OooO00o2, interfaceC32462OooO00o3);
    }

    public static Schedulers newInstance(AbstractC33500OooOOOo abstractC33500OooOOOo, AbstractC33500OooOOOo abstractC33500OooOOOo2, AbstractC33500OooOOOo abstractC33500OooOOOo3) {
        return new Schedulers(abstractC33500OooOOOo, abstractC33500OooOOOo2, abstractC33500OooOOOo3);
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public Schedulers get() {
        return newInstance(this.ioSchedulerProvider.get(), this.computeSchedulerProvider.get(), this.mainThreadSchedulerProvider.get());
    }
}
