package com.google.android.recaptcha.internal;

import kotlin.coroutines.Continuation;
import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: loaded from: classes7.dex */
final class zza extends AbstractC32479OooO0OO {
    Object zza;
    long zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zze zzd;
    int zze;
    String zzf;
    zzen zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(zze zzeVar, Continuation continuation) {
        super(continuation);
        this.zzd = zzeVar;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws zzbd {
        this.zzc = obj;
        this.zze |= Integer.MIN_VALUE;
        Object objZzc = this.zzd.zzc(null, 0L, this);
        return objZzc == EnumC32485OooO00o.f116726OooOo0o ? objZzc : new C32445OooOOOO(objZzc);
    }
}
