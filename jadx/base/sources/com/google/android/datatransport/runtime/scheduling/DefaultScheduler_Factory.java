package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes6.dex */
public final class DefaultScheduler_Factory implements Factory<DefaultScheduler> {
    private final InterfaceC32462OooO00o<BackendRegistry> backendRegistryProvider;
    private final InterfaceC32462OooO00o<EventStore> eventStoreProvider;
    private final InterfaceC32462OooO00o<Executor> executorProvider;
    private final InterfaceC32462OooO00o<SynchronizationGuard> guardProvider;
    private final InterfaceC32462OooO00o<WorkScheduler> workSchedulerProvider;

    public DefaultScheduler_Factory(InterfaceC32462OooO00o<Executor> interfaceC32462OooO00o, InterfaceC32462OooO00o<BackendRegistry> interfaceC32462OooO00o2, InterfaceC32462OooO00o<WorkScheduler> interfaceC32462OooO00o3, InterfaceC32462OooO00o<EventStore> interfaceC32462OooO00o4, InterfaceC32462OooO00o<SynchronizationGuard> interfaceC32462OooO00o5) {
        this.executorProvider = interfaceC32462OooO00o;
        this.backendRegistryProvider = interfaceC32462OooO00o2;
        this.workSchedulerProvider = interfaceC32462OooO00o3;
        this.eventStoreProvider = interfaceC32462OooO00o4;
        this.guardProvider = interfaceC32462OooO00o5;
    }

    public static DefaultScheduler_Factory create(InterfaceC32462OooO00o<Executor> interfaceC32462OooO00o, InterfaceC32462OooO00o<BackendRegistry> interfaceC32462OooO00o2, InterfaceC32462OooO00o<WorkScheduler> interfaceC32462OooO00o3, InterfaceC32462OooO00o<EventStore> interfaceC32462OooO00o4, InterfaceC32462OooO00o<SynchronizationGuard> interfaceC32462OooO00o5) {
        return new DefaultScheduler_Factory(interfaceC32462OooO00o, interfaceC32462OooO00o2, interfaceC32462OooO00o3, interfaceC32462OooO00o4, interfaceC32462OooO00o5);
    }

    public static DefaultScheduler newInstance(Executor executor, BackendRegistry backendRegistry, WorkScheduler workScheduler, EventStore eventStore, SynchronizationGuard synchronizationGuard) {
        return new DefaultScheduler(executor, backendRegistry, workScheduler, eventStore, synchronizationGuard);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, oO00ooO0.InterfaceC32462OooO00o
    public DefaultScheduler get() {
        return newInstance(this.executorProvider.get(), this.backendRegistryProvider.get(), this.workSchedulerProvider.get(), this.eventStoreProvider.get(), this.guardProvider.get());
    }
}
