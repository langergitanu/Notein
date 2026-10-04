package com.google.mlkit.p567nl.translate.internal;

import OooOoo.C20593OooO0Oo;
import Oooo0oO.o0Oo0oo;
import com.google.android.gms.internal.mlkit_translate.zzaq;
import com.google.android.gms.internal.mlkit_translate.zzi;
import com.google.android.gms.internal.mlkit_translate.zztc;
import com.google.android.gms.internal.mlkit_translate.zzvy;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.model.ModelFileHelper;
import com.huawei.hms.network.embedded.C18115b5;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzae {
    private final zzvy zza;
    private final zzq zzb;
    private final ModelFileHelper zzc;
    private final zzad zzd;

    public zzae(zzvy zzvyVar, zzad zzadVar, zzq zzqVar, ModelFileHelper modelFileHelper) {
        this.zza = zzvyVar;
        this.zzd = zzadVar;
        this.zzb = zzqVar;
        this.zzc = modelFileHelper;
    }

    public static final String zzc(String str, String str2) {
        return C20593OooO0Oo.OooO0O0("fallback_to_pb_", zzh(str, str2), ".pb.bin");
    }

    public static final String zzd(String str, String str2) {
        return C20593OooO0Oo.OooO0O0("nmt_rapid_response_", zzh(str, str2), ".pb.bin");
    }

    public static final String zze(String str, String str2) {
        return C20593OooO0Oo.OooO0O0("stt_rapid_response_", zzh(str, str2), ".pb.bin");
    }

    public static final void zzf(File file, String str, String str2) throws IOException {
        File file2 = new File(file, str);
        if (zzi.zzb(str2)) {
            if (file2.exists()) {
                file2.delete();
                return;
            }
            return;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            fileOutputStream.write(zzaq.zzd().zze(str2));
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static final void zzg(File file, String str, String str2) {
        new File(file, zzd(str, str2)).delete();
        new File(file, zze(str, str2)).delete();
        new File(file, zzc(str, str2)).delete();
    }

    private static String zzh(String str, String str2) {
        return o0Oo0oo.OooO0Oo(str, C18115b5.CONNECTOR, str2);
    }

    public final void zza(String str, String str2) {
        File modelDirUnsafe = this.zzc.getModelDirUnsafe(zzac.zzc(str, str2), ModelType.TRANSLATE, false);
        String strZzh = zzh(str, str2);
        try {
            zzc.zza(modelDirUnsafe);
            zzf(modelDirUnsafe, zzd(str, str2), this.zzd.zza.zzf("nl_translate_rapid_response_nmt_" + strZzh));
            zzf(modelDirUnsafe, zzc(str, str2), this.zzd.zza.zzf("nl_translate_rapid_response_pbmt_" + strZzh));
            zzf(modelDirUnsafe, zze(str, str2), this.zzd.zza.zzf("nl_translate_rapid_response_stt_" + strZzh));
        } catch (IOException unused) {
            zztc zztcVar = new zztc();
            zztcVar.zza(str);
            zztcVar.zzb(str2);
            this.zzb.zza(zztcVar.zzc()).zzw();
        }
    }

    public final void zzb() {
        this.zza.zza(zzvy.zza);
    }
}
