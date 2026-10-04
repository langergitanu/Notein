package com.google.android.recaptcha.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.OooOOOO;
import oOo000Oo.Oooo0;

/* JADX INFO: loaded from: classes7.dex */
final class zzat extends OooOOOO implements oO0O000o.OooO00o {
    public static final zzat zza = new zzat();

    public zzat() {
        super(0);
    }

    public static final Map zza() {
        Map map = zzav.zzc;
        LinkedHashMap linkedHashMap = new LinkedHashMap(Oooo0.OooO0Oo(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((zzaw) entry.getValue()).zzb());
        }
        return linkedHashMap;
    }

    @Override // oO0O000o.OooO00o
    public final /* bridge */ /* synthetic */ Object invoke() {
        return zza();
    }
}
