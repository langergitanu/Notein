package com.google.android.recaptcha.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import o00o00Oo.C25261OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes7.dex */
final class zzfs extends AbstractC32476OooO implements InterfaceC32508OooOOOo {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzgd zzd;
    final /* synthetic */ zzft zze;
    final /* synthetic */ String zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfs(zzgd zzgdVar, zzft zzftVar, String str, Continuation continuation) {
        super(2, continuation);
        this.zzd = zzgdVar;
        this.zze = zzftVar;
        this.zzf = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzfs(this.zzd, this.zze, this.zzf, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfs) create((InterfaceC33636Oooo00o) obj, (Continuation) obj2)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007d, code lost:
    
        if (r1.zzh(r7, r2, r6) != r0) goto L20;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzub zzubVar;
        zzjh zzjhVar;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.zzc;
        try {
        } catch (Exception e) {
            zzft zzftVar = this.zze;
            zzgd zzgdVar = this.zzd;
            this.zza = null;
            this.zzb = null;
            this.zzc = 2;
        }
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.zzd.zza = new zzbn();
            zzub zzubVarZzi = zzub.zzi(zzkh.zzh().zzj(this.zzf));
            zzubVarZzi.zzf();
            zztz zztzVarZza = this.zze.zzc.zza(zzubVarZzi);
            zzjh zzjhVarZzb = zzjh.zzb();
            zzft zzftVar2 = this.zze;
            List listZzi = zztzVarZza.zzi();
            zzgd zzgdVar2 = this.zzd;
            this.zza = zzubVarZzi;
            this.zzb = zzjhVarZzb;
            this.zzc = 1;
            if (zzftVar2.zzg(listZzi, zzgdVar2, this) != enumC32485OooO00o) {
                zzubVar = zzubVarZzi;
                zzjhVar = zzjhVarZzb;
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        zzjhVar = (zzjh) this.zzb;
        zzubVar = (zzub) this.zza;
        C32446OooOOOo.OooO0O0(obj);
        zzjhVar.zzf();
        C25261OooO0o0.OooO0Oo(zzjhVar.zza(TimeUnit.MICROSECONDS));
        zzubVar.zzf();
        return C32460OooOooO.f116667OooO00o;
    }
}
