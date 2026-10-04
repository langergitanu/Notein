package com.aspose.words.internal;

import androidx.appcompat.widget.C21532OooOOo;
import com.google.common.primitives.UnsignedBytes;
import java.util.Vector;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYTJ implements zzYTS {
    private byte[] zzVYX;
    private byte[] zzVYZ;
    private byte[] zzVYd;
    private byte[] zzVYf;
    private long zzVYg;
    private long zzVYh;
    private int zzVYi;
    private int zzVYj;
    private byte[] zzVYk;
    private byte[] zzVYl;
    private byte[] zzVYp;
    private byte[] zzVYq;
    private Vector zzVYr;
    private zzYV8 zzVYs;
    private zzYV8 zzVYt;
    private byte[] zzW69;
    private int zzW6n;
    private boolean zzWkw;
    private byte[] zzVYo = null;
    private byte[] zzVYn = new byte[24];
    private byte[] zzVYm = new byte[16];
    private byte[] zzVYe = new byte[16];

    public zzYTJ(zzYV8 zzyv8, zzYV8 zzyv82) {
        if (zzyv8 == null) {
            throw new IllegalArgumentException("'hashCipher' cannot be null");
        }
        if (zzyv8.getBlockSize() != 16) {
            throw new IllegalArgumentException("'hashCipher' must have a block size of 16");
        }
        if (zzyv82 == null) {
            throw new IllegalArgumentException("'mainCipher' cannot be null");
        }
        if (zzyv82.getBlockSize() != 16) {
            throw new IllegalArgumentException("'mainCipher' must have a block size of 16");
        }
        if (!zzyv8.zzXGi().equals(zzyv82.zzXGi())) {
            throw new IllegalArgumentException("'hashCipher' and 'mainCipher' must be the same algorithm");
        }
        this.zzVYt = zzyv8;
        this.zzVYs = zzyv82;
    }

    private void zzOG(boolean z) {
        this.zzVYt.reset();
        this.zzVYs.reset();
        zzWa(this.zzVYl);
        zzWa(this.zzVYk);
        this.zzVYj = 0;
        this.zzVYi = 0;
        this.zzVYh = 0L;
        this.zzVYg = 0L;
        zzWa(this.zzVYf);
        zzWa(this.zzW69);
        System.arraycopy(this.zzVYm, 0, this.zzVYe, 0, 16);
        zzWa(this.zzVYd);
        if (z) {
            this.zzVYX = null;
        }
        byte[] bArr = this.zzVYZ;
        if (bArr != null) {
            zzq(bArr, 0, bArr.length);
        }
    }

    private static void zzV(byte[] bArr, byte[] bArr2) {
        for (int i = 15; i >= 0; i--) {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
    }

    private static byte[] zzW8(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) ((135 >>> ((1 - zzy(bArr, bArr2)) << 3)) ^ bArr2[15]);
        return bArr2;
    }

    private void zzW9(byte[] bArr) {
        zzV(this.zzVYf, bArr);
        zzV(this.zzVYl, this.zzVYf);
        zzYV8 zzyv8 = this.zzVYt;
        byte[] bArr2 = this.zzVYl;
        zzyv8.zzY(bArr2, 0, bArr2, 0);
        zzV(this.zzW69, this.zzVYl);
    }

    private static void zzWa(byte[] bArr) {
        if (bArr != null) {
            zzYGU.fill(bArr, (byte) 0);
        }
    }

    private int zzWb(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
        bArr2[0] = (byte) (this.zzW6n << 4);
        int length = 15 - bArr.length;
        bArr2[length] = (byte) (bArr2[length] | 1);
        byte b = bArr2[15];
        int i2 = b & 63;
        bArr2[15] = (byte) (b & 192);
        byte[] bArr3 = this.zzVYo;
        if (bArr3 == null || !zzYGU.zzp(bArr2, bArr3)) {
            byte[] bArr4 = new byte[16];
            this.zzVYo = bArr2;
            this.zzVYt.zzY(bArr2, 0, bArr4, 0);
            System.arraycopy(bArr4, 0, this.zzVYn, 0, 16);
            while (i < 8) {
                byte[] bArr5 = this.zzVYn;
                int i3 = i + 16;
                byte b2 = bArr4[i];
                i++;
                bArr5[i3] = (byte) (b2 ^ bArr4[i]);
            }
        }
        return i2;
    }

    private static int zzX0(long j) {
        if (j == 0) {
            return 64;
        }
        int i = 0;
        while ((1 & j) == 0) {
            i++;
            j >>= 1;
        }
        return i;
    }

    private void zzXCA() {
        long j = this.zzVYh + 1;
        this.zzVYh = j;
        zzW9(zzf2(zzX0(j)));
        this.zzVYj = 0;
    }

    private static void zzZW(byte[] bArr, int i) {
        bArr[i] = UnsignedBytes.MAX_POWER_OF_TWO;
        while (true) {
            i++;
            if (i >= 16) {
                return;
            } else {
                bArr[i] = 0;
            }
        }
    }

    private void zzZX(byte[] bArr, int i) {
        if (bArr.length < i + 16) {
            throw new zzYUO("Output buffer too short");
        }
        if (this.zzWkw) {
            zzV(this.zzVYd, this.zzVYk);
            this.zzVYi = 0;
        }
        byte[] bArr2 = this.zzVYe;
        long j = this.zzVYg + 1;
        this.zzVYg = j;
        zzV(bArr2, zzf2(zzX0(j)));
        zzV(this.zzVYk, this.zzVYe);
        zzYV8 zzyv8 = this.zzVYs;
        byte[] bArr3 = this.zzVYk;
        zzyv8.zzY(bArr3, 0, bArr3, 0);
        zzV(this.zzVYk, this.zzVYe);
        System.arraycopy(this.zzVYk, 0, bArr, i, 16);
        if (this.zzWkw) {
            return;
        }
        zzV(this.zzVYd, this.zzVYk);
        byte[] bArr4 = this.zzVYk;
        System.arraycopy(bArr4, 16, bArr4, 0, this.zzW6n);
        this.zzVYi = this.zzW6n;
    }

    private byte[] zzf2(int i) {
        while (i >= this.zzVYr.size()) {
            Vector vector = this.zzVYr;
            vector.addElement(zzW8((byte[]) vector.lastElement()));
        }
        return (byte[]) this.zzVYr.elementAt(i);
    }

    private static int zzy(byte[] bArr, byte[] bArr2) {
        int i = 16;
        int i2 = 0;
        while (true) {
            i--;
            if (i < 0) {
                return i2;
            }
            int i3 = bArr[i] & 255;
            bArr2[i] = (byte) (i2 | (i3 << 1));
            i2 = (i3 >>> 7) & 1;
        }
    }

    @Override // com.aspose.words.internal.zzYTS
    public final int doFinal(byte[] bArr, int i) throws IllegalStateException, zzYUT {
        byte[] bArr2;
        if (this.zzWkw) {
            bArr2 = null;
        } else {
            int i2 = this.zzVYi;
            int i3 = this.zzW6n;
            if (i2 < i3) {
                throw new zzYUT("data too short");
            }
            int i4 = i2 - i3;
            this.zzVYi = i4;
            bArr2 = new byte[i3];
            System.arraycopy(this.zzVYk, i4, bArr2, 0, i3);
        }
        int i5 = this.zzVYj;
        if (i5 > 0) {
            zzZW(this.zzVYl, i5);
            zzW9(this.zzVYq);
        }
        int i6 = this.zzVYi;
        if (i6 > 0) {
            if (this.zzWkw) {
                zzZW(this.zzVYk, i6);
                zzV(this.zzVYd, this.zzVYk);
            }
            zzV(this.zzVYe, this.zzVYq);
            byte[] bArr3 = new byte[16];
            this.zzVYt.zzY(this.zzVYe, 0, bArr3, 0);
            zzV(this.zzVYk, bArr3);
            int length = bArr.length;
            int i7 = this.zzVYi;
            if (length < i + i7) {
                throw new zzYUO("Output buffer too short");
            }
            System.arraycopy(this.zzVYk, 0, bArr, i, i7);
            if (!this.zzWkw) {
                zzZW(this.zzVYk, this.zzVYi);
                zzV(this.zzVYd, this.zzVYk);
            }
        }
        zzV(this.zzVYd, this.zzVYe);
        zzV(this.zzVYd, this.zzVYp);
        zzYV8 zzyv8 = this.zzVYt;
        byte[] bArr4 = this.zzVYd;
        zzyv8.zzY(bArr4, 0, bArr4, 0);
        zzV(this.zzVYd, this.zzW69);
        int i8 = this.zzW6n;
        byte[] bArr5 = new byte[i8];
        this.zzVYX = bArr5;
        System.arraycopy(this.zzVYd, 0, bArr5, 0, i8);
        int i9 = this.zzVYi;
        if (this.zzWkw) {
            int length2 = bArr.length;
            int i10 = i + i9;
            int i11 = this.zzW6n;
            if (length2 < i10 + i11) {
                throw new zzYUO("Output buffer too short");
            }
            System.arraycopy(this.zzVYX, 0, bArr, i10, i11);
            i9 += this.zzW6n;
        } else if (!zzYGU.zzo(this.zzVYX, bArr2)) {
            throw new zzYUT("mac check in OCB failed");
        }
        zzOG(false);
        return i9;
    }

    @Override // com.aspose.words.internal.zzYTS
    public final int getOutputSize(int i) {
        int i2 = i + this.zzVYi;
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
        return this.zzVYs;
    }

    @Override // com.aspose.words.internal.zzYTS
    public final String zzXGi() {
        return this.zzVYs.zzXGi() + "/OCB";
    }

    @Override // com.aspose.words.internal.zzYTS
    public final int zzY(byte[] bArr, int i, int i2, byte[] bArr2) throws zzYV0 {
        if (bArr.length < i + i2) {
            throw new zzYV0("Input buffer too short");
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            byte[] bArr3 = this.zzVYk;
            int i5 = this.zzVYi;
            bArr3[i5] = bArr[i + i4];
            int i6 = i5 + 1;
            this.zzVYi = i6;
            if (i6 == bArr3.length) {
                zzZX(bArr2, i3);
                i3 += 16;
            }
        }
        return i3;
    }

    @Override // com.aspose.words.internal.zzYTS
    public final void zzZ(boolean z, zzYV3 zzyv3) throws IllegalArgumentException {
        byte[] iv;
        zzYS8 zzys8ZzXCv;
        this.zzWkw = z;
        this.zzVYX = null;
        if (zzyv3 instanceof zzYT3) {
            zzYT3 zzyt3 = (zzYT3) zzyv3;
            iv = zzyt3.zzXJY();
            this.zzVYZ = zzyt3.zzXCu();
            int iZzXDn = zzyt3.zzXDn();
            if (iZzXDn < 64 || iZzXDn > 128 || iZzXDn % 8 != 0) {
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(iZzXDn, "Invalid value for MAC size: "));
            }
            this.zzW6n = iZzXDn / 8;
            zzys8ZzXCv = zzyt3.zzXCv();
        } else {
            if (!(zzyv3 instanceof zzYS4)) {
                throw new IllegalArgumentException("invalid parameters passed to OCB");
            }
            zzYS4 zzys4 = (zzYS4) zzyv3;
            iv = zzys4.getIV();
            this.zzVYZ = null;
            this.zzW6n = 16;
            zzys8ZzXCv = (zzYS8) zzys4.zzXC6();
        }
        this.zzVYl = new byte[16];
        this.zzVYk = new byte[z ? 16 : this.zzW6n + 16];
        if (iv == null) {
            iv = new byte[0];
        }
        if (iv.length > 15) {
            throw new IllegalArgumentException("IV must be no more than 15 bytes");
        }
        if (zzys8ZzXCv != null) {
            this.zzVYo = null;
        }
        this.zzVYt.zzZ(true, zzys8ZzXCv);
        this.zzVYs.zzZ(z, zzys8ZzXCv);
        byte[] bArr = new byte[16];
        this.zzVYq = bArr;
        this.zzVYt.zzY(bArr, 0, bArr, 0);
        this.zzVYp = zzW8(this.zzVYq);
        Vector vector = new Vector();
        this.zzVYr = vector;
        vector.addElement(zzW8(this.zzVYp));
        int iZzWb = zzWb(iv);
        int i = iZzWb % 8;
        int i2 = iZzWb / 8;
        if (i == 0) {
            System.arraycopy(this.zzVYn, i2, this.zzVYm, 0, 16);
        } else {
            for (int i3 = 0; i3 < 16; i3++) {
                byte[] bArr2 = this.zzVYn;
                int i4 = bArr2[i2] & 255;
                i2++;
                this.zzVYm[i3] = (byte) (((bArr2[i2] & 255) >>> (8 - i)) | (i4 << i));
            }
        }
        this.zzVYj = 0;
        this.zzVYi = 0;
        this.zzVYh = 0L;
        this.zzVYg = 0L;
        this.zzVYf = new byte[16];
        this.zzW69 = new byte[16];
        System.arraycopy(this.zzVYm, 0, this.zzVYe, 0, 16);
        this.zzVYd = new byte[16];
        byte[] bArr3 = this.zzVYZ;
        if (bArr3 != null) {
            zzq(bArr3, 0, bArr3.length);
        }
    }

    @Override // com.aspose.words.internal.zzYTS
    public final void zzc(byte b) {
        byte[] bArr = this.zzVYl;
        int i = this.zzVYj;
        bArr[i] = b;
        int i2 = i + 1;
        this.zzVYj = i2;
        if (i2 == bArr.length) {
            zzXCA();
        }
    }

    @Override // com.aspose.words.internal.zzYTS
    public final int zzfY(int i) {
        int i2 = i + this.zzVYi;
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
            byte[] bArr2 = this.zzVYl;
            int i4 = this.zzVYj;
            bArr2[i4] = bArr[i + i3];
            int i5 = i4 + 1;
            this.zzVYj = i5;
            if (i5 == bArr2.length) {
                zzXCA();
            }
        }
    }
}
