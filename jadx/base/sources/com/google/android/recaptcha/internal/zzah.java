package com.google.android.recaptcha.internal;

import kotlin.coroutines.Continuation;
import oO00ooo.AbstractC32479OooO0OO;

/* JADX INFO: loaded from: classes7.dex */
final class zzah extends AbstractC32479OooO0OO {
    /* synthetic */ Object zza;
    final /* synthetic */ zzan zzb;
    int zzc;
    String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzah(zzan zzanVar, Continuation continuation) {
        super(continuation);
        this.zzb = zzanVar;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzj(null, this);
    }
}
