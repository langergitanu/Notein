package com.google.android.recaptcha.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0oOo.C33900OooO0o0;
import oO0o0oOo.InterfaceC33895OooO00o;
import oOo000Oo.OooOOO;

/* JADX INFO: loaded from: classes7.dex */
public final class zzcb {
    private Object zza;
    private final InterfaceC33895OooO00o zzb = C33900OooO0o0.OooO00o();

    public zzcb(Object obj) {
        this.zza = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(Object obj, Continuation continuation) {
        zzby zzbyVar;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        zzcb zzcbVar;
        if (continuation instanceof zzby) {
            zzbyVar = (zzby) continuation;
            int i = zzbyVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzbyVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzbyVar = new zzby(this, continuation);
            }
        }
        Object obj2 = zzbyVar.zzb;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = zzbyVar.zzd;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            interfaceC33895OooO00o = this.zzb;
            zzbyVar.zze = this;
            zzbyVar.zzf = (zzje) obj;
            zzbyVar.zza = interfaceC33895OooO00o;
            zzbyVar.zzd = 1;
            if (interfaceC33895OooO00o.OooO00o(zzbyVar) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            zzcbVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC33895OooO00o interfaceC33895OooO00o2 = (InterfaceC33895OooO00o) zzbyVar.zza;
            zzje zzjeVar = zzbyVar.zzf;
            zzcbVar = zzbyVar.zze;
            C32446OooOOOo.OooO0O0(obj2);
            interfaceC33895OooO00o = interfaceC33895OooO00o2;
            obj = zzjeVar;
        }
        try {
            return Boolean.valueOf(OooOOO0.OooO0O0(zzcbVar.zza, obj));
        } finally {
            interfaceC33895OooO00o.OooOOO0(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb(Object[] objArr, Continuation continuation) {
        zzbz zzbzVar;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        zzcb zzcbVar;
        if (continuation instanceof zzbz) {
            zzbzVar = (zzbz) continuation;
            int i = zzbzVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzbzVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzbzVar = new zzbz(this, continuation);
            }
        }
        Object obj = zzbzVar.zzb;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = zzbzVar.zzd;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33895OooO00o = this.zzb;
            zzbzVar.zze = this;
            zzbzVar.zzf = (zzje[]) objArr;
            zzbzVar.zza = interfaceC33895OooO00o;
            zzbzVar.zzd = 1;
            if (interfaceC33895OooO00o.OooO00o(zzbzVar) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            zzcbVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC33895OooO00o interfaceC33895OooO00o2 = (InterfaceC33895OooO00o) zzbzVar.zza;
            zzje[] zzjeVarArr = zzbzVar.zzf;
            zzcbVar = zzbzVar.zze;
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33895OooO00o = interfaceC33895OooO00o2;
            objArr = zzjeVarArr;
        }
        try {
            return Boolean.valueOf(OooOOO.OooOoO0(objArr, zzcbVar.zza));
        } finally {
            interfaceC33895OooO00o.OooOOO0(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(Object obj, Continuation continuation) {
        zzca zzcaVar;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        zzcb zzcbVar;
        if (continuation instanceof zzca) {
            zzcaVar = (zzca) continuation;
            int i = zzcaVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzcaVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzcaVar = new zzca(this, continuation);
            }
        }
        Object obj2 = zzcaVar.zzb;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = zzcaVar.zzd;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            interfaceC33895OooO00o = this.zzb;
            zzcaVar.zze = this;
            zzcaVar.zzf = (zzje) obj;
            zzcaVar.zza = interfaceC33895OooO00o;
            zzcaVar.zzd = 1;
            if (interfaceC33895OooO00o.OooO00o(zzcaVar) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            zzcbVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC33895OooO00o interfaceC33895OooO00o2 = (InterfaceC33895OooO00o) zzcaVar.zza;
            zzje zzjeVar = zzcaVar.zzf;
            zzcbVar = zzcaVar.zze;
            C32446OooOOOo.OooO0O0(obj2);
            interfaceC33895OooO00o = interfaceC33895OooO00o2;
            obj = zzjeVar;
        }
        try {
            zzcbVar.zza = obj;
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            interfaceC33895OooO00o.OooOOO0(null);
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            interfaceC33895OooO00o.OooOOO0(null);
            throw th;
        }
    }
}
