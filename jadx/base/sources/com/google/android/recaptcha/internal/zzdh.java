package com.google.android.recaptcha.internal;

import android.os.Build;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.recaptcha.RecaptchaException;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes7.dex */
final class zzdh extends AbstractC32476OooO implements InterfaceC32508OooOOOo {
    int zza;
    final /* synthetic */ zzdt zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdh(zzdt zzdtVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzdtVar;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzdh(this.zzb, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdh) create((InterfaceC33636Oooo00o) obj, (Continuation) obj2)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws RecaptchaException {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.zza;
        C32446OooOOOo.OooO0O0(obj);
        if (i != 0) {
            return obj;
        }
        int iZza = new zzbs(GoogleApiAvailabilityLight.getInstance()).zza(this.zzb.zzr());
        zzdt zzdtVar = this.zzb;
        String str = zzdtVar.zza;
        String packageName = zzdtVar.zzr().getPackageName();
        String strZzd = this.zzb.zzb.zzd();
        zzbf zzbfVarZzt = this.zzb.zzt();
        int i2 = Build.VERSION.SDK_INT;
        String strZza = zzbfVarZzt.zza();
        zztn zztnVarZzf = zzto.zzf();
        zztnVarZzf.zzt(str);
        zztnVarZzf.zzq(packageName);
        zztnVarZzf.zzu(iZza);
        zztnVarZzf.zzr("18.6.1");
        zztnVarZzf.zzs(strZzd);
        zztnVarZzf.zzf(String.valueOf(i2));
        zztnVarZzf.zze(strZza);
        zzto zztoVar = (zzto) zztnVarZzf.zzk();
        zzdt zzdtVar2 = this.zzb;
        zzff zzffVarZzg = zzdt.zzg(zzdtVar2);
        String strZzb = zzdt.zzd(zzdtVar2).zzb();
        this.zza = 1;
        Object objZzc = zzffVarZzg.zzc(strZzb, zztoVar, this);
        return objZzc == enumC32485OooO00o ? enumC32485OooO00o : objZzc;
    }
}
