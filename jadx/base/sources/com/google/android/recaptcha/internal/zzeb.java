package com.google.android.recaptcha.internal;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33622OooOo00;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes7.dex */
final class zzeb extends AbstractC32476OooO implements InterfaceC32508OooOOOo {
    int zza;
    final /* synthetic */ zzec zzb;
    final /* synthetic */ InterfaceC33622OooOo00 zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeb(zzec zzecVar, InterfaceC33622OooOo00 interfaceC33622OooOo00, long j, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzecVar;
        this.zzc = interfaceC33622OooOo00;
        this.zzd = j;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzeb(this.zzb, this.zzc, this.zzd, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeb) create((InterfaceC33636Oooo00o) obj, (Continuation) obj2)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Exception {
        zzbd zzbdVar;
        zzeb zzebVar;
        zzbd e;
        zzbq zzbqVar;
        zzdz zzdzVar;
        zzea zzeaVar;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (this.zza != 0) {
            try {
                C32446OooOOOo.OooO0O0(obj);
                zzebVar = this;
            } catch (zzbd e2) {
                zzbdVar = e2;
                zzebVar = this;
                zzebVar.zzb.zzf = zzcm.zzd;
                zzebVar.zzc.OooO00o(zzbdVar);
            }
        } else {
            C32446OooOOOo.OooO0O0(obj);
            try {
                zzbqVar = zzbq.zza;
                zzdzVar = new zzdz(this.zzb);
                zzeaVar = new zzea(this.zzb, this.zzd, this.zzc, null);
                this.zza = 1;
                zzebVar = this;
            } catch (zzbd e3) {
                e = e3;
                zzebVar = this;
                zzbdVar = e;
                zzebVar.zzb.zzf = zzcm.zzd;
                zzebVar.zzc.OooO00o(zzbdVar);
            }
            try {
                obj = zzbqVar.zza(zzdzVar, 100L, 1000L, 2.0d, zzeaVar, zzebVar);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } catch (zzbd e4) {
                e = e4;
                zzbdVar = e;
                zzebVar.zzb.zzf = zzcm.zzd;
                zzebVar.zzc.OooO00o(zzbdVar);
            }
        }
        ((Boolean) obj).getClass();
        return C32460OooOooO.f116667OooO00o;
    }
}
