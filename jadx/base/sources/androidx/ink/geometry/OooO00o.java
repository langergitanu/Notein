package androidx.ink.geometry;

import OooOoO.C20509OooO0oo;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO00o {

    /* JADX INFO: renamed from: androidx.ink.geometry.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19026OooO00o {
        public static boolean OooO00o(OooO00o oooO00o, OooO00o second) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(second, "second");
            return oooO00o.OooO00o() == second.OooO00o() && oooO00o.OooO0OO() == second.OooO0OO() && oooO00o.OooO0o0() == second.OooO0o0() && oooO00o.OooO0O0() == second.OooO0O0() && oooO00o.OooO0Oo() == second.OooO0Oo() && oooO00o.OooO0o() == second.OooO0o();
        }

        public static String OooO0O0(OooO00o oooO00o) {
            float fOooO00o = oooO00o.OooO00o();
            float fOooO0OO = oooO00o.OooO0OO();
            float fOooO0o0 = oooO00o.OooO0o0();
            float fOooO0O0 = oooO00o.OooO0O0();
            float fOooO0Oo = oooO00o.OooO0Oo();
            float fOooO0o = oooO00o.OooO0o();
            StringBuilder sbOooO0Oo = C20509OooO0oo.OooO0Oo("AffineTransform(m00=", fOooO00o, ", m10=", fOooO0OO, ", m20=");
            sbOooO0Oo.append(fOooO0o0);
            sbOooO0Oo.append(", m01=");
            sbOooO0Oo.append(fOooO0O0);
            sbOooO0Oo.append(", m11=");
            sbOooO0Oo.append(fOooO0Oo);
            sbOooO0Oo.append(", m21=");
            sbOooO0Oo.append(fOooO0o);
            sbOooO0Oo.append(")");
            return sbOooO0Oo.toString();
        }
    }

    static {
        new C21957OooO0oO();
    }

    public abstract float OooO00o();

    public abstract float OooO0O0();

    public abstract float OooO0OO();

    public abstract float OooO0Oo();

    public abstract float OooO0o();

    public abstract float OooO0o0();
}
