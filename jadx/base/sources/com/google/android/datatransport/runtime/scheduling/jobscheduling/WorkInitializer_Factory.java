package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes6.dex */
public final class WorkInitializer_Factory implements Factory<WorkInitializer> {
    private final InterfaceC32462OooO00o<Executor> executorProvider;
    private final InterfaceC32462OooO00o<SynchronizationGuard> guardProvider;
    private final InterfaceC32462OooO00o<WorkScheduler> schedulerProvider;
    private final InterfaceC32462OooO00o<EventStore> storeProvider;

    public WorkInitializer_Factory(InterfaceC32462OooO00o<Executor> interfaceC32462OooO00o, InterfaceC32462OooO00o<EventStore> interfaceC32462OooO00o2, InterfaceC32462OooO00o<WorkScheduler> interfaceC32462OooO00o3, InterfaceC32462OooO00o<SynchronizationGuard> interfaceC32462OooO00o4) {
        this.executorProvider = interfaceC32462OooO00o;
        this.storeProvider = interfaceC32462OooO00o2;
        this.schedulerProvider = interfaceC32462OooO00o3;
        this.guardProvider = interfaceC32462OooO00o4;
    }

    public static WorkInitializer_Factory create(InterfaceC32462OooO00o<Executor> interfaceC32462OooO00o, InterfaceC32462OooO00o<EventStore> interfaceC32462OooO00o2, InterfaceC32462OooO00o<WorkScheduler> interfaceC32462OooO00o3, InterfaceC32462OooO00o<SynchronizationGuard> interfaceC32462OooO00o4) {
        return new WorkInitializer_Factory(interfaceC32462OooO00o, interfaceC32462OooO00o2, interfaceC32462OooO00o3, interfaceC32462OooO00o4);
    }

    public static WorkInitializer newInstance(Executor executor, EventStore eventStore, WorkScheduler workScheduler, SynchronizationGuard synchronizationGuard) {
        return new WorkInitializer(executor, eventStore, workScheduler, synchronizationGuard);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, oO00ooO0.InterfaceC32462OooO00o
    public WorkInitializer get() {
        return newInstance(this.executorProvider.get(), this.storeProvider.get(), this.schedulerProvider.get(), this.guardProvider.get());
    }
}
