package com.google.mlkit.p567nl.translate.internal;

import android.os.SystemClock;
import com.google.android.gms.internal.mlkit_translate.zzoa;
import com.google.android.gms.internal.mlkit_translate.zzoc;
import com.google.android.gms.internal.mlkit_translate.zzoo;
import com.google.android.gms.internal.mlkit_translate.zzop;
import com.google.android.gms.internal.mlkit_translate.zzoq;
import com.google.android.gms.internal.mlkit_translate.zzor;
import com.google.android.gms.internal.mlkit_translate.zzov;
import com.google.android.gms.internal.mlkit_translate.zzsb;
import com.google.android.gms.internal.mlkit_translate.zzsc;
import com.google.android.gms.internal.mlkit_translate.zzte;
import com.google.android.gms.internal.mlkit_translate.zztv;
import com.google.android.gms.internal.mlkit_translate.zzup;
import com.google.android.gms.internal.mlkit_translate.zzuy;
import com.google.android.gms.internal.mlkit_translate.zzva;
import com.google.android.gms.internal.mlkit_translate.zzvb;
import com.google.android.gms.internal.mlkit_translate.zzvc;
import com.google.android.gms.internal.mlkit_translate.zzvd;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.ModelType;

/* JADX INFO: loaded from: classes8.dex */
public final class zzs {
    private final zzuy zza;
    private final zzva zzb;
    private final zzte zzc;

    public /* synthetic */ zzs(zzuy zzuyVar, zzva zzvaVar, zzte zzteVar, zzr zzrVar) {
        this.zza = zzuyVar;
        this.zzc = zzteVar;
        this.zzb = zzvaVar;
    }

    private final void zzA(zzsb zzsbVar, zzoq zzoqVar) {
        zzor zzorVar = new zzor();
        zzorVar.zze(zzoo.TYPE_THICK);
        zzorVar.zzj(zzsbVar.zzj());
        this.zza.zzd(zzvd.zzf(zzorVar), zzoqVar);
    }

    private final void zzB(zzsc zzscVar, zzoq zzoqVar) {
        zzsb zzsbVar = new zzsb();
        zzsbVar.zze(this.zzc);
        zzsbVar.zzg(zzscVar);
        zzA(zzsbVar, zzoqVar);
    }

    private final zzsb zzz(zzoc zzocVar) {
        zzsb zzsbVar = new zzsb();
        zzsbVar.zze(this.zzc);
        zzsbVar.zzb(zzocVar);
        return zzsbVar;
    }

    public final void zza(RemoteModel remoteModel, zzop zzopVar, boolean z, ModelType modelType, zzov zzovVar) {
        zzup zzupVarZzg = zzvd.zzg();
        zzvb zzvbVarZzh = zzvc.zzh();
        zzvbVarZzh.zzf(true);
        zzvbVarZzh.zzd(modelType);
        zzvbVarZzh.zzb(zzopVar);
        zzvbVarZzh.zza(zzovVar);
        this.zza.zzf(zzupVarZzg, remoteModel, zzvbVarZzh.zzh());
    }

    public final void zzb(RemoteModel remoteModel, boolean z, int i) {
        zzup zzupVarZzg = zzvd.zzg();
        zzvb zzvbVarZzh = zzvc.zzh();
        zzvbVarZzh.zzf(true);
        zzvbVarZzh.zzd(remoteModel.getModelType());
        zzvbVarZzh.zza(zzov.FAILED);
        zzvbVarZzh.zzb(zzop.DOWNLOAD_FAILED);
        zzvbVarZzh.zzc(i);
        this.zza.zzf(zzupVarZzg, remoteModel, zzvbVarZzh.zzh());
    }

    public final void zzc() {
        zzB(zzsc.DOWNLOAD_MANAGER_CANNOT_RESUME, zzoq.ON_DEVICE_TRANSLATOR_DOWNLOAD);
    }

    public final void zzd() {
        zzB(zzsc.DOWNLOAD_MANAGER_DEVICE_NOT_FOUND, zzoq.ON_DEVICE_TRANSLATOR_DOWNLOAD);
    }

    public final void zze() {
        zzB(zzsc.DOWNLOAD_MANAGER_FILE_ALREADY_EXISTS, zzoq.ON_DEVICE_TRANSLATOR_DOWNLOAD);
    }

    public final void zzf() {
        zzB(zzsc.DOWNLOAD_MANAGER_FILE_ERROR, zzoq.ON_DEVICE_TRANSLATOR_DOWNLOAD);
    }

    public final void zzg() {
        zzB(zzsc.DOWNLOAD_MANAGER_HTTP_DATA_ERROR, zzoq.ON_DEVICE_TRANSLATOR_DOWNLOAD);
    }

    public final void zzh(int i) {
        zzsc zzscVarZzb = zzsc.zzb(i);
        if (zzscVarZzb == zzsc.NO_ERROR) {
            zzB(zzsc.DOWNLOAD_MANAGER_HTTP_UNKNOWN_STATUS, zzoq.ON_DEVICE_TRANSLATOR_DOWNLOAD);
        } else {
            zzB(zzscVarZzb, zzoq.ON_DEVICE_TRANSLATOR_DOWNLOAD);
        }
    }

    public final void zzi() {
        zzB(zzsc.DOWNLOAD_MANAGER_INSUFFICIENT_SPACE, zzoq.ON_DEVICE_TRANSLATOR_DOWNLOAD);
    }

    public final void zzj() {
        zzB(zzsc.DOWNLOAD_MANAGER_SERVICE_MISSING, zzoq.ON_DEVICE_TRANSLATOR_DOWNLOAD);
    }

    public final void zzk() {
        zzB(zzsc.DOWNLOAD_MANAGER_TOO_MANY_REDIRECTS, zzoq.ON_DEVICE_TRANSLATOR_DOWNLOAD);
    }

    public final void zzl() {
        zzB(zzsc.DOWNLOAD_MANAGER_UNHANDLED_HTTP_CODE, zzoq.ON_DEVICE_TRANSLATOR_DOWNLOAD);
    }

    public final void zzm() {
        zzB(zzsc.DOWNLOAD_MANAGER_UNKNOWN_ERROR, zzoq.ON_DEVICE_TRANSLATOR_DOWNLOAD);
    }

    public final void zzn() {
        zzB(zzsc.NO_ERROR, zzoq.ON_DEVICE_TRANSLATOR_DOWNLOAD);
    }

    public final void zzo(long j, Exception exc) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        zztv.zzd("translate-load").zzb(jElapsedRealtime);
        zzoa zzoaVar = new zzoa();
        zzoaVar.zza(Long.valueOf(jElapsedRealtime));
        if (exc != null) {
            zzoaVar.zzb(zzop.UNKNOWN_ERROR);
        }
        zzsb zzsbVarZzz = zzz(zzoaVar.zzd());
        if (exc != null && (exc.getCause() instanceof zzk)) {
            zzsbVarZzz.zzd(Integer.valueOf(((zzk) exc.getCause()).zza()));
        }
        zzA(zzsbVarZzz, zzoq.ON_DEVICE_TRANSLATOR_LOAD);
    }

    public final void zzp() {
        zzB(zzsc.METADATA_FILE_UNAVAILABLE, zzoq.ON_DEVICE_TRANSLATOR_DOWNLOAD);
    }

    public final void zzq() {
        zzB(zzsc.METADATA_HASH_NOT_FOUND, zzoq.ON_DEVICE_TRANSLATOR_DOWNLOAD);
    }

    public final void zzr() {
        zzB(zzsc.METADATA_JSON_INVALID, zzoq.ON_DEVICE_TRANSLATOR_DOWNLOAD);
    }

    public final void zzs() {
        zzB(zzsc.METADATA_ENTRY_NOT_FOUND, zzoq.ON_DEVICE_TRANSLATOR_DOWNLOAD);
    }

    public final void zzt() {
        zzB(zzsc.POST_DOWNLOAD_MOVE_FILE_FAILED, zzoq.ON_DEVICE_TRANSLATOR_DOWNLOAD);
    }

    public final void zzu() {
        zzB(zzsc.POST_DOWNLOAD_FILE_NOT_FOUND, zzoq.ON_DEVICE_TRANSLATOR_DOWNLOAD);
    }

    public final void zzv() {
        zzB(zzsc.POST_DOWNLOAD_UNZIP_FAILED, zzoq.ON_DEVICE_TRANSLATOR_DOWNLOAD);
    }

    public final void zzw() {
        zzB(zzsc.RAPID_RESPONSE_COULD_NOT_BE_WRITTEN, zzoq.ON_DEVICE_TRANSLATOR_LOAD);
    }

    public final void zzx() {
        zzA(zzz(new zzoa().zzd()), zzoq.ON_DEVICE_TRANSLATOR_CREATE);
    }

    public final void zzy(String str, boolean z, long j, Task task) {
        zztv.zzd("translate-inference").zzb(j);
        zzop zzopVar = task.isSuccessful() ? zzop.NO_ERROR : zzop.UNKNOWN_ERROR;
        zzoa zzoaVar = new zzoa();
        zzoaVar.zza(Long.valueOf(j));
        zzoaVar.zzc(Boolean.valueOf(z));
        zzoaVar.zzb(zzopVar);
        zzsb zzsbVarZzz = zzz(zzoaVar.zzd());
        zzsbVarZzz.zzc(Integer.valueOf(str.length()));
        zzsbVarZzz.zzf(Integer.valueOf(task.isSuccessful() ? ((String) task.getResult()).length() : -1));
        Exception exception = task.getException();
        if (exception != null) {
            if (exception.getCause() instanceof zzk) {
                zzsbVarZzz.zzd(Integer.valueOf(((zzk) exception.getCause()).zza()));
            } else if (exception.getCause() instanceof zzm) {
                zzsbVarZzz.zzh(Integer.valueOf(((zzm) exception.getCause()).zza()));
            }
        }
        zzA(zzsbVarZzz, zzoq.ON_DEVICE_TRANSLATOR_TRANSLATE);
        zzva zzvaVar = this.zzb;
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzvaVar.zzc(24605, zzopVar.zza(), jCurrentTimeMillis - j, jCurrentTimeMillis);
    }
}
