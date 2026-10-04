package com.google.android.recaptcha.internal;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbq {
    public static final zzbq zza = new zzbq();

    private zzbq() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ad, code lost:
    
        if (oO0o0OO.C33644OoooO0.OooO00o(r7, r1) != r3) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ad -> B:13:0x003d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(InterfaceC32507OooOO0o interfaceC32507OooOO0o, long j, long j2, double d, InterfaceC32507OooOO0o interfaceC32507OooOO0o2, Continuation continuation) throws Exception {
        zzbp zzbpVar;
        long j3;
        long j4;
        double d2;
        InterfaceC32507OooOO0o interfaceC32507OooOO0o3;
        zzbp zzbpVar2;
        InterfaceC32507OooOO0o interfaceC32507OooOO0o4;
        InterfaceC32507OooOO0o interfaceC32507OooOO0o5;
        long j5;
        double d3;
        Exception e;
        if (continuation instanceof zzbp) {
            zzbpVar = (zzbp) continuation;
            int i = zzbpVar.zzh;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzbpVar.zzh = i - Integer.MIN_VALUE;
            } else {
                zzbpVar = new zzbp(this, continuation);
            }
        }
        Object obj = zzbpVar.zzf;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = zzbpVar.zzh;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            j3 = j;
            j4 = j2;
            d2 = d;
            interfaceC32507OooOO0o3 = interfaceC32507OooOO0o2;
            zzbpVar2 = zzbpVar;
            interfaceC32507OooOO0o4 = interfaceC32507OooOO0o;
            zzbpVar2.zza = interfaceC32507OooOO0o4;
            zzbpVar2.zzb = interfaceC32507OooOO0o3;
            zzbpVar2.zzc = j4;
            zzbpVar2.zze = d2;
            zzbpVar2.zzd = j3;
            zzbpVar2.zzh = 1;
            Object objInvoke = interfaceC32507OooOO0o3.invoke(zzbpVar2);
            if (objInvoke != enumC32485OooO00o) {
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j3 = zzbpVar.zzd;
                d3 = zzbpVar.zze;
                j5 = zzbpVar.zzc;
                interfaceC32507OooOO0o3 = (InterfaceC32507OooOO0o) zzbpVar.zzb;
                interfaceC32507OooOO0o5 = (InterfaceC32507OooOO0o) zzbpVar.zza;
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC32507OooOO0o interfaceC32507OooOO0o6 = interfaceC32507OooOO0o5;
                zzbpVar2 = zzbpVar;
                interfaceC32507OooOO0o4 = interfaceC32507OooOO0o6;
                long j6 = j5;
                d2 = d3;
                j4 = j6;
                try {
                } catch (Exception e2) {
                    e = e2;
                    zzbp zzbpVar3 = zzbpVar2;
                    interfaceC32507OooOO0o5 = interfaceC32507OooOO0o4;
                    zzbpVar = zzbpVar3;
                    double d4 = d2;
                    j5 = j4;
                    d3 = d4;
                    if (((Boolean) interfaceC32507OooOO0o5.invoke(e)).booleanValue()) {
                    }
                }
                zzbpVar2.zza = interfaceC32507OooOO0o4;
                zzbpVar2.zzb = interfaceC32507OooOO0o3;
                zzbpVar2.zzc = j4;
                zzbpVar2.zze = d2;
                zzbpVar2.zzd = j3;
                zzbpVar2.zzh = 1;
                Object objInvoke2 = interfaceC32507OooOO0o3.invoke(zzbpVar2);
                return objInvoke2 != enumC32485OooO00o ? enumC32485OooO00o : objInvoke2;
            }
            j3 = zzbpVar.zzd;
            d3 = zzbpVar.zze;
            j5 = zzbpVar.zzc;
            interfaceC32507OooOO0o3 = (InterfaceC32507OooOO0o) zzbpVar.zzb;
            interfaceC32507OooOO0o5 = (InterfaceC32507OooOO0o) zzbpVar.zza;
            try {
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            } catch (Exception e3) {
                e = e3;
                if (((Boolean) interfaceC32507OooOO0o5.invoke(e)).booleanValue()) {
                    throw e;
                }
                j3 = (long) (j3 * d3);
                if (j3 > j5) {
                    j3 = j5;
                }
                zzbpVar.zza = interfaceC32507OooOO0o5;
                zzbpVar.zzb = interfaceC32507OooOO0o3;
                zzbpVar.zzc = j5;
                zzbpVar.zze = d3;
                zzbpVar.zzd = j3;
                zzbpVar.zzh = 2;
            }
        }
    }
}
