package com.aspose.words.internal;

import com.aspose.slides.OooOOOO;

/* JADX INFO: loaded from: classes5.dex */
final class zzU {
    private float[] zzj;
    private float[] zzk;
    private int zzl;
    private int zzn;
    private float[][] zzo;
    private static float[] zzr = {0.0f, 1.0f};
    private static float[] zzq = {0.0f, 1.0f};
    private int zzp = 8;
    private int zzm = 1;

    private zzU(int i, int i2, int i3, float[][] fArr, float[] fArr2, float[] fArr3) {
        this.zzo = fArr;
        this.zzn = i3;
        this.zzl = i2;
        this.zzk = fArr2;
        this.zzj = fArr3;
    }

    private byte[][] zzE() {
        double d;
        double d2;
        if (this.zzp != 8) {
            throw new UnsupportedOperationException("Only 8 bit per sample functions supported so far.");
        }
        byte[][] bArr = new byte[this.zzn][];
        for (int i = 0; i < this.zzn; i++) {
            bArr[i] = new byte[this.zzm + this.zzl];
        }
        int i2 = 0;
        while (true) {
            int i3 = this.zzm;
            if (i2 >= this.zzl + i3) {
                return bArr;
            }
            if (i2 < i3) {
                float[] fArr = this.zzk;
                int i4 = i2 * 2;
                d2 = fArr[i4];
                d = fArr[i4 + 1];
            } else {
                float[] fArr2 = this.zzj;
                double d3 = fArr2[(i2 - i3) * 2];
                d = fArr2[androidx.core.graphics.OooO0OO.OooO00o(i2, i3, 2, 1)];
                d2 = d3;
            }
            double d4 = d - d2;
            double d5 = !zzAN.zzZD(d4) ? 255.0d / d4 : 1.0d;
            for (int i5 = 0; i5 < this.zzn; i5++) {
                bArr[i5][i2] = (byte) zzZKQ.zzZa((((double) this.zzo[i5][i2]) - d2) * d5);
            }
            i2++;
        }
    }

    public static zzU zzZ(zzPA zzpa) {
        return zzZ(zzpa, new int[]{1, 2, 3});
    }

    public final int zzA() {
        return this.zzn;
    }

    public final int zzB() {
        return this.zzp;
    }

    public final float[] zzC() {
        return this.zzj;
    }

    public final float[] zzD() {
        return this.zzk;
    }

    public final void zzY(zzZOP zzzop) throws Exception {
        byte[][] bArrZzE = zzE();
        for (int i = 0; i < this.zzn; i++) {
            for (int i2 = this.zzm; i2 < this.zzm + this.zzl; i2++) {
                zzzop.writeByte(bArrZzE[i][i2]);
            }
        }
    }

    public final int zzy() {
        return this.zzl;
    }

    public final int zzz() {
        return this.zzm;
    }

    private static zzU zzZ(zzPA zzpa, int[] iArr) {
        int length;
        float[][] fArr;
        int length2 = iArr.length;
        if (zzpa.zzOP() == null) {
            float[] fArrZzOO = zzpa.zzOO();
            if (fArrZzOO == null) {
                fArrZzOO = zzr;
            }
            float[] fArrZzON = zzpa.zzON();
            if (fArrZzON == null) {
                fArrZzON = zzq;
            }
            int length3 = fArrZzOO.length;
            length = length3 + 1;
            fArr = new float[length][];
            for (int i = 0; i < length; i++) {
                fArr[i] = new float[length2 + 1];
            }
            fArr[length3][0] = 1.0f;
            int i2 = 0;
            while (i2 < length2) {
                int i3 = i2 + 1;
                fArr[length3][i3] = zzZ(zzpa.zzOu(), iArr[i2]);
                i2 = i3;
            }
            for (int i4 = 0; i4 < length3; i4++) {
                float f = fArrZzOO[i4];
                if (f <= 1.0f) {
                    fArr[i4][0] = f;
                }
                int i5 = 0;
                while (i5 < length2) {
                    float fZzZ = fArrZzON[i4] * zzZ(zzpa.zzOu(), iArr[i5]);
                    float f2 = 1.0f - fArrZzON[i4];
                    float fZzZ2 = zzZ(zzpa.zzOv(), iArr[i5]);
                    i5++;
                    fArr[i4][i5] = (f2 * fZzZ2) + fZzZ;
                }
            }
        } else {
            length = zzpa.zzOP().length;
            fArr = new float[length][];
            for (int i6 = 0; i6 < length; i6++) {
                fArr[i6] = new float[length2 + 1];
            }
            for (int i7 = 0; i7 < length; i7++) {
                fArr[i7][0] = zzpa.zzOP()[i7].zzOG();
                int i8 = 0;
                while (i8 < length2) {
                    int i9 = i8 + 1;
                    fArr[i7][i9] = zzZ(zzpa.zzOP()[i7].zzZy(), iArr[i8]);
                    i8 = i9;
                }
            }
        }
        return zzZ(fArr, length, length2);
    }

    public static zzU zzY(zzPA zzpa) {
        return zzZ(zzpa, new int[]{0});
    }

    private static zzU zzZ(float[][] fArr, int i, int i2) {
        int i3 = i2 + 1;
        float[] fArr2 = new float[i3];
        float[] fArr3 = new float[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr2[i4] = Float.POSITIVE_INFINITY;
            fArr3[i4] = Float.NEGATIVE_INFINITY;
        }
        for (int i5 = 0; i5 < i; i5++) {
            for (int i6 = 0; i6 < i3; i6++) {
                float f = fArr2[i6];
                float[] fArr4 = fArr[i5];
                float f2 = fArr4[i6];
                if (f > f2) {
                    fArr2[i6] = f2;
                }
                float f3 = fArr3[i6];
                float f4 = fArr4[i6];
                if (f3 < f4) {
                    fArr3[i6] = f4;
                }
            }
        }
        float[] fArr5 = new float[2];
        float[] fArr6 = new float[i2 * 2];
        for (int i7 = 0; i7 < i3; i7++) {
            if (i7 <= 0) {
                int i8 = i7 * 2;
                fArr5[i8] = fArr2[i7];
                fArr5[i8 + 1] = fArr3[i7];
            } else {
                int i9 = (i7 - 1) * 2;
                fArr6[i9] = fArr2[i7];
                fArr6[i9 + 1] = fArr3[i7];
            }
        }
        int[] iArr = {i};
        return new zzU(1, i2, iArr[0], zzZ(fArr, fArr5, fArr6, iArr, 1, i2), fArr5, fArr6);
    }

    private static float[][] zzZ(float[][] fArr, float[] fArr2, float[] fArr3, int[] iArr, int i, int i2) {
        int i3;
        int i4 = 1;
        float[] fArr4 = new float[1];
        if (!zzZ(fArr, iArr[0], 1, fArr4)) {
            return fArr;
        }
        fArr4[0] = (fArr2[1] - fArr2[0]) / 256.0f;
        float[][] fArr5 = new float[256][];
        for (int i5 = 0; i5 < 256; i5++) {
            fArr5[i5] = new float[i2 + 1];
        }
        int i6 = -1;
        int i7 = 0;
        int i8 = 0;
        while (i7 < 256) {
            fArr5[i7][0] = i7 * fArr4[0];
            float f = fArr[i8][0];
            float f2 = i6 >= 0 ? fArr[i6][0] : 0.0f;
            int i9 = i4;
            while (i9 < i2 + 1) {
                float f3 = fArr[i8][i9];
                float f4 = i6 >= 0 ? fArr[i6][i9] : 0.0f;
                float f5 = f - f2;
                if (!zzAN.zzf(f5)) {
                    float[] fArr6 = fArr5[i7];
                    i3 = i4;
                    float fOooO00o = OooOOOO.OooO00o(f3 - f4, f5, fArr6[0] - f2, f4);
                    fArr6[i9] = fOooO00o;
                    int i10 = (i9 - 1) * 2;
                    float f6 = fArr3[i10];
                    if (fOooO00o < f6) {
                        fArr6[i9] = f6;
                    }
                    float f7 = fArr6[i9];
                    float f8 = fArr3[i10 + 1];
                    if (f7 > f8) {
                        fArr6[i9] = f8;
                    }
                } else {
                    i3 = i4;
                    fArr5[i7][i9] = f3;
                }
                i9++;
                i4 = i3;
            }
            int i11 = i4;
            if (i8 < fArr.length - 1 && fArr5[i7][0] >= fArr[i8][0]) {
                i8++;
                i6++;
            }
            i7++;
            i4 = i11;
        }
        iArr[0] = 256;
        return fArr5;
    }

    private static boolean zzZ(float[][] fArr, int i, int i2, float[] fArr2) {
        for (int i3 = 0; i3 < i2; i3++) {
            fArr2[i3] = Float.POSITIVE_INFINITY;
        }
        boolean z = false;
        for (int i4 = 1; i4 < i; i4++) {
            for (int i5 = 0; i5 < i2; i5++) {
                float f = fArr[i4][i5] - fArr[i4 - 1][i5];
                if (!zzAN.zzS(f, fArr2[i5]) && !zzZKS.zzZO(fArr2[i5])) {
                    z = true;
                }
                if (f < fArr2[i5]) {
                    fArr2[i5] = f;
                }
            }
        }
        return z;
    }

    private static float zzZ(zzPV zzpv, int i) {
        int iZzPD;
        if (i == 0) {
            iZzPD = zzpv.zzPD();
        } else if (i == 1) {
            iZzPD = zzpv.zzPC();
        } else if (i == 2) {
            iZzPD = zzpv.zzPB();
        } else if (i == 3) {
            iZzPD = zzpv.zzPA();
        } else {
            throw new IllegalArgumentException();
        }
        return (float) (((double) iZzPD) / 255.0d);
    }
}
