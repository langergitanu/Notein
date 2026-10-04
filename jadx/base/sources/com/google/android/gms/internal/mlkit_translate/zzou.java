package com.google.android.gms.internal.mlkit_translate;

import androidx.core.location.LocationRequestCompat;

/* JADX INFO: loaded from: classes7.dex */
public final class zzou {
    private zzpg zza;
    private Long zzb;
    private zzop zzc;
    private zzov zzd;
    private Long zze;

    public final zzou zzb(Long l) {
        this.zze = l;
        return this;
    }

    public final zzou zzc(zzov zzovVar) {
        this.zzd = zzovVar;
        return this;
    }

    public final zzou zzd(zzop zzopVar) {
        this.zzc = zzopVar;
        return this;
    }

    public final zzou zze(zzpg zzpgVar) {
        this.zza = zzpgVar;
        return this;
    }

    public final zzou zzf(Long l) {
        this.zzb = Long.valueOf(l.longValue() & LocationRequestCompat.PASSIVE_INTERVAL);
        return this;
    }

    public final zzox zzh() {
        return new zzox(this, null);
    }
}
