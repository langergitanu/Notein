package com.google.firebase.auth.internal;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuthException;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzh implements OnFailureListener {
    private final /* synthetic */ TaskCompletionSource zza;

    public zzh(zzb zzbVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
        Objects.requireNonNull(zzbVar);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Log.e(zzb.zza, "Failed to get reCAPTCHA token with error [" + exc.getMessage() + "]- calling backend without app verification");
        if ((exc instanceof FirebaseAuthException) && ((FirebaseAuthException) exc).getErrorCode().endsWith("UNAUTHORIZED_DOMAIN")) {
            this.zza.setException(exc);
        } else {
            this.zza.setResult(new zzm().zza());
        }
    }
}
