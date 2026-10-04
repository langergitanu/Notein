package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes7.dex */
public final class zzga extends zzfx {
    private final zzfz zza;
    private final String zzb;

    public zzga(zzfz zzfzVar, String str, Object obj) {
        super(obj);
        this.zza = zzfzVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzfx
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        if (!OooOOO0.OooO0O0(method.getName(), this.zzb)) {
            return false;
        }
        this.zza.zzb(objArr != null ? Oooo.OooO0OO.OooO0Oo(objArr) : C34434OooOoO.f123453OooOo0o);
        return true;
    }
}
