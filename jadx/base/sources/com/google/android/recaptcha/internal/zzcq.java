package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaException;
import kotlin.coroutines.Continuation;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.o0000;

/* JADX INFO: loaded from: classes7.dex */
public final class zzcq {
    private static zzcv zza;

    public static final zzcv zza(Application application) {
        zzcv zzcvVar = zza;
        if (zzcvVar == null) {
            zzcvVar = new zzcv(application);
        }
        if (zza == null) {
            zza = zzcvVar;
        }
        return zzcvVar;
    }

    public static final Object zzb(Application application, String str, long j, Continuation continuation) throws RecaptchaException, o0000, ApiException {
        return zzcv.zzh(zza(application), str, j, null, null, null, continuation, 28, null);
    }

    public static final Task zzc(Application application, String str, long j) throws RecaptchaException, o0000, ApiException {
        return zzas.zza(C33609OooO0oo.OooO00o(zza(application).zzd().zza(), null, new zzco(application, str, j, null), 3));
    }

    public static final Object zzd(Application application, String str, Continuation continuation) throws RecaptchaException, ApiException {
        zzcv zzcvVarZza = zza(application);
        return zzcv.zzh(zzcvVarZza, str, 0L, null, zzcvVarZza.zzf, zzch.zzb, continuation, 2, null);
    }

    public static final Task zze(Application application, String str) throws RecaptchaException, ApiException {
        return zzas.zza(C33609OooO0oo.OooO00o(zza(application).zzd().zza(), null, new zzcp(application, str, null), 3));
    }
}
