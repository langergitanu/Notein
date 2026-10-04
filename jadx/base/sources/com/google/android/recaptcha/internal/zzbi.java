package com.google.android.recaptcha.internal;

import java.util.concurrent.Executors;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33661OoooooO;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Ooo.C33822OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbi {
    private final InterfaceC33636Oooo00o zza = C33633Oooo0.OooO0O0();
    private final InterfaceC33636Oooo00o zzb;
    private final InterfaceC33636Oooo00o zzc;
    private final InterfaceC33636Oooo00o zzd;

    public zzbi() {
        C33822OooO0OO c33822OooO0OOOooO00o = C33633Oooo0.OooO00o(new C33661OoooooO(Executors.newSingleThreadExecutor()));
        C33609OooO0oo.OooO0OO(c33822OooO0OOOooO00o, null, null, new zzbh(null), 3);
        this.zzb = c33822OooO0OOOooO00o;
        this.zzc = C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0);
        C33822OooO0OO c33822OooO0OOOooO00o2 = C33633Oooo0.OooO00o(new C33661OoooooO(Executors.newSingleThreadExecutor()));
        C33609OooO0oo.OooO0OO(c33822OooO0OOOooO00o2, null, null, new zzbg(null), 3);
        this.zzd = c33822OooO0OOOooO00o2;
    }

    public final InterfaceC33636Oooo00o zza() {
        return this.zzc;
    }

    public final InterfaceC33636Oooo00o zzb() {
        return this.zza;
    }

    public final InterfaceC33636Oooo00o zzc() {
        return this.zzd;
    }

    public final InterfaceC33636Oooo00o zzd() {
        return this.zzb;
    }
}
