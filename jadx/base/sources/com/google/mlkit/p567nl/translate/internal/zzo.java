package com.google.mlkit.p567nl.translate.internal;

import java.io.File;

/* JADX INFO: loaded from: classes8.dex */
final class zzo {
    String zza;
    String zzb;
    String zzc;
    final /* synthetic */ TranslateJni zzd;

    public /* synthetic */ zzo(TranslateJni translateJni, zzn zznVar) {
        this.zzd = translateJni;
    }

    private static final String zzb(File file) {
        if (file.exists()) {
            return file.getPath();
        }
        return null;
    }

    public final void zza(String str, String str2, String str3) {
        this.zzd.zzb.zza(str2, str3);
        File file = new File(str, zzae.zzd(str2, str3));
        File file2 = new File(str, zzae.zzc(str2, str3));
        File file3 = new File(str, zzae.zze(str2, str3));
        this.zza = zzb(file);
        this.zzb = zzb(file2);
        this.zzc = zzb(file3);
    }
}
