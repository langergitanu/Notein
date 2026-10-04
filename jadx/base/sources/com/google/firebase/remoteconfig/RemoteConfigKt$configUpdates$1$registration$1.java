package com.google.firebase.remoteconfig;

import com.google.firebase.firestore.remote.RunnableC22702OooOOo0;
import kotlin.Metadata;
import oO0o0OO.C33633Oooo0;
import oO0o0OOo.InterfaceC33712OooOo0O;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m80612d2 = {"com/google/firebase/remoteconfig/RemoteConfigKt$configUpdates$1$registration$1", "Lcom/google/firebase/remoteconfig/ConfigUpdateListener;", "Lcom/google/firebase/remoteconfig/ConfigUpdate;", "configUpdate", "LoO00ooO/OooOooO;", "onUpdate", "(Lcom/google/firebase/remoteconfig/ConfigUpdate;)V", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException;", "error", "onError", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException;)V", "com.google.firebase-firebase-config"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class RemoteConfigKt$configUpdates$1$registration$1 implements ConfigUpdateListener {
    final /* synthetic */ InterfaceC33712OooOo0O<ConfigUpdate> $$this$callbackFlow;
    final /* synthetic */ FirebaseRemoteConfig $this_configUpdates;

    /* JADX WARN: Multi-variable type inference failed */
    public RemoteConfigKt$configUpdates$1$registration$1(FirebaseRemoteConfig firebaseRemoteConfig, InterfaceC33712OooOo0O<? super ConfigUpdate> interfaceC33712OooOo0O) {
        this.$this_configUpdates = firebaseRemoteConfig;
        this.$$this$callbackFlow = interfaceC33712OooOo0O;
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
    public void onError(FirebaseRemoteConfigException error) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(error, "error");
        C33633Oooo0.OooO0OO(this.$$this$callbackFlow, "Error listening for config updates.", error);
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
    public void onUpdate(ConfigUpdate configUpdate) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(configUpdate, "configUpdate");
        this.$this_configUpdates.schedule(new RunnableC22702OooOOo0(1, this.$$this$callbackFlow, configUpdate));
    }
}
