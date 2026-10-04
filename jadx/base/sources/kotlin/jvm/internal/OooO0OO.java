package kotlin.jvm.internal;

import OooO0O0.C20394OooO0Oo;
import o00O0o0O.C24933OooO00o;
import oO00ooo.AbstractC32479OooO0OO;
import oO0OoOoO.C33290OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.o00Oo0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO {
    public static C24933OooO00o OooO00o(double d, double d2, double d3, double d4) {
        C24933OooO00o c24933OooO00o = new C24933OooO00o(d, d2);
        C24933OooO00o c24933OooO00o2 = new C24933OooO00o(d3, d4);
        if (c24933OooO00o.f84602OooOoO0 || c24933OooO00o2.f84602OooOoO0 || (d3 == 0.0d && d4 == 0.0d)) {
            return C24933OooO00o.f84597OooOoOO;
        }
        if (c24933OooO00o2.f84601OooOoO && !c24933OooO00o.f84601OooOoO) {
            return C24933OooO00o.f84598OooOoo0;
        }
        if (C33290OooO00o.OooO00o(d3) < C33290OooO00o.OooO00o(d4)) {
            double d5 = d3 / d4;
            double d6 = d4 + (d3 * d5);
            return new C24933OooO00o(OooO0O0.OooO0OO.OooO00o(d, d5, d2, d6), ((d2 * d5) - d) / d6);
        }
        double d7 = d4 / d3;
        double d8 = (d4 * d7) + d3;
        return new C24933OooO00o(OooO0O0.OooO0OO.OooO00o(d2, d7, d, d8), C20394OooO0Oo.OooO00o(d, d7, d2, d8));
    }

    public static final OooO0O0 OooO0O0(Object[] array) {
        OooOOO0.OooO0oO(array, "array");
        return new OooO0O0(array);
    }

    public static Object OooO0OO(oO0O000o.OooO00o oooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        return C33609OooO0oo.OooO0o(oOo0000O.OooO.f123416OooOo0o, new o00Oo0(oooO00o, null), abstractC32479OooO0OO);
    }
}
