package com.google.android.recaptcha.internal;

import OooooOO.C21355Ooooooo;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o0000;

/* JADX INFO: loaded from: classes7.dex */
final class zzdg extends AbstractC32476OooO implements InterfaceC32508OooOOOo {
    Object zza;
    int zzb;
    final /* synthetic */ zzdt zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzsp zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdg(zzdt zzdtVar, String str, long j, zzsp zzspVar, Continuation continuation) {
        super(2, continuation);
        this.zzc = zzdtVar;
        this.zzd = str;
        this.zze = j;
        this.zzf = zzspVar;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzdg(this.zzc, this.zzd, this.zze, this.zzf, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdg) create((InterfaceC33636Oooo00o) obj, (Continuation) obj2)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        zzen zzenVar;
        Exception e;
        o0000 e2;
        zzbd e3;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (this.zzb != 0) {
            zzenVar = (zzen) this.zza;
            try {
                C32446OooOOOo.OooO0O0(obj);
            } catch (zzbd e4) {
                e3 = e4;
                zzbd zzbdVarZzs = this.zzc.zzs(e3, e3);
                zzenVar.zzb(zzbdVarZzs);
                throw zzbdVarZzs;
            } catch (o0000 e5) {
                e2 = e5;
                zzbd zzbdVarZzs2 = this.zzc.zzs(e2, new zzbd(zzbb.zzc, zzba.zzb, e2.getMessage()));
                zzenVar.zzb(zzbdVarZzs2);
                throw zzbdVarZzs2;
            } catch (Exception e6) {
                e = e6;
                zzbd zzbdVarZzs3 = this.zzc.zzs(e, new zzbd(zzbb.zzc, zzba.zzZ, e.getMessage()));
                zzenVar.zzb(zzbdVarZzs3);
                throw zzbdVarZzs3;
            }
        } else {
            C32446OooOOOo.OooO0O0(obj);
            zzen zzenVarZzf = this.zzc.zzu(this.zzd).zzf(28);
            try {
                long j = this.zze;
                zzdf zzdfVar = new zzdf(this.zzc, this.zzf, zzenVarZzf, null);
                this.zza = zzenVarZzf;
                this.zzb = 1;
                Object objOooO = C21355Ooooooo.OooO(j, zzdfVar, this);
                if (objOooO == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                zzenVar = zzenVarZzf;
                obj = objOooO;
            } catch (zzbd e7) {
                zzenVar = zzenVarZzf;
                e3 = e7;
                zzbd zzbdVarZzs4 = this.zzc.zzs(e3, e3);
                zzenVar.zzb(zzbdVarZzs4);
                throw zzbdVarZzs4;
            } catch (o0000 e8) {
                zzenVar = zzenVarZzf;
                e2 = e8;
                zzbd zzbdVarZzs22 = this.zzc.zzs(e2, new zzbd(zzbb.zzc, zzba.zzb, e2.getMessage()));
                zzenVar.zzb(zzbdVarZzs22);
                throw zzbdVarZzs22;
            } catch (Exception e9) {
                zzenVar = zzenVarZzf;
                e = e9;
                zzbd zzbdVarZzs32 = this.zzc.zzs(e, new zzbd(zzbb.zzc, zzba.zzZ, e.getMessage()));
                zzenVar.zzb(zzbdVarZzs32);
                throw zzbdVarZzs32;
            }
        }
        return (zzsr) obj;
    }
}
