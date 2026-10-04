package com.google.android.recaptcha.internal;

import OooOoOO.C20519OooO0Oo;
import com.google.android.recaptcha.RecaptchaException;
import kotlin.coroutines.Continuation;
import oO00ooO.InterfaceC32440OooOO0;
import oO0o0O0o.C33595OooOOo;
import oO0o0OO.C33633Oooo0;

/* JADX INFO: loaded from: classes7.dex */
public final class zzff {
    private final InterfaceC32440OooOO0 zza;
    private final InterfaceC32440OooOO0 zzb;
    private final InterfaceC32440OooOO0 zzc;

    public zzff() {
        int i = zzav.zza;
        this.zza = C20519OooO0Oo.OooO0OO(zzfc.zza);
        this.zzb = C20519OooO0Oo.OooO0OO(zzfd.zza);
        this.zzc = C20519OooO0Oo.OooO0OO(zzfe.zza);
    }

    public static final /* synthetic */ zzfk zzb(zzff zzffVar) {
        return (zzfk) zzffVar.zza.getValue();
    }

    public static /* synthetic */ Object zze(zzff zzffVar, zzsc zzscVar, zzek zzekVar, Continuation continuation) throws Exception {
        String strZza;
        try {
            String strZzl = zzscVar.zzl();
            String strZzM = zzscVar.zzM();
            zzaq zzaqVarZzf = zzffVar.zzf();
            String strZzb = null;
            if (zzaqVarZzf != null && zzaqVarZzf.zzd(strZzM)) {
                zzen zzenVarZzf = zzekVar.zzf(25);
                try {
                    strZza = zzffVar.zzf().zza(strZzM);
                } catch (Exception e) {
                    zzenVarZzf.zzb(new zzbd(zzbb.zzk, zzba.zzR, e.getMessage()));
                }
                if (strZza != null) {
                    zzenVarZzf.zza();
                    strZzb = strZza;
                } else {
                    zzenVarZzf.zzb(new zzbd(zzbb.zzk, zzba.zzS, null));
                }
            }
            if (strZzb == null) {
                zzaq zzaqVarZzf2 = zzffVar.zzf();
                if (zzaqVarZzf2 != null) {
                    zzaqVarZzf2.zzb();
                }
                zzen zzenVarZzf2 = zzekVar.zzf(23);
                try {
                    strZzb = zzffVar.zzg().zzb(strZzl);
                    zzenVarZzf2.zza();
                    zzen zzenVarZzf3 = zzekVar.zzf(24);
                    try {
                        zzaq zzaqVarZzf3 = zzffVar.zzf();
                        if (zzaqVarZzf3 != null) {
                            zzaqVarZzf3.zzc(strZzM, strZzb);
                        }
                        zzenVarZzf3.zza();
                    } catch (Exception e2) {
                        zzenVarZzf3.zzb(new zzbd(zzbb.zzk, zzba.zzT, e2.getMessage()));
                    }
                } catch (zzbd e3) {
                    zzenVarZzf2.zzb(e3);
                    throw e3;
                }
            }
            return C33595OooOOo.OooOo0O(zzscVar.zzk(), "JAVASCRIPT_TAG", strZzb);
        } catch (Exception e4) {
            if (e4 instanceof zzbd) {
                throw e4;
            }
            throw new zzbd(zzbb.zzb, zzba.zzL, e4.getMessage());
        }
    }

    private final zzaq zzf() {
        return (zzaq) this.zzb.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzey zzg() {
        return (zzey) this.zzc.getValue();
    }

    public final Object zzc(String str, zzto zztoVar, Continuation continuation) throws RecaptchaException {
        return C33633Oooo0.OooO0o0(new zzfb(this, str, zztoVar, null), continuation);
    }

    public final Object zzd(zzsc zzscVar, zzek zzekVar, Continuation continuation) throws zzbd {
        return zze(this, zzscVar, zzekVar, continuation);
    }
}
