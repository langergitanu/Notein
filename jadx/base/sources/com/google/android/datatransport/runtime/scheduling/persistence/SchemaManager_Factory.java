package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes6.dex */
public final class SchemaManager_Factory implements Factory<SchemaManager> {
    private final InterfaceC32462OooO00o<Context> contextProvider;
    private final InterfaceC32462OooO00o<String> dbNameProvider;
    private final InterfaceC32462OooO00o<Integer> schemaVersionProvider;

    public SchemaManager_Factory(InterfaceC32462OooO00o<Context> interfaceC32462OooO00o, InterfaceC32462OooO00o<String> interfaceC32462OooO00o2, InterfaceC32462OooO00o<Integer> interfaceC32462OooO00o3) {
        this.contextProvider = interfaceC32462OooO00o;
        this.dbNameProvider = interfaceC32462OooO00o2;
        this.schemaVersionProvider = interfaceC32462OooO00o3;
    }

    public static SchemaManager_Factory create(InterfaceC32462OooO00o<Context> interfaceC32462OooO00o, InterfaceC32462OooO00o<String> interfaceC32462OooO00o2, InterfaceC32462OooO00o<Integer> interfaceC32462OooO00o3) {
        return new SchemaManager_Factory(interfaceC32462OooO00o, interfaceC32462OooO00o2, interfaceC32462OooO00o3);
    }

    public static SchemaManager newInstance(Context context, String str, int i) {
        return new SchemaManager(context, str, i);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, oO00ooO0.InterfaceC32462OooO00o
    public SchemaManager get() {
        return newInstance(this.contextProvider.get(), this.dbNameProvider.get(), this.schemaVersionProvider.get().intValue());
    }
}
