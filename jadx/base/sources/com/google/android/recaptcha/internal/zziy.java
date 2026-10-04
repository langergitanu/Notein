package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import kotlin.coroutines.Continuation;
import o00o00Oo.C25261OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33622OooOo00;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes7.dex */
final class zziy extends AbstractC32476OooO implements InterfaceC32508OooOOOo {
    Object zza;
    Object zzb;
    Object zzc;
    Object zzd;
    int zze;
    final /* synthetic */ zzja zzf;
    final /* synthetic */ zzen zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziy(zzja zzjaVar, zzen zzenVar, Continuation continuation) {
        super(2, continuation);
        this.zzf = zzjaVar;
        this.zzg = zzenVar;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation create(Object obj, Continuation continuation) {
        return new zziy(this.zzf, this.zzg, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zziy) create((InterfaceC33636Oooo00o) obj, (Continuation) obj2)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c7, code lost:
    
        if (r9.zzc(r1, r8) == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzja zzjaVar;
        zzsc zzscVar;
        zzcg zzcgVar;
        zzja zzjaVar2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.zze;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            zzjaVar = this.zzf;
            zzsc zzscVar2 = zzjaVar.zzf;
            if (zzscVar2 == null) {
                zzscVar2 = null;
            }
            zzsc zzscVar3 = this.zzf.zzf;
            if (zzscVar3 == null) {
                zzscVar3 = null;
            }
            zzcg zzcgVar2 = new zzcg(zzscVar3.zzf());
            zzja zzjaVar3 = this.zzf;
            this.zza = zzjaVar;
            this.zzb = zzjaVar;
            this.zzc = zzscVar2;
            this.zzd = zzcgVar2;
            this.zze = 1;
            Object objZzw = zzjaVar3.zzw(this);
            if (objZzw != enumC32485OooO00o) {
                zzscVar = zzscVar2;
                obj = objZzw;
                zzcgVar = zzcgVar2;
                zzjaVar2 = zzjaVar;
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            C32446OooOOOo.OooO0O0(obj);
            if (i != 2) {
                if (i == 3) {
                }
                this.zzg.zza();
                return C32460OooOooO.f116667OooO00o;
            }
            C25261OooO0o0.OooO0OO(this.zzf.zzA().hashCode());
            InterfaceC33622OooOo00 interfaceC33622OooOo00ZzA = this.zzf.zzA();
            this.zze = 3;
            if (interfaceC33622OooOo00ZzA.await(this) != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
            zzcb zzcbVarZzm = this.zzf.zzm();
            zzje zzjeVar = zzje.zzc;
            this.zze = 4;
        } else {
            zzcgVar = (zzcg) this.zzd;
            zzscVar = (zzsc) this.zzc;
            zzjaVar = (zzja) this.zzb;
            zzjaVar2 = (zzja) this.zza;
            C32446OooOOOo.OooO0O0(obj);
        }
        zzjaVar2.zzb = zzjaVar.zzC(zzscVar, zzcgVar, (WebView) obj);
        C25261OooO0o0.OooO0OO(this.zzf.zzA().hashCode());
        this.zzf.zzh.zzd();
        this.zzf.zzh.zze();
        zzja zzjaVar4 = this.zzf;
        zzsc zzscVar4 = zzjaVar4.zzf;
        if (zzscVar4 == null) {
            zzscVar4 = null;
        }
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = 2;
        if (zzjaVar4.zzE(zzscVar4, this) != enumC32485OooO00o) {
        }
        return enumC32485OooO00o;
    }
}
