package com.google.mlkit.p567nl.translate.internal;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_translate.zzas;
import com.google.android.gms.internal.mlkit_translate.zzat;
import com.google.android.gms.internal.mlkit_translate.zze;
import com.google.android.gms.internal.mlkit_translate.zzop;
import com.google.android.gms.internal.mlkit_translate.zzov;
import com.google.android.gms.internal.mlkit_translate.zzq;
import com.google.android.gms.internal.mlkit_translate.zzt;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.DownloadConditions;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.ModelInfo;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import com.google.mlkit.common.sdkinternal.model.ModelFileHelper;
import com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager;
import com.google.mlkit.p567nl.translate.TranslateRemoteModel;
import com.microsoft.identity.common.java.eststelemetry.PublicApiId;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes8.dex */
public final class zzh {
    private static final GmsLogger zza = new GmsLogger("TranslateDLManager", "");
    private final Context zzb;
    private final RemoteModelFileManager zzc;
    private final TranslateRemoteModel zzd;
    private final zzs zze;
    private final zzt zzf;
    private final DownloadManager zzg;
    private final ModelFileHelper zzh;
    private final SharedPrefManager zzi;
    private final SharedPreferences zzj;
    private TaskCompletionSource zzk;
    private List zzl;
    private DownloadConditions zzm;
    private BroadcastReceiver zzn;

    public zzh(Context context, RemoteModelFileManager remoteModelFileManager, TranslateRemoteModel translateRemoteModel, zzae zzaeVar, zzs zzsVar, zzt zztVar, DownloadManager downloadManager, ModelFileHelper modelFileHelper, SharedPrefManager sharedPrefManager, zzb zzbVar) {
        this.zzb = context;
        this.zzc = remoteModelFileManager;
        this.zzd = translateRemoteModel;
        this.zze = zzsVar;
        this.zzf = zztVar;
        if (downloadManager == null) {
            zza.m74904d("TranslateDLManager", "Download manager service is not available in the service.");
        }
        this.zzg = downloadManager;
        this.zzh = modelFileHelper;
        this.zzi = sharedPrefManager;
        this.zzj = context.getSharedPreferences("com.google.mlkit.translate.download_manager", 0);
        this.zzk = new TaskCompletionSource();
    }

    private final int zzk() {
        List list = this.zzl;
        if (list != null && !list.isEmpty()) {
            List list2 = (List) Preconditions.checkNotNull(this.zzl);
            String string = this.zzj.getString("last_uri_for_".concat(String.valueOf(((ModelInfo) list2.get(0)).getModelHash())), null);
            if (string != null) {
                int i = 0;
                while (i < list2.size()) {
                    int i2 = i + 1;
                    if (string.equals(((ModelInfo) list2.get(i)).getModelUri().toString())) {
                        return i2;
                    }
                    i = i2;
                }
                zza.m74906e("TranslateDLManager", "Stored LAST_URI_ATTEMPTED was not found in ModelInfo");
            }
        }
        return 0;
    }

    private final Task zzl() {
        Preconditions.checkState(this.zzm != null);
        int iZzk = zzk();
        List list = this.zzl;
        if (list == null || iZzk >= list.size()) {
            return Tasks.forResult(zze.zzb());
        }
        ModelInfo modelInfo = (ModelInfo) this.zzl.get(iZzk);
        try {
            Preconditions.checkState(this.zzm != null);
            DownloadConditions downloadConditions = (DownloadConditions) Preconditions.checkNotNull(this.zzm);
            String strZze = zze();
            DownloadManager.Request request = null;
            if (strZze == null || !strZze.equals(modelInfo.getModelHash()) || zzc() == null) {
                GmsLogger gmsLogger = zza;
                gmsLogger.m74904d("TranslateDLManager", "Need to download a new model.");
                boolean zZzi = zzi(this.zzd, modelInfo.getModelHash());
                zzh();
                DownloadManager.Request request2 = new DownloadManager.Request(modelInfo.getModelUri());
                if (!zzj() || zZzi) {
                    request2.setRequiresCharging(downloadConditions.isChargingRequired());
                    if (downloadConditions.isWifiRequired()) {
                        request2.setAllowedNetworkTypes(2);
                    }
                    request2.addRequestHeader("User-Agent", "TRANSLATE_OPM5_TEST_1");
                    request = request2;
                } else {
                    gmsLogger.m74904d("TranslateDLManager", "Remote model hash is simliar to local model. Skipping download.");
                }
            } else {
                zza.m74904d("TranslateDLManager", "New model is already in downloading, do nothing.");
            }
            if (request == null && zzd() == null) {
                return Tasks.forResult(zze.zzb());
            }
            if (request != null) {
                Preconditions.checkHandlerThread(MLTaskExecutor.getInstance().getHandler());
                DownloadManager downloadManager = this.zzg;
                if (downloadManager == null) {
                    this.zze.zzj();
                } else {
                    long jEnqueue = downloadManager.enqueue(request);
                    zza.m74904d("TranslateDLManager", "Schedule a new downloading task: " + jEnqueue);
                    this.zzi.setDownloadingModelInfo(jEnqueue, modelInfo);
                    this.zzj.edit().putString("last_uri_for_".concat(String.valueOf(modelInfo.getModelHash())), modelInfo.getModelUri().toString()).commit();
                }
            }
            Integer numZzc = zzc();
            if (numZzc == null || !(numZzc.intValue() == 4 || numZzc.intValue() == 1 || numZzc.intValue() == 2)) {
                MLTaskExecutor.getInstance().getHandler().post(new Runnable() { // from class: com.google.mlkit.nl.translate.internal.zzd
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzg();
                    }
                });
            } else if (this.zzn == null) {
                zzf zzfVar = new zzf(this, this);
                this.zzn = zzfVar;
                ContextCompat.registerReceiver(this.zzb, zzfVar, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), 2);
            }
            return this.zzk.getTask();
        } catch (MlKitException e) {
            return Tasks.forException(e);
        }
    }

    public final Task zza(DownloadConditions downloadConditions) {
        try {
            List listZza = this.zzf.zza(this.zzb, this.zzd);
            ModelInfo modelInfo = (ModelInfo) listZza.get(0);
            boolean zZzj = zzj();
            if (!zZzj) {
                this.zzi.clearLatestModelHash(this.zzd);
            }
            boolean zZzi = zzi(this.zzd, modelInfo.getModelHash());
            if (zZzj && !zZzi) {
                listZza = null;
            }
            this.zzl = listZza;
            if (listZza == null || listZza.isEmpty()) {
                zza.m74904d("TranslateDLManager", "No model updates for model: ".concat(String.valueOf(zzac.zzb(this.zzd.getLanguage()))));
                return Tasks.forResult(zze.zzb());
            }
            this.zzk = new TaskCompletionSource();
            this.zzm = downloadConditions;
            return zzl();
        } catch (MlKitException e) {
            return Tasks.forException(e);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4 A[Catch: all -> 0x0085, TryCatch #2 {all -> 0x0085, blocks: (B:16:0x006f, B:18:0x007e, B:29:0x00a4, B:30:0x00ab, B:32:0x00bc, B:33:0x00c3, B:34:0x00ea, B:65:0x0164, B:67:0x016d, B:69:0x0178, B:71:0x017b, B:73:0x0183, B:75:0x0189, B:77:0x018c, B:79:0x019d, B:80:0x019f, B:81:0x01a6, B:84:0x01a9, B:86:0x01af, B:90:0x01d8, B:91:0x01df, B:92:0x01e0, B:93:0x01e7, B:94:0x01e8, B:95:0x01ef, B:96:0x01f0, B:97:0x01f7, B:98:0x01f8, B:99:0x01ff, B:104:0x0208, B:103:0x0205, B:105:0x0209, B:106:0x021c, B:22:0x0088, B:25:0x008f, B:27:0x009a), top: B:129:0x006f, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab A[Catch: all -> 0x0085, TryCatch #2 {all -> 0x0085, blocks: (B:16:0x006f, B:18:0x007e, B:29:0x00a4, B:30:0x00ab, B:32:0x00bc, B:33:0x00c3, B:34:0x00ea, B:65:0x0164, B:67:0x016d, B:69:0x0178, B:71:0x017b, B:73:0x0183, B:75:0x0189, B:77:0x018c, B:79:0x019d, B:80:0x019f, B:81:0x01a6, B:84:0x01a9, B:86:0x01af, B:90:0x01d8, B:91:0x01df, B:92:0x01e0, B:93:0x01e7, B:94:0x01e8, B:95:0x01ef, B:96:0x01f0, B:97:0x01f7, B:98:0x01f8, B:99:0x01ff, B:104:0x0208, B:103:0x0205, B:105:0x0209, B:106:0x021c, B:22:0x0088, B:25:0x008f, B:27:0x009a), top: B:129:0x006f, inners: #0, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final File zzb() throws MlKitException {
        Cursor cursorQuery;
        int columnIndex;
        ParcelFileDescriptor parcelFileDescriptorOpenDownloadedFile;
        int i = 0;
        Preconditions.checkHandlerThread(MLTaskExecutor.getInstance().getHandler());
        Long lZzd = zzd();
        String strZze = zze();
        File file = null;
        if (lZzd == null || strZze == null) {
            zza.m74904d("TranslateDLManager", "No new model is downloading.");
            zzh();
            return null;
        }
        Integer numZzc = zzc();
        if (numZzc == null) {
            zzh();
            this.zzk.setException(new MlKitException("No download", 13));
            return null;
        }
        GmsLogger gmsLogger = zza;
        gmsLogger.m74904d("TranslateDLManager", "Download Status code: ".concat(numZzc.toString()));
        if (numZzc.intValue() != 8) {
            if (numZzc.intValue() == 16) {
                DownloadManager downloadManager = this.zzg;
                if (downloadManager != null && (cursorQuery = downloadManager.query(new DownloadManager.Query().setFilterById(lZzd.longValue()))) != null && cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("reason")) != -1) {
                    i = cursorQuery.getInt(columnIndex);
                }
                this.zze.zzb(this.zzd, true, i);
                zzh();
                TaskCompletionSource taskCompletionSource = this.zzk;
                Locale locale = Locale.US;
                taskCompletionSource.setException(new MlKitException(C21532OooOOo.OooO0OO(i, "Downloading error "), 13));
            }
            return null;
        }
        BroadcastReceiver broadcastReceiver = this.zzn;
        if (broadcastReceiver != null) {
            this.zzb.unregisterReceiver(broadcastReceiver);
            this.zzn = null;
        }
        gmsLogger.m74904d("TranslateDLManager", "Model downloaded successfully");
        this.zze.zza(this.zzd, zzop.NO_ERROR, true, ModelType.TRANSLATE, zzov.SUCCEEDED);
        try {
            Preconditions.checkHandlerThread(MLTaskExecutor.getInstance().getHandler());
            if (this.zzg != null) {
                Long lZzd2 = zzd();
                if (lZzd2 != null) {
                    try {
                        parcelFileDescriptorOpenDownloadedFile = this.zzg.openDownloadedFile(lZzd2.longValue());
                    } catch (FileNotFoundException unused) {
                        zza.m74906e("TranslateDLManager", "Downloaded file is not found");
                        parcelFileDescriptorOpenDownloadedFile = null;
                    }
                }
                if (parcelFileDescriptorOpenDownloadedFile != null) {
                    this.zze.zzu();
                } else {
                    zza.m74904d("TranslateDLManager", "moving downloaded model from external storage to private folder.");
                    File fileMoveModelToPrivateFolder = this.zzc.moveModelToPrivateFolder(parcelFileDescriptorOpenDownloadedFile, strZze, this.zzd);
                    if (fileMoveModelToPrivateFolder == null) {
                        this.zze.zzt();
                    } else {
                        Preconditions.checkHandlerThread(MLTaskExecutor.getInstance().getHandler());
                        String strZzb = zzac.zzb(this.zzd.getLanguage());
                        File modelDirUnsafe = this.zzc.getModelDirUnsafe(false);
                        final String str = String.format("dict.%1$s_%2$s", strZzb, PublicApiId.SINGLE_ACCOUNT_PCA_ACQUIRE_TOKEN_SILENT_WITH_SCOPES_AUTHORITY);
                        try {
                            File fileZza = zzat.zza();
                            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(fileMoveModelToPrivateFolder));
                            try {
                                ZipEntry nextEntry = zipInputStream.getNextEntry();
                                while (nextEntry != null) {
                                    if (!nextEntry.isDirectory()) {
                                        String name = nextEntry.getName();
                                        File file2 = new File(fileZza, name);
                                        if (!file2.getCanonicalPath().startsWith(fileZza.getCanonicalPath())) {
                                            throw new ZipException("Illegal name: ".concat(String.valueOf(name)));
                                        }
                                        File parentFile = file2.getParentFile();
                                        if (parentFile != null) {
                                            zzc.zza(parentFile);
                                        }
                                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                        try {
                                            int i2 = zzas.zza;
                                            byte[] bArr = new byte[8192];
                                            while (true) {
                                                int i3 = zipInputStream.read(bArr);
                                                if (i3 == -1) {
                                                    break;
                                                }
                                                fileOutputStream.write(bArr, 0, i3);
                                            }
                                            fileOutputStream.close();
                                        } finally {
                                        }
                                    }
                                    nextEntry = zipInputStream.getNextEntry();
                                }
                                zipInputStream.close();
                                if (!fileMoveModelToPrivateFolder.delete()) {
                                    throw new IOException("Zip file could not be deleted.");
                                }
                                File[] fileArrListFiles = fileZza.listFiles(new FilenameFilter() { // from class: com.google.mlkit.nl.translate.internal.zza
                                    @Override // java.io.FilenameFilter
                                    public final boolean accept(File file3, String str2) {
                                        return str2.equals(str);
                                    }
                                });
                                if (fileArrListFiles == null || fileArrListFiles.length != 1) {
                                    throw new IOException("Unexpected behavior for inZipFolder inside the zip archive.");
                                }
                                File file3 = fileArrListFiles[0];
                                File[] fileArrListFiles2 = file3.listFiles();
                                if (fileArrListFiles2 == null) {
                                    throw new IOException("Failed to list zip content files.");
                                }
                                if (!zzc.zzc(modelDirUnsafe, false)) {
                                    throw new IOException("Unable to delete existing models");
                                }
                                int length = fileArrListFiles2.length;
                                while (i < length) {
                                    File file4 = fileArrListFiles2[i];
                                    if (!file4.renameTo(new File(modelDirUnsafe, file4.getName()))) {
                                        throw new IOException("Zip content file could not be moved.");
                                    }
                                    i++;
                                }
                                if (!file3.delete()) {
                                    throw new IOException("Unzipped folder could not be deleted.");
                                }
                                zza.m74904d("TranslateDLManager", "Moved the downloaded model to private folder successfully: ".concat(fileMoveModelToPrivateFolder.toString()));
                                this.zzi.setLatestModelHash(this.zzd, strZze);
                                file = modelDirUnsafe;
                            } catch (Throwable th) {
                                try {
                                    zipInputStream.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        } catch (IOException e) {
                            zza.m74905d("TranslateDLManager", "Could not unzip translate model file", e);
                            this.zze.zzv();
                            throw new MlKitException("Could not unzip translate model file", 13, e);
                        }
                    }
                }
                zzh();
                this.zze.zzn();
                this.zzk.setResult(zze.zzc(lZzd));
                return file;
            }
            this.zze.zzj();
            parcelFileDescriptorOpenDownloadedFile = null;
            if (parcelFileDescriptorOpenDownloadedFile != null) {
            }
            zzh();
            this.zze.zzn();
            this.zzk.setResult(zze.zzc(lZzd));
            return file;
        } catch (Throwable th3) {
            zzh();
            throw th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Integer zzc() {
        Integer num = null;
        if (this.zzg == null) {
            this.zze.zzj();
            return null;
        }
        Long lZzd = zzd();
        if (lZzd != null) {
            Cursor cursorQuery = this.zzg.query(new DownloadManager.Query().setFilterById(lZzd.longValue()));
            if (cursorQuery != null) {
                try {
                    Integer numValueOf = cursorQuery.moveToFirst() ? Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("status"))) : null;
                    if (numValueOf != null) {
                        if (numValueOf.intValue() == 16) {
                            Cursor cursor = (Cursor) Preconditions.checkNotNull(cursorQuery);
                            int i = cursor.getInt(cursor.getColumnIndex("reason"));
                            if (i < 100 || i > 599) {
                                switch (i) {
                                    case 1001:
                                        this.zze.zzf();
                                        break;
                                    case 1002:
                                        this.zze.zzl();
                                        break;
                                    case 1003:
                                    default:
                                        this.zze.zzm();
                                        break;
                                    case 1004:
                                        this.zze.zzg();
                                        break;
                                    case 1005:
                                        this.zze.zzk();
                                        break;
                                    case 1006:
                                        this.zze.zzi();
                                        break;
                                    case 1007:
                                        this.zze.zzd();
                                        break;
                                    case 1008:
                                        this.zze.zzc();
                                        break;
                                    case 1009:
                                        this.zze.zze();
                                        break;
                                }
                            } else {
                                this.zze.zzh(i);
                            }
                        }
                        if (numValueOf.intValue() == 2 || numValueOf.intValue() == 4 || numValueOf.intValue() == 1 || numValueOf.intValue() == 8) {
                            num = numValueOf;
                        } else if (numValueOf.intValue() == 16) {
                        }
                        cursorQuery.close();
                        return num;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Throwable th) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
        return null;
    }

    public final Long zzd() {
        return this.zzi.getDownloadingModelId(this.zzd);
    }

    public final String zze() {
        return this.zzi.getDownloadingModelHash(this.zzd);
    }

    public final void zzf() throws MlKitException {
        zzh();
        this.zzi.clearLatestModelHash(this.zzd);
        String strZzb = zzac.zzb(this.zzd.getLanguage());
        File modelDirUnsafe = this.zzc.getModelDirUnsafe(false);
        String[] strArrZzd = zzac.zzd(strZzb);
        zzae.zzg(modelDirUnsafe, strArrZzd[0], strArrZzd[1]);
        zzae.zzg(modelDirUnsafe, strArrZzd[1], strArrZzd[0]);
        zzq zzqVar = new zzq();
        zzt zztVarZza = zzac.zza(strZzb);
        int size = zztVarZza.size();
        for (int i = 0; i < size; i++) {
            String str = (String) zztVarZza.get(i);
            File file = new File(modelDirUnsafe, str);
            if (file.exists() && !file.delete()) {
                zzqVar.zzc(str);
            }
        }
        zzt zztVarZzd = zzqVar.zzd();
        if (!zztVarZzd.isEmpty()) {
            throw new MlKitException("Couldn't delete model files ".concat(String.valueOf(TextUtils.join(", ", zztVarZzd))), 13);
        }
        this.zzk.trySetException(new MlKitException("Download canceled", 1));
    }

    public final void zzg() {
        List list;
        Integer numZzc = zzc();
        if (numZzc != null) {
            try {
                if (numZzc.intValue() == 16 && (list = this.zzl) != null && list.size() > zzk()) {
                    this.zzi.clearDownloadingModelInfo(this.zzd);
                    zzl();
                    return;
                }
            } catch (MlKitException e) {
                this.zzk.setException(e);
                return;
            }
        }
        zzb();
    }

    public final void zzh() throws MlKitException {
        Preconditions.checkHandlerThread(MLTaskExecutor.getInstance().getHandler());
        if (this.zzg == null) {
            this.zze.zzj();
            return;
        }
        Long lZzd = zzd();
        if (lZzd == null) {
            return;
        }
        zza.m74904d("TranslateDLManager", "Cancel or remove existing downloading task: ".concat(lZzd.toString()));
        if (this.zzg.remove(lZzd.longValue()) > 0 || zzc() == null) {
            this.zzh.deleteTempFilesInPrivateFolder(TranslateRemoteModel.zza(zzac.zzb(this.zzd.getLanguage())), this.zzd.getModelType());
            this.zzi.clearDownloadingModelInfo(this.zzd);
            List list = this.zzl;
            if (list == null || list.isEmpty()) {
                return;
            }
            this.zzj.edit().remove("last_uri_for_".concat(String.valueOf(((ModelInfo) this.zzl.get(0)).getModelHash()))).commit();
        }
    }

    public final boolean zzi(RemoteModel remoteModel, String str) {
        return !str.equals(this.zzi.getLatestModelHash(remoteModel));
    }

    public final boolean zzj() {
        String strZzb = zzac.zzb(this.zzd.getLanguage());
        File modelDirUnsafe = this.zzc.getModelDirUnsafe(false);
        zzt zztVarZza = zzac.zza(strZzb);
        int size = zztVarZza.size();
        int i = 0;
        while (i < size) {
            boolean zExists = new File(modelDirUnsafe, (String) zztVarZza.get(i)).exists();
            i++;
            if (!zExists) {
                return false;
            }
        }
        return true;
    }
}
