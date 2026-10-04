package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
class zzT6 extends zzKR {
    private int zzQg;
    private int[][] zzQh;

    public zzT6(int[][] iArr) {
        this.zzQh = iArr;
        zzTr();
    }

    private void zzTr() {
        this.zzQg = 0;
        int length = this.zzQh.length;
        for (int i = 0; i < length; i++) {
            for (int i2 : this.zzQh[i]) {
                this.zzQg += i2;
            }
        }
    }

    @Override // com.aspose.words.internal.zzKR
    public final void zzX(int i, byte[] bArr, int i2) {
        int[] iArr = this.zzQh[0];
        int length = iArr.length;
        int i3 = 0;
        int i4 = 1;
        while (true) {
            int i5 = 255;
            if (i3 >= length || this.f50784X + i4 >= this.zzCu) {
                break;
            }
            int i6 = i2 + i4;
            int i7 = ((iArr[i3] * i) / this.zzQg) + (bArr[i6] & 255);
            if (i7 < 0) {
                i5 = 0;
            } else if (i7 <= 255) {
                i5 = i7;
            }
            bArr[i6] = (byte) i5;
            i4++;
            i3++;
        }
        int length2 = this.zzQh.length;
        for (int i8 = 1; i8 < length2 && this.zzCv + i8 < this.zzCt; i8++) {
            i2 += this.zzCs;
            int[] iArr2 = this.zzQh[i8];
            int i9 = -(iArr2.length >> 1);
            for (int i10 : iArr2) {
                int i11 = this.f50784X;
                if (i11 + i9 < this.zzCu) {
                    if (i11 + i9 >= 0) {
                        int i12 = i2 + i9;
                        int i13 = ((i10 * i) / this.zzQg) + (bArr[i12] & 255);
                        if (i13 < 0) {
                            i13 = 0;
                        } else if (i13 > 255) {
                            i13 = 255;
                        }
                        bArr[i12] = (byte) i13;
                    }
                    i9++;
                }
            }
        }
    }
}
