package o0000O00;

import com.aspose.slides.o000oOoO;
import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class OooO0OO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO0OO f81368OooO0O0 = new OooO0OO();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final String[] f81369OooO0OO = {"standard", "accelerate", "decelerate", "linear"};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f81370OooO00o = "identity";

    public static class OooO00o extends OooO0OO {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final double f81371OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final double f81372OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final double f81373OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final double f81374OooO0oO;

        public OooO00o(String str) {
            this.f81370OooO00o = str;
            int iIndexOf = str.indexOf(40);
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            this.f81371OooO0Oo = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
            int i = iIndexOf2 + 1;
            int iIndexOf3 = str.indexOf(44, i);
            this.f81373OooO0o0 = Double.parseDouble(str.substring(i, iIndexOf3).trim());
            int i2 = iIndexOf3 + 1;
            int iIndexOf4 = str.indexOf(44, i2);
            this.f81372OooO0o = Double.parseDouble(str.substring(i2, iIndexOf4).trim());
            int i3 = iIndexOf4 + 1;
            this.f81374OooO0oO = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
        }

        @Override // o0000O00.OooO0OO
        public final double OooO00o(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > 0.01d) {
                d2 *= 0.5d;
                d3 = OooO0OO(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double dOooO0OO = OooO0OO(d4);
            double d5 = d3 + d2;
            double dOooO0OO2 = OooO0OO(d5);
            double dOooO0Oo = OooO0Oo(d4);
            return (((d - dOooO0OO) * (OooO0Oo(d5) - dOooO0Oo)) / (dOooO0OO2 - dOooO0OO)) + dOooO0Oo;
        }

        public final double OooO0OO(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            double d4 = d * d * d;
            return o000oOoO.OooO00o(this.f81372OooO0o, d3 * d * d, this.f81371OooO0Oo * d2 * d3 * d, d4);
        }

        public final double OooO0Oo(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            double d4 = d * d * d;
            return o000oOoO.OooO00o(this.f81374OooO0oO, d3 * d * d, this.f81373OooO0o0 * d2 * d3 * d, d4);
        }
    }

    public static OooO0OO OooO0O0(String str) {
        char c = 0;
        char c2 = 2;
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new OooO00o(str);
        }
        if (str.startsWith("spline")) {
            C24144OooOO0o c24144OooOO0o = new C24144OooOO0o();
            c24144OooOO0o.f81370OooO00o = str;
            double[] dArr = new double[str.length() / 2];
            int iIndexOf = str.indexOf(40) + 1;
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            int i = 0;
            while (iIndexOf2 != -1) {
                dArr[i] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
                iIndexOf = iIndexOf2 + 1;
                iIndexOf2 = str.indexOf(44, iIndexOf);
                i++;
            }
            dArr[i] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
            double[] dArrCopyOf = Arrays.copyOf(dArr, i + 1);
            int length = (dArrCopyOf.length * 3) - 2;
            int length2 = dArrCopyOf.length - 1;
            double d = 1.0d / ((double) length2);
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
            double[] dArr3 = new double[length];
            int i2 = 0;
            while (i2 < dArrCopyOf.length) {
                double d2 = dArrCopyOf[i2];
                int i3 = i2 + length2;
                dArr2[i3][c] = d2;
                char c3 = c;
                char c4 = c2;
                double d3 = ((double) i2) * d;
                dArr3[i3] = d3;
                if (i2 > 0) {
                    int i4 = (length2 * 2) + i2;
                    dArr2[i4][c3] = d2 + 1.0d;
                    dArr3[i4] = d3 + 1.0d;
                    int i5 = i2 - 1;
                    dArr2[i5][c3] = (d2 - 1.0d) - d;
                    dArr3[i5] = (d3 - 1.0d) - d;
                }
                i2++;
                c = c3;
                c2 = c4;
            }
            C24143OooO0oo c24143OooO0oo = new C24143OooO0oo(dArr3, dArr2);
            System.out.println(" 0 " + c24143OooO0oo.OooO0O0(0.0d));
            System.out.println(" 1 " + c24143OooO0oo.OooO0O0(1.0d));
            c24144OooOO0o.f81409OooO0Oo = c24143OooO0oo;
            return c24144OooOO0o;
        }
        if (str.startsWith("Schlick")) {
            OooOO0 oooOO02 = new OooOO0();
            oooOO02.f81370OooO00o = str;
            int iIndexOf3 = str.indexOf(40);
            int iIndexOf4 = str.indexOf(44, iIndexOf3);
            oooOO02.f81402OooO0Oo = Double.parseDouble(str.substring(iIndexOf3 + 1, iIndexOf4).trim());
            int i6 = iIndexOf4 + 1;
            oooOO02.f81403OooO0o0 = Double.parseDouble(str.substring(i6, str.indexOf(44, i6)).trim());
            return oooOO02;
        }
        switch (str) {
            case "accelerate":
                return new OooO00o("cubic(0.4, 0.05, 0.8, 0.7)");
            case "decelerate":
                return new OooO00o("cubic(0.0, 0.0, 0.2, 0.95)");
            case "anticipate":
                return new OooO00o("cubic(0.36, 0, 0.66, -0.56)");
            case "linear":
                return new OooO00o("cubic(1, 1, 0, 0)");
            case "overshoot":
                return new OooO00o("cubic(0.34, 1.56, 0.64, 1)");
            case "standard":
                return new OooO00o("cubic(0.4, 0.0, 0.2, 1)");
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f81369OooO0OO));
                return f81368OooO0O0;
        }
    }

    public double OooO00o(double d) {
        return d;
    }

    public final String toString() {
        return this.f81370OooO00o;
    }
}
