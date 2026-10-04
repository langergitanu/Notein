package com.aspose.slides.internal.p456v5;

import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: renamed from: com.aspose.slides.internal.v5.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11606h4 {

    /* JADX INFO: renamed from: k4 */
    private long[] f39175k4 = new long[4];

    /* JADX INFO: renamed from: kk */
    private long[] f39176kk = new long[2];

    /* JADX INFO: renamed from: x1 */
    private byte[] f39178x1 = new byte[64];

    /* JADX INFO: renamed from: du */
    private byte[] f39174du = new byte[16];

    /* JADX INFO: renamed from: to */
    private long[] f39177to = new long[16];

    public C11606h4() {
        m54668x1();
    }

    /* JADX INFO: renamed from: k4 */
    private static long m54659k4(long j, byte b) {
        long j2 = j & 4294967295L;
        return ((j2 >> (32 - (b & 255))) | (j2 << (b & 31))) & 4294967295L;
    }

    /* JADX INFO: renamed from: kk */
    private static long m54665kk(long j, long j2, long j3) {
        return ((j ^ j2) ^ j3) & 4294967295L;
    }

    /* JADX INFO: renamed from: x1 */
    private static long m54667x1(long j, long j2, long j3) {
        return ((j & (j2 | j3)) | (j2 & j3)) & 4294967295L;
    }

    /* JADX INFO: renamed from: k4 */
    private static long m54660k4(long j, long j2, long j3) {
        return (((~(j & 4294967295L)) & 4294967295L & j3) | (j2 & j)) & 4294967295L;
    }

    /* JADX INFO: renamed from: kk */
    private static void m54666kk(long[] jArr, long j, long j2, long j3, long j4, byte b) {
        long jM54665kk = ((jArr[0] & 4294967295L) + (((((m54665kk(j, j2, j3) & 4294967295L) + (j4 & 4294967295L)) & 4294967295L) + 1859775393) & 4294967295L)) & 4294967295L;
        jArr[0] = jM54665kk;
        jArr[0] = m54659k4(jM54665kk, b);
    }

    /* JADX INFO: renamed from: x1 */
    private void m54668x1() {
        long[] jArr = this.f39176kk;
        jArr[0] = 0;
        jArr[1] = 0;
        long[] jArr2 = this.f39175k4;
        jArr2[0] = 1732584193;
        jArr2[1] = 4023233417L;
        jArr2[2] = 2562383102L;
        jArr2[3] = 271733878;
        AbstractC14092to.m67215k4(AbstractC14092to.m67208k4((Object) this.f39178x1), 0, 64);
        AbstractC14092to.m67215k4(AbstractC14092to.m67208k4(this.f39177to), 0, 16);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m54661k4(byte[] bArr, long[] jArr) {
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2 += 4) {
            bArr[i2] = (byte) jArr[i];
            bArr[i2 + 1] = (byte) (((r2 & 4294967295L) >> 8) & 4294967295L);
            bArr[i2 + 2] = (byte) (((r2 & 4294967295L) >> 16) & 4294967295L);
            bArr[i2 + 3] = (byte) (((r2 & 4294967295L) >> 24) & 4294967295L);
            i++;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m54674x1(byte[] bArr, int i, int i2) {
        long[] jArr = this.f39176kk;
        int i3 = 0;
        long j = jArr[0];
        int i4 = (int) (((j & 4294967295L) >> 3) & 63);
        long j2 = i2 << 3;
        long j3 = (j & 4294967295L) + (j2 & 4294967295L);
        jArr[0] = j3 & 4294967295L;
        if ((j3 & 4294967295L) < j2) {
            jArr[1] = jArr[1] + 1;
        }
        jArr[1] = 4294967295L & ((jArr[1] & 4294967295L) + (((long) (i2 >> 29)) & 4294967295L));
        int i5 = 64 - i4;
        if (i2 >= i5) {
            AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArr), i, AbstractC14092to.m67208k4((Object) this.f39178x1), i4, i5);
            m54670x1(this.f39175k4, this.f39178x1, 0);
            while (i5 + 63 < i2) {
                m54670x1(this.f39175k4, bArr, i5);
                i5 += 64;
            }
            i4 = 0;
            i3 = i5;
        }
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArr), i + i3, AbstractC14092to.m67208k4((Object) this.f39178x1), i4, i2 - i3);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m54662k4(long[] jArr, long j, long j2, long j3, long j4, byte b) {
        long jM54660k4 = ((jArr[0] & 4294967295L) + (((m54660k4(j, j2, j3) & 4294967295L) + (j4 & 4294967295L)) & 4294967295L)) & 4294967295L;
        jArr[0] = jM54660k4;
        jArr[0] = m54659k4(jM54660k4, b);
    }

    /* JADX INFO: renamed from: x1 */
    private static void m54669x1(long[] jArr, long j, long j2, long j3, long j4, byte b) {
        long jM54667x1 = ((jArr[0] & 4294967295L) + (((((m54667x1(j, j2, j3) & 4294967295L) + (j4 & 4294967295L)) & 4294967295L) + 1518500249) & 4294967295L)) & 4294967295L;
        jArr[0] = jM54667x1;
        jArr[0] = m54659k4(jM54667x1, b);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m54663k4(long[] jArr, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < jArr.length) {
            jArr[i2] = ((long) ((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24))) & 4294967295L;
            i2++;
            i += 4;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m54670x1(long[] jArr, byte[] bArr, int i) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        m54663k4(this.f39177to, bArr, i);
        long[] jArr2 = {j};
        m54662k4(jArr2, j2, j3, j4, this.f39177to[0], (byte) 3);
        long j5 = jArr2[0];
        long[] jArr3 = {j4};
        m54662k4(jArr3, j5, j2, j3, this.f39177to[1], (byte) 7);
        long j6 = jArr3[0];
        long[] jArr4 = {j3};
        m54662k4(jArr4, j6, j5, j2, this.f39177to[2], (byte) 11);
        long j7 = jArr4[0];
        long[] jArr5 = {j2};
        m54662k4(jArr5, j7, j6, j5, this.f39177to[3], (byte) 19);
        long j8 = jArr5[0];
        jArr2[0] = j5;
        m54662k4(jArr2, j8, j7, j6, this.f39177to[4], (byte) 3);
        long j9 = jArr2[0];
        jArr3[0] = j6;
        m54662k4(jArr3, j9, j8, j7, this.f39177to[5], (byte) 7);
        long j10 = jArr3[0];
        jArr4[0] = j7;
        m54662k4(jArr4, j10, j9, j8, this.f39177to[6], (byte) 11);
        long j11 = jArr4[0];
        jArr5[0] = j8;
        m54662k4(jArr5, j11, j10, j9, this.f39177to[7], (byte) 19);
        long j12 = jArr5[0];
        jArr2[0] = j9;
        m54662k4(jArr2, j12, j11, j10, this.f39177to[8], (byte) 3);
        long j13 = jArr2[0];
        jArr3[0] = j10;
        m54662k4(jArr3, j13, j12, j11, this.f39177to[9], (byte) 7);
        long j14 = jArr3[0];
        jArr4[0] = j11;
        m54662k4(jArr4, j14, j13, j12, this.f39177to[10], (byte) 11);
        long j15 = jArr4[0];
        jArr5[0] = j12;
        m54662k4(jArr5, j15, j14, j13, this.f39177to[11], (byte) 19);
        long j16 = jArr5[0];
        jArr2[0] = j13;
        m54662k4(jArr2, j16, j15, j14, this.f39177to[12], (byte) 3);
        long j17 = jArr2[0];
        jArr3[0] = j14;
        m54662k4(jArr3, j17, j16, j15, this.f39177to[13], (byte) 7);
        long j18 = jArr3[0];
        jArr4[0] = j15;
        m54662k4(jArr4, j18, j17, j16, this.f39177to[14], (byte) 11);
        long j19 = jArr4[0];
        jArr5[0] = j16;
        m54662k4(jArr5, j19, j18, j17, this.f39177to[15], (byte) 19);
        long j20 = jArr5[0];
        jArr2[0] = j17;
        m54669x1(jArr2, j20, j19, j18, this.f39177to[0], (byte) 3);
        long j21 = jArr2[0];
        jArr3[0] = j18;
        m54669x1(jArr3, j21, j20, j19, this.f39177to[4], (byte) 5);
        long j22 = jArr3[0];
        jArr4[0] = j19;
        m54669x1(jArr4, j22, j21, j20, this.f39177to[8], (byte) 9);
        long j23 = jArr4[0];
        jArr5[0] = j20;
        m54669x1(jArr5, j23, j22, j21, this.f39177to[12], (byte) 13);
        long j24 = jArr5[0];
        jArr2[0] = j21;
        m54669x1(jArr2, j24, j23, j22, this.f39177to[1], (byte) 3);
        long j25 = jArr2[0];
        jArr3[0] = j22;
        m54669x1(jArr3, j25, j24, j23, this.f39177to[5], (byte) 5);
        long j26 = jArr3[0];
        jArr4[0] = j23;
        m54669x1(jArr4, j26, j25, j24, this.f39177to[9], (byte) 9);
        long j27 = jArr4[0];
        jArr5[0] = j24;
        m54669x1(jArr5, j27, j26, j25, this.f39177to[13], (byte) 13);
        long j28 = jArr5[0];
        jArr2[0] = j25;
        m54669x1(jArr2, j28, j27, j26, this.f39177to[2], (byte) 3);
        long j29 = jArr2[0];
        jArr3[0] = j26;
        m54669x1(jArr3, j29, j28, j27, this.f39177to[6], (byte) 5);
        long j30 = jArr3[0];
        jArr4[0] = j27;
        m54669x1(jArr4, j30, j29, j28, this.f39177to[10], (byte) 9);
        long j31 = jArr4[0];
        jArr5[0] = j28;
        m54669x1(jArr5, j31, j30, j29, this.f39177to[14], (byte) 13);
        long j32 = jArr5[0];
        jArr2[0] = j29;
        m54669x1(jArr2, j32, j31, j30, this.f39177to[3], (byte) 3);
        long j33 = jArr2[0];
        jArr3[0] = j30;
        m54669x1(jArr3, j33, j32, j31, this.f39177to[7], (byte) 5);
        long j34 = jArr3[0];
        jArr4[0] = j31;
        m54669x1(jArr4, j34, j33, j32, this.f39177to[11], (byte) 9);
        long j35 = jArr4[0];
        jArr5[0] = j32;
        m54669x1(jArr5, j35, j34, j33, this.f39177to[15], (byte) 13);
        long j36 = jArr5[0];
        jArr2[0] = j33;
        m54666kk(jArr2, j36, j35, j34, this.f39177to[0], (byte) 3);
        long j37 = jArr2[0];
        jArr3[0] = j34;
        m54666kk(jArr3, j37, j36, j35, this.f39177to[8], (byte) 9);
        long j38 = jArr3[0];
        jArr4[0] = j35;
        m54666kk(jArr4, j38, j37, j36, this.f39177to[4], (byte) 11);
        long j39 = jArr4[0];
        jArr5[0] = j36;
        m54666kk(jArr5, j39, j38, j37, this.f39177to[12], (byte) 15);
        long j40 = jArr5[0];
        jArr2[0] = j37;
        m54666kk(jArr2, j40, j39, j38, this.f39177to[2], (byte) 3);
        long j41 = jArr2[0];
        jArr3[0] = j38;
        m54666kk(jArr3, j41, j40, j39, this.f39177to[10], (byte) 9);
        long j42 = jArr3[0];
        jArr4[0] = j39;
        m54666kk(jArr4, j42, j41, j40, this.f39177to[6], (byte) 11);
        long j43 = jArr4[0];
        jArr5[0] = j40;
        m54666kk(jArr5, j43, j42, j41, this.f39177to[14], (byte) 15);
        long j44 = jArr5[0];
        jArr2[0] = j41;
        m54666kk(jArr2, j44, j43, j42, this.f39177to[1], (byte) 3);
        long j45 = jArr2[0];
        jArr3[0] = j42;
        m54666kk(jArr3, j45, j44, j43, this.f39177to[9], (byte) 9);
        long j46 = jArr3[0];
        jArr4[0] = j43;
        m54666kk(jArr4, j46, j45, j44, this.f39177to[5], (byte) 11);
        long j47 = jArr4[0];
        jArr5[0] = j44;
        m54666kk(jArr5, j47, j46, j45, this.f39177to[13], (byte) 15);
        long j48 = jArr5[0];
        jArr2[0] = j45;
        m54666kk(jArr2, j48, j47, j46, this.f39177to[3], (byte) 3);
        long j49 = jArr2[0];
        jArr3[0] = j46;
        m54666kk(jArr3, j49, j48, j47, this.f39177to[11], (byte) 9);
        long j50 = jArr3[0];
        jArr4[0] = j47;
        m54666kk(jArr4, j50, j49, j48, this.f39177to[7], (byte) 11);
        long j51 = jArr4[0];
        jArr5[0] = j48;
        m54666kk(jArr5, j51, j50, j49, this.f39177to[15], (byte) 15);
        long j52 = jArr5[0];
        jArr[0] = ((jArr[0] & 4294967295L) + (j49 & 4294967295L)) & 4294967295L;
        jArr[1] = ((jArr[1] & 4294967295L) + (j52 & 4294967295L)) & 4294967295L;
        jArr[2] = ((jArr[2] & 4294967295L) + (j51 & 4294967295L)) & 4294967295L;
        jArr[3] = ((jArr[3] & 4294967295L) + (j50 & 4294967295L)) & 4294967295L;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m54671k4() {
        byte[] bArr = new byte[8];
        m54661k4(bArr, this.f39176kk);
        long j = ((this.f39176kk[0] & 4294967295L) >> 3) & 63;
        int i = (int) (((j >= 56 ? 120L : 56L) - j) & 4294967295L);
        m54674x1(m54664k4(i), 0, i);
        m54674x1(bArr, 0, 8);
        m54661k4(this.f39174du, this.f39175k4);
        m54668x1();
        return this.f39174du;
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m54664k4(int i) {
        if (i <= 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        bArr[0] = UnsignedBytes.MAX_POWER_OF_TWO;
        return bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m54672k4(byte[] bArr) {
        return m54673k4(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m54673k4(byte[] bArr, int i, int i2) {
        m54674x1(bArr, i, i2);
        return m54671k4();
    }
}
