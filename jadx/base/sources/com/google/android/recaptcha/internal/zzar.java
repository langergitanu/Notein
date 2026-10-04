package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.OooOOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.InterfaceC33642Oooo0oo;

/* JADX INFO: loaded from: classes7.dex */
final class zzar extends OooOOOO implements InterfaceC32507OooOO0o {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ InterfaceC33642Oooo0oo zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzar(TaskCompletionSource taskCompletionSource, InterfaceC33642Oooo0oo interfaceC33642Oooo0oo) {
        super(1);
        this.zza = taskCompletionSource;
        this.zzb = interfaceC33642Oooo0oo;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            this.zza.setException((Exception) th);
        } else {
            Throwable completionExceptionOrNull = this.zzb.getCompletionExceptionOrNull();
            if (completionExceptionOrNull == null) {
                this.zza.setResult(this.zzb.getCompleted());
            } else {
                TaskCompletionSource taskCompletionSource = this.zza;
                Exception runtimeExecutionException = completionExceptionOrNull instanceof Exception ? (Exception) completionExceptionOrNull : null;
                if (runtimeExecutionException == null) {
                    runtimeExecutionException = new RuntimeExecutionException(completionExceptionOrNull);
                }
                taskCompletionSource.setException(runtimeExecutionException);
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
