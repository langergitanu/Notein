package com.google.firebase.sessions;

import com.google.android.datatransport.TransportFactory;
import com.google.firebase.inject.Provider;
import com.google.firebase.sessions.dagger.internal.Factory;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class EventGDTLogger_Factory implements Factory<EventGDTLogger> {
    private final InterfaceC32462OooO00o<Provider<TransportFactory>> transportFactoryProvider;

    public EventGDTLogger_Factory(InterfaceC32462OooO00o<Provider<TransportFactory>> interfaceC32462OooO00o) {
        this.transportFactoryProvider = interfaceC32462OooO00o;
    }

    public static EventGDTLogger_Factory create(InterfaceC32462OooO00o<Provider<TransportFactory>> interfaceC32462OooO00o) {
        return new EventGDTLogger_Factory(interfaceC32462OooO00o);
    }

    public static EventGDTLogger newInstance(Provider<TransportFactory> provider) {
        return new EventGDTLogger(provider);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public EventGDTLogger get() {
        return newInstance(this.transportFactoryProvider.get());
    }
}
