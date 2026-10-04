package com.aspose.words.internal;

import androidx.appcompat.widget.C21532OooOOo;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYTM implements zzYTS {
    private int zzVYA;
    private byte[] zzVYB;
    private long zzVYC;
    private int zzVYD;
    private byte[] zzVYE;
    private byte[] zzVYF;
    private byte[] zzVYG;
    private byte[] zzVYH;
    private zzYTF zzVYI;
    private zzYTE zzVYJ;
    private byte[] zzVYP;
    private byte[] zzVYX;
    private byte[] zzVYZ;
    private long zzVYy;
    private long zzVYz;
    private zzYV8 zzW67;
    private byte[] zzW6c;
    private int zzW6m;
    private int zzW6n;
    private byte[] zzWFW;
    private byte[] zzWkD;
    private boolean zzWkw;

    public zzYTM(zzYV8 zzyv8) {
        this(zzyv8, (byte) 0);
    }

    private void zzOG(boolean z) {
        this.zzW67.reset();
        this.zzWkD = new byte[16];
        this.zzVYG = new byte[16];
        this.zzVYF = new byte[16];
        this.zzVYB = new byte[16];
        this.zzVYA = 0;
        this.zzVYz = 0L;
        this.zzVYy = 0L;
        this.zzVYE = zzYGU.zzVI(this.zzVYH);
        this.zzVYD = -2;
        this.zzW6m = 0;
        this.zzVYC = 0L;
        byte[] bArr = this.zzVYP;
        if (bArr != null) {
            zzYGU.fill(bArr, (byte) 0);
        }
        if (z) {
            this.zzVYX = null;
        }
        byte[] bArr2 = this.zzVYZ;
        if (bArr2 != null) {
            zzq(bArr2, 0, bArr2.length);
        }
    }

    private void zzP(byte[] bArr, int i, byte[] bArr2, int i2) {
        byte[] bArrZzXCB = zzXCB();
        zzYTD.zzW(bArrZzXCB, bArr, 0, i);
        System.arraycopy(bArrZzXCB, 0, bArr2, i2, i);
        byte[] bArr3 = this.zzWkD;
        if (this.zzWkw) {
            bArr = bArrZzXCB;
        }
        zzX(bArr3, bArr, 0, i);
        this.zzVYC += (long) i;
    }

    private void zzR(byte[] bArr, byte[] bArr2, int i) {
        for (int i2 = 0; i2 < i; i2 += 16) {
            zzX(bArr, bArr2, i2, Math.min(i - i2, 16));
        }
    }

    private void zzS(byte[] bArr, byte[] bArr2, int i) {
        byte[] bArrZzXCB = zzXCB();
        zzYTD.zzV(bArrZzXCB, bArr);
        System.arraycopy(bArrZzXCB, 0, bArr2, i, 16);
        byte[] bArr3 = this.zzWkD;
        if (this.zzWkw) {
            bArr = bArrZzXCB;
        }
        zzx(bArr3, bArr);
        this.zzVYC += 16;
    }

    private void zzX(byte[] bArr, byte[] bArr2, int i, int i2) {
        zzYTD.zzW(bArr, bArr2, i, i2);
        this.zzVYJ.zzW7(bArr);
    }

    private byte[] zzXCB() {
        int i = this.zzVYD;
        if (i == 0) {
            throw new IllegalStateException("Attempt to process too many blocks in GCM");
        }
        this.zzVYD = i - 1;
        byte[] bArr = this.zzVYE;
        int i2 = (bArr[15] & 255) + 1;
        bArr[15] = (byte) i2;
        int i3 = (i2 >>> 8) + (bArr[14] & 255);
        bArr[14] = (byte) i3;
        int i4 = (i3 >>> 8) + (bArr[13] & 255);
        bArr[13] = (byte) i4;
        bArr[12] = (byte) ((i4 >>> 8) + (bArr[12] & 255));
        byte[] bArr2 = new byte[16];
        this.zzW67.zzY(bArr, 0, bArr2, 0);
        return bArr2;
    }

    private void zzXCD() {
        if (this.zzVYz > 0) {
            System.arraycopy(this.zzVYG, 0, this.zzVYF, 0, 16);
            this.zzVYy = this.zzVYz;
        }
        int i = this.zzVYA;
        if (i > 0) {
            zzX(this.zzVYF, this.zzVYB, 0, i);
            this.zzVYy += (long) this.zzVYA;
        }
        if (this.zzVYy > 0) {
            System.arraycopy(this.zzVYF, 0, this.zzWkD, 0, 16);
        }
    }

    private void zzZY(byte[] bArr, int i) {
        if (bArr.length < i + 16) {
            throw new zzYUO("Output buffer too short");
        }
        if (this.zzVYC == 0) {
            zzXCD();
        }
        zzS(this.zzVYP, bArr, i);
        if (this.zzWkw) {
            this.zzW6m = 0;
            return;
        }
        byte[] bArr2 = this.zzVYP;
        System.arraycopy(bArr2, 16, bArr2, 0, this.zzW6n);
        this.zzW6m = this.zzW6n;
    }

    private void zzx(byte[] bArr, byte[] bArr2) {
        zzYTD.zzV(bArr, bArr2);
        this.zzVYJ.zzW7(bArr);
    }

    @Override // com.aspose.words.internal.zzYTS
    public final int doFinal(byte[] bArr, int i) throws IllegalStateException, zzYUT {
        if (this.zzVYC == 0) {
            zzXCD();
        }
        int i2 = this.zzW6m;
        if (!this.zzWkw) {
            int i3 = this.zzW6n;
            if (i2 < i3) {
                throw new zzYUT("data too short");
            }
            i2 -= i3;
            if (bArr.length < i + i2) {
                throw new zzYUO("Output buffer too short");
            }
        } else if (bArr.length < i + i2 + this.zzW6n) {
            throw new zzYUO("Output buffer too short");
        }
        if (i2 > 0) {
            zzP(this.zzVYP, i2, bArr, i);
        }
        long j = this.zzVYz;
        int i4 = this.zzVYA;
        long j2 = j + ((long) i4);
        this.zzVYz = j2;
        if (j2 > this.zzVYy) {
            if (i4 > 0) {
                zzX(this.zzVYG, this.zzVYB, 0, i4);
            }
            if (this.zzVYy > 0) {
                zzYTD.zzV(this.zzVYG, this.zzVYF);
            }
            long j3 = ((this.zzVYC * 8) + 127) >>> 7;
            byte[] bArr2 = new byte[16];
            if (this.zzVYI == null) {
                zzYTC zzytc = new zzYTC();
                this.zzVYI = zzytc;
                zzytc.init(this.zzW6c);
            }
            this.zzVYI.zzZ(j3, bArr2);
            zzYTD.zzw(this.zzVYG, bArr2);
            zzYTD.zzV(this.zzWkD, this.zzVYG);
        }
        byte[] bArr3 = new byte[16];
        zzYGN.zzW(this.zzVYz * 8, bArr3, 0);
        zzYGN.zzW(this.zzVYC * 8, bArr3, 8);
        zzx(this.zzWkD, bArr3);
        byte[] bArr4 = new byte[16];
        this.zzW67.zzY(this.zzVYH, 0, bArr4, 0);
        zzYTD.zzV(bArr4, this.zzWkD);
        int i5 = this.zzW6n;
        byte[] bArr5 = new byte[i5];
        this.zzVYX = bArr5;
        System.arraycopy(bArr4, 0, bArr5, 0, i5);
        if (this.zzWkw) {
            System.arraycopy(this.zzVYX, 0, bArr, i + this.zzW6m, this.zzW6n);
            i2 += this.zzW6n;
        } else {
            int i6 = this.zzW6n;
            byte[] bArr6 = new byte[i6];
            System.arraycopy(this.zzVYP, i2, bArr6, 0, i6);
            if (!zzYGU.zzo(this.zzVYX, bArr6)) {
                throw new zzYUT("mac check in GCM failed");
            }
        }
        zzOG(false);
        return i2;
    }

    @Override // com.aspose.words.internal.zzYTS
    public final int getOutputSize(int i) {
        int i2 = i + this.zzW6m;
        if (this.zzWkw) {
            return i2 + this.zzW6n;
        }
        int i3 = this.zzW6n;
        if (i2 < i3) {
            return 0;
        }
        return i2 - i3;
    }

    @Override // com.aspose.words.internal.zzYTS
    public final void reset() {
        zzOG(true);
    }

    @Override // com.aspose.words.internal.zzYTS
    public final zzYV8 zzXCK() {
        return this.zzW67;
    }

    @Override // com.aspose.words.internal.zzYTS
    public final String zzXGi() {
        return this.zzW67.zzXGi() + "/GCM";
    }

    public final byte[] zzXK5() {
        return zzYGU.zzVI(this.zzVYX);
    }

    @Override // com.aspose.words.internal.zzYTS
    public final int zzY(byte[] bArr, int i, int i2, byte[] bArr2) throws zzYV0 {
        if (bArr.length < i + i2) {
            throw new zzYV0("Input buffer too short");
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            byte[] bArr3 = this.zzVYP;
            int i5 = this.zzW6m;
            bArr3[i5] = bArr[i + i4];
            int i6 = i5 + 1;
            this.zzW6m = i6;
            if (i6 == bArr3.length) {
                zzZY(bArr2, i3);
                i3 += 16;
            }
        }
        return i3;
    }

    @Override // com.aspose.words.internal.zzYTS
    public final void zzZ(boolean z, zzYV3 zzyv3) throws IllegalArgumentException {
        zzYS8 zzys8ZzXCv;
        this.zzWkw = z;
        this.zzVYX = null;
        if (zzyv3 instanceof zzYT3) {
            zzYT3 zzyt3 = (zzYT3) zzyv3;
            this.zzWFW = zzyt3.zzXJY();
            this.zzVYZ = zzyt3.zzXCu();
            int iZzXDn = zzyt3.zzXDn();
            if (iZzXDn < 32 || iZzXDn > 128 || iZzXDn % 8 != 0) {
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(iZzXDn, "Invalid value for MAC size: "));
            }
            this.zzW6n = iZzXDn / 8;
            zzys8ZzXCv = zzyt3.zzXCv();
        } else {
            if (!(zzyv3 instanceof zzYS4)) {
                throw new IllegalArgumentException("invalid parameters passed to GCM");
            }
            zzYS4 zzys4 = (zzYS4) zzyv3;
            this.zzWFW = zzys4.getIV();
            this.zzVYZ = null;
            this.zzW6n = 16;
            zzys8ZzXCv = (zzYS8) zzys4.zzXC6();
        }
        this.zzVYP = new byte[z ? 16 : this.zzW6n + 16];
        byte[] bArr = this.zzWFW;
        if (bArr == null || bArr.length <= 0) {
            throw new IllegalArgumentException("IV must be at least 1 byte");
        }
        if (zzys8ZzXCv != null) {
            this.zzW67.zzZ(true, zzys8ZzXCv);
            byte[] bArr2 = new byte[16];
            this.zzW6c = bArr2;
            this.zzW67.zzY(bArr2, 0, bArr2, 0);
            this.zzVYJ.init(this.zzW6c);
            this.zzVYI = null;
        } else if (this.zzW6c == null) {
            throw new IllegalArgumentException("Key must be specified in initial init");
        }
        byte[] bArr3 = new byte[16];
        this.zzVYH = bArr3;
        byte[] bArr4 = this.zzWFW;
        if (bArr4.length == 12) {
            System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
            this.zzVYH[15] = 1;
        } else {
            zzR(bArr3, bArr4, bArr4.length);
            byte[] bArr5 = new byte[16];
            zzYGN.zzW(((long) this.zzWFW.length) * 8, bArr5, 8);
            zzx(this.zzVYH, bArr5);
        }
        this.zzWkD = new byte[16];
        this.zzVYG = new byte[16];
        this.zzVYF = new byte[16];
        this.zzVYB = new byte[16];
        this.zzVYA = 0;
        this.zzVYz = 0L;
        this.zzVYy = 0L;
        this.zzVYE = zzYGU.zzVI(this.zzVYH);
        this.zzVYD = -2;
        this.zzW6m = 0;
        this.zzVYC = 0L;
        byte[] bArr6 = this.zzVYZ;
        if (bArr6 != null) {
            zzq(bArr6, 0, bArr6.length);
        }
    }

    @Override // com.aspose.words.internal.zzYTS
    public final void zzc(byte b) {
        byte[] bArr = this.zzVYB;
        int i = this.zzVYA;
        bArr[i] = b;
        int i2 = i + 1;
        this.zzVYA = i2;
        if (i2 == 16) {
            zzx(this.zzVYG, bArr);
            this.zzVYA = 0;
            this.zzVYz += 16;
        }
    }

    @Override // com.aspose.words.internal.zzYTS
    public final int zzfY(int i) {
        int i2 = i + this.zzW6m;
        if (!this.zzWkw) {
            int i3 = this.zzW6n;
            if (i2 < i3) {
                return 0;
            }
            i2 -= i3;
        }
        return i2 - (i2 % 16);
    }

    @Override // com.aspose.words.internal.zzYTS
    public final void zzq(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.zzVYB;
            int i4 = this.zzVYA;
            bArr2[i4] = bArr[i + i3];
            int i5 = i4 + 1;
            this.zzVYA = i5;
            if (i5 == 16) {
                zzx(this.zzVYG, bArr2);
                this.zzVYA = 0;
                this.zzVYz += 16;
            }
        }
    }

    private zzYTM(zzYV8 zzyv8, byte b) {
        if (zzyv8.getBlockSize() != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
        zzYTB zzytb = new zzYTB();
        this.zzW67 = zzyv8;
        this.zzVYJ = zzytb;
    }
}
