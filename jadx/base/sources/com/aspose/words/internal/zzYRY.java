package com.aspose.words.internal;

import androidx.appcompat.widget.C21532OooOOo;

/* JADX INFO: loaded from: classes5.dex */
public class zzYRY implements zzYUH {
    private byte[] zzVXB;
    private byte[] zzVXC;
    private byte[] zzVXD;
    private boolean zzVXE;
    private int zzVXF;
    private byte[] zzVXH;
    private int zzVXI;
    private zzYVC zzWbH;
    private int zzWeI;
    private zzYUX zzWkt;
    private byte[] zzZNn;

    public zzYRY(zzYVC zzyvc, zzYUX zzyux, boolean z) {
        this.zzWbH = zzyvc;
        this.zzWkt = zzyux;
        if (z) {
            this.zzWeI = 188;
            return;
        }
        Integer numZzV = zzYRT.zzV(zzyux);
        if (numZzV != null) {
            this.zzWeI = numZzV.intValue();
        } else {
            throw new IllegalArgumentException("no valid trailer for digest: " + zzyux.zzXGi());
        }
    }

    private void reset() {
        this.zzWkt.reset();
        this.zzVXF = 0;
        zzWM(this.zzVXH);
        byte[] bArr = this.zzVXD;
        if (bArr != null) {
            zzWM(bArr);
        }
        this.zzVXD = null;
        this.zzVXE = false;
        if (this.zzVXC != null) {
            this.zzVXC = null;
            zzWM(this.zzVXB);
            this.zzVXB = null;
        }
    }

    private boolean zzVY(byte[] bArr) {
        this.zzVXF = 0;
        zzWM(this.zzVXH);
        zzWM(bArr);
        return false;
    }

    private static void zzWM(byte[] bArr) {
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    private boolean zzu(byte[] bArr, byte[] bArr2) {
        boolean z;
        int i = this.zzVXF;
        byte[] bArr3 = this.zzVXH;
        if (i > bArr3.length) {
            z = bArr3.length <= bArr2.length;
            for (int i2 = 0; i2 != this.zzVXH.length; i2++) {
                if (bArr[i2] != bArr2[i2]) {
                    z = false;
                }
            }
            return z;
        }
        z = i == bArr2.length;
        for (int i3 = 0; i3 != bArr2.length; i3++) {
            if (bArr[i3] != bArr2[i3]) {
                z = false;
            }
        }
        return z;
    }

    @Override // com.aspose.words.internal.zzYUI
    public final void update(byte b) {
        this.zzWkt.update(b);
        int i = this.zzVXF;
        byte[] bArr = this.zzVXH;
        if (i < bArr.length) {
            bArr[i] = b;
        }
        this.zzVXF = i + 1;
    }

    @Override // com.aspose.words.internal.zzYUI
    public final boolean zzWX(byte[] bArr) {
        byte[] bArrZzy;
        int i;
        byte[] bArr2 = this.zzVXC;
        if (bArr2 == null) {
            try {
                bArrZzy = this.zzWbH.zzy(bArr, 0, bArr.length);
            } catch (Exception unused) {
                return false;
            }
        } else {
            if (!zzYGU.zzp(bArr2, bArr)) {
                throw new IllegalStateException("updateWithRecoveredMessage called on different signature");
            }
            bArrZzy = this.zzVXB;
            this.zzVXC = null;
            this.zzVXB = null;
        }
        if (((bArrZzy[0] & 192) ^ 64) == 0 && ((bArrZzy[bArrZzy.length - 1] & 15) ^ 12) == 0) {
            if (((bArrZzy[bArrZzy.length - 1] & 255) ^ 188) == 0) {
                i = 1;
            } else {
                i = 2;
                int i2 = ((bArrZzy[bArrZzy.length - 2] & 255) << 8) | (bArrZzy[bArrZzy.length - 1] & 255);
                Integer numZzV = zzYRT.zzV(this.zzWkt);
                if (numZzV == null) {
                    throw new IllegalArgumentException("unrecognised hash in signature");
                }
                int iIntValue = numZzV.intValue();
                if (i2 != iIntValue && (iIntValue != 15052 || i2 != 16588)) {
                    throw new IllegalStateException(C21532OooOOo.OooO0OO(i2, "signer initialised with wrong digest for trailer "));
                }
            }
            int i3 = 0;
            while (i3 != bArrZzy.length && ((bArrZzy[i3] & 15) ^ 10) != 0) {
                i3++;
            }
            int i4 = i3 + 1;
            int iZzQI = this.zzWkt.zzQI();
            byte[] bArr3 = new byte[iZzQI];
            int length = (bArrZzy.length - i) - iZzQI;
            int i5 = length - i4;
            if (i5 <= 0) {
                return zzVY(bArrZzy);
            }
            if ((bArrZzy[0] & 32) == 0) {
                this.zzVXE = true;
                if (this.zzVXF > i5) {
                    return zzVY(bArrZzy);
                }
                this.zzWkt.reset();
                this.zzWkt.update(bArrZzy, i4, i5);
                this.zzWkt.doFinal(bArr3, 0);
                boolean z = true;
                for (int i6 = 0; i6 != iZzQI; i6++) {
                    int i7 = length + i6;
                    byte b = (byte) (bArrZzy[i7] ^ bArr3[i6]);
                    bArrZzy[i7] = b;
                    if (b != 0) {
                        z = false;
                    }
                }
                if (!z) {
                    return zzVY(bArrZzy);
                }
                byte[] bArr4 = new byte[i5];
                this.zzVXD = bArr4;
                System.arraycopy(bArrZzy, i4, bArr4, 0, bArr4.length);
            } else {
                this.zzVXE = false;
                this.zzWkt.doFinal(bArr3, 0);
                boolean z2 = true;
                for (int i8 = 0; i8 != iZzQI; i8++) {
                    int i9 = length + i8;
                    byte b2 = (byte) (bArrZzy[i9] ^ bArr3[i8]);
                    bArrZzy[i9] = b2;
                    if (b2 != 0) {
                        z2 = false;
                    }
                }
                if (!z2) {
                    return zzVY(bArrZzy);
                }
                byte[] bArr5 = new byte[i5];
                this.zzVXD = bArr5;
                System.arraycopy(bArrZzy, i4, bArr5, 0, bArr5.length);
            }
            if (this.zzVXF != 0 && !zzu(this.zzVXH, this.zzVXD)) {
                return zzVY(bArrZzy);
            }
            zzWM(this.zzVXH);
            zzWM(bArrZzy);
            this.zzVXF = 0;
            return true;
        }
        return zzVY(bArrZzy);
    }

    @Override // com.aspose.words.internal.zzYUI
    public final byte[] zzXEp() throws zzYV2 {
        int length;
        int i;
        int i2;
        int i3;
        int iZzQI = this.zzWkt.zzQI();
        if (this.zzWeI == 188) {
            byte[] bArr = this.zzZNn;
            length = (bArr.length - iZzQI) - 1;
            this.zzWkt.doFinal(bArr, length);
            byte[] bArr2 = this.zzZNn;
            bArr2[bArr2.length - 1] = -68;
            i = 8;
        } else {
            byte[] bArr3 = this.zzZNn;
            length = (bArr3.length - iZzQI) - 2;
            this.zzWkt.doFinal(bArr3, length);
            byte[] bArr4 = this.zzZNn;
            int length2 = bArr4.length - 2;
            int i4 = this.zzWeI;
            bArr4[length2] = (byte) (i4 >>> 8);
            bArr4[bArr4.length - 1] = (byte) i4;
            i = 16;
        }
        int i5 = this.zzVXF;
        int i6 = ((((iZzQI + i5) * 8) + i) + 4) - this.zzVXI;
        if (i6 > 0) {
            int i7 = i5 - ((i6 + 7) / 8);
            i2 = length - i7;
            System.arraycopy(this.zzVXH, 0, this.zzZNn, i2, i7);
            this.zzVXD = new byte[i7];
            i3 = 96;
        } else {
            i2 = length - i5;
            System.arraycopy(this.zzVXH, 0, this.zzZNn, i2, i5);
            this.zzVXD = new byte[this.zzVXF];
            i3 = 64;
        }
        int i8 = i2 - 1;
        if (i8 > 0) {
            for (int i9 = i8; i9 != 0; i9--) {
                this.zzZNn[i9] = -69;
            }
            byte[] bArr5 = this.zzZNn;
            bArr5[i8] = (byte) (bArr5[i8] ^ 1);
            bArr5[0] = 11;
            bArr5[0] = (byte) (11 | i3);
        } else {
            byte[] bArr6 = this.zzZNn;
            bArr6[0] = 10;
            bArr6[0] = (byte) (10 | i3);
        }
        zzYVC zzyvc = this.zzWbH;
        byte[] bArr7 = this.zzZNn;
        byte[] bArrZzy = zzyvc.zzy(bArr7, 0, bArr7.length);
        this.zzVXE = (i3 & 32) == 0;
        byte[] bArr8 = this.zzVXH;
        byte[] bArr9 = this.zzVXD;
        System.arraycopy(bArr8, 0, bArr9, 0, bArr9.length);
        zzWM(this.zzVXH);
        zzWM(this.zzZNn);
        this.zzVXF = 0;
        return bArrZzy;
    }

    @Override // com.aspose.words.internal.zzYUI
    public final void zzZ(boolean z, zzYV3 zzyv3) {
        this.zzWbH.zzZ(z, zzyv3);
        int iBitLength = (zzyv3 instanceof zzYS1 ? (zzYS1) zzyv3 : (zzYS1) ((zzYS3) zzyv3).zzXC6()).getModulus().bitLength();
        this.zzVXI = iBitLength;
        this.zzZNn = new byte[(iBitLength + 7) / 8];
        if (this.zzWeI == 188) {
            this.zzVXH = new byte[(r2.length - this.zzWkt.zzQI()) - 2];
        } else {
            this.zzVXH = new byte[(r2.length - this.zzWkt.zzQI()) - 3];
        }
        reset();
    }

    @Override // com.aspose.words.internal.zzYUI
    public final void update(byte[] bArr, int i, int i2) {
        while (i2 > 0 && this.zzVXF < this.zzVXH.length) {
            update(bArr[i]);
            i++;
            i2--;
        }
        this.zzWkt.update(bArr, i, i2);
        this.zzVXF += i2;
    }
}
