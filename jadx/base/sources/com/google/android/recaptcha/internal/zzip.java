package com.google.android.recaptcha.internal;

import kotlin.coroutines.Continuation;
import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: loaded from: classes7.dex */
final class zzip extends AbstractC32479OooO0OO {
    /* synthetic */ Object zza;
    final /* synthetic */ zzja zzb;
    int zzc;
    zzja zzd;
    String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzip(zzja zzjaVar, Continuation continuation) {
        super(continuation);
        this.zzb = zzjaVar;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objZzf = this.zzb.zzf(null, this);
        return objZzf == EnumC32485OooO00o.f116726OooOo0o ? objZzf : new C32445OooOOOO(objZzf);
    }
}
