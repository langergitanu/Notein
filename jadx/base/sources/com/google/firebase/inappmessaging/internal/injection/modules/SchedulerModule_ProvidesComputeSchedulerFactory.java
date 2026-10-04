package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import oO0OooOO.AbstractC33500OooOOOo;

/* JADX INFO: loaded from: classes8.dex */
public final class SchedulerModule_ProvidesComputeSchedulerFactory implements Factory<AbstractC33500OooOOOo> {
    private final SchedulerModule module;

    public SchedulerModule_ProvidesComputeSchedulerFactory(SchedulerModule schedulerModule) {
        this.module = schedulerModule;
    }

    public static SchedulerModule_ProvidesComputeSchedulerFactory create(SchedulerModule schedulerModule) {
        return new SchedulerModule_ProvidesComputeSchedulerFactory(schedulerModule);
    }

    public static AbstractC33500OooOOOo providesComputeScheduler(SchedulerModule schedulerModule) {
        return (AbstractC33500OooOOOo) Preconditions.checkNotNullFromProvides(schedulerModule.providesComputeScheduler());
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public AbstractC33500OooOOOo get() {
        return providesComputeScheduler(this.module);
    }
}
