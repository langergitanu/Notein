package com.google.mlkit.p567nl.translate.internal;

import android.os.SystemClock;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.InterfaceC21997Oooo0o;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_translate.zzak;
import com.google.android.gms.internal.mlkit_translate.zzq;
import com.google.android.gms.internal.mlkit_translate.zzx;
import com.google.android.gms.internal.mlkit_translate.zzy;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.inject.Provider;
import com.google.mlkit.common.model.DownloadConditions;
import com.google.mlkit.common.sdkinternal.CloseGuard;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.google.mlkit.p567nl.translate.TranslateRemoteModel;
import com.google.mlkit.p567nl.translate.Translator;
import com.google.mlkit.p567nl.translate.TranslatorOptions;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class TranslatorImpl implements Translator {
    public static final /* synthetic */ int zza = 0;
    private static final DownloadConditions zzb = new DownloadConditions.Builder().build();
    private final TranslatorOptions zzc;
    private final Provider zzd;
    private final AtomicReference zze;
    private final zzs zzf;
    private final Executor zzg;
    private final Task zzh;
    private final CancellationTokenSource zzi = new CancellationTokenSource();
    private CloseGuard zzj;

    public static class Factory {
        private final Provider zza;
        private final zzi zzb;
        private final zzq zzc;
        private final zzae zzd;
        private final ExecutorSelector zze;
        private final zzp zzf;
        private final CloseGuard.Factory zzg;

        public Factory(Provider provider, zzi zziVar, zzq zzqVar, zzae zzaeVar, ExecutorSelector executorSelector, zzp zzpVar, CloseGuard.Factory factory) {
            this.zze = executorSelector;
            this.zzf = zzpVar;
            this.zza = provider;
            this.zzc = zzqVar;
            this.zzb = zziVar;
            this.zzd = zzaeVar;
            this.zzg = factory;
        }

        public final Translator zza(TranslatorOptions translatorOptions) {
            zzs zzsVarZza = this.zzc.zza(translatorOptions.zza());
            TranslatorImpl translatorImpl = new TranslatorImpl(translatorOptions, this.zza, (TranslateJni) this.zzb.get(translatorOptions), zzsVarZza, this.zze.getExecutorToUse(translatorOptions.zzf()), this.zzf, null);
            TranslatorImpl.zzb(translatorImpl, this.zzg, this.zzd);
            return translatorImpl;
        }
    }

    public /* synthetic */ TranslatorImpl(TranslatorOptions translatorOptions, Provider provider, TranslateJni translateJni, zzs zzsVar, Executor executor, zzp zzpVar, zzar zzarVar) {
        this.zzc = translatorOptions;
        this.zzd = provider;
        this.zze = new AtomicReference(translateJni);
        this.zzf = zzsVar;
        this.zzg = executor;
        this.zzh = zzpVar.getMigrationTask();
    }

    public static /* bridge */ /* synthetic */ void zzb(final TranslatorImpl translatorImpl, CloseGuard.Factory factory, zzae zzaeVar) {
        translatorImpl.zzj = factory.create(translatorImpl, 1, new Runnable() { // from class: com.google.mlkit.nl.translate.internal.zzan
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc();
            }
        });
        ((TranslateJni) translatorImpl.zze.get()).pin();
        translatorImpl.zzf.zzx();
        zzaeVar.zzb();
    }

    @Override // com.google.mlkit.p567nl.translate.Translator, java.io.Closeable, java.lang.AutoCloseable
    @InterfaceC21997Oooo0o(AbstractC21979OooOOo0.OooO00o.ON_DESTROY)
    public void close() {
        this.zzj.close();
    }

    @Override // com.google.mlkit.p567nl.translate.Translator
    public final Task<Void> downloadModelIfNeeded() {
        DownloadConditions downloadConditions = zzb;
        return this.zzh.continueWithTask(MLTaskExecutor.workerThreadExecutor(), new zzaq(this, downloadConditions));
    }

    @Override // com.google.mlkit.p567nl.translate.Translator
    public final Task<String> translate(final String str) {
        Preconditions.checkNotNull(str, "Input can't be null");
        final TranslateJni translateJni = (TranslateJni) this.zze.get();
        Preconditions.checkState(translateJni != null, "Translator has been closed");
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        final boolean z = !translateJni.isLoaded();
        return translateJni.callAfterLoad(this.zzg, new Callable() { // from class: com.google.mlkit.nl.translate.internal.zzao
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = TranslatorImpl.zza;
                return translateJni.zzd(str);
            }
        }, this.zzi.getToken()).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.mlkit.nl.translate.internal.zzap
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.zza.zzd(str, z, jElapsedRealtime, task);
            }
        });
    }

    public final /* synthetic */ Task zza(DownloadConditions downloadConditions, Task task) throws Exception {
        zzy zzyVarZzd;
        Preconditions.checkHandlerThread(MLTaskExecutor.getInstance().getHandler());
        zzq zzqVar = new zzq();
        TranslatorOptions translatorOptions = this.zzc;
        String strZzd = translatorOptions.zzd();
        String strZze = translatorOptions.zze();
        int i = zzac.zza;
        if (strZzd.equals(strZze)) {
            zzyVarZzd = zzy.zzj();
        } else {
            zzx zzxVar = new zzx();
            if (!strZzd.equals(TranslateLanguage.ENGLISH)) {
                zzxVar.zzc(strZzd);
            }
            if (!strZze.equals(TranslateLanguage.ENGLISH)) {
                zzxVar.zzc(strZze);
            }
            zzyVarZzd = zzxVar.zzd();
        }
        zzak it = zzyVarZzd.iterator();
        while (it.hasNext()) {
            zzqVar.zzc(((zzz) this.zzd.get()).zza(new TranslateRemoteModel.Builder((String) it.next()).build(), true).zzb(downloadConditions));
        }
        return Tasks.whenAll(zzqVar.zzd());
    }

    public final /* synthetic */ void zzc() {
        this.zzi.cancel();
        TranslateJni translateJni = (TranslateJni) this.zze.getAndSet(null);
        Preconditions.checkState(translateJni != null);
        translateJni.unpin(this.zzg);
    }

    public final /* synthetic */ void zzd(String str, boolean z, long j, Task task) {
        this.zzf.zzy(str, z, SystemClock.elapsedRealtime() - j, task);
    }

    @Override // com.google.mlkit.p567nl.translate.Translator
    public final Task<Void> downloadModelIfNeeded(DownloadConditions downloadConditions) {
        return this.zzh.continueWithTask(MLTaskExecutor.workerThreadExecutor(), new zzaq(this, downloadConditions));
    }
}
