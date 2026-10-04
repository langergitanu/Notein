package com.google.android.recaptcha.internal;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes7.dex */
final class zziz extends AbstractC32476OooO implements InterfaceC32508OooOOOo {
    Object zza;
    int zzb;
    final /* synthetic */ zzja zzc;
    final /* synthetic */ zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziz(zzja zzjaVar, zzen zzenVar, Continuation continuation) {
        super(2, continuation);
        this.zzc = zzjaVar;
        this.zzd = zzenVar;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation create(Object obj, Continuation continuation) {
        return new zziz(this.zzc, this.zzd, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zziz) create((InterfaceC33636Oooo00o) obj, (Continuation) obj2)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (OooooOO.C21355Ooooooo.OooO(20000, r6, r5) == r0) goto L20;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzbd zzbdVar;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.zzb;
        try {
        } catch (Exception e) {
            e.getMessage();
            zzbd zzbdVarZza = zzf.zza(e, new zzbd(zzbb.zzb, zzba.zzV, e.getMessage()));
            zzcb zzcbVarZzm = this.zzc.zzm();
            zzje zzjeVar = zzje.zza;
            this.zza = zzbdVarZza;
            this.zzb = 3;
            if (zzcbVarZzm.zzc(zzjeVar, this) != enumC32485OooO00o) {
                zzbdVar = zzbdVarZza;
            }
            return enumC32485OooO00o;
        }
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            zzja zzjaVar = this.zzc;
            this.zzb = 1;
            if (zzjaVar.zzx(this) != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i == 2) {
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            zzbdVar = (zzbd) this.zza;
            C32446OooOOOo.OooO0O0(obj);
            this.zzd.zzb(zzbdVar);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        zziy zziyVar = new zziy(this.zzc, this.zzd, null);
        this.zzb = 2;
    }
}
