package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24018OooO0oo;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33633Oooo0;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes7.dex */
public final class zzl {
    private final List zza;
    private zzek zzb;

    /* JADX WARN: Multi-variable type inference failed */
    public zzl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void zzh(zze... zzeVarArr) {
        C34431OooOo0.OooOo(this.zza, zzeVarArr);
    }

    public final Object zzb(String str, long j, Continuation continuation) {
        return C33633Oooo0.OooO0o0(new zzh(this, str, j, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(long j, zzsc zzscVar, zzek zzekVar, Continuation continuation) {
        zzi zziVar;
        if (continuation instanceof zzi) {
            zziVar = (zzi) continuation;
            int i = zziVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zziVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zziVar = new zzi(this, continuation);
            }
        }
        Object objOooO0o0 = zziVar.zza;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = zziVar.zzc;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o0);
            zzk zzkVar = new zzk(this, zzekVar, j, zzscVar, null);
            zziVar.zzc = 1;
            objOooO0o0 = C33633Oooo0.OooO0o0(zzkVar, zziVar);
            if (objOooO0o0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o0);
        }
        return ((C32445OooOOOO) objOooO0o0).f116639OooOo0o;
    }

    public final List zzd() {
        return this.zza;
    }

    public final void zzf(zze... zzeVarArr) {
        zzh((zze[]) Arrays.copyOf(zzeVarArr, 1));
    }

    public final void zzg(zzsr zzsrVar) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zze) it.next()).zzk(zzsrVar);
        }
    }

    public /* synthetic */ zzl(List list, int i, C24018OooO0oo c24018OooO0oo) {
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        this.zza = new ArrayList();
        zze[] zzeVarArr = (zze[]) c34434OooOoO.toArray(new zze[0]);
        zzh((zze[]) Arrays.copyOf(zzeVarArr, zzeVarArr.length));
    }
}
