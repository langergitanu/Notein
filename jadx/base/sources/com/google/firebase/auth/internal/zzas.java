package com.google.firebase.auth.internal;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.FirebaseNetworkException;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzas implements OnFailureListener {
    private final /* synthetic */ zzat zza;

    public zzas(zzat zzatVar) {
        Objects.requireNonNull(zzatVar);
        this.zza = zzatVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        if (exc instanceof FirebaseNetworkException) {
            zzaq.zzc.m74923v("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            this.zza.zza.zzd();
        }
    }
}
