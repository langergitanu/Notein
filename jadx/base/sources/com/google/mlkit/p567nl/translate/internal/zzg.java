package com.google.mlkit.p567nl.translate.internal;

import android.app.DownloadManager;
import android.content.Context;
import com.google.android.gms.internal.mlkit_translate.zztc;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import com.google.mlkit.common.sdkinternal.model.ModelFileHelper;
import com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager;
import com.google.mlkit.p567nl.translate.TranslateRemoteModel;
import com.huawei.hms.network.embedded.C18115b5;

/* JADX INFO: loaded from: classes8.dex */
public final class zzg {
    private final MlKitContext zza;
    private final Context zzb;
    private final zzq zzc;
    private final zzae zzd;
    private final ModelFileHelper zze;
    private final SharedPrefManager zzf;

    public zzg(MlKitContext mlKitContext, Context context, zzq zzqVar, zzae zzaeVar, ModelFileHelper modelFileHelper, SharedPrefManager sharedPrefManager) {
        this.zza = mlKitContext;
        this.zzb = context;
        this.zzc = zzqVar;
        this.zzd = zzaeVar;
        this.zze = modelFileHelper;
        this.zzf = sharedPrefManager;
    }

    public final zzh zza(TranslateRemoteModel translateRemoteModel) {
        String[] strArrSplit = translateRemoteModel.getUniqueModelNameForPersist().split(C18115b5.CONNECTOR);
        zztc zztcVar = new zztc();
        zztcVar.zza(strArrSplit[0]);
        zztcVar.zzb(strArrSplit[1]);
        zzs zzsVarZza = this.zzc.zza(zztcVar.zzc());
        RemoteModelFileManager remoteModelFileManager = new RemoteModelFileManager(this.zza, translateRemoteModel, null, this.zze, new zzaf(this.zza, zzac.zzb(translateRemoteModel.getLanguage())));
        zzt zztVar = new zzt(zzsVarZza);
        DownloadManager downloadManager = (DownloadManager) this.zzb.getSystemService("download");
        zzb zzbVar = new zzb();
        return new zzh(this.zzb, remoteModelFileManager, translateRemoteModel, this.zzd, zzsVarZza, zztVar, downloadManager, this.zze, this.zzf, zzbVar);
    }
}
