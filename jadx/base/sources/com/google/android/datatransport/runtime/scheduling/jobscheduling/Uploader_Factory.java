package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.concurrent.Executor;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes6.dex */
public final class Uploader_Factory implements Factory<Uploader> {
    private final InterfaceC32462OooO00o<BackendRegistry> backendRegistryProvider;
    private final InterfaceC32462OooO00o<ClientHealthMetricsStore> clientHealthMetricsStoreProvider;
    private final InterfaceC32462OooO00o<Clock> clockProvider;
    private final InterfaceC32462OooO00o<Context> contextProvider;
    private final InterfaceC32462OooO00o<EventStore> eventStoreProvider;
    private final InterfaceC32462OooO00o<Executor> executorProvider;
    private final InterfaceC32462OooO00o<SynchronizationGuard> guardProvider;
    private final InterfaceC32462OooO00o<Clock> uptimeClockProvider;
    private final InterfaceC32462OooO00o<WorkScheduler> workSchedulerProvider;

    public Uploader_Factory(InterfaceC32462OooO00o<Context> interfaceC32462OooO00o, InterfaceC32462OooO00o<BackendRegistry> interfaceC32462OooO00o2, InterfaceC32462OooO00o<EventStore> interfaceC32462OooO00o3, InterfaceC32462OooO00o<WorkScheduler> interfaceC32462OooO00o4, InterfaceC32462OooO00o<Executor> interfaceC32462OooO00o5, InterfaceC32462OooO00o<SynchronizationGuard> interfaceC32462OooO00o6, InterfaceC32462OooO00o<Clock> interfaceC32462OooO00o7, InterfaceC32462OooO00o<Clock> interfaceC32462OooO00o8, InterfaceC32462OooO00o<ClientHealthMetricsStore> interfaceC32462OooO00o9) {
        this.contextProvider = interfaceC32462OooO00o;
        this.backendRegistryProvider = interfaceC32462OooO00o2;
        this.eventStoreProvider = interfaceC32462OooO00o3;
        this.workSchedulerProvider = interfaceC32462OooO00o4;
        this.executorProvider = interfaceC32462OooO00o5;
        this.guardProvider = interfaceC32462OooO00o6;
        this.clockProvider = interfaceC32462OooO00o7;
        this.uptimeClockProvider = interfaceC32462OooO00o8;
        this.clientHealthMetricsStoreProvider = interfaceC32462OooO00o9;
    }

    public static Uploader_Factory create(InterfaceC32462OooO00o<Context> interfaceC32462OooO00o, InterfaceC32462OooO00o<BackendRegistry> interfaceC32462OooO00o2, InterfaceC32462OooO00o<EventStore> interfaceC32462OooO00o3, InterfaceC32462OooO00o<WorkScheduler> interfaceC32462OooO00o4, InterfaceC32462OooO00o<Executor> interfaceC32462OooO00o5, InterfaceC32462OooO00o<SynchronizationGuard> interfaceC32462OooO00o6, InterfaceC32462OooO00o<Clock> interfaceC32462OooO00o7, InterfaceC32462OooO00o<Clock> interfaceC32462OooO00o8, InterfaceC32462OooO00o<ClientHealthMetricsStore> interfaceC32462OooO00o9) {
        return new Uploader_Factory(interfaceC32462OooO00o, interfaceC32462OooO00o2, interfaceC32462OooO00o3, interfaceC32462OooO00o4, interfaceC32462OooO00o5, interfaceC32462OooO00o6, interfaceC32462OooO00o7, interfaceC32462OooO00o8, interfaceC32462OooO00o9);
    }

    public static Uploader newInstance(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, Clock clock, Clock clock2, ClientHealthMetricsStore clientHealthMetricsStore) {
        return new Uploader(context, backendRegistry, eventStore, workScheduler, executor, synchronizationGuard, clock, clock2, clientHealthMetricsStore);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, oO00ooO0.InterfaceC32462OooO00o
    public Uploader get() {
        return newInstance(this.contextProvider.get(), this.backendRegistryProvider.get(), this.eventStoreProvider.get(), this.workSchedulerProvider.get(), this.executorProvider.get(), this.guardProvider.get(), this.clockProvider.get(), this.uptimeClockProvider.get(), this.clientHealthMetricsStoreProvider.get());
    }
}
