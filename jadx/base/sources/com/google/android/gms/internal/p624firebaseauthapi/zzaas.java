package com.google.android.gms.internal.p624firebaseauthapi;

import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.internal.zzbk;
import com.google.firebase.auth.zze;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class zzaas {
    private String zza;
    private List<zzahy> zzb;
    private zze zzc;

    public zzaas(String str, List<zzahy> list, zze zzeVar) {
        this.zza = str;
        this.zzb = list;
        this.zzc = zzeVar;
    }

    public final zze zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zza;
    }

    public final List<MultiFactorInfo> zzc() {
        return zzbk.zza(this.zzb);
    }
}
