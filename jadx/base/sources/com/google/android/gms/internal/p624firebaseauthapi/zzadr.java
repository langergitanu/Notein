package com.google.android.gms.internal.p624firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzl;
import com.google.firebase.auth.internal.zzz;

/* JADX INFO: loaded from: classes7.dex */
final class zzadr extends zzaff<AuthResult, zzl> {
    private final String zzv;

    public zzadr(String str) {
        super(2);
        this.zzv = str;
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzafq
    public final String zza() {
        return "signInAnonymously";
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzaff
    public final void zzb() {
        zzaf zzafVarZza = zzacq.zza(this.zzc, this.zzk);
        ((zzl) this.zze).zza(this.zzj, zzafVarZza);
        zzb(new zzz(zzafVarZza));
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zzd(this.zzv, this.zzb);
    }
}
