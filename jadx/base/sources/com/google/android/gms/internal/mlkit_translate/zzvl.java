package com.google.android.gms.internal.mlkit_translate;

/* JADX INFO: loaded from: classes7.dex */
public final class zzvl {
    private static zzvk zza;

    public static synchronized zzuy zza(zzus zzusVar) {
        try {
            if (zza == null) {
                zza = new zzvk(null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (zzuy) zza.get(zzusVar);
    }

    public static synchronized zzuy zzb(String str) {
        return zza(zzus.zzd("translate").zzd());
    }
}
