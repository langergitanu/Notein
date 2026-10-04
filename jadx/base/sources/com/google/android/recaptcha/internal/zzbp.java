package com.google.android.recaptcha.internal;

import kotlin.coroutines.Continuation;
import oO00ooo.AbstractC32479OooO0OO;

/* JADX INFO: loaded from: classes7.dex */
final class zzbp extends AbstractC32479OooO0OO {
    Object zza;
    Object zzb;
    long zzc;
    long zzd;
    double zze;
    /* synthetic */ Object zzf;
    final /* synthetic */ zzbq zzg;
    int zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbp(zzbq zzbqVar, Continuation continuation) {
        super(continuation);
        this.zzg = zzbqVar;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.zzf = obj;
        this.zzh |= Integer.MIN_VALUE;
        return this.zzg.zza(null, 0L, 0L, 0.0d, null, this);
    }
}
