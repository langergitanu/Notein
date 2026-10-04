package com.google.android.gms.internal.p624firebaseauthapi;

import com.google.android.gms.internal.p624firebaseauthapi.zzxh;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbw {
    private final zzxh.zza zza;

    private zzbw(zzxh.zza zzaVar) {
        this.zza = zzaVar;
    }

    public final synchronized zzbm zza() throws GeneralSecurityException {
        return zzbm.zza((zzxh) ((zzalf) this.zza.zze()));
    }

    public static zzbw zza(zzbm zzbmVar) {
        return new zzbw(zzbmVar.zzd().zzn());
    }
}
