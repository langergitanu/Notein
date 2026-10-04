package oO0O00oo;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import kotlin.jvm.internal.OooOOO0;
import o00000oO.C24121OooO00o;
import o00oO0O.o0OoOo0;

/* JADX INFO: loaded from: classes10.dex */
public class OooOO0 extends C24121OooO00o {
    public static OooO OooO(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new OooO(i, i2 - 1, 1);
        }
        OooO oooO = OooO.f116803OooOoO;
        return OooO.f116803OooOoO;
    }

    public static int OooO0OO(int i) {
        if (i < 16) {
            return 16;
        }
        return i;
    }

    public static double OooO0Oo(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + FilenameUtils.EXTENSION_SEPARATOR);
    }

    public static int OooO0o(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + FilenameUtils.EXTENSION_SEPARATOR);
    }

    public static float OooO0o0(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + FilenameUtils.EXTENSION_SEPARATOR);
    }

    public static long OooO0oO(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        StringBuilder sbOooO00o = o0OoOo0.OooO00o(j3, "Cannot coerce value to an empty range: maximum ", " is less than minimum ");
        sbOooO00o.append(j2);
        sbOooO00o.append(FilenameUtils.EXTENSION_SEPARATOR);
        throw new IllegalArgumentException(sbOooO00o.toString());
    }

    public static C32519OooO0oO OooO0oo(OooO oooO, int i) {
        OooOOO0.OooO0oO(oooO, "<this>");
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (z) {
            if (oooO.f116813OooOoO0 <= 0) {
                i = -i;
            }
            return new C32519OooO0oO(oooO.f116812OooOo0o, oooO.f116811OooOo, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + FilenameUtils.EXTENSION_SEPARATOR);
    }
}
