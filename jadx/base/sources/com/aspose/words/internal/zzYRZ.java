package com.aspose.words.internal;

import androidx.appcompat.widget.C21532OooOOo;
import com.google.common.base.Ascii;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public class zzYRZ implements zzYUH {
    private int zzVXA;
    private byte[] zzVXB;
    private byte[] zzVXC;
    private byte[] zzVXD;
    private boolean zzVXE;
    private int zzVXF;
    private boolean zzVXG;
    private byte[] zzVXH;
    private int zzVXI;
    private byte[] zzVXJ;
    private int zzVXz;
    private zzYVC zzWbH;
    private int zzWeI;
    private int zzWeK;
    private int zzWk2;
    private SecureRandom zzWk5;
    private zzYUX zzWkt;
    private byte[] zzZNn;

    public zzYRZ(zzYVC zzyvc, zzYUX zzyux, int i, boolean z) {
        this.zzWbH = zzyvc;
        this.zzWkt = zzyux;
        this.zzWk2 = zzyux.zzQI();
        this.zzWeK = i;
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
        byte[] bArr = this.zzVXH;
        if (bArr != null) {
            zzWM(bArr);
        }
        byte[] bArr2 = this.zzVXD;
        if (bArr2 != null) {
            zzWM(bArr2);
            this.zzVXD = null;
        }
        this.zzVXE = false;
        if (this.zzVXC != null) {
            this.zzVXC = null;
            zzWM(this.zzVXB);
            this.zzVXB = null;
        }
        this.zzVXG = false;
    }

    private byte[] zzS(byte[] bArr, int i, int i2, int i3) {
        int i4;
        byte[] bArr2 = new byte[i3];
        byte[] bArr3 = new byte[this.zzWk2];
        byte[] bArr4 = new byte[4];
        this.zzWkt.reset();
        int i5 = 0;
        while (true) {
            i4 = this.zzWk2;
            if (i5 >= i3 / i4) {
                break;
            }
            zzU(i5, bArr4);
            this.zzWkt.update(bArr, i, i2);
            this.zzWkt.update(bArr4, 0, 4);
            this.zzWkt.doFinal(bArr3, 0);
            int i6 = this.zzWk2;
            System.arraycopy(bArr3, 0, bArr2, i5 * i6, i6);
            i5++;
        }
        if (i4 * i5 < i3) {
            zzU(i5, bArr4);
            this.zzWkt.update(bArr, i, i2);
            this.zzWkt.update(bArr4, 0, 4);
            this.zzWkt.doFinal(bArr3, 0);
            int i7 = this.zzWk2;
            System.arraycopy(bArr3, 0, bArr2, i5 * i7, i3 - (i5 * i7));
        }
        return bArr2;
    }

    private static void zzU(int i, byte[] bArr) {
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
    }

    private void zzVZ(byte[] bArr) throws zzYUT {
        int i;
        byte[] bArrZzy = this.zzWbH.zzy(bArr, 0, bArr.length);
        int length = bArrZzy.length;
        int i2 = this.zzVXI;
        if (length < (i2 + 7) / 8) {
            int i3 = (i2 + 7) / 8;
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArrZzy, 0, bArr2, i3 - bArrZzy.length, bArrZzy.length);
            zzWM(bArrZzy);
            bArrZzy = bArr2;
        }
        if (((bArrZzy[bArrZzy.length - 1] & 255) ^ 188) == 0) {
            i = 1;
        } else {
            i = 2;
            int i4 = ((bArrZzy[bArrZzy.length - 2] & 255) << 8) | (bArrZzy[bArrZzy.length - 1] & 255);
            Integer numZzV = zzYRT.zzV(this.zzWkt);
            if (numZzV == null) {
                throw new IllegalArgumentException("unrecognized hash in signature");
            }
            int iIntValue = numZzV.intValue();
            if (i4 != iIntValue && (iIntValue != 15052 || i4 != 16588)) {
                throw new IllegalStateException(C21532OooOOo.OooO0OO(i4, "signer initialized with wrong digest for trailer "));
            }
        }
        this.zzWkt.doFinal(new byte[this.zzWk2], 0);
        int length2 = bArrZzy.length;
        int i5 = this.zzWk2;
        byte[] bArrZzS = zzS(bArrZzy, (length2 - i5) - i, i5, (bArrZzy.length - i5) - i);
        for (int i6 = 0; i6 != bArrZzS.length; i6++) {
            bArrZzy[i6] = (byte) (bArrZzy[i6] ^ bArrZzS[i6]);
        }
        bArrZzy[0] = (byte) (bArrZzy[0] & Ascii.DEL);
        int i7 = 0;
        while (i7 != bArrZzy.length && bArrZzy[i7] != 1) {
            i7++;
        }
        int i8 = i7 + 1;
        if (i8 >= bArrZzy.length) {
            zzWM(bArrZzy);
        }
        this.zzVXE = i8 > 1;
        byte[] bArr3 = new byte[(bArrZzS.length - i8) - this.zzWeK];
        this.zzVXD = bArr3;
        System.arraycopy(bArrZzy, i8, bArr3, 0, bArr3.length);
        byte[] bArr4 = this.zzVXD;
        System.arraycopy(bArr4, 0, this.zzVXH, 0, bArr4.length);
        this.zzVXC = bArr;
        this.zzVXB = bArrZzy;
        this.zzVXA = i8;
        this.zzVXz = i;
    }

    private static void zzWM(byte[] bArr) {
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    private static void zzY(long j, byte[] bArr) {
        bArr[0] = (byte) (j >>> 56);
        bArr[1] = (byte) (j >>> 48);
        bArr[2] = (byte) (j >>> 40);
        bArr[3] = (byte) (j >>> 32);
        bArr[4] = (byte) (j >>> 24);
        bArr[5] = (byte) (j >>> 16);
        bArr[6] = (byte) (j >>> 8);
        bArr[7] = (byte) j;
    }

    private boolean zzu(byte[] bArr, byte[] bArr2) {
        boolean z = this.zzVXF == bArr2.length;
        for (int i = 0; i != bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                z = false;
            }
        }
        return z;
    }

    @Override // com.aspose.words.internal.zzYUI
    public final void update(byte b) {
        if (this.zzVXC == null) {
            int i = this.zzVXF;
            byte[] bArr = this.zzVXH;
            if (i < bArr.length) {
                this.zzVXF = i + 1;
                bArr[i] = b;
                return;
            }
        }
        this.zzVXG = true;
        this.zzWkt.update(b);
    }

    @Override // com.aspose.words.internal.zzYUI
    public final boolean zzWX(byte[] bArr) {
        int i = this.zzWk2;
        byte[] bArr2 = new byte[i];
        this.zzWkt.doFinal(bArr2, 0);
        byte[] bArr3 = this.zzVXC;
        if (bArr3 == null) {
            try {
                zzVZ(bArr);
            } catch (Exception unused) {
                return false;
            }
        } else if (!zzYGU.zzp(bArr3, bArr)) {
            throw new IllegalStateException("updateWithRecoveredMessage called on different signature");
        }
        byte[] bArr4 = this.zzVXB;
        int i2 = this.zzVXA;
        int i3 = this.zzVXz;
        this.zzVXC = null;
        this.zzVXB = null;
        byte[] bArr5 = new byte[8];
        zzY(((long) this.zzVXD.length) * 8, bArr5);
        this.zzWkt.update(bArr5, 0, 8);
        byte[] bArr6 = this.zzVXD;
        if (bArr6.length != 0) {
            this.zzWkt.update(bArr6, 0, bArr6.length);
        }
        this.zzWkt.update(bArr2, 0, i);
        byte[] bArr7 = this.zzVXJ;
        if (bArr7 != null) {
            this.zzWkt.update(bArr7, 0, bArr7.length);
        } else {
            this.zzWkt.update(bArr4, i2 + this.zzVXD.length, this.zzWeK);
        }
        int iZzQI = this.zzWkt.zzQI();
        byte[] bArr8 = new byte[iZzQI];
        this.zzWkt.doFinal(bArr8, 0);
        int length = (bArr4.length - i3) - iZzQI;
        boolean z = true;
        for (int i4 = 0; i4 != iZzQI; i4++) {
            if (bArr8[i4] != bArr4[length + i4]) {
                z = false;
            }
        }
        zzWM(bArr4);
        zzWM(bArr8);
        if (!z) {
            this.zzVXE = false;
            this.zzVXF = 0;
            zzWM(this.zzVXD);
            return false;
        }
        if (this.zzVXF == 0 || zzu(this.zzVXH, this.zzVXD)) {
            this.zzVXF = 0;
            zzWM(this.zzVXH);
            return true;
        }
        this.zzVXF = 0;
        zzWM(this.zzVXH);
        return false;
    }

    @Override // com.aspose.words.internal.zzYUI
    public final byte[] zzXEp() throws zzYV2 {
        int iZzQI = this.zzWkt.zzQI();
        byte[] bArr = new byte[iZzQI];
        this.zzWkt.doFinal(bArr, 0);
        byte[] bArr2 = new byte[8];
        zzY(((long) this.zzVXF) * 8, bArr2);
        this.zzWkt.update(bArr2, 0, 8);
        this.zzWkt.update(this.zzVXH, 0, this.zzVXF);
        this.zzWkt.update(bArr, 0, iZzQI);
        byte[] bArr3 = this.zzVXJ;
        if (bArr3 == null) {
            bArr3 = new byte[this.zzWeK];
            this.zzWk5.nextBytes(bArr3);
        }
        this.zzWkt.update(bArr3, 0, bArr3.length);
        int iZzQI2 = this.zzWkt.zzQI();
        byte[] bArr4 = new byte[iZzQI2];
        this.zzWkt.doFinal(bArr4, 0);
        int i = this.zzWeI == 188 ? 1 : 2;
        byte[] bArr5 = this.zzZNn;
        int length = bArr5.length;
        int i2 = this.zzVXF;
        int length2 = (((length - i2) - bArr3.length) - this.zzWk2) - i;
        bArr5[length2 - 1] = 1;
        System.arraycopy(this.zzVXH, 0, bArr5, length2, i2);
        System.arraycopy(bArr3, 0, this.zzZNn, length2 + this.zzVXF, bArr3.length);
        byte[] bArrZzS = zzS(bArr4, 0, iZzQI2, (this.zzZNn.length - this.zzWk2) - i);
        for (int i3 = 0; i3 != bArrZzS.length; i3++) {
            byte[] bArr6 = this.zzZNn;
            bArr6[i3] = (byte) (bArr6[i3] ^ bArrZzS[i3]);
        }
        byte[] bArr7 = this.zzZNn;
        int length3 = bArr7.length;
        int i4 = this.zzWk2;
        System.arraycopy(bArr4, 0, bArr7, (length3 - i4) - i, i4);
        int i5 = this.zzWeI;
        if (i5 == 188) {
            byte[] bArr8 = this.zzZNn;
            bArr8[bArr8.length - 1] = -68;
        } else {
            byte[] bArr9 = this.zzZNn;
            bArr9[bArr9.length - 2] = (byte) (i5 >>> 8);
            bArr9[bArr9.length - 1] = (byte) i5;
        }
        byte[] bArr10 = this.zzZNn;
        bArr10[0] = (byte) (bArr10[0] & Ascii.DEL);
        byte[] bArrZzy = this.zzWbH.zzy(bArr10, 0, bArr10.length);
        byte[] bArr11 = new byte[this.zzVXF];
        this.zzVXD = bArr11;
        this.zzVXE = !this.zzVXG;
        System.arraycopy(this.zzVXH, 0, bArr11, 0, bArr11.length);
        zzWM(this.zzVXH);
        zzWM(this.zzZNn);
        this.zzVXF = 0;
        return bArrZzy;
    }

    @Override // com.aspose.words.internal.zzYUI
    public final void zzZ(boolean z, zzYV3 zzyv3) {
        zzYS1 zzys1;
        int i = this.zzWeK;
        if (zzyv3 instanceof zzYS3) {
            zzYS3 zzys3 = (zzYS3) zzyv3;
            zzys1 = (zzYS1) zzys3.zzXC6();
            if (z) {
                this.zzWk5 = zzys3.zzXCJ();
            }
        } else {
            zzys1 = (zzYS1) zzyv3;
            if (z) {
                throw new IllegalArgumentException("No SecureRandom provided when one required");
            }
        }
        if (z) {
            this.zzWbH.zzZ(z, new zzYS3(zzys1, this.zzWk5));
        } else {
            this.zzWbH.zzZ(z, zzys1);
        }
        int iBitLength = zzys1.getModulus().bitLength();
        this.zzVXI = iBitLength;
        this.zzZNn = new byte[(iBitLength + 7) / 8];
        if (this.zzWeI == 188) {
            this.zzVXH = new byte[((r5.length - this.zzWkt.zzQI()) - i) - 2];
        } else {
            this.zzVXH = new byte[((r5.length - this.zzWkt.zzQI()) - i) - 3];
        }
        reset();
    }

    @Override // com.aspose.words.internal.zzYUI
    public final void update(byte[] bArr, int i, int i2) {
        if (this.zzVXC == null) {
            while (i2 > 0 && this.zzVXF < this.zzVXH.length) {
                update(bArr[i]);
                i++;
                i2--;
            }
        }
        if (i2 > 0) {
            this.zzVXG = true;
            this.zzWkt.update(bArr, i, i2);
        }
    }

    public zzYRZ(zzYVC zzyvc, zzYUX zzyux, byte[] bArr, boolean z) {
        this.zzWbH = zzyvc;
        this.zzWkt = zzyux;
        this.zzWk2 = zzyux.zzQI();
        this.zzWeK = bArr.length;
        this.zzVXJ = bArr;
        if (z) {
            this.zzWeI = 188;
            return;
        }
        Integer numZzV = zzYRT.zzV(zzyux);
        if (numZzV != null) {
            this.zzWeI = numZzV.intValue();
            return;
        }
        throw new IllegalArgumentException("no valid trailer for digest");
    }
}
