package com.google.android.recaptcha.internal;

import OooooOO.C21355Ooooooo;
import kotlin.coroutines.Continuation;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zze {
    private boolean zza;

    public zzen zza(String str) {
        throw null;
    }

    public zzen zzb() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(String str, long j, Continuation continuation) throws zzbd {
        zza zzaVar;
        zzen zzenVarZza;
        Exception exc;
        long j2;
        zzen zzenVar;
        zze zzeVar;
        zze zzeVar2;
        String str2;
        zze zzeVar3;
        String str3;
        long j3;
        Exception e;
        String str4 = str;
        long j4 = j;
        if (continuation instanceof zza) {
            zzaVar = (zza) continuation;
            int i = zzaVar.zze;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzaVar.zze = i - Integer.MIN_VALUE;
            } else {
                zzaVar = new zza(this, continuation);
            }
        }
        zza zzaVar2 = zzaVar;
        Object objOooO = zzaVar2.zzc;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = zzaVar2.zze;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO);
            zzenVarZza = zza(str);
            try {
                zzb zzbVar = new zzb(this, str4, null);
                zzaVar2.zza = this;
                zzaVar2.zzf = str4;
                zzaVar2.zzg = zzenVarZza;
                zzaVar2.zzb = j4;
                zzaVar2.zze = 1;
                objOooO = C21355Ooooooo.OooO(j4, zzbVar, zzaVar2);
                if (objOooO != enumC32485OooO00o) {
                    zzeVar2 = this;
                }
            } catch (Exception e2) {
                exc = e2;
                j2 = j4;
                zzenVar = zzenVarZza;
                zzeVar = this;
                zzbd zzbdVarZza = zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzaa, exc.getMessage()));
                if (zzenVar != null) {
                }
                zzaVar2.zza = zzeVar;
                zzaVar2.zzf = str4;
                zzaVar2.zzg = null;
                zzaVar2.zze = 2;
                str2 = str4;
                if (zzeVar.zzi(str2, j2, exc, zzaVar2) != enumC32485OooO00o) {
                }
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO);
                return objOooO;
            }
            str3 = zzaVar2.zzf;
            zzeVar3 = (zze) zzaVar2.zza;
            C32446OooOOOo.OooO0O0(objOooO);
            zzaVar2.zza = null;
            zzaVar2.zzf = null;
            zzaVar2.zze = 3;
            Object objZzd = zzeVar3.zzd(str3, zzaVar2);
            return objZzd != enumC32485OooO00o ? enumC32485OooO00o : objZzd;
        }
        long j5 = zzaVar2.zzb;
        zzenVar = zzaVar2.zzg;
        String str5 = zzaVar2.zzf;
        zzeVar2 = (zze) zzaVar2.zza;
        try {
            C32446OooOOOo.OooO0O0(objOooO);
            zzenVarZza = zzenVar;
            j4 = j5;
            str4 = str5;
        } catch (Exception e3) {
            e = e3;
            j3 = j5;
            str4 = str5;
            zzeVar = zzeVar2;
            j2 = j3;
            exc = e;
            zzbd zzbdVarZza2 = zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzaa, exc.getMessage()));
            if (zzenVar != null) {
                zzenVar.zzb(zzbdVarZza2);
            }
            zzaVar2.zza = zzeVar;
            zzaVar2.zzf = str4;
            zzaVar2.zzg = null;
            zzaVar2.zze = 2;
            str2 = str4;
            if (zzeVar.zzi(str2, j2, exc, zzaVar2) != enumC32485OooO00o) {
                zzeVar3 = zzeVar;
                str3 = str2;
                zzaVar2.zza = null;
                zzaVar2.zzf = null;
                zzaVar2.zze = 3;
                Object objZzd2 = zzeVar3.zzd(str3, zzaVar2);
                if (objZzd2 != enumC32485OooO00o) {
                }
            }
        }
        try {
            Object obj = ((C32445OooOOOO) objOooO).f116639OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            zzsi zzsiVar = (zzsi) obj;
            if (zzenVarZza == null) {
                return zzsiVar;
            }
            zzenVarZza.zza();
            return zzsiVar;
        } catch (Exception e4) {
            e = e4;
            j3 = j4;
            zzenVar = zzenVarZza;
            zzeVar = zzeVar2;
            j2 = j3;
            exc = e;
            zzbd zzbdVarZza22 = zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzaa, exc.getMessage()));
            if (zzenVar != null) {
            }
            zzaVar2.zza = zzeVar;
            zzaVar2.zzf = str4;
            zzaVar2.zzg = null;
            zzaVar2.zze = 2;
            str2 = str4;
            if (zzeVar.zzi(str2, j2, exc, zzaVar2) != enumC32485OooO00o) {
            }
        }
    }

    public abstract Object zzd(String str, Continuation continuation);

    /* JADX WARN: Removed duplicated region for block: B:39:0x009d A[PHI: r8 r9 r11
      0x009d: PHI (r8v9 com.google.android.recaptcha.internal.zzen) = (r8v6 com.google.android.recaptcha.internal.zzen), (r8v15 com.google.android.recaptcha.internal.zzen) binds: [B:38:0x009b, B:16:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x009d: PHI (r9v6 com.google.android.recaptcha.internal.zze) = (r9v3 com.google.android.recaptcha.internal.zze), (r9v10 com.google.android.recaptcha.internal.zze) binds: [B:38:0x009b, B:16:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x009d: PHI (r11v8 java.lang.Object) = (r11v5 java.lang.Object), (r11v1 java.lang.Object) binds: [B:38:0x009b, B:16:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zze(long j, zzsc zzscVar, Continuation continuation) throws zzbd {
        zzc zzcVar;
        Exception e;
        zze zzeVar;
        zzen zzenVar;
        zzbd zzbdVar;
        zzbd zzbdVar2;
        if (continuation instanceof zzc) {
            zzcVar = (zzc) continuation;
            int i = zzcVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzcVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzcVar = new zzc(this, continuation);
            }
        }
        Object objZzj = zzcVar.zzb;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = zzcVar.zzd;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objZzj);
            zzen zzenVarZzb = zzb();
            if (this.zza) {
                zzenVarZzb.zza();
                return C32460OooOooO.f116667OooO00o;
            }
            try {
                zzd zzdVar = new zzd(this, zzscVar, null);
                zzcVar.zza = this;
                zzcVar.zze = zzenVarZzb;
                zzcVar.zzd = 1;
                Object objOooO = C21355Ooooooo.OooO(j, zzdVar, zzcVar);
                if (objOooO != enumC32485OooO00o) {
                    objZzj = objOooO;
                    zzenVar = zzenVarZzb;
                    zzeVar = this;
                }
            } catch (Exception e2) {
                e = e2;
                zzeVar = this;
                zzenVar = zzenVarZzb;
                zzeVar.zza = false;
                zzcVar.zza = zzeVar;
                zzcVar.zze = zzenVar;
                zzcVar.zzd = 2;
                objZzj = zzeVar.zzj(e, zzcVar);
                if (objZzj != enumC32485OooO00o) {
                }
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zzbdVar2 = (zzbd) zzcVar.zza;
                C32446OooOOOo.OooO0O0(objZzj);
                return C32446OooOOOo.OooO00o(zzbdVar2);
            }
            zzenVar = zzcVar.zze;
            zzeVar = (zze) zzcVar.zza;
            C32446OooOOOo.OooO0O0(objZzj);
            zzbdVar = (zzbd) objZzj;
            if (zzenVar != null) {
                zzenVar.zzb(zzbdVar);
            }
            zzcVar.zza = zzbdVar;
            zzcVar.zze = null;
            zzcVar.zzd = 3;
            if (zzeVar.zzg(zzbdVar, zzcVar) != enumC32485OooO00o) {
                zzbdVar2 = zzbdVar;
                return C32446OooOOOo.OooO00o(zzbdVar2);
            }
            return enumC32485OooO00o;
        }
        zzenVar = zzcVar.zze;
        zzeVar = (zze) zzcVar.zza;
        try {
            C32446OooOOOo.OooO0O0(objZzj);
        } catch (Exception e3) {
            e = e3;
            zzeVar.zza = false;
            zzcVar.zza = zzeVar;
            zzcVar.zze = zzenVar;
            zzcVar.zzd = 2;
            objZzj = zzeVar.zzj(e, zzcVar);
            if (objZzj != enumC32485OooO00o) {
                zzbdVar = (zzbd) objZzj;
                if (zzenVar != null) {
                }
                zzcVar.zza = zzbdVar;
                zzcVar.zze = null;
                zzcVar.zzd = 3;
                if (zzeVar.zzg(zzbdVar, zzcVar) != enumC32485OooO00o) {
                }
            }
            return enumC32485OooO00o;
        }
        C32446OooOOOo.OooO0O0(((C32445OooOOOO) objZzj).f116639OooOo0o);
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        zzeVar.zza = true;
        if (zzenVar != null) {
            zzenVar.zza();
        }
        return c32460OooOooO;
    }

    public abstract Object zzf(String str, Continuation continuation) throws zzbd;

    public Object zzg(zzbd zzbdVar, Continuation continuation) {
        return C32460OooOooO.f116667OooO00o;
    }

    public abstract Object zzh(zzsc zzscVar, Continuation continuation) throws zzbd;

    public Object zzi(String str, long j, Exception exc, Continuation continuation) {
        return C32460OooOooO.f116667OooO00o;
    }

    public Object zzj(Exception exc, Continuation continuation) {
        return zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzap, exc.getMessage()));
    }

    public void zzk(zzsr zzsrVar) {
    }

    public final boolean zzl() {
        return this.zza;
    }
}
