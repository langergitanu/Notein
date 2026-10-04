package com.google.mlkit.p567nl.translate.internal;

import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_translate.zzbm;
import com.google.android.gms.internal.mlkit_translate.zze;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.DownloadConditions;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;

/* JADX INFO: loaded from: classes8.dex */
public final class zzab {
    public static final /* synthetic */ int zza = 0;
    private static final GmsLogger zzb = new GmsLogger("TranslateModelLoader", "");
    private final zzh zzc;
    private final zzy zzd;
    private Task zze;
    private CancellationTokenSource zzf;

    public /* synthetic */ zzab(zzh zzhVar, zzy zzyVar, zzaa zzaaVar) {
        this.zzc = zzhVar;
        this.zzd = zzyVar;
    }

    private final void zzg() throws MlKitException {
        if (this.zzc.zzj()) {
            return;
        }
        zzb.m74904d("TranslateModelLoader", "No existing model file");
        throw new MlKitException("No existing model file", 13);
    }

    public final /* synthetic */ Task zza(DownloadConditions downloadConditions, Task task) throws Exception {
        return task.isCanceled() ? Tasks.forResult(zze.zzb()) : this.zzc.zza(downloadConditions);
    }

    public final Task zzb(final DownloadConditions downloadConditions) {
        Preconditions.checkHandlerThread(MLTaskExecutor.getInstance().getHandler());
        if (this.zze == null) {
            zzb.m74904d("TranslateModelLoader", "Initial loading, check for model updates.");
            CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
            this.zzf = cancellationTokenSource;
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
            MLTaskExecutor.getInstance().scheduleRunnableDelayed(new Runnable() { // from class: com.google.mlkit.nl.translate.internal.zzu
                @Override // java.lang.Runnable
                public final void run() {
                    int i = zzab.zza;
                    taskCompletionSource.trySetResult(null);
                }
            }, (long) (this.zzd.zza * 1000.0d));
            this.zze = taskCompletionSource.getTask().continueWithTask(zzbm.zza(), new Continuation() { // from class: com.google.mlkit.nl.translate.internal.zzv
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return this.zza.zza(downloadConditions, task);
                }
            }).continueWith(zzbm.zza(), new Continuation() { // from class: com.google.mlkit.nl.translate.internal.zzw
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) throws Exception {
                    this.zza.zzc(task);
                    return null;
                }
            });
        }
        return this.zze.continueWith(zzbm.zza(), new Continuation() { // from class: com.google.mlkit.nl.translate.internal.zzx
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.zza.zzd(task);
            }
        });
    }

    public final /* synthetic */ Void zzc(Task task) throws Exception {
        this.zze = null;
        Exception exception = task.getException();
        if (exception != null) {
            zzy.zzb(this.zzd);
        }
        if (exception != null || !((zze) task.getResult()).zza()) {
            throw new MlKitException("Model not downloaded.", 13, exception);
        }
        this.zzd.zza = 0.0d;
        zzg();
        return null;
    }

    public final /* synthetic */ Void zzd(Task task) throws Exception {
        if (task.isSuccessful()) {
            return (Void) task.getResult();
        }
        try {
            zzb.m74904d("TranslateModelLoader", "Try to load newly downloaded model file.");
            if (this.zzc.zzb() != null) {
                return null;
            }
            throw new MlKitException("Newly downloaded model file could not be loaded.", 13);
        } catch (MlKitException unused) {
            zzb.m74904d("TranslateModelLoader", "Loading existing model file.");
            zzg();
            return null;
        }
    }

    public final void zze() throws MlKitException {
        CancellationTokenSource cancellationTokenSource = this.zzf;
        if (cancellationTokenSource != null) {
            cancellationTokenSource.cancel();
        }
        this.zzc.zzf();
        this.zze = null;
    }

    public final boolean zzf() {
        return this.zzc.zzj();
    }
}
