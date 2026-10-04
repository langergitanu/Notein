package com.google.android.gms.internal.p624firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzl;

/* JADX INFO: loaded from: classes7.dex */
final class zzaed extends zzaff<Void, zzl> {
    private final String zzv;

    public zzaed(String str) {
        super(2);
        this.zzv = Preconditions.checkNotEmpty(str, "email cannot be null or empty");
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzafq
    public final String zza() {
        return "updateEmail";
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzaff
    public final void zzb() {
        ((zzl) this.zze).zza(this.zzj, zzacq.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zzb(this.zzd.zze(), this.zzv, this.zzb);
    }
}
