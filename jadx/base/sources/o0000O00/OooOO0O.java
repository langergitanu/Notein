package o0000O00;

import com.aspose.slides.C22226Oooo0oo;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooO0O0 f81404OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int[] f81405OooO0O0 = new int[10];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float[] f81406OooO0OO = new float[10];

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f81407OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f81408OooO0o0;

    public final float OooO00o(float f) {
        return (float) this.f81404OooO00o.OooO0O0(f);
    }

    public void OooO0O0(int i, float f) {
        int[] iArr = this.f81405OooO0O0;
        if (iArr.length < this.f81407OooO0Oo + 1) {
            this.f81405OooO0O0 = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f81406OooO0OO;
            this.f81406OooO0OO = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f81405OooO0O0;
        int i2 = this.f81407OooO0Oo;
        iArr2[i2] = i;
        this.f81406OooO0OO[i2] = f;
        this.f81407OooO0Oo = i2 + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void OooO0OO(int i) {
        int i2 = this.f81407OooO0Oo;
        if (i2 == 0) {
            return;
        }
        int[] iArr = this.f81405OooO0O0;
        float[] fArr = this.f81406OooO0OO;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i2 - 1;
        iArr2[1] = 0;
        int i3 = 2;
        while (i3 > 0) {
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
                        float f = fArr[i10];
                        fArr[i10] = fArr[i9];
                        fArr[i9] = f;
                        i10++;
                    }
                    i9++;
                }
                int i13 = iArr[i10];
                iArr[i10] = iArr[i7];
                iArr[i7] = i13;
                float f2 = fArr[i10];
                fArr[i10] = fArr[i7];
                fArr[i7] = f2;
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
        int i15 = 1;
        for (int i16 = 1; i16 < this.f81407OooO0Oo; i16++) {
            int[] iArr3 = this.f81405OooO0O0;
            if (iArr3[i16 - 1] != iArr3[i16]) {
                i15++;
            }
        }
        double[] dArr = new double[i15];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i15, 1);
        int i17 = 0;
        for (int i18 = 0; i18 < this.f81407OooO0Oo; i18++) {
            if (i18 > 0) {
                int[] iArr4 = this.f81405OooO0O0;
                if (iArr4[i18] != iArr4[i18 - 1]) {
                    dArr[i17] = ((double) this.f81405OooO0O0[i18]) * 0.01d;
                    dArr2[i17][0] = this.f81406OooO0OO[i18];
                    i17++;
                }
            }
        }
        this.f81404OooO00o = OooO0O0.OooO00o(i, dArr, dArr2);
    }

    public final String toString() {
        String string = this.f81408OooO0o0;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f81407OooO0Oo; i++) {
            StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(string, "[");
            sbOooO0OO.append(this.f81405OooO0O0[i]);
            sbOooO0OO.append(" , ");
            sbOooO0OO.append(decimalFormat.format(this.f81406OooO0OO[i]));
            sbOooO0OO.append("] ");
            string = sbOooO0OO.toString();
        }
        return string;
    }
}
