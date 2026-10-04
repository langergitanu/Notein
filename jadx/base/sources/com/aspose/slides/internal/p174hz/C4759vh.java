package com.aspose.slides.internal.p174hz;

import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14058fa;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.vh */
/* JADX INFO: loaded from: classes.dex */
public class C4759vh extends AbstractC4760vj {

    /* JADX INFO: renamed from: dy */
    private int f13296dy;

    /* JADX INFO: renamed from: m9 */
    private long f13299m9;

    /* JADX INFO: renamed from: du */
    private long[] f13295du = new long[16];

    /* JADX INFO: renamed from: h4 */
    private long[] f13297h4 = new long[5];

    /* JADX INFO: renamed from: k4 */
    private byte[] f13298k4 = new byte[64];

    public C4759vh() {
        mo18846c5();
    }

    /* JADX INFO: renamed from: du */
    private long m19771du(long j, long j2, long j3) {
        return (j & 4294967295L) ^ ((j2 & 4294967295L) | (~(j3 & 4294967295L)));
    }

    /* JADX INFO: renamed from: dy */
    private void m19774dy(long[] jArr, long j, long[] jArr2, long j2, long j3, long j4, int i) {
        long jM19782kk = (m19782kk(j, jArr2[0], j2) & 4294967295L) + (j4 & 4294967295L) + 1836072691 + (jArr[0] & 4294967295L);
        jArr[0] = jM19782kk;
        long j5 = jM19782kk & 4294967295L;
        jArr[0] = j5;
        long jM19777k4 = (m19777k4(j5, i) & 4294967295L) + (j3 & 4294967295L);
        jArr[0] = jM19777k4;
        jArr[0] = jM19777k4 & 4294967295L;
        jArr2[0] = m19777k4(jArr2[0], 10);
    }

    /* JADX INFO: renamed from: h4 */
    private void m19775h4(long[] jArr, long j, long[] jArr2, long j2, long j3, long j4, int i) {
        long jM19778k4 = (m19778k4(j, jArr2[0], j2) & 4294967295L) + (j4 & 4294967295L) + (jArr[0] & 4294967295L);
        jArr[0] = jM19778k4;
        long j5 = jM19778k4 & 4294967295L;
        jArr[0] = j5;
        long jM19777k4 = (m19777k4(j5, i) & 4294967295L) + (j3 & 4294967295L);
        jArr[0] = jM19777k4;
        jArr[0] = jM19777k4 & 4294967295L;
        jArr2[0] = m19777k4(jArr2[0], 10);
    }

    /* JADX INFO: renamed from: jd */
    private void m19776jd(long[] jArr, long j, long[] jArr2, long j2, long j3, long j4, int i) {
        long jM19771du = (m19771du(j, jArr2[0], j2) & 4294967295L) + (j4 & 4294967295L) + 1352829926 + (jArr[0] & 4294967295L);
        jArr[0] = jM19771du;
        long j5 = jM19771du & 4294967295L;
        jArr[0] = j5;
        long jM19777k4 = (m19777k4(j5, i) & 4294967295L) + (j3 & 4294967295L);
        jArr[0] = jM19777k4;
        jArr[0] = jM19777k4 & 4294967295L;
        jArr2[0] = m19777k4(jArr2[0], 10);
    }

    /* JADX INFO: renamed from: k4 */
    private long m19777k4(long j, int i) {
        long j2 = j & 4294967295L;
        return (j2 >> (32 - i)) | (4294967295L & (j2 << (i & 31)));
    }

    /* JADX INFO: renamed from: kk */
    private long m19782kk(long j, long j2, long j3) {
        return ((j & 4294967295L) | (~(j2 & 4294967295L))) ^ (j3 & 4294967295L);
    }

    /* JADX INFO: renamed from: m9 */
    private void m19784m9(long[] jArr, long j, long[] jArr2, long j2, long j3, long j4, int i) {
        long jM19787x1 = (m19787x1(j, jArr2[0], j2) & 4294967295L) + (j4 & 4294967295L) + 2053994217 + (jArr[0] & 4294967295L);
        jArr[0] = jM19787x1;
        long j5 = jM19787x1 & 4294967295L;
        jArr[0] = j5;
        long jM19777k4 = (m19777k4(j5, i) & 4294967295L) + (j3 & 4294967295L);
        jArr[0] = jM19777k4;
        jArr[0] = jM19777k4 & 4294967295L;
        jArr2[0] = m19777k4(jArr2[0], 10);
    }

    /* JADX INFO: renamed from: to */
    private long m19785to(long j, long j2, long j3) {
        long j4 = j3 & 4294967295L;
        return (j & 4294967295L & j4) | (j2 & 4294967295L & (~j4));
    }

    /* JADX INFO: renamed from: x1 */
    private long m19787x1(long j, long j2, long j3) {
        long j4 = j & 4294967295L;
        return ((~j4) & j3 & 4294967295L) | (j2 & 4294967295L & j4);
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4705c6
    /* JADX INFO: renamed from: c5 */
    public void mo18846c5() {
        long[] jArr = this.f13297h4;
        jArr[0] = 1732584193;
        jArr[1] = 4023233417L;
        jArr[2] = 2562383102L;
        jArr[3] = 271733878;
        jArr[4] = 3285377520L;
        this.f13299m9 = 0L;
        this.f13296dy = 0;
        long[] jArr2 = this.f13295du;
        AbstractC14092to.m67231k4(jArr2, 0, jArr2.length);
        byte[] bArr = this.f13298k4;
        AbstractC14092to.m67225k4(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: c5 */
    private void m19770c5(long[] jArr, long j, long[] jArr2, long j2, long j3, long j4, int i) {
        long jM19785to = (m19785to(j, jArr2[0], j2) & 4294967295L) + (j4 & 4294967295L) + 1548603684 + (jArr[0] & 4294967295L);
        jArr[0] = jM19785to;
        long j5 = jM19785to & 4294967295L;
        jArr[0] = j5;
        long jM19777k4 = (m19777k4(j5, i) & 4294967295L) + (j3 & 4294967295L);
        jArr[0] = jM19777k4;
        jArr[0] = jM19777k4 & 4294967295L;
        jArr2[0] = m19777k4(jArr2[0], 10);
    }

    /* JADX INFO: renamed from: du */
    private void m19772du() {
        long[] jArr = this.f13297h4;
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long[] jArr2 = {j};
        long[] jArr3 = {j3};
        m19781k4(jArr2, j2, jArr3, j4, j5, this.f13295du[0], 11);
        long j6 = jArr2[0];
        long j7 = jArr3[0];
        long[] jArr4 = {j5};
        long[] jArr5 = {j2};
        m19781k4(jArr4, j6, jArr5, j7, j4, this.f13295du[1], 14);
        long j8 = jArr4[0];
        long j9 = jArr5[0];
        long[] jArr6 = {j4};
        jArr2[0] = j6;
        m19781k4(jArr6, j8, jArr2, j9, j7, this.f13295du[2], 15);
        long j10 = jArr6[0];
        long j11 = jArr2[0];
        jArr3[0] = j7;
        jArr4[0] = j8;
        m19781k4(jArr3, j10, jArr4, j11, j9, this.f13295du[3], 12);
        long j12 = jArr3[0];
        long j13 = jArr4[0];
        jArr5[0] = j9;
        jArr6[0] = j10;
        m19781k4(jArr5, j12, jArr6, j13, j11, this.f13295du[4], 5);
        long j14 = jArr5[0];
        long j15 = jArr6[0];
        jArr2[0] = j11;
        jArr3[0] = j12;
        m19781k4(jArr2, j14, jArr3, j15, j13, this.f13295du[5], 8);
        long j16 = jArr2[0];
        long j17 = jArr3[0];
        jArr4[0] = j13;
        jArr5[0] = j14;
        m19781k4(jArr4, j16, jArr5, j17, j15, this.f13295du[6], 7);
        long j18 = jArr4[0];
        long j19 = jArr5[0];
        jArr6[0] = j15;
        jArr2[0] = j16;
        m19781k4(jArr6, j18, jArr2, j19, j17, this.f13295du[7], 9);
        long j20 = jArr6[0];
        long j21 = jArr2[0];
        jArr3[0] = j17;
        jArr4[0] = j18;
        m19781k4(jArr3, j20, jArr4, j21, j19, this.f13295du[8], 11);
        long j22 = jArr3[0];
        long j23 = jArr4[0];
        jArr5[0] = j19;
        jArr6[0] = j20;
        m19781k4(jArr5, j22, jArr6, j23, j21, this.f13295du[9], 13);
        long j24 = jArr5[0];
        long j25 = jArr6[0];
        jArr2[0] = j21;
        jArr3[0] = j22;
        m19781k4(jArr2, j24, jArr3, j25, j23, this.f13295du[10], 14);
        long j26 = jArr2[0];
        long j27 = jArr3[0];
        jArr4[0] = j23;
        jArr5[0] = j24;
        m19781k4(jArr4, j26, jArr5, j27, j25, this.f13295du[11], 15);
        long j28 = jArr4[0];
        long j29 = jArr5[0];
        jArr6[0] = j25;
        jArr2[0] = j26;
        m19781k4(jArr6, j28, jArr2, j29, j27, this.f13295du[12], 6);
        long j30 = jArr6[0];
        long j31 = jArr2[0];
        jArr3[0] = j27;
        jArr4[0] = j28;
        m19781k4(jArr3, j30, jArr4, j31, j29, this.f13295du[13], 7);
        long j32 = jArr3[0];
        long j33 = jArr4[0];
        jArr5[0] = j29;
        jArr6[0] = j30;
        m19781k4(jArr5, j32, jArr6, j33, j31, this.f13295du[14], 9);
        long j34 = jArr5[0];
        long j35 = jArr6[0];
        jArr2[0] = j31;
        jArr3[0] = j32;
        m19781k4(jArr2, j34, jArr3, j35, j33, this.f13295du[15], 8);
        long j36 = jArr2[0];
        long j37 = jArr3[0];
        jArr4[0] = j33;
        jArr5[0] = j34;
        m19788x1(jArr4, j36, jArr5, j37, j35, this.f13295du[7], 7);
        long j38 = jArr4[0];
        long j39 = jArr5[0];
        jArr6[0] = j35;
        jArr2[0] = j36;
        m19788x1(jArr6, j38, jArr2, j39, j37, this.f13295du[4], 6);
        long j40 = jArr6[0];
        long j41 = jArr2[0];
        jArr3[0] = j37;
        jArr4[0] = j38;
        m19788x1(jArr3, j40, jArr4, j41, j39, this.f13295du[13], 8);
        long j42 = jArr3[0];
        long j43 = jArr4[0];
        jArr5[0] = j39;
        jArr6[0] = j40;
        m19788x1(jArr5, j42, jArr6, j43, j41, this.f13295du[1], 13);
        long j44 = jArr5[0];
        long j45 = jArr6[0];
        jArr2[0] = j41;
        jArr3[0] = j42;
        m19788x1(jArr2, j44, jArr3, j45, j43, this.f13295du[10], 11);
        long j46 = jArr2[0];
        long j47 = jArr3[0];
        jArr4[0] = j43;
        jArr5[0] = j44;
        m19788x1(jArr4, j46, jArr5, j47, j45, this.f13295du[6], 9);
        long j48 = jArr4[0];
        long j49 = jArr5[0];
        jArr6[0] = j45;
        jArr2[0] = j46;
        m19788x1(jArr6, j48, jArr2, j49, j47, this.f13295du[15], 7);
        long j50 = jArr6[0];
        long j51 = jArr2[0];
        jArr3[0] = j47;
        jArr4[0] = j48;
        m19788x1(jArr3, j50, jArr4, j51, j49, this.f13295du[3], 15);
        long j52 = jArr3[0];
        long j53 = jArr4[0];
        jArr5[0] = j49;
        jArr6[0] = j50;
        m19788x1(jArr5, j52, jArr6, j53, j51, this.f13295du[12], 7);
        long j54 = jArr5[0];
        long j55 = jArr6[0];
        jArr2[0] = j51;
        jArr3[0] = j52;
        m19788x1(jArr2, j54, jArr3, j55, j53, this.f13295du[0], 12);
        long j56 = jArr2[0];
        long j57 = jArr3[0];
        jArr4[0] = j53;
        jArr5[0] = j54;
        m19788x1(jArr4, j56, jArr5, j57, j55, this.f13295du[9], 15);
        long j58 = jArr4[0];
        long j59 = jArr5[0];
        jArr6[0] = j55;
        jArr2[0] = j56;
        m19788x1(jArr6, j58, jArr2, j59, j57, this.f13295du[5], 9);
        long j60 = jArr6[0];
        long j61 = jArr2[0];
        jArr3[0] = j57;
        jArr4[0] = j58;
        m19788x1(jArr3, j60, jArr4, j61, j59, this.f13295du[2], 11);
        long j62 = jArr3[0];
        long j63 = jArr4[0];
        jArr5[0] = j59;
        jArr6[0] = j60;
        m19788x1(jArr5, j62, jArr6, j63, j61, this.f13295du[14], 7);
        long j64 = jArr5[0];
        long j65 = jArr6[0];
        jArr2[0] = j61;
        jArr3[0] = j62;
        m19788x1(jArr2, j64, jArr3, j65, j63, this.f13295du[11], 13);
        long j66 = jArr2[0];
        long j67 = jArr3[0];
        jArr4[0] = j63;
        jArr5[0] = j64;
        m19788x1(jArr4, j66, jArr5, j67, j65, this.f13295du[8], 12);
        long j68 = jArr4[0];
        long j69 = jArr5[0];
        jArr6[0] = j65;
        jArr2[0] = j66;
        m19783kk(jArr6, j68, jArr2, j69, j67, this.f13295du[3], 11);
        long j70 = jArr6[0];
        long j71 = jArr2[0];
        jArr3[0] = j67;
        jArr4[0] = j68;
        m19783kk(jArr3, j70, jArr4, j71, j69, this.f13295du[10], 13);
        long j72 = jArr3[0];
        long j73 = jArr4[0];
        jArr5[0] = j69;
        jArr6[0] = j70;
        m19783kk(jArr5, j72, jArr6, j73, j71, this.f13295du[14], 6);
        long j74 = jArr5[0];
        long j75 = jArr6[0];
        jArr2[0] = j71;
        jArr3[0] = j72;
        m19783kk(jArr2, j74, jArr3, j75, j73, this.f13295du[4], 7);
        long j76 = jArr2[0];
        long j77 = jArr3[0];
        jArr4[0] = j73;
        jArr5[0] = j74;
        m19783kk(jArr4, j76, jArr5, j77, j75, this.f13295du[9], 14);
        long j78 = jArr4[0];
        long j79 = jArr5[0];
        jArr6[0] = j75;
        jArr2[0] = j76;
        m19783kk(jArr6, j78, jArr2, j79, j77, this.f13295du[15], 9);
        long j80 = jArr6[0];
        long j81 = jArr2[0];
        jArr3[0] = j77;
        jArr4[0] = j78;
        m19783kk(jArr3, j80, jArr4, j81, j79, this.f13295du[8], 13);
        long j82 = jArr3[0];
        long j83 = jArr4[0];
        jArr5[0] = j79;
        jArr6[0] = j80;
        m19783kk(jArr5, j82, jArr6, j83, j81, this.f13295du[1], 15);
        long j84 = jArr5[0];
        long j85 = jArr6[0];
        jArr2[0] = j81;
        jArr3[0] = j82;
        m19783kk(jArr2, j84, jArr3, j85, j83, this.f13295du[2], 14);
        long j86 = jArr2[0];
        long j87 = jArr3[0];
        jArr4[0] = j83;
        jArr5[0] = j84;
        m19783kk(jArr4, j86, jArr5, j87, j85, this.f13295du[7], 8);
        long j88 = jArr4[0];
        long j89 = jArr5[0];
        jArr6[0] = j85;
        jArr2[0] = j86;
        m19783kk(jArr6, j88, jArr2, j89, j87, this.f13295du[0], 13);
        long j90 = jArr6[0];
        long j91 = jArr2[0];
        jArr3[0] = j87;
        jArr4[0] = j88;
        m19783kk(jArr3, j90, jArr4, j91, j89, this.f13295du[6], 6);
        long j92 = jArr3[0];
        long j93 = jArr4[0];
        jArr5[0] = j89;
        jArr6[0] = j90;
        m19783kk(jArr5, j92, jArr6, j93, j91, this.f13295du[13], 5);
        long j94 = jArr5[0];
        long j95 = jArr6[0];
        jArr2[0] = j91;
        jArr3[0] = j92;
        m19783kk(jArr2, j94, jArr3, j95, j93, this.f13295du[11], 12);
        long j96 = jArr2[0];
        long j97 = jArr3[0];
        jArr4[0] = j93;
        jArr5[0] = j94;
        m19783kk(jArr4, j96, jArr5, j97, j95, this.f13295du[5], 7);
        long j98 = jArr4[0];
        long j99 = jArr5[0];
        jArr6[0] = j95;
        jArr2[0] = j96;
        m19783kk(jArr6, j98, jArr2, j99, j97, this.f13295du[12], 5);
        long j100 = jArr6[0];
        long j101 = jArr2[0];
        jArr3[0] = j97;
        jArr4[0] = j98;
        m19786to(jArr3, j100, jArr4, j101, j99, this.f13295du[1], 11);
        long j102 = jArr3[0];
        long j103 = jArr4[0];
        jArr5[0] = j99;
        jArr6[0] = j100;
        m19786to(jArr5, j102, jArr6, j103, j101, this.f13295du[9], 12);
        long j104 = jArr5[0];
        long j105 = jArr6[0];
        jArr2[0] = j101;
        jArr3[0] = j102;
        m19786to(jArr2, j104, jArr3, j105, j103, this.f13295du[11], 14);
        long j106 = jArr2[0];
        long j107 = jArr3[0];
        jArr4[0] = j103;
        jArr5[0] = j104;
        m19786to(jArr4, j106, jArr5, j107, j105, this.f13295du[10], 15);
        long j108 = jArr4[0];
        long j109 = jArr5[0];
        jArr6[0] = j105;
        jArr2[0] = j106;
        m19786to(jArr6, j108, jArr2, j109, j107, this.f13295du[0], 14);
        long j110 = jArr6[0];
        long j111 = jArr2[0];
        jArr3[0] = j107;
        jArr4[0] = j108;
        m19786to(jArr3, j110, jArr4, j111, j109, this.f13295du[8], 15);
        long j112 = jArr3[0];
        long j113 = jArr4[0];
        jArr5[0] = j109;
        jArr6[0] = j110;
        m19786to(jArr5, j112, jArr6, j113, j111, this.f13295du[12], 9);
        long j114 = jArr5[0];
        long j115 = jArr6[0];
        jArr2[0] = j111;
        jArr3[0] = j112;
        m19786to(jArr2, j114, jArr3, j115, j113, this.f13295du[4], 8);
        long j116 = jArr2[0];
        long j117 = jArr3[0];
        jArr4[0] = j113;
        jArr5[0] = j114;
        m19786to(jArr4, j116, jArr5, j117, j115, this.f13295du[13], 9);
        long j118 = jArr4[0];
        long j119 = jArr5[0];
        jArr6[0] = j115;
        jArr2[0] = j116;
        m19786to(jArr6, j118, jArr2, j119, j117, this.f13295du[3], 14);
        long j120 = jArr6[0];
        long j121 = jArr2[0];
        jArr3[0] = j117;
        jArr4[0] = j118;
        m19786to(jArr3, j120, jArr4, j121, j119, this.f13295du[7], 5);
        long j122 = jArr3[0];
        long j123 = jArr4[0];
        jArr5[0] = j119;
        jArr6[0] = j120;
        m19786to(jArr5, j122, jArr6, j123, j121, this.f13295du[15], 6);
        long j124 = jArr5[0];
        long j125 = jArr6[0];
        jArr2[0] = j121;
        jArr3[0] = j122;
        m19786to(jArr2, j124, jArr3, j125, j123, this.f13295du[14], 8);
        long j126 = jArr2[0];
        long j127 = jArr3[0];
        jArr4[0] = j123;
        jArr5[0] = j124;
        m19786to(jArr4, j126, jArr5, j127, j125, this.f13295du[5], 6);
        long j128 = jArr4[0];
        long j129 = jArr5[0];
        jArr6[0] = j125;
        jArr2[0] = j126;
        m19786to(jArr6, j128, jArr2, j129, j127, this.f13295du[6], 5);
        long j130 = jArr6[0];
        long j131 = jArr2[0];
        jArr3[0] = j127;
        jArr4[0] = j128;
        m19786to(jArr3, j130, jArr4, j131, j129, this.f13295du[2], 12);
        long j132 = jArr3[0];
        long j133 = jArr4[0];
        jArr5[0] = j129;
        jArr6[0] = j130;
        m19773du(jArr5, j132, jArr6, j133, j131, this.f13295du[4], 9);
        long j134 = jArr5[0];
        long j135 = jArr6[0];
        jArr2[0] = j131;
        jArr3[0] = j132;
        m19773du(jArr2, j134, jArr3, j135, j133, this.f13295du[0], 15);
        long j136 = jArr2[0];
        long j137 = jArr3[0];
        jArr4[0] = j133;
        jArr5[0] = j134;
        m19773du(jArr4, j136, jArr5, j137, j135, this.f13295du[5], 5);
        long j138 = jArr4[0];
        long j139 = jArr5[0];
        jArr6[0] = j135;
        jArr2[0] = j136;
        m19773du(jArr6, j138, jArr2, j139, j137, this.f13295du[9], 11);
        long j140 = jArr6[0];
        long j141 = jArr2[0];
        jArr3[0] = j137;
        jArr4[0] = j138;
        m19773du(jArr3, j140, jArr4, j141, j139, this.f13295du[7], 6);
        long j142 = jArr3[0];
        long j143 = jArr4[0];
        jArr5[0] = j139;
        jArr6[0] = j140;
        m19773du(jArr5, j142, jArr6, j143, j141, this.f13295du[12], 8);
        long j144 = jArr5[0];
        long j145 = jArr6[0];
        jArr2[0] = j141;
        jArr3[0] = j142;
        m19773du(jArr2, j144, jArr3, j145, j143, this.f13295du[2], 13);
        long j146 = jArr2[0];
        long j147 = jArr3[0];
        jArr4[0] = j143;
        jArr5[0] = j144;
        m19773du(jArr4, j146, jArr5, j147, j145, this.f13295du[10], 12);
        long j148 = jArr4[0];
        long j149 = jArr5[0];
        jArr6[0] = j145;
        jArr2[0] = j146;
        m19773du(jArr6, j148, jArr2, j149, j147, this.f13295du[14], 5);
        long j150 = jArr6[0];
        long j151 = jArr2[0];
        jArr3[0] = j147;
        jArr4[0] = j148;
        m19773du(jArr3, j150, jArr4, j151, j149, this.f13295du[1], 12);
        long j152 = jArr3[0];
        long j153 = jArr4[0];
        jArr5[0] = j149;
        jArr6[0] = j150;
        m19773du(jArr5, j152, jArr6, j153, j151, this.f13295du[3], 13);
        long j154 = jArr5[0];
        long j155 = jArr6[0];
        jArr2[0] = j151;
        jArr3[0] = j152;
        m19773du(jArr2, j154, jArr3, j155, j153, this.f13295du[8], 14);
        long j156 = jArr2[0];
        long j157 = jArr3[0];
        jArr4[0] = j153;
        jArr5[0] = j154;
        m19773du(jArr4, j156, jArr5, j157, j155, this.f13295du[11], 11);
        long j158 = jArr4[0];
        long j159 = jArr5[0];
        jArr6[0] = j155;
        jArr2[0] = j156;
        m19773du(jArr6, j158, jArr2, j159, j157, this.f13295du[6], 8);
        long j160 = jArr6[0];
        long j161 = jArr2[0];
        jArr3[0] = j157;
        jArr4[0] = j158;
        m19773du(jArr3, j160, jArr4, j161, j159, this.f13295du[15], 5);
        long j162 = jArr3[0];
        long j163 = jArr4[0];
        jArr5[0] = j159;
        jArr6[0] = j160;
        m19773du(jArr5, j162, jArr6, j163, j161, this.f13295du[13], 6);
        long j164 = jArr5[0];
        long j165 = jArr6[0];
        long[] jArr7 = {j};
        long[] jArr8 = {j3};
        m19776jd(jArr7, j2, jArr8, j4, j5, this.f13295du[5], 8);
        long j166 = jArr7[0];
        long j167 = jArr8[0];
        long[] jArr9 = {j5};
        long[] jArr10 = {j2};
        m19776jd(jArr9, j166, jArr10, j167, j4, this.f13295du[14], 9);
        long j168 = jArr9[0];
        long j169 = jArr10[0];
        long[] jArr11 = {j4};
        jArr7[0] = j166;
        m19776jd(jArr11, j168, jArr7, j169, j167, this.f13295du[7], 9);
        long j170 = jArr11[0];
        long j171 = jArr7[0];
        jArr8[0] = j167;
        jArr9[0] = j168;
        m19776jd(jArr8, j170, jArr9, j171, j169, this.f13295du[0], 11);
        long j172 = jArr8[0];
        long j173 = jArr9[0];
        jArr10[0] = j169;
        jArr11[0] = j170;
        m19776jd(jArr10, j172, jArr11, j173, j171, this.f13295du[9], 13);
        long j174 = jArr10[0];
        long j175 = jArr11[0];
        jArr7[0] = j171;
        jArr8[0] = j172;
        m19776jd(jArr7, j174, jArr8, j175, j173, this.f13295du[2], 15);
        long j176 = jArr7[0];
        long j177 = jArr8[0];
        jArr9[0] = j173;
        jArr10[0] = j174;
        m19776jd(jArr9, j176, jArr10, j177, j175, this.f13295du[11], 15);
        long j178 = jArr9[0];
        long j179 = jArr10[0];
        jArr11[0] = j175;
        jArr7[0] = j176;
        m19776jd(jArr11, j178, jArr7, j179, j177, this.f13295du[4], 5);
        long j180 = jArr11[0];
        long j181 = jArr7[0];
        jArr8[0] = j177;
        jArr9[0] = j178;
        m19776jd(jArr8, j180, jArr9, j181, j179, this.f13295du[13], 7);
        long j182 = jArr8[0];
        long j183 = jArr9[0];
        jArr10[0] = j179;
        jArr11[0] = j180;
        m19776jd(jArr10, j182, jArr11, j183, j181, this.f13295du[6], 7);
        long j184 = jArr10[0];
        long j185 = jArr11[0];
        jArr7[0] = j181;
        jArr8[0] = j182;
        m19776jd(jArr7, j184, jArr8, j185, j183, this.f13295du[15], 8);
        long j186 = jArr7[0];
        long j187 = jArr8[0];
        jArr9[0] = j183;
        jArr10[0] = j184;
        m19776jd(jArr9, j186, jArr10, j187, j185, this.f13295du[8], 11);
        long j188 = jArr9[0];
        long j189 = jArr10[0];
        jArr11[0] = j185;
        jArr7[0] = j186;
        m19776jd(jArr11, j188, jArr7, j189, j187, this.f13295du[1], 14);
        long j190 = jArr11[0];
        long j191 = jArr7[0];
        jArr8[0] = j187;
        jArr9[0] = j188;
        m19776jd(jArr8, j190, jArr9, j191, j189, this.f13295du[10], 14);
        long j192 = jArr8[0];
        long j193 = jArr9[0];
        jArr10[0] = j189;
        jArr11[0] = j190;
        m19776jd(jArr10, j192, jArr11, j193, j191, this.f13295du[3], 12);
        long j194 = jArr10[0];
        long j195 = jArr11[0];
        jArr7[0] = j191;
        jArr8[0] = j192;
        m19776jd(jArr7, j194, jArr8, j195, j193, this.f13295du[12], 6);
        long j196 = jArr7[0];
        long j197 = jArr8[0];
        jArr9[0] = j193;
        jArr10[0] = j194;
        m19770c5(jArr9, j196, jArr10, j197, j195, this.f13295du[6], 9);
        long j198 = jArr9[0];
        long j199 = jArr10[0];
        jArr11[0] = j195;
        jArr7[0] = j196;
        m19770c5(jArr11, j198, jArr7, j199, j197, this.f13295du[11], 13);
        long j200 = jArr11[0];
        long j201 = jArr7[0];
        jArr8[0] = j197;
        jArr9[0] = j198;
        m19770c5(jArr8, j200, jArr9, j201, j199, this.f13295du[3], 15);
        long j202 = jArr8[0];
        long j203 = jArr9[0];
        jArr10[0] = j199;
        jArr11[0] = j200;
        m19770c5(jArr10, j202, jArr11, j203, j201, this.f13295du[7], 7);
        long j204 = jArr10[0];
        long j205 = jArr11[0];
        jArr7[0] = j201;
        jArr8[0] = j202;
        m19770c5(jArr7, j204, jArr8, j205, j203, this.f13295du[0], 12);
        long j206 = jArr7[0];
        long j207 = jArr8[0];
        jArr9[0] = j203;
        jArr10[0] = j204;
        m19770c5(jArr9, j206, jArr10, j207, j205, this.f13295du[13], 8);
        long j208 = jArr9[0];
        long j209 = jArr10[0];
        jArr11[0] = j205;
        jArr7[0] = j206;
        m19770c5(jArr11, j208, jArr7, j209, j207, this.f13295du[5], 9);
        long j210 = jArr11[0];
        long j211 = jArr7[0];
        jArr8[0] = j207;
        jArr9[0] = j208;
        m19770c5(jArr8, j210, jArr9, j211, j209, this.f13295du[10], 11);
        long j212 = jArr8[0];
        long j213 = jArr9[0];
        jArr10[0] = j209;
        jArr11[0] = j210;
        m19770c5(jArr10, j212, jArr11, j213, j211, this.f13295du[14], 7);
        long j214 = jArr10[0];
        long j215 = jArr11[0];
        jArr7[0] = j211;
        jArr8[0] = j212;
        m19770c5(jArr7, j214, jArr8, j215, j213, this.f13295du[15], 7);
        long j216 = jArr7[0];
        long j217 = jArr8[0];
        jArr9[0] = j213;
        jArr10[0] = j214;
        m19770c5(jArr9, j216, jArr10, j217, j215, this.f13295du[8], 12);
        long j218 = jArr9[0];
        long j219 = jArr10[0];
        jArr11[0] = j215;
        jArr7[0] = j216;
        m19770c5(jArr11, j218, jArr7, j219, j217, this.f13295du[12], 7);
        long j220 = jArr11[0];
        long j221 = jArr7[0];
        jArr8[0] = j217;
        jArr9[0] = j218;
        m19770c5(jArr8, j220, jArr9, j221, j219, this.f13295du[4], 6);
        long j222 = jArr8[0];
        long j223 = jArr9[0];
        jArr10[0] = j219;
        jArr11[0] = j220;
        m19770c5(jArr10, j222, jArr11, j223, j221, this.f13295du[9], 15);
        long j224 = jArr10[0];
        long j225 = jArr11[0];
        jArr7[0] = j221;
        jArr8[0] = j222;
        m19770c5(jArr7, j224, jArr8, j225, j223, this.f13295du[1], 13);
        long j226 = jArr7[0];
        long j227 = jArr8[0];
        jArr9[0] = j223;
        jArr10[0] = j224;
        m19770c5(jArr9, j226, jArr10, j227, j225, this.f13295du[2], 11);
        long j228 = jArr9[0];
        long j229 = jArr10[0];
        jArr11[0] = j225;
        jArr7[0] = j226;
        m19774dy(jArr11, j228, jArr7, j229, j227, this.f13295du[15], 9);
        long j230 = jArr11[0];
        long j231 = jArr7[0];
        jArr8[0] = j227;
        jArr9[0] = j228;
        m19774dy(jArr8, j230, jArr9, j231, j229, this.f13295du[5], 7);
        long j232 = jArr8[0];
        long j233 = jArr9[0];
        jArr10[0] = j229;
        jArr11[0] = j230;
        m19774dy(jArr10, j232, jArr11, j233, j231, this.f13295du[1], 15);
        long j234 = jArr10[0];
        long j235 = jArr11[0];
        jArr7[0] = j231;
        jArr8[0] = j232;
        m19774dy(jArr7, j234, jArr8, j235, j233, this.f13295du[3], 11);
        long j236 = jArr7[0];
        long j237 = jArr8[0];
        jArr9[0] = j233;
        jArr10[0] = j234;
        m19774dy(jArr9, j236, jArr10, j237, j235, this.f13295du[7], 8);
        long j238 = jArr9[0];
        long j239 = jArr10[0];
        jArr11[0] = j235;
        jArr7[0] = j236;
        m19774dy(jArr11, j238, jArr7, j239, j237, this.f13295du[14], 6);
        long j240 = jArr11[0];
        long j241 = jArr7[0];
        jArr8[0] = j237;
        jArr9[0] = j238;
        m19774dy(jArr8, j240, jArr9, j241, j239, this.f13295du[6], 6);
        long j242 = jArr8[0];
        long j243 = jArr9[0];
        jArr10[0] = j239;
        jArr11[0] = j240;
        m19774dy(jArr10, j242, jArr11, j243, j241, this.f13295du[9], 14);
        long j244 = jArr10[0];
        long j245 = jArr11[0];
        jArr7[0] = j241;
        jArr8[0] = j242;
        m19774dy(jArr7, j244, jArr8, j245, j243, this.f13295du[11], 12);
        long j246 = jArr7[0];
        long j247 = jArr8[0];
        jArr9[0] = j243;
        jArr10[0] = j244;
        m19774dy(jArr9, j246, jArr10, j247, j245, this.f13295du[8], 13);
        long j248 = jArr9[0];
        long j249 = jArr10[0];
        jArr11[0] = j245;
        jArr7[0] = j246;
        m19774dy(jArr11, j248, jArr7, j249, j247, this.f13295du[12], 5);
        long j250 = jArr11[0];
        long j251 = jArr7[0];
        jArr8[0] = j247;
        jArr9[0] = j248;
        m19774dy(jArr8, j250, jArr9, j251, j249, this.f13295du[2], 14);
        long j252 = jArr8[0];
        long j253 = jArr9[0];
        jArr10[0] = j249;
        jArr11[0] = j250;
        m19774dy(jArr10, j252, jArr11, j253, j251, this.f13295du[10], 13);
        long j254 = jArr10[0];
        long j255 = jArr11[0];
        jArr7[0] = j251;
        jArr8[0] = j252;
        m19774dy(jArr7, j254, jArr8, j255, j253, this.f13295du[0], 13);
        long j256 = jArr7[0];
        long j257 = jArr8[0];
        jArr9[0] = j253;
        jArr10[0] = j254;
        m19774dy(jArr9, j256, jArr10, j257, j255, this.f13295du[4], 7);
        long j258 = jArr9[0];
        long j259 = jArr10[0];
        jArr11[0] = j255;
        jArr7[0] = j256;
        m19774dy(jArr11, j258, jArr7, j259, j257, this.f13295du[13], 5);
        long j260 = jArr11[0];
        long j261 = jArr7[0];
        jArr8[0] = j257;
        jArr9[0] = j258;
        m19784m9(jArr8, j260, jArr9, j261, j259, this.f13295du[8], 15);
        long j262 = jArr8[0];
        long j263 = jArr9[0];
        jArr10[0] = j259;
        jArr11[0] = j260;
        m19784m9(jArr10, j262, jArr11, j263, j261, this.f13295du[6], 5);
        long j264 = jArr10[0];
        long j265 = jArr11[0];
        jArr7[0] = j261;
        jArr8[0] = j262;
        m19784m9(jArr7, j264, jArr8, j265, j263, this.f13295du[4], 8);
        long j266 = jArr7[0];
        long j267 = jArr8[0];
        jArr9[0] = j263;
        jArr10[0] = j264;
        m19784m9(jArr9, j266, jArr10, j267, j265, this.f13295du[1], 11);
        long j268 = jArr9[0];
        long j269 = jArr10[0];
        jArr11[0] = j265;
        jArr7[0] = j266;
        m19784m9(jArr11, j268, jArr7, j269, j267, this.f13295du[3], 14);
        long j270 = jArr11[0];
        long j271 = jArr7[0];
        jArr8[0] = j267;
        jArr9[0] = j268;
        m19784m9(jArr8, j270, jArr9, j271, j269, this.f13295du[11], 14);
        long j272 = jArr8[0];
        long j273 = jArr9[0];
        jArr10[0] = j269;
        jArr11[0] = j270;
        m19784m9(jArr10, j272, jArr11, j273, j271, this.f13295du[15], 6);
        long j274 = jArr10[0];
        long j275 = jArr11[0];
        jArr7[0] = j271;
        jArr8[0] = j272;
        m19784m9(jArr7, j274, jArr8, j275, j273, this.f13295du[0], 14);
        long j276 = jArr7[0];
        long j277 = jArr8[0];
        jArr9[0] = j273;
        jArr10[0] = j274;
        m19784m9(jArr9, j276, jArr10, j277, j275, this.f13295du[5], 6);
        long j278 = jArr9[0];
        long j279 = jArr10[0];
        jArr11[0] = j275;
        jArr7[0] = j276;
        m19784m9(jArr11, j278, jArr7, j279, j277, this.f13295du[12], 9);
        long j280 = jArr11[0];
        long j281 = jArr7[0];
        jArr8[0] = j277;
        jArr9[0] = j278;
        m19784m9(jArr8, j280, jArr9, j281, j279, this.f13295du[2], 12);
        long j282 = jArr8[0];
        long j283 = jArr9[0];
        jArr10[0] = j279;
        jArr11[0] = j280;
        m19784m9(jArr10, j282, jArr11, j283, j281, this.f13295du[13], 9);
        long j284 = jArr10[0];
        long j285 = jArr11[0];
        jArr7[0] = j281;
        jArr8[0] = j282;
        m19784m9(jArr7, j284, jArr8, j285, j283, this.f13295du[9], 12);
        long j286 = jArr7[0];
        long j287 = jArr8[0];
        jArr9[0] = j283;
        jArr10[0] = j284;
        m19784m9(jArr9, j286, jArr10, j287, j285, this.f13295du[7], 5);
        long j288 = jArr9[0];
        long j289 = jArr10[0];
        jArr11[0] = j285;
        jArr7[0] = j286;
        m19784m9(jArr11, j288, jArr7, j289, j287, this.f13295du[10], 15);
        long j290 = jArr11[0];
        long j291 = jArr7[0];
        jArr8[0] = j287;
        jArr9[0] = j288;
        m19784m9(jArr8, j290, jArr9, j291, j289, this.f13295du[14], 8);
        long j292 = jArr8[0];
        long j293 = jArr9[0];
        jArr10[0] = j289;
        jArr11[0] = j290;
        m19775h4(jArr10, j292, jArr11, j293, j291, this.f13295du[12], 8);
        long j294 = jArr10[0];
        long j295 = jArr11[0];
        jArr7[0] = j291;
        jArr8[0] = j292;
        m19775h4(jArr7, j294, jArr8, j295, j293, this.f13295du[15], 5);
        long j296 = jArr7[0];
        long j297 = jArr8[0];
        jArr9[0] = j293;
        jArr10[0] = j294;
        m19775h4(jArr9, j296, jArr10, j297, j295, this.f13295du[10], 12);
        long j298 = jArr9[0];
        long j299 = jArr10[0];
        jArr11[0] = j295;
        jArr7[0] = j296;
        m19775h4(jArr11, j298, jArr7, j299, j297, this.f13295du[4], 9);
        long j300 = jArr11[0];
        long j301 = jArr7[0];
        jArr8[0] = j297;
        jArr9[0] = j298;
        m19775h4(jArr8, j300, jArr9, j301, j299, this.f13295du[1], 12);
        long j302 = jArr8[0];
        long j303 = jArr9[0];
        jArr10[0] = j299;
        jArr11[0] = j300;
        m19775h4(jArr10, j302, jArr11, j303, j301, this.f13295du[5], 5);
        long j304 = jArr10[0];
        long j305 = jArr11[0];
        jArr7[0] = j301;
        jArr8[0] = j302;
        m19775h4(jArr7, j304, jArr8, j305, j303, this.f13295du[8], 14);
        long j306 = jArr7[0];
        long j307 = jArr8[0];
        jArr9[0] = j303;
        jArr10[0] = j304;
        m19775h4(jArr9, j306, jArr10, j307, j305, this.f13295du[7], 6);
        long j308 = jArr9[0];
        long j309 = jArr10[0];
        jArr11[0] = j305;
        jArr7[0] = j306;
        m19775h4(jArr11, j308, jArr7, j309, j307, this.f13295du[6], 8);
        long j310 = jArr11[0];
        long j311 = jArr7[0];
        jArr8[0] = j307;
        jArr9[0] = j308;
        m19775h4(jArr8, j310, jArr9, j311, j309, this.f13295du[2], 13);
        long j312 = jArr8[0];
        long j313 = jArr9[0];
        jArr10[0] = j309;
        jArr11[0] = j310;
        m19775h4(jArr10, j312, jArr11, j313, j311, this.f13295du[13], 6);
        long j314 = jArr10[0];
        long j315 = jArr11[0];
        jArr7[0] = j311;
        jArr8[0] = j312;
        m19775h4(jArr7, j314, jArr8, j315, j313, this.f13295du[14], 5);
        long j316 = jArr7[0];
        long j317 = jArr8[0];
        jArr9[0] = j313;
        jArr10[0] = j314;
        m19775h4(jArr9, j316, jArr10, j317, j315, this.f13295du[0], 15);
        long j318 = jArr9[0];
        long j319 = jArr10[0];
        jArr11[0] = j315;
        jArr7[0] = j316;
        m19775h4(jArr11, j318, jArr7, j319, j317, this.f13295du[3], 13);
        long j320 = jArr11[0];
        long j321 = jArr7[0];
        jArr8[0] = j317;
        jArr9[0] = j318;
        m19775h4(jArr8, j320, jArr9, j321, j319, this.f13295du[9], 11);
        long j322 = jArr8[0];
        long j323 = jArr9[0];
        jArr10[0] = j319;
        jArr11[0] = j320;
        m19775h4(jArr10, j322, jArr11, j323, j321, this.f13295du[11], 11);
        long j324 = jArr10[0];
        long j325 = jArr11[0] & 4294967295L;
        long[] jArr12 = this.f13297h4;
        long j326 = ((j162 & 4294967295L) + (jArr12[1] & 4294967295L) + j325) & 4294967295L;
        long j327 = (jArr12[2] & 4294967295L) + (j165 & 4294967295L) + (j323 & 4294967295L);
        jArr12[1] = j327;
        jArr12[1] = j327 & 4294967295L;
        long j328 = (jArr12[3] & 4294967295L) + (j163 & 4294967295L) + (j321 & 4294967295L);
        jArr12[2] = j328;
        jArr12[2] = j328 & 4294967295L;
        long j329 = (jArr12[4] & 4294967295L) + (j161 & 4294967295L) + (j324 & 4294967295L);
        jArr12[3] = j329;
        jArr12[3] = j329 & 4294967295L;
        long j330 = (jArr12[0] & 4294967295L) + (j164 & 4294967295L) + (j322 & 4294967295L);
        jArr12[4] = j330;
        jArr12[4] = j330 & 4294967295L;
        jArr12[0] = j326;
    }

    /* JADX INFO: renamed from: k4 */
    private long m19778k4(long j, long j2, long j3) {
        return ((j & 4294967295L) ^ (j2 & 4294967295L)) ^ (j3 & 4294967295L);
    }

    /* JADX INFO: renamed from: kk */
    private void m19783kk(long[] jArr, long j, long[] jArr2, long j2, long j3, long j4, int i) {
        long jM19782kk = (m19782kk(j, jArr2[0], j2) & 4294967295L) + (j4 & 4294967295L) + 1859775393 + (jArr[0] & 4294967295L);
        jArr[0] = jM19782kk;
        long j5 = jM19782kk & 4294967295L;
        jArr[0] = j5;
        long jM19777k4 = (m19777k4(j5, i) & 4294967295L) + (j3 & 4294967295L);
        jArr[0] = jM19777k4;
        jArr[0] = jM19777k4 & 4294967295L;
        jArr2[0] = m19777k4(jArr2[0], 10);
    }

    /* JADX INFO: renamed from: to */
    private void m19786to(long[] jArr, long j, long[] jArr2, long j2, long j3, long j4, int i) {
        long jM19785to = (m19785to(j, jArr2[0], j2) & 4294967295L) + (j4 & 4294967295L) + 2400959708L + (jArr[0] & 4294967295L);
        jArr[0] = jM19785to;
        long j5 = jM19785to & 4294967295L;
        jArr[0] = j5;
        long jM19777k4 = (m19777k4(j5, i) & 4294967295L) + (j3 & 4294967295L);
        jArr[0] = jM19777k4;
        jArr[0] = jM19777k4 & 4294967295L;
        jArr2[0] = m19777k4(jArr2[0], 10);
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4705c6
    /* JADX INFO: renamed from: dy */
    public byte[] mo18847dy() {
        m19779k4(this.f13299m9);
        byte[] bArr = new byte[20];
        long[] jArr = this.f13297h4;
        int[] iArr = new int[jArr.length];
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = (int) this.f13297h4[i];
        }
        C14058fa.m66599k4(iArr, 0, bArr, 0, 20);
        return bArr;
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4705c6
    /* JADX INFO: renamed from: x1 */
    public void mo18849x1(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        this.f13127to = 1;
        this.f13299m9 += ((long) i2) & 4294967295L;
        int i5 = this.f13296dy;
        if (i5 != 0) {
            if (i2 < 64 - i5) {
                C14058fa.m66596k4(bArr, i, this.f13298k4, i5, i2);
                this.f13296dy += i2;
                return;
            }
            int i6 = 64 - i5;
            C14058fa.m66596k4(bArr, i, this.f13298k4, i5, i6);
            m19780k4(this.f13298k4, 0);
            this.f13296dy = 0;
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
            m19780k4(bArr, i + i7);
            i7 += 64;
        }
        if (i3 != 0) {
            C14058fa.m66596k4(bArr, i4 + i, this.f13298k4, 0, i3);
            this.f13296dy = i3;
        }
    }

    /* JADX INFO: renamed from: du */
    private void m19773du(long[] jArr, long j, long[] jArr2, long j2, long j3, long j4, int i) {
        long jM19771du = (m19771du(j, jArr2[0], j2) & 4294967295L) + (j4 & 4294967295L) + 2840853838L + (jArr[0] & 4294967295L);
        jArr[0] = jM19771du;
        long j5 = jM19771du & 4294967295L;
        jArr[0] = j5;
        long jM19777k4 = (m19777k4(j5, i) & 4294967295L) + (j3 & 4294967295L);
        jArr[0] = jM19777k4;
        jArr[0] = jM19777k4 & 4294967295L;
        jArr2[0] = m19777k4(jArr2[0], 10);
    }

    /* JADX INFO: renamed from: k4 */
    private void m19779k4(long j) {
        long j2;
        long j3;
        long j4 = 4294967295L;
        long j5 = j & 4294967295L;
        long j6 = j >> 32;
        long[] jArr = this.f13295du;
        AbstractC14092to.m67231k4(jArr, 0, jArr.length);
        long j7 = 0;
        int i = 0;
        while (true) {
            long j8 = j7 & j4;
            j2 = j & j4;
            j3 = j & 63;
            if (j8 >= j3) {
                break;
            }
            long[] jArr2 = this.f13295du;
            int i2 = (int) (j8 >> 2);
            long j9 = j4;
            jArr2[i2] = ((((long) (this.f13298k4[i] & 255)) << (((int) ((j7 & 3) * 8)) & 31)) & j9) ^ jArr2[i2];
            j7++;
            i++;
            j4 = j9;
        }
        long j10 = j4;
        long[] jArr3 = this.f13295du;
        int i3 = (int) ((j2 >> 2) & 15);
        jArr3[i3] = jArr3[i3] ^ ((1 << (((int) (((j & 3) * 8) + 7)) & 31)) & j10);
        if (j3 > 55) {
            m19772du();
            long[] jArr4 = this.f13295du;
            AbstractC14092to.m67231k4(jArr4, 0, jArr4.length);
        }
        long[] jArr5 = this.f13295du;
        jArr5[14] = (j5 << 3) & j10;
        jArr5[15] = (j2 >> 29) | ((j6 << 3) & j10);
        m19772du();
    }

    /* JADX INFO: renamed from: x1 */
    private void m19788x1(long[] jArr, long j, long[] jArr2, long j2, long j3, long j4, int i) {
        long jM19787x1 = (m19787x1(j, jArr2[0], j2) & 4294967295L) + (j4 & 4294967295L) + 1518500249 + (jArr[0] & 4294967295L);
        jArr[0] = jM19787x1;
        long j5 = jM19787x1 & 4294967295L;
        jArr[0] = j5;
        long jM19777k4 = (m19777k4(j5, i) & 4294967295L) + (j3 & 4294967295L);
        jArr[0] = jM19777k4;
        jArr[0] = jM19777k4 & 4294967295L;
        jArr2[0] = m19777k4(jArr2[0], 10);
    }

    /* JADX INFO: renamed from: k4 */
    private void m19780k4(byte[] bArr, int i) {
        int i2 = 0;
        while (true) {
            long[] jArr = this.f13295du;
            if (i2 >= jArr.length) {
                m19772du();
                return;
            } else {
                jArr[i2] = (((long) (bArr[i] & 255)) & 4294967295L) | ((((long) (bArr[i + 1] & 255)) << 8) & 4294967295L) | ((((long) (bArr[i + 2] & 255)) << 16) & 4294967295L) | (4294967295L & (((long) (bArr[i + 3] & 255)) << 24));
                i += 4;
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m19781k4(long[] jArr, long j, long[] jArr2, long j2, long j3, long j4, int i) {
        long jM19778k4 = (m19778k4(j, jArr2[0], j2) & 4294967295L) + (j4 & 4294967295L) + (jArr[0] & 4294967295L);
        jArr[0] = jM19778k4;
        long j5 = jM19778k4 & 4294967295L;
        jArr[0] = j5;
        long jM19777k4 = (m19777k4(j5, i) & 4294967295L) + (j3 & 4294967295L);
        jArr[0] = jM19777k4;
        jArr[0] = jM19777k4 & 4294967295L;
        jArr2[0] = m19777k4(jArr2[0], 10);
    }
}
