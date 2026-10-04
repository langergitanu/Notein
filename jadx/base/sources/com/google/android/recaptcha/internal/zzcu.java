package com.google.android.recaptcha.internal;

import kotlin.coroutines.Continuation;
import oO00ooo.AbstractC32479OooO0OO;

/* JADX INFO: loaded from: classes7.dex */
final class zzcu extends AbstractC32479OooO0OO {
    /* synthetic */ Object zza;
    final /* synthetic */ zzcv zzb;
    int zzc;
    zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcu(zzcv zzcvVar, Continuation continuation) {
        super(continuation);
        this.zzb = zzcvVar;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzj(null, 0, null, this);
    }
}
