package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes6.dex */
public final class MetadataBackendRegistry_Factory implements Factory<MetadataBackendRegistry> {
    private final InterfaceC32462OooO00o<Context> applicationContextProvider;
    private final InterfaceC32462OooO00o<CreationContextFactory> creationContextFactoryProvider;

    public MetadataBackendRegistry_Factory(InterfaceC32462OooO00o<Context> interfaceC32462OooO00o, InterfaceC32462OooO00o<CreationContextFactory> interfaceC32462OooO00o2) {
        this.applicationContextProvider = interfaceC32462OooO00o;
        this.creationContextFactoryProvider = interfaceC32462OooO00o2;
    }

    public static MetadataBackendRegistry_Factory create(InterfaceC32462OooO00o<Context> interfaceC32462OooO00o, InterfaceC32462OooO00o<CreationContextFactory> interfaceC32462OooO00o2) {
        return new MetadataBackendRegistry_Factory(interfaceC32462OooO00o, interfaceC32462OooO00o2);
    }

    public static MetadataBackendRegistry newInstance(Context context, Object obj) {
        return new MetadataBackendRegistry(context, (CreationContextFactory) obj);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, oO00ooO0.InterfaceC32462OooO00o
    public MetadataBackendRegistry get() {
        return newInstance(this.applicationContextProvider.get(), this.creationContextFactoryProvider.get());
    }
}
