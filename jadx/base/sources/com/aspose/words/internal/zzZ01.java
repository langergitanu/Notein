package com.aspose.words.internal;

import com.aspose.slides.C22213OooOoOO;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ01 implements zzYUI {
    private byte[] zzWAR;
    private byte[] zzWbC;
    private int zzWbD;
    private boolean zzWbE;
    private int zzWbF;
    private int zzWbG;
    private zzYVC zzWbH;
    private zzYUX zzWbI;
    private zzYUX zzWbJ;
    private int zzWeI;
    private int zzWk2;
    private SecureRandom zzWk5;
    private byte[] zzZNn;

    public zzZ01(zzYVC zzyvc, zzYUX zzyux, zzYUX zzyux2, int i, int i2) {
        this.zzWbH = zzyvc;
        this.zzWbJ = zzyux;
        this.zzWbI = zzyux2;
        this.zzWk2 = zzyux.zzQI();
        this.zzWbG = zzyux2.zzQI();
        this.zzWbF = i;
        this.zzWbE = false;
        this.zzWAR = new byte[i];
        this.zzWbC = new byte[i + 8 + this.zzWk2];
        this.zzWeI = i2;
    }

    private void reset() {
        this.zzWbJ.reset();
    }

    private byte[] zzS(byte[] bArr, int i, int i2, int i3) {
        int i4;
        byte[] bArr2 = new byte[i3];
        byte[] bArr3 = new byte[this.zzWbG];
        byte[] bArr4 = new byte[4];
        this.zzWbI.reset();
        int i5 = 0;
        while (true) {
            i4 = this.zzWbG;
            if (i5 >= i3 / i4) {
                break;
            }
            zzU(i5, bArr4);
            this.zzWbI.update(bArr, i, i2);
            this.zzWbI.update(bArr4, 0, 4);
            this.zzWbI.doFinal(bArr3, 0);
            int i6 = this.zzWbG;
            System.arraycopy(bArr3, 0, bArr2, i5 * i6, i6);
            i5++;
        }
        if (i4 * i5 < i3) {
            zzU(i5, bArr4);
            this.zzWbI.update(bArr, i, i2);
            this.zzWbI.update(bArr4, 0, 4);
            this.zzWbI.doFinal(bArr3, 0);
            int i7 = this.zzWbG;
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

    private static void zzWM(byte[] bArr) {
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    @Override // com.aspose.words.internal.zzYUI
    public final void update(byte b) {
        this.zzWbJ.update(b);
    }

    @Override // com.aspose.words.internal.zzYUI
    public final boolean zzWX(byte[] bArr) throws zzZ5C {
        zzYUX zzyux = this.zzWbJ;
        byte[] bArr2 = this.zzWbC;
        zzyux.doFinal(bArr2, (bArr2.length - this.zzWk2) - this.zzWbF);
        try {
            byte[] bArrZzy = this.zzWbH.zzy(bArr, 0, bArr.length);
            byte[] bArr3 = this.zzZNn;
            System.arraycopy(bArrZzy, 0, bArr3, bArr3.length - bArrZzy.length, bArrZzy.length);
            byte[] bArr4 = this.zzZNn;
            if (bArr4[bArr4.length - 1] != this.zzWeI) {
                zzWM(bArr4);
                return false;
            }
            int length = bArr4.length;
            int i = this.zzWk2;
            byte[] bArrZzS = zzS(bArr4, (length - i) - 1, i, (bArr4.length - i) - 1);
            for (int i2 = 0; i2 != bArrZzS.length; i2++) {
                byte[] bArr5 = this.zzZNn;
                bArr5[i2] = (byte) (bArr5[i2] ^ bArrZzS[i2]);
            }
            byte[] bArr6 = this.zzZNn;
            bArr6[0] = (byte) (bArr6[0] & (255 >> ((bArr6.length * 8) - this.zzWbD)));
            int i3 = 0;
            while (true) {
                byte[] bArr7 = this.zzZNn;
                int length2 = bArr7.length;
                int i4 = this.zzWk2;
                int i5 = this.zzWbF;
                if (i3 != ((length2 - i4) - i5) - 2) {
                    if (bArr7[i3] != 0) {
                        zzWM(bArr7);
                        return false;
                    }
                    i3++;
                } else {
                    if (bArr7[((bArr7.length - i4) - i5) - 2] != 1) {
                        zzWM(bArr7);
                        return false;
                    }
                    if (this.zzWbE) {
                        byte[] bArr8 = this.zzWAR;
                        byte[] bArr9 = this.zzWbC;
                        System.arraycopy(bArr8, 0, bArr9, bArr9.length - i5, i5);
                    } else {
                        int length3 = ((bArr7.length - i5) - i4) - 1;
                        byte[] bArr10 = this.zzWbC;
                        System.arraycopy(bArr7, length3, bArr10, bArr10.length - i5, i5);
                    }
                    zzYUX zzyux2 = this.zzWbJ;
                    byte[] bArr11 = this.zzWbC;
                    zzyux2.update(bArr11, 0, bArr11.length);
                    zzYUX zzyux3 = this.zzWbJ;
                    byte[] bArr12 = this.zzWbC;
                    zzyux3.doFinal(bArr12, bArr12.length - this.zzWk2);
                    int length4 = this.zzZNn.length;
                    int i6 = this.zzWk2;
                    int i7 = (length4 - i6) - 1;
                    int length5 = this.zzWbC.length - i6;
                    while (true) {
                        byte[] bArr13 = this.zzWbC;
                        if (length5 == bArr13.length) {
                            zzWM(bArr13);
                            zzWM(this.zzZNn);
                            return true;
                        }
                        if ((this.zzZNn[i7] ^ bArr13[length5]) != 0) {
                            zzWM(bArr13);
                            zzWM(this.zzZNn);
                            return false;
                        }
                        i7++;
                        length5++;
                    }
                }
            }
        } catch (Exception e) {
            throw new zzZ5C(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("Unable to process signature: ")), e);
        }
    }

    @Override // com.aspose.words.internal.zzYUI
    public final byte[] zzXEp() throws zzYV0, zzYV2 {
        zzYUX zzyux = this.zzWbJ;
        byte[] bArr = this.zzWbC;
        zzyux.doFinal(bArr, (bArr.length - this.zzWk2) - this.zzWbF);
        if (this.zzWbF != 0) {
            if (!this.zzWbE) {
                this.zzWk5.nextBytes(this.zzWAR);
            }
            byte[] bArr2 = this.zzWAR;
            byte[] bArr3 = this.zzWbC;
            int length = bArr3.length;
            int i = this.zzWbF;
            System.arraycopy(bArr2, 0, bArr3, length - i, i);
        }
        int i2 = this.zzWk2;
        byte[] bArr4 = new byte[i2];
        zzYUX zzyux2 = this.zzWbJ;
        byte[] bArr5 = this.zzWbC;
        zzyux2.update(bArr5, 0, bArr5.length);
        this.zzWbJ.doFinal(bArr4, 0);
        byte[] bArr6 = this.zzZNn;
        int length2 = bArr6.length;
        int i3 = this.zzWbF;
        int i4 = this.zzWk2;
        bArr6[(((length2 - i3) - 1) - i4) - 1] = 1;
        System.arraycopy(this.zzWAR, 0, bArr6, ((bArr6.length - i3) - i4) - 1, i3);
        byte[] bArrZzS = zzS(bArr4, 0, i2, (this.zzZNn.length - this.zzWk2) - 1);
        for (int i5 = 0; i5 != bArrZzS.length; i5++) {
            byte[] bArr7 = this.zzZNn;
            bArr7[i5] = (byte) (bArr7[i5] ^ bArrZzS[i5]);
        }
        byte[] bArr8 = this.zzZNn;
        bArr8[0] = (byte) (bArr8[0] & (255 >> ((bArr8.length * 8) - this.zzWbD)));
        int length3 = bArr8.length;
        int i6 = this.zzWk2;
        System.arraycopy(bArr4, 0, bArr8, (length3 - i6) - 1, i6);
        byte[] bArr9 = this.zzZNn;
        bArr9[bArr9.length - 1] = (byte) this.zzWeI;
        byte[] bArrZzy = this.zzWbH.zzy(bArr9, 0, bArr9.length);
        zzWM(this.zzZNn);
        return bArrZzy;
    }

    @Override // com.aspose.words.internal.zzYUI
    public final void zzZ(boolean z, zzYV3 zzyv3) {
        zzYV3 zzyv3ZzXC6;
        if (zzyv3 instanceof zzYS3) {
            zzYS3 zzys3 = (zzYS3) zzyv3;
            zzyv3ZzXC6 = zzys3.zzXC6();
            this.zzWk5 = zzys3.zzXCJ();
        } else {
            if (z && this.zzWAR != null) {
                throw new IllegalArgumentException("No random provided where one required.");
            }
            zzyv3ZzXC6 = zzyv3;
        }
        this.zzWbH.zzZ(z, zzyv3);
        int iBitLength = (zzyv3ZzXC6 instanceof zzYZW ? ((zzYZW) zzyv3ZzXC6).zzXDW() : (zzYS1) zzyv3ZzXC6).getModulus().bitLength();
        int i = iBitLength - 1;
        this.zzWbD = i;
        if (i < C22213OooOoOO.OooO0O0(this.zzWbF, 8, this.zzWk2 * 8, 9)) {
            throw new IllegalArgumentException("key too small for specified hash and salt lengths");
        }
        this.zzZNn = new byte[(iBitLength + 6) / 8];
        reset();
    }

    @Override // com.aspose.words.internal.zzYUI
    public final void update(byte[] bArr, int i, int i2) {
        this.zzWbJ.update(bArr, i, i2);
    }

    public zzZ01(zzYVC zzyvc, zzYUX zzyux, zzYUX zzyux2, byte[] bArr, int i) {
        this.zzWbH = zzyvc;
        this.zzWbJ = zzyux;
        this.zzWbI = zzyux2;
        this.zzWk2 = zzyux.zzQI();
        this.zzWbG = zzyux2.zzQI();
        int length = bArr.length;
        this.zzWbF = length;
        this.zzWbE = true;
        this.zzWAR = bArr;
        this.zzWbC = new byte[length + 8 + this.zzWk2];
        this.zzWeI = i;
    }
}
