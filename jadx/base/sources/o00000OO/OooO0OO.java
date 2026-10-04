package o00000OO;

import OooOo.C20496Oooo0o0;
import OooooOO.C21348Ooooo0o;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24240OooOOOO;
import o0000Ooo.C24241OooOOOo;
import o0000Ooo.InterfaceC24229OooO0OO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {
    public static final float OooO00o(long j, float f, InterfaceC24229OooO0OO interfaceC24229OooO0OO) {
        long jOooO0O0 = C24240OooOOOO.OooO0O0(j);
        if (C24241OooOOOo.OooO00o(jOooO0O0, 4294967296L)) {
            return interfaceC24229OooO0OO.o00Oo0(j);
        }
        if (C24241OooOOOo.OooO00o(jOooO0O0, 8589934592L)) {
            return C24240OooOOOO.OooO0OO(j) * f;
        }
        return Float.NaN;
    }

    public static final void OooO0O0(Spannable spannable, long j, int i, int i2) {
        if (j != C21348Ooooo0o.f61766OooO0oO) {
            OooO0Oo(spannable, new ForegroundColorSpan(C20496Oooo0o0.OooO0oo(j)), i, i2);
        }
    }

    public static final void OooO0OO(Spannable spannable, long j, InterfaceC24229OooO0OO density, int i, int i2) {
        OooOOO0.OooO0oO(density, "density");
        long jOooO0O0 = C24240OooOOOO.OooO0O0(j);
        if (C24241OooOOOo.OooO00o(jOooO0O0, 4294967296L)) {
            OooO0Oo(spannable, new AbsoluteSizeSpan(oO0O00O.OooO00o.OooO0O0(density.o00Oo0(j)), false), i, i2);
        } else if (C24241OooOOOo.OooO00o(jOooO0O0, 8589934592L)) {
            OooO0Oo(spannable, new RelativeSizeSpan(C24240OooOOOO.OooO0OO(j)), i, i2);
        }
    }

    public static final void OooO0Oo(Spannable spannable, Object span, int i, int i2) {
        OooOOO0.OooO0oO(spannable, "<this>");
        OooOOO0.OooO0oO(span, "span");
        spannable.setSpan(span, i, i2, 33);
    }
}
