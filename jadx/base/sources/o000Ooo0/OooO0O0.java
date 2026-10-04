package o000Ooo0;

import OooO0Oo.C20398OooO0O0;
import Oooo0.C20855OooooOO;
import Oooo0oO.C21023OooO0Oo;
import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.aspose.slides.internal.p332p7.OooO0o;
import java.util.Arrays;
import java.util.Locale;
import o000o0o.C24611OooO00o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f83120OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f83121OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final double[] f83122OooO0OO;

    public OooO0O0(int i, int i2) {
        this.f83120OooO00o = i;
        this.f83121OooO0O0 = i2;
        this.f83122OooO0OO = new double[i * i2];
    }

    public static void OooO0oO(OooO0O0 oooO0O0) {
        Arrays.fill(oooO0O0.f83122OooO0OO, 0.0d);
        int i = oooO0O0.f83120OooO00o;
        int i2 = oooO0O0.f83121OooO0O0;
        if (i >= i2) {
            i = i2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            oooO0O0.OooO0o(1.0d, i3, i3);
        }
    }

    public final void OooO00o(OooO0O0 oooO0O0, OooO0O0 oooO0O02) {
        int i = oooO0O02.f83120OooO00o;
        int i2 = this.f83120OooO00o;
        if (i2 == i) {
            int i3 = oooO0O0.f83120OooO00o;
            int i4 = this.f83121OooO0O0;
            if (i4 == i3) {
                int i5 = oooO0O02.f83121OooO0O0;
                int i6 = oooO0O0.f83121OooO0O0;
                if (i6 == i5) {
                    for (int i7 = 0; i7 < i2; i7++) {
                        for (int i8 = 0; i8 < i6; i8++) {
                            double dOooO0OO = 0.0d;
                            for (int i9 = 0; i9 < i4; i9++) {
                                dOooO0OO += oooO0O0.OooO0OO(i9, i8) * OooO0OO(i7, i9);
                            }
                            oooO0O02.OooO0o(dOooO0OO, i7, i8);
                        }
                    }
                    return;
                }
            }
        }
        Locale locale = Locale.ROOT;
        String strOooO0oo = OooO0oo();
        String strOooO0oo2 = oooO0O0.OooO0oo();
        String strOooO0oo3 = oooO0O02.OooO0oo();
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("The matrices dimensions are not conformant for a dot matrix operation. this:", strOooO0oo, " that:", strOooO0oo2, " result:");
        sbOooO0O0.append(strOooO0oo3);
        throw new IllegalArgumentException(sbOooO0O0.toString());
    }

    public final void OooO0O0(OooO0O0 oooO0O0, OooO0O0 oooO0O02) {
        int i = oooO0O02.f83120OooO00o;
        int i2 = this.f83120OooO00o;
        if (i2 == i) {
            int i3 = oooO0O0.f83121OooO0O0;
            int i4 = this.f83121OooO0O0;
            if (i4 == i3) {
                int i5 = oooO0O02.f83121OooO0O0;
                int i6 = oooO0O0.f83120OooO00o;
                if (i6 == i5) {
                    for (int i7 = 0; i7 < i2; i7++) {
                        for (int i8 = 0; i8 < i6; i8++) {
                            double dOooO0OO = 0.0d;
                            for (int i9 = 0; i9 < i4; i9++) {
                                dOooO0OO += oooO0O0.OooO0OO(i8, i9) * OooO0OO(i7, i9);
                            }
                            oooO0O02.OooO0o(dOooO0OO, i7, i8);
                        }
                    }
                    return;
                }
            }
        }
        Locale locale = Locale.ROOT;
        String strOooO0oo = OooO0oo();
        String strOooO0oo2 = oooO0O0.OooO0oo();
        String strOooO0oo3 = oooO0O02.OooO0oo();
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("The matrices dimensions are not conformant for a transpose operation. this:", strOooO0oo, " that:", strOooO0oo2, " result:");
        sbOooO0O0.append(strOooO0oo3);
        throw new IllegalArgumentException(sbOooO0O0.toString());
    }

    public final double OooO0OO(int i, int i2) {
        int i3;
        if (i >= 0 && i < this.f83120OooO00o && i2 >= 0 && i2 < (i3 = this.f83121OooO0O0)) {
            return this.f83122OooO0OO[(i * i3) + i2];
        }
        Locale locale = Locale.ROOT;
        String strOooO0oo = OooO0oo();
        StringBuilder sbOooO0O0 = C20398OooO0O0.OooO0O0("Invalid matrix index value. i:", i, " j:", " not available in ", i2);
        sbOooO0O0.append(strOooO0oo);
        throw new IndexOutOfBoundsException(sbOooO0O0.toString());
    }

    public final void OooO0Oo(OooO0O0 oooO0O0) {
        if (this.f83120OooO00o != oooO0O0.f83120OooO00o || this.f83121OooO0O0 != oooO0O0.f83121OooO0O0) {
            Locale locale = Locale.ROOT;
            throw new IllegalArgumentException(C22237OooO0o0.OooO00o("The matrix dimensions are not the same. this:", OooO0oo(), " that:", oooO0O0.OooO0oo()));
        }
        int i = 0;
        while (true) {
            double[] dArr = this.f83122OooO0OO;
            if (i >= dArr.length) {
                return;
            }
            dArr[i] = dArr[i] - oooO0O0.f83122OooO0OO[i];
            i++;
        }
    }

    public final void OooO0o(double d, int i, int i2) {
        int i3;
        if (i >= 0 && i < this.f83120OooO00o && i2 >= 0 && i2 < (i3 = this.f83121OooO0O0)) {
            this.f83122OooO0OO[(i * i3) + i2] = d;
            return;
        }
        Locale locale = Locale.ROOT;
        String strOooO0oo = OooO0oo();
        StringBuilder sbOooO0O0 = C20398OooO0O0.OooO0O0("Invalid matrix index value. i:", i, " j:", " not available in ", i2);
        sbOooO0O0.append(strOooO0oo);
        throw new IndexOutOfBoundsException(sbOooO0O0.toString());
    }

    public final void OooO0o0(OooO0O0 oooO0O0) {
        if (this.f83120OooO00o != oooO0O0.f83120OooO00o || this.f83121OooO0O0 != oooO0O0.f83121OooO0O0) {
            Locale locale = Locale.ROOT;
            throw new IllegalArgumentException(C22237OooO0o0.OooO00o("The matrix dimensions are not the same. this:", OooO0oo(), " that:", oooO0O0.OooO0oo()));
        }
        int i = 0;
        while (true) {
            double[] dArr = this.f83122OooO0OO;
            if (i >= dArr.length) {
                return;
            }
            dArr[i] = dArr[i] + oooO0O0.f83122OooO0OO[i];
            i++;
        }
    }

    public final String OooO0oo() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f83120OooO00o);
        sb.append("x");
        return C21023OooO0Oo.OooO0OO(")", this.f83121OooO0O0, sb);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO0O0)) {
            return false;
        }
        OooO0O0 oooO0O0 = (OooO0O0) obj;
        if (this.f83120OooO00o != oooO0O0.f83120OooO00o || this.f83121OooO0O0 != oooO0O0.f83121OooO0O0) {
            return false;
        }
        int i = 0;
        while (true) {
            double[] dArr = this.f83122OooO0OO;
            if (i >= dArr.length) {
                return true;
            }
            if (dArr[i] != oooO0O0.f83122OooO0OO[i]) {
                return false;
            }
            i++;
        }
    }

    public final int hashCode() {
        int iHashCode = (this.f83120OooO00o * 101) + this.f83121OooO0O0;
        for (double d : this.f83122OooO0OO) {
            iHashCode = (iHashCode * 37) + Double.hashCode(d);
        }
        return iHashCode;
    }

    public final String toString() {
        int i = this.f83120OooO00o;
        int i2 = this.f83121OooO0O0;
        StringBuilder sb = new StringBuilder(i * i2 * 8);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        sb.append(" [");
        int i3 = 0;
        while (true) {
            double[] dArr = this.f83122OooO0OO;
            if (i3 >= dArr.length) {
                sb.append("]");
                return sb.toString();
            }
            if (i3 > 0) {
                sb.append(i3 % i2 == 0 ? "; " : ", ");
            }
            sb.append(dArr[i3]);
            i3++;
        }
    }

    public OooO0O0(int i, double[] dArr) {
        int iOooO00o = C24611OooO00o.OooO00o(dArr.length, i, 1, i);
        this.f83120OooO00o = iOooO00o;
        this.f83121OooO0O0 = i;
        this.f83122OooO0OO = dArr;
        if (dArr.length == iOooO00o * i) {
            return;
        }
        Locale locale = Locale.ROOT;
        throw new IllegalArgumentException(C20855OooooOO.OooO0OO(dArr.length, i & iOooO00o, "Invalid number of elements in 'values' Expected:", " Actual:"));
    }
}
