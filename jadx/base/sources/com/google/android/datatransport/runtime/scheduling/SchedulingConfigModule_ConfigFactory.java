package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.Clock;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes6.dex */
public final class SchedulingConfigModule_ConfigFactory implements Factory<SchedulerConfig> {
    private final InterfaceC32462OooO00o<Clock> clockProvider;

    public SchedulingConfigModule_ConfigFactory(InterfaceC32462OooO00o<Clock> interfaceC32462OooO00o) {
        this.clockProvider = interfaceC32462OooO00o;
    }

    public static SchedulerConfig config(Clock clock) {
        return (SchedulerConfig) Preconditions.checkNotNullFromProvides(SchedulingConfigModule.config(clock));
    }

    public static SchedulingConfigModule_ConfigFactory create(InterfaceC32462OooO00o<Clock> interfaceC32462OooO00o) {
        return new SchedulingConfigModule_ConfigFactory(interfaceC32462OooO00o);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, oO00ooO0.InterfaceC32462OooO00o
    public SchedulerConfig get() {
        return config(this.clockProvider.get());
    }
}
