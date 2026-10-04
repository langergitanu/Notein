package com.google.firebase.auth.internal;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p624firebaseauthapi.zzahs;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzbw implements Continuation<zzahs, Task<RecaptchaTasksClient>> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzbx zzb;

    public zzbw(zzbx zzbxVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzbxVar);
        this.zzb = zzbxVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<RecaptchaTasksClient> then(Task<zzahs> task) throws Exception {
        if (!task.isSuccessful()) {
            return Tasks.forException(new zzbu((String) Preconditions.checkNotNull(((Exception) Preconditions.checkNotNull(task.getException())).getMessage())));
        }
        zzahs result = task.getResult();
        String strZza = result.zza();
        if (com.google.android.gms.internal.p624firebaseauthapi.zzac.zzc(strZza)) {
            return Tasks.forException(new zzbu(OooO00o.OooO00o("No Recaptcha Enterprise siteKey configured for tenant/project ", this.zza)));
        }
        List<String> listZza = com.google.android.gms.internal.p624firebaseauthapi.zzt.zza(IOUtils.DIR_SEPARATOR_UNIX).zza((CharSequence) strZza);
        String str = listZza.size() != 4 ? null : listZza.get(3);
        if (TextUtils.isEmpty(str)) {
            return Tasks.forException(new Exception(OooO00o.OooO00o("Invalid siteKey format ", strZza)));
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Successfully obtained site key for tenant " + this.zza);
        }
        zzbx zzbxVar = this.zzb;
        Task<RecaptchaTasksClient> taskZza = zzbxVar.zzb.zza((Application) zzbxVar.zza.getApplicationContext(), str);
        zzbx.zza(this.zzb, result, taskZza, this.zza);
        return taskZza;
    }
}
