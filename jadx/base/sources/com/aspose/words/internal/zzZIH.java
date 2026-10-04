package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZIH extends zzZIC {
    private int zzZIA;
    private int zzZIB;
    private int zzZIC;
    private int zzZID;
    private short[] zzZIW;
    private byte[] zzZIX;
    private byte[] zzZIY;
    private int zzZIq;
    private boolean zzZIr;
    private int zzZIs;
    private int zzZIt;
    private int zzZIu;
    private int zzZIv;
    private int zzZIw;
    private int zzZIx;
    private int zzZIy;
    private int zzZIz;

    public zzZIH(zzZIR zzzir, int i, int i2, int i3, int i4, boolean z, int i5) {
        super(zzzir, 32, i, i2, i3, i4, z, i4 == 0 ? 1 : 3, i5);
        if (zzZIS.zzZ(this.zzZJr)) {
            this.zzZIr = true;
            if (this.zzZJk <= 8) {
                this.zzZIq = 8;
                this.zzZIY = zzZIS.zzd6();
                this.zzZIX = zzZIS.zzd7();
            } else {
                this.zzZIq = 16;
                this.zzZIY = zzZIS.zzd8();
                this.zzZIW = zzZIS.zzd9();
            }
        } else if (!this.zzZJj) {
            for (int i6 = 0; i6 < 3; i6++) {
                zzzir.getMinValue(i6);
                zzzir.getMaxValue(i6);
            }
        }
        zzcS();
    }

    private float[] zzPA(int i) {
        return this.zzZJr.zzM(zzI(zzPz(i)));
    }

    private int[] zzPz(int i) {
        int[] iArr = new int[this.zzZJm];
        for (int i2 = 0; i2 < this.zzZJm; i2++) {
            iArr[i2] = (this.zzZIa[i2] & i) >>> this.zzZI9[i2];
        }
        return iArr;
    }

    private int zzYN(int i, int i2) {
        int[] iArr = this.zzZIa;
        int i3 = iArr[i2] & i;
        int[] iArr2 = this.zzZI9;
        int i4 = i3 >>> iArr2[i2];
        if (!this.zzZJn) {
            float f = this.zzZI8[i2];
            return f != 1.0f ? (int) ((i4 * f) + 0.5f) : i4;
        }
        int i5 = (i & iArr[3]) >>> iArr2[3];
        if (i5 == 0) {
            return 0;
        }
        float f2 = i4;
        float[] fArr = this.zzZI8;
        return (int) ((((f2 * fArr[i2]) * 255.0f) / (i5 * fArr[3])) + 0.5f);
    }

    private int zzYO(int i, int i2) {
        float f;
        float f2;
        int i3;
        int[] iArr = this.zzZIa;
        int i4 = iArr[i2] & i;
        int[] iArr2 = this.zzZI9;
        int i5 = i4 >>> iArr2[i2];
        if (this.zzZJn) {
            float f3 = (1 << this.zzZIq) - 1;
            int i6 = (i & iArr[3]) >>> iArr2[3];
            if (i6 == 0) {
                i3 = 0;
            } else {
                float f4 = i5;
                float[] fArr = this.zzZI8;
                i3 = (int) ((((f4 * fArr[i2]) * f3) / (i6 * fArr[3])) + 0.5f);
            }
            i5 = i3;
        } else {
            int i7 = this.zzZJp[i2];
            int i8 = this.zzZIq;
            if (i7 != i8) {
                if (i8 == 16) {
                    f = i5 * this.zzZI8[i2];
                    f2 = 257.0f;
                } else {
                    f = i5;
                    f2 = this.zzZI8[i2];
                }
                i5 = (int) ((f * f2) + 0.5f);
            }
        }
        return this.zzZIY[i5] & 255;
    }

    private void zzcS() {
        int[] iArr = this.zzZIa;
        this.zzZID = iArr[0];
        int[] iArr2 = this.zzZI9;
        this.zzZIz = iArr2[0];
        this.zzZIC = iArr[1];
        this.zzZIy = iArr2[1];
        this.zzZIB = iArr[2];
        this.zzZIx = iArr2[2];
        int[] iArr3 = this.zzZJp;
        int i = iArr3[0];
        if (i < 8) {
            this.zzZIv = (1 << i) - 1;
        }
        int i2 = iArr3[1];
        if (i2 < 8) {
            this.zzZIu = (1 << i2) - 1;
        }
        int i3 = iArr3[2];
        if (i3 < 8) {
            this.zzZIt = (1 << i3) - 1;
        }
        if (this.zzZJo) {
            this.zzZIA = iArr[3];
            this.zzZIw = iArr2[3];
            int i4 = iArr3[3];
            if (i4 < 8) {
                this.zzZIs = (1 << i4) - 1;
            }
        }
    }

    @Override // com.aspose.words.internal.zzZIC, com.aspose.words.internal.zzZIS
    public final int zz0(int i) {
        return this.zzZJj ? zzYN(i, 0) : this.zzZIr ? zzYO(i, 0) : (int) ((zzPA(i)[0] * 255.0f) + 0.5f);
    }

    @Override // com.aspose.words.internal.zzZIS
    public final int zzPG(int i) {
        if (this.zzZJj || this.zzZIr) {
            return zzZY(i) | (zzZX(i) << 24) | (zz0(i) << 16) | (zzZZ(i) << 8);
        }
        float[] fArrZzPA = zzPA(i);
        return (zzZX(i) << 24) | (((int) ((fArrZzPA[0] * 255.0f) + 0.5f)) << 16) | (((int) ((fArrZzPA[1] * 255.0f) + 0.5f)) << 8) | ((int) ((fArrZzPA[2] * 255.0f) + 0.5f));
    }

    @Override // com.aspose.words.internal.zzZIS
    public final int zzZN(Object obj) {
        int i;
        int i2 = this.zzZJi;
        if (i2 == 0) {
            i = ((byte[]) obj)[0] & 255;
        } else if (i2 == 1) {
            i = ((short[]) obj)[0] & 65535;
        } else {
            if (i2 != 3) {
                throw new UnsupportedOperationException("This method has not been implemented for transferType " + this.zzZJi);
            }
            i = ((int[]) obj)[0];
        }
        return zzPG(i);
    }

    @Override // com.aspose.words.internal.zzZIC, com.aspose.words.internal.zzZIS
    public final int zzZX(int i) {
        if (!this.zzZJo) {
            return 255;
        }
        int i2 = (i & this.zzZIa[3]) >>> this.zzZI9[3];
        float f = this.zzZI8[3];
        return f != 1.0f ? (int) ((i2 * f) + 0.5f) : i2;
    }

    @Override // com.aspose.words.internal.zzZIC, com.aspose.words.internal.zzZIS
    public final int zzZY(int i) {
        return this.zzZJj ? zzYN(i, 2) : this.zzZIr ? zzYO(i, 2) : (int) ((zzPA(i)[2] * 255.0f) + 0.5f);
    }

    @Override // com.aspose.words.internal.zzZIC, com.aspose.words.internal.zzZIS
    public final int zzZZ(int i) {
        return this.zzZJj ? zzYN(i, 1) : this.zzZIr ? zzYO(i, 1) : (int) ((zzPA(i)[1] * 255.0f) + 0.5f);
    }
}
