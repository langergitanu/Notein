package com.google.android.gms.internal.play_billing;

import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes7.dex */
final class zzcx implements zzcz {
    private static final zzcy zza = new zzcy(zzcx.class);
    private final Object zzb;

    public zzcx(Object obj) {
        this.zzb = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.zzb;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return OooO0O0.OooO00o.OooO0O0(super.toString(), "[status=SUCCESS, result=[", this.zzb.toString(), "]]");
    }

    @Override // com.google.android.gms.internal.play_billing.zzcz
    public final void zzb(Runnable runnable, Executor executor) {
        zzbg.zzc(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", C22237OooO0o0.OooO00o("RuntimeException while executing runnable ", runnable.toString(), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return this.zzb;
    }
}
