package com.google.firebase.remoteconfig;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigContainer;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooO0OO implements SuccessContinuation {
    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        return FirebaseRemoteConfig.lambda$setDefaultsWithStringsMapAsync$7((ConfigContainer) obj);
    }
}
