package com.aspose.words.internal;

import com.microsoft.identity.common.java.crypto.key.KeyUtil;

/* JADX INFO: loaded from: classes5.dex */
final class zzYZP extends zzYUA {
    static final int[] zzWbr = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* JADX INFO: renamed from: H2 */
    private int f51286H2;

    /* JADX INFO: renamed from: H3 */
    private int f51287H3;
    private int zzWbs;
    private int zzWbt;
    private int zzWbu;
    private int zzWna;
    private int[] zzWnb;
    private int zzWnc;
    private int zzWnd;
    private int zzWne;

    public zzYZP() {
        this.zzWnb = new int[64];
        reset();
    }

    private void zzZ(zzYZP zzyzp) {
        zzZ((zzYUA) zzyzp);
        this.zzWne = zzyzp.zzWne;
        this.f51286H2 = zzyzp.f51286H2;
        this.f51287H3 = zzyzp.f51287H3;
        this.zzWnd = zzyzp.zzWnd;
        this.zzWnc = zzyzp.zzWnc;
        this.zzWbu = zzyzp.zzWbu;
        this.zzWbt = zzyzp.zzWbt;
        this.zzWbs = zzyzp.zzWbs;
        int[] iArr = zzyzp.zzWnb;
        System.arraycopy(iArr, 0, this.zzWnb, 0, iArr.length);
        this.zzWna = zzyzp.zzWna;
    }

    private static int zzZK(int i, int i2, int i3) {
        return ((i & i3) ^ (i & i2)) ^ (i2 & i3);
    }

    private static int zzZL(int i, int i2, int i3) {
        return ((~i) & i3) ^ (i2 & i);
    }

    private static int zzfA(int i) {
        return (i >>> 10) ^ (((i >>> 17) | (i << 15)) ^ ((i >>> 19) | (i << 13)));
    }

    private static int zzfB(int i) {
        return (i >>> 3) ^ (((i >>> 7) | (i << 25)) ^ ((i >>> 18) | (i << 14)));
    }

    private static int zzfC(int i) {
        return ((i << 7) | (i >>> 25)) ^ (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21)));
    }

    private static int zzfD(int i) {
        return ((i << 10) | (i >>> 22)) ^ (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19)));
    }

    @Override // com.aspose.words.internal.zzYUX
    public final int doFinal(byte[] bArr, int i) {
        finish();
        zzYGN.zzN(this.zzWne, bArr, i);
        zzYGN.zzN(this.f51286H2, bArr, i + 4);
        zzYGN.zzN(this.f51287H3, bArr, i + 8);
        zzYGN.zzN(this.zzWnd, bArr, i + 12);
        zzYGN.zzN(this.zzWnc, bArr, i + 16);
        zzYGN.zzN(this.zzWbu, bArr, i + 20);
        zzYGN.zzN(this.zzWbt, bArr, i + 24);
        zzYGN.zzN(this.zzWbs, bArr, i + 28);
        reset();
        return 32;
    }

    @Override // com.aspose.words.internal.zzYUA, com.aspose.words.internal.zzYUX
    public final void reset() {
        super.reset();
        this.zzWne = 1779033703;
        this.f51286H2 = -1150833019;
        this.f51287H3 = 1013904242;
        this.zzWnd = -1521486534;
        this.zzWnc = 1359893119;
        this.zzWbu = -1694144372;
        this.zzWbt = 528734635;
        this.zzWbs = 1541459225;
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
        return 32;
    }

    @Override // com.aspose.words.internal.zzYUA
    public final void zzX8(long j) {
        if (this.zzWna > 14) {
            zzXHo();
        }
        int[] iArr = this.zzWnb;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // com.aspose.words.internal.zzYGP
    public final zzYGP zzXE2() {
        return new zzYZP(this);
    }

    @Override // com.aspose.words.internal.zzYUX
    public final String zzXGi() {
        return KeyUtil.HMAC_KEY_HASH_ALGORITHM;
    }

    @Override // com.aspose.words.internal.zzYUA
    public final void zzXHo() {
        for (int i = 16; i <= 63; i++) {
            int[] iArr = this.zzWnb;
            int iZzfA = zzfA(iArr[i - 2]);
            int[] iArr2 = this.zzWnb;
            iArr[i] = iZzfA + iArr2[i - 7] + zzfB(iArr2[i - 15]) + this.zzWnb[i - 16];
        }
        int iZzfD = this.zzWne;
        int iZzfD2 = this.f51286H2;
        int iZzfD3 = this.f51287H3;
        int iZzfD4 = this.zzWnd;
        int i2 = this.zzWnc;
        int i3 = this.zzWbu;
        int i4 = this.zzWbt;
        int i5 = this.zzWbs;
        int i6 = 0;
        for (int i7 = 0; i7 < 8; i7++) {
            int iZzfC = zzfC(i2) + zzZL(i2, i3, i4);
            int[] iArr3 = zzWbr;
            int i8 = iZzfC + iArr3[i6] + this.zzWnb[i6] + i5;
            int i9 = iZzfD4 + i8;
            int iZzfD5 = zzfD(iZzfD) + zzZK(iZzfD, iZzfD2, iZzfD3) + i8;
            int i10 = i6 + 1;
            int iZzfC2 = zzfC(i9) + zzZL(i9, i2, i3) + iArr3[i10] + this.zzWnb[i10] + i4;
            int i11 = iZzfD3 + iZzfC2;
            int iZzfD6 = zzfD(iZzfD5) + zzZK(iZzfD5, iZzfD, iZzfD2) + iZzfC2;
            int i12 = i6 + 2;
            int iZzfC3 = zzfC(i11) + zzZL(i11, i9, i2) + iArr3[i12] + this.zzWnb[i12] + i3;
            int i13 = iZzfD2 + iZzfC3;
            int iZzfD7 = zzfD(iZzfD6) + zzZK(iZzfD6, iZzfD5, iZzfD) + iZzfC3;
            int i14 = i6 + 3;
            int iZzfC4 = zzfC(i13) + zzZL(i13, i11, i9) + iArr3[i14] + this.zzWnb[i14] + i2;
            int i15 = iZzfD + iZzfC4;
            int iZzfD8 = zzfD(iZzfD7) + zzZK(iZzfD7, iZzfD6, iZzfD5) + iZzfC4;
            int i16 = i6 + 4;
            int iZzfC5 = zzfC(i15) + zzZL(i15, i13, i11) + iArr3[i16] + this.zzWnb[i16] + i9;
            i5 = iZzfD5 + iZzfC5;
            iZzfD4 = zzfD(iZzfD8) + zzZK(iZzfD8, iZzfD7, iZzfD6) + iZzfC5;
            int i17 = i6 + 5;
            int iZzfC6 = zzfC(i5) + zzZL(i5, i15, i13) + iArr3[i17] + this.zzWnb[i17] + i11;
            i4 = iZzfD6 + iZzfC6;
            iZzfD3 = zzfD(iZzfD4) + zzZK(iZzfD4, iZzfD8, iZzfD7) + iZzfC6;
            int i18 = i6 + 6;
            int iZzfC7 = zzfC(i4) + zzZL(i4, i5, i15) + iArr3[i18] + this.zzWnb[i18] + i13;
            i3 = iZzfD7 + iZzfC7;
            iZzfD2 = zzfD(iZzfD3) + zzZK(iZzfD3, iZzfD4, iZzfD8) + iZzfC7;
            int i19 = i6 + 7;
            int iZzfC8 = zzfC(i3) + zzZL(i3, i4, i5) + iArr3[i19] + this.zzWnb[i19] + i15;
            i2 = iZzfD8 + iZzfC8;
            iZzfD = zzfD(iZzfD2) + zzZK(iZzfD2, iZzfD3, iZzfD4) + iZzfC8;
            i6 += 8;
        }
        this.zzWne += iZzfD;
        this.f51286H2 += iZzfD2;
        this.f51287H3 += iZzfD3;
        this.zzWnd += iZzfD4;
        this.zzWnc += i2;
        this.zzWbu += i3;
        this.zzWbt += i4;
        this.zzWbs += i5;
        this.zzWna = 0;
        for (int i20 = 0; i20 < 16; i20++) {
            this.zzWnb[i20] = 0;
        }
    }

    @Override // com.aspose.words.internal.zzYUA
    public final void zzk(byte[] bArr, int i) {
        int i2 = (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        int[] iArr = this.zzWnb;
        int i3 = this.zzWna;
        iArr[i3] = i2;
        int i4 = i3 + 1;
        this.zzWna = i4;
        if (i4 == 16) {
            zzXHo();
        }
    }

    public zzYZP(zzYZP zzyzp) {
        super(zzyzp);
        this.zzWnb = new int[64];
        zzZ(zzyzp);
    }

    @Override // com.aspose.words.internal.zzYGP
    public final void zzZ(zzYGP zzygp) {
        zzZ((zzYZP) zzygp);
    }
}
