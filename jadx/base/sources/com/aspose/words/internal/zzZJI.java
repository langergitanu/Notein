package com.aspose.words.internal;

import androidx.core.app.FrameMetricsAggregator;
import com.aspose.words.StyleIdentifier;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZJI extends zzZJN {
    private static final int[] zzZL0 = {FrameMetricsAggregator.EVERY_DURATION, 1023, 2047, 4095};
    int zzZKU;
    byte[][] zzZKV;
    int zzZKW;
    int zzZKX;
    byte[] zzZKY;
    byte[] zzZKZ;
    int zzZKT = 9;
    int zzZKS = 0;
    int zzZKR = 0;

    private static byte[] zzW(byte[] bArr, byte b) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        bArr2[length] = b;
        return bArr2;
    }

    private int zzY(byte[] bArr, byte[] bArr2, int i) throws IOException {
        if (bArr[0] == 0 && bArr[1] == 1) {
            throw new IOException("TIFF 5.0-style LZW compression is not supported!");
        }
        this.zzZKZ = bArr;
        this.zzZKY = bArr2;
        this.zzZKX = 0;
        this.zzZKW = i;
        this.zzZKS = 0;
        this.zzZKR = 0;
        zzdk();
        int iZzdj = 0;
        while (true) {
            int iZzdj2 = zzdj();
            if (iZzdj2 == 257) {
                break;
            }
            if (iZzdj2 == 256) {
                zzdk();
                iZzdj = zzdj();
                if (iZzdj == 257) {
                    break;
                }
                zzYL(this.zzZKV[iZzdj]);
            } else {
                if (iZzdj2 < this.zzZKU) {
                    byte[] bArr3 = this.zzZKV[iZzdj2];
                    zzYL(bArr3);
                    zzX(this.zzZKV[iZzdj], bArr3[0]);
                } else {
                    byte[] bArr4 = this.zzZKV[iZzdj];
                    byte[] bArrZzW = zzW(bArr4, bArr4[0]);
                    zzYL(bArrZzW);
                    zzYK(bArrZzW);
                }
                iZzdj = iZzdj2;
            }
        }
        if (this.zzil == 2) {
            for (int i2 = 0; i2 < this.zzZLF; i2++) {
                int i3 = this.zzZMi;
                int i4 = (((this.zzZLG * i2) + 1) * i3) + i;
                while (true) {
                    int i5 = this.zzZLG;
                    int i6 = this.zzZMi;
                    if (i3 < i5 * i6) {
                        byte[] bArr5 = this.zzZKY;
                        bArr5[i4] = (byte) (bArr5[i4] + bArr5[i4 - i6]);
                        i4++;
                        i3++;
                    }
                }
            }
        }
        return this.zzZKW - i;
    }

    private void zzYK(byte[] bArr) {
        byte[][] bArr2 = this.zzZKV;
        int i = this.zzZKU;
        int i2 = i + 1;
        this.zzZKU = i2;
        bArr2[i] = bArr;
        if (i2 == 511) {
            this.zzZKT = 10;
        } else if (i2 == 1023) {
            this.zzZKT = 11;
        } else if (i2 == 2047) {
            this.zzZKT = 12;
        }
    }

    private void zzYL(byte[] bArr) {
        int i = this.zzZKW;
        byte[] bArr2 = this.zzZKY;
        if (i < bArr2.length) {
            int iMin = Math.min(bArr.length, bArr2.length - i);
            for (int i2 = 0; i2 < iMin; i2++) {
                byte[] bArr3 = this.zzZKY;
                int i3 = this.zzZKW;
                this.zzZKW = i3 + 1;
                bArr3[i3] = bArr[i2];
            }
        }
    }

    private int zzdj() {
        try {
            int i = this.zzZKS << 8;
            byte[] bArr = this.zzZKZ;
            int i2 = this.zzZKX;
            int i3 = i2 + 1;
            this.zzZKX = i3;
            int i4 = i | (bArr[i2] & 255);
            this.zzZKS = i4;
            int i5 = this.zzZKR;
            int i6 = i5 + 8;
            this.zzZKR = i6;
            int i7 = this.zzZKT;
            if (i6 < i7) {
                this.zzZKX = i2 + 2;
                this.zzZKS = (i4 << 8) | (bArr[i3] & 255);
                this.zzZKR = i5 + 16;
            }
            int i8 = this.zzZKS;
            int i9 = this.zzZKR;
            int i10 = (i8 >> (i9 - i7)) & zzZL0[i7 - 9];
            this.zzZKR = i9 - i7;
            return i10;
        } catch (ArrayIndexOutOfBoundsException unused) {
            return 257;
        }
    }

    private void zzdk() {
        this.zzZKV = new byte[4096][];
        for (int i = 0; i < 256; i++) {
            this.zzZKV[i] = new byte[]{(byte) i};
        }
        this.zzZKU = StyleIdentifier.COLORFUL_LIST_ACCENT_6;
        this.zzZKT = 9;
    }

    @Override // com.aspose.words.internal.zzZJN
    public final void zzX(byte[] bArr, int i, int i2, int i3) throws Exception {
        this.zzN5.zzH(this.zzDs);
        byte[] bArr2 = new byte[this.zz8r];
        this.zzZMs.readFully(bArr2);
        zzY(bArr2, bArr, i);
    }

    private void zzX(byte[] bArr, byte b) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        bArr2[length] = b;
        byte[][] bArr3 = this.zzZKV;
        int i = this.zzZKU;
        int i2 = i + 1;
        this.zzZKU = i2;
        bArr3[i] = bArr2;
        if (i2 == 511) {
            this.zzZKT = 10;
        } else if (i2 == 1023) {
            this.zzZKT = 11;
        } else if (i2 == 2047) {
            this.zzZKT = 12;
        }
    }
}
