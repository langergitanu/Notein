package com.google.android.gms.internal.p624firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzl;

/* JADX INFO: loaded from: classes7.dex */
final class zzado extends zzaff<Void, zzl> {
    public zzado() {
        super(2);
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzafq
    public final String zza() {
        return "reload";
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzaff
    public final void zzb() {
        ((zzl) this.zze).zza(this.zzj, zzacq.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zzc(this.zzd.zze(), this.zzb);
    }
}
