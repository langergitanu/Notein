package com.google.android.gms.internal.p624firebaseauthapi;

import com.google.firebase.auth.PhoneAuthProvider;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
final class zzafj implements zzafm {
    private final /* synthetic */ String zza;

    public zzafj(zzafh zzafhVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzafhVar);
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzafm
    public final void zza(PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Object... objArr) {
        onVerificationStateChangedCallbacks.onCodeSent(this.zza, PhoneAuthProvider.ForceResendingToken.zza());
    }
}
