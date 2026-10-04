package com.google.android.recaptcha.internal;

import OooOoOO.C20519OooO0Oo;
import android.app.Application;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.api.ApiException;
import com.google.android.recaptcha.RecaptchaException;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.o0000;
import oO0o0oOo.C33900OooO0o0;
import oO0o0oOo.InterfaceC33895OooO00o;

/* JADX INFO: loaded from: classes7.dex */
public final class zzcv {
    private final Application zza;
    private zzdc zzc;
    private final zzl zze;
    private final InterfaceC33895OooO00o zzb = C33900OooO0o0.OooO00o();
    private final String zzd = UUID.randomUUID().toString();
    private zzbi zzf = new zzbi();

    /* JADX WARN: Multi-variable type inference failed */
    public zzcv(Application application) {
        this.zza = application;
        int i = 1;
        this.zze = new zzl(null, i, 0 == true ? 1 : 0);
        int i2 = zzav.zza;
        zzaw[] zzawVarArr = {new zzaw(915034652, new zzaz(null, 1, null)), new zzaw(915034802, new zzfu()), new zzaw(915034662, new zzbe()), new zzaw(915034909, new zzjd()), new zzaw(915034675, new zzbr("https://www.recaptcha.net/recaptcha/api3")), new zzaw(915034774, new zzex(0 == true ? 1 : 0, i, 0 == true ? 1 : 0)), new zzaw(915034792, new zzfk(true)), new zzaw(735120228, application), new zzaw(915034663, new zzbf(application)), new zzaw(915034791, new zzfj()), new zzaw(915034643, new zzbm(application)), new zzaw(915034775, new zzfa()), new zzaw(915034787, new zzff())};
        for (int i3 = 0; i3 < 13; i3++) {
            zzaw zzawVar = zzawVarArr[i3];
            if (!zzav.zzc.containsKey(Integer.valueOf(zzawVar.zza()))) {
                zzav.zzc.put(Integer.valueOf(zzawVar.zza()), zzawVar);
            }
        }
    }

    public static final /* synthetic */ zzdc zza(zzcv zzcvVar, String str) throws zzbd {
        zzdc zzdcVar = zzcvVar.zzc;
        if (zzdcVar == null) {
            return null;
        }
        if (OooOOO0.OooO0O0(zzdcVar.zzd(), str)) {
            return zzdcVar;
        }
        throw new zzbd(zzbb.zzd, zzba.zzam, null);
    }

    public static final /* synthetic */ void zzc(zzcv zzcvVar, long j) throws zzbd {
        if (j < 5000) {
            throw new zzbd(zzbb.zzj, zzba.zzI, null);
        }
        if (ContextCompat.checkSelfPermission(zzcvVar.zza, "android.permission.INTERNET") != 0) {
            throw new zzbd(zzbb.zzc, zzba.zzao, null);
        }
    }

    public static final /* synthetic */ zzcn zze(zzcv zzcvVar, String str, zzbi zzbiVar, zzch zzchVar, zzek zzekVar) {
        zzdt zzdtVar = new zzdt(str, zzbiVar, zzekVar, zzcvVar.zze);
        return OooOOO0.OooO0O0(zzchVar, zzch.zza) ? new zzef(zzdtVar) : new zzec(zzdtVar, zzbiVar, zzekVar, new zzbo());
    }

    public static /* synthetic */ Object zzh(zzcv zzcvVar, String str, long j, zzcn zzcnVar, zzbi zzbiVar, zzch zzchVar, Continuation continuation, int i, Object obj) throws RecaptchaException, o0000, ApiException {
        if ((i & 8) != 0) {
            zzbiVar = zzcvVar.zzf;
        }
        zzbi zzbiVar2 = zzbiVar;
        if ((i & 16) != 0) {
            zzchVar = zzch.zza;
        }
        zzch zzchVar2 = zzchVar;
        if ((i & 2) != 0) {
            j = 10000;
        }
        return zzcvVar.zzg(str, j, null, zzbiVar2, zzchVar2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzj(String str, int i, InterfaceC32508OooOOOo interfaceC32508OooOOOo, Continuation continuation) throws RecaptchaException {
        zzcu zzcuVar;
        Exception e;
        zzen zzenVar;
        zzbd e2;
        if (continuation instanceof zzcu) {
            zzcuVar = (zzcu) continuation;
            int i2 = zzcuVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzcuVar.zzc = i2 - Integer.MIN_VALUE;
            } else {
                zzcuVar = new zzcu(this, continuation);
            }
        }
        Object objInvoke = zzcuVar.zza;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = zzcuVar.zzc;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objInvoke);
            zzek zzekVarZzk = zzk(str, this.zzf, i);
            zzen zzenVarZzf = zzekVarZzk.zzf(6);
            try {
                zzcuVar.zzd = zzenVarZzf;
                zzcuVar.zzc = 1;
                objInvoke = interfaceC32508OooOOOo.invoke(zzekVarZzk, zzcuVar);
                if (objInvoke == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                zzenVar = zzenVarZzf;
            } catch (zzbd e3) {
                e2 = e3;
                zzenVar = zzenVarZzf;
                zzenVar.zzb(e2);
                throw e2.zzc();
            } catch (Exception e4) {
                e = e4;
                zzenVar = zzenVarZzf;
                zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zza, e.getMessage());
                zzenVar.zzb(zzbdVar);
                throw zzbdVar.zzc();
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzenVar = zzcuVar.zzd;
            try {
                C32446OooOOOo.OooO0O0(objInvoke);
            } catch (zzbd e5) {
                e2 = e5;
                zzenVar.zzb(e2);
                throw e2.zzc();
            } catch (Exception e6) {
                e = e6;
                zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zza, e.getMessage());
                zzenVar.zzb(zzbdVar2);
                throw zzbdVar2.zzc();
            }
        }
        zzenVar.zza();
        return objInvoke;
    }

    private final zzek zzk(String str, zzbi zzbiVar, int i) {
        String string = UUID.randomUUID().toString();
        int i2 = zzav.zza;
        zzes zzesVar = new zzes(this.zza, new zzeu(((zzbr) C20519OooO0Oo.OooO0OO(zzcr.zza).getValue()).zzc()), zzbiVar.zza());
        zzek zzekVar = new zzek(str, this.zzd, string, i, this.zza, zzesVar, null);
        zzekVar.zzc(string);
        return zzekVar;
    }

    public final zzbi zzd() {
        return this.zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzg(String str, long j, zzcn zzcnVar, zzbi zzbiVar, zzch zzchVar, Continuation continuation) throws Throwable {
        zzcs zzcsVar;
        zzbi zzbiVar2;
        zzch zzchVar2;
        long j2;
        zzcv zzcvVar;
        String str2;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        if (continuation instanceof zzcs) {
            zzcsVar = (zzcs) continuation;
            int i = zzcsVar.zzg;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzcsVar.zzg = i - Integer.MIN_VALUE;
            } else {
                zzcsVar = new zzcs(this, continuation);
            }
        }
        Object objZzj = zzcsVar.zze;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = zzcsVar.zzg;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objZzj);
                InterfaceC33895OooO00o interfaceC33895OooO00o3 = this.zzb;
                zzcsVar.zza = this;
                zzcsVar.zzh = str;
                zzcsVar.zzb = null;
                zzcsVar.zzj = zzbiVar;
                zzcsVar.zzi = zzchVar;
                zzcsVar.zzc = interfaceC33895OooO00o3;
                zzcsVar.zzd = j;
                zzcsVar.zzg = 1;
                if (interfaceC33895OooO00o3.OooO00o(zzcsVar) != enumC32485OooO00o) {
                    zzbiVar2 = zzbiVar;
                    zzchVar2 = zzchVar;
                    j2 = j;
                    zzcvVar = this;
                    str2 = str;
                    interfaceC33895OooO00o = interfaceC33895OooO00o3;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC33895OooO00o2 = (InterfaceC33895OooO00o) zzcsVar.zza;
                try {
                    C32446OooOOOo.OooO0O0(objZzj);
                    zzdc zzdcVar = (zzdc) objZzj;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    return zzdcVar;
                } catch (Throwable th) {
                    th = th;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    throw th;
                }
            }
            long j3 = zzcsVar.zzd;
            InterfaceC33895OooO00o interfaceC33895OooO00o4 = (InterfaceC33895OooO00o) zzcsVar.zzc;
            zzch zzchVar3 = zzcsVar.zzi;
            zzbi zzbiVar3 = zzcsVar.zzj;
            String str3 = zzcsVar.zzh;
            zzcv zzcvVar2 = (zzcv) zzcsVar.zza;
            C32446OooOOOo.OooO0O0(objZzj);
            zzchVar2 = zzchVar3;
            zzbiVar2 = zzbiVar3;
            str2 = str3;
            zzcvVar = zzcvVar2;
            j2 = j3;
            interfaceC33895OooO00o = interfaceC33895OooO00o4;
            int i3 = OooOOO0.OooO0O0(zzchVar2, zzch.zza) ? 3 : OooOOO0.OooO0O0(zzchVar2, zzch.zzb) ? 4 : 2;
            zzct zzctVar = new zzct(zzcvVar, str2, j2, null, zzbiVar2, zzchVar2, null);
            zzcsVar.zza = interfaceC33895OooO00o;
            zzcsVar.zzh = null;
            zzcsVar.zzb = null;
            zzcsVar.zzj = null;
            zzcsVar.zzi = null;
            zzcsVar.zzc = null;
            zzcsVar.zzg = 2;
            objZzj = zzcvVar.zzj(str2, i3, zzctVar, zzcsVar);
            if (objZzj != enumC32485OooO00o) {
                interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                zzdc zzdcVar2 = (zzdc) objZzj;
                interfaceC33895OooO00o2.OooOOO0(null);
                return zzdcVar2;
            }
            return enumC32485OooO00o;
        } catch (Throwable th2) {
            th = th2;
            interfaceC33895OooO00o2 = interfaceC33895OooO00o;
            interfaceC33895OooO00o2.OooOOO0(null);
            throw th;
        }
    }
}
