package com.google.android.recaptcha.internal;

import OooOoOO.C20519OooO0Oo;
import Oooo0.C20857Oooooo;
import OooooOO.C21355Ooooooo;
import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.recaptcha.RecaptchaAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0O0O.C33576OooOOOo;
import oO0o0O0O.InterfaceC33569OooO0oo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33672o00ooo;
import oO0o0OO.o0000;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;
import oOo000Oo.Oooo0;

/* JADX INFO: loaded from: classes7.dex */
public final class zzdt {
    private final String zza;
    private final zzek zzb;
    private final zzl zzc;
    private final InterfaceC32440OooOO0 zzd;
    private final InterfaceC32440OooOO0 zze;
    private final InterfaceC32440OooOO0 zzf;
    private final InterfaceC32440OooOO0 zzg;
    private final InterfaceC32440OooOO0 zzh;
    private final zzbi zzi;

    public zzdt(String str, zzbi zzbiVar, zzek zzekVar, zzl zzlVar) {
        this.zza = str;
        this.zzi = zzbiVar;
        this.zzb = zzekVar;
        this.zzc = zzlVar;
        int i = zzav.zza;
        this.zzd = C20519OooO0Oo.OooO0OO(zzdm.zza);
        this.zze = C20519OooO0Oo.OooO0OO(zzdn.zza);
        this.zzf = C20519OooO0Oo.OooO0OO(zzdo.zza);
        this.zzg = C20519OooO0Oo.OooO0OO(zzdp.zza);
        this.zzh = C20519OooO0Oo.OooO0OO(zzdq.zza);
    }

    public static final /* synthetic */ zzbr zzd(zzdt zzdtVar) {
        return (zzbr) zzdtVar.zze.getValue();
    }

    public static final /* synthetic */ zzff zzg(zzdt zzdtVar) {
        return (zzff) zzdtVar.zzd.getValue();
    }

    public static final /* synthetic */ zzfj zzh(zzdt zzdtVar) {
        return (zzfj) zzdtVar.zzg.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Application zzr() {
        return (Application) this.zzh.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbd zzs(Exception exc, zzbd zzbdVar) {
        return !zzx() ? new zzbd(zzbb.zzc, zzba.zzao, exc.getMessage()) : zzbdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbf zzt() {
        return (zzbf) this.zzf.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzek zzu(String str) {
        zzek zzekVarZza = this.zzb.zza();
        zzekVarZza.zzc(str);
        return zzekVarZza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzv(zzsc zzscVar, long j, Continuation continuation) throws Throwable {
        zzdj zzdjVar;
        Object objZzc;
        zzdt zzdtVar;
        InterfaceC33569OooO0oo<InterfaceC33672o00ooo> children;
        if (continuation instanceof zzdj) {
            zzdjVar = (zzdj) continuation;
            int i = zzdjVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzdjVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzdjVar = new zzdj(this, continuation);
            }
        }
        zzdj zzdjVar2 = zzdjVar;
        Object obj = zzdjVar2.zzb;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = zzdjVar2.zzd;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            zzy(zzscVar.zzO());
            Iterator it = zzw().iterator();
            while (it.hasNext()) {
                this.zzc.zzf((zze) it.next());
            }
            zzl zzlVar = this.zzc;
            zzek zzekVar = this.zzb;
            zzdjVar2.zza = this;
            zzdjVar2.zzd = 1;
            objZzc = zzlVar.zzc(j, zzscVar, zzekVar, zzdjVar2);
            if (objZzc != enumC32485OooO00o) {
                zzdtVar = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Throwable th = (Throwable) zzdjVar2.zza;
            C32446OooOOOo.OooO0O0(obj);
            throw th;
        }
        zzdtVar = (zzdt) zzdjVar2.zza;
        C32446OooOOOo.OooO0O0(obj);
        objZzc = ((C32445OooOOOO) obj).f116639OooOo0o;
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objZzc);
        if (thOooO00o == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        InterfaceC33672o00ooo interfaceC33672o00ooo = (InterfaceC33672o00ooo) zzdtVar.zzi.zzd().OooOOO0().get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o);
        if (interfaceC33672o00ooo != null && (children = interfaceC33672o00ooo.getChildren()) != null) {
            Iterator<InterfaceC33672o00ooo> it2 = children.iterator();
            while (it2.hasNext()) {
                it2.next().cancel((CancellationException) null);
            }
        }
        List listOooOo0 = C33576OooOOOo.OooOo0(oO00o00.OooO0OO.OooO0Oo(zzdtVar.zzi.zzd().OooOOO0()).getChildren());
        zzdjVar2.zza = thOooO00o;
        zzdjVar2.zzd = 2;
        if (C20857Oooooo.OooO0Oo(listOooOo0, zzdjVar2) != enumC32485OooO00o) {
            throw thOooO00o;
        }
        return enumC32485OooO00o;
    }

    private final List zzw() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzv(zzr(), this.zzb.zza(), this.zzi, null, 8, null));
        arrayList.add(new zzja(this.zzb, this.zzi));
        return OooOo.o0ooOO0(arrayList);
    }

    private final boolean zzx() {
        NetworkCapabilities networkCapabilities;
        int i = zzav.zza;
        try {
            Object systemService = zzr().getSystemService("connectivity");
            OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                return networkCapabilities.hasCapability(16);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private static final void zzy(String str) throws zzbd {
        try {
            zzrv zzrvVarZzj = zzrv.zzj(zzbt.zza(str));
            int i = zzav.zza;
            ((zzfu) C20519OooO0Oo.OooO0OO(zzde.zza).getValue()).zza(zzrvVarZzj);
        } catch (Exception e) {
            throw new zzbd(zzbb.zzl, zzba.zzan, e.getMessage());
        }
    }

    public final zzsp zzi(RecaptchaAction recaptchaAction, zzsi zzsiVar, zzsc zzscVar) {
        zzso zzsoVarZzf = zzsp.zzf();
        zzsoVarZzf.zzs(this.zza);
        zzsoVarZzf.zze(recaptchaAction.getAction());
        zzsoVarZzf.zzf(zzscVar.zzN());
        zzsoVarZzf.zzq(zzscVar.zzM());
        zzsoVarZzf.zzr(zzsiVar);
        return (zzsp) zzsoVarZzf.zzk();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzl(String str, long j, Continuation continuation) throws zzbd {
        zzdd zzddVar;
        Exception e;
        zzen zzenVar;
        o0000 e2;
        zzbd e3;
        if (continuation instanceof zzdd) {
            zzddVar = (zzdd) continuation;
            int i = zzddVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzddVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzddVar = new zzdd(this, continuation);
            }
        }
        Object obj = zzddVar.zza;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = zzddVar.zzc;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            zzen zzenVarZzf = zzu(str).zzf(27);
            try {
                zzl zzlVar = this.zzc;
                zzddVar.zzd = zzenVarZzf;
                zzddVar.zzc = 1;
                Object objZzb = zzlVar.zzb(str, j, zzddVar);
                if (objZzb == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                obj = objZzb;
                zzenVar = zzenVarZzf;
            } catch (zzbd e4) {
                e3 = e4;
                zzenVar = zzenVarZzf;
                zzenVar.zzb(e3);
                throw e3;
            } catch (o0000 e5) {
                e2 = e5;
                zzenVar = zzenVarZzf;
                zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzb, e2.getMessage());
                zzenVar.zzb(zzbdVar);
                throw zzbdVar;
            } catch (Exception e6) {
                e = e6;
                zzenVar = zzenVarZzf;
                zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zzaa, e.getMessage());
                zzenVar.zzb(zzbdVar2);
                throw zzbdVar2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzenVar = zzddVar.zzd;
            try {
                C32446OooOOOo.OooO0O0(obj);
            } catch (zzbd e7) {
                e3 = e7;
                zzenVar.zzb(e3);
                throw e3;
            } catch (o0000 e8) {
                e2 = e8;
                zzbd zzbdVar3 = new zzbd(zzbb.zzb, zzba.zzb, e2.getMessage());
                zzenVar.zzb(zzbdVar3);
                throw zzbdVar3;
            } catch (Exception e9) {
                e = e9;
                zzbd zzbdVar22 = new zzbd(zzbb.zzb, zzba.zzaa, e.getMessage());
                zzenVar.zzb(zzbdVar22);
                throw zzbdVar22;
            }
        }
        zzsi zzsiVar = (zzsi) obj;
        zzenVar.zza();
        return zzsiVar;
    }

    public final Object zzm(zzsp zzspVar, String str, long j, Continuation continuation) {
        return C33609OooO0oo.OooO0o(this.zzi.zza().OooOOO0(), new zzdg(this, str, j, zzspVar, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzn(zzsc zzscVar, long j, Continuation continuation) throws zzbd {
        zzdk zzdkVar;
        if (continuation instanceof zzdk) {
            zzdkVar = (zzdk) continuation;
            int i = zzdkVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzdkVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzdkVar = new zzdk(this, continuation);
            }
        }
        Object obj = zzdkVar.zza;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = zzdkVar.zzc;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                zzdl zzdlVar = new zzdl(this, zzscVar, j, null);
                zzdkVar.zzc = 1;
                if (C21355Ooooooo.OooO(j, zzdlVar, zzdkVar) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        } catch (zzbd e) {
            throw e;
        } catch (o0000 e2) {
            throw new zzbd(zzbb.zzb, zzba.zzb, e2.getMessage());
        } catch (Exception e3) {
            throw new zzbd(zzbb.zzb, zzba.zzap, e3.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzo(long j, Continuation continuation) throws Throwable {
        zzdr zzdrVar;
        Exception e;
        zzen zzenVar;
        zzdt zzdtVar;
        o0000 e2;
        zzbd e3;
        if (continuation instanceof zzdr) {
            zzdrVar = (zzdr) continuation;
            int i = zzdrVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzdrVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzdrVar = new zzdr(this, continuation);
            }
        }
        Object obj = zzdrVar.zza;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = zzdrVar.zzc;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            zzen zzenVarZzf = this.zzb.zzf(22);
            try {
                zzds zzdsVar = new zzds(this, zzenVarZzf, null);
                zzdrVar.zzd = this;
                zzdrVar.zze = zzenVarZzf;
                zzdrVar.zzc = 1;
                Object objOooO = C21355Ooooooo.OooO(j, zzdsVar, zzdrVar);
                if (objOooO == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                obj = objOooO;
                zzenVar = zzenVarZzf;
                zzdtVar = this;
            } catch (zzbd e4) {
                e3 = e4;
                zzenVar = zzenVarZzf;
                zzdtVar = this;
                if (OooOOO0.OooO0O0(e3.zzb(), zzbb.zzc)) {
                }
                zzenVar.zzb(e3);
                throw e3;
            } catch (o0000 e5) {
                e2 = e5;
                zzenVar = zzenVarZzf;
                zzdtVar = this;
                zzbd zzbdVarZzs = zzdtVar.zzs(e2, new zzbd(zzbb.zzc, zzba.zzb, e2.getMessage()));
                zzenVar.zzb(zzbdVarZzs);
                throw zzbdVarZzs;
            } catch (Exception e6) {
                e = e6;
                zzenVar = zzenVarZzf;
                zzdtVar = this;
                zzbd zzbdVarZzs2 = zzdtVar.zzs(e, new zzbd(zzbb.zzc, zzba.zzaw, e.getMessage()));
                zzenVar.zzb(zzbdVarZzs2);
                throw zzbdVarZzs2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzenVar = zzdrVar.zze;
            zzdtVar = zzdrVar.zzd;
            try {
                C32446OooOOOo.OooO0O0(obj);
            } catch (zzbd e7) {
                e3 = e7;
                if (OooOOO0.OooO0O0(e3.zzb(), zzbb.zzc)) {
                    e3 = zzdtVar.zzs(e3, e3);
                }
                zzenVar.zzb(e3);
                throw e3;
            } catch (o0000 e8) {
                e2 = e8;
                zzbd zzbdVarZzs3 = zzdtVar.zzs(e2, new zzbd(zzbb.zzc, zzba.zzb, e2.getMessage()));
                zzenVar.zzb(zzbdVarZzs3);
                throw zzbdVarZzs3;
            } catch (Exception e9) {
                e = e9;
                zzbd zzbdVarZzs22 = zzdtVar.zzs(e, new zzbd(zzbb.zzc, zzba.zzaw, e.getMessage()));
                zzenVar.zzb(zzbdVarZzs22);
                throw zzbdVarZzs22;
            }
        }
        return (zzsc) obj;
    }

    public final void zzq(String str, zzsr zzsrVar) {
        zzen zzenVarZzf = zzu(str).zzf(29);
        try {
            List<zzst> listZzk = zzsrVar.zzk();
            int iOooO0Oo = Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(listZzk, 10));
            if (iOooO0Oo < 16) {
                iOooO0Oo = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
            for (zzst zzstVar : listZzk) {
                linkedHashMap.put(zzstVar.zzg(), zzstVar.zzi());
            }
            zzt().zzb(linkedHashMap);
            this.zzc.zzg(zzsrVar);
            zzenVarZzf.zza();
        } catch (zzbd e) {
            zzenVarZzf.zzb(e);
        } catch (Exception e2) {
            zzenVarZzf.zzb(new zzbd(zzbb.zzb, zzba.zzas, e2.getMessage()));
        }
    }
}
