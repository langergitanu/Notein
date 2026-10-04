package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes6.dex */
public final class EventStoreModule_PackageNameFactory implements Factory<String> {
    private final InterfaceC32462OooO00o<Context> contextProvider;

    public EventStoreModule_PackageNameFactory(InterfaceC32462OooO00o<Context> interfaceC32462OooO00o) {
        this.contextProvider = interfaceC32462OooO00o;
    }

    public static EventStoreModule_PackageNameFactory create(InterfaceC32462OooO00o<Context> interfaceC32462OooO00o) {
        return new EventStoreModule_PackageNameFactory(interfaceC32462OooO00o);
    }

    public static String packageName(Context context) {
        return (String) Preconditions.checkNotNullFromProvides(EventStoreModule.packageName(context));
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, oO00ooO0.InterfaceC32462OooO00o
    public String get() {
        return packageName(this.contextProvider.get());
    }
}
