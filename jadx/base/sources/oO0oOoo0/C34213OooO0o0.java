package oO0oOoo0;

import OooOOO0.AbstractC20449OooO0Oo;
import Oooo0oO.C21036OooOOo0;
import com.microsoft.identity.common.java.crypto.IDevicePopManager;

/* JADX INFO: renamed from: oO0oOoo0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34213OooO0o0 extends AbstractC34208OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int[] f122908OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f122909OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f122910OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f122911OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f122912OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f122913OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f122914OooOO0;

    @Override // oO0oOoOo.InterfaceC34201OooO0Oo
    public final String OooO0O0() {
        return IDevicePopManager.SHA_1;
    }

    @Override // oO0oOoOo.InterfaceC34201OooO0Oo
    public final int OooO0OO() {
        return 20;
    }

    @Override // oO0oOoo0.AbstractC34208OooO00o
    public final void OooO0o(long j) {
        if (this.f122914OooOO0 > 14) {
            OooO0o0();
        }
        int[] iArr = this.f122908OooO;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // oO0oOoo0.AbstractC34208OooO00o
    public final void OooO0o0() {
        int[] iArr;
        int i = 16;
        while (true) {
            iArr = this.f122908OooO;
            if (i >= 80) {
                break;
            }
            int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
            iArr[i] = (i2 >>> 31) | (i2 << 1);
            i++;
        }
        int iOooO00o = this.f122909OooO0Oo;
        int iOooO00o2 = this.f122911OooO0o0;
        int i3 = this.f122910OooO0o;
        int i4 = this.f122912OooO0oO;
        int i5 = this.f122913OooO0oo;
        int i6 = 0;
        for (int i7 = 0; i7 < 4; i7++) {
            int iOooO00o3 = C21036OooOOo0.OooO00o(((iOooO00o2 & i3) | ((~iOooO00o2) & i4)) + ((iOooO00o << 5) | (iOooO00o >>> 27)), iArr[i6], 1518500249, i5);
            int i8 = (iOooO00o2 >>> 2) | (iOooO00o2 << 30);
            int iOooO00o4 = C21036OooOOo0.OooO00o(((iOooO00o & i8) | ((~iOooO00o) & i3)) + ((iOooO00o3 << 5) | (iOooO00o3 >>> 27)), iArr[i6 + 1], 1518500249, i4);
            int i9 = (iOooO00o >>> 2) | (iOooO00o << 30);
            int iOooO00o5 = C21036OooOOo0.OooO00o(((iOooO00o3 & i9) | ((~iOooO00o3) & i8)) + ((iOooO00o4 << 5) | (iOooO00o4 >>> 27)), iArr[i6 + 2], 1518500249, i3);
            i5 = (iOooO00o3 >>> 2) | (iOooO00o3 << 30);
            int i10 = i6 + 4;
            iOooO00o2 = C21036OooOOo0.OooO00o(((iOooO00o4 & i5) | ((~iOooO00o4) & i9)) + ((iOooO00o5 << 5) | (iOooO00o5 >>> 27)), iArr[i6 + 3], 1518500249, i8);
            i4 = (iOooO00o4 >>> 2) | (iOooO00o4 << 30);
            i6 += 5;
            iOooO00o = C21036OooOOo0.OooO00o(((iOooO00o5 & i4) | ((~iOooO00o5) & i5)) + ((iOooO00o2 << 5) | (iOooO00o2 >>> 27)), iArr[i10], 1518500249, i9);
            i3 = (iOooO00o5 >>> 2) | (iOooO00o5 << 30);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            int iOooO00o6 = C21036OooOOo0.OooO00o(((iOooO00o << 5) | (iOooO00o >>> 27)) + ((iOooO00o2 ^ i3) ^ i4), iArr[i6], 1859775393, i5);
            int i12 = (iOooO00o2 >>> 2) | (iOooO00o2 << 30);
            int iOooO00o7 = C21036OooOOo0.OooO00o(((iOooO00o6 << 5) | (iOooO00o6 >>> 27)) + ((iOooO00o ^ i12) ^ i3), iArr[i6 + 1], 1859775393, i4);
            int i13 = (iOooO00o >>> 2) | (iOooO00o << 30);
            int iOooO00o8 = C21036OooOOo0.OooO00o(((iOooO00o7 << 5) | (iOooO00o7 >>> 27)) + ((iOooO00o6 ^ i13) ^ i12), iArr[i6 + 2], 1859775393, i3);
            i5 = (iOooO00o6 >>> 2) | (iOooO00o6 << 30);
            int i14 = i6 + 4;
            iOooO00o2 = C21036OooOOo0.OooO00o(((iOooO00o8 << 5) | (iOooO00o8 >>> 27)) + ((iOooO00o7 ^ i5) ^ i13), iArr[i6 + 3], 1859775393, i12);
            i4 = (iOooO00o7 >>> 2) | (iOooO00o7 << 30);
            i6 += 5;
            iOooO00o = C21036OooOOo0.OooO00o(((iOooO00o2 << 5) | (iOooO00o2 >>> 27)) + ((iOooO00o8 ^ i4) ^ i5), iArr[i14], 1859775393, i13);
            i3 = (iOooO00o8 >>> 2) | (iOooO00o8 << 30);
        }
        for (int i15 = 0; i15 < 4; i15++) {
            int iOooO00o9 = C21036OooOOo0.OooO00o((((i3 | i4) & iOooO00o2) | (i3 & i4)) + ((iOooO00o << 5) | (iOooO00o >>> 27)), iArr[i6], -1894007588, i5);
            int i16 = (iOooO00o2 >>> 2) | (iOooO00o2 << 30);
            int iOooO00o10 = C21036OooOOo0.OooO00o((((i16 | i3) & iOooO00o) | (i16 & i3)) + ((iOooO00o9 << 5) | (iOooO00o9 >>> 27)), iArr[i6 + 1], -1894007588, i4);
            int i17 = (iOooO00o >>> 2) | (iOooO00o << 30);
            int iOooO00o11 = C21036OooOOo0.OooO00o((((i17 | i16) & iOooO00o9) | (i17 & i16)) + ((iOooO00o10 << 5) | (iOooO00o10 >>> 27)), iArr[i6 + 2], -1894007588, i3);
            i5 = (iOooO00o9 >>> 2) | (iOooO00o9 << 30);
            int i18 = i6 + 4;
            iOooO00o2 = C21036OooOOo0.OooO00o((((i5 | i17) & iOooO00o10) | (i5 & i17)) + ((iOooO00o11 << 5) | (iOooO00o11 >>> 27)), iArr[i6 + 3], -1894007588, i16);
            i4 = (iOooO00o10 >>> 2) | (iOooO00o10 << 30);
            i6 += 5;
            iOooO00o = C21036OooOOo0.OooO00o((((i4 | i5) & iOooO00o11) | (i4 & i5)) + ((iOooO00o2 << 5) | (iOooO00o2 >>> 27)), iArr[i18], -1894007588, i17);
            i3 = (iOooO00o11 >>> 2) | (iOooO00o11 << 30);
        }
        for (int i19 = 0; i19 <= 3; i19++) {
            int iOooO00o12 = C21036OooOOo0.OooO00o(((iOooO00o << 5) | (iOooO00o >>> 27)) + ((iOooO00o2 ^ i3) ^ i4), iArr[i6], -899497514, i5);
            int i20 = (iOooO00o2 >>> 2) | (iOooO00o2 << 30);
            int iOooO00o13 = C21036OooOOo0.OooO00o(((iOooO00o12 << 5) | (iOooO00o12 >>> 27)) + ((iOooO00o ^ i20) ^ i3), iArr[i6 + 1], -899497514, i4);
            int i21 = (iOooO00o >>> 2) | (iOooO00o << 30);
            int iOooO00o14 = C21036OooOOo0.OooO00o(((iOooO00o13 << 5) | (iOooO00o13 >>> 27)) + ((iOooO00o12 ^ i21) ^ i20), iArr[i6 + 2], -899497514, i3);
            i5 = (iOooO00o12 >>> 2) | (iOooO00o12 << 30);
            int i22 = i6 + 4;
            iOooO00o2 = C21036OooOOo0.OooO00o(((iOooO00o14 << 5) | (iOooO00o14 >>> 27)) + ((iOooO00o13 ^ i5) ^ i21), iArr[i6 + 3], -899497514, i20);
            i4 = (iOooO00o13 >>> 2) | (iOooO00o13 << 30);
            i6 += 5;
            iOooO00o = C21036OooOOo0.OooO00o(((iOooO00o2 << 5) | (iOooO00o2 >>> 27)) + ((iOooO00o14 ^ i4) ^ i5), iArr[i22], -899497514, i21);
            i3 = (iOooO00o14 >>> 2) | (iOooO00o14 << 30);
        }
        this.f122909OooO0Oo += iOooO00o;
        this.f122911OooO0o0 += iOooO00o2;
        this.f122910OooO0o += i3;
        this.f122912OooO0oO += i4;
        this.f122913OooO0oo += i5;
        this.f122914OooOO0 = 0;
        for (int i23 = 0; i23 < 16; i23++) {
            iArr[i23] = 0;
        }
    }

    @Override // oO0oOoo0.AbstractC34208OooO00o
    public final void OooO0oO(int i, byte[] bArr) {
        int i2 = (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        int i3 = this.f122914OooOO0;
        this.f122908OooO[i3] = i2;
        int i4 = i3 + 1;
        this.f122914OooOO0 = i4;
        if (i4 == 16) {
            OooO0o0();
        }
    }

    @Override // oO0oOoo0.AbstractC34208OooO00o
    public final void OooO0oo() {
        super.OooO0oo();
        this.f122909OooO0Oo = 1732584193;
        this.f122911OooO0o0 = -271733879;
        this.f122910OooO0o = -1732584194;
        this.f122912OooO0oO = 271733878;
        this.f122913OooO0oo = -1009589776;
        this.f122914OooOO0 = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.f122908OooO;
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
        AbstractC20449OooO0Oo.OooOoo(this.f122909OooO0Oo, i, bArr);
        AbstractC20449OooO0Oo.OooOoo(this.f122911OooO0o0, i + 4, bArr);
        AbstractC20449OooO0Oo.OooOoo(this.f122910OooO0o, i + 8, bArr);
        AbstractC20449OooO0Oo.OooOoo(this.f122912OooO0oO, i + 12, bArr);
        AbstractC20449OooO0Oo.OooOoo(this.f122913OooO0oo, i + 16, bArr);
        OooO0oo();
        return 20;
    }
}
