package com.google.android.gms.internal.mlkit_translate;

import android.os.SystemClock;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;

/* JADX INFO: loaded from: classes7.dex */
public final class zzvn {
    private static final GmsLogger zza = new GmsLogger("RemoteModelUtils", "");

    public static zzox zza(RemoteModel remoteModel, SharedPrefManager sharedPrefManager, zzvc zzvcVar) {
        ModelType modelTypeZzb = zzvcVar.zzb();
        String modelHash = remoteModel.getModelHash();
        zzpd zzpdVar = new zzpd();
        zzoy zzoyVar = new zzoy();
        zzoyVar.zzc(remoteModel.getModelNameForBackend());
        zzoyVar.zzd(zzpa.CLOUD);
        if (modelHash == null) {
            modelHash = "";
        }
        zzoyVar.zza(modelHash);
        int i = zzvm.zza[modelTypeZzb.ordinal()];
        zzoyVar.zzb(i != 1 ? i != 2 ? i != 3 ? zzoz.TYPE_UNKNOWN : zzoz.CUSTOM : zzoz.BASE_DIGITAL_INK : zzoz.BASE_TRANSLATE);
        zzpdVar.zzb(zzoyVar.zzg());
        zzpg zzpgVarZzc = zzpdVar.zzc();
        zzou zzouVar = new zzou();
        zzouVar.zzd(zzvcVar.zzc());
        zzouVar.zzc(zzvcVar.zzd());
        zzouVar.zzb(Long.valueOf(zzvcVar.zza()));
        zzouVar.zze(zzpgVarZzc);
        if (zzvcVar.zzg()) {
            long modelDownloadBeginTimeMs = sharedPrefManager.getModelDownloadBeginTimeMs(remoteModel);
            if (modelDownloadBeginTimeMs == 0) {
                zza.m74912w("RemoteModelUtils", "Model downloaded without its beginning time recorded.");
            } else {
                long modelFirstUseTimeMs = sharedPrefManager.getModelFirstUseTimeMs(remoteModel);
                if (modelFirstUseTimeMs == 0) {
                    modelFirstUseTimeMs = SystemClock.elapsedRealtime();
                    sharedPrefManager.setModelFirstUseTimeMs(remoteModel, modelFirstUseTimeMs);
                }
                zzouVar.zzf(Long.valueOf(modelFirstUseTimeMs - modelDownloadBeginTimeMs));
            }
        }
        return zzouVar.zzh();
    }
}
