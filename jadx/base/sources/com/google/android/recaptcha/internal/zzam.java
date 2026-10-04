package com.google.android.recaptcha.internal;

import OooooOO.C21355Ooooooo;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33622OooOo00;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes7.dex */
final class zzam extends AbstractC32476OooO implements InterfaceC32508OooOOOo {
    Object zza;
    int zzb;
    final /* synthetic */ zzan zzc;
    final /* synthetic */ zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzam(zzan zzanVar, zzen zzenVar, Continuation continuation) {
        super(2, continuation);
        this.zzc = zzanVar;
        this.zzd = zzenVar;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzam(this.zzc, this.zzd, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzam) create((InterfaceC33636Oooo00o) obj, (Continuation) obj2)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C24034Oooo00O c24034Oooo00O;
        Exception e;
        Throwable th;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (this.zzb != 0) {
            c24034Oooo00O = (C24034Oooo00O) this.zza;
            try {
                C32446OooOOOo.OooO0O0(obj);
            } catch (Exception e2) {
                e = e2;
                InterfaceC33622OooOo00 interfaceC33622OooOo00Zzf = this.zzc.zzf();
                th = (Throwable) c24034Oooo00O.f80942OooOo0o;
                if (th == null) {
                    th = e;
                }
                interfaceC33622OooOo00Zzf.OooO00o(th);
                this.zzc.zze = zzao.zza;
                this.zzd.zzb(new zzbd(zzbb.zzb, zzba.zza, e.getMessage()));
            }
        } else {
            C32446OooOOOo.OooO0O0(obj);
            C24034Oooo00O c24034Oooo00O2 = new C24034Oooo00O();
            try {
                zzal zzalVar = new zzal(this.zzc, this.zzd, c24034Oooo00O2, null);
                this.zza = c24034Oooo00O2;
                this.zzb = 1;
                if (C21355Ooooooo.OooO(60000L, zzalVar, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } catch (Exception e3) {
                c24034Oooo00O = c24034Oooo00O2;
                e = e3;
                InterfaceC33622OooOo00 interfaceC33622OooOo00Zzf2 = this.zzc.zzf();
                th = (Throwable) c24034Oooo00O.f80942OooOo0o;
                if (th == null) {
                }
                interfaceC33622OooOo00Zzf2.OooO00o(th);
                this.zzc.zze = zzao.zza;
                this.zzd.zzb(new zzbd(zzbb.zzb, zzba.zza, e.getMessage()));
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
