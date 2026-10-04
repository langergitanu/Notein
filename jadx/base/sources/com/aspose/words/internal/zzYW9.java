package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzYW9 extends zzYUA {

    /* JADX INFO: renamed from: H2 */
    private int f51263H2;

    /* JADX INFO: renamed from: H3 */
    private int f51264H3;
    private int zzW3L;
    private int zzW3M;
    private int zzWbs;
    private int zzWbt;
    private int zzWbu;
    private int zzWna;
    private int[] zzWnb;
    private int zzWnc;
    private int zzWnd;
    private int zzWne;

    public zzYW9() {
        this.zzWnb = new int[16];
        reset();
    }

    private static void zzU(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    private static int zzUy(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    private void zzZ(zzYW9 zzyw9) {
        zzZ((zzYUA) zzyw9);
        this.zzW3M = zzyw9.zzW3M;
        this.zzWne = zzyw9.zzWne;
        this.f51263H2 = zzyw9.f51263H2;
        this.f51264H3 = zzyw9.f51264H3;
        this.zzWnd = zzyw9.zzWnd;
        this.zzWnc = zzyw9.zzWnc;
        this.zzWbu = zzyw9.zzWbu;
        this.zzWbt = zzyw9.zzWbt;
        this.zzWbs = zzyw9.zzWbs;
        this.zzW3L = zzyw9.zzW3L;
        int[] iArr = zzyw9.zzWnb;
        System.arraycopy(iArr, 0, this.zzWnb, 0, iArr.length);
        this.zzWna = zzyw9.zzWna;
    }

    private static int zzZD(int i, int i2, int i3) {
        return i ^ (i2 | (~i3));
    }

    private static int zzZE(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private static int zzZF(int i, int i2, int i3) {
        return (i & i3) | (i2 & (~i3));
    }

    private static int zzZG(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    @Override // com.aspose.words.internal.zzYUX
    public final int doFinal(byte[] bArr, int i) {
        finish();
        zzU(this.zzW3M, bArr, i);
        zzU(this.zzWne, bArr, i + 4);
        zzU(this.f51263H2, bArr, i + 8);
        zzU(this.f51264H3, bArr, i + 12);
        zzU(this.zzWnd, bArr, i + 16);
        zzU(this.zzWnc, bArr, i + 20);
        zzU(this.zzWbu, bArr, i + 24);
        zzU(this.zzWbt, bArr, i + 28);
        zzU(this.zzWbs, bArr, i + 32);
        zzU(this.zzW3L, bArr, i + 36);
        reset();
        return 40;
    }

    @Override // com.aspose.words.internal.zzYUA, com.aspose.words.internal.zzYUX
    public final void reset() {
        super.reset();
        this.zzW3M = 1732584193;
        this.zzWne = -271733879;
        this.f51263H2 = -1732584194;
        this.f51264H3 = 271733878;
        this.zzWnd = -1009589776;
        this.zzWnc = 1985229328;
        this.zzWbu = -19088744;
        this.zzWbt = -1985229329;
        this.zzWbs = 19088743;
        this.zzW3L = 1009589775;
        this.zzWna = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.zzWnb;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // com.aspose.words.internal.zzYUX
    public final int zzQI() {
        return 40;
    }

    @Override // com.aspose.words.internal.zzYUA
    public final void zzX8(long j) {
        if (this.zzWna > 14) {
            zzXHo();
        }
        int[] iArr = this.zzWnb;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // com.aspose.words.internal.zzYGP
    public final zzYGP zzXE2() {
        return new zzYW9(this);
    }

    @Override // com.aspose.words.internal.zzYUX
    public final String zzXGi() {
        return "RIPEMD320";
    }

    @Override // com.aspose.words.internal.zzYUA
    public final void zzXHo() {
        int i = this.zzW3M;
        int i2 = this.zzWne;
        int i3 = this.f51263H2;
        int i4 = this.f51264H3;
        int i5 = this.zzWnd;
        int i6 = this.zzWnc;
        int i7 = this.zzWbu;
        int i8 = this.zzWbt;
        int i9 = this.zzWbs;
        int i10 = this.zzW3L;
        int iZzUy = zzUy(i + ((i2 ^ i3) ^ i4) + this.zzWnb[0], 11) + i5;
        int iZzUy2 = zzUy(i3, 10);
        int iZzUy3 = zzUy(i5 + ((iZzUy ^ i2) ^ iZzUy2) + this.zzWnb[1], 14) + i4;
        int iZzUy4 = zzUy(i2, 10);
        int iZzUy5 = zzUy(i4 + ((iZzUy3 ^ iZzUy) ^ iZzUy4) + this.zzWnb[2], 15) + iZzUy2;
        int iZzUy6 = zzUy(iZzUy, 10);
        int iZzUy7 = zzUy(iZzUy2 + ((iZzUy5 ^ iZzUy3) ^ iZzUy6) + this.zzWnb[3], 12) + iZzUy4;
        int iZzUy8 = zzUy(iZzUy3, 10);
        int iZzUy9 = zzUy(iZzUy4 + ((iZzUy7 ^ iZzUy5) ^ iZzUy8) + this.zzWnb[4], 5) + iZzUy6;
        int iZzUy10 = zzUy(iZzUy5, 10);
        int iZzUy11 = zzUy(iZzUy6 + ((iZzUy9 ^ iZzUy7) ^ iZzUy10) + this.zzWnb[5], 8) + iZzUy8;
        int iZzUy12 = zzUy(iZzUy7, 10);
        int iZzUy13 = zzUy(iZzUy8 + ((iZzUy11 ^ iZzUy9) ^ iZzUy12) + this.zzWnb[6], 7) + iZzUy10;
        int iZzUy14 = zzUy(iZzUy9, 10);
        int iZzUy15 = zzUy(iZzUy10 + ((iZzUy13 ^ iZzUy11) ^ iZzUy14) + this.zzWnb[7], 9) + iZzUy12;
        int iZzUy16 = zzUy(iZzUy11, 10);
        int iZzUy17 = zzUy(iZzUy12 + ((iZzUy15 ^ iZzUy13) ^ iZzUy16) + this.zzWnb[8], 11) + iZzUy14;
        int iZzUy18 = zzUy(iZzUy13, 10);
        int iZzUy19 = zzUy(iZzUy14 + ((iZzUy17 ^ iZzUy15) ^ iZzUy18) + this.zzWnb[9], 13) + iZzUy16;
        int iZzUy20 = zzUy(iZzUy15, 10);
        int iZzUy21 = zzUy(iZzUy16 + ((iZzUy19 ^ iZzUy17) ^ iZzUy20) + this.zzWnb[10], 14) + iZzUy18;
        int iZzUy22 = zzUy(iZzUy17, 10);
        int iZzUy23 = zzUy(iZzUy18 + ((iZzUy21 ^ iZzUy19) ^ iZzUy22) + this.zzWnb[11], 15) + iZzUy20;
        int iZzUy24 = zzUy(iZzUy19, 10);
        int iZzUy25 = zzUy(iZzUy20 + ((iZzUy23 ^ iZzUy21) ^ iZzUy24) + this.zzWnb[12], 6) + iZzUy22;
        int iZzUy26 = zzUy(iZzUy21, 10);
        int iZzUy27 = zzUy(iZzUy22 + ((iZzUy25 ^ iZzUy23) ^ iZzUy26) + this.zzWnb[13], 7) + iZzUy24;
        int iZzUy28 = zzUy(iZzUy23, 10);
        int iZzUy29 = zzUy(iZzUy24 + ((iZzUy27 ^ iZzUy25) ^ iZzUy28) + this.zzWnb[14], 9) + iZzUy26;
        int iZzUy30 = zzUy(iZzUy25, 10);
        int iZzUy31 = zzUy(iZzUy26 + ((iZzUy29 ^ iZzUy27) ^ iZzUy30) + this.zzWnb[15], 8) + iZzUy28;
        int iZzUy32 = zzUy(iZzUy27, 10);
        int iZzUy33 = zzUy(i6 + (((~i9) | i8) ^ i7) + this.zzWnb[5] + 1352829926, 8) + i10;
        int iZzUy34 = zzUy(i8, 10);
        int iZzUy35 = zzUy(i10 + (((~iZzUy34) | i7) ^ iZzUy33) + this.zzWnb[14] + 1352829926, 9) + i9;
        int iZzUy36 = zzUy(i7, 10);
        int iZzUy37 = zzUy(i9 + (((~iZzUy36) | iZzUy33) ^ iZzUy35) + this.zzWnb[7] + 1352829926, 9) + iZzUy34;
        int iZzUy38 = zzUy(iZzUy33, 10);
        int iZzUy39 = zzUy(iZzUy34 + (((~iZzUy38) | iZzUy35) ^ iZzUy37) + this.zzWnb[0] + 1352829926, 11) + iZzUy36;
        int iZzUy40 = zzUy(iZzUy35, 10);
        int iZzUy41 = zzUy(iZzUy36 + (((~iZzUy40) | iZzUy37) ^ iZzUy39) + this.zzWnb[9] + 1352829926, 13) + iZzUy38;
        int iZzUy42 = zzUy(iZzUy37, 10);
        int iZzUy43 = zzUy(iZzUy38 + (((~iZzUy42) | iZzUy39) ^ iZzUy41) + this.zzWnb[2] + 1352829926, 15) + iZzUy40;
        int iZzUy44 = zzUy(iZzUy39, 10);
        int iZzUy45 = zzUy(iZzUy40 + (((~iZzUy44) | iZzUy41) ^ iZzUy43) + this.zzWnb[11] + 1352829926, 15) + iZzUy42;
        int iZzUy46 = zzUy(iZzUy41, 10);
        int iZzUy47 = zzUy(iZzUy42 + (((~iZzUy46) | iZzUy43) ^ iZzUy45) + this.zzWnb[4] + 1352829926, 5) + iZzUy44;
        int iZzUy48 = zzUy(iZzUy43, 10);
        int iZzUy49 = zzUy(iZzUy44 + (((~iZzUy48) | iZzUy45) ^ iZzUy47) + this.zzWnb[13] + 1352829926, 7) + iZzUy46;
        int iZzUy50 = zzUy(iZzUy45, 10);
        int iZzUy51 = zzUy(iZzUy46 + (((~iZzUy50) | iZzUy47) ^ iZzUy49) + this.zzWnb[6] + 1352829926, 7) + iZzUy48;
        int iZzUy52 = zzUy(iZzUy47, 10);
        int iZzUy53 = zzUy(iZzUy48 + (((~iZzUy52) | iZzUy49) ^ iZzUy51) + this.zzWnb[15] + 1352829926, 8) + iZzUy50;
        int iZzUy54 = zzUy(iZzUy49, 10);
        int iZzUy55 = zzUy(iZzUy50 + (((~iZzUy54) | iZzUy51) ^ iZzUy53) + this.zzWnb[8] + 1352829926, 11) + iZzUy52;
        int iZzUy56 = zzUy(iZzUy51, 10);
        int iZzUy57 = zzUy(iZzUy52 + (((~iZzUy56) | iZzUy53) ^ iZzUy55) + this.zzWnb[1] + 1352829926, 14) + iZzUy54;
        int iZzUy58 = zzUy(iZzUy53, 10);
        int iZzUy59 = zzUy(iZzUy54 + (((~iZzUy58) | iZzUy55) ^ iZzUy57) + this.zzWnb[10] + 1352829926, 14) + iZzUy56;
        int iZzUy60 = zzUy(iZzUy55, 10);
        int iZzUy61 = zzUy(iZzUy56 + (((~iZzUy60) | iZzUy57) ^ iZzUy59) + this.zzWnb[3] + 1352829926, 12) + iZzUy58;
        int iZzUy62 = zzUy(iZzUy57, 10);
        int iZzUy63 = zzUy(iZzUy58 + (((~iZzUy62) | iZzUy59) ^ iZzUy61) + this.zzWnb[12] + 1352829926, 6) + iZzUy60;
        int iZzUy64 = zzUy(iZzUy59, 10);
        int iZzUy65 = zzUy(iZzUy28 + zzZG(iZzUy63, iZzUy29, iZzUy32) + this.zzWnb[7] + 1518500249, 7) + iZzUy30;
        int iZzUy66 = zzUy(iZzUy29, 10);
        int iZzUy67 = zzUy(iZzUy30 + zzZG(iZzUy65, iZzUy63, iZzUy66) + this.zzWnb[4] + 1518500249, 6) + iZzUy32;
        int iZzUy68 = zzUy(iZzUy63, 10);
        int iZzUy69 = zzUy(iZzUy32 + zzZG(iZzUy67, iZzUy65, iZzUy68) + this.zzWnb[13] + 1518500249, 8) + iZzUy66;
        int iZzUy70 = zzUy(iZzUy65, 10);
        int iZzUy71 = zzUy(iZzUy66 + zzZG(iZzUy69, iZzUy67, iZzUy70) + this.zzWnb[1] + 1518500249, 13) + iZzUy68;
        int iZzUy72 = zzUy(iZzUy67, 10);
        int iZzUy73 = zzUy(iZzUy68 + zzZG(iZzUy71, iZzUy69, iZzUy72) + this.zzWnb[10] + 1518500249, 11) + iZzUy70;
        int iZzUy74 = zzUy(iZzUy69, 10);
        int iZzUy75 = zzUy(iZzUy70 + zzZG(iZzUy73, iZzUy71, iZzUy74) + this.zzWnb[6] + 1518500249, 9) + iZzUy72;
        int iZzUy76 = zzUy(iZzUy71, 10);
        int iZzUy77 = zzUy(iZzUy72 + zzZG(iZzUy75, iZzUy73, iZzUy76) + this.zzWnb[15] + 1518500249, 7) + iZzUy74;
        int iZzUy78 = zzUy(iZzUy73, 10);
        int iZzUy79 = zzUy(iZzUy74 + zzZG(iZzUy77, iZzUy75, iZzUy78) + this.zzWnb[3] + 1518500249, 15) + iZzUy76;
        int iZzUy80 = zzUy(iZzUy75, 10);
        int iZzUy81 = zzUy(iZzUy76 + zzZG(iZzUy79, iZzUy77, iZzUy80) + this.zzWnb[12] + 1518500249, 7) + iZzUy78;
        int iZzUy82 = zzUy(iZzUy77, 10);
        int iZzUy83 = zzUy(iZzUy78 + zzZG(iZzUy81, iZzUy79, iZzUy82) + this.zzWnb[0] + 1518500249, 12) + iZzUy80;
        int iZzUy84 = zzUy(iZzUy79, 10);
        int iZzUy85 = zzUy(iZzUy80 + zzZG(iZzUy83, iZzUy81, iZzUy84) + this.zzWnb[9] + 1518500249, 15) + iZzUy82;
        int iZzUy86 = zzUy(iZzUy81, 10);
        int iZzUy87 = zzUy(iZzUy82 + zzZG(iZzUy85, iZzUy83, iZzUy86) + this.zzWnb[5] + 1518500249, 9) + iZzUy84;
        int iZzUy88 = zzUy(iZzUy83, 10);
        int iZzUy89 = zzUy(iZzUy84 + zzZG(iZzUy87, iZzUy85, iZzUy88) + this.zzWnb[2] + 1518500249, 11) + iZzUy86;
        int iZzUy90 = zzUy(iZzUy85, 10);
        int iZzUy91 = zzUy(iZzUy86 + zzZG(iZzUy89, iZzUy87, iZzUy90) + this.zzWnb[14] + 1518500249, 7) + iZzUy88;
        int iZzUy92 = zzUy(iZzUy87, 10);
        int iZzUy93 = zzUy(iZzUy88 + zzZG(iZzUy91, iZzUy89, iZzUy92) + this.zzWnb[11] + 1518500249, 13) + iZzUy90;
        int iZzUy94 = zzUy(iZzUy89, 10);
        int iZzUy95 = zzUy(iZzUy90 + zzZG(iZzUy93, iZzUy91, iZzUy94) + this.zzWnb[8] + 1518500249, 12) + iZzUy92;
        int iZzUy96 = zzUy(iZzUy91, 10);
        int iZzUy97 = zzUy(iZzUy60 + zzZF(iZzUy31, iZzUy61, iZzUy64) + this.zzWnb[6] + 1548603684, 9) + iZzUy62;
        int iZzUy98 = zzUy(iZzUy61, 10);
        int iZzUy99 = zzUy(iZzUy62 + zzZF(iZzUy97, iZzUy31, iZzUy98) + this.zzWnb[11] + 1548603684, 13) + iZzUy64;
        int iZzUy100 = zzUy(iZzUy31, 10);
        int iZzUy101 = zzUy(iZzUy64 + zzZF(iZzUy99, iZzUy97, iZzUy100) + this.zzWnb[3] + 1548603684, 15) + iZzUy98;
        int iZzUy102 = zzUy(iZzUy97, 10);
        int iZzUy103 = zzUy(iZzUy98 + zzZF(iZzUy101, iZzUy99, iZzUy102) + this.zzWnb[7] + 1548603684, 7) + iZzUy100;
        int iZzUy104 = zzUy(iZzUy99, 10);
        int iZzUy105 = zzUy(iZzUy100 + zzZF(iZzUy103, iZzUy101, iZzUy104) + this.zzWnb[0] + 1548603684, 12) + iZzUy102;
        int iZzUy106 = zzUy(iZzUy101, 10);
        int iZzUy107 = zzUy(iZzUy102 + zzZF(iZzUy105, iZzUy103, iZzUy106) + this.zzWnb[13] + 1548603684, 8) + iZzUy104;
        int iZzUy108 = zzUy(iZzUy103, 10);
        int iZzUy109 = zzUy(iZzUy104 + zzZF(iZzUy107, iZzUy105, iZzUy108) + this.zzWnb[5] + 1548603684, 9) + iZzUy106;
        int iZzUy110 = zzUy(iZzUy105, 10);
        int iZzUy111 = zzUy(iZzUy106 + zzZF(iZzUy109, iZzUy107, iZzUy110) + this.zzWnb[10] + 1548603684, 11) + iZzUy108;
        int iZzUy112 = zzUy(iZzUy107, 10);
        int iZzUy113 = zzUy(iZzUy108 + zzZF(iZzUy111, iZzUy109, iZzUy112) + this.zzWnb[14] + 1548603684, 7) + iZzUy110;
        int iZzUy114 = zzUy(iZzUy109, 10);
        int iZzUy115 = zzUy(iZzUy110 + zzZF(iZzUy113, iZzUy111, iZzUy114) + this.zzWnb[15] + 1548603684, 7) + iZzUy112;
        int iZzUy116 = zzUy(iZzUy111, 10);
        int iZzUy117 = zzUy(iZzUy112 + zzZF(iZzUy115, iZzUy113, iZzUy116) + this.zzWnb[8] + 1548603684, 12) + iZzUy114;
        int iZzUy118 = zzUy(iZzUy113, 10);
        int iZzUy119 = zzUy(iZzUy114 + zzZF(iZzUy117, iZzUy115, iZzUy118) + this.zzWnb[12] + 1548603684, 7) + iZzUy116;
        int iZzUy120 = zzUy(iZzUy115, 10);
        int iZzUy121 = zzUy(iZzUy116 + zzZF(iZzUy119, iZzUy117, iZzUy120) + this.zzWnb[4] + 1548603684, 6) + iZzUy118;
        int iZzUy122 = zzUy(iZzUy117, 10);
        int iZzUy123 = zzUy(iZzUy118 + zzZF(iZzUy121, iZzUy119, iZzUy122) + this.zzWnb[9] + 1548603684, 15) + iZzUy120;
        int iZzUy124 = zzUy(iZzUy119, 10);
        int iZzUy125 = zzUy(iZzUy120 + zzZF(iZzUy123, iZzUy121, iZzUy124) + this.zzWnb[1] + 1548603684, 13) + iZzUy122;
        int iZzUy126 = zzUy(iZzUy121, 10);
        int iZzUy127 = zzUy(iZzUy122 + zzZF(iZzUy125, iZzUy123, iZzUy126) + this.zzWnb[2] + 1548603684, 11) + iZzUy124;
        int iZzUy128 = zzUy(iZzUy123, 10);
        int iZzUy129 = zzUy(iZzUy92 + (((~iZzUy93) | iZzUy95) ^ iZzUy128) + this.zzWnb[3] + 1859775393, 11) + iZzUy94;
        int iZzUy130 = zzUy(iZzUy93, 10);
        int iZzUy131 = zzUy(iZzUy94 + (((~iZzUy95) | iZzUy129) ^ iZzUy130) + this.zzWnb[10] + 1859775393, 13) + iZzUy128;
        int iZzUy132 = zzUy(iZzUy95, 10);
        int iZzUy133 = zzUy(iZzUy128 + (((~iZzUy129) | iZzUy131) ^ iZzUy132) + this.zzWnb[14] + 1859775393, 6) + iZzUy130;
        int iZzUy134 = zzUy(iZzUy129, 10);
        int iZzUy135 = zzUy(iZzUy130 + (((~iZzUy131) | iZzUy133) ^ iZzUy134) + this.zzWnb[4] + 1859775393, 7) + iZzUy132;
        int iZzUy136 = zzUy(iZzUy131, 10);
        int iZzUy137 = zzUy(iZzUy132 + (((~iZzUy133) | iZzUy135) ^ iZzUy136) + this.zzWnb[9] + 1859775393, 14) + iZzUy134;
        int iZzUy138 = zzUy(iZzUy133, 10);
        int iZzUy139 = zzUy(iZzUy134 + (((~iZzUy135) | iZzUy137) ^ iZzUy138) + this.zzWnb[15] + 1859775393, 9) + iZzUy136;
        int iZzUy140 = zzUy(iZzUy135, 10);
        int iZzUy141 = zzUy(iZzUy136 + (((~iZzUy137) | iZzUy139) ^ iZzUy140) + this.zzWnb[8] + 1859775393, 13) + iZzUy138;
        int iZzUy142 = zzUy(iZzUy137, 10);
        int iZzUy143 = zzUy(iZzUy138 + (((~iZzUy139) | iZzUy141) ^ iZzUy142) + this.zzWnb[1] + 1859775393, 15) + iZzUy140;
        int iZzUy144 = zzUy(iZzUy139, 10);
        int iZzUy145 = zzUy(iZzUy140 + (((~iZzUy141) | iZzUy143) ^ iZzUy144) + this.zzWnb[2] + 1859775393, 14) + iZzUy142;
        int iZzUy146 = zzUy(iZzUy141, 10);
        int iZzUy147 = zzUy(iZzUy142 + (((~iZzUy143) | iZzUy145) ^ iZzUy146) + this.zzWnb[7] + 1859775393, 8) + iZzUy144;
        int iZzUy148 = zzUy(iZzUy143, 10);
        int iZzUy149 = zzUy(iZzUy144 + (((~iZzUy145) | iZzUy147) ^ iZzUy148) + this.zzWnb[0] + 1859775393, 13) + iZzUy146;
        int iZzUy150 = zzUy(iZzUy145, 10);
        int iZzUy151 = zzUy(iZzUy146 + (((~iZzUy147) | iZzUy149) ^ iZzUy150) + this.zzWnb[6] + 1859775393, 6) + iZzUy148;
        int iZzUy152 = zzUy(iZzUy147, 10);
        int iZzUy153 = zzUy(iZzUy148 + (((~iZzUy149) | iZzUy151) ^ iZzUy152) + this.zzWnb[13] + 1859775393, 5) + iZzUy150;
        int iZzUy154 = zzUy(iZzUy149, 10);
        int iZzUy155 = zzUy(iZzUy150 + (((~iZzUy151) | iZzUy153) ^ iZzUy154) + this.zzWnb[11] + 1859775393, 12) + iZzUy152;
        int iZzUy156 = zzUy(iZzUy151, 10);
        int iZzUy157 = zzUy(iZzUy152 + (((~iZzUy153) | iZzUy155) ^ iZzUy156) + this.zzWnb[5] + 1859775393, 7) + iZzUy154;
        int iZzUy158 = zzUy(iZzUy153, 10);
        int iZzUy159 = zzUy(iZzUy154 + (((~iZzUy155) | iZzUy157) ^ iZzUy158) + this.zzWnb[12] + 1859775393, 5) + iZzUy156;
        int iZzUy160 = zzUy(iZzUy155, 10);
        int iZzUy161 = zzUy(iZzUy124 + (((~iZzUy125) | iZzUy127) ^ iZzUy96) + this.zzWnb[15] + 1836072691, 9) + iZzUy126;
        int iZzUy162 = zzUy(iZzUy125, 10);
        int iZzUy163 = zzUy(iZzUy126 + (((~iZzUy127) | iZzUy161) ^ iZzUy162) + this.zzWnb[5] + 1836072691, 7) + iZzUy96;
        int iZzUy164 = zzUy(iZzUy127, 10);
        int iZzUy165 = zzUy(iZzUy96 + (((~iZzUy161) | iZzUy163) ^ iZzUy164) + this.zzWnb[1] + 1836072691, 15) + iZzUy162;
        int iZzUy166 = zzUy(iZzUy161, 10);
        int iZzUy167 = zzUy(iZzUy162 + (((~iZzUy163) | iZzUy165) ^ iZzUy166) + this.zzWnb[3] + 1836072691, 11) + iZzUy164;
        int iZzUy168 = zzUy(iZzUy163, 10);
        int iZzUy169 = zzUy(iZzUy164 + (((~iZzUy165) | iZzUy167) ^ iZzUy168) + this.zzWnb[7] + 1836072691, 8) + iZzUy166;
        int iZzUy170 = zzUy(iZzUy165, 10);
        int iZzUy171 = zzUy(iZzUy166 + (((~iZzUy167) | iZzUy169) ^ iZzUy170) + this.zzWnb[14] + 1836072691, 6) + iZzUy168;
        int iZzUy172 = zzUy(iZzUy167, 10);
        int iZzUy173 = zzUy(iZzUy168 + (((~iZzUy169) | iZzUy171) ^ iZzUy172) + this.zzWnb[6] + 1836072691, 6) + iZzUy170;
        int iZzUy174 = zzUy(iZzUy169, 10);
        int iZzUy175 = zzUy(iZzUy170 + (((~iZzUy171) | iZzUy173) ^ iZzUy174) + this.zzWnb[9] + 1836072691, 14) + iZzUy172;
        int iZzUy176 = zzUy(iZzUy171, 10);
        int iZzUy177 = zzUy(iZzUy172 + (((~iZzUy173) | iZzUy175) ^ iZzUy176) + this.zzWnb[11] + 1836072691, 12) + iZzUy174;
        int iZzUy178 = zzUy(iZzUy173, 10);
        int iZzUy179 = zzUy(iZzUy174 + (((~iZzUy175) | iZzUy177) ^ iZzUy178) + this.zzWnb[8] + 1836072691, 13) + iZzUy176;
        int iZzUy180 = zzUy(iZzUy175, 10);
        int iZzUy181 = zzUy(iZzUy176 + (((~iZzUy177) | iZzUy179) ^ iZzUy180) + this.zzWnb[12] + 1836072691, 5) + iZzUy178;
        int iZzUy182 = zzUy(iZzUy177, 10);
        int iZzUy183 = zzUy(iZzUy178 + (((~iZzUy179) | iZzUy181) ^ iZzUy182) + this.zzWnb[2] + 1836072691, 14) + iZzUy180;
        int iZzUy184 = zzUy(iZzUy179, 10);
        int iZzUy185 = zzUy(iZzUy180 + (((~iZzUy181) | iZzUy183) ^ iZzUy184) + this.zzWnb[10] + 1836072691, 13) + iZzUy182;
        int iZzUy186 = zzUy(iZzUy181, 10);
        int iZzUy187 = zzUy(iZzUy182 + (((~iZzUy183) | iZzUy185) ^ iZzUy186) + this.zzWnb[0] + 1836072691, 13) + iZzUy184;
        int iZzUy188 = zzUy(iZzUy183, 10);
        int iZzUy189 = zzUy(iZzUy184 + (((~iZzUy185) | iZzUy187) ^ iZzUy188) + this.zzWnb[4] + 1836072691, 7) + iZzUy186;
        int iZzUy190 = zzUy(iZzUy185, 10);
        int iZzUy191 = zzUy(iZzUy186 + (((~iZzUy187) | iZzUy189) ^ iZzUy190) + this.zzWnb[13] + 1836072691, 5) + iZzUy188;
        int iZzUy192 = zzUy(iZzUy187, 10);
        int iZzUy193 = zzUy(((iZzUy188 + zzZF(iZzUy159, iZzUy157, iZzUy160)) + this.zzWnb[1]) - 1894007588, 11) + iZzUy158;
        int iZzUy194 = zzUy(iZzUy157, 10);
        int iZzUy195 = zzUy(((iZzUy158 + zzZF(iZzUy193, iZzUy159, iZzUy194)) + this.zzWnb[9]) - 1894007588, 12) + iZzUy160;
        int iZzUy196 = zzUy(iZzUy159, 10);
        int iZzUy197 = zzUy(((iZzUy160 + zzZF(iZzUy195, iZzUy193, iZzUy196)) + this.zzWnb[11]) - 1894007588, 14) + iZzUy194;
        int iZzUy198 = zzUy(iZzUy193, 10);
        int iZzUy199 = zzUy(((iZzUy194 + zzZF(iZzUy197, iZzUy195, iZzUy198)) + this.zzWnb[10]) - 1894007588, 15) + iZzUy196;
        int iZzUy200 = zzUy(iZzUy195, 10);
        int iZzUy201 = zzUy(((iZzUy196 + zzZF(iZzUy199, iZzUy197, iZzUy200)) + this.zzWnb[0]) - 1894007588, 14) + iZzUy198;
        int iZzUy202 = zzUy(iZzUy197, 10);
        int iZzUy203 = zzUy(((iZzUy198 + zzZF(iZzUy201, iZzUy199, iZzUy202)) + this.zzWnb[8]) - 1894007588, 15) + iZzUy200;
        int iZzUy204 = zzUy(iZzUy199, 10);
        int iZzUy205 = zzUy(((iZzUy200 + zzZF(iZzUy203, iZzUy201, iZzUy204)) + this.zzWnb[12]) - 1894007588, 9) + iZzUy202;
        int iZzUy206 = zzUy(iZzUy201, 10);
        int iZzUy207 = zzUy(((iZzUy202 + zzZF(iZzUy205, iZzUy203, iZzUy206)) + this.zzWnb[4]) - 1894007588, 8) + iZzUy204;
        int iZzUy208 = zzUy(iZzUy203, 10);
        int iZzUy209 = zzUy(((iZzUy204 + zzZF(iZzUy207, iZzUy205, iZzUy208)) + this.zzWnb[13]) - 1894007588, 9) + iZzUy206;
        int iZzUy210 = zzUy(iZzUy205, 10);
        int iZzUy211 = zzUy(((iZzUy206 + zzZF(iZzUy209, iZzUy207, iZzUy210)) + this.zzWnb[3]) - 1894007588, 14) + iZzUy208;
        int iZzUy212 = zzUy(iZzUy207, 10);
        int iZzUy213 = zzUy(((iZzUy208 + zzZF(iZzUy211, iZzUy209, iZzUy212)) + this.zzWnb[7]) - 1894007588, 5) + iZzUy210;
        int iZzUy214 = zzUy(iZzUy209, 10);
        int iZzUy215 = zzUy(((iZzUy210 + zzZF(iZzUy213, iZzUy211, iZzUy214)) + this.zzWnb[15]) - 1894007588, 6) + iZzUy212;
        int iZzUy216 = zzUy(iZzUy211, 10);
        int iZzUy217 = zzUy(((iZzUy212 + zzZF(iZzUy215, iZzUy213, iZzUy216)) + this.zzWnb[14]) - 1894007588, 8) + iZzUy214;
        int iZzUy218 = zzUy(iZzUy213, 10);
        int iZzUy219 = zzUy(((iZzUy214 + zzZF(iZzUy217, iZzUy215, iZzUy218)) + this.zzWnb[5]) - 1894007588, 6) + iZzUy216;
        int iZzUy220 = zzUy(iZzUy215, 10);
        int iZzUy221 = zzUy(((iZzUy216 + zzZF(iZzUy219, iZzUy217, iZzUy220)) + this.zzWnb[6]) - 1894007588, 5) + iZzUy218;
        int iZzUy222 = zzUy(iZzUy217, 10);
        int iZzUy223 = zzUy(((iZzUy218 + zzZF(iZzUy221, iZzUy219, iZzUy222)) + this.zzWnb[2]) - 1894007588, 12) + iZzUy220;
        int iZzUy224 = zzUy(iZzUy219, 10);
        int iZzUy225 = zzUy(iZzUy156 + zzZG(iZzUy191, iZzUy189, iZzUy192) + this.zzWnb[8] + 2053994217, 15) + iZzUy190;
        int iZzUy226 = zzUy(iZzUy189, 10);
        int iZzUy227 = zzUy(iZzUy190 + zzZG(iZzUy225, iZzUy191, iZzUy226) + this.zzWnb[6] + 2053994217, 5) + iZzUy192;
        int iZzUy228 = zzUy(iZzUy191, 10);
        int iZzUy229 = zzUy(iZzUy192 + zzZG(iZzUy227, iZzUy225, iZzUy228) + this.zzWnb[4] + 2053994217, 8) + iZzUy226;
        int iZzUy230 = zzUy(iZzUy225, 10);
        int iZzUy231 = zzUy(iZzUy226 + zzZG(iZzUy229, iZzUy227, iZzUy230) + this.zzWnb[1] + 2053994217, 11) + iZzUy228;
        int iZzUy232 = zzUy(iZzUy227, 10);
        int iZzUy233 = zzUy(iZzUy228 + zzZG(iZzUy231, iZzUy229, iZzUy232) + this.zzWnb[3] + 2053994217, 14) + iZzUy230;
        int iZzUy234 = zzUy(iZzUy229, 10);
        int iZzUy235 = zzUy(iZzUy230 + zzZG(iZzUy233, iZzUy231, iZzUy234) + this.zzWnb[11] + 2053994217, 14) + iZzUy232;
        int iZzUy236 = zzUy(iZzUy231, 10);
        int iZzUy237 = zzUy(iZzUy232 + zzZG(iZzUy235, iZzUy233, iZzUy236) + this.zzWnb[15] + 2053994217, 6) + iZzUy234;
        int iZzUy238 = zzUy(iZzUy233, 10);
        int iZzUy239 = zzUy(iZzUy234 + zzZG(iZzUy237, iZzUy235, iZzUy238) + this.zzWnb[0] + 2053994217, 14) + iZzUy236;
        int iZzUy240 = zzUy(iZzUy235, 10);
        int iZzUy241 = zzUy(iZzUy236 + zzZG(iZzUy239, iZzUy237, iZzUy240) + this.zzWnb[5] + 2053994217, 6) + iZzUy238;
        int iZzUy242 = zzUy(iZzUy237, 10);
        int iZzUy243 = zzUy(iZzUy238 + zzZG(iZzUy241, iZzUy239, iZzUy242) + this.zzWnb[12] + 2053994217, 9) + iZzUy240;
        int iZzUy244 = zzUy(iZzUy239, 10);
        int iZzUy245 = zzUy(iZzUy240 + zzZG(iZzUy243, iZzUy241, iZzUy244) + this.zzWnb[2] + 2053994217, 12) + iZzUy242;
        int iZzUy246 = zzUy(iZzUy241, 10);
        int iZzUy247 = zzUy(iZzUy242 + zzZG(iZzUy245, iZzUy243, iZzUy246) + this.zzWnb[13] + 2053994217, 9) + iZzUy244;
        int iZzUy248 = zzUy(iZzUy243, 10);
        int iZzUy249 = zzUy(iZzUy244 + zzZG(iZzUy247, iZzUy245, iZzUy248) + this.zzWnb[9] + 2053994217, 12) + iZzUy246;
        int iZzUy250 = zzUy(iZzUy245, 10);
        int iZzUy251 = zzUy(iZzUy246 + zzZG(iZzUy249, iZzUy247, iZzUy250) + this.zzWnb[7] + 2053994217, 5) + iZzUy248;
        int iZzUy252 = zzUy(iZzUy247, 10);
        int iZzUy253 = zzUy(iZzUy248 + zzZG(iZzUy251, iZzUy249, iZzUy252) + this.zzWnb[10] + 2053994217, 15) + iZzUy250;
        int iZzUy254 = zzUy(iZzUy249, 10);
        int iZzUy255 = zzUy(iZzUy250 + zzZG(iZzUy253, iZzUy251, iZzUy254) + this.zzWnb[14] + 2053994217, 8) + iZzUy252;
        int iZzUy256 = zzUy(iZzUy251, 10);
        int iZzUy257 = zzUy(((iZzUy220 + (((~iZzUy224) | iZzUy253) ^ iZzUy223)) + this.zzWnb[4]) - 1454113458, 9) + iZzUy222;
        int iZzUy258 = zzUy(iZzUy253, 10);
        int iZzUy259 = zzUy(((iZzUy222 + (((~iZzUy258) | iZzUy223) ^ iZzUy257)) + this.zzWnb[0]) - 1454113458, 15) + iZzUy224;
        int iZzUy260 = zzUy(iZzUy223, 10);
        int iZzUy261 = zzUy(((iZzUy224 + (((~iZzUy260) | iZzUy257) ^ iZzUy259)) + this.zzWnb[5]) - 1454113458, 5) + iZzUy258;
        int iZzUy262 = zzUy(iZzUy257, 10);
        int iZzUy263 = zzUy(((iZzUy258 + (((~iZzUy262) | iZzUy259) ^ iZzUy261)) + this.zzWnb[9]) - 1454113458, 11) + iZzUy260;
        int iZzUy264 = zzUy(iZzUy259, 10);
        int iZzUy265 = zzUy(((iZzUy260 + (((~iZzUy264) | iZzUy261) ^ iZzUy263)) + this.zzWnb[7]) - 1454113458, 6) + iZzUy262;
        int iZzUy266 = zzUy(iZzUy261, 10);
        int iZzUy267 = zzUy(((iZzUy262 + (((~iZzUy266) | iZzUy263) ^ iZzUy265)) + this.zzWnb[12]) - 1454113458, 8) + iZzUy264;
        int iZzUy268 = zzUy(iZzUy263, 10);
        int iZzUy269 = zzUy(((iZzUy264 + (((~iZzUy268) | iZzUy265) ^ iZzUy267)) + this.zzWnb[2]) - 1454113458, 13) + iZzUy266;
        int iZzUy270 = zzUy(iZzUy265, 10);
        int iZzUy271 = zzUy(((iZzUy266 + (((~iZzUy270) | iZzUy267) ^ iZzUy269)) + this.zzWnb[10]) - 1454113458, 12) + iZzUy268;
        int iZzUy272 = zzUy(iZzUy267, 10);
        int iZzUy273 = zzUy(((iZzUy268 + (((~iZzUy272) | iZzUy269) ^ iZzUy271)) + this.zzWnb[14]) - 1454113458, 5) + iZzUy270;
        int iZzUy274 = zzUy(iZzUy269, 10);
        int iZzUy275 = zzUy(((iZzUy270 + (((~iZzUy274) | iZzUy271) ^ iZzUy273)) + this.zzWnb[1]) - 1454113458, 12) + iZzUy272;
        int iZzUy276 = zzUy(iZzUy271, 10);
        int iZzUy277 = zzUy(((iZzUy272 + (((~iZzUy276) | iZzUy273) ^ iZzUy275)) + this.zzWnb[3]) - 1454113458, 13) + iZzUy274;
        int iZzUy278 = zzUy(iZzUy273, 10);
        int iZzUy279 = zzUy(((iZzUy274 + (((~iZzUy278) | iZzUy275) ^ iZzUy277)) + this.zzWnb[8]) - 1454113458, 14) + iZzUy276;
        int iZzUy280 = zzUy(iZzUy275, 10);
        int iZzUy281 = zzUy(((iZzUy276 + (((~iZzUy280) | iZzUy277) ^ iZzUy279)) + this.zzWnb[11]) - 1454113458, 11) + iZzUy278;
        int iZzUy282 = zzUy(iZzUy277, 10);
        int iZzUy283 = zzUy(((iZzUy278 + (((~iZzUy282) | iZzUy279) ^ iZzUy281)) + this.zzWnb[6]) - 1454113458, 8) + iZzUy280;
        int iZzUy284 = zzUy(iZzUy279, 10);
        int iZzUy285 = zzUy(((iZzUy280 + zzZD(iZzUy283, iZzUy281, iZzUy284)) + this.zzWnb[15]) - 1454113458, 5) + iZzUy282;
        int iZzUy286 = zzUy(iZzUy281, 10);
        int iZzUy287 = zzUy(((iZzUy282 + zzZD(iZzUy285, iZzUy283, iZzUy286)) + this.zzWnb[13]) - 1454113458, 6) + iZzUy284;
        int iZzUy288 = zzUy(iZzUy283, 10);
        int iZzUy289 = zzUy(iZzUy252 + zzZE(iZzUy255, iZzUy221, iZzUy256) + this.zzWnb[12], 8) + iZzUy254;
        int iZzUy290 = zzUy(iZzUy221, 10);
        int iZzUy291 = zzUy(iZzUy254 + zzZE(iZzUy289, iZzUy255, iZzUy290) + this.zzWnb[15], 5) + iZzUy256;
        int iZzUy292 = zzUy(iZzUy255, 10);
        int iZzUy293 = zzUy(iZzUy256 + zzZE(iZzUy291, iZzUy289, iZzUy292) + this.zzWnb[10], 12) + iZzUy290;
        int iZzUy294 = zzUy(iZzUy289, 10);
        int iZzUy295 = zzUy(iZzUy290 + zzZE(iZzUy293, iZzUy291, iZzUy294) + this.zzWnb[4], 9) + iZzUy292;
        int iZzUy296 = zzUy(iZzUy291, 10);
        int iZzUy297 = zzUy(iZzUy292 + zzZE(iZzUy295, iZzUy293, iZzUy296) + this.zzWnb[1], 12) + iZzUy294;
        int iZzUy298 = zzUy(iZzUy293, 10);
        int iZzUy299 = zzUy(iZzUy294 + zzZE(iZzUy297, iZzUy295, iZzUy298) + this.zzWnb[5], 5) + iZzUy296;
        int iZzUy300 = zzUy(iZzUy295, 10);
        int iZzUy301 = zzUy(iZzUy296 + zzZE(iZzUy299, iZzUy297, iZzUy300) + this.zzWnb[8], 14) + iZzUy298;
        int iZzUy302 = zzUy(iZzUy297, 10);
        int iZzUy303 = zzUy(iZzUy298 + zzZE(iZzUy301, iZzUy299, iZzUy302) + this.zzWnb[7], 6) + iZzUy300;
        int iZzUy304 = zzUy(iZzUy299, 10);
        int iZzUy305 = zzUy(iZzUy300 + zzZE(iZzUy303, iZzUy301, iZzUy304) + this.zzWnb[6], 8) + iZzUy302;
        int iZzUy306 = zzUy(iZzUy301, 10);
        int iZzUy307 = zzUy(iZzUy302 + zzZE(iZzUy305, iZzUy303, iZzUy306) + this.zzWnb[2], 13) + iZzUy304;
        int iZzUy308 = zzUy(iZzUy303, 10);
        int iZzUy309 = zzUy(iZzUy304 + zzZE(iZzUy307, iZzUy305, iZzUy308) + this.zzWnb[13], 6) + iZzUy306;
        int iZzUy310 = zzUy(iZzUy305, 10);
        int iZzUy311 = zzUy(iZzUy306 + zzZE(iZzUy309, iZzUy307, iZzUy310) + this.zzWnb[14], 5) + iZzUy308;
        int iZzUy312 = zzUy(iZzUy307, 10);
        int iZzUy313 = zzUy(iZzUy308 + zzZE(iZzUy311, iZzUy309, iZzUy312) + this.zzWnb[0], 15) + iZzUy310;
        int iZzUy314 = zzUy(iZzUy309, 10);
        int iZzUy315 = zzUy(iZzUy310 + zzZE(iZzUy313, iZzUy311, iZzUy314) + this.zzWnb[3], 13) + iZzUy312;
        int iZzUy316 = zzUy(iZzUy311, 10);
        int iZzUy317 = zzUy(iZzUy312 + zzZE(iZzUy315, iZzUy313, iZzUy316) + this.zzWnb[9], 11) + iZzUy314;
        int iZzUy318 = zzUy(iZzUy313, 10);
        int iZzUy319 = zzUy(iZzUy314 + zzZE(iZzUy317, iZzUy315, iZzUy318) + this.zzWnb[11], 11) + iZzUy316;
        int iZzUy320 = zzUy(iZzUy315, 10);
        this.zzW3M += iZzUy284;
        this.zzWne += iZzUy287;
        this.f51263H2 += iZzUy285;
        this.f51264H3 += iZzUy288;
        this.zzWnd += iZzUy318;
        this.zzWnc += iZzUy316;
        this.zzWbu += iZzUy319;
        this.zzWbt += iZzUy317;
        this.zzWbs += iZzUy320;
        this.zzW3L += iZzUy286;
        this.zzWna = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.zzWnb;
            if (i11 == iArr.length) {
                return;
            }
            iArr[i11] = 0;
            i11++;
        }
    }

    @Override // com.aspose.words.internal.zzYUA
    public final void zzk(byte[] bArr, int i) {
        int[] iArr = this.zzWnb;
        int i2 = this.zzWna;
        int i3 = i2 + 1;
        this.zzWna = i3;
        iArr[i2] = ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        if (i3 == 16) {
            zzXHo();
        }
    }

    public zzYW9(zzYW9 zzyw9) {
        super(zzyw9);
        this.zzWnb = new int[16];
        zzZ(zzyw9);
    }

    @Override // com.aspose.words.internal.zzYGP
    public final void zzZ(zzYGP zzygp) {
        zzZ((zzYW9) zzygp);
    }
}
