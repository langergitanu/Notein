package com.google.android.recaptcha.internal;

import OooOoOO.C20519OooO0Oo;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33633Oooo0;

/* JADX INFO: loaded from: classes7.dex */
public final class zzfj {
    private final InterfaceC32440OooOO0 zza;

    public zzfj() {
        int i = zzav.zza;
        this.zza = C20519OooO0Oo.OooO0OO(zzfi.zza);
    }

    public static final /* synthetic */ zzex zza(zzfj zzfjVar) {
        return (zzex) zzfjVar.zza.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object zzc(zzfj zzfjVar, zzbr zzbrVar, zzsp zzspVar, Continuation continuation) {
        zzfg zzfgVar;
        if (continuation instanceof zzfg) {
            zzfgVar = (zzfg) continuation;
            int i = zzfgVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzfgVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzfgVar = new zzfg(zzfjVar, continuation);
            }
        }
        Object obj = zzfgVar.zza;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = zzfgVar.zzc;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        zzfh zzfhVar = new zzfh(zzfjVar, zzbrVar, zzspVar, null);
        zzfgVar.zzc = 1;
        Object objOooO0o0 = C33633Oooo0.OooO0o0(zzfhVar, zzfgVar);
        return objOooO0o0 == enumC32485OooO00o ? enumC32485OooO00o : objOooO0o0;
    }

    public final Object zzb(zzbr zzbrVar, zzsp zzspVar, Continuation continuation) {
        return zzc(this, zzbrVar, zzspVar, continuation);
    }
}
