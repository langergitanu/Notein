package com.aspose.words.internal;

import Oooo0oO.C21036OooOOo0;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ6Q {

    public static class zzY extends zzZ {

        /* JADX INFO: renamed from: H2 */
        private int f51308H2;

        /* JADX INFO: renamed from: H3 */
        private int f51309H3;
        private int zzWna;
        private int[] zzWnb = new int[80];
        private int zzWnc;
        private int zzWnd;
        private int zzWne;

        public zzY() {
            reset();
        }

        private static int zzZO(int i, int i2, int i3) {
            return (i & (i2 | i3)) | (i2 & i3);
        }

        private static int zzZP(int i, int i2, int i3) {
            return ((~i) & i3) | (i2 & i);
        }

        @Override // com.aspose.words.internal.zzZ6Q.zzZ
        public final void reset() {
            super.reset();
            this.zzWne = 1732584193;
            this.f51308H2 = -271733879;
            this.f51309H3 = -1732584194;
            this.zzWnd = 271733878;
            this.zzWnc = -1009589776;
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

        @Override // com.aspose.words.internal.zzZ6Q.zzZ
        public final void zzX8(long j) {
            if (this.zzWna > 14) {
                zzXHo();
            }
            int[] iArr = this.zzWnb;
            iArr[14] = (int) (j >>> 32);
            iArr[15] = (int) j;
        }

        @Override // com.aspose.words.internal.zzZ6Q.zzZ
        public final void zzXHo() {
            for (int i = 16; i < 80; i++) {
                int[] iArr = this.zzWnb;
                int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
                iArr[i] = (i2 >>> 31) | (i2 << 1);
            }
            int iOooO00o = this.zzWne;
            int iOooO00o2 = this.f51308H2;
            int i3 = this.f51309H3;
            int i4 = this.zzWnd;
            int i5 = this.zzWnc;
            int i6 = 0;
            for (int i7 = 0; i7 < 4; i7++) {
                int iOooO00o3 = C21036OooOOo0.OooO00o(((iOooO00o << 5) | (iOooO00o >>> 27)) + zzZP(iOooO00o2, i3, i4), this.zzWnb[i6], 1518500249, i5);
                int i8 = (iOooO00o2 >>> 2) | (iOooO00o2 << 30);
                int iOooO00o4 = C21036OooOOo0.OooO00o(((iOooO00o3 << 5) | (iOooO00o3 >>> 27)) + zzZP(iOooO00o, i8, i3), this.zzWnb[i6 + 1], 1518500249, i4);
                int i9 = (iOooO00o >>> 2) | (iOooO00o << 30);
                int iOooO00o5 = C21036OooOOo0.OooO00o(((iOooO00o4 << 5) | (iOooO00o4 >>> 27)) + zzZP(iOooO00o3, i9, i8), this.zzWnb[i6 + 2], 1518500249, i3);
                i5 = (iOooO00o3 >>> 2) | (iOooO00o3 << 30);
                int i10 = i6 + 4;
                iOooO00o2 = C21036OooOOo0.OooO00o(((iOooO00o5 << 5) | (iOooO00o5 >>> 27)) + zzZP(iOooO00o4, i5, i9), this.zzWnb[i6 + 3], 1518500249, i8);
                i4 = (iOooO00o4 >>> 2) | (iOooO00o4 << 30);
                i6 += 5;
                iOooO00o = C21036OooOOo0.OooO00o(((iOooO00o2 << 5) | (iOooO00o2 >>> 27)) + zzZP(iOooO00o5, i4, i5), this.zzWnb[i10], 1518500249, i9);
                i3 = (iOooO00o5 >>> 2) | (iOooO00o5 << 30);
            }
            for (int i11 = 0; i11 < 4; i11++) {
                int[] iArr2 = this.zzWnb;
                int iOooO00o6 = C21036OooOOo0.OooO00o(((iOooO00o << 5) | (iOooO00o >>> 27)) + ((iOooO00o2 ^ i3) ^ i4), iArr2[i6], 1859775393, i5);
                int i12 = (iOooO00o2 >>> 2) | (iOooO00o2 << 30);
                int iOooO00o7 = C21036OooOOo0.OooO00o(((iOooO00o6 << 5) | (iOooO00o6 >>> 27)) + ((iOooO00o ^ i12) ^ i3), iArr2[i6 + 1], 1859775393, i4);
                int i13 = (iOooO00o >>> 2) | (iOooO00o << 30);
                int iOooO00o8 = C21036OooOOo0.OooO00o(((iOooO00o7 << 5) | (iOooO00o7 >>> 27)) + ((iOooO00o6 ^ i13) ^ i12), iArr2[i6 + 2], 1859775393, i3);
                i5 = (iOooO00o6 >>> 2) | (iOooO00o6 << 30);
                int i14 = i6 + 4;
                iOooO00o2 = C21036OooOOo0.OooO00o(((iOooO00o8 << 5) | (iOooO00o8 >>> 27)) + ((iOooO00o7 ^ i5) ^ i13), iArr2[i6 + 3], 1859775393, i12);
                i4 = (iOooO00o7 >>> 2) | (iOooO00o7 << 30);
                i6 += 5;
                iOooO00o = C21036OooOOo0.OooO00o(((iOooO00o2 << 5) | (iOooO00o2 >>> 27)) + ((iOooO00o8 ^ i4) ^ i5), iArr2[i14], 1859775393, i13);
                i3 = (iOooO00o8 >>> 2) | (iOooO00o8 << 30);
            }
            for (int i15 = 0; i15 < 4; i15++) {
                int iOooO00o9 = C21036OooOOo0.OooO00o(((iOooO00o << 5) | (iOooO00o >>> 27)) + zzZO(iOooO00o2, i3, i4), this.zzWnb[i6], -1894007588, i5);
                int i16 = (iOooO00o2 >>> 2) | (iOooO00o2 << 30);
                int iOooO00o10 = C21036OooOOo0.OooO00o(((iOooO00o9 << 5) | (iOooO00o9 >>> 27)) + zzZO(iOooO00o, i16, i3), this.zzWnb[i6 + 1], -1894007588, i4);
                int i17 = (iOooO00o >>> 2) | (iOooO00o << 30);
                int iOooO00o11 = C21036OooOOo0.OooO00o(((iOooO00o10 << 5) | (iOooO00o10 >>> 27)) + zzZO(iOooO00o9, i17, i16), this.zzWnb[i6 + 2], -1894007588, i3);
                i5 = (iOooO00o9 >>> 2) | (iOooO00o9 << 30);
                int i18 = i6 + 4;
                iOooO00o2 = C21036OooOOo0.OooO00o(((iOooO00o11 << 5) | (iOooO00o11 >>> 27)) + zzZO(iOooO00o10, i5, i17), this.zzWnb[i6 + 3], -1894007588, i16);
                i4 = (iOooO00o10 >>> 2) | (iOooO00o10 << 30);
                i6 += 5;
                iOooO00o = C21036OooOOo0.OooO00o(((iOooO00o2 << 5) | (iOooO00o2 >>> 27)) + zzZO(iOooO00o11, i4, i5), this.zzWnb[i18], -1894007588, i17);
                i3 = (iOooO00o11 >>> 2) | (iOooO00o11 << 30);
            }
            for (int i19 = 0; i19 <= 3; i19++) {
                int[] iArr3 = this.zzWnb;
                int iOooO00o12 = C21036OooOOo0.OooO00o(((iOooO00o << 5) | (iOooO00o >>> 27)) + ((iOooO00o2 ^ i3) ^ i4), iArr3[i6], -899497514, i5);
                int i20 = (iOooO00o2 >>> 2) | (iOooO00o2 << 30);
                int iOooO00o13 = C21036OooOOo0.OooO00o(((iOooO00o12 << 5) | (iOooO00o12 >>> 27)) + ((iOooO00o ^ i20) ^ i3), iArr3[i6 + 1], -899497514, i4);
                int i21 = (iOooO00o >>> 2) | (iOooO00o << 30);
                int iOooO00o14 = C21036OooOOo0.OooO00o(((iOooO00o13 << 5) | (iOooO00o13 >>> 27)) + ((iOooO00o12 ^ i21) ^ i20), iArr3[i6 + 2], -899497514, i3);
                i5 = (iOooO00o12 >>> 2) | (iOooO00o12 << 30);
                int i22 = i6 + 4;
                iOooO00o2 = C21036OooOOo0.OooO00o(((iOooO00o14 << 5) | (iOooO00o14 >>> 27)) + ((iOooO00o13 ^ i5) ^ i21), iArr3[i6 + 3], -899497514, i20);
                i4 = (iOooO00o13 >>> 2) | (iOooO00o13 << 30);
                i6 += 5;
                iOooO00o = C21036OooOOo0.OooO00o(((iOooO00o2 << 5) | (iOooO00o2 >>> 27)) + ((iOooO00o14 ^ i4) ^ i5), iArr3[i22], -899497514, i21);
                i3 = (iOooO00o14 >>> 2) | (iOooO00o14 << 30);
            }
            this.zzWne += iOooO00o;
            this.f51308H2 += iOooO00o2;
            this.f51309H3 += i3;
            this.zzWnd += i4;
            this.zzWnc += i5;
            this.zzWna = 0;
            for (int i23 = 0; i23 < 16; i23++) {
                this.zzWnb[i23] = 0;
            }
        }

        @Override // com.aspose.words.internal.zzZ6Q.zzZ
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

        public final int zzo(byte[] bArr) {
            finish();
            zzYGN.zzN(this.zzWne, bArr, 0);
            zzYGN.zzN(this.f51308H2, bArr, 4);
            zzYGN.zzN(this.f51309H3, bArr, 8);
            zzYGN.zzN(this.zzWnd, bArr, 12);
            zzYGN.zzN(this.zzWnc, bArr, 16);
            reset();
            return 20;
        }
    }

    public static byte[] zzZ(zzZ7D zzz7d) {
        zzY zzy = new zzY();
        byte[] bArr = new byte[20];
        try {
            byte[] encoded = zzz7d.getEncoded("DER");
            zzy.update(encoded, 0, encoded.length);
            zzy.zzo(bArr);
            return bArr;
        } catch (IOException unused) {
            return new byte[0];
        }
    }

    public static abstract class zzZ {
        private long zzWnf;
        private byte[] zzWnh = new byte[4];
        private int zzWng = 0;

        private void update(byte b) {
            byte[] bArr = this.zzWnh;
            int i = this.zzWng;
            int i2 = i + 1;
            this.zzWng = i2;
            bArr[i] = b;
            if (i2 == bArr.length) {
                zzk(bArr, 0);
                this.zzWng = 0;
            }
            this.zzWnf++;
        }

        public final void finish() {
            long j = this.zzWnf << 3;
            update(UnsignedBytes.MAX_POWER_OF_TWO);
            while (this.zzWng != 0) {
                update((byte) 0);
            }
            zzX8(j);
            zzXHo();
        }

        public void reset() {
            this.zzWnf = 0L;
            this.zzWng = 0;
            int i = 0;
            while (true) {
                byte[] bArr = this.zzWnh;
                if (i >= bArr.length) {
                    return;
                }
                bArr[i] = 0;
                i++;
            }
        }

        public abstract void zzX8(long j);

        public abstract void zzXHo();

        public abstract void zzk(byte[] bArr, int i);

        public final void update(byte[] bArr, int i, int i2) {
            while (this.zzWng != 0 && i2 > 0) {
                update(bArr[i]);
                i++;
                i2--;
            }
            while (i2 > this.zzWnh.length) {
                zzk(bArr, i);
                byte[] bArr2 = this.zzWnh;
                i += bArr2.length;
                i2 -= bArr2.length;
                this.zzWnf += (long) bArr2.length;
            }
            while (i2 > 0) {
                update(bArr[i]);
                i++;
                i2--;
            }
        }
    }
}
