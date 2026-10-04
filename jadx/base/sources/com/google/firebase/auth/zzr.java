package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.internal.zzav;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzr implements zzav {
    private final /* synthetic */ FirebaseUser zza;
    private final /* synthetic */ FirebaseAuth zzb;

    public zzr(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        this.zza = firebaseUser;
        Objects.requireNonNull(firebaseAuth);
        this.zzb = firebaseAuth;
    }

    @Override // com.google.firebase.auth.internal.zzav
    public final void zza() {
        if (this.zzb.zzg == null || !this.zzb.zzg.getUid().equalsIgnoreCase(this.zza.getUid())) {
            return;
        }
        this.zzb.zzg();
    }

    @Override // com.google.firebase.auth.internal.zzau
    public final void zza(Status status) {
        if (status.getStatusCode() == 17011 || status.getStatusCode() == 17021 || status.getStatusCode() == 17005) {
            this.zzb.signOut();
        }
    }
}
