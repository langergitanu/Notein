package o0000Ooo;

import Oooo0.C20856OooooOo;
import o0000Ooo.C24227OooO00o;

/* JADX INFO: renamed from: o0000Ooo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24228OooO0O0 {
    public static final long OooO00o(int i, int i2, int i3, int i4) {
        if (i2 < i) {
            throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= than minWidth(" + i + ')').toString());
        }
        if (i4 >= i3) {
            if (i < 0 || i3 < 0) {
                throw new IllegalArgumentException(C20856OooooOo.OooO0O0("minWidth(", i, ") and minHeight(", ") must be >= 0", i3).toString());
            }
            return C24227OooO00o.C19607OooO00o.OooO0O0(i, i2, i3, i4);
        }
        throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= than minHeight(" + i3 + ')').toString());
    }

    public static /* synthetic */ long OooO0O0(int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i3 & 8) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return OooO00o(0, i, 0, i2);
    }

    public static final long OooO0OO(long j, long j2) {
        return C24239OooOOO0.OooO00o(oO0O00oo.OooOO0.OooO0o((int) (j2 >> 32), C24227OooO00o.OooOO0(j), C24227OooO00o.OooO0oo(j)), oO0O00oo.OooOO0.OooO0o((int) (j2 & 4294967295L), C24227OooO00o.OooO(j), C24227OooO00o.OooO0oO(j)));
    }

    public static final long OooO0Oo(long j, long j2) {
        return OooO00o(oO0O00oo.OooOO0.OooO0o(C24227OooO00o.OooOO0(j2), C24227OooO00o.OooOO0(j), C24227OooO00o.OooO0oo(j)), oO0O00oo.OooOO0.OooO0o(C24227OooO00o.OooO0oo(j2), C24227OooO00o.OooOO0(j), C24227OooO00o.OooO0oo(j)), oO0O00oo.OooOO0.OooO0o(C24227OooO00o.OooO(j2), C24227OooO00o.OooO(j), C24227OooO00o.OooO0oO(j)), oO0O00oo.OooOO0.OooO0o(C24227OooO00o.OooO0oO(j2), C24227OooO00o.OooO(j), C24227OooO00o.OooO0oO(j)));
    }

    public static final int OooO0o(int i, long j) {
        return oO0O00oo.OooOO0.OooO0o(i, C24227OooO00o.OooOO0(j), C24227OooO00o.OooO0oo(j));
    }

    public static final int OooO0o0(int i, long j) {
        return oO0O00oo.OooOO0.OooO0o(i, C24227OooO00o.OooO(j), C24227OooO00o.OooO0oO(j));
    }

    public static final long OooO0oO(int i, int i2, long j) {
        int iOooOO0 = C24227OooO00o.OooOO0(j) + i;
        if (iOooOO0 < 0) {
            iOooOO0 = 0;
        }
        int iOooO0oo = C24227OooO00o.OooO0oo(j);
        if (iOooO0oo != Integer.MAX_VALUE && (iOooO0oo = iOooO0oo + i) < 0) {
            iOooO0oo = 0;
        }
        int iOooO = C24227OooO00o.OooO(j) + i2;
        if (iOooO < 0) {
            iOooO = 0;
        }
        int iOooO0oO = C24227OooO00o.OooO0oO(j);
        return OooO00o(iOooOO0, iOooO0oo, iOooO, (iOooO0oO == Integer.MAX_VALUE || (iOooO0oO = iOooO0oO + i2) >= 0) ? iOooO0oO : 0);
    }
}
