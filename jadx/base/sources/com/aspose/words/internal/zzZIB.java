package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZIB extends zzZIP {
    public zzZIB(int i, int i2, int i3, int i4, int i5, int[] iArr) {
        super(i, i2, i3, i4, i5, iArr);
        int iMax = this.zzZIV[0];
        int i6 = 1;
        int iMin = iMax;
        while (true) {
            int[] iArr2 = this.zzZIV;
            if (i6 >= iArr2.length) {
                break;
            }
            iMin = Math.min(iMin, iArr2[i6]);
            iMax = Math.max(iMax, this.zzZIV[i6]);
            i6++;
        }
        int i7 = iMax - iMin;
        if (i7 > i5) {
            throw new IllegalArgumentException("Offsets between bands must be less than the scanline stride");
        }
        if (i2 * i4 > i5) {
            throw new IllegalArgumentException("Pixel stride times width must be less than or equal to the scanline stride");
        }
        if (i4 < i7) {
            throw new IllegalArgumentException("Pixel stride must be greater than or equal to the offsets between bands");
        }
    }

    @Override // com.aspose.words.internal.zzZIP, com.aspose.words.internal.zzZIA
    public final zzZIA zzH(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = this.zzZIV[iArr[i]];
        }
        return new zzZIB(this.zzZIP, this.width, this.height, this.zzZIR, this.zzZIS, iArr2);
    }

    @Override // com.aspose.words.internal.zzZIA
    public final zzZIA zzYR(int i, int i2) {
        int[] iArr;
        int[] iArr2 = this.zzZIV;
        int i3 = iArr2[0];
        int length = iArr2.length;
        for (int i4 = 1; i4 < length; i4++) {
            int i5 = this.zzZIV[i4];
            if (i5 < i3) {
                i3 = i5;
            }
        }
        if (i3 > 0) {
            iArr = new int[length];
            for (int i6 = 0; i6 < length; i6++) {
                iArr[i6] = this.zzZIV[i6] - i3;
            }
        } else {
            iArr = this.zzZIV;
        }
        int[] iArr3 = iArr;
        int i7 = this.zzZIP;
        int i8 = this.zzZIR;
        return new zzZIB(i7, i, i2, i8, i8 * i, iArr3);
    }
}
