package oO0oOoo0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;

/* JADX INFO: renamed from: oO0oOoo0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34214OooO0oO extends AbstractC34208OooO00o {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final int[] f122915OooOOO = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f122916OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f122917OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f122918OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f122919OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f122920OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f122921OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f122922OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f122923OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int[] f122924OooOO0o = new int[64];

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f122925OooOOO0;

    public C34214OooO0oO() {
        OooO0oo();
    }

    public static int OooO(int i, int i2, int i3) {
        return ((~i) & i3) ^ (i2 & i);
    }

    public static int OooOO0(int i, int i2, int i3) {
        return ((i ^ i2) & i3) | (i & i2);
    }

    public static int OooOO0O(int i) {
        return ((i << 10) | (i >>> 22)) ^ (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19)));
    }

    public static int OooOO0o(int i) {
        return ((i << 7) | (i >>> 25)) ^ (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21)));
    }

    @Override // oO0oOoOo.InterfaceC34201OooO0Oo
    public final String OooO0O0() {
        return KeyUtil.HMAC_KEY_HASH_ALGORITHM;
    }

    @Override // oO0oOoOo.InterfaceC34201OooO0Oo
    public final int OooO0OO() {
        return 32;
    }

    @Override // oO0oOoo0.AbstractC34208OooO00o
    public final void OooO0o(long j) {
        if (this.f122925OooOOO0 > 14) {
            OooO0o0();
        }
        int[] iArr = this.f122924OooOO0o;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // oO0oOoo0.AbstractC34208OooO00o
    public final void OooO0o0() {
        int[] iArr;
        int i = 16;
        while (true) {
            iArr = this.f122924OooOO0o;
            if (i > 63) {
                break;
            }
            int i2 = iArr[i - 2];
            int i3 = ((i2 >>> 10) ^ (((i2 >>> 17) | (i2 << 15)) ^ ((i2 >>> 19) | (i2 << 13)))) + iArr[i - 7];
            int i4 = iArr[i - 15];
            iArr[i] = i3 + ((i4 >>> 3) ^ (((i4 >>> 7) | (i4 << 25)) ^ ((i4 >>> 18) | (i4 << 14)))) + iArr[i - 16];
            i++;
        }
        int iOooOO0 = this.f122917OooO0Oo;
        int iOooOO02 = this.f122919OooO0o0;
        int iOooOO03 = this.f122918OooO0o;
        int iOooOO04 = this.f122920OooO0oO;
        int i5 = this.f122921OooO0oo;
        int i6 = this.f122916OooO;
        int i7 = this.f122922OooOO0;
        int i8 = this.f122923OooOO0O;
        int i9 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            int iOooO = OooO(i5, i6, i7) + OooOO0o(i5);
            int[] iArr2 = f122915OooOOO;
            int i11 = iOooO + iArr2[i9] + iArr[i9] + i8;
            int i12 = iOooOO04 + i11;
            int iOooOO05 = OooOO0(iOooOO0, iOooOO02, iOooOO03) + OooOO0O(iOooOO0) + i11;
            int i13 = i9 + 1;
            int iOooO2 = OooO(i12, i5, i6) + OooOO0o(i12) + iArr2[i13] + iArr[i13] + i7;
            int i14 = iOooOO03 + iOooO2;
            int iOooOO06 = OooOO0(iOooOO05, iOooOO0, iOooOO02) + OooOO0O(iOooOO05) + iOooO2;
            int i15 = i9 + 2;
            int iOooO3 = OooO(i14, i12, i5) + OooOO0o(i14) + iArr2[i15] + iArr[i15] + i6;
            int i16 = iOooOO02 + iOooO3;
            int iOooOO07 = OooOO0(iOooOO06, iOooOO05, iOooOO0) + OooOO0O(iOooOO06) + iOooO3;
            int i17 = i9 + 3;
            int iOooO4 = OooO(i16, i14, i12) + OooOO0o(i16) + iArr2[i17] + iArr[i17] + i5;
            int i18 = iOooOO0 + iOooO4;
            int iOooOO08 = OooOO0(iOooOO07, iOooOO06, iOooOO05) + OooOO0O(iOooOO07) + iOooO4;
            int i19 = i9 + 4;
            int iOooO5 = OooO(i18, i16, i14) + OooOO0o(i18) + iArr2[i19] + iArr[i19] + i12;
            i8 = iOooOO05 + iOooO5;
            iOooOO04 = OooOO0(iOooOO08, iOooOO07, iOooOO06) + OooOO0O(iOooOO08) + iOooO5;
            int i20 = i9 + 5;
            int iOooO6 = OooO(i8, i18, i16) + OooOO0o(i8) + iArr2[i20] + iArr[i20] + i14;
            i7 = iOooOO06 + iOooO6;
            iOooOO03 = OooOO0(iOooOO04, iOooOO08, iOooOO07) + OooOO0O(iOooOO04) + iOooO6;
            int i21 = i9 + 6;
            int iOooO7 = OooO(i7, i8, i18) + OooOO0o(i7) + iArr2[i21] + iArr[i21] + i16;
            i6 = iOooOO07 + iOooO7;
            iOooOO02 = OooOO0(iOooOO03, iOooOO04, iOooOO08) + OooOO0O(iOooOO03) + iOooO7;
            int i22 = i9 + 7;
            int iOooO8 = OooO(i6, i7, i8) + OooOO0o(i6) + iArr2[i22] + iArr[i22] + i18;
            i5 = iOooOO08 + iOooO8;
            iOooOO0 = OooOO0(iOooOO02, iOooOO03, iOooOO04) + OooOO0O(iOooOO02) + iOooO8;
            i9 += 8;
        }
        this.f122917OooO0Oo += iOooOO0;
        this.f122919OooO0o0 += iOooOO02;
        this.f122918OooO0o += iOooOO03;
        this.f122920OooO0oO += iOooOO04;
        this.f122921OooO0oo += i5;
        this.f122916OooO += i6;
        this.f122922OooOO0 += i7;
        this.f122923OooOO0O += i8;
        this.f122925OooOOO0 = 0;
        for (int i23 = 0; i23 < 16; i23++) {
            iArr[i23] = 0;
        }
    }

    @Override // oO0oOoo0.AbstractC34208OooO00o
    public final void OooO0oO(int i, byte[] bArr) {
        int i2 = (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        int i3 = this.f122925OooOOO0;
        this.f122924OooOO0o[i3] = i2;
        int i4 = i3 + 1;
        this.f122925OooOOO0 = i4;
        if (i4 == 16) {
            OooO0o0();
        }
    }

    @Override // oO0oOoo0.AbstractC34208OooO00o
    public final void OooO0oo() {
        super.OooO0oo();
        this.f122917OooO0Oo = 1779033703;
        this.f122919OooO0o0 = -1150833019;
        this.f122918OooO0o = 1013904242;
        this.f122920OooO0oO = -1521486534;
        this.f122921OooO0oo = 1359893119;
        this.f122916OooO = -1694144372;
        this.f122922OooOO0 = 528734635;
        this.f122923OooOO0O = 1541459225;
        this.f122925OooOOO0 = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f122924OooOO0o;
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
        AbstractC20449OooO0Oo.OooOoo(this.f122917OooO0Oo, i, bArr);
        AbstractC20449OooO0Oo.OooOoo(this.f122919OooO0o0, i + 4, bArr);
        AbstractC20449OooO0Oo.OooOoo(this.f122918OooO0o, i + 8, bArr);
        AbstractC20449OooO0Oo.OooOoo(this.f122920OooO0oO, i + 12, bArr);
        AbstractC20449OooO0Oo.OooOoo(this.f122921OooO0oo, i + 16, bArr);
        AbstractC20449OooO0Oo.OooOoo(this.f122916OooO, i + 20, bArr);
        AbstractC20449OooO0Oo.OooOoo(this.f122922OooOO0, i + 24, bArr);
        AbstractC20449OooO0Oo.OooOoo(this.f122923OooOO0O, i + 28, bArr);
        OooO0oo();
        return 32;
    }
}
