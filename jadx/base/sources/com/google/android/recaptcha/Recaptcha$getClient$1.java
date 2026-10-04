package com.google.android.recaptcha;

import kotlin.coroutines.Continuation;
import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: loaded from: classes7.dex */
public final class Recaptcha$getClient$1 extends AbstractC32479OooO0OO {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, Continuation continuation) {
        super(continuation);
        this.zzb = recaptcha;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objM80692getClientBWLJW6A = this.zzb.m80692getClientBWLJW6A(null, null, 0L, this);
        return objM80692getClientBWLJW6A == EnumC32485OooO00o.f116726OooOo0o ? objM80692getClientBWLJW6A : new C32445OooOOOO(objM80692getClientBWLJW6A);
    }
}
