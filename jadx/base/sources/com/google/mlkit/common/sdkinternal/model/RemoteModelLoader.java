package com.google.mlkit.common.sdkinternal.model;

import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.internal.mlkit_common.zzsh;
import com.google.android.gms.internal.mlkit_common.zzsk;
import com.google.android.gms.internal.mlkit_common.zzss;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.io.File;
import java.nio.MappedByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class RemoteModelLoader {
    private static final GmsLogger zza = new GmsLogger("RemoteModelLoader", "");
    private static final Map zzb = new HashMap();
    private final MlKitContext zzc;
    private final RemoteModel zzd;
    private final RemoteModelDownloadManager zze;
    private final RemoteModelFileManager zzf;
    private final RemoteModelLoaderHelper zzg;
    private final zzsh zzh;
    private boolean zzi;

    private RemoteModelLoader(MlKitContext mlKitContext, RemoteModel remoteModel, ModelValidator modelValidator, RemoteModelLoaderHelper remoteModelLoaderHelper, RemoteModelFileMover remoteModelFileMover) {
        RemoteModelFileManager remoteModelFileManager = new RemoteModelFileManager(mlKitContext, remoteModel, modelValidator, new ModelFileHelper(mlKitContext), remoteModelFileMover);
        this.zzf = remoteModelFileManager;
        this.zzi = true;
        this.zze = RemoteModelDownloadManager.getInstance(mlKitContext, remoteModel, new ModelFileHelper(mlKitContext), remoteModelFileManager, (ModelInfoRetrieverInterop) mlKitContext.get(ModelInfoRetrieverInterop.class));
        this.zzg = remoteModelLoaderHelper;
        this.zzc = mlKitContext;
        this.zzd = remoteModel;
        this.zzh = zzss.zzb("common");
    }

    public static synchronized RemoteModelLoader getInstance(MlKitContext mlKitContext, RemoteModel remoteModel, ModelValidator modelValidator, RemoteModelLoaderHelper remoteModelLoaderHelper, RemoteModelFileMover remoteModelFileMover) {
        String uniqueModelNameForPersist;
        Map map;
        try {
            uniqueModelNameForPersist = remoteModel.getUniqueModelNameForPersist();
            map = zzb;
            if (!map.containsKey(uniqueModelNameForPersist)) {
                map.put(uniqueModelNameForPersist, new RemoteModelLoader(mlKitContext, remoteModel, modelValidator, remoteModelLoaderHelper, remoteModelFileMover));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (RemoteModelLoader) map.get(uniqueModelNameForPersist);
    }

    private final MappedByteBuffer zza(String str) throws MlKitException {
        return this.zzg.loadModelAtPath(str);
    }

    private final MappedByteBuffer zzb(File file) throws MlKitException {
        try {
            return zza(file.getAbsolutePath());
        } catch (Exception e) {
            this.zzf.zzc(file);
            throw new MlKitException("Failed to load newly downloaded model.", 14, e);
        }
    }

    public RemoteModel getRemoteModel() {
        return this.zzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8 A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:3:0x0001, B:7:0x001e, B:9:0x0026, B:28:0x00b8, B:30:0x00c7, B:32:0x00cf, B:35:0x00d5, B:36:0x00f3, B:37:0x00f4, B:13:0x0031, B:15:0x0048, B:18:0x0051, B:20:0x006f, B:22:0x0077, B:23:0x0089, B:25:0x0091, B:26:0x00a8), top: B:45:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f4 A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #1 {all -> 0x002e, blocks: (B:3:0x0001, B:7:0x001e, B:9:0x0026, B:28:0x00b8, B:30:0x00c7, B:32:0x00cf, B:35:0x00d5, B:36:0x00f3, B:37:0x00f4, B:13:0x0031, B:15:0x0048, B:18:0x0051, B:20:0x006f, B:22:0x0077, B:23:0x0089, B:25:0x0091, B:26:0x00a8), top: B:45:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized MappedByteBuffer load() throws MlKitException {
        MappedByteBuffer mappedByteBufferZza;
        MappedByteBuffer mappedByteBufferZzb;
        try {
            GmsLogger gmsLogger = zza;
            gmsLogger.m74904d("RemoteModelLoader", "Try to load newly downloaded model file.");
            RemoteModelDownloadManager remoteModelDownloadManager = this.zze;
            boolean z = this.zzi;
            Long downloadingId = remoteModelDownloadManager.getDownloadingId();
            String downloadingModelHash = remoteModelDownloadManager.getDownloadingModelHash();
            mappedByteBufferZza = null;
            if (downloadingId == null || downloadingModelHash == null) {
                gmsLogger.m74904d("RemoteModelLoader", "No new model is downloading.");
                this.zze.removeOrCancelDownload();
            } else {
                Integer downloadingModelStatusCode = this.zze.getDownloadingModelStatusCode();
                if (downloadingModelStatusCode == null) {
                    this.zze.removeOrCancelDownload();
                } else {
                    gmsLogger.m74904d("RemoteModelLoader", "Download Status code: ".concat(downloadingModelStatusCode.toString()));
                    if (downloadingModelStatusCode.intValue() == 8) {
                        File fileZzi = this.zze.zzi(downloadingModelHash);
                        if (fileZzi != null) {
                            mappedByteBufferZzb = zzb(fileZzi);
                            gmsLogger.m74904d("RemoteModelLoader", "Moved the downloaded model to private folder successfully: ".concat(String.valueOf(fileZzi.getParent())));
                            this.zze.updateLatestModelHashAndType(downloadingModelHash);
                            if (z && this.zzf.zzd(fileZzi)) {
                                gmsLogger.m74904d("RemoteModelLoader", "All old models are deleted.");
                                mappedByteBufferZzb = zzb(this.zzf.zza(fileZzi));
                            }
                            if (mappedByteBufferZzb != null) {
                                gmsLogger.m74904d("RemoteModelLoader", "Loading existing model file.");
                                String strZzb = this.zzf.zzb();
                                if (strZzb == null) {
                                    gmsLogger.m74904d("RemoteModelLoader", "No existing model file");
                                } else {
                                    try {
                                        mappedByteBufferZza = zza(strZzb);
                                    } catch (Exception e) {
                                        this.zzf.zzc(new File(strZzb));
                                        SharedPrefManager.getInstance(this.zzc).clearLatestModelHash(this.zzd);
                                        throw new MlKitException("Failed to load an already downloaded model.", 14, e);
                                    }
                                }
                            } else {
                                this.zzi = false;
                                mappedByteBufferZza = mappedByteBufferZzb;
                            }
                        }
                    } else if (downloadingModelStatusCode.intValue() == 16) {
                        this.zzh.zze(zzsk.zzg(), this.zzd, false, this.zze.getFailureReason(downloadingId));
                        this.zze.removeOrCancelDownload();
                    }
                }
            }
            mappedByteBufferZzb = null;
            if (mappedByteBufferZzb != null) {
            }
        } catch (Throwable th) {
            throw th;
        }
        return mappedByteBufferZza;
    }
}
