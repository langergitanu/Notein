package com.google.android.recaptcha.internal;

import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import oO00ooO.C32443OooOOO;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: loaded from: classes7.dex */
public final class zzjb {
    public static final Map zza() {
        LinkedHashMap linkedHashMapOooO = C34444Oooo0O0.OooO(new C32443OooOOO(-4, zzba.zzo), new C32443OooOOO(-12, zzba.zzp), new C32443OooOOO(-6, zzba.zzk), new C32443OooOOO(-11, zzba.zzm), new C32443OooOOO(-13, zzba.zzq), new C32443OooOOO(-14, zzba.zzr), new C32443OooOOO(-2, zzba.zzl), new C32443OooOOO(-7, zzba.zzs), new C32443OooOOO(-5, zzba.zzt), new C32443OooOOO(-9, zzba.zzu), new C32443OooOOO(-8, zzba.zzE), new C32443OooOOO(-15, zzba.zzn), new C32443OooOOO(-1, zzba.zzv), new C32443OooOOO(-3, zzba.zzx), new C32443OooOOO(-10, zzba.zzy));
        int i = Build.VERSION.SDK_INT;
        linkedHashMapOooO.put(-16, zzba.zzw);
        if (i >= 27) {
            linkedHashMapOooO.put(1, zzba.zzA);
            linkedHashMapOooO.put(2, zzba.zzB);
            linkedHashMapOooO.put(0, zzba.zzC);
            linkedHashMapOooO.put(3, zzba.zzD);
        }
        if (i >= 29) {
            linkedHashMapOooO.put(4, zzba.zzz);
        }
        return linkedHashMapOooO;
    }
}
