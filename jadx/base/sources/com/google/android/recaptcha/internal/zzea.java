package com.google.android.recaptcha.internal;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.InterfaceC33622OooOo00;

/* JADX INFO: loaded from: classes7.dex */
final class zzea extends AbstractC32476OooO implements InterfaceC32507OooOO0o {
    Object zza;
    int zzb;
    final /* synthetic */ zzec zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ InterfaceC33622OooOo00 zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzea(zzec zzecVar, long j, InterfaceC33622OooOo00 interfaceC33622OooOo00, Continuation continuation) {
        super(1, continuation);
        this.zzc = zzecVar;
        this.zzd = j;
        this.zze = interfaceC33622OooOo00;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation create(Continuation continuation) {
        return new zzea(this.zzc, this.zzd, this.zze, continuation);
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzea) create((Continuation) obj)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        zzen zzenVar;
        zzbd e;
        zzen zzenVar2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.zzb;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            zzen zzenVarZzf = this.zzc.zzb.zzf(41);
            try {
                zzdt zzdtVar = this.zzc.zza;
                long j = this.zzd;
                this.zza = zzenVarZzf;
                this.zzb = 1;
                Object objZzo = zzdtVar.zzo(j, this);
                if (objZzo != enumC32485OooO00o) {
                    zzenVar2 = zzenVarZzf;
                    obj = objZzo;
                }
                return enumC32485OooO00o;
            } catch (zzbd e2) {
                zzenVar = zzenVarZzf;
                e = e2;
                this.zzc.zzd = e;
                zzenVar.zzb(e);
                throw e;
            }
        }
        if (i != 1) {
            zzenVar = (zzen) this.zza;
            try {
                C32446OooOOOo.OooO0O0(obj);
                zzenVar.zza();
                this.zzc.zzf = zzcm.zzb;
                return Boolean.valueOf(this.zze.Oooo0(C32460OooOooO.f116667OooO00o));
            } catch (zzbd e3) {
                e = e3;
                this.zzc.zzd = e;
                zzenVar.zzb(e);
                throw e;
            }
        }
        zzenVar2 = (zzen) this.zza;
        try {
            C32446OooOOOo.OooO0O0(obj);
        } catch (zzbd e4) {
            e = e4;
            zzenVar = zzenVar2;
            this.zzc.zzd = e;
            zzenVar.zzb(e);
            throw e;
        }
        zzsc zzscVar = (zzsc) obj;
        this.zzc.zze = zzscVar;
        zzdt zzdtVar2 = this.zzc.zza;
        long j2 = this.zzd;
        this.zza = zzenVar2;
        this.zzb = 2;
        if (zzdtVar2.zzn(zzscVar, j2, this) != enumC32485OooO00o) {
            zzenVar = zzenVar2;
            zzenVar.zza();
            this.zzc.zzf = zzcm.zzb;
            return Boolean.valueOf(this.zze.Oooo0(C32460OooOooO.f116667OooO00o));
        }
        return enumC32485OooO00o;
    }
}
