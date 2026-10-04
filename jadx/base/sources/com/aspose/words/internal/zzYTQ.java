package com.aspose.words.internal;

import com.google.common.primitives.SignedBytes;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYTQ implements zzYTS {
    private byte[] zzVYX;
    private zzYV3 zzVYY;
    private byte[] zzVYZ;
    private zzYV8 zzW67;
    private int zzW6n;
    private byte[] zzWFW;
    private boolean zzWkw;
    private int zzZNm;
    private zzZ zzVYW = new zzZ();
    private zzZ zzVYV = new zzZ();

    public static class zzZ extends ByteArrayOutputStream {
        public final byte[] zziA() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public zzYTQ(zzYV8 zzyv8) {
        this.zzW67 = zzyv8;
        int blockSize = zzyv8.getBlockSize();
        this.zzZNm = blockSize;
        this.zzVYX = new byte[blockSize];
        if (blockSize != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
    }

    private int zzQ(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, zzYV0, zzYUT {
        int i3;
        if (this.zzVYY == null) {
            throw new IllegalStateException("CCM cipher unitialized.");
        }
        byte[] bArr3 = this.zzWFW;
        int length = bArr3.length;
        int i4 = 15 - length;
        if (i4 < 4 && i >= (1 << (i4 * 8))) {
            throw new IllegalStateException("CCM packet too large for choice of q.");
        }
        byte[] bArr4 = new byte[this.zzZNm];
        bArr4[0] = (byte) ((14 - length) & 7);
        System.arraycopy(bArr3, 0, bArr4, 1, bArr3.length);
        zzYTG zzytg = new zzYTG(this.zzW67);
        zzytg.zzZ(this.zzWkw, new zzYS4(this.zzVYY, bArr4));
        if (!this.zzWkw) {
            int i5 = this.zzW6n;
            if (i < i5) {
                throw new zzYUT("data too short");
            }
            int i6 = i - i5;
            if (bArr2.length < i6 + i2) {
                throw new zzYUO("Output buffer too short.");
            }
            System.arraycopy(bArr, i6, this.zzVYX, 0, i5);
            byte[] bArr5 = this.zzVYX;
            zzytg.zzY(bArr5, 0, bArr5, 0);
            int i7 = this.zzW6n;
            while (true) {
                byte[] bArr6 = this.zzVYX;
                if (i7 == bArr6.length) {
                    break;
                }
                bArr6[i7] = 0;
                i7++;
            }
            int i8 = i2;
            int i9 = 0;
            while (true) {
                i3 = this.zzZNm;
                if (i9 >= i6 - i3) {
                    break;
                }
                zzytg.zzY(bArr, i9, bArr2, i8);
                int i10 = this.zzZNm;
                i8 += i10;
                i9 += i10;
            }
            byte[] bArr7 = new byte[i3];
            int i11 = i6 - i9;
            System.arraycopy(bArr, i9, bArr7, 0, i11);
            zzytg.zzY(bArr7, 0, bArr7, 0);
            System.arraycopy(bArr7, 0, bArr2, i8, i11);
            byte[] bArr8 = new byte[this.zzZNm];
            zzX(bArr2, i2, i6, bArr8);
            if (zzYGU.zzo(this.zzVYX, bArr8)) {
                return i6;
            }
            throw new zzYUT("mac check in CCM failed");
        }
        int i12 = this.zzW6n + i;
        if (bArr2.length < i12 + i2) {
            throw new zzYUO("Output buffer too short.");
        }
        zzX(bArr, 0, i, this.zzVYX);
        byte[] bArr9 = new byte[this.zzZNm];
        zzytg.zzY(this.zzVYX, 0, bArr9, 0);
        int i13 = i2;
        int i14 = 0;
        while (true) {
            int i15 = this.zzZNm;
            if (i14 >= i - i15) {
                byte[] bArr10 = new byte[i15];
                int i16 = i - i14;
                System.arraycopy(bArr, i14, bArr10, 0, i16);
                zzytg.zzY(bArr10, 0, bArr10, 0);
                System.arraycopy(bArr10, 0, bArr2, i13, i16);
                System.arraycopy(bArr9, 0, bArr2, i2 + i, this.zzW6n);
                return i12;
            }
            zzytg.zzY(bArr, i14, bArr2, i13);
            int i17 = this.zzZNm;
            i13 += i17;
            i14 += i17;
        }
    }

    private int zzX(byte[] bArr, int i, int i2, byte[] bArr2) {
        zzYTZ zzytz = new zzYTZ(this.zzW67, this.zzW6n * 8);
        zzytz.zzZ(this.zzVYY);
        byte[] bArr3 = new byte[16];
        if (zzXCF()) {
            bArr3[0] = (byte) (bArr3[0] | SignedBytes.MAX_POWER_OF_TWO);
        }
        int i3 = 2;
        byte bZzXDn = (byte) (bArr3[0] | ((((zzytz.zzXDn() - 2) / 2) & 7) << 3));
        bArr3[0] = bZzXDn;
        byte[] bArr4 = this.zzWFW;
        bArr3[0] = (byte) (bZzXDn | ((14 - bArr4.length) & 7));
        System.arraycopy(bArr4, 0, bArr3, 1, bArr4.length);
        int i4 = i2;
        int i5 = 1;
        while (i4 > 0) {
            bArr3[16 - i5] = (byte) (i4 & 255);
            i4 >>>= 8;
            i5++;
        }
        zzytz.update(bArr3, 0, 16);
        if (zzXCF()) {
            int iZzXCG = zzXCG();
            if (iZzXCG < 65280) {
                zzytz.update((byte) (iZzXCG >> 8));
                zzytz.update((byte) iZzXCG);
            } else {
                zzytz.update((byte) -1);
                zzytz.update((byte) -2);
                zzytz.update((byte) (iZzXCG >> 24));
                zzytz.update((byte) (iZzXCG >> 16));
                zzytz.update((byte) (iZzXCG >> 8));
                zzytz.update((byte) iZzXCG);
                i3 = 6;
            }
            byte[] bArr5 = this.zzVYZ;
            if (bArr5 != null) {
                zzytz.update(bArr5, 0, bArr5.length);
            }
            if (this.zzVYW.size() > 0) {
                zzytz.update(this.zzVYW.zziA(), 0, this.zzVYW.size());
            }
            int i6 = (i3 + iZzXCG) % 16;
            if (i6 != 0) {
                while (i6 != 16) {
                    zzytz.update((byte) 0);
                    i6++;
                }
            }
        }
        zzytz.update(bArr, i, i2);
        return zzytz.doFinal(bArr2, 0);
    }

    private boolean zzXCF() {
        return zzXCG() > 0;
    }

    private int zzXCG() {
        int size = this.zzVYW.size();
        byte[] bArr = this.zzVYZ;
        return size + (bArr == null ? 0 : bArr.length);
    }

    @Override // com.aspose.words.internal.zzYTS
    public final int doFinal(byte[] bArr, int i) throws IllegalStateException, zzYUT {
        int iZzQ = zzQ(this.zzVYV.zziA(), this.zzVYV.size(), bArr, i);
        reset();
        return iZzQ;
    }

    @Override // com.aspose.words.internal.zzYTS
    public final int getOutputSize(int i) {
        int size = this.zzVYV.size() + i;
        if (this.zzWkw) {
            return size + this.zzW6n;
        }
        int i2 = this.zzW6n;
        if (size < i2) {
            return 0;
        }
        return size - i2;
    }

    @Override // com.aspose.words.internal.zzYTS
    public final void reset() {
        this.zzW67.reset();
        this.zzVYW.reset();
        this.zzVYV.reset();
    }

    @Override // com.aspose.words.internal.zzYTS
    public final zzYV8 zzXCK() {
        return this.zzW67;
    }

    @Override // com.aspose.words.internal.zzYTS
    public final String zzXGi() {
        return this.zzW67.zzXGi() + "/CCM";
    }

    public final byte[] zzXK5() {
        int i = this.zzW6n;
        byte[] bArr = new byte[i];
        System.arraycopy(this.zzVYX, 0, bArr, 0, i);
        return bArr;
    }

    @Override // com.aspose.words.internal.zzYTS
    public final int zzY(byte[] bArr, int i, int i2, byte[] bArr2) throws IllegalStateException, zzYV0 {
        if (bArr.length < i + i2) {
            throw new zzYV0("Input buffer too short");
        }
        this.zzVYV.write(bArr, i, i2);
        return 0;
    }

    @Override // com.aspose.words.internal.zzYTS
    public final void zzZ(boolean z, zzYV3 zzyv3) throws IllegalArgumentException {
        zzYV3 zzyv3ZzXC6;
        this.zzWkw = z;
        if (zzyv3 instanceof zzYT3) {
            zzYT3 zzyt3 = (zzYT3) zzyv3;
            this.zzWFW = zzyt3.zzXJY();
            this.zzVYZ = zzyt3.zzXCu();
            this.zzW6n = zzyt3.zzXDn() / 8;
            zzyv3ZzXC6 = zzyt3.zzXCv();
        } else {
            if (!(zzyv3 instanceof zzYS4)) {
                throw new IllegalArgumentException("invalid parameters passed to CCM");
            }
            zzYS4 zzys4 = (zzYS4) zzyv3;
            this.zzWFW = zzys4.getIV();
            this.zzVYZ = null;
            this.zzW6n = this.zzVYX.length / 2;
            zzyv3ZzXC6 = zzys4.zzXC6();
        }
        if (zzyv3ZzXC6 != null) {
            this.zzVYY = zzyv3ZzXC6;
        }
        byte[] bArr = this.zzWFW;
        if (bArr == null || bArr.length < 7 || bArr.length > 13) {
            throw new IllegalArgumentException("nonce must have length from 7 to 13 octets");
        }
        reset();
    }

    @Override // com.aspose.words.internal.zzYTS
    public final void zzc(byte b) throws IOException {
        this.zzVYW.write(b);
    }

    @Override // com.aspose.words.internal.zzYTS
    public final int zzfY(int i) {
        return 0;
    }

    @Override // com.aspose.words.internal.zzYTS
    public final void zzq(byte[] bArr, int i, int i2) throws IOException {
        this.zzVYW.write(bArr, i, i2);
    }
}
