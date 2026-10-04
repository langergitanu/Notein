package com.google.android.recaptcha.internal;

import kotlin.coroutines.Continuation;
import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: loaded from: classes7.dex */
final class zzc extends AbstractC32479OooO0OO {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zze zzc;
    int zzd;
    zzen zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(zze zzeVar, Continuation continuation) {
        super(continuation);
        this.zzc = zzeVar;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws zzbd {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        Object objZze = this.zzc.zze(0L, null, this);
        return objZze == EnumC32485OooO00o.f116726OooOo0o ? objZze : new C32445OooOOOO(objZze);
    }
}
