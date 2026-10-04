package oO0oOoo0;

/* JADX INFO: renamed from: oO0oOoo0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34211OooO0Oo extends AbstractC34208OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f122891OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f122892OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f122893OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f122894OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f122895OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int[] f122896OooO0oo;

    public static int OooO(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    public static int OooOO0(int i, int i2, int i3) {
        return (i & i3) | (i2 & (~i3));
    }

    public static int OooOO0O(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    public static void OooOO0o(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    @Override // oO0oOoOo.InterfaceC34201OooO0Oo
    public final String OooO0O0() {
        return "MD5";
    }

    @Override // oO0oOoOo.InterfaceC34201OooO0Oo
    public final int OooO0OO() {
        return 16;
    }

    @Override // oO0oOoo0.AbstractC34208OooO00o
    public final void OooO0o(long j) {
        if (this.f122891OooO > 14) {
            OooO0o0();
        }
        int[] iArr = this.f122896OooO0oo;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // oO0oOoo0.AbstractC34208OooO00o
    public final void OooO0o0() {
        int i = this.f122892OooO0Oo;
        int i2 = this.f122894OooO0o0;
        int i3 = this.f122893OooO0o;
        int i4 = this.f122895OooO0oO;
        int iOooO = OooO(i2, i3, i4) + i;
        int[] iArr = this.f122896OooO0oo;
        int iOooO00o = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(iOooO, iArr[0], -680876936, 7, i2);
        int iOooO00o2 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(OooO(iOooO00o, i2, i3) + i4, iArr[1], -389564586, 12, iOooO00o);
        int iOooO00o3 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(OooO(iOooO00o2, iOooO00o, i2) + i3, iArr[2], 606105819, 17, iOooO00o2);
        int iOooO00o4 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(OooO(iOooO00o3, iOooO00o2, iOooO00o) + i2, iArr[3], -1044525330, 22, iOooO00o3);
        int iOooO00o5 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(OooO(iOooO00o4, iOooO00o3, iOooO00o2) + iOooO00o, iArr[4], -176418897, 7, iOooO00o4);
        int iOooO00o6 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(OooO(iOooO00o5, iOooO00o4, iOooO00o3) + iOooO00o2, iArr[5], 1200080426, 12, iOooO00o5);
        int iOooO00o7 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(OooO(iOooO00o6, iOooO00o5, iOooO00o4) + iOooO00o3, iArr[6], -1473231341, 17, iOooO00o6);
        int iOooO00o8 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(OooO(iOooO00o7, iOooO00o6, iOooO00o5) + iOooO00o4, iArr[7], -45705983, 22, iOooO00o7);
        int iOooO00o9 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(OooO(iOooO00o8, iOooO00o7, iOooO00o6) + iOooO00o5, iArr[8], 1770035416, 7, iOooO00o8);
        int iOooO00o10 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(OooO(iOooO00o9, iOooO00o8, iOooO00o7) + iOooO00o6, iArr[9], -1958414417, 12, iOooO00o9);
        int iOooO00o11 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(OooO(iOooO00o10, iOooO00o9, iOooO00o8) + iOooO00o7, iArr[10], -42063, 17, iOooO00o10);
        int iOooO00o12 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(OooO(iOooO00o11, iOooO00o10, iOooO00o9) + iOooO00o8, iArr[11], -1990404162, 22, iOooO00o11);
        int iOooO00o13 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(OooO(iOooO00o12, iOooO00o11, iOooO00o10) + iOooO00o9, iArr[12], 1804603682, 7, iOooO00o12);
        int iOooO00o14 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(OooO(iOooO00o13, iOooO00o12, iOooO00o11) + iOooO00o10, iArr[13], -40341101, 12, iOooO00o13);
        int iOooO00o15 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(OooO(iOooO00o14, iOooO00o13, iOooO00o12) + iOooO00o11, iArr[14], -1502002290, 17, iOooO00o14);
        int iOooO00o16 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(OooO(iOooO00o15, iOooO00o14, iOooO00o13) + iOooO00o12, iArr[15], 1236535329, 22, iOooO00o15);
        int iOooO00o17 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(OooOO0(iOooO00o16, iOooO00o15, iOooO00o14) + iOooO00o13, iArr[1], -165796510, 5, iOooO00o16);
        int iOooO00o18 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(OooOO0(iOooO00o17, iOooO00o16, iOooO00o15) + iOooO00o14, iArr[6], -1069501632, 9, iOooO00o17);
        int iOooO00o19 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(OooOO0(iOooO00o18, iOooO00o17, iOooO00o16) + iOooO00o15, iArr[11], 643717713, 14, iOooO00o18);
        int iOooO00o20 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(OooOO0(iOooO00o19, iOooO00o18, iOooO00o17) + iOooO00o16, iArr[0], -373897302, 20, iOooO00o19);
        int iOooO00o21 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(OooOO0(iOooO00o20, iOooO00o19, iOooO00o18) + iOooO00o17, iArr[5], -701558691, 5, iOooO00o20);
        int iOooO00o22 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(OooOO0(iOooO00o21, iOooO00o20, iOooO00o19) + iOooO00o18, iArr[10], 38016083, 9, iOooO00o21);
        int iOooO00o23 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(OooOO0(iOooO00o22, iOooO00o21, iOooO00o20) + iOooO00o19, iArr[15], -660478335, 14, iOooO00o22);
        int iOooO00o24 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(OooOO0(iOooO00o23, iOooO00o22, iOooO00o21) + iOooO00o20, iArr[4], -405537848, 20, iOooO00o23);
        int iOooO00o25 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(OooOO0(iOooO00o24, iOooO00o23, iOooO00o22) + iOooO00o21, iArr[9], 568446438, 5, iOooO00o24);
        int iOooO00o26 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(OooOO0(iOooO00o25, iOooO00o24, iOooO00o23) + iOooO00o22, iArr[14], -1019803690, 9, iOooO00o25);
        int iOooO00o27 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(OooOO0(iOooO00o26, iOooO00o25, iOooO00o24) + iOooO00o23, iArr[3], -187363961, 14, iOooO00o26);
        int iOooO00o28 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(OooOO0(iOooO00o27, iOooO00o26, iOooO00o25) + iOooO00o24, iArr[8], 1163531501, 20, iOooO00o27);
        int iOooO00o29 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(OooOO0(iOooO00o28, iOooO00o27, iOooO00o26) + iOooO00o25, iArr[13], -1444681467, 5, iOooO00o28);
        int iOooO00o30 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(OooOO0(iOooO00o29, iOooO00o28, iOooO00o27) + iOooO00o26, iArr[2], -51403784, 9, iOooO00o29);
        int iOooO00o31 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(OooOO0(iOooO00o30, iOooO00o29, iOooO00o28) + iOooO00o27, iArr[7], 1735328473, 14, iOooO00o30);
        int iOooO00o32 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(OooOO0(iOooO00o31, iOooO00o30, iOooO00o29) + iOooO00o28, iArr[12], -1926607734, 20, iOooO00o31);
        int iOooO00o33 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(iOooO00o29 + ((iOooO00o32 ^ iOooO00o31) ^ iOooO00o30), iArr[5], -378558, 4, iOooO00o32);
        int iOooO00o34 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(iOooO00o30 + ((iOooO00o33 ^ iOooO00o32) ^ iOooO00o31), iArr[8], -2022574463, 11, iOooO00o33);
        int iOooO00o35 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(iOooO00o31 + ((iOooO00o34 ^ iOooO00o33) ^ iOooO00o32), iArr[11], 1839030562, 16, iOooO00o34);
        int iOooO00o36 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(iOooO00o32 + ((iOooO00o35 ^ iOooO00o34) ^ iOooO00o33), iArr[14], -35309556, 23, iOooO00o35);
        int iOooO00o37 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(iOooO00o33 + ((iOooO00o36 ^ iOooO00o35) ^ iOooO00o34), iArr[1], -1530992060, 4, iOooO00o36);
        int iOooO00o38 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(iOooO00o34 + ((iOooO00o37 ^ iOooO00o36) ^ iOooO00o35), iArr[4], 1272893353, 11, iOooO00o37);
        int iOooO00o39 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(iOooO00o35 + ((iOooO00o38 ^ iOooO00o37) ^ iOooO00o36), iArr[7], -155497632, 16, iOooO00o38);
        int iOooO00o40 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(iOooO00o36 + ((iOooO00o39 ^ iOooO00o38) ^ iOooO00o37), iArr[10], -1094730640, 23, iOooO00o39);
        int iOooO00o41 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(iOooO00o37 + ((iOooO00o40 ^ iOooO00o39) ^ iOooO00o38), iArr[13], 681279174, 4, iOooO00o40);
        int iOooO00o42 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(iOooO00o38 + ((iOooO00o41 ^ iOooO00o40) ^ iOooO00o39), iArr[0], -358537222, 11, iOooO00o41);
        int iOooO00o43 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(iOooO00o39 + ((iOooO00o42 ^ iOooO00o41) ^ iOooO00o40), iArr[3], -722521979, 16, iOooO00o42);
        int iOooOO0O = OooOO0O(iOooO00o40 + ((iOooO00o43 ^ iOooO00o42) ^ iOooO00o41) + iArr[6] + 76029189, 23) + iOooO00o43;
        int iOooO00o44 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(iOooO00o41 + ((iOooOO0O ^ iOooO00o43) ^ iOooO00o42), iArr[9], -640364487, 4, iOooOO0O);
        int iOooO00o45 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(iOooO00o42 + ((iOooO00o44 ^ iOooOO0O) ^ iOooO00o43), iArr[12], -421815835, 11, iOooO00o44);
        int iOooO00o46 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(iOooO00o43 + ((iOooO00o45 ^ iOooO00o44) ^ iOooOO0O), iArr[15], 530742520, 16, iOooO00o45);
        int iOooO00o47 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(iOooOO0O + ((iOooO00o46 ^ iOooO00o45) ^ iOooO00o44), iArr[2], -995338651, 23, iOooO00o46);
        int iOooO00o48 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(iOooO00o44 + (((~iOooO00o45) | iOooO00o47) ^ iOooO00o46), iArr[0], -198630844, 6, iOooO00o47);
        int iOooO00o49 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(iOooO00o45 + (((~iOooO00o46) | iOooO00o48) ^ iOooO00o47), iArr[7], 1126891415, 10, iOooO00o48);
        int iOooO00o50 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(iOooO00o46 + (((~iOooO00o47) | iOooO00o49) ^ iOooO00o48), iArr[14], -1416354905, 15, iOooO00o49);
        int iOooO00o51 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(iOooO00o47 + (((~iOooO00o48) | iOooO00o50) ^ iOooO00o49), iArr[5], -57434055, 21, iOooO00o50);
        int iOooO00o52 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(iOooO00o48 + (((~iOooO00o49) | iOooO00o51) ^ iOooO00o50), iArr[12], 1700485571, 6, iOooO00o51);
        int iOooO00o53 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(iOooO00o49 + (((~iOooO00o50) | iOooO00o52) ^ iOooO00o51), iArr[3], -1894986606, 10, iOooO00o52);
        int iOooOO0O2 = OooOO0O(((iOooO00o50 + (((~iOooO00o51) | iOooO00o53) ^ iOooO00o52)) + iArr[10]) - 1051523, 15) + iOooO00o53;
        int iOooO00o54 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(iOooO00o51 + (((~iOooO00o52) | iOooOO0O2) ^ iOooO00o53), iArr[1], -2054922799, 21, iOooOO0O2);
        int iOooO00o55 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(iOooO00o52 + (((~iOooO00o53) | iOooO00o54) ^ iOooOO0O2), iArr[8], 1873313359, 6, iOooO00o54);
        int iOooO00o56 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(iOooO00o53 + (((~iOooOO0O2) | iOooO00o55) ^ iOooO00o54), iArr[15], -30611744, 10, iOooO00o55);
        int iOooO00o57 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(iOooOO0O2 + (((~iOooO00o54) | iOooO00o56) ^ iOooO00o55), iArr[6], -1560198380, 15, iOooO00o56);
        int iOooO00o58 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(iOooO00o54 + (((~iOooO00o55) | iOooO00o57) ^ iOooO00o56), iArr[13], 1309151649, 21, iOooO00o57);
        int iOooO00o59 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(iOooO00o55 + (((~iOooO00o56) | iOooO00o58) ^ iOooO00o57), iArr[4], -145523070, 6, iOooO00o58);
        int iOooO00o60 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(iOooO00o56 + (((~iOooO00o57) | iOooO00o59) ^ iOooO00o58), iArr[11], -1120210379, 10, iOooO00o59);
        int iOooO00o61 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(iOooO00o57 + (((~iOooO00o58) | iOooO00o60) ^ iOooO00o59), iArr[2], 718787259, 15, iOooO00o60);
        int iOooO00o62 = com.aspose.slides.internal.p332p7.OooO0OO.OooO00o(iOooO00o58 + (((~iOooO00o59) | iOooO00o61) ^ iOooO00o60), iArr[9], -343485551, 21, iOooO00o61);
        this.f122892OooO0Oo += iOooO00o59;
        this.f122894OooO0o0 += iOooO00o62;
        this.f122893OooO0o += iOooO00o61;
        this.f122895OooO0oO += iOooO00o60;
        this.f122891OooO = 0;
        for (int i5 = 0; i5 != iArr.length; i5++) {
            iArr[i5] = 0;
        }
    }

    @Override // oO0oOoo0.AbstractC34208OooO00o
    public final void OooO0oO(int i, byte[] bArr) {
        int i2 = this.f122891OooO;
        int i3 = i2 + 1;
        this.f122891OooO = i3;
        this.f122896OooO0oo[i2] = ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        if (i3 == 16) {
            OooO0o0();
        }
    }

    @Override // oO0oOoo0.AbstractC34208OooO00o
    public final void OooO0oo() {
        super.OooO0oo();
        this.f122892OooO0Oo = 1732584193;
        this.f122894OooO0o0 = -271733879;
        this.f122893OooO0o = -1732584194;
        this.f122895OooO0oO = 271733878;
        this.f122891OooO = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f122896OooO0oo;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // oO0oOoOo.InterfaceC34201OooO0Oo
    public final int doFinal(byte[] bArr, int i) {
        OooO0Oo();
        OooOO0o(this.f122892OooO0Oo, i, bArr);
        OooOO0o(this.f122894OooO0o0, i + 4, bArr);
        OooOO0o(this.f122893OooO0o, i + 8, bArr);
        OooOO0o(this.f122895OooO0oO, i + 12, bArr);
        OooO0oo();
        return 16;
    }
}
