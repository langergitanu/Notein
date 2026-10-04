package com.google.mlkit.p567nl.translate.internal;

/* JADX INFO: loaded from: classes8.dex */
public final class zzy {
    private double zza;

    public static /* bridge */ /* synthetic */ void zzb(zzy zzyVar) {
        double dMax = Math.max(zzyVar.zza, 0.5d);
        double d = dMax + dMax;
        zzyVar.zza = d;
        if (d > 60.0d) {
            zzyVar.zza = 60.0d;
            d = 60.0d;
        }
        zzyVar.zza = (Math.random() * zzyVar.zza) + d;
    }
}
