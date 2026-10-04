package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes7.dex */
public final class zzfy extends zzfx {
    private final InterfaceC32508OooOOOo zza;
    private final String zzb;

    public zzfy(InterfaceC32508OooOOOo interfaceC32508OooOOOo, String str, Object obj) {
        super(obj);
        this.zza = interfaceC32508OooOOOo;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzfx
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        List arrayList;
        if (!OooOOO0.OooO0O0(method.getName(), this.zzb)) {
            return false;
        }
        zztf zztfVarZzf = zzti.zzf();
        if (objArr != null) {
            arrayList = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                zztg zztgVarZzf = zzth.zzf();
                zztgVarZzf.zzw(obj2.toString());
                arrayList.add((zzth) zztgVarZzf.zzk());
            }
        } else {
            arrayList = C34434OooOoO.f123453OooOo0o;
        }
        zztfVarZzf.zze(arrayList);
        zzti zztiVar = (zzti) zztfVarZzf.zzk();
        InterfaceC32508OooOOOo interfaceC32508OooOOOo = this.zza;
        byte[] bArrZzd = zztiVar.zzd();
        interfaceC32508OooOOOo.invoke(objArr, zzkh.zzh().zzi(bArrZzd, 0, bArrZzd.length));
        return true;
    }
}
