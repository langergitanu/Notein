package com.google.firebase.auth.internal;

import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p624firebaseauthapi.zzaen;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;

/* JADX INFO: loaded from: classes8.dex */
final class zzbt implements Continuation {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzbx zzb;
    private final /* synthetic */ RecaptchaAction zzc;
    private final /* synthetic */ Continuation zzd;

    public zzbt(String str, zzbx zzbxVar, RecaptchaAction recaptchaAction, Continuation continuation) {
        this.zza = str;
        this.zzb = zzbxVar;
        this.zzc = recaptchaAction;
        this.zzd = continuation;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) throws Exception {
        if (task.isSuccessful() || !zzaen.zzc((Exception) Preconditions.checkNotNull(task.getException()))) {
            return task;
        }
        if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
            Log.i("RecaptchaCallWrapper", "Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant " + this.zza);
        }
        return this.zzb.zza(this.zza, Boolean.TRUE, this.zzc).continueWithTask(this.zzd);
    }
}
