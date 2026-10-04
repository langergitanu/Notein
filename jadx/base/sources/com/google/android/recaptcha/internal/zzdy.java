package com.google.android.recaptcha.internal;

import OooooOO.C21355Ooooooo;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes7.dex */
final class zzdy extends AbstractC32476OooO implements InterfaceC32507OooOO0o {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzec zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdy(long j, zzec zzecVar, Continuation continuation) {
        super(1, continuation);
        this.zzb = j;
        this.zzc = zzecVar;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation create(Continuation continuation) {
        return new zzdy(this.zzb, this.zzc, continuation);
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzdy) create((Continuation) obj)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.zza;
        C32446OooOOOo.OooO0O0(obj);
        if (i == 0) {
            long j = this.zzb;
            zzdx zzdxVar = new zzdx(this.zzc, null);
            this.zza = 1;
            if (C21355Ooooooo.OooO(j, zzdxVar, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
