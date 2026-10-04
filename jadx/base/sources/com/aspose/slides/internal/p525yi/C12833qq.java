package com.aspose.slides.internal.p525yi;

import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14058fa;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: renamed from: com.aspose.slides.internal.yi.qq */
/* JADX INFO: loaded from: classes5.dex */
public class C12833qq extends AbstractC12835to {

    /* JADX INFO: renamed from: k4 */
    private long[] f42696k4 = new long[4];

    /* JADX INFO: renamed from: h4 */
    private long[] f42695h4 = new long[2];

    /* JADX INFO: renamed from: du */
    private byte[] f42693du = new byte[64];

    /* JADX INFO: renamed from: dy */
    private byte[] f42694dy = new byte[16];

    /* JADX INFO: renamed from: m9 */
    private long[] f42697m9 = new long[16];

    public C12833qq() {
        mo18846c5();
    }

    /* JADX INFO: renamed from: k4 */
    private long m59666k4(long j, byte b) {
        long j2 = j & 4294967295L;
        return (j2 >> (32 - (b & 255))) | (4294967295L & (j2 << (b & 31)));
    }

    /* JADX INFO: renamed from: kk */
    private long m59672kk(long j, long j2, long j3) {
        return ((j & 4294967295L) ^ (j2 & 4294967295L)) ^ (j3 & 4294967295L);
    }

    /* JADX INFO: renamed from: x1 */
    private long m59674x1(long j, long j2, long j3) {
        long j4 = j2 & 4294967295L;
        long j5 = j3 & 4294967295L;
        return (j & 4294967295L & (j4 | j5)) | (j4 & j5);
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4705c6
    /* JADX INFO: renamed from: c5 */
    public void mo18846c5() {
        long[] jArr = this.f42695h4;
        jArr[0] = 0;
        jArr[1] = 0;
        long[] jArr2 = this.f42696k4;
        jArr2[0] = 1732584193;
        jArr2[1] = 4023233417L;
        jArr2[2] = 2562383102L;
        jArr2[3] = 271733878;
        AbstractC14092to.m67225k4(this.f42693du, 0, 64);
        AbstractC14092to.m67231k4(this.f42697m9, 0, 16);
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4705c6
    /* JADX INFO: renamed from: dy */
    public byte[] mo18847dy() {
        byte[] bArr = new byte[8];
        m59668k4(bArr, this.f42695h4);
        long j = ((this.f42695h4[0] & 4294967295L) >> 3) & 63;
        int i = (int) ((j >= 56 ? 120L : 56L) - j);
        mo18849x1(m59671k4(i), 0, i);
        mo18849x1(bArr, 0, 8);
        m59668k4(this.f42694dy, this.f42696k4);
        mo18846c5();
        return this.f42694dy;
    }

    /* JADX INFO: renamed from: k4 */
    private long m59667k4(long j, long j2, long j3) {
        long j4 = j & 4294967295L;
        return ((~j4) & j3 & 4294967295L) | (j2 & 4294967295L & j4);
    }

    /* JADX INFO: renamed from: kk */
    private void m59673kk(long[] jArr, long j, long j2, long j3, long j4, byte b) {
        long jM59672kk = (m59672kk(j, j2, j3) & 4294967295L) + (j4 & 4294967295L) + 1859775393 + (jArr[0] & 4294967295L);
        jArr[0] = jM59672kk;
        jArr[0] = m59666k4(jM59672kk, b);
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4705c6
    /* JADX INFO: renamed from: x1 */
    public void mo18849x1(byte[] bArr, int i, int i2) {
        long[] jArr = this.f42695h4;
        int i3 = 0;
        long j = jArr[0];
        int i4 = (int) (((j & 4294967295L) >> 3) & 63);
        long j2 = i2 << 3;
        long j3 = (j & 4294967295L) + (j2 & 4294967295L);
        jArr[0] = j3;
        if ((j3 & 4294967295L) < j2) {
            jArr[1] = jArr[1] + 1;
        }
        jArr[1] = (jArr[1] & 4294967295L) + (4294967295L & ((long) (i2 >> 29)));
        int i5 = 64 - i4;
        if (i2 >= i5) {
            C14058fa.m66596k4(bArr, i, this.f42693du, i4, i5);
            m59676x1(this.f42696k4, this.f42693du, 0);
            while (i5 + 63 < i2) {
                m59676x1(this.f42696k4, bArr, i + i5);
                i5 += 64;
            }
            i4 = 0;
            i3 = i5;
        }
        C14058fa.m66596k4(bArr, i + i3, this.f42693du, i4, i2 - i3);
    }

    /* JADX INFO: renamed from: k4 */
    private void m59668k4(byte[] bArr, long[] jArr) {
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2 += 4) {
            long j = jArr[i];
            bArr[i2] = (byte) (j & 4294967295L);
            bArr[i2 + 1] = (byte) ((j & 4294967295L) >> 8);
            bArr[i2 + 2] = (byte) ((j & 4294967295L) >> 16);
            bArr[i2 + 3] = (byte) ((j & 4294967295L) >> 24);
            i++;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m59675x1(long[] jArr, long j, long j2, long j3, long j4, byte b) {
        long jM59674x1 = (m59674x1(j, j2, j3) & 4294967295L) + (j4 & 4294967295L) + 1518500249 + (jArr[0] & 4294967295L);
        jArr[0] = jM59674x1;
        jArr[0] = m59666k4(jM59674x1, b);
    }

    /* JADX INFO: renamed from: k4 */
    private void m59669k4(long[] jArr, long j, long j2, long j3, long j4, byte b) {
        long jM59667k4 = (m59667k4(j, j2, j3) & 4294967295L) + (j4 & 4294967295L) + (jArr[0] & 4294967295L);
        jArr[0] = jM59667k4;
        jArr[0] = m59666k4(jM59667k4, b);
    }

    /* JADX INFO: renamed from: x1 */
    private void m59676x1(long[] jArr, byte[] bArr, int i) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        m59670k4(this.f42697m9, bArr, i);
        long[] jArr2 = {j};
        m59669k4(jArr2, j2, j3, j4, this.f42697m9[0], (byte) 3);
        long j5 = jArr2[0];
        long[] jArr3 = {j4};
        m59669k4(jArr3, j5, j2, j3, this.f42697m9[1], (byte) 7);
        long j6 = jArr3[0];
        long[] jArr4 = {j3};
        m59669k4(jArr4, j6, j5, j2, this.f42697m9[2], (byte) 11);
        long j7 = jArr4[0];
        long[] jArr5 = {j2};
        m59669k4(jArr5, j7, j6, j5, this.f42697m9[3], (byte) 19);
        long j8 = jArr5[0];
        jArr2[0] = j5;
        m59669k4(jArr2, j8, j7, j6, this.f42697m9[4], (byte) 3);
        long j9 = jArr2[0];
        jArr3[0] = j6;
        m59669k4(jArr3, j9, j8, j7, this.f42697m9[5], (byte) 7);
        long j10 = jArr3[0];
        jArr4[0] = j7;
        m59669k4(jArr4, j10, j9, j8, this.f42697m9[6], (byte) 11);
        long j11 = jArr4[0];
        jArr5[0] = j8;
        m59669k4(jArr5, j11, j10, j9, this.f42697m9[7], (byte) 19);
        long j12 = jArr5[0];
        jArr2[0] = j9;
        m59669k4(jArr2, j12, j11, j10, this.f42697m9[8], (byte) 3);
        long j13 = jArr2[0];
        jArr3[0] = j10;
        m59669k4(jArr3, j13, j12, j11, this.f42697m9[9], (byte) 7);
        long j14 = jArr3[0];
        jArr4[0] = j11;
        m59669k4(jArr4, j14, j13, j12, this.f42697m9[10], (byte) 11);
        long j15 = jArr4[0];
        jArr5[0] = j12;
        m59669k4(jArr5, j15, j14, j13, this.f42697m9[11], (byte) 19);
        long j16 = jArr5[0];
        jArr2[0] = j13;
        m59669k4(jArr2, j16, j15, j14, this.f42697m9[12], (byte) 3);
        long j17 = jArr2[0];
        jArr3[0] = j14;
        m59669k4(jArr3, j17, j16, j15, this.f42697m9[13], (byte) 7);
        long j18 = jArr3[0];
        jArr4[0] = j15;
        m59669k4(jArr4, j18, j17, j16, this.f42697m9[14], (byte) 11);
        long j19 = jArr4[0];
        jArr5[0] = j16;
        m59669k4(jArr5, j19, j18, j17, this.f42697m9[15], (byte) 19);
        long j20 = jArr5[0];
        jArr2[0] = j17;
        m59675x1(jArr2, j20, j19, j18, this.f42697m9[0], (byte) 3);
        long j21 = jArr2[0];
        jArr3[0] = j18;
        m59675x1(jArr3, j21, j20, j19, this.f42697m9[4], (byte) 5);
        long j22 = jArr3[0];
        jArr4[0] = j19;
        m59675x1(jArr4, j22, j21, j20, this.f42697m9[8], (byte) 9);
        long j23 = jArr4[0];
        jArr5[0] = j20;
        m59675x1(jArr5, j23, j22, j21, this.f42697m9[12], (byte) 13);
        long j24 = jArr5[0];
        jArr2[0] = j21;
        m59675x1(jArr2, j24, j23, j22, this.f42697m9[1], (byte) 3);
        long j25 = jArr2[0];
        jArr3[0] = j22;
        m59675x1(jArr3, j25, j24, j23, this.f42697m9[5], (byte) 5);
        long j26 = jArr3[0];
        jArr4[0] = j23;
        m59675x1(jArr4, j26, j25, j24, this.f42697m9[9], (byte) 9);
        long j27 = jArr4[0];
        jArr5[0] = j24;
        m59675x1(jArr5, j27, j26, j25, this.f42697m9[13], (byte) 13);
        long j28 = jArr5[0];
        jArr2[0] = j25;
        m59675x1(jArr2, j28, j27, j26, this.f42697m9[2], (byte) 3);
        long j29 = jArr2[0];
        jArr3[0] = j26;
        m59675x1(jArr3, j29, j28, j27, this.f42697m9[6], (byte) 5);
        long j30 = jArr3[0];
        jArr4[0] = j27;
        m59675x1(jArr4, j30, j29, j28, this.f42697m9[10], (byte) 9);
        long j31 = jArr4[0];
        jArr5[0] = j28;
        m59675x1(jArr5, j31, j30, j29, this.f42697m9[14], (byte) 13);
        long j32 = jArr5[0];
        jArr2[0] = j29;
        m59675x1(jArr2, j32, j31, j30, this.f42697m9[3], (byte) 3);
        long j33 = jArr2[0];
        jArr3[0] = j30;
        m59675x1(jArr3, j33, j32, j31, this.f42697m9[7], (byte) 5);
        long j34 = jArr3[0];
        jArr4[0] = j31;
        m59675x1(jArr4, j34, j33, j32, this.f42697m9[11], (byte) 9);
        long j35 = jArr4[0];
        jArr5[0] = j32;
        m59675x1(jArr5, j35, j34, j33, this.f42697m9[15], (byte) 13);
        long j36 = jArr5[0];
        jArr2[0] = j33;
        m59673kk(jArr2, j36, j35, j34, this.f42697m9[0], (byte) 3);
        long j37 = jArr2[0];
        jArr3[0] = j34;
        m59673kk(jArr3, j37, j36, j35, this.f42697m9[8], (byte) 9);
        long j38 = jArr3[0];
        jArr4[0] = j35;
        m59673kk(jArr4, j38, j37, j36, this.f42697m9[4], (byte) 11);
        long j39 = jArr4[0];
        jArr5[0] = j36;
        m59673kk(jArr5, j39, j38, j37, this.f42697m9[12], (byte) 15);
        long j40 = jArr5[0];
        jArr2[0] = j37;
        m59673kk(jArr2, j40, j39, j38, this.f42697m9[2], (byte) 3);
        long j41 = jArr2[0];
        jArr3[0] = j38;
        m59673kk(jArr3, j41, j40, j39, this.f42697m9[10], (byte) 9);
        long j42 = jArr3[0];
        jArr4[0] = j39;
        m59673kk(jArr4, j42, j41, j40, this.f42697m9[6], (byte) 11);
        long j43 = jArr4[0];
        jArr5[0] = j40;
        m59673kk(jArr5, j43, j42, j41, this.f42697m9[14], (byte) 15);
        long j44 = jArr5[0];
        jArr2[0] = j41;
        m59673kk(jArr2, j44, j43, j42, this.f42697m9[1], (byte) 3);
        long j45 = jArr2[0];
        jArr3[0] = j42;
        m59673kk(jArr3, j45, j44, j43, this.f42697m9[9], (byte) 9);
        long j46 = jArr3[0];
        jArr4[0] = j43;
        m59673kk(jArr4, j46, j45, j44, this.f42697m9[5], (byte) 11);
        long j47 = jArr4[0];
        jArr5[0] = j44;
        m59673kk(jArr5, j47, j46, j45, this.f42697m9[13], (byte) 15);
        long j48 = jArr5[0];
        jArr2[0] = j45;
        m59673kk(jArr2, j48, j47, j46, this.f42697m9[3], (byte) 3);
        long j49 = jArr2[0];
        jArr3[0] = j46;
        m59673kk(jArr3, j49, j48, j47, this.f42697m9[11], (byte) 9);
        long j50 = jArr3[0];
        jArr4[0] = j47;
        m59673kk(jArr4, j50, j49, j48, this.f42697m9[7], (byte) 11);
        long j51 = jArr4[0];
        jArr5[0] = j48;
        m59673kk(jArr5, j51, j50, j49, this.f42697m9[15], (byte) 15);
        long j52 = jArr5[0];
        jArr[0] = (jArr[0] & 4294967295L) + (j49 & 4294967295L);
        jArr[1] = (jArr[1] & 4294967295L) + (j52 & 4294967295L);
        jArr[2] = (jArr[2] & 4294967295L) + (j51 & 4294967295L);
        jArr[3] = (jArr[3] & 4294967295L) + (j50 & 4294967295L);
    }

    /* JADX INFO: renamed from: k4 */
    private void m59670k4(long[] jArr, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < jArr.length) {
            jArr[i2] = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
            i2++;
            i += 4;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private byte[] m59671k4(int i) {
        if (i <= 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        bArr[0] = UnsignedBytes.MAX_POWER_OF_TWO;
        return bArr;
    }
}
