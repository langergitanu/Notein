package com.aspose.words.internal;

import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.slides.OooOOOO;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZIQ extends zzZIS {
    private short[] zzZIW;
    private byte[] zzZIX;
    private byte[] zzZIY;
    private float[] zzZIZ;
    private float[] zzZJ0;
    private float[] zzZJ1;
    private float[] zzZJ2;
    private boolean zzZJ3;
    private boolean zzZJ4;
    private boolean zzZJ5;
    private boolean zzZJ6;
    private boolean zzZJ7;
    private boolean zzZJ8;
    private boolean zzZJ9;
    private boolean zzZJa;

    public zzZIQ(zzZIR zzzir, boolean z, boolean z2, int i, int i2) {
        this(zzzir, null, z, z2, i, i2);
    }

    private int zzM(Object obj, int i) {
        if (this.zzZJ9) {
            zzd3();
        }
        if (this.zzZJ6) {
            return zzW(obj, i, 8);
        }
        if (this.zzZJ5) {
            return this.zzZIY[zzW(obj, i, 16)] & 255;
        }
        if (this.zzZJ3) {
            return this.zzZIY[zzW(obj, 0, 16)] & 255;
        }
        return (int) ((this.zzZJr.zzM(zzZM(obj))[i] * 255.0f) + 0.5f);
    }

    private static int zzV(int i, int i2, boolean z) {
        int iZzPB = zzZIO.zzPB(i);
        if (z) {
            i2++;
        }
        return iZzPB * i2;
    }

    private int zzW(Object obj, int i, int i2) {
        int i3;
        short s;
        int i4;
        boolean z = this.zzZJo && this.zzZJn;
        int i5 = this.zzZJp[i];
        int i6 = (1 << i5) - 1;
        int i7 = this.zzZJi;
        if (i7 != 0) {
            if (i7 == 1) {
                short[] sArr = (short[]) obj;
                i3 = sArr[i] & i6;
                if (z) {
                    s = sArr[this.zzZJl];
                    i4 = s & i6;
                }
            } else {
                if (i7 == 2) {
                    short[] sArr2 = (short[]) obj;
                    float f = (1 << i2) - 1;
                    if (!z) {
                        return (int) OooOOOO.OooO00o(sArr2[i], 32767.0f, f, 0.5f);
                    }
                    short s2 = sArr2[this.zzZJl];
                    if (s2 != 0) {
                        return (int) OooOOOO.OooO00o(sArr2[i], s2, f, 0.5f);
                    }
                    return 0;
                }
                if (i7 != 3) {
                    if (i7 == 4) {
                        float[] fArr = (float[]) obj;
                        float f2 = (1 << i2) - 1;
                        if (!z) {
                            return (int) ((fArr[i] * f2) + 0.5f);
                        }
                        float f3 = fArr[this.zzZJl];
                        if (f3 != 0.0f) {
                            return (int) OooOOOO.OooO00o(fArr[i], f3, f2, 0.5f);
                        }
                        return 0;
                    }
                    if (i7 != 5) {
                        throw new UnsupportedOperationException("This method has not been implemented for transferType " + this.zzZJi);
                    }
                    double[] dArr = (double[]) obj;
                    double d = (1 << i2) - 1;
                    if (!z) {
                        return (int) ((dArr[i] * d) + 0.5d);
                    }
                    double d2 = dArr[this.zzZJl];
                    if (d2 != 0.0d) {
                        return (int) (((dArr[i] / d2) * d) + 0.5d);
                    }
                    return 0;
                }
                int[] iArr = (int[]) obj;
                i3 = iArr[i];
                if (z) {
                    i4 = iArr[this.zzZJl];
                }
            }
            i4 = 0;
        } else {
            byte[] bArr = (byte[]) obj;
            i3 = bArr[i] & i6;
            i2 = 8;
            if (z) {
                s = bArr[this.zzZJl];
                i4 = s & i6;
            }
            i4 = 0;
        }
        if (z) {
            if (i4 != 0) {
                return (int) (((((1 << r3[this.zzZJl]) - 1) / i4) * (i3 / i6) * ((1 << i2) - 1)) + 0.5f);
            }
            return 0;
        }
        if (i5 != i2) {
            return (int) OooOOOO.OooO00o(i3, i6, (1 << i2) - 1, 0.5f);
        }
        return i3;
    }

    private static int[] zzZ(int[] iArr, int i, int i2, boolean z) {
        if ((i == 0 || i == 1 || i == 3) && iArr != null) {
            return iArr;
        }
        int iZzPB = zzZIO.zzPB(i);
        if (z) {
            i2++;
        }
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr2[i3] = iZzPB;
        }
        return iArr2;
    }

    private float[] zzZM(Object obj) {
        float[] fArr = new float[this.zzZJm];
        int i = this.zzZJi;
        if (i == 0) {
            byte[] bArr = (byte[]) obj;
            int i2 = 0;
            int i3 = 0;
            while (i2 < this.zzZJm) {
                fArr[i3] = (bArr[i2] & 255) / ((1 << this.zzZJp[i2]) - 1);
                i2++;
                i3++;
            }
        } else if (i == 1) {
            short[] sArr = (short[]) obj;
            int i4 = 0;
            int i5 = 0;
            while (i4 < this.zzZJm) {
                fArr[i5] = (sArr[i4] & 65535) / ((1 << this.zzZJp[i4]) - 1);
                i4++;
                i5++;
            }
        } else if (i == 2) {
            short[] sArr2 = (short[]) obj;
            int i6 = 0;
            int i7 = 0;
            while (i6 < this.zzZJm) {
                fArr[i7] = sArr2[i6] / 32767.0f;
                i6++;
                i7++;
            }
        } else if (i == 3) {
            int[] iArr = (int[]) obj;
            int i8 = 0;
            int i9 = 0;
            while (i8 < this.zzZJm) {
                fArr[i9] = iArr[i8] / ((1 << this.zzZJp[i8]) - 1);
                i8++;
                i9++;
            }
        } else if (i == 4) {
            float[] fArr2 = (float[]) obj;
            int i10 = 0;
            int i11 = 0;
            while (i10 < this.zzZJm) {
                fArr[i11] = fArr2[i10];
                i10++;
                i11++;
            }
        } else {
            if (i != 5) {
                throw new UnsupportedOperationException("This method has not been implemented for transferType " + this.zzZJi);
            }
            double[] dArr = (double[]) obj;
            int i12 = 0;
            int i13 = 0;
            while (i12 < this.zzZJm) {
                fArr[i13] = (float) dArr[i12];
                i12++;
                i13++;
            }
        }
        if (this.zzZJo && this.zzZJn) {
            float f = fArr[this.zzZJl];
            if (f != 0.0f) {
                float f2 = 1.0f / f;
                for (int i14 = 0; i14 < this.zzZJl; i14++) {
                    fArr[i14] = fArr[i14] * f2;
                }
            }
        }
        if (this.zzZJ2 != null) {
            for (int i15 = 0; i15 < this.zzZJl; i15++) {
                fArr[i15] = (this.zzZJ1[i15] * fArr[i15]) + this.zzZJ2[i15];
            }
        }
        return fArr;
    }

    private void zzd2() {
        int i;
        if (this.zzZJj) {
            this.zzZJ6 = true;
            this.zzZJ8 = false;
            return;
        }
        if (zzZIS.zzZ(this.zzZJr)) {
            this.zzZJ5 = true;
            this.zzZJ8 = false;
            if (this.zzZJi == 0) {
                this.zzZIY = zzZIS.zzd6();
                this.zzZIX = zzZIS.zzd7();
                return;
            } else {
                this.zzZIY = zzZIS.zzd8();
                this.zzZIW = zzZIS.zzd9();
                return;
            }
        }
        if (this.zzZJq == 6) {
            zzZIR zzzir = this.zzZJr;
            if (zzzir instanceof zzZIG) {
                zzzir.getMinValue(0);
                this.zzZJr.getMaxValue(0);
                zzZIG zzzig = (zzZIG) this.zzZJr;
                this.zzZJ3 = true;
                this.zzZJ8 = false;
                this.zzZIW = zzZIS.zzd9();
                if (!zzZIS.zzX(zzzig)) {
                    if (this.zzZJi == 0) {
                        this.zzZIY = zzZIS.zzY(zzzig);
                        throw new UnsupportedOperationException();
                    }
                    this.zzZIY = zzZIS.zzZ(zzzig);
                    throw new UnsupportedOperationException();
                }
                this.zzZJ4 = true;
                if (this.zzZJi == 0) {
                    this.zzZIY = zzZIS.zzY(zzzig);
                    return;
                } else {
                    this.zzZIY = zzZIS.zzZ(zzzig);
                    return;
                }
            }
        }
        if (this.zzZJ9) {
            this.zzZJ8 = false;
            int i2 = 0;
            while (true) {
                i = this.zzZJl;
                if (i2 >= i) {
                    break;
                }
                this.zzZJr.getMinValue(i2);
                this.zzZJr.getMaxValue(i2);
                i2++;
            }
            if (this.zzZJ8) {
                this.zzZJ2 = new float[i];
                this.zzZJ1 = new float[i];
                for (int i3 = 0; i3 < this.zzZJl; i3++) {
                    this.zzZJ2[i3] = this.zzZJr.getMinValue(i3);
                    this.zzZJ1[i3] = this.zzZJr.getMaxValue(i3) - this.zzZJ2[i3];
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0138 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzd3() {
        int i;
        float[] fArrZzZM;
        float[] fArrZzZM2;
        float[] fArr;
        float[] fArr2;
        int i2;
        int i3;
        int i4;
        int i5;
        this.zzZJ9 = false;
        if (this.zzZJ8 || this.zzZJa) {
            this.zzZJ7 = true;
        } else {
            this.zzZJ7 = false;
        }
        int i6 = this.zzZJi;
        if (i6 == 0) {
            byte[] bArr = new byte[this.zzZJm];
            int i7 = 0;
            while (true) {
                i = this.zzZJl;
                if (i7 >= i) {
                    break;
                }
                bArr[i7] = 0;
                i7++;
            }
            if (this.zzZJo) {
                bArr[i] = (byte) ((1 << this.zzZJp[i]) - 1);
            }
            fArrZzZM = zzZM(bArr);
            for (int i8 = 0; i8 < this.zzZJl; i8++) {
                bArr[i8] = (byte) ((1 << this.zzZJp[i8]) - 1);
            }
            fArrZzZM2 = zzZM(bArr);
        } else if (i6 == 1) {
            short[] sArr = new short[this.zzZJm];
            int i9 = 0;
            while (true) {
                i3 = this.zzZJl;
                if (i9 >= i3) {
                    break;
                }
                sArr[i9] = 0;
                i9++;
            }
            if (this.zzZJo) {
                sArr[i3] = (short) ((1 << this.zzZJp[i3]) - 1);
            }
            fArrZzZM = zzZM(sArr);
            for (int i10 = 0; i10 < this.zzZJl; i10++) {
                sArr[i10] = (short) ((1 << this.zzZJp[i10]) - 1);
            }
            fArrZzZM2 = zzZM(sArr);
        } else if (i6 == 2) {
            short[] sArr2 = new short[this.zzZJm];
            int i11 = 0;
            while (true) {
                i4 = this.zzZJl;
                if (i11 >= i4) {
                    break;
                }
                sArr2[i11] = 0;
                i11++;
            }
            if (this.zzZJo) {
                sArr2[i4] = Short.MAX_VALUE;
            }
            fArrZzZM = zzZM(sArr2);
            for (int i12 = 0; i12 < this.zzZJl; i12++) {
                sArr2[i12] = Short.MAX_VALUE;
            }
            fArrZzZM2 = zzZM(sArr2);
        } else {
            if (i6 != 3) {
                fArr2 = null;
                fArr = null;
                this.zzZJ8 = false;
                i2 = this.zzZJl;
                if (i2 > 0 && (fArr2[0] != 0.0f || fArr[0] != 1.0f)) {
                    this.zzZJ8 = true;
                }
                if (this.zzZJ8) {
                    return;
                }
                this.zzZJ7 = true;
                this.zzZJ6 = false;
                this.zzZJ5 = false;
                this.zzZJ4 = false;
                this.zzZJ3 = false;
                this.zzZJ0 = new float[i2];
                this.zzZIZ = new float[i2];
                for (int i13 = 0; i13 < this.zzZJl; i13++) {
                    this.zzZJ0[i13] = fArr2[i13];
                    this.zzZIZ[i13] = 1.0f / (fArr[i13] - fArr2[i13]);
                }
                return;
            }
            int[] iArr = new int[this.zzZJm];
            int i14 = 0;
            while (true) {
                i5 = this.zzZJl;
                if (i14 >= i5) {
                    break;
                }
                iArr[i14] = 0;
                i14++;
            }
            if (this.zzZJo) {
                iArr[i5] = (1 << this.zzZJp[i5]) - 1;
            }
            fArrZzZM = zzZM(iArr);
            for (int i15 = 0; i15 < this.zzZJl; i15++) {
                iArr[i15] = (1 << this.zzZJp[i15]) - 1;
            }
            fArrZzZM2 = zzZM(iArr);
        }
        float[] fArr3 = fArrZzZM;
        fArr = fArrZzZM2;
        fArr2 = fArr3;
        this.zzZJ8 = false;
        i2 = this.zzZJl;
        if (i2 > 0) {
            this.zzZJ8 = true;
        }
        if (this.zzZJ8) {
        }
    }

    @Override // com.aspose.words.internal.zzZIS
    public final int zz0(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.words.internal.zzZIS
    public final zzZIA zzYR(int i, int i2) {
        int i3;
        int[] iArr = new int[this.zzZJm];
        int i4 = 0;
        while (true) {
            i3 = this.zzZJm;
            if (i4 >= i3) {
                break;
            }
            iArr[i4] = i4;
            i4++;
        }
        int i5 = this.zzZJi;
        return (i5 == 0 || i5 == 1) ? new zzZIB(i5, i, i2, i3, i * i3, iArr) : new zzZIP(i5, i, i2, i3, i * i3, iArr);
    }

    @Override // com.aspose.words.internal.zzZIS
    public final int zzZN(Object obj) {
        if (this.zzZJ9) {
            zzd3();
        }
        if (this.zzZJ6 || this.zzZJ5) {
            return zzM(obj, 2) | (zzZR(obj) << 24) | (zzM(obj, 0) << 16) | (zzM(obj, 1) << 8);
        }
        if (this.zzZJq == 6) {
            int iZzM = zzM(obj, 0);
            return (zzZR(obj) << 24) | (iZzM << 16) | (iZzM << 8) | iZzM;
        }
        float[] fArrZzM = this.zzZJr.zzM(zzZM(obj));
        return (zzZR(obj) << 24) | (((int) ((fArrZzM[0] * 255.0f) + 0.5f)) << 16) | (((int) ((fArrZzM[1] * 255.0f) + 0.5f)) << 8) | ((int) ((fArrZzM[2] * 255.0f) + 0.5f));
    }

    @Override // com.aspose.words.internal.zzZIS
    public final int zzZO(Object obj) {
        return zzM(obj, 2);
    }

    @Override // com.aspose.words.internal.zzZIS
    public final int zzZP(Object obj) {
        return zzM(obj, 1);
    }

    @Override // com.aspose.words.internal.zzZIS
    public final int zzZQ(Object obj) {
        return zzM(obj, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    @Override // com.aspose.words.internal.zzZIS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzZR(Object obj) {
        short s;
        int i;
        if (!this.zzZJo) {
            return 255;
        }
        int i2 = this.zzZJl;
        int i3 = this.zzZJp[i2];
        int i4 = (1 << i3) - 1;
        int i5 = this.zzZJi;
        if (i5 == 0) {
            s = ((byte[]) obj)[i2];
        } else {
            if (i5 != 1) {
                if (i5 == 2) {
                    return (int) OooOOOO.OooO00o(((short[]) obj)[i2], 32767.0f, 255.0f, 0.5f);
                }
                if (i5 == 3) {
                    i = ((int[]) obj)[i2];
                    return i3 != 8 ? i : (int) OooOOOO.OooO00o(i, (1 << i3) - 1, 255.0f, 0.5f);
                }
                if (i5 == 4) {
                    return (int) ((((float[]) obj)[i2] * 255.0f) + 0.5f);
                }
                if (i5 == 5) {
                    return (int) ((((double[]) obj)[i2] * 255.0d) + 0.5d);
                }
                throw new UnsupportedOperationException("This method has not been implemented for transferType " + this.zzZJi);
            }
            s = ((short[]) obj)[i2];
        }
        i = s & i4;
        if (i3 != 8) {
        }
    }

    @Override // com.aspose.words.internal.zzZIS
    public final int zzZX(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.words.internal.zzZIS
    public final int zzZY(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.words.internal.zzZIS
    public final int zzZZ(int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzZIQ(zzZIR zzzir, int[] iArr, boolean z, boolean z2, int i, int i2) {
        super(zzV(i2, zzzir.zzd4(), z), zzZ(iArr, i2, zzzir.zzd4(), z), zzzir, z, z2, i, i2);
        if (i2 == 0 || i2 == 1) {
            this.zzZJa = false;
            this.zzZJ9 = true;
        } else if (i2 == 2) {
            this.zzZJa = true;
            this.zzZJ9 = true;
        } else if (i2 != 3) {
            if (i2 != 4 && i2 != 5) {
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i2, "This constructor is not compatible with transferType "));
            }
            this.zzZJa = true;
            this.zzZJ9 = false;
            this.zzZJ7 = true;
            this.zzZJ8 = false;
        }
        zzd2();
    }
}
