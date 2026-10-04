package com.google.android.recaptcha.internal;

import OooOoOO.C20519OooO0Oo;
import android.app.Application;
import android.webkit.WebView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00OooO0.C25150OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33621OooOo0;
import oO0o0OO.InterfaceC33622OooOo00;
import oO0o0OO.o0000;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes7.dex */
public final class zzja extends zze {
    public InterfaceC33622OooOo00 zza;
    public zzfo zzb;
    private final zzek zzc;
    private zzsc zzf;
    private final zzek zzj;
    private final InterfaceC32440OooOO0 zzk;
    private final InterfaceC32440OooOO0 zzl;
    private final InterfaceC32440OooOO0 zzm;
    private final InterfaceC32440OooOO0 zzn;
    private final InterfaceC32440OooOO0 zzo;
    private zzen zzp;
    private final zzbi zzq;
    private final Map zzd = zzjb.zza();
    private final Map zze = new LinkedHashMap();
    private final zzcb zzg = new zzcb(zzje.zza);
    private final zzjh zzh = zzjh.zzc();
    private final zzij zzi = new zzij(this);

    public zzja(zzek zzekVar, zzbi zzbiVar) {
        this.zzc = zzekVar;
        this.zzq = zzbiVar;
        zzek zzekVarZza = zzekVar.zza();
        zzekVarZza.zzc(zzekVar.zzd());
        this.zzj = zzekVarZza;
        int i = zzav.zza;
        this.zzk = C20519OooO0Oo.OooO0OO(zzis.zza);
        this.zzl = C20519OooO0Oo.OooO0OO(zzit.zza);
        this.zzm = C20519OooO0Oo.OooO0OO(zziu.zza);
        this.zzn = C20519OooO0Oo.OooO0OO(zziv.zza);
        this.zzo = C20519OooO0Oo.OooO0OO(zziw.zza);
    }

    private final Application zzD() {
        return (Application) this.zzo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzE(zzsc zzscVar, Continuation continuation) {
        zzim zzimVar;
        zzbd e;
        zzja zzjaVar;
        if (continuation instanceof zzim) {
            zzimVar = (zzim) continuation;
            int i = zzimVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzimVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzimVar = new zzim(this, continuation);
            }
        }
        Object objZzd = zzimVar.zza;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = zzimVar.zzc;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objZzd);
            try {
                zzff zzffVar = (zzff) this.zzn.getValue();
                zzek zzekVar = this.zzj;
                zzimVar.zzd = this;
                zzimVar.zzc = 1;
                objZzd = zzffVar.zzd(zzscVar, zzekVar, zzimVar);
                if (objZzd == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                zzjaVar = this;
            } catch (zzbd e2) {
                e = e2;
                zzjaVar = this;
                zzjaVar.zzA().OooO00o(e);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzjaVar = zzimVar.zzd;
            try {
                C32446OooOOOo.OooO0O0(objZzd);
            } catch (zzbd e3) {
                e = e3;
                zzjaVar.zzA().OooO00o(e);
            }
        }
        C33609OooO0oo.OooO0OO(zzjaVar.zzq.zzb(), null, null, new zzin(zzjaVar, (String) objZzd, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzF(String str, Continuation continuation) {
        zzio zzioVar;
        Exception exc;
        zzja zzjaVar;
        String str2;
        String str3;
        zzja zzjaVar2;
        zzen zzenVar;
        if (continuation instanceof zzio) {
            zzioVar = (zzio) continuation;
            int i = zzioVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzioVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzioVar = new zzio(this, continuation);
            }
        }
        Object obj = zzioVar.zza;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = zzioVar.zzc;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.zzp = this.zzj.zzf(26);
            try {
                String strZza = ((zzbr) this.zzl.getValue()).zza();
                zzioVar.zzd = this;
                zzioVar.zze = str;
                zzioVar.zzf = strZza;
                zzioVar.zzc = 1;
                Object objZzw = zzw(zzioVar);
                if (objZzw == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                str2 = str;
                str3 = strZza;
                obj = objZzw;
                zzjaVar2 = this;
                ((WebView) obj).loadDataWithBaseURL(str3, str2, "text/html", "utf-8", null);
            } catch (Exception e) {
                exc = e;
                zzjaVar = this;
                zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzU, exc.getMessage());
                zzenVar = zzjaVar.zzp;
                if (zzenVar != null) {
                }
                zzjaVar.zzp = null;
                zzjaVar.zzA().OooO00o(zzbdVar);
                return C32460OooOooO.f116667OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str4 = zzioVar.zzf;
            String str5 = zzioVar.zze;
            zzjaVar = zzioVar.zzd;
            try {
                C32446OooOOOo.OooO0O0(obj);
                str3 = str4;
                str2 = str5;
                zzjaVar2 = zzjaVar;
            } catch (Exception e2) {
                exc = e2;
                zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zzU, exc.getMessage());
                zzenVar = zzjaVar.zzp;
                if (zzenVar != null) {
                    zzenVar.zzb(zzbdVar2);
                }
                zzjaVar.zzp = null;
                zzjaVar.zzA().OooO00o(zzbdVar2);
                return C32460OooOooO.f116667OooO00o;
            }
            try {
                ((WebView) obj).loadDataWithBaseURL(str3, str2, "text/html", "utf-8", null);
            } catch (Exception e3) {
                zzjaVar = zzjaVar2;
                exc = e3;
                zzbd zzbdVar22 = new zzbd(zzbb.zzb, zzba.zzU, exc.getMessage());
                zzenVar = zzjaVar.zzp;
                if (zzenVar != null) {
                }
                zzjaVar.zzp = null;
                zzjaVar.zzA().OooO00o(zzbdVar22);
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzG(String str, Continuation continuation) {
        zzix zzixVar;
        zzja zzjaVar;
        zzja zzjaVar2;
        if (continuation instanceof zzix) {
            zzixVar = (zzix) continuation;
            int i = zzixVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzixVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzixVar = new zzix(this, continuation);
            }
        }
        Object objZzb = zzixVar.zza;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = zzixVar.zzc;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objZzb);
            zzcb zzcbVar = this.zzg;
            zzje[] zzjeVarArr = {zzje.zzd, zzje.zzc, zzje.zzb};
            zzixVar.zzd = this;
            zzixVar.zze = str;
            zzixVar.zzc = 1;
            objZzb = zzcbVar.zzb(zzjeVarArr, zzixVar);
            if (objZzb != enumC32485OooO00o) {
                zzjaVar = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = zzixVar.zze;
            zzjaVar2 = zzixVar.zzd;
            C32446OooOOOo.OooO0O0(objZzb);
            zzjaVar2.zza = C25150OooO00o.OooO0Oo();
            zzek zzekVar = zzjaVar2.zzj;
            zzekVar.zzc(str);
            C33609OooO0oo.OooO0OO(zzjaVar2.zzq.zza(), null, null, new zziz(zzjaVar2, zzekVar.zzf(42), null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
        str = zzixVar.zze;
        zzjaVar = zzixVar.zzd;
        C32446OooOOOo.OooO0O0(objZzb);
        if (((Boolean) objZzb).booleanValue()) {
            return C32460OooOooO.f116667OooO00o;
        }
        zzcb zzcbVar2 = zzjaVar.zzg;
        zzje zzjeVar = zzje.zzb;
        zzixVar.zzd = zzjaVar;
        zzixVar.zze = str;
        zzixVar.zzc = 2;
        if (zzcbVar2.zzc(zzjeVar, zzixVar) != enumC32485OooO00o) {
            zzjaVar2 = zzjaVar;
            zzjaVar2.zza = C25150OooO00o.OooO0Oo();
            zzek zzekVar2 = zzjaVar2.zzj;
            zzekVar2.zzc(str);
            C33609OooO0oo.OooO0OO(zzjaVar2.zzq.zza(), null, null, new zziz(zzjaVar2, zzekVar2.zzf(42), null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
        return enumC32485OooO00o;
    }

    public static final /* synthetic */ zzfk zzp(zzja zzjaVar) {
        return (zzfk) zzjaVar.zzm.getValue();
    }

    public final InterfaceC33622OooOo00 zzA() {
        InterfaceC33622OooOo00 interfaceC33622OooOo00 = this.zza;
        if (interfaceC33622OooOo00 != null) {
            return interfaceC33622OooOo00;
        }
        return null;
    }

    public final zzft zzC(zzsc zzscVar, zzcg zzcgVar, WebView webView) {
        zzfw zzfwVar = new zzfw(webView, this.zzq.zzb());
        zzhy zzhyVar = new zzhy();
        zzhyVar.zzb(OooOo.o0ooOOo(zzscVar.zzP()));
        zzgf zzgfVar = new zzgf(zzfwVar, zzcgVar, new zzbo());
        zzhz zzhzVar = new zzhz(zzhyVar, new zzhw());
        zzgfVar.zze(3, zzD());
        zzgfVar.zze(5, zzig.zza());
        zzgfVar.zze(6, new zzia(zzD()));
        zzgfVar.zze(7, new zzic());
        zzgfVar.zze(8, new zzii(zzD()));
        zzgfVar.zze(9, new zzid(zzD()));
        zzgfVar.zze(10, new zzib(zzD()));
        return new zzft(this.zzq.zzd(), zzgfVar, zzhzVar, zzfn.zza());
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final zzen zza(String str) {
        zzek zzekVar = this.zzc;
        zzekVar.zzc(str);
        return zzekVar.zzf(33);
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final zzen zzb() {
        zzek zzekVar = this.zzc;
        zzekVar.zzc(zzekVar.zzd());
        return zzekVar.zzf(32);
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzd(String str, Continuation continuation) {
        zzsh zzshVarZzf = zzsi.zzf();
        zzshVarZzf.zze(str);
        return zzshVarZzf.zzk();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7 A[Catch: Exception -> 0x004d, PHI: r2 r11
      0x00c7: PHI (r2v8 ??) = (r2v15 ??), (r2v16 ??) binds: [B:44:0x00c5, B:23:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x00c7: PHI (r11v11 java.lang.String) = (r11v10 java.lang.String), (r11v18 java.lang.String) binds: [B:44:0x00c5, B:23:0x0048] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x004d, blocks: (B:23:0x0048, B:45:0x00c7, B:43:0x00b7), top: B:56:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.google.android.recaptcha.internal.zzja] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.recaptcha.internal.zzja] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.google.android.recaptcha.internal.zzja] */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzf(String str, Continuation continuation) throws Throwable {
        zzip zzipVar;
        ?? r0;
        zzja zzjaVar;
        zzja zzjaVar2;
        zzja zzjaVar3;
        InterfaceC33622OooOo00 interfaceC33622OooOo00ZzA;
        if (continuation instanceof zzip) {
            zzipVar = (zzip) continuation;
            int i = zzipVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzipVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzipVar = new zzip(this, continuation);
            }
        }
        Object objZza = zzipVar.zza;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        ?? r2 = zzipVar.zzc;
        try {
            if (r2 == 0) {
                C32446OooOOOo.OooO0O0(objZza);
                zzcb zzcbVar = this.zzg;
                zzje zzjeVar = zzje.zzd;
                zzipVar.zzd = this;
                zzipVar.zze = str;
                zzipVar.zzc = 1;
                objZza = zzcbVar.zza(zzjeVar, zzipVar);
                if (objZza != enumC32485OooO00o) {
                    zzjaVar = this;
                }
                return enumC32485OooO00o;
            }
            if (r2 != 1) {
                if (r2 == 2) {
                    str = zzipVar.zze;
                    zzja zzjaVar4 = zzipVar.zzd;
                    C32446OooOOOo.OooO0O0(objZza);
                    zzjaVar2 = zzjaVar4;
                    zzjaVar3 = zzjaVar2;
                    if (!((Boolean) objZza).booleanValue()) {
                        zzipVar.zzd = zzjaVar2;
                        zzipVar.zze = str;
                        zzipVar.zzc = 3;
                        Object objZzG = zzjaVar2.zzG(str, zzipVar);
                        zzjaVar3 = zzjaVar2;
                        if (objZzG != enumC32485OooO00o) {
                        }
                        return enumC32485OooO00o;
                    }
                    interfaceC33622OooOo00ZzA = zzjaVar3.zzA();
                    zzipVar.zzd = zzjaVar3;
                    zzipVar.zze = str;
                    zzipVar.zzc = 4;
                    r2 = zzjaVar3;
                    if (interfaceC33622OooOo00ZzA.await(zzipVar) != enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                }
                if (r2 == 3) {
                    str = zzipVar.zze;
                    zzja zzjaVar5 = zzipVar.zzd;
                    C32446OooOOOo.OooO0O0(objZza);
                    zzjaVar3 = zzjaVar5;
                    interfaceC33622OooOo00ZzA = zzjaVar3.zzA();
                    zzipVar.zzd = zzjaVar3;
                    zzipVar.zze = str;
                    zzipVar.zzc = 4;
                    r2 = zzjaVar3;
                    if (interfaceC33622OooOo00ZzA.await(zzipVar) != enumC32485OooO00o) {
                        C33621OooOo0 c33621OooOo0OooO0Oo = C25150OooO00o.OooO0Oo();
                        r2.zze.put(str, c33621OooOo0OooO0Oo);
                        zztp zztpVarZzf = zztq.zzf();
                        zztpVarZzf.zze(str);
                        byte[] bArrZzd = ((zztq) zztpVarZzf.zzk()).zzd();
                        C33609OooO0oo.OooO0OO(r2.zzq.zzb(), null, null, new zziq(r2, zzkh.zzh().zzi(bArrZzd, 0, bArrZzd.length), null), 3);
                        zzipVar.zzd = r2;
                        zzipVar.zze = str;
                        zzipVar.zzc = 5;
                        objZza = c33621OooOo0OooO0Oo.OooOo00(zzipVar);
                        if (objZza != enumC32485OooO00o) {
                        }
                    }
                    return enumC32485OooO00o;
                }
                if (r2 != 4) {
                    if (r2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = zzipVar.zze;
                    r0 = zzipVar.zzd;
                    try {
                        C32446OooOOOo.OooO0O0(objZza);
                        r0 = r0;
                        zzsi zzsiVar = (zzsi) objZza;
                        zzsh zzshVarZzf = zzsi.zzf();
                        zzshVarZzf.zze(str);
                        zzsl zzslVarZzf = zzsm.zzf();
                        zzslVarZzf.zze(zzsiVar.zzl());
                        zzshVarZzf.zzq(zzslVarZzf);
                        zzsj zzsjVarZzf = zzsk.zzf();
                        zzsjVarZzf.zze(zzsiVar.zzj());
                        zzsjVarZzf.zzf(zzsiVar.zzM());
                        zzshVarZzf.zzr(zzsjVarZzf);
                        return zzshVarZzf.zzk();
                    } catch (Exception e) {
                        e = e;
                        zzbd zzbdVarZza = zzf.zza(e, new zzbd(zzbb.zzb, zzba.zzW, e.getMessage()));
                        InterfaceC33622OooOo00 interfaceC33622OooOo00 = (InterfaceC33622OooOo00) r0.zze.remove(str);
                        if (interfaceC33622OooOo00 != null) {
                            interfaceC33622OooOo00.OooO00o(zzbdVarZza);
                        }
                        return C32446OooOOOo.OooO00o(zzbdVarZza);
                    }
                }
                str = zzipVar.zze;
                zzja zzjaVar6 = zzipVar.zzd;
                C32446OooOOOo.OooO0O0(objZza);
                r2 = zzjaVar6;
                C33621OooOo0 c33621OooOo0OooO0Oo2 = C25150OooO00o.OooO0Oo();
                r2.zze.put(str, c33621OooOo0OooO0Oo2);
                zztp zztpVarZzf2 = zztq.zzf();
                zztpVarZzf2.zze(str);
                byte[] bArrZzd2 = ((zztq) zztpVarZzf2.zzk()).zzd();
                C33609OooO0oo.OooO0OO(r2.zzq.zzb(), null, null, new zziq(r2, zzkh.zzh().zzi(bArrZzd2, 0, bArrZzd2.length), null), 3);
                zzipVar.zzd = r2;
                zzipVar.zze = str;
                zzipVar.zzc = 5;
                objZza = c33621OooOo0OooO0Oo2.OooOo00(zzipVar);
                if (objZza != enumC32485OooO00o) {
                    r0 = r2;
                    zzsi zzsiVar2 = (zzsi) objZza;
                    zzsh zzshVarZzf2 = zzsi.zzf();
                    zzshVarZzf2.zze(str);
                    zzsl zzslVarZzf2 = zzsm.zzf();
                    zzslVarZzf2.zze(zzsiVar2.zzl());
                    zzshVarZzf2.zzq(zzslVarZzf2);
                    zzsj zzsjVarZzf2 = zzsk.zzf();
                    zzsjVarZzf2.zze(zzsiVar2.zzj());
                    zzsjVarZzf2.zzf(zzsiVar2.zzM());
                    zzshVarZzf2.zzr(zzsjVarZzf2);
                    return zzshVarZzf2.zzk();
                }
                return enumC32485OooO00o;
            }
            str = zzipVar.zze;
            zzja zzjaVar7 = zzipVar.zzd;
            C32446OooOOOo.OooO0O0(objZza);
            zzjaVar = zzjaVar7;
            if (((Boolean) objZza).booleanValue()) {
                return C32446OooOOOo.OooO00o(new zzbd(zzbb.zzb, zzba.zzav, null));
            }
            zzcb zzcbVar2 = zzjaVar.zzg;
            zzje zzjeVar2 = zzje.zzc;
            zzipVar.zzd = zzjaVar;
            zzipVar.zze = str;
            zzipVar.zzc = 2;
            objZza = zzcbVar2.zza(zzjeVar2, zzipVar);
            zzjaVar2 = zzjaVar;
            if (objZza != enumC32485OooO00o) {
                zzjaVar3 = zzjaVar2;
                if (!((Boolean) objZza).booleanValue()) {
                }
                interfaceC33622OooOo00ZzA = zzjaVar3.zzA();
                zzipVar.zzd = zzjaVar3;
                zzipVar.zze = str;
                zzipVar.zzc = 4;
                r2 = zzjaVar3;
                if (interfaceC33622OooOo00ZzA.await(zzipVar) != enumC32485OooO00o) {
                }
            }
            return enumC32485OooO00o;
        } catch (Exception e2) {
            e = e2;
            r0 = r2;
        }
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzg(zzbd zzbdVar, Continuation continuation) {
        if (OooOOO0.OooO0O0(zzbdVar.zza(), zzba.zzb)) {
            zzen zzenVar = this.zzp;
            if (zzenVar != null) {
                zzenVar.zzb(zzbdVar);
            }
            this.zzp = null;
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if (zzG(r6, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        if (r6.zzc(r7, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzh(zzsc zzscVar, Continuation continuation) {
        zzir zzirVar;
        if (continuation instanceof zzir) {
            zzirVar = (zzir) continuation;
            int i = zzirVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzirVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzirVar = new zzir(this, continuation);
            }
        }
        Object obj = zzirVar.zza;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = zzirVar.zzc;
        if (i2 != 0) {
            if (i2 == 1) {
                C32446OooOOOo.OooO0O0(obj);
                return C32446OooOOOo.OooO00o(new zzbd(zzbb.zzb, zzba.zzav, null));
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        if (zzscVar.zzT() && zzscVar.zzR() && zzscVar.zzQ()) {
            this.zzf = zzscVar;
            String strZzd = this.zzc.zzd();
            zzirVar.zzc = 2;
        } else {
            zzcb zzcbVar = this.zzg;
            zzje zzjeVar = zzje.zzd;
            zzirVar.zzc = 1;
        }
        return obj2;
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzi(String str, long j, Exception exc, Continuation continuation) {
        exc.getMessage();
        InterfaceC33622OooOo00 interfaceC33622OooOo00 = (InterfaceC33622OooOo00) this.zze.remove(str);
        if (interfaceC33622OooOo00 != null) {
            interfaceC33622OooOo00.OooO00o(exc);
        }
        return C32460OooOooO.f116667OooO00o;
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzj(Exception exc, Continuation continuation) {
        return ((exc instanceof o0000) && this.zzi.zza() == null) ? new zzbd(zzbb.zzc, zzba.zzH, null) : zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzV, exc.getMessage()));
    }

    public final zzcb zzm() {
        return this.zzg;
    }

    public final zzij zzq() {
        return this.zzi;
    }

    public final Object zzw(Continuation continuation) {
        return C33609OooO0oo.OooO0o(this.zzq.zzb().OooOOO0(), new zzjc((zzjd) this.zzk.getValue(), zzD(), null), continuation);
    }

    public final Object zzx(Continuation continuation) throws Throwable {
        Object objOooO0o = C33609OooO0oo.OooO0o(this.zzq.zzb().OooOOO0(), new zzil(this, null), continuation);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }
}
