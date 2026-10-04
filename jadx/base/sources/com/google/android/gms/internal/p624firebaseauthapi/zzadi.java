package com.google.android.gms.internal.p624firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzl;

/* JADX INFO: loaded from: classes7.dex */
final class zzadi extends zzaff<Void, zzl> {
    private final zzagx zzv;

    public zzadi(EmailAuthCredential emailAuthCredential, String str) {
        super(2);
        Preconditions.checkNotNull(emailAuthCredential, "Credential cannot be null");
        this.zzv = new zzagx(emailAuthCredential, null, str);
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzafq
    public final String zza() {
        return "reauthenticateWithEmailLink";
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzaff
    public final void zzb() {
        zzaf zzafVarZza = zzacq.zza(this.zzc, this.zzk);
        if (!this.zzd.getUid().equalsIgnoreCase(zzafVarZza.getUid())) {
            zza(new Status(FirebaseError.ERROR_USER_MISMATCH));
        } else {
            ((zzl) this.zze).zza(this.zzj, zzafVarZza);
            zzb(null);
        }
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzb);
    }
}
