package com.google.mlkit.p567nl.translate.internal;

import com.google.android.gms.internal.mlkit_translate.zzal;
import com.google.android.gms.internal.mlkit_translate.zznh;
import com.google.android.gms.internal.mlkit_translate.zzoe;
import com.google.android.gms.internal.mlkit_translate.zzoq;
import com.google.android.gms.internal.mlkit_translate.zzor;
import com.google.android.gms.internal.mlkit_translate.zzoz;
import com.google.android.gms.internal.mlkit_translate.zzt;
import com.google.android.gms.internal.mlkit_translate.zzuy;
import com.google.android.gms.internal.mlkit_translate.zzvd;
import com.google.android.gms.internal.mlkit_translate.zzvl;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.model.DownloadConditions;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.google.mlkit.p567nl.translate.TranslateRemoteModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzam implements RemoteModelManagerInterface {
    public static final /* synthetic */ int zza = 0;
    private final zzuy zzb = zzvl.zzb("translate");
    private final zzz zzc;
    private final Task zzd;

    public zzam(zzz zzzVar, zzp zzpVar) {
        this.zzc = zzzVar;
        this.zzd = zzpVar.getMigrationTask();
    }

    @Override // com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface
    public final /* bridge */ /* synthetic */ Task deleteDownloadedModel(RemoteModel remoteModel) {
        final TranslateRemoteModel translateRemoteModel = (TranslateRemoteModel) remoteModel;
        return translateRemoteModel.getLanguage().equals(TranslateLanguage.ENGLISH) ? Tasks.forResult(null) : this.zzd.continueWith(MLTaskExecutor.workerThreadExecutor(), new Continuation() { // from class: com.google.mlkit.nl.translate.internal.zzak
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.zza.zzd(translateRemoteModel, task);
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.mlkit.nl.translate.internal.zzal
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.zza.zze(task);
            }
        });
    }

    @Override // com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface
    public final /* bridge */ /* synthetic */ Task download(RemoteModel remoteModel, final DownloadConditions downloadConditions) {
        final TranslateRemoteModel translateRemoteModel = (TranslateRemoteModel) remoteModel;
        return translateRemoteModel.getLanguage().equals(TranslateLanguage.ENGLISH) ? Tasks.forResult(null) : this.zzd.continueWithTask(MLTaskExecutor.workerThreadExecutor(), new Continuation() { // from class: com.google.mlkit.nl.translate.internal.zzag
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.zza.zzb(translateRemoteModel, downloadConditions, task);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface
    public final Task getDownloadedModels() {
        List<String> allLanguages = TranslateLanguage.getAllLanguages();
        final ArrayList arrayList = new ArrayList(allLanguages.size());
        ArrayList arrayList2 = new ArrayList(allLanguages.size());
        zzal zzalVarListIterator = ((zzt) allLanguages).listIterator(0);
        while (zzalVarListIterator.hasNext()) {
            TranslateRemoteModel translateRemoteModelBuild = new TranslateRemoteModel.Builder((String) zzalVarListIterator.next()).build();
            arrayList.add(translateRemoteModelBuild);
            arrayList2.add(isModelDownloaded(translateRemoteModelBuild));
        }
        return Tasks.whenAllSuccess(arrayList2).continueWith(new Continuation() { // from class: com.google.mlkit.nl.translate.internal.zzaj
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                List list = (List) task.getResult();
                HashSet hashSet = new HashSet();
                for (int i = 0; i < list.size(); i++) {
                    if (((Boolean) list.get(i)).booleanValue()) {
                        hashSet.add((TranslateRemoteModel) arrayList.get(i));
                    }
                }
                return hashSet;
            }
        });
    }

    @Override // com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Task isModelDownloaded(final TranslateRemoteModel translateRemoteModel) {
        return translateRemoteModel.getLanguage().equals(TranslateLanguage.ENGLISH) ? Tasks.forResult(Boolean.TRUE) : this.zzd.continueWith(MLTaskExecutor.workerThreadExecutor(), new Continuation() { // from class: com.google.mlkit.nl.translate.internal.zzah
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.zza.zzc(translateRemoteModel, task);
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.mlkit.nl.translate.internal.zzai
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.zza.zzf(task);
            }
        });
    }

    public final /* synthetic */ Task zzb(TranslateRemoteModel translateRemoteModel, DownloadConditions downloadConditions, Task task) throws Exception {
        return this.zzc.zza(translateRemoteModel, true).zzb(downloadConditions);
    }

    public final /* synthetic */ Boolean zzc(TranslateRemoteModel translateRemoteModel, Task task) throws Exception {
        return Boolean.valueOf(this.zzc.zza(translateRemoteModel, false).zzf());
    }

    public final /* synthetic */ Void zzd(TranslateRemoteModel translateRemoteModel, Task task) throws Exception {
        this.zzc.zza(translateRemoteModel, true).zze();
        return null;
    }

    public final /* synthetic */ void zze(Task task) {
        boolean zIsSuccessful = task.isSuccessful();
        zzor zzorVar = new zzor();
        zznh zznhVar = new zznh();
        zznhVar.zzb(zzoz.BASE_TRANSLATE);
        zznhVar.zza(Boolean.valueOf(zIsSuccessful));
        zzorVar.zzf(zznhVar.zzc());
        this.zzb.zzd(zzvd.zzf(zzorVar), zzoq.REMOTE_MODEL_DELETE_ON_DEVICE);
    }

    public final /* synthetic */ void zzf(Task task) {
        Boolean bool = (Boolean) task.getResult();
        bool.booleanValue();
        zzor zzorVar = new zzor();
        zzoe zzoeVar = new zzoe();
        zzoeVar.zzb(zzoz.BASE_TRANSLATE);
        zzoeVar.zza(bool);
        zzorVar.zzh(zzoeVar.zzc());
        this.zzb.zzd(zzvd.zzf(zzorVar), zzoq.REMOTE_MODEL_IS_DOWNLOADED);
    }
}
