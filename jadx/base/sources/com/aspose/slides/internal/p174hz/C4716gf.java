package com.aspose.slides.internal.p174hz;

import com.aspose.slides.p559ms.System.C14058fa;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.gf */
/* JADX INFO: loaded from: classes.dex */
class C4716gf {

    /* JADX INFO: renamed from: to */
    private int f13143to;

    /* JADX INFO: renamed from: x1 */
    private long f13144x1;

    /* JADX INFO: renamed from: k4 */
    private long[] f13141k4 = new long[5];

    /* JADX INFO: renamed from: kk */
    private byte[] f13142kk = new byte[64];

    /* JADX INFO: renamed from: du */
    private long[] f13140du = new long[80];

    public C4716gf() {
        m19619x1();
    }

    /* JADX INFO: renamed from: k4 */
    public void m19616k4(long j, byte[] bArr, int i) {
        bArr[i] = (byte) (j >> 56);
        bArr[i + 1] = (byte) (j >> 48);
        bArr[i + 2] = (byte) (j >> 40);
        bArr[i + 3] = (byte) (j >> 32);
        bArr[i + 4] = (byte) (j >> 24);
        bArr[i + 5] = (byte) (j >> 16);
        bArr[i + 6] = (byte) (j >> 8);
        bArr[i + 7] = (byte) j;
    }

    /* JADX INFO: renamed from: x1 */
    public void m19619x1() {
        this.f13144x1 = 0L;
        this.f13143to = 0;
        long[] jArr = this.f13141k4;
        jArr[0] = 1732584193;
        jArr[1] = 4023233417L;
        jArr[2] = 2562383102L;
        jArr[3] = 271733878;
        jArr[4] = 3285377520L;
    }

    /* JADX INFO: renamed from: x1 */
    private void m19615x1(byte[] bArr, int i, int i2) {
        long j = this.f13144x1 + ((long) i2);
        int i3 = (int) (j % 64);
        int i4 = 56 - i3;
        if (i4 < 1) {
            i4 = 120 - i3;
        }
        int i5 = i4 + i2;
        int i6 = i5 + 8;
        byte[] bArr2 = i6 == 64 ? this.f13142kk : new byte[i6];
        if (i2 >= 0) {
            System.arraycopy(bArr, i, bArr2, 0, i2);
        }
        bArr2[i2] = UnsignedBytes.MAX_POWER_OF_TWO;
        for (int i7 = i2 + 1; i7 < i5; i7++) {
            bArr2[i7] = 0;
        }
        m19616k4(j << 3, bArr2, i5);
        m19612k4(bArr2, 0L);
        if (i6 == 128) {
            m19612k4(bArr2, 64L);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m19617k4(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5 = this.f13143to;
        if (i5 != 0) {
            if (i2 < 64 - i5) {
                C14058fa.m66596k4(bArr, i, this.f13142kk, i5, i2);
                this.f13143to += i2;
                return;
            }
            int i6 = 64 - i5;
            C14058fa.m66596k4(bArr, i, this.f13142kk, i5, i6);
            m19612k4(this.f13142kk, 0L);
            this.f13143to = 0;
            i += i6;
            i2 -= i6;
        }
        int i7 = 0;
        while (true) {
            i3 = i2 % 64;
            i4 = i2 - i3;
            if (i7 >= i4) {
                break;
            }
            m19612k4(bArr, i + i7);
            i7 += 64;
        }
        if (i3 != 0) {
            C14058fa.m66596k4(bArr, i4 + i, this.f13142kk, 0, i3);
            this.f13143to = i3;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m19612k4(byte[] bArr, long j) {
        this.f13144x1 += 64;
        long[] jArr = this.f13141k4;
        long[] jArr2 = this.f13140du;
        m19614k4(jArr2, bArr, j);
        m19613k4(jArr2);
        int i = 0;
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        while (i < 20) {
            long j7 = j2 & 4294967295L;
            long j8 = j4 & 4294967295L;
            long j9 = j5 & 4294967295L;
            long j10 = j3 & 4294967295L;
            long j11 = (((j2 << 5) & 4294967295L) | (j7 >> 27)) + (((j8 ^ j9) & j10) ^ j9) + 1518500249 + (jArr2[i] & 4294967295L) + (j6 & 4294967295L);
            long j12 = ((j3 << 30) & 4294967295L) | (j10 >> 2);
            long j13 = j11 & 4294967295L;
            long j14 = j12 & 4294967295L;
            long j15 = (((j11 << 5) & 4294967295L) | (j13 >> 27)) + (((j14 ^ j8) & j7) ^ j8) + 1518500249 + (jArr2[i + 1] & 4294967295L) + j9;
            long j16 = ((j2 << 30) & 4294967295L) | (j7 >> 2);
            long j17 = j15 & 4294967295L;
            long j18 = j16 & 4294967295L;
            long j19 = (((j15 << 5) & 4294967295L) | (j17 >> 27)) + (((j18 ^ j14) & j13) ^ j14) + 1518500249 + (jArr2[i + 2] & 4294967295L) + j8;
            long j20 = ((j11 << 30) & 4294967295L) | (j13 >> 2);
            long j21 = j19 & 4294967295L;
            long j22 = j20 & 4294967295L;
            j3 = (((j19 << 5) & 4294967295L) | (j21 >> 27)) + (((j22 ^ j18) & j17) ^ j18) + 1518500249 + (jArr2[i + 3] & 4294967295L) + j14;
            long j23 = ((j15 << 30) & 4294967295L) | (j17 >> 2);
            j2 = (((j3 << 5) & 4294967295L) | ((j3 & 4294967295L) >> 27)) + ((((j23 & 4294967295L) ^ j22) & j21) ^ j22) + 1518500249 + (jArr2[i + 4] & 4294967295L) + j18;
            i += 5;
            j6 = j20;
            j4 = ((j19 << 30) & 4294967295L) | (j21 >> 2);
            j5 = j23;
        }
        while (i < 40) {
            long j24 = j2 & 4294967295L;
            long j25 = j3 & 4294967295L;
            long j26 = j4 & 4294967295L;
            long j27 = j5 & 4294967295L;
            long j28 = (((j2 << 5) & 4294967295L) | (j24 >> 27)) + ((j25 ^ j26) ^ j27) + 1859775393 + (jArr2[i] & 4294967295L) + (j6 & 4294967295L);
            long j29 = ((j3 << 30) & 4294967295L) | (j25 >> 2);
            long j30 = j28 & 4294967295L;
            long j31 = j29 & 4294967295L;
            long j32 = (((j28 << 5) & 4294967295L) | (j30 >> 27)) + ((j24 ^ j31) ^ j26) + 1859775393 + (jArr2[i + 1] & 4294967295L) + j27;
            long j33 = ((j2 << 30) & 4294967295L) | (j24 >> 2);
            long j34 = j32 & 4294967295L;
            long j35 = j33 & 4294967295L;
            long j36 = (((j32 << 5) & 4294967295L) | (j34 >> 27)) + ((j30 ^ j35) ^ j31) + 1859775393 + (jArr2[i + 2] & 4294967295L) + j26;
            long j37 = ((j28 << 30) & 4294967295L) | (j30 >> 2);
            long j38 = j36 & 4294967295L;
            long j39 = j37 & 4294967295L;
            j3 = (((j36 << 5) & 4294967295L) | (j38 >> 27)) + ((j34 ^ j39) ^ j35) + 1859775393 + (jArr2[i + 3] & 4294967295L) + j31;
            long j40 = ((j32 << 30) & 4294967295L) | (j34 >> 2);
            j2 = (((j3 << 5) & 4294967295L) | ((j3 & 4294967295L) >> 27)) + ((j38 ^ (j40 & 4294967295L)) ^ j39) + 1859775393 + (jArr2[i + 4] & 4294967295L) + j35;
            i += 5;
            j6 = j37;
            j4 = ((j36 << 30) & 4294967295L) | (j38 >> 2);
            j5 = j40;
        }
        while (i < 60) {
            long j41 = j2 & 4294967295L;
            long j42 = j3 & 4294967295L;
            long j43 = j4 & 4294967295L;
            long j44 = j5 & 4294967295L;
            long j45 = (((j2 << 5) & 4294967295L) | (j41 >> 27)) + (((j43 | j44) & j42) | (j43 & j44)) + 2400959708L + (jArr2[i] & 4294967295L) + (j6 & 4294967295L);
            long j46 = ((j3 << 30) & 4294967295L) | (j42 >> 2);
            long j47 = j45 & 4294967295L;
            long j48 = j46 & 4294967295L;
            long j49 = (((j45 << 5) & 4294967295L) | (j47 >> 27)) + (((j48 | j43) & j41) | (j48 & j43)) + 2400959708L + (jArr2[i + 1] & 4294967295L) + j44;
            long j50 = ((j2 << 30) & 4294967295L) | (j41 >> 2);
            long j51 = j49 & 4294967295L;
            long j52 = j50 & 4294967295L;
            long j53 = (((j49 << 5) & 4294967295L) | (j51 >> 27)) + (((j52 | j48) & j47) | (j52 & j48)) + 2400959708L + (jArr2[i + 2] & 4294967295L) + j43;
            long j54 = ((j45 << 30) & 4294967295L) | (j47 >> 2);
            long j55 = j53 & 4294967295L;
            long j56 = j54 & 4294967295L;
            j3 = (((j53 << 5) & 4294967295L) | (j55 >> 27)) + (((j56 | j52) & j51) | (j56 & j52)) + 2400959708L + (jArr2[i + 3] & 4294967295L) + j48;
            long j57 = ((j49 << 30) & 4294967295L) | (j51 >> 2);
            long j58 = j57 & 4294967295L;
            j2 = (((j3 << 5) & 4294967295L) | ((j3 & 4294967295L) >> 27)) + (((j58 | j56) & j55) | (j58 & j56)) + 2400959708L + (jArr2[i + 4] & 4294967295L) + j52;
            i += 5;
            j6 = j54;
            j4 = ((j53 << 30) & 4294967295L) | (j55 >> 2);
            j5 = j57;
        }
        while (i < 80) {
            long j59 = j2 & 4294967295L;
            long j60 = j3 & 4294967295L;
            long j61 = j4 & 4294967295L;
            long j62 = j5 & 4294967295L;
            long j63 = (((j2 << 5) & 4294967295L) | (j59 >> 27)) + ((j60 ^ j61) ^ j62) + 3395469782L + (jArr2[i] & 4294967295L) + (j6 & 4294967295L);
            long j64 = ((j3 << 30) & 4294967295L) | (j60 >> 2);
            long j65 = j63 & 4294967295L;
            long j66 = j64 & 4294967295L;
            long j67 = (((j63 << 5) & 4294967295L) | (j65 >> 27)) + ((j59 ^ j66) ^ j61) + 3395469782L + (jArr2[i + 1] & 4294967295L) + j62;
            long j68 = ((j2 << 30) & 4294967295L) | (j59 >> 2);
            long j69 = j67 & 4294967295L;
            long j70 = j68 & 4294967295L;
            long j71 = (((j67 << 5) & 4294967295L) | (j69 >> 27)) + ((j65 ^ j70) ^ j66) + 3395469782L + (jArr2[i + 2] & 4294967295L) + j61;
            long j72 = ((j63 << 30) & 4294967295L) | (j65 >> 2);
            long j73 = j71 & 4294967295L;
            long j74 = j72 & 4294967295L;
            j3 = (((j71 << 5) & 4294967295L) | (j73 >> 27)) + ((j69 ^ j74) ^ j70) + 3395469782L + (jArr2[i + 3] & 4294967295L) + j66;
            long j75 = ((j67 << 30) & 4294967295L) | (j69 >> 2);
            j2 = (((j3 << 5) & 4294967295L) | ((j3 & 4294967295L) >> 27)) + ((j73 ^ (j75 & 4294967295L)) ^ j74) + 3395469782L + (jArr2[i + 4] & 4294967295L) + j70;
            i += 5;
            j6 = j72;
            j4 = ((j71 << 30) & 4294967295L) | (j73 >> 2);
            j5 = j75;
        }
        jArr[0] = (jArr[0] & 4294967295L) + (j2 & 4294967295L);
        jArr[1] = (jArr[1] & 4294967295L) + (j3 & 4294967295L);
        jArr[2] = (jArr[2] & 4294967295L) + (j4 & 4294967295L);
        jArr[3] = (jArr[3] & 4294967295L) + (j5 & 4294967295L);
        jArr[4] = (jArr[4] & 4294967295L) + (j6 & 4294967295L);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m19613k4(long[] jArr) {
        for (int i = 16; i < 80; i += 8) {
            int i2 = i - 3;
            int i3 = i - 8;
            int i4 = i - 14;
            long j = (((jArr[i2] & 4294967295L) ^ (jArr[i3] & 4294967295L)) ^ (jArr[i4] & 4294967295L)) ^ (jArr[i - 16] & 4294967295L);
            jArr[i] = ((j & 4294967295L) >> 31) | ((j << 1) & 4294967295L);
            int i5 = i - 2;
            int i6 = i - 7;
            int i7 = i - 13;
            long j2 = (((jArr[i5] & 4294967295L) ^ (jArr[i6] & 4294967295L)) ^ (jArr[i7] & 4294967295L)) ^ (jArr[i - 15] & 4294967295L);
            int i8 = i + 1;
            jArr[i8] = ((j2 & 4294967295L) >> 31) | ((j2 << 1) & 4294967295L);
            int i9 = i - 1;
            int i10 = i - 12;
            long j3 = (((jArr[i9] & 4294967295L) ^ (jArr[i - 6] & 4294967295L)) ^ (jArr[i10] & 4294967295L)) ^ (jArr[i4] & 4294967295L);
            int i11 = i + 2;
            jArr[i11] = ((j3 << 1) & 4294967295L) | ((j3 & 4294967295L) >> 31);
            int i12 = i - 11;
            long j4 = (((jArr[i] & 4294967295L) ^ (jArr[i - 5] & 4294967295L)) ^ (jArr[i12] & 4294967295L)) ^ (jArr[i7] & 4294967295L);
            int i13 = i + 3;
            jArr[i13] = ((j4 << 1) & 4294967295L) | ((j4 & 4294967295L) >> 31);
            int i14 = i - 10;
            long j5 = (((jArr[i8] & 4294967295L) ^ (jArr[i - 4] & 4294967295L)) ^ (jArr[i14] & 4294967295L)) ^ (jArr[i10] & 4294967295L);
            int i15 = i + 4;
            jArr[i15] = ((j5 << 1) & 4294967295L) | ((j5 & 4294967295L) >> 31);
            long j6 = (jArr[i11] & 4294967295L) ^ (jArr[i2] & 4294967295L);
            int i16 = i - 9;
            long j7 = (j6 ^ (jArr[i16] & 4294967295L)) ^ (jArr[i12] & 4294967295L);
            jArr[i + 5] = ((j7 << 1) & 4294967295L) | ((j7 & 4294967295L) >> 31);
            long j8 = ((jArr[i3] & 4294967295L) ^ ((jArr[i13] & 4294967295L) ^ (jArr[i5] & 4294967295L))) ^ (jArr[i14] & 4294967295L);
            jArr[i + 6] = ((j8 & 4294967295L) >> 31) | ((j8 << 1) & 4294967295L);
            long j9 = ((jArr[i6] & 4294967295L) ^ ((jArr[i15] & 4294967295L) ^ (jArr[i9] & 4294967295L))) ^ (jArr[i16] & 4294967295L);
            jArr[i + 7] = ((j9 & 4294967295L) >> 31) | ((j9 << 1) & 4294967295L);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m19614k4(long[] jArr, byte[] bArr, long j) {
        long j2 = j & 4294967295L;
        jArr[0] = ((bArr[(int) j2] & 255) << 24) | ((bArr[(int) (1 + j2)] & 255) << 16) | ((bArr[(int) (2 + j2)] & 255) << 8) | (bArr[(int) (3 + j2)] & 255);
        jArr[1] = ((bArr[(int) (4 + j2)] & 255) << 24) | ((bArr[(int) (5 + j2)] & 255) << 16) | ((bArr[(int) (6 + j2)] & 255) << 8) | (bArr[(int) (7 + j2)] & 255);
        jArr[2] = ((bArr[(int) (8 + j2)] & 255) << 24) | ((bArr[(int) (9 + j2)] & 255) << 16) | ((bArr[(int) (10 + j2)] & 255) << 8) | (bArr[(int) (11 + j2)] & 255);
        jArr[3] = ((bArr[(int) (12 + j2)] & 255) << 24) | ((bArr[(int) (13 + j2)] & 255) << 16) | ((bArr[(int) (14 + j2)] & 255) << 8) | (bArr[(int) (15 + j2)] & 255);
        jArr[4] = ((bArr[(int) (16 + j2)] & 255) << 24) | ((bArr[(int) (17 + j2)] & 255) << 16) | ((bArr[(int) (18 + j2)] & 255) << 8) | (bArr[(int) (19 + j2)] & 255);
        jArr[5] = ((bArr[(int) (20 + j2)] & 255) << 24) | ((bArr[(int) (21 + j2)] & 255) << 16) | ((bArr[(int) (22 + j2)] & 255) << 8) | (bArr[(int) (23 + j2)] & 255);
        jArr[6] = ((bArr[(int) (24 + j2)] & 255) << 24) | ((bArr[(int) (25 + j2)] & 255) << 16) | ((bArr[(int) (26 + j2)] & 255) << 8) | (bArr[(int) (27 + j2)] & 255);
        jArr[7] = ((bArr[(int) (28 + j2)] & 255) << 24) | ((bArr[(int) (29 + j2)] & 255) << 16) | ((bArr[(int) (30 + j2)] & 255) << 8) | (bArr[(int) (31 + j2)] & 255);
        jArr[8] = ((bArr[(int) (32 + j2)] & 255) << 24) | ((bArr[(int) (33 + j2)] & 255) << 16) | ((bArr[(int) (34 + j2)] & 255) << 8) | (bArr[(int) (35 + j2)] & 255);
        jArr[9] = ((bArr[(int) (36 + j2)] & 255) << 24) | ((bArr[(int) (37 + j2)] & 255) << 16) | ((bArr[(int) (38 + j2)] & 255) << 8) | (bArr[(int) (39 + j2)] & 255);
        jArr[10] = ((bArr[(int) (40 + j2)] & 255) << 24) | ((bArr[(int) (41 + j2)] & 255) << 16) | ((bArr[(int) (42 + j2)] & 255) << 8) | (bArr[(int) (43 + j2)] & 255);
        jArr[11] = ((bArr[(int) (44 + j2)] & 255) << 24) | ((bArr[(int) (45 + j2)] & 255) << 16) | ((bArr[(int) (46 + j2)] & 255) << 8) | (bArr[(int) (47 + j2)] & 255);
        jArr[12] = ((bArr[(int) (48 + j2)] & 255) << 24) | ((bArr[(int) (49 + j2)] & 255) << 16) | ((bArr[(int) (50 + j2)] & 255) << 8) | (bArr[(int) (51 + j2)] & 255);
        jArr[13] = ((bArr[(int) (52 + j2)] & 255) << 24) | ((bArr[(int) (53 + j2)] & 255) << 16) | ((bArr[(int) (54 + j2)] & 255) << 8) | (bArr[(int) (55 + j2)] & 255);
        jArr[14] = ((bArr[(int) (56 + j2)] & 255) << 24) | ((bArr[(int) (57 + j2)] & 255) << 16) | ((bArr[(int) (58 + j2)] & 255) << 8) | (bArr[(int) (59 + j2)] & 255);
        jArr[15] = (bArr[(int) (j2 + 63)] & 255) | ((bArr[(int) (60 + j2)] & 255) << 24) | ((bArr[(int) (61 + j2)] & 255) << 16) | ((bArr[(int) (62 + j2)] & 255) << 8);
    }

    /* JADX INFO: renamed from: k4 */
    public byte[] m19618k4() {
        byte[] bArr = new byte[20];
        m19615x1(this.f13142kk, 0, this.f13143to);
        for (int i = 0; i < 5; i++) {
            for (int i2 = 0; i2 < 4; i2++) {
                bArr[(i * 4) + i2] = (byte) ((this.f13141k4[i] & 4294967295L) >> ((3 - i2) * 8));
            }
        }
        return bArr;
    }
}
