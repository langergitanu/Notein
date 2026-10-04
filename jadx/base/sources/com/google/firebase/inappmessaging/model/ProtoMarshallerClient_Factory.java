package com.google.firebase.inappmessaging.model;

import com.google.firebase.inappmessaging.dagger.internal.Factory;

/* JADX INFO: loaded from: classes8.dex */
public final class ProtoMarshallerClient_Factory implements Factory<ProtoMarshallerClient> {

    public static final class InstanceHolder {
        private static final ProtoMarshallerClient_Factory INSTANCE = new ProtoMarshallerClient_Factory();

        private InstanceHolder() {
        }
    }

    public static ProtoMarshallerClient_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ProtoMarshallerClient newInstance() {
        return new ProtoMarshallerClient();
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public ProtoMarshallerClient get() {
        return newInstance();
    }
}
