package com.google.android.gms.internal.mlkit_translate;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class zzpc {
    private final String zza;
    private final zzpa zzc;
    private final String zze;
    private final zzoz zzf;
    private final String zzb = null;
    private final String zzd = null;
    private final Long zzg = null;
    private final Boolean zzh = null;
    private final Boolean zzi = null;

    public /* synthetic */ zzpc(zzoy zzoyVar, zzpb zzpbVar) {
        this.zza = zzoyVar.zza;
        this.zzc = zzoyVar.zzb;
        this.zze = zzoyVar.zzc;
        this.zzf = zzoyVar.zzd;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzpc)) {
            return false;
        }
        zzpc zzpcVar = (zzpc) obj;
        return Objects.equal(this.zza, zzpcVar.zza) && Objects.equal(null, null) && Objects.equal(this.zzc, zzpcVar.zzc) && Objects.equal(null, null) && Objects.equal(this.zze, zzpcVar.zze) && Objects.equal(this.zzf, zzpcVar.zzf) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, null, this.zzc, null, this.zze, this.zzf, null, null, null);
    }

    public final zzoz zza() {
        return this.zzf;
    }

    public final zzpa zzb() {
        return this.zzc;
    }

    public final String zzc() {
        return this.zze;
    }

    public final String zzd() {
        return this.zza;
    }
}
