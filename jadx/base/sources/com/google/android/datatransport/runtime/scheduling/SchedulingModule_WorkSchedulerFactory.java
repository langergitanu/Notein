package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.time.Clock;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes6.dex */
public final class SchedulingModule_WorkSchedulerFactory implements Factory<WorkScheduler> {
    private final InterfaceC32462OooO00o<Clock> clockProvider;
    private final InterfaceC32462OooO00o<SchedulerConfig> configProvider;
    private final InterfaceC32462OooO00o<Context> contextProvider;
    private final InterfaceC32462OooO00o<EventStore> eventStoreProvider;

    public SchedulingModule_WorkSchedulerFactory(InterfaceC32462OooO00o<Context> interfaceC32462OooO00o, InterfaceC32462OooO00o<EventStore> interfaceC32462OooO00o2, InterfaceC32462OooO00o<SchedulerConfig> interfaceC32462OooO00o3, InterfaceC32462OooO00o<Clock> interfaceC32462OooO00o4) {
        this.contextProvider = interfaceC32462OooO00o;
        this.eventStoreProvider = interfaceC32462OooO00o2;
        this.configProvider = interfaceC32462OooO00o3;
        this.clockProvider = interfaceC32462OooO00o4;
    }

    public static SchedulingModule_WorkSchedulerFactory create(InterfaceC32462OooO00o<Context> interfaceC32462OooO00o, InterfaceC32462OooO00o<EventStore> interfaceC32462OooO00o2, InterfaceC32462OooO00o<SchedulerConfig> interfaceC32462OooO00o3, InterfaceC32462OooO00o<Clock> interfaceC32462OooO00o4) {
        return new SchedulingModule_WorkSchedulerFactory(interfaceC32462OooO00o, interfaceC32462OooO00o2, interfaceC32462OooO00o3, interfaceC32462OooO00o4);
    }

    public static WorkScheduler workScheduler(Context context, EventStore eventStore, SchedulerConfig schedulerConfig, Clock clock) {
        return (WorkScheduler) Preconditions.checkNotNullFromProvides(SchedulingModule.workScheduler(context, eventStore, schedulerConfig, clock));
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, oO00ooO0.InterfaceC32462OooO00o
    public WorkScheduler get() {
        return workScheduler(this.contextProvider.get(), this.eventStoreProvider.get(), this.configProvider.get(), this.clockProvider.get());
    }
}
