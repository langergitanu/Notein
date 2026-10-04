package com.google.mlkit.p567nl.translate.internal;

import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_translate.zzt;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.ModelResource;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.model.ModelFileHelper;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes8.dex */
public class TranslateJni extends ModelResource {
    private static boolean zza;
    private final zzae zzb;
    private final zzs zzc;
    private final ModelFileHelper zzd;
    private final String zze;
    private final String zzf;
    private long zzg;

    public TranslateJni(zzae zzaeVar, zzs zzsVar, ModelFileHelper modelFileHelper, String str, String str2) {
        this.zzb = zzaeVar;
        this.zzc = zzsVar;
        this.zzd = modelFileHelper;
        this.zze = str;
        this.zzf = str2;
    }

    private native void nativeDestroy(long j);

    private native long nativeInit(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) throws zzk;

    private static Exception newLoadingException(int i) {
        return new zzk(i, null);
    }

    private static Exception newTranslateException(int i) {
        return new zzm(i, null);
    }

    public static void zze() throws MlKitException {
        if (zza) {
            return;
        }
        try {
            System.loadLibrary("translate_jni");
            zza = true;
        } catch (UnsatisfiedLinkError e) {
            throw new MlKitException("Couldn't load translate native code library.", 12, e);
        }
    }

    private final File zzf(String str) {
        return this.zzd.getModelDirUnsafe(str, ModelType.TRANSLATE, false);
    }

    @Override // com.google.mlkit.common.sdkinternal.ModelResource
    public final void load() throws Exception {
        String absolutePath;
        int i;
        Exception exc;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            Preconditions.checkState(this.zzg == 0);
            zze();
            String str = this.zze;
            String str2 = this.zzf;
            int i2 = zzac.zza;
            zzt zztVarZzi = str.equals(str2) ? zzt.zzi(str) : (str.equals(TranslateLanguage.ENGLISH) || str2.equals(TranslateLanguage.ENGLISH)) ? zzt.zzj(str, str2) : zzt.zzk(str, TranslateLanguage.ENGLISH, str2);
            zzn zznVar = null;
            if (zztVarZzi.size() < 2) {
                exc = null;
            } else {
                String absolutePath2 = zzf(zzac.zzc((String) zztVarZzi.get(0), (String) zztVarZzi.get(1))).getAbsolutePath();
                zzo zzoVar = new zzo(this, zznVar);
                zzoVar.zza(absolutePath2, (String) zztVarZzi.get(0), (String) zztVarZzi.get(1));
                zzo zzoVar2 = new zzo(this, zznVar);
                if (zztVarZzi.size() > 2) {
                    absolutePath = zzf(zzac.zzc((String) zztVarZzi.get(1), (String) zztVarZzi.get(2))).getAbsolutePath();
                    zzoVar2.zza(absolutePath, (String) zztVarZzi.get(1), (String) zztVarZzi.get(2));
                } else {
                    absolutePath = null;
                }
                try {
                    exc = null;
                    i = 1;
                    try {
                        long jNativeInit = nativeInit(this.zze, this.zzf, absolutePath2, absolutePath, zzoVar.zza, zzoVar2.zza, zzoVar.zzb, zzoVar2.zzb, zzoVar.zzc, zzoVar2.zzc);
                        this.zzg = jNativeInit;
                        Preconditions.checkState(jNativeInit != 0);
                    } catch (zzk e) {
                        e = e;
                        if (e.zza() != i && e.zza() != 8) {
                            throw new MlKitException("Error loading translation model", 2, e);
                        }
                        throw new MlKitException("Translation model files not found. Make sure to call downloadModelIfNeeded and if that fails, delete the models and retry.", 5, e);
                    }
                } catch (zzk e2) {
                    e = e2;
                    i = 1;
                }
            }
            this.zzc.zzo(jElapsedRealtime, exc);
        } catch (Exception e3) {
            this.zzc.zzo(jElapsedRealtime, e3);
            throw e3;
        }
    }

    public native byte[] nativeTranslate(long j, byte[] bArr) throws zzm;

    @Override // com.google.mlkit.common.sdkinternal.ModelResource
    public final void release() {
        long j = this.zzg;
        if (j == 0) {
            return;
        }
        nativeDestroy(j);
        this.zzg = 0L;
    }

    public final String zzd(String str) throws MlKitException {
        if (this.zze.equals(this.zzf)) {
            return str;
        }
        try {
            long j = this.zzg;
            Charset charset = StandardCharsets.UTF_8;
            return new String(nativeTranslate(j, str.getBytes(charset)), charset);
        } catch (zzm e) {
            throw new MlKitException("Error translating", 2, e);
        }
    }
}
