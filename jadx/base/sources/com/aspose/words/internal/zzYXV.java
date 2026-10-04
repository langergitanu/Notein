package com.aspose.words.internal;

import androidx.core.view.ViewCompat;
import com.aspose.words.WarningType;

/* JADX INFO: loaded from: classes5.dex */
final class zzYXV implements zzYUR {
    private int zzZNm = 8;
    private int zzW6n = 4;
    private boolean zzW6k = true;
    private int[] zzW8f = null;
    private byte[] zzWkD = {9, 6, 3, 2, 8, 11, 1, 7, 10, 4, 14, 15, 12, 0, 13, 5, 3, 7, 14, 9, 8, 10, 15, 0, 5, 2, 6, 12, 11, 4, 13, 1, 14, 4, 6, 2, 11, 3, 13, 8, 12, 15, 5, 10, 0, 7, 1, 9, 14, 7, 10, 12, 13, 1, 3, 9, 0, 2, 11, 4, 15, 8, 5, 6, 11, 5, 1, 9, 8, 13, 15, 0, 14, 4, 2, 3, 12, 7, 10, 6, 3, 10, 13, 12, 1, 2, 0, 11, 7, 5, 9, 4, 8, 15, 14, 6, 1, 13, 2, 9, 7, 10, 6, 0, 8, 12, 4, 5, 15, 3, 11, 14, 11, 10, 15, 5, 0, 12, 14, 8, 6, 2, 3, 9, 1, 7, 13, 4};
    private byte[] zzW6l = new byte[8];
    private byte[] buf = new byte[8];
    private int zzW6m = 0;

    private static int zz6(byte[] bArr, int i) {
        return ((bArr[i + 3] << 24) & ViewCompat.MEASURED_STATE_MASK) + ((bArr[i + 2] << 16) & WarningType.MINOR_FORMATTING_LOSS_CATEGORY) + ((bArr[i + 1] << 8) & 65280) + (bArr[i] & 255);
    }

    private static void zzR(int i, byte[] bArr, int i2) {
        bArr[i2 + 3] = (byte) (i >>> 24);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2] = (byte) i;
    }

    private int zzUE(int i, int i2) {
        int i3 = i2 + i;
        byte[] bArr = this.zzWkD;
        int i4 = bArr[i3 & 15] + (bArr[((i3 >> 4) & 15) + 16] << 4) + (bArr[((i3 >> 8) & 15) + 32] << 8) + (bArr[((i3 >> 12) & 15) + 48] << 12) + (bArr[((i3 >> 16) & 15) + 64] << 16) + (bArr[((i3 >> 20) & 15) + 80] << 20) + (bArr[((i3 >> 24) & 15) + 96] << 24) + (bArr[((i3 >> 28) & 15) + 112] << 28);
        return (i4 << 11) | (i4 >>> 21);
    }

    private static int[] zzWy(byte[] bArr) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
        }
        int[] iArr = new int[8];
        for (int i = 0; i != 8; i++) {
            iArr[i] = zz6(bArr, i * 4);
        }
        return iArr;
    }

    private static byte[] zzY(byte[] bArr, int i, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length - i];
        System.arraycopy(bArr, i, bArr3, 0, bArr2.length);
        for (int i2 = 0; i2 != bArr2.length; i2++) {
            bArr3[i2] = (byte) (bArr3[i2] ^ bArr2[i2]);
        }
        return bArr3;
    }

    @Override // com.aspose.words.internal.zzYUR
    public final int doFinal(byte[] bArr, int i) throws IllegalStateException, zzYV0 {
        while (true) {
            int i2 = this.zzW6m;
            if (i2 >= this.zzZNm) {
                break;
            }
            this.buf[i2] = 0;
            this.zzW6m = i2 + 1;
        }
        byte[] bArr2 = this.buf;
        byte[] bArrZzY = new byte[bArr2.length];
        System.arraycopy(bArr2, 0, bArrZzY, 0, this.zzW6l.length);
        if (this.zzW6k) {
            this.zzW6k = false;
        } else {
            bArrZzY = zzY(this.buf, 0, this.zzW6l);
        }
        zzZ(this.zzW8f, bArrZzY, this.zzW6l);
        byte[] bArr3 = this.zzW6l;
        int length = bArr3.length / 2;
        int i3 = this.zzW6n;
        System.arraycopy(bArr3, length - i3, bArr, 0, i3);
        reset();
        return this.zzW6n;
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = this.buf;
            if (i >= bArr.length) {
                this.zzW6m = 0;
                this.zzW6k = true;
                return;
            } else {
                bArr[i] = 0;
                i++;
            }
        }
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void update(byte b) throws IllegalStateException {
        int i = this.zzW6m;
        byte[] bArr = this.buf;
        if (i == bArr.length) {
            byte[] bArrZzY = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArrZzY, 0, this.zzW6l.length);
            if (this.zzW6k) {
                this.zzW6k = false;
            } else {
                bArrZzY = zzY(this.buf, 0, this.zzW6l);
            }
            zzZ(this.zzW8f, bArrZzY, this.zzW6l);
            this.zzW6m = 0;
        }
        byte[] bArr2 = this.buf;
        int i2 = this.zzW6m;
        this.zzW6m = i2 + 1;
        bArr2[i2] = b;
    }

    @Override // com.aspose.words.internal.zzYUR
    public final int zzXDn() {
        return this.zzW6n;
    }

    @Override // com.aspose.words.internal.zzYUR
    public final String zzXGi() {
        return "GOST28147Mac";
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void zzZ(zzYV3 zzyv3) throws IllegalArgumentException {
        reset();
        this.buf = new byte[this.zzZNm];
        if (!(zzyv3 instanceof zzYXU)) {
            if (!(zzyv3 instanceof zzYS8)) {
                throw new IllegalArgumentException("invalid parameter passed to GOST28147 init - ".concat(zzyv3.getClass().getName()));
            }
            this.zzW8f = zzWy(((zzYS8) zzyv3).getKey());
        } else {
            zzYXU zzyxu = (zzYXU) zzyv3;
            if (zzyxu.zzXDo() != null) {
                System.arraycopy(zzyxu.zzXDo(), 0, this.zzWkD, 0, zzyxu.zzXDo().length);
            }
            if (zzyxu.getKey() != null) {
                this.zzW8f = zzWy(zzyxu.getKey());
            }
        }
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void update(byte[] bArr, int i, int i2) throws IllegalStateException, zzYV0 {
        if (i2 >= 0) {
            int i3 = this.zzZNm;
            int i4 = this.zzW6m;
            int i5 = i3 - i4;
            if (i2 > i5) {
                System.arraycopy(bArr, i, this.buf, i4, i5);
                byte[] bArr2 = this.buf;
                byte[] bArrZzY = new byte[bArr2.length];
                System.arraycopy(bArr2, 0, bArrZzY, 0, this.zzW6l.length);
                if (this.zzW6k) {
                    this.zzW6k = false;
                } else {
                    bArrZzY = zzY(this.buf, 0, this.zzW6l);
                }
                zzZ(this.zzW8f, bArrZzY, this.zzW6l);
                this.zzW6m = 0;
                while (true) {
                    i2 -= i5;
                    i += i5;
                    if (i2 <= this.zzZNm) {
                        break;
                    }
                    zzZ(this.zzW8f, zzY(bArr, i, this.zzW6l), this.zzW6l);
                    i5 = this.zzZNm;
                }
            }
            System.arraycopy(bArr, i, this.buf, this.zzW6m, i2);
            this.zzW6m += i2;
            return;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }

    private void zzZ(int[] iArr, byte[] bArr, byte[] bArr2) {
        int iZz6 = zz6(bArr, 0);
        int iZz62 = zz6(bArr, 4);
        for (int i = 0; i < 2; i++) {
            int i2 = 0;
            while (i2 < 8) {
                int iZzUE = iZz62 ^ zzUE(iZz6, iArr[i2]);
                i2++;
                int i3 = iZz6;
                iZz6 = iZzUE;
                iZz62 = i3;
            }
        }
        zzR(iZz6, bArr2, 0);
        zzR(iZz62, bArr2, 4);
    }
}
