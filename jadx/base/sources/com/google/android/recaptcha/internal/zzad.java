package com.google.android.recaptcha.internal;

import kotlin.coroutines.Continuation;
import oO00ooo.AbstractC32479OooO0OO;

/* JADX INFO: loaded from: classes7.dex */
final class zzad extends AbstractC32479OooO0OO {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzae zzc;
    int zzd;
    zzen zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzad(zzae zzaeVar, Continuation continuation) {
        super(continuation);
        this.zzc = zzaeVar;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zzd(null, this);
    }
}
