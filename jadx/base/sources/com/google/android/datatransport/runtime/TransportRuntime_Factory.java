package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.time.Clock;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes6.dex */
public final class TransportRuntime_Factory implements Factory<TransportRuntime> {
    private final InterfaceC32462OooO00o<Clock> eventClockProvider;
    private final InterfaceC32462OooO00o<WorkInitializer> initializerProvider;
    private final InterfaceC32462OooO00o<Scheduler> schedulerProvider;
    private final InterfaceC32462OooO00o<Uploader> uploaderProvider;
    private final InterfaceC32462OooO00o<Clock> uptimeClockProvider;

    public TransportRuntime_Factory(InterfaceC32462OooO00o<Clock> interfaceC32462OooO00o, InterfaceC32462OooO00o<Clock> interfaceC32462OooO00o2, InterfaceC32462OooO00o<Scheduler> interfaceC32462OooO00o3, InterfaceC32462OooO00o<Uploader> interfaceC32462OooO00o4, InterfaceC32462OooO00o<WorkInitializer> interfaceC32462OooO00o5) {
        this.eventClockProvider = interfaceC32462OooO00o;
        this.uptimeClockProvider = interfaceC32462OooO00o2;
        this.schedulerProvider = interfaceC32462OooO00o3;
        this.uploaderProvider = interfaceC32462OooO00o4;
        this.initializerProvider = interfaceC32462OooO00o5;
    }

    public static TransportRuntime_Factory create(InterfaceC32462OooO00o<Clock> interfaceC32462OooO00o, InterfaceC32462OooO00o<Clock> interfaceC32462OooO00o2, InterfaceC32462OooO00o<Scheduler> interfaceC32462OooO00o3, InterfaceC32462OooO00o<Uploader> interfaceC32462OooO00o4, InterfaceC32462OooO00o<WorkInitializer> interfaceC32462OooO00o5) {
        return new TransportRuntime_Factory(interfaceC32462OooO00o, interfaceC32462OooO00o2, interfaceC32462OooO00o3, interfaceC32462OooO00o4, interfaceC32462OooO00o5);
    }

    public static TransportRuntime newInstance(Clock clock, Clock clock2, Scheduler scheduler, Uploader uploader, WorkInitializer workInitializer) {
        return new TransportRuntime(clock, clock2, scheduler, uploader, workInitializer);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, oO00ooO0.InterfaceC32462OooO00o
    public TransportRuntime get() {
        return newInstance(this.eventClockProvider.get(), this.uptimeClockProvider.get(), this.schedulerProvider.get(), this.uploaderProvider.get(), this.initializerProvider.get());
    }
}
