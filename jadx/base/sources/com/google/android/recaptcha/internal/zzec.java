package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00OooO0.C25150OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33621OooOo0;
import oO0o0OO.InterfaceC33622OooOo00;

/* JADX INFO: loaded from: classes7.dex */
public final class zzec implements zzcn {
    private final zzdt zza;
    private final zzek zzb;
    private zzbd zzd;
    private zzsc zze;
    private final zzbi zzg;
    private InterfaceC33622OooOo00 zzc = C25150OooO00o.OooO0Oo();
    private zzcm zzf = zzcm.zza;

    public zzec(zzdt zzdtVar, zzbi zzbiVar, zzek zzekVar, zzbo zzboVar) {
        this.zza = zzdtVar;
        this.zzg = zzbiVar;
        this.zzb = zzekVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzl(InterfaceC32507OooOO0o interfaceC32507OooOO0o, Continuation continuation) {
        zzdv zzdvVar;
        zzbn zzbnVar;
        if (continuation instanceof zzdv) {
            zzdvVar = (zzdv) continuation;
            int i = zzdvVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzdvVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzdvVar = new zzdv(this, continuation);
            }
        }
        Object obj = zzdvVar.zza;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = zzdvVar.zzc;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            zzbn zzbnVar2 = new zzbn();
            zzdvVar.zzd = zzbnVar2;
            zzdvVar.zzc = 1;
            if (interfaceC32507OooOO0o.invoke(zzdvVar) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            zzbnVar = zzbnVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzbnVar = zzdvVar.zzd;
            C32446OooOOOo.OooO0O0(obj);
        }
        zzbnVar.zzc();
        return new Long(zzbnVar.zza(TimeUnit.MILLISECONDS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0076 A[Catch: Exception -> 0x002f, TRY_ENTER, TryCatch #1 {Exception -> 0x002f, blocks: (B:13:0x002b, B:26:0x0063, B:31:0x0076, B:32:0x007f), top: B:53:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzm(long j, Continuation continuation) throws zzbd {
        zzdw zzdwVar;
        zzec zzecVar;
        zzec zzecVar2;
        zzbd zzbdVar;
        zzbd zzbdVar2;
        long jLongValue;
        if (continuation instanceof zzdw) {
            zzdwVar = (zzdw) continuation;
            int i = zzdwVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzdwVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzdwVar = new zzdw(this, continuation);
            }
        }
        Object objZzl = zzdwVar.zzb;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = zzdwVar.zzd;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objZzl);
                zzdwVar.zze = this;
                zzdwVar.zza = j;
                zzdwVar.zzd = 1;
                if (zzn(j, zzdwVar) != enumC32485OooO00o) {
                    zzecVar = this;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = zzdwVar.zza;
                zzecVar2 = zzdwVar.zze;
                try {
                    C32446OooOOOo.OooO0O0(objZzl);
                    jLongValue = j - ((Number) objZzl).longValue();
                    if (jLongValue < 500) {
                        return new Long(jLongValue);
                    }
                    throw new zzbd(zzbb.zzc, zzba.zzar, null);
                } catch (Exception e) {
                    e = e;
                    if (e instanceof zzbd) {
                    }
                    if (zzbdVar == null) {
                    }
                    if (OooOOO0.OooO0O0(zzecVar2.zzf, zzcm.zzd)) {
                    }
                    throw zzbdVar2;
                }
            }
            j = zzdwVar.zza;
            zzecVar = zzdwVar.zze;
            C32446OooOOOo.OooO0O0(objZzl);
            zzdy zzdyVar = new zzdy(j, zzecVar, null);
            zzdwVar.zze = zzecVar;
            zzdwVar.zza = j;
            zzdwVar.zzd = 2;
            objZzl = zzecVar.zzl(zzdyVar, zzdwVar);
            if (objZzl != enumC32485OooO00o) {
                zzecVar2 = zzecVar;
                jLongValue = j - ((Number) objZzl).longValue();
                if (jLongValue < 500) {
                }
            }
            return enumC32485OooO00o;
        } catch (Exception e2) {
            e = e2;
            zzecVar2 = zzecVar;
            zzbdVar = e instanceof zzbd ? (zzbd) e : null;
            if (zzbdVar == null) {
                zzbdVar = new zzbd(zzbb.zzc, zzba.zzar, e.getMessage());
            }
            if ((!OooOOO0.OooO0O0(zzecVar2.zzf, zzcm.zzd) || OooOOO0.OooO0O0(zzecVar2.zzf, zzcm.zzc)) && (zzbdVar2 = zzecVar2.zzd) != null) {
                throw zzbdVar2;
            }
            throw zzbdVar;
        }
    }

    private final Object zzn(long j, Continuation continuation) {
        if (OooOOO0.OooO0O0(this.zzf, zzcm.zzb) || OooOOO0.OooO0O0(this.zzf, zzcm.zzc)) {
            return C32460OooOooO.f116667OooO00o;
        }
        if (OooOOO0.OooO0O0(this.zzf, zzcm.zzd) && !zzo(this.zzd)) {
            return C32460OooOooO.f116667OooO00o;
        }
        this.zzf = zzcm.zzc;
        C33621OooOo0 c33621OooOo0OooO0Oo = C25150OooO00o.OooO0Oo();
        this.zzc = c33621OooOo0OooO0Oo;
        C33609OooO0oo.OooO0OO(this.zzg.zza(), null, null, new zzeb(this, c33621OooOo0OooO0Oo, j, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzo(Exception exc) {
        if (!(exc instanceof zzbd)) {
            return true;
        }
        zzbd zzbdVar = (zzbd) exc;
        return (OooOOO0.OooO0O0(zzbdVar.zzb(), zzbb.zzd) || OooOOO0.OooO0O0(zzbdVar.zzb(), zzbb.zze) || OooOOO0.OooO0O0(zzbdVar.zzb(), zzbb.zzf)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // com.google.android.recaptcha.internal.zzcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(String str, RecaptchaAction recaptchaAction, long j, Continuation continuation) throws zzbd {
        zzdu zzduVar;
        String str2;
        RecaptchaAction recaptchaAction2;
        Object objZzm;
        zzec zzecVar;
        String str3;
        double d;
        zzec zzecVar2;
        zzsc zzscVar;
        String str4;
        zzec zzecVar3;
        if (continuation instanceof zzdu) {
            zzduVar = (zzdu) continuation;
            int i = zzduVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzduVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzduVar = new zzdu(this, continuation);
            }
        }
        zzdu zzduVar2 = zzduVar;
        Object objZzm2 = zzduVar2.zzb;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = zzduVar2.zzd;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objZzm2);
                zzduVar2.zze = this;
                str2 = str;
                zzduVar2.zzf = str2;
                recaptchaAction2 = recaptchaAction;
                zzduVar2.zzg = recaptchaAction2;
                zzduVar2.zzd = 1;
                objZzm = zzm(j, zzduVar2);
                if (objZzm == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                zzecVar = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str4 = zzduVar2.zzf;
                        zzecVar3 = zzduVar2.zze;
                        C32446OooOOOo.OooO0O0(objZzm2);
                        zzsr zzsrVar = (zzsr) objZzm2;
                        zzecVar3.zza.zzq(str4, zzsrVar);
                        return zzsrVar.zzj();
                    }
                    d = zzduVar2.zza;
                    recaptchaAction2 = zzduVar2.zzg;
                    str3 = zzduVar2.zzf;
                    zzecVar2 = zzduVar2.zze;
                    C32446OooOOOo.OooO0O0(objZzm2);
                    zzsi zzsiVar = (zzsi) objZzm2;
                    zzdt zzdtVar = zzecVar2.zza;
                    zzscVar = zzecVar2.zze;
                    if (zzscVar == null) {
                        zzscVar = null;
                    }
                    zzsp zzspVarZzi = zzdtVar.zzi(recaptchaAction2, zzsiVar, zzscVar);
                    zzdt zzdtVar2 = zzecVar2.zza;
                    long j2 = (long) d;
                    zzduVar2.zze = zzecVar2;
                    zzduVar2.zzf = str3;
                    zzduVar2.zzg = null;
                    zzduVar2.zzd = 3;
                    String str5 = str3;
                    objZzm2 = zzdtVar2.zzm(zzspVarZzi, str5, j2, zzduVar2);
                    if (objZzm2 != enumC32485OooO00o) {
                        str4 = str5;
                        zzecVar3 = zzecVar2;
                        zzsr zzsrVar2 = (zzsr) objZzm2;
                        zzecVar3.zza.zzq(str4, zzsrVar2);
                        return zzsrVar2.zzj();
                    }
                    return enumC32485OooO00o;
                }
                recaptchaAction2 = zzduVar2.zzg;
                String str6 = zzduVar2.zzf;
                zzecVar = zzduVar2.zze;
                C32446OooOOOo.OooO0O0(objZzm2);
                objZzm = objZzm2;
                str2 = str6;
            }
            double dLongValue = ((Number) objZzm).longValue();
            zzdt zzdtVar3 = zzecVar.zza;
            double d2 = 0.45d * dLongValue;
            zzduVar2.zze = zzecVar;
            zzduVar2.zzf = str2;
            zzduVar2.zzg = recaptchaAction2;
            double d3 = dLongValue * 0.55d;
            zzduVar2.zza = d3;
            zzduVar2.zzd = 2;
            Object objZzl = zzdtVar3.zzl(str2, (long) d2, zzduVar2);
            if (objZzl != enumC32485OooO00o) {
                zzec zzecVar4 = zzecVar;
                str3 = str2;
                objZzm2 = objZzl;
                d = d3;
                zzecVar2 = zzecVar4;
                zzsi zzsiVar2 = (zzsi) objZzm2;
                zzdt zzdtVar4 = zzecVar2.zza;
                zzscVar = zzecVar2.zze;
                if (zzscVar == null) {
                }
                zzsp zzspVarZzi2 = zzdtVar4.zzi(recaptchaAction2, zzsiVar2, zzscVar);
                zzdt zzdtVar22 = zzecVar2.zza;
                long j22 = (long) d;
                zzduVar2.zze = zzecVar2;
                zzduVar2.zzf = str3;
                zzduVar2.zzg = null;
                zzduVar2.zzd = 3;
                String str52 = str3;
                objZzm2 = zzdtVar22.zzm(zzspVarZzi2, str52, j22, zzduVar2);
                if (objZzm2 != enumC32485OooO00o) {
                }
            }
            return enumC32485OooO00o;
        } catch (zzbd e) {
            throw e;
        } catch (Exception e2) {
            throw new zzbd(zzbb.zzb, zzba.zzay, e2.getMessage());
        }
    }

    @Override // com.google.android.recaptcha.internal.zzcn
    public final Object zzb(long j, Continuation continuation) {
        Object objZzn = zzn(j, continuation);
        return objZzn == EnumC32485OooO00o.f116726OooOo0o ? objZzn : C32460OooOooO.f116667OooO00o;
    }
}
