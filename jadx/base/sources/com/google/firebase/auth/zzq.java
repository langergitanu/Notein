package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.internal.zzbo;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzq extends zzbo<Void> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ ActionCodeSettings zzb;
    private final /* synthetic */ FirebaseAuth zzc;

    public zzq(FirebaseAuth firebaseAuth, String str, ActionCodeSettings actionCodeSettings) {
        this.zza = str;
        this.zzb = actionCodeSettings;
        Objects.requireNonNull(firebaseAuth);
        this.zzc = firebaseAuth;
    }

    @Override // com.google.firebase.auth.internal.zzbo
    public final Task<Void> zza(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Password reset request " + this.zza + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for password reset of email " + this.zza);
        }
        FirebaseAuth firebaseAuth = this.zzc;
        return firebaseAuth.zzd.zza(firebaseAuth.zzf, this.zza, this.zzb, this.zzc.zzl, str);
    }
}
