package com.google.android.gms.internal.p624firebaseauthapi;

import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
final class zzafi implements zzafm {
    private final /* synthetic */ PhoneAuthCredential zza;

    public zzafi(zzafh zzafhVar, PhoneAuthCredential phoneAuthCredential) {
        this.zza = phoneAuthCredential;
        Objects.requireNonNull(zzafhVar);
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzafm
    public final void zza(PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Object... objArr) {
        onVerificationStateChangedCallbacks.onVerificationCompleted(this.zza);
    }
}
