package com.google.android.gms.internal.p624firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.PhoneAuthProvider;

/* JADX INFO: loaded from: classes7.dex */
final class zzaej extends zzaff<Void, PhoneAuthProvider.OnVerificationStateChangedCallbacks> {
    private final zzaij zzv;

    public zzaej(zzaij zzaijVar) {
        super(8);
        Preconditions.checkNotNull(zzaijVar);
        this.zzv = zzaijVar;
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzafq
    public final String zza() {
        return "verifyPhoneNumber";
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzaff
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzb);
    }
}
