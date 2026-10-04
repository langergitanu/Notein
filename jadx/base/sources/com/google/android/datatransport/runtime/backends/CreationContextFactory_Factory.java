package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.time.Clock;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes6.dex */
public final class CreationContextFactory_Factory implements Factory<CreationContextFactory> {
    private final InterfaceC32462OooO00o<Context> applicationContextProvider;
    private final InterfaceC32462OooO00o<Clock> monotonicClockProvider;
    private final InterfaceC32462OooO00o<Clock> wallClockProvider;

    public CreationContextFactory_Factory(InterfaceC32462OooO00o<Context> interfaceC32462OooO00o, InterfaceC32462OooO00o<Clock> interfaceC32462OooO00o2, InterfaceC32462OooO00o<Clock> interfaceC32462OooO00o3) {
        this.applicationContextProvider = interfaceC32462OooO00o;
        this.wallClockProvider = interfaceC32462OooO00o2;
        this.monotonicClockProvider = interfaceC32462OooO00o3;
    }

    public static CreationContextFactory_Factory create(InterfaceC32462OooO00o<Context> interfaceC32462OooO00o, InterfaceC32462OooO00o<Clock> interfaceC32462OooO00o2, InterfaceC32462OooO00o<Clock> interfaceC32462OooO00o3) {
        return new CreationContextFactory_Factory(interfaceC32462OooO00o, interfaceC32462OooO00o2, interfaceC32462OooO00o3);
    }

    public static CreationContextFactory newInstance(Context context, Clock clock, Clock clock2) {
        return new CreationContextFactory(context, clock, clock2);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, oO00ooO0.InterfaceC32462OooO00o
    public CreationContextFactory get() {
        return newInstance(this.applicationContextProvider.get(), this.wallClockProvider.get(), this.monotonicClockProvider.get());
    }
}
