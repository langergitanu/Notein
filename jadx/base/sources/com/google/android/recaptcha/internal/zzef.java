package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: loaded from: classes7.dex */
public final class zzef implements zzcn {
    private final zzdt zza;
    private zzcm zzb = zzcm.zza;
    private zzsc zzc;

    public zzef(zzdt zzdtVar) {
        this.zza = zzdtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    @Override // com.google.android.recaptcha.internal.zzcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(String str, RecaptchaAction recaptchaAction, long j, Continuation continuation) throws zzbd {
        zzed zzedVar;
        String str2;
        RecaptchaAction recaptchaAction2;
        double d;
        zzef zzefVar;
        String str3;
        zzef zzefVar2;
        if (continuation instanceof zzed) {
            zzedVar = (zzed) continuation;
            int i = zzedVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzedVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzedVar = new zzed(this, continuation);
            }
        }
        zzed zzedVar2 = zzedVar;
        Object objZzl = zzedVar2.zzb;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = zzedVar2.zzd;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objZzl);
                if (!OooOOO0.OooO0O0(this.zzb, zzcm.zzb)) {
                    throw new zzbd(zzbb.zzb, zzba.zzar, null);
                }
                double d2 = j;
                zzdt zzdtVar = this.zza;
                double d3 = 0.45d * d2;
                zzedVar2.zze = this;
                zzedVar2.zzf = str;
                zzedVar2.zzg = recaptchaAction;
                double d4 = d2 * 0.55d;
                zzedVar2.zza = d4;
                zzedVar2.zzd = 1;
                objZzl = zzdtVar.zzl(str, (long) d3, zzedVar2);
                if (objZzl != enumC32485OooO00o) {
                    str2 = str;
                    recaptchaAction2 = recaptchaAction;
                    d = d4;
                    zzefVar = this;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str3 = zzedVar2.zzf;
                zzefVar2 = zzedVar2.zze;
                C32446OooOOOo.OooO0O0(objZzl);
                zzsr zzsrVar = (zzsr) objZzl;
                zzefVar2.zza.zzq(str3, zzsrVar);
                return zzsrVar.zzj();
            }
            double d5 = zzedVar2.zza;
            recaptchaAction2 = zzedVar2.zzg;
            String str4 = zzedVar2.zzf;
            zzef zzefVar3 = zzedVar2.zze;
            C32446OooOOOo.OooO0O0(objZzl);
            d = d5;
            zzefVar = zzefVar3;
            str2 = str4;
            zzsi zzsiVar = (zzsi) objZzl;
            zzdt zzdtVar2 = zzefVar.zza;
            zzsc zzscVar = zzefVar.zzc;
            if (zzscVar == null) {
                zzscVar = null;
            }
            zzsp zzspVarZzi = zzdtVar2.zzi(recaptchaAction2, zzsiVar, zzscVar);
            zzedVar2.zze = zzefVar;
            zzedVar2.zzf = str2;
            zzedVar2.zzg = null;
            zzedVar2.zzd = 2;
            objZzl = zzefVar.zza.zzm(zzspVarZzi, str2, (long) d, zzedVar2);
            if (objZzl != enumC32485OooO00o) {
                str3 = str2;
                zzefVar2 = zzefVar;
                zzsr zzsrVar2 = (zzsr) objZzl;
                zzefVar2.zza.zzq(str3, zzsrVar2);
                return zzsrVar2.zzj();
            }
            return enumC32485OooO00o;
        } catch (zzbd e) {
            throw e;
        } catch (Exception e2) {
            throw new zzbd(zzbb.zzb, zzba.zzaz, e2.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0097, code lost:
    
        if (r12 == r1) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v10, types: [com.google.android.recaptcha.internal.zzef] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    @Override // com.google.android.recaptcha.internal.zzcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb(long j, Continuation continuation) throws Throwable {
        zzee zzeeVar;
        Object obj;
        double d;
        zzef zzefVar;
        if (continuation instanceof zzee) {
            zzeeVar = (zzee) continuation;
            int i = zzeeVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzeeVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzeeVar = new zzee(this, continuation);
            }
        }
        Object obj2 = zzeeVar.zzb;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = zzeeVar.zzd;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                if (OooOOO0.OooO0O0(this.zzb, zzcm.zzb) || OooOOO0.OooO0O0(this.zzb, zzcm.zzd)) {
                    return C32460OooOooO.f116667OooO00o;
                }
                this.zzb = zzcm.zzc;
                double d2 = j;
                try {
                    zzdt zzdtVar = this.zza;
                    double d3 = 0.6d * d2;
                    zzeeVar.zze = this;
                    double d4 = d2 * 0.4d;
                    zzeeVar.zza = d4;
                    zzeeVar.zzd = 1;
                    Object objZzo = zzdtVar.zzo((long) d3, zzeeVar);
                    if (objZzo != enumC32485OooO00o) {
                        obj = objZzo;
                        d = d4;
                        zzefVar = this;
                        zzsc zzscVar = (zzsc) obj;
                        zzefVar.zzc = zzscVar;
                        zzeeVar.zze = zzefVar;
                        zzeeVar.zzd = 2;
                        Object objZzn = zzefVar.zza.zzn(zzscVar, (long) d, zzeeVar);
                        j = zzefVar;
                    }
                    return enumC32485OooO00o;
                } catch (zzbd e) {
                    e = e;
                    j = this;
                    j.zzb = zzcm.zzd;
                    throw e;
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zzef zzefVar2 = zzeeVar.zze;
                C32446OooOOOo.OooO0O0(obj2);
                j = zzefVar2;
                j.zzb = zzcm.zzb;
                return C32460OooOooO.f116667OooO00o;
            }
            double d5 = zzeeVar.zza;
            zzef zzefVar3 = zzeeVar.zze;
            try {
                C32446OooOOOo.OooO0O0(obj2);
                obj = obj2;
                d = d5;
                zzefVar = zzefVar3;
                zzsc zzscVar2 = (zzsc) obj;
                zzefVar.zzc = zzscVar2;
                zzeeVar.zze = zzefVar;
                zzeeVar.zzd = 2;
                Object objZzn2 = zzefVar.zza.zzn(zzscVar2, (long) d, zzeeVar);
                j = zzefVar;
            } catch (zzbd e2) {
                e = e2;
                j = zzefVar3;
                j.zzb = zzcm.zzd;
                throw e;
            }
        } catch (zzbd e3) {
            e = e3;
        }
    }
}
