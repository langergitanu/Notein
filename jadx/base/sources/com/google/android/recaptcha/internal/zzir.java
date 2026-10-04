package com.google.android.recaptcha.internal;

import kotlin.coroutines.Continuation;
import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: loaded from: classes7.dex */
final class zzir extends AbstractC32479OooO0OO {
    /* synthetic */ Object zza;
    final /* synthetic */ zzja zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzir(zzja zzjaVar, Continuation continuation) {
        super(continuation);
        this.zzb = zzjaVar;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objZzh = this.zzb.zzh(null, this);
        return objZzh == EnumC32485OooO00o.f116726OooOo0o ? objZzh : new C32445OooOOOO(objZzh);
    }
}
