package o0000O00;

import com.aspose.slides.C22226Oooo0oo;
import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f81410OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooO0O0 f81411OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f81412OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int[] f81413OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float[][] f81414OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public String f81415OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f81416OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float[] f81417OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f81418OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f81419OooOO0;

    public final float OooO00o(float f) {
        float fAbs;
        switch (this.f81412OooO0O0) {
            case 1:
                return Math.signum(f * 6.2831855f);
            case 2:
                fAbs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f * 6.2831855f);
            case 6:
                float fAbs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) Math.sin(f * 6.2831855f);
        }
        return 1.0f - fAbs;
    }

    public void OooO0O0(float f, float f2, float f3, int i, int i2) {
        int i3 = this.f81416OooO0o0;
        this.f81413OooO0OO[i3] = i;
        float[] fArr = this.f81414OooO0Oo[i3];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        this.f81412OooO0O0 = Math.max(this.f81412OooO0O0, i2);
        this.f81416OooO0o0++;
    }

    public void OooO0OO(int i) {
        float[][] fArr;
        int i2 = this.f81416OooO0o0;
        if (i2 == 0) {
            System.err.println("Error no points added to " + this.f81415OooO0o);
            return;
        }
        int[] iArr = this.f81413OooO0OO;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i2 - 1;
        iArr2[1] = 0;
        int i3 = 2;
        while (true) {
            fArr = this.f81414OooO0Oo;
            if (i3 <= 0) {
                break;
            }
            int i4 = i3 - 1;
            int i5 = iArr2[i4];
            int i6 = i3 - 2;
            int i7 = iArr2[i6];
            if (i5 < i7) {
                int i8 = iArr[i7];
                int i9 = i5;
                int i10 = i9;
                while (i9 < i7) {
                    int i11 = iArr[i9];
                    if (i11 <= i8) {
                        int i12 = iArr[i10];
                        iArr[i10] = i11;
                        iArr[i9] = i12;
                        float[] fArr2 = fArr[i10];
                        fArr[i10] = fArr[i9];
                        fArr[i9] = fArr2;
                        i10++;
                    }
                    i9++;
                }
                int i13 = iArr[i10];
                iArr[i10] = iArr[i7];
                iArr[i7] = i13;
                float[] fArr3 = fArr[i10];
                fArr[i10] = fArr[i7];
                fArr[i7] = fArr3;
                iArr2[i6] = i10 - 1;
                iArr2[i4] = i5;
                int i14 = i3 + 1;
                iArr2[i3] = i7;
                i3 += 2;
                iArr2[i14] = i10 + 1;
            } else {
                i3 = i6;
            }
        }
        int i15 = 0;
        for (int i16 = 1; i16 < iArr.length; i16++) {
            if (iArr[i16] != iArr[i16 - 1]) {
                i15++;
            }
        }
        if (i15 == 0) {
            i15 = 1;
        }
        double[] dArr = new double[i15];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i15, 3);
        int i17 = 0;
        for (int i18 = 0; i18 < this.f81416OooO0o0; i18++) {
            if (i18 <= 0 || iArr[i18] != iArr[i18 - 1]) {
                dArr[i17] = ((double) iArr[i18]) * 0.01d;
                double[] dArr3 = dArr2[i17];
                float[] fArr4 = fArr[i18];
                dArr3[0] = fArr4[0];
                dArr3[1] = fArr4[1];
                dArr3[2] = fArr4[2];
                i17++;
            }
        }
        this.f81411OooO00o = OooO0O0.OooO00o(i, dArr, dArr2);
    }

    public final String toString() {
        String string = this.f81415OooO0o;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f81416OooO0o0; i++) {
            StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(string, "[");
            sbOooO0OO.append(this.f81413OooO0OO[i]);
            sbOooO0OO.append(" , ");
            sbOooO0OO.append(decimalFormat.format(this.f81414OooO0Oo[i]));
            sbOooO0OO.append("] ");
            string = sbOooO0OO.toString();
        }
        return string;
    }
}
