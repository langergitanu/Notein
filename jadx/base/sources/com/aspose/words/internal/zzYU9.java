package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYU9 implements zzYVC {
    private zzYUX zzVZt;
    private byte[] zzVZu;
    private zzYVC zzWeQ;
    private SecureRandom zzWk5;
    private boolean zzWkw;

    public zzYU9(zzYVC zzyvc, zzYUX zzyux) {
        this(zzyvc, zzyux, (byte) 0);
    }

    private byte[] zzS(byte[] bArr, int i, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        int iZzQI = this.zzVZt.zzQI();
        byte[] bArr3 = new byte[iZzQI];
        byte[] bArr4 = new byte[4];
        this.zzVZt.reset();
        int i4 = 0;
        while (i4 < i3 / iZzQI) {
            zzU(i4, bArr4);
            this.zzVZt.update(bArr, i, i2);
            this.zzVZt.update(bArr4, 0, 4);
            this.zzVZt.doFinal(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, i4 * iZzQI, iZzQI);
            i4++;
        }
        int i5 = iZzQI * i4;
        if (i5 < i3) {
            zzU(i4, bArr4);
            this.zzVZt.update(bArr, i, i2);
            this.zzVZt.update(bArr4, 0, 4);
            this.zzVZt.doFinal(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, i5, i3 - i5);
        }
        return bArr2;
    }

    private static void zzU(int i, byte[] bArr) {
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
    }

    private byte[] zzs(byte[] bArr, int i, int i2) throws zzYUT {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArrZzy = this.zzWeQ.zzy(bArr, i, i2);
        int iZzXDX = this.zzWeQ.zzXDX();
        byte[] bArr4 = new byte[iZzXDX];
        boolean z = iZzXDX < (this.zzVZu.length * 2) + 1;
        if (bArrZzy.length <= iZzXDX) {
            System.arraycopy(bArrZzy, 0, bArr4, iZzXDX - bArrZzy.length, bArrZzy.length);
        } else {
            System.arraycopy(bArrZzy, 0, bArr4, 0, iZzXDX);
            z = true;
        }
        byte[] bArr5 = this.zzVZu;
        byte[] bArrZzS = zzS(bArr4, bArr5.length, iZzXDX - bArr5.length, bArr5.length);
        int i3 = 0;
        while (true) {
            bArr2 = this.zzVZu;
            if (i3 == bArr2.length) {
                break;
            }
            bArr4[i3] = (byte) (bArr4[i3] ^ bArrZzS[i3]);
            i3++;
        }
        byte[] bArrZzS2 = zzS(bArr4, 0, bArr2.length, iZzXDX - bArr2.length);
        for (int length = this.zzVZu.length; length != iZzXDX; length++) {
            bArr4[length] = (byte) (bArr4[length] ^ bArrZzS2[length - this.zzVZu.length]);
        }
        int i4 = 0;
        boolean z2 = false;
        while (true) {
            bArr3 = this.zzVZu;
            if (i4 == bArr3.length) {
                break;
            }
            if (bArr3[i4] != bArr4[bArr3.length + i4]) {
                z2 = true;
            }
            i4++;
        }
        int i5 = iZzXDX;
        for (int length2 = bArr3.length * 2; length2 != iZzXDX; length2++) {
            if ((bArr4[length2] != 0) & (i5 == iZzXDX)) {
                i5 = length2;
            }
        }
        boolean z3 = i5 > iZzXDX + (-1);
        boolean z4 = bArr4[i5] != 1;
        int i6 = i5 + 1;
        if ((z3 | z4) || (z | z2)) {
            zzYGU.fill(bArr4, (byte) 0);
            throw new zzYUT("data wrong");
        }
        int i7 = iZzXDX - i6;
        byte[] bArr6 = new byte[i7];
        System.arraycopy(bArr4, i6, bArr6, 0, i7);
        return bArr6;
    }

    private byte[] zzt(byte[] bArr, int i, int i2) throws zzYUT {
        if (i2 > zzXDY()) {
            throw new zzYV0("input data too long");
        }
        int length = (this.zzVZu.length * 2) + zzXDY() + 1;
        byte[] bArr2 = new byte[length];
        int i3 = length - i2;
        System.arraycopy(bArr, i, bArr2, i3, i2);
        bArr2[i3 - 1] = 1;
        byte[] bArr3 = this.zzVZu;
        System.arraycopy(bArr3, 0, bArr2, bArr3.length, bArr3.length);
        int length2 = this.zzVZu.length;
        byte[] bArr4 = new byte[length2];
        this.zzWk5.nextBytes(bArr4);
        byte[] bArrZzS = zzS(bArr4, 0, length2, length - this.zzVZu.length);
        for (int length3 = this.zzVZu.length; length3 != length; length3++) {
            bArr2[length3] = (byte) (bArr2[length3] ^ bArrZzS[length3 - this.zzVZu.length]);
        }
        System.arraycopy(bArr4, 0, bArr2, 0, this.zzVZu.length);
        byte[] bArr5 = this.zzVZu;
        byte[] bArrZzS2 = zzS(bArr2, bArr5.length, length - bArr5.length, bArr5.length);
        for (int i4 = 0; i4 != this.zzVZu.length; i4++) {
            bArr2[i4] = (byte) (bArr2[i4] ^ bArrZzS2[i4]);
        }
        return this.zzWeQ.zzy(bArr2, 0, length);
    }

    @Override // com.aspose.words.internal.zzYVC
    public final int zzXDX() {
        int iZzXDX = this.zzWeQ.zzXDX();
        return this.zzWkw ? iZzXDX : (iZzXDX - 1) - (this.zzVZu.length * 2);
    }

    @Override // com.aspose.words.internal.zzYVC
    public final int zzXDY() {
        int iZzXDY = this.zzWeQ.zzXDY();
        return this.zzWkw ? (iZzXDY - 1) - (this.zzVZu.length * 2) : iZzXDY;
    }

    @Override // com.aspose.words.internal.zzYVC
    public final void zzZ(boolean z, zzYV3 zzyv3) {
        if (zzyv3 instanceof zzYS3) {
            this.zzWk5 = ((zzYS3) zzyv3).zzXCJ();
        } else if (z) {
            throw new IllegalArgumentException("No random provided where one required.");
        }
        this.zzWeQ.zzZ(z, zzyv3);
        this.zzWkw = z;
    }

    @Override // com.aspose.words.internal.zzYVC
    public final byte[] zzy(byte[] bArr, int i, int i2) throws zzYUT {
        return this.zzWkw ? zzt(bArr, i, i2) : zzs(bArr, i, i2);
    }

    private zzYU9(zzYVC zzyvc, zzYUX zzyux, byte b) {
        this(zzyvc, zzyux, zzyux, null);
    }

    public zzYU9(zzYVC zzyvc, zzYUX zzyux, zzYUX zzyux2, byte[] bArr) {
        this.zzWeQ = zzyvc;
        this.zzVZt = zzyux2;
        this.zzVZu = new byte[zzyux.zzQI()];
        zzyux.reset();
        if (bArr != null) {
            zzyux.update(bArr, 0, bArr.length);
        }
        zzyux.doFinal(this.zzVZu, 0);
    }
}
