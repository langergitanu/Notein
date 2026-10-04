package o0ooO0o0;

import OooO0O0.C20395OooO0o0;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;

/* JADX INFO: renamed from: o0ooO0o0.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31479OooOOo {

    /* JADX INFO: renamed from: o0ooO0o0.OooOOo$OooO00o */
    public static final class OooO00o extends FilterOutputStream {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final int f112598OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f112599OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final int f112600OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final int f112601OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final int f112602OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public byte[] f112603OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final boolean f112604OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public byte[] f112605OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public int f112606OooOooo;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public boolean f112607Oooo000;

        public OooO00o(OutputStream outputStream, int i, int i2, int i3, int i4) {
            super(outputStream);
            this.f112606OooOooo = 0;
            this.f112607Oooo000 = false;
            this.f112599OooOo0o = i;
            this.f112598OooOo = i2;
            this.f112601OooOoO0 = i3;
            this.f112600OooOoO = i4;
            int i5 = (((i2 * i3) * i4) + 7) / 8;
            this.f112602OooOoOO = i5;
            this.f112604OooOoo0 = i >= 10;
            this.f112603OooOoo = new byte[i5];
            this.f112605OooOooO = new byte[i5];
        }

        public final void OooO00o() throws IOException {
            int i = this.f112599OooOo0o;
            byte[] bArr = this.f112603OooOoo;
            byte[] bArr2 = this.f112605OooOooO;
            if (i != 1) {
                int i2 = this.f112598OooOo;
                int i3 = this.f112601OooOoO0;
                int iOooO0O0 = C20395OooO0o0.OooO0O0(i2, i3, 7, 8);
                int length = bArr.length;
                if (i != 2) {
                    switch (i) {
                        case 11:
                            for (int i4 = iOooO0O0; i4 < length; i4++) {
                                bArr[i4] = (byte) (bArr[i4] + bArr[i4 - iOooO0O0]);
                            }
                            break;
                        case 12:
                            for (int i5 = 0; i5 < length; i5++) {
                                bArr[i5] = (byte) (((bArr[i5] & 255) + (bArr2[i5] & 255)) & 255);
                            }
                            break;
                        case 13:
                            for (int i6 = 0; i6 < length; i6++) {
                                int i7 = i6 - iOooO0O0;
                                bArr[i6] = (byte) (((((i7 >= 0 ? bArr[i7] & 255 : 0) + (bArr2[i6] & 255)) / 2) + (bArr[i6] & 255)) & 255);
                            }
                            break;
                        case 14:
                            for (int i8 = 0; i8 < length; i8++) {
                                int i9 = bArr[i8] & 255;
                                int i10 = i8 - iOooO0O0;
                                int i11 = i10 >= 0 ? bArr[i10] & 255 : 0;
                                int i12 = bArr2[i8] & 255;
                                int i13 = i10 >= 0 ? bArr2[i10] & 255 : 0;
                                int i14 = (i11 + i12) - i13;
                                int iAbs = Math.abs(i14 - i11);
                                int iAbs2 = Math.abs(i14 - i12);
                                int iAbs3 = Math.abs(i14 - i13);
                                if (iAbs <= iAbs2 && iAbs <= iAbs3) {
                                    bArr[i8] = (byte) ((i9 + i11) & 255);
                                } else if (iAbs2 <= iAbs3) {
                                    bArr[i8] = (byte) ((i9 + i12) & 255);
                                } else {
                                    bArr[i8] = (byte) ((i9 + i13) & 255);
                                }
                            }
                            break;
                    }
                } else if (i3 == 8) {
                    for (int i15 = iOooO0O0; i15 < length; i15++) {
                        bArr[i15] = (byte) ((bArr[i15] & 255) + (bArr[i15 - iOooO0O0] & 255));
                    }
                } else if (i3 == 16) {
                    for (int i16 = iOooO0O0; i16 < length; i16 += 2) {
                        int i17 = i16 + 1;
                        int i18 = i16 - iOooO0O0;
                        int i19 = ((bArr[i18] & 255) << 8) + (bArr[i18 + 1] & 255) + ((bArr[i16] & 255) << 8) + (bArr[i17] & 255);
                        bArr[i16] = (byte) ((i19 >> 8) & 255);
                        bArr[i17] = (byte) (i19 & 255);
                    }
                } else if (i3 == 1 && i2 == 1) {
                    for (int i20 = 0; i20 < length; i20++) {
                        int i21 = 7;
                        while (i21 >= 0) {
                            int i22 = bArr[i20];
                            int i23 = (i22 >> i21) & 1;
                            if (i20 != 0 || i21 != 7) {
                                if (((i23 + ((i21 == 7 ? bArr[i20 - 1] : i22 >> (i21 + 1)) & 1)) & 1) == 0) {
                                    bArr[i20] = (byte) (i22 & (~(1 << i21)));
                                } else {
                                    bArr[i20] = (byte) (i22 | (1 << i21));
                                }
                            }
                            i21--;
                        }
                    }
                } else {
                    int i24 = this.f112600OooOoO * i2;
                    for (int i25 = i2; i25 < i24; i25++) {
                        int i26 = i25 * i3;
                        int i27 = i26 / 8;
                        int i28 = (8 - (i26 % 8)) - i3;
                        int i29 = (i25 - i2) * i3;
                        int i30 = bArr[i27];
                        int i31 = (1 << i3) - 1;
                        bArr[i27] = (byte) ((((((i30 >>> i28) & i31) + ((bArr[i29 / 8] >>> ((8 - (i29 % 8)) - i3)) & i31)) & i31) << i28) | ((~(i31 << i28)) & i30));
                    }
                }
            }
            ((FilterOutputStream) this).out.write(this.f112603OooOoo);
            byte[] bArr3 = this.f112605OooOooO;
            this.f112605OooOooO = this.f112603OooOoo;
            this.f112603OooOoo = bArr3;
            this.f112606OooOooo = 0;
            this.f112607Oooo000 = false;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
        public final void flush() throws IOException {
            int i = this.f112606OooOooo;
            if (i > 0) {
                Arrays.fill(this.f112603OooOoo, i, this.f112602OooOoOO, (byte) 0);
                OooO00o();
            }
            super.flush();
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            write(bArr, 0, bArr.length);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) throws IOException {
            int i3 = i2 + i;
            while (i < i3) {
                if (this.f112604OooOoo0 && this.f112606OooOooo == 0 && !this.f112607Oooo000) {
                    this.f112599OooOo0o = bArr[i] + 10;
                    i++;
                    this.f112607Oooo000 = true;
                } else {
                    int iMin = Math.min(this.f112602OooOoOO - this.f112606OooOooo, i3 - i);
                    System.arraycopy(bArr, i, this.f112603OooOoo, this.f112606OooOooo, iMin);
                    int i4 = this.f112606OooOooo + iMin;
                    this.f112606OooOooo = i4;
                    i += iMin;
                    if (i4 == this.f112603OooOoo.length) {
                        OooO00o();
                    }
                }
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(int i) throws IOException {
            throw new UnsupportedOperationException("Not supported");
        }
    }

    public static OutputStream OooO00o(OutputStream outputStream, C31436OooO0Oo c31436OooO0Oo) {
        int iO000O00O = c31436OooO0Oo.o000O00O(C31441OooOO0.f112380o00O0O0, null, -1);
        return iO000O00O > 1 ? new OooO00o(outputStream, iO000O00O, Math.min(c31436OooO0Oo.o000O00O(C31441OooOO0.f112428o00Oo0, null, 1), 32), c31436OooO0Oo.o000O00O(C31441OooOO0.f112261OoooOOO, null, 8), c31436OooO0Oo.o000O00O(C31441OooOO0.f112434o00o0O, null, 1)) : outputStream;
    }
}
