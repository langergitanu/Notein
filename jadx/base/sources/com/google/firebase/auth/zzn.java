package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.zzbo;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzn extends zzbo<AuthResult> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ FirebaseAuth zzc;

    public zzn(FirebaseAuth firebaseAuth, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        Objects.requireNonNull(firebaseAuth);
        this.zzc = firebaseAuth;
    }

    @Override // com.google.firebase.auth.internal.zzbo
    public final Task<AuthResult> zza(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Creating user with " + this.zza + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for sign up with email " + this.zza);
        }
        FirebaseAuth firebaseAuth = this.zzc;
        return firebaseAuth.zzd.zza(firebaseAuth.zzf, this.zza, this.zzb, this.zzc.zzl, str, new FirebaseAuth.zza(this.zzc));
    }
}
