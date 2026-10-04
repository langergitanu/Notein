package com.android.billingclient.api;

import com.google.android.datatransport.Transformer;
import com.google.android.gms.internal.play_billing.zzji;
import io.ktor.network.util.C23946OooO0Oo;
import java.util.Set;
import o0000Ooo.C24240OooOOOO;
import o0000Ooo.C24241OooOOOo;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34449Oooo0oo;

/* JADX INFO: renamed from: com.android.billingclient.api.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22189OoooO0 implements Transformer {
    public static io.ktor.network.util.OooO0OO OooO00o(InterfaceC33636Oooo00o interfaceC33636Oooo00o, String str, long j, InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC33636Oooo00o, "<this>");
        C23946OooO0Oo clock = C23946OooO0Oo.f80489OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(clock, "clock");
        return new io.ktor.network.util.OooO0OO(str, j, clock, interfaceC33636Oooo00o, interfaceC32507OooOO0o);
    }

    public static final long OooO0O0(double d) {
        return OooO0o0((float) d, 4294967296L);
    }

    public static final long OooO0OO(int i) {
        return OooO0o0(i, 4294967296L);
    }

    public static final boolean OooO0Oo(long j) {
        C24241OooOOOo[] c24241OooOOOoArr = C24240OooOOOO.f81496OooO00o;
        return (j & 1095216660480L) == 0;
    }

    public static final Object OooO0o(Set set, Enum r2, Enum r3, Enum r4, boolean z) {
        if (!z) {
            if (r4 != null) {
                set = oOo000Oo.OooOo.o0OO00O(C34449Oooo0oo.OooO(set, r4));
            }
            return oOo000Oo.OooOo.Ooooooo(set);
        }
        Enum r1 = set.contains(r2) ? r2 : set.contains(r3) ? r3 : null;
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(r1, r2) && kotlin.jvm.internal.OooOOO0.OooO0O0(r4, r3)) {
            return null;
        }
        return r4 == null ? r1 : r4;
    }

    public static final long OooO0o0(float f, long j) {
        long jFloatToIntBits = j | (((long) Float.floatToIntBits(f)) & 4294967295L);
        C24241OooOOOo[] c24241OooOOOoArr = C24240OooOOOO.f81496OooO00o;
        return jFloatToIntBits;
    }

    @Override // com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        return ((zzji) obj).zzM();
    }
}
