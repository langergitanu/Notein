package com.google.android.gms.internal.mlkit_translate;

/* JADX INFO: loaded from: classes7.dex */
public final class zzwj {
    private static zzwj zza;

    private zzwj() {
    }

    public static synchronized zzwj zza() {
        try {
            if (zza == null) {
                zza = new zzwj();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zza;
    }

    public static final boolean zzb() {
        zza();
        return Boolean.parseBoolean("");
    }
}
