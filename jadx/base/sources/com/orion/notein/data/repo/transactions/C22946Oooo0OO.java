package com.orion.notein.data.repo.transactions;

import com.google.firebase.Firebase;
import com.google.firebase.remoteconfig.RemoteConfigKt;

/* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C22946Oooo0OO implements oO0O000o.OooO00o {
    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        return Boolean.valueOf(RemoteConfigKt.getRemoteConfig(Firebase.INSTANCE).getBoolean("rconfig_disable_notein_firebase_user"));
    }
}
