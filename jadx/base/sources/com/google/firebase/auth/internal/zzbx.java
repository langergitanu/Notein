package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p624firebaseauthapi.zzahs;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.huawei.hms.network.embedded.C18358t1;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbx {
    FirebaseApp zza;
    zzbs zzb;
    private final Object zzc;
    private final Map<String, Task<RecaptchaTasksClient>> zzd;
    private zzahs zze;
    private FirebaseAuth zzf;

    public zzbx(FirebaseApp firebaseApp, FirebaseAuth firebaseAuth) {
        this(firebaseApp, firebaseAuth, new zzbv());
    }

    private final Task<RecaptchaTasksClient> zzc(String str) {
        Task<RecaptchaTasksClient> task;
        synchronized (this.zzc) {
            task = this.zzd.get(str);
        }
        return task;
    }

    private static String zzd(String str) {
        return com.google.android.gms.internal.p624firebaseauthapi.zzac.zzc(str) ? C18358t1.g.f56183c : str;
    }

    public final Task<String> zza(String str, Boolean bool, RecaptchaAction recaptchaAction) {
        String strZzd = zzd(str);
        Task<RecaptchaTasksClient> taskZzc = zzc(strZzd);
        if (bool.booleanValue() || taskZzc == null) {
            taskZzc = zza(strZzd, bool);
        }
        return taskZzc.continueWithTask(new zzbz(this, recaptchaAction));
    }

    public final boolean zzb(String str) {
        boolean z;
        synchronized (this.zzc) {
            try {
                zzahs zzahsVar = this.zze;
                z = zzahsVar != null && zzahsVar.zzc(str);
            } finally {
            }
        }
        return z;
    }

    private zzbx(FirebaseApp firebaseApp, FirebaseAuth firebaseAuth, zzbs zzbsVar) {
        this.zzc = new Object();
        this.zzd = new HashMap();
        this.zza = firebaseApp;
        this.zzf = firebaseAuth;
        this.zzb = zzbsVar;
    }

    public final Task<RecaptchaTasksClient> zza(String str, Boolean bool) {
        Task<RecaptchaTasksClient> taskZzc;
        String strZzd = zzd(str);
        return (bool.booleanValue() || (taskZzc = zzc(strZzd)) == null) ? this.zzf.zza("RECAPTCHA_ENTERPRISE").continueWithTask(new zzbw(this, strZzd)) : taskZzc;
    }

    public static /* synthetic */ void zza(zzbx zzbxVar, zzahs zzahsVar, Task task, String str) {
        synchronized (zzbxVar.zzc) {
            zzbxVar.zze = zzahsVar;
            zzbxVar.zzd.put(str, task);
        }
    }

    public final boolean zza(String str) {
        String strZzb;
        Preconditions.checkNotNull(str);
        zzahs zzahsVar = this.zze;
        if (zzahsVar == null || (strZzb = zzahsVar.zzb(str)) == null) {
            return false;
        }
        return strZzb.equals("AUDIT");
    }
}
