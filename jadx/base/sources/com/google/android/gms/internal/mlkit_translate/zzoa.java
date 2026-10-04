package com.google.android.gms.internal.mlkit_translate;

import androidx.core.location.LocationRequestCompat;

/* JADX INFO: loaded from: classes7.dex */
public final class zzoa {
    private Long zza;
    private zzop zzb;
    private Boolean zzc;

    public final zzoa zza(Long l) {
        this.zza = Long.valueOf(l.longValue() & LocationRequestCompat.PASSIVE_INTERVAL);
        return this;
    }

    public final zzoa zzb(zzop zzopVar) {
        this.zzb = zzopVar;
        return this;
    }

    public final zzoa zzc(Boolean bool) {
        this.zzc = bool;
        return this;
    }

    public final zzoc zzd() {
        return new zzoc(this, null);
    }
}
