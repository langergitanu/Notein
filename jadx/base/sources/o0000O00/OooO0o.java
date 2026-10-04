package o0000O00;

import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.slides.C22226Oooo0oo;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooO00o f81376OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f81377OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f81378OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f81379OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ArrayList<OooO0O0> f81380OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f81381OooO0o0;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public OooO f81382OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float[] f81383OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public double[] f81384OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float[] f81385OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public float[] f81386OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float[] f81387OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public o0000O00.OooO0O0 f81388OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public double[] f81389OooO0oo;
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f81390OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float f81391OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f81392OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f81393OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final float f81394OooO0o0;

        public OooO0O0(float f, float f2, float f3, float f4, int i) {
            this.f81390OooO00o = i;
            this.f81391OooO0O0 = f4;
            this.f81392OooO0OO = f2;
            this.f81393OooO0Oo = f;
            this.f81394OooO0o0 = f3;
        }
    }

    public final float OooO00o(float f) {
        double dSignum;
        double dAbs;
        OooO00o oooO00o = this.f81376OooO00o;
        o0000O00.OooO0O0 oooO0O0 = oooO00o.f81388OooO0oO;
        if (oooO0O0 != null) {
            oooO0O0.OooO0OO(f, oooO00o.f81389OooO0oo);
        } else {
            double[] dArr = oooO00o.f81389OooO0oo;
            dArr[0] = oooO00o.f81387OooO0o0[0];
            dArr[1] = oooO00o.f81386OooO0o[0];
            dArr[2] = oooO00o.f81383OooO0O0[0];
        }
        double[] dArr2 = oooO00o.f81389OooO0oo;
        double d = dArr2[0];
        double d2 = dArr2[1];
        OooO oooO = oooO00o.f81382OooO00o;
        double d3 = f;
        oooO.getClass();
        double dOooO0O0 = 0.0d;
        if (d3 > 0.0d) {
            dOooO0O0 = 1.0d;
            if (d3 < 1.0d) {
                int iBinarySearch = Arrays.binarySearch(oooO.f81343OooO0O0, d3);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                float[] fArr = oooO.f81342OooO00o;
                float f2 = fArr[iBinarySearch];
                int i = iBinarySearch - 1;
                float f3 = fArr[i];
                double d4 = f2 - f3;
                double[] dArr3 = oooO.f81343OooO0O0;
                double d5 = dArr3[iBinarySearch];
                double d6 = dArr3[i];
                double d7 = d4 / (d5 - d6);
                dOooO0O0 = ((((d3 * d3) - (d6 * d6)) * d7) / 2.0d) + C21532OooOOo.OooO0O0(d3, d6, ((double) f3) - (d7 * d6), oooO.f81344OooO0OO[i]);
            }
        }
        double d8 = dOooO0O0 + d2;
        switch (oooO.f81346OooO0o0) {
            case 1:
                dSignum = Math.signum(0.5d - (d8 % 1.0d));
                break;
            case 2:
                dAbs = Math.abs((((d8 * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                dSignum = 1.0d - dAbs;
                break;
            case 3:
                dSignum = (((d8 * 2.0d) + 1.0d) % 2.0d) - 1.0d;
                break;
            case 4:
                dSignum = 1.0d - (((d8 * 2.0d) + 1.0d) % 2.0d);
                break;
            case 5:
                dSignum = Math.cos((d2 + d8) * 6.283185307179586d);
                break;
            case 6:
                double dAbs2 = 1.0d - Math.abs(((d8 * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                dSignum = 1.0d - dAbs;
                break;
            case 7:
                dSignum = oooO.f81345OooO0Oo.OooO0O0(d8 % 1.0d);
                break;
            default:
                dSignum = Math.sin(6.283185307179586d * d8);
                break;
        }
        return (float) ((dSignum * oooO00o.f81389OooO0oo[2]) + d);
    }

    public void OooO0O0(androidx.constraintlayout.widget.OooO00o oooO00o) {
    }

    public final void OooO0OO() {
        int i;
        int i2;
        int i3;
        int i4;
        double d;
        int i5;
        ArrayList<OooO0O0> arrayList = this.f81380OooO0o;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        Collections.sort(arrayList, new C24141OooO0o0());
        double[] dArr = new double[size];
        Class cls = Double.TYPE;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) cls, size, 3);
        int i6 = this.f81378OooO0OO;
        String str = this.f81379OooO0Oo;
        OooO00o oooO00o = new OooO00o();
        OooO oooO = new OooO();
        oooO.f81342OooO00o = new float[0];
        oooO.f81343OooO0O0 = new double[0];
        oooO00o.f81382OooO00o = oooO;
        oooO.f81346OooO0o0 = i6;
        if (str != null) {
            double[] dArr3 = new double[str.length() / 2];
            i3 = 3;
            int iIndexOf = str.indexOf(40) + 1;
            i4 = 0;
            i2 = 1;
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            int i7 = 0;
            d = 1.0d;
            while (iIndexOf2 != -1) {
                dArr3[i7] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
                iIndexOf = iIndexOf2 + 1;
                iIndexOf2 = str.indexOf(44, iIndexOf);
                i7++;
            }
            dArr3[i7] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
            double[] dArrCopyOf = Arrays.copyOf(dArr3, i7 + 1);
            int length = (dArrCopyOf.length * 3) - 2;
            int length2 = dArrCopyOf.length - 1;
            double d2 = 1.0d / ((double) length2);
            double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, 1);
            double[] dArr5 = new double[length];
            i = 2;
            int i8 = 0;
            while (i8 < dArrCopyOf.length) {
                double d3 = dArrCopyOf[i8];
                int i9 = i8 + length2;
                dArr4[i9][0] = d3;
                double d4 = d2;
                double d5 = ((double) i8) * d4;
                dArr5[i9] = d5;
                if (i8 > 0) {
                    int i10 = (length2 * 2) + i8;
                    dArr4[i10][0] = d3 + 1.0d;
                    dArr5[i10] = d5 + 1.0d;
                    int i11 = i8 - 1;
                    dArr4[i11][0] = (d3 - 1.0d) - d4;
                    dArr5[i11] = (d5 - 1.0d) - d4;
                }
                i8++;
                d2 = d4;
            }
            oooO.f81345OooO0Oo = new C24143OooO0oo(dArr5, dArr4);
        } else {
            i = 2;
            i2 = 1;
            i3 = 3;
            i4 = 0;
            d = 1.0d;
        }
        oooO00o.f81383OooO0O0 = new float[size];
        oooO00o.f81384OooO0OO = new double[size];
        oooO00o.f81385OooO0Oo = new float[size];
        oooO00o.f81387OooO0o0 = new float[size];
        oooO00o.f81386OooO0o = new float[size];
        float[] fArr = new float[size];
        this.f81376OooO00o = oooO00o;
        int i12 = i4;
        for (OooO0O0 oooO0O0 : arrayList) {
            float f = oooO0O0.f81393OooO0Oo;
            dArr[i12] = ((double) f) * 0.01d;
            double[] dArr6 = dArr2[i12];
            float f2 = oooO0O0.f81391OooO0O0;
            dArr6[i4] = f2;
            float f3 = oooO0O0.f81392OooO0OO;
            dArr6[i2] = f3;
            float f4 = oooO0O0.f81394OooO0o0;
            dArr6[i] = f4;
            OooO00o oooO00o2 = this.f81376OooO00o;
            oooO00o2.f81384OooO0OO[i12] = ((double) oooO0O0.f81390OooO00o) / 100.0d;
            oooO00o2.f81385OooO0Oo[i12] = f;
            oooO00o2.f81387OooO0o0[i12] = f3;
            oooO00o2.f81386OooO0o[i12] = f4;
            oooO00o2.f81383OooO0O0[i12] = f2;
            i12++;
        }
        OooO00o oooO00o3 = this.f81376OooO00o;
        double[] dArr7 = oooO00o3.f81384OooO0OO;
        int length3 = dArr7.length;
        int i13 = i;
        int[] iArr = new int[i13];
        iArr[i2] = i3;
        iArr[i4] = length3;
        double[][] dArr8 = (double[][]) Array.newInstance((Class<?>) cls, iArr);
        float[] fArr2 = oooO00o3.f81383OooO0O0;
        oooO00o3.f81389OooO0oo = new double[fArr2.length + i13];
        double[] dArr9 = new double[fArr2.length + i13];
        double d6 = dArr7[i4];
        double d7 = 0.0d;
        float[] fArr3 = oooO00o3.f81385OooO0Oo;
        OooO oooO2 = oooO00o3.f81382OooO00o;
        if (d6 > 0.0d) {
            oooO2.OooO00o(0.0d, fArr3[i4]);
        }
        int length4 = dArr7.length - 1;
        if (dArr7[length4] < d) {
            oooO2.OooO00o(d, fArr3[length4]);
        }
        for (int i14 = i4; i14 < dArr8.length; i14++) {
            double[] dArr10 = dArr8[i14];
            dArr10[i4] = oooO00o3.f81387OooO0o0[i14];
            dArr10[i2] = oooO00o3.f81386OooO0o[i14];
            dArr10[2] = fArr2[i14];
            oooO2.OooO00o(dArr7[i14], fArr3[i14]);
        }
        double d8 = 0.0d;
        int i15 = i4;
        while (true) {
            float[] fArr4 = oooO2.f81342OooO00o;
            if (i15 >= fArr4.length) {
                break;
            }
            d8 += (double) fArr4[i15];
            i15++;
        }
        double d9 = 0.0d;
        int i16 = i2;
        while (true) {
            float[] fArr5 = oooO2.f81342OooO00o;
            if (i16 >= fArr5.length) {
                break;
            }
            int i17 = i16 - 1;
            float f5 = (fArr5[i17] + fArr5[i16]) / 2.0f;
            double d10 = d7;
            double[] dArr11 = oooO2.f81343OooO0O0;
            d9 = ((dArr11[i16] - dArr11[i17]) * ((double) f5)) + d9;
            i16++;
            d7 = d10;
        }
        double d11 = d7;
        int i18 = i4;
        while (true) {
            float[] fArr6 = oooO2.f81342OooO00o;
            if (i18 >= fArr6.length) {
                break;
            }
            fArr6[i18] = fArr6[i18] * ((float) (d8 / d9));
            i18++;
        }
        oooO2.f81344OooO0OO[i4] = d11;
        int i19 = i2;
        while (true) {
            float[] fArr7 = oooO2.f81342OooO00o;
            if (i19 >= fArr7.length) {
                break;
            }
            int i20 = i19 - 1;
            float f6 = (fArr7[i20] + fArr7[i19]) / 2.0f;
            double[] dArr12 = oooO2.f81343OooO0O0;
            double d12 = dArr12[i19] - dArr12[i20];
            double[] dArr13 = oooO2.f81344OooO0OO;
            double d13 = dArr13[i20];
            int i21 = i19;
            dArr13[i21] = (d12 * ((double) f6)) + d13;
            i19 = i21 + 1;
        }
        if (dArr7.length > i2) {
            i5 = i4;
            oooO00o3.f81388OooO0oO = o0000O00.OooO0O0.OooO00o(i5, dArr7, dArr8);
        } else {
            i5 = i4;
            oooO00o3.f81388OooO0oO = null;
        }
        o0000O00.OooO0O0.OooO00o(i5, dArr, dArr2);
    }

    public final String toString() {
        String string = this.f81377OooO0O0;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (OooO0O0 oooO0O0 : this.f81380OooO0o) {
            StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(string, "[");
            sbOooO0OO.append(oooO0O0.f81390OooO00o);
            sbOooO0OO.append(" , ");
            sbOooO0OO.append(decimalFormat.format(oooO0O0.f81391OooO0O0));
            sbOooO0OO.append("] ");
            string = sbOooO0OO.toString();
        }
        return string;
    }
}
