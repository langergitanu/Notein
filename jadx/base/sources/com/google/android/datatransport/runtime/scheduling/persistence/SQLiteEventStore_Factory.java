package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.time.Clock;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes6.dex */
public final class SQLiteEventStore_Factory implements Factory<SQLiteEventStore> {
    private final InterfaceC32462OooO00o<Clock> clockProvider;
    private final InterfaceC32462OooO00o<EventStoreConfig> configProvider;
    private final InterfaceC32462OooO00o<String> packageNameProvider;
    private final InterfaceC32462OooO00o<SchemaManager> schemaManagerProvider;
    private final InterfaceC32462OooO00o<Clock> wallClockProvider;

    public SQLiteEventStore_Factory(InterfaceC32462OooO00o<Clock> interfaceC32462OooO00o, InterfaceC32462OooO00o<Clock> interfaceC32462OooO00o2, InterfaceC32462OooO00o<EventStoreConfig> interfaceC32462OooO00o3, InterfaceC32462OooO00o<SchemaManager> interfaceC32462OooO00o4, InterfaceC32462OooO00o<String> interfaceC32462OooO00o5) {
        this.wallClockProvider = interfaceC32462OooO00o;
        this.clockProvider = interfaceC32462OooO00o2;
        this.configProvider = interfaceC32462OooO00o3;
        this.schemaManagerProvider = interfaceC32462OooO00o4;
        this.packageNameProvider = interfaceC32462OooO00o5;
    }

    public static SQLiteEventStore_Factory create(InterfaceC32462OooO00o<Clock> interfaceC32462OooO00o, InterfaceC32462OooO00o<Clock> interfaceC32462OooO00o2, InterfaceC32462OooO00o<EventStoreConfig> interfaceC32462OooO00o3, InterfaceC32462OooO00o<SchemaManager> interfaceC32462OooO00o4, InterfaceC32462OooO00o<String> interfaceC32462OooO00o5) {
        return new SQLiteEventStore_Factory(interfaceC32462OooO00o, interfaceC32462OooO00o2, interfaceC32462OooO00o3, interfaceC32462OooO00o4, interfaceC32462OooO00o5);
    }

    public static SQLiteEventStore newInstance(Clock clock, Clock clock2, Object obj, Object obj2, InterfaceC32462OooO00o<String> interfaceC32462OooO00o) {
        return new SQLiteEventStore(clock, clock2, (EventStoreConfig) obj, (SchemaManager) obj2, interfaceC32462OooO00o);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, oO00ooO0.InterfaceC32462OooO00o
    public SQLiteEventStore get() {
        return newInstance(this.wallClockProvider.get(), this.clockProvider.get(), this.configProvider.get(), this.schemaManagerProvider.get(), this.packageNameProvider);
    }
}
