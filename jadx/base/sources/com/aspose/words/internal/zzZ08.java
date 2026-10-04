package com.aspose.words.internal;

import com.aspose.words.EditingLanguage;
import com.google.android.material.internal.ViewUtils;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes5.dex */
class zzZ08 implements zzYUU {
    long[] zzWc2;
    long[] zzWc3;
    long[] zzWc4;
    protected byte[] zzWc5;
    protected byte[] zzWc6;
    protected int zzWc7;
    protected boolean zzWc8;
    protected int zzWc9;
    protected int zzWca;
    protected int zzWcb;
    protected byte[] zzWcc;
    protected byte[] zzWcd;
    private static long[] zzWcf = zzXE8();
    private static int[] zzWce = zzXE7();

    public zzZ08(int i) {
        this.zzWcd = new byte[200];
        this.zzWcc = new byte[192];
        this.zzWc4 = new long[5];
        this.zzWc3 = new long[25];
        this.zzWc2 = new long[5];
        init(i);
    }

    private void init(int i) {
        if (i == 128) {
            zzUI(1344, 256);
            return;
        }
        if (i == 224) {
            zzUI(1152, 448);
            return;
        }
        if (i == 256) {
            zzUI(EditingLanguage.KYRGYZ, 512);
            return;
        }
        if (i == 288) {
            zzUI(1024, 576);
        } else if (i == 384) {
            zzUI(832, ViewUtils.EDGE_TO_EDGE_FLAGS);
        } else {
            if (i != 512) {
                throw new IllegalArgumentException("bitLength must be one of 128, 224, 256, 288, 384, or 512.");
            }
            zzUI(576, 1024);
        }
    }

    private static void zzB(byte[] bArr, byte[] bArr2) {
        System.arraycopy(bArr, 0, bArr2, 0, 128);
    }

    private static void zzT(long[] jArr, int i) {
        jArr[0] = jArr[0] ^ zzWcf[i];
    }

    private void zzUI(int i, int i2) {
        if (i + i2 != 1600) {
            throw new IllegalStateException("rate + capacity != 1600");
        }
        if (i <= 0 || i >= 1600 || i % 64 != 0) {
            throw new IllegalStateException("invalid rate value");
        }
        this.zzWcb = i;
        zzYGU.fill(this.zzWcd, (byte) 0);
        zzYGU.fill(this.zzWcc, (byte) 0);
        this.zzWca = 0;
        this.zzWc8 = false;
        this.zzWc7 = 0;
        this.zzWc9 = i2 / 2;
        this.zzWc6 = new byte[i / 8];
        this.zzWc5 = new byte[1];
    }

    private void zzUJ(int i, int i2) {
        for (int i3 = i; i3 != i + i2; i3++) {
            this.zzWcc[i3] = 0;
        }
    }

    private static void zzV(byte[] bArr, byte[] bArr2, int i) {
        System.arraycopy(bArr, 0, bArr2, 0, i * 8);
    }

    private void zzW(byte[] bArr, byte[] bArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
        }
        zzWN(bArr);
    }

    private void zzWN(byte[] bArr) {
        long[] jArr = new long[bArr.length / 8];
        zzY(jArr, bArr);
        zzt(jArr);
        zzZ(bArr, jArr);
    }

    private static boolean zzWO(byte[] bArr) {
        byte b = bArr[0];
        boolean z = (b & 1) != 0;
        if ((b & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
            bArr[0] = (byte) ((b << 1) ^ 113);
            return z;
        }
        bArr[0] = (byte) (b << 1);
        return z;
    }

    private void zzXE4() {
        int i = this.zzWca;
        int i2 = i + 1;
        int i3 = this.zzWcb;
        if (i2 == i3) {
            byte[] bArr = this.zzWcc;
            int i4 = i / 8;
            bArr[i4] = (byte) ((1 << (i % 8)) | bArr[i4]);
            zzXE5();
            zzUJ(0, this.zzWcb / 8);
        } else {
            zzUJ((i + 7) / 8, (i3 / 8) - ((i + 7) / 8));
            byte[] bArr2 = this.zzWcc;
            int i5 = this.zzWca;
            int i6 = i5 / 8;
            bArr2[i6] = (byte) ((1 << (i5 % 8)) | bArr2[i6]);
        }
        byte[] bArr3 = this.zzWcc;
        int i7 = this.zzWcb;
        int i8 = (i7 - 1) / 8;
        bArr3[i8] = (byte) ((1 << ((i7 - 1) % 8)) | bArr3[i8]);
        zzXE5();
        int i9 = this.zzWcb;
        if (i9 == 1024) {
            zzB(this.zzWcd, this.zzWcc);
            this.zzWc7 = 1024;
        } else {
            zzV(this.zzWcd, this.zzWcc, i9 / 64);
            this.zzWc7 = this.zzWcb;
        }
        this.zzWc8 = true;
    }

    private void zzXE5() {
        zzW(this.zzWcd, this.zzWcc, this.zzWcb / 8);
        this.zzWca = 0;
    }

    private static int[] zzXE7() {
        int[] iArr = new int[25];
        int i = 0;
        iArr[0] = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < 24) {
            int i4 = i + 1;
            iArr[((i3 % 5) * 5) + (i2 % 5)] = (((i + 2) * i4) / 2) % 64;
            int i5 = i3 % 5;
            i3 = ((i3 * 3) + (i2 * 2)) % 5;
            i2 = i5;
            i = i4;
        }
        return iArr;
    }

    private static long[] zzXE8() {
        long[] jArr = new long[24];
        byte[] bArr = {1};
        for (int i = 0; i < 24; i++) {
            jArr[i] = 0;
            for (int i2 = 0; i2 < 7; i2++) {
                int i3 = (1 << i2) - 1;
                if (zzWO(bArr)) {
                    jArr[i] = jArr[i] ^ (1 << i3);
                }
            }
        }
        return jArr;
    }

    private void zzp(long[] jArr) {
        for (int i = 0; i < 5; i++) {
            int i2 = 0;
            while (i2 < 5) {
                int i3 = i * 5;
                int i4 = i2 + 1;
                this.zzWc2[i2] = jArr[i2 + i3] ^ ((~jArr[(i4 % 5) + i3]) & jArr[((i2 + 2) % 5) + i3]);
                i2 = i4;
            }
            for (int i5 = 0; i5 < 5; i5++) {
                jArr[(i * 5) + i5] = this.zzWc2[i5];
            }
        }
    }

    private void zzq(long[] jArr) {
        long[] jArr2 = this.zzWc3;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        for (int i = 0; i < 5; i++) {
            for (int i2 = 0; i2 < 5; i2++) {
                jArr[((((i2 * 3) + (i * 2)) % 5) * 5) + i2] = this.zzWc3[(i2 * 5) + i];
            }
        }
    }

    private static void zzr(long[] jArr) {
        long j;
        for (int i = 0; i < 5; i++) {
            for (int i2 = 0; i2 < 5; i2++) {
                int i3 = (i2 * 5) + i;
                int i4 = zzWce[i3];
                if (i4 != 0) {
                    long j2 = jArr[i3];
                    j = (j2 >>> (64 - i4)) ^ (j2 << i4);
                } else {
                    j = jArr[i3];
                }
                jArr[i3] = j;
            }
        }
    }

    private void zzs(long[] jArr) {
        for (int i = 0; i < 5; i++) {
            this.zzWc4[i] = 0;
            for (int i2 = 0; i2 < 5; i2++) {
                long[] jArr2 = this.zzWc4;
                jArr2[i] = jArr2[i] ^ jArr[(i2 * 5) + i];
            }
        }
        int i3 = 0;
        while (i3 < 5) {
            long[] jArr3 = this.zzWc4;
            int i4 = i3 + 1;
            long j = jArr3[i4 % 5];
            long j2 = ((j >>> 63) ^ (j << 1)) ^ jArr3[(i3 + 4) % 5];
            for (int i5 = 0; i5 < 5; i5++) {
                int i6 = (i5 * 5) + i3;
                jArr[i6] = jArr[i6] ^ j2;
            }
            i3 = i4;
        }
    }

    private void zzt(long[] jArr) {
        for (int i = 0; i < 24; i++) {
            zzs(jArr);
            zzr(jArr);
            zzq(jArr);
            zzp(jArr);
            zzT(jArr, i);
        }
    }

    @Override // com.aspose.words.internal.zzYUX
    public int doFinal(byte[] bArr, int i) {
        zzY(bArr, i, this.zzWc9);
        reset();
        return this.zzWc9 / 8;
    }

    @Override // com.aspose.words.internal.zzYUX
    public void reset() {
        init(this.zzWc9);
    }

    @Override // com.aspose.words.internal.zzYUX
    public final void update(byte b) {
        byte[] bArr = this.zzWc5;
        bArr[0] = b;
        zzZ(bArr, 0, 8L);
    }

    @Override // com.aspose.words.internal.zzYUX
    public final int zzQI() {
        return this.zzWc9 / 8;
    }

    @Override // com.aspose.words.internal.zzYUU, com.aspose.words.internal.zzYUX
    public final int zzXE6() {
        return this.zzWcb / 8;
    }

    @Override // com.aspose.words.internal.zzYUX
    public String zzXGi() {
        return "Keccak-" + this.zzWc9;
    }

    public final void zzY(byte[] bArr, int i, long j) {
        if (!this.zzWc8) {
            zzXE4();
        }
        long j2 = 0;
        if (j % 8 != 0) {
            throw new IllegalStateException("outputLength not a multiple of 8");
        }
        while (j2 < j) {
            if (this.zzWc7 == 0) {
                zzWN(this.zzWcd);
                int i2 = this.zzWcb;
                if (i2 == 1024) {
                    zzB(this.zzWcd, this.zzWcc);
                    this.zzWc7 = 1024;
                } else {
                    zzV(this.zzWcd, this.zzWcc, i2 / 64);
                    this.zzWc7 = this.zzWcb;
                }
            }
            int i3 = this.zzWc7;
            long j3 = j - j2;
            int i4 = ((long) i3) > j3 ? (int) j3 : i3;
            System.arraycopy(this.zzWcc, (this.zzWcb - i3) / 8, bArr, ((int) (j2 / 8)) + i, i4 / 8);
            this.zzWc7 -= i4;
            j2 += (long) i4;
        }
    }

    public final void zzZ(byte[] bArr, int i, long j) {
        if (this.zzWca % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue.");
        }
        if (this.zzWc8) {
            throw new IllegalStateException("attempt to absorb while squeezing.");
        }
        long j2 = 0;
        while (j2 < j) {
            int i2 = this.zzWca;
            long j3 = 8;
            if (i2 == 0) {
                int i3 = this.zzWcb;
                if (j >= i3 && j2 <= j - ((long) i3)) {
                    long j4 = (j - j2) / ((long) i3);
                    long j5 = 0;
                    while (j5 < j4) {
                        byte[] bArr2 = this.zzWc6;
                        System.arraycopy(bArr, (int) ((((long) bArr2.length) * j5) + (j2 / j3) + ((long) i)), bArr2, 0, bArr2.length);
                        byte[] bArr3 = this.zzWcd;
                        byte[] bArr4 = this.zzWc6;
                        zzW(bArr3, bArr4, bArr4.length);
                        j5++;
                        j3 = j3;
                    }
                    j2 += j4 * ((long) this.zzWcb);
                }
            }
            int i4 = (int) (j - j2);
            int i5 = i4 + i2;
            int i6 = this.zzWcb;
            if (i5 > i6) {
                i4 = i6 - i2;
            }
            int i7 = i4 % 8;
            int i8 = i4 - i7;
            System.arraycopy(bArr, ((int) (j2 / 8)) + i, this.zzWcc, i2 / 8, i8 / 8);
            int i9 = this.zzWca + i8;
            this.zzWca = i9;
            j2 += (long) i8;
            if (i9 == this.zzWcb) {
                zzXE5();
            }
            if (i7 > 0) {
                byte[] bArr5 = this.zzWcc;
                int i10 = this.zzWca;
                bArr5[i10 / 8] = (byte) (((1 << i7) - 1) & bArr[((int) (j2 / 8)) + i]);
                this.zzWca = i10 + i7;
                j2 += (long) i7;
            }
        }
    }

    @Override // com.aspose.words.internal.zzYUX
    public final void update(byte[] bArr, int i, int i2) {
        zzZ(bArr, i, ((long) i2) * 8);
    }

    public zzZ08(zzZ08 zzz08) {
        byte[] bArr = new byte[200];
        this.zzWcd = bArr;
        this.zzWcc = new byte[192];
        this.zzWc4 = new long[5];
        this.zzWc3 = new long[25];
        this.zzWc2 = new long[5];
        byte[] bArr2 = zzz08.zzWcd;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        byte[] bArr3 = zzz08.zzWcc;
        System.arraycopy(bArr3, 0, this.zzWcc, 0, bArr3.length);
        this.zzWcb = zzz08.zzWcb;
        this.zzWca = zzz08.zzWca;
        this.zzWc9 = zzz08.zzWc9;
        this.zzWc8 = zzz08.zzWc8;
        this.zzWc7 = zzz08.zzWc7;
        this.zzWc6 = zzYGU.zzVI(zzz08.zzWc6);
        this.zzWc5 = zzYGU.zzVI(zzz08.zzWc5);
    }

    private static void zzY(long[] jArr, byte[] bArr) {
        for (int i = 0; i < 25; i++) {
            jArr[i] = 0;
            int i2 = i * 8;
            for (int i3 = 0; i3 < 8; i3++) {
                jArr[i] = jArr[i] | ((((long) bArr[i2 + i3]) & 255) << (i3 * 8));
            }
        }
    }

    private static void zzZ(byte[] bArr, long[] jArr) {
        for (int i = 0; i < 25; i++) {
            int i2 = i * 8;
            for (int i3 = 0; i3 < 8; i3++) {
                bArr[i2 + i3] = (byte) ((jArr[i] >>> (i3 * 8)) & 255);
            }
        }
    }
}
