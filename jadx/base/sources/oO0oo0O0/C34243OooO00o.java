package oO0oo0O0;

import com.google.common.primitives.UnsignedBytes;
import oO0oOoo.C34205OooO00o;
import oO0oo0.C34227OooO00o;
import oOO000oo.C34343OooO0o0;

/* JADX INFO: renamed from: oO0oo0O0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34243OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final byte[] f122983OooO = C34343OooO0o0.OooO0O0("000102030405060708090A0B0C0D0E0F101112131415161718191A1B1C1D1E1F");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public C34227OooO00o f122984OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C34205OooO00o f122985OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f122986OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f122987OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public byte[] f122988OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f122989OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public byte[] f122990OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f122991OooO0oo;

    public static void OooO0OO(byte[] bArr) {
        int i = 1;
        for (int i2 = 1; i2 <= bArr.length; i2++) {
            int i3 = (bArr[bArr.length - i2] & 255) + i;
            i = i3 > 255 ? 1 : 0;
            bArr[bArr.length - i2] = (byte) i3;
        }
    }

    public static void OooO0Oo(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) (i >> 16);
        bArr[i2 + 2] = (byte) (i >> 8);
        bArr[i2 + 3] = (byte) i;
    }

    public final byte[] OooO00o(int i, byte[] bArr) {
        C34205OooO00o c34205OooO00o = this.f122985OooO0O0;
        c34205OooO00o.getClass();
        int length = bArr.length;
        int i2 = i / 8;
        int i3 = ((length + 24) / 16) * 16;
        byte[] bArr2 = new byte[i3];
        OooO0Oo(length, 0, bArr2);
        OooO0Oo(i2, 4, bArr2);
        System.arraycopy(bArr, 0, bArr2, 8, length);
        bArr2[length + 8] = UnsignedBytes.MAX_POWER_OF_TWO;
        int i4 = this.f122986OooO0OO;
        int i5 = i4 / 8;
        int i6 = i5 + 16;
        byte[] bArr3 = new byte[i6];
        byte[] bArr4 = new byte[16];
        byte[] bArr5 = new byte[16];
        byte[] bArr6 = new byte[i5];
        System.arraycopy(f122983OooO, 0, bArr6, 0, i5);
        int i7 = 0;
        while (true) {
            int i8 = i7 * 16;
            if (i7 * 128 >= i4 + 128) {
                break;
            }
            OooO0Oo(i7, 0, bArr5);
            byte[] bArr7 = new byte[16];
            int i9 = i3 / 16;
            int i10 = i4;
            byte[] bArr8 = new byte[16];
            int i11 = i6;
            c34205OooO00o.OooO00o(true, new o00000O0.OooO00o(bArr6));
            c34205OooO00o.OooO0O0(bArr5, bArr7);
            int i12 = 0;
            while (i12 < i9) {
                int i13 = i12 * 16;
                int i14 = i9;
                int i15 = i12;
                for (int i16 = 0; i16 < 16; i16++) {
                    bArr8[i16] = (byte) (bArr7[i16] ^ bArr2[i16 + i13]);
                }
                c34205OooO00o.OooO0O0(bArr8, bArr7);
                i12 = i15 + 1;
                i9 = i14;
            }
            System.arraycopy(bArr7, 0, bArr4, 0, 16);
            int i17 = i11 - i8;
            if (i17 > 16) {
                i17 = 16;
            }
            System.arraycopy(bArr4, 0, bArr3, i8, i17);
            i7++;
            i4 = i10;
            i6 = i11;
        }
        byte[] bArr9 = new byte[16];
        System.arraycopy(bArr3, 0, bArr6, 0, i5);
        System.arraycopy(bArr3, i5, bArr9, 0, 16);
        byte[] bArr10 = new byte[i2];
        c34205OooO00o.OooO00o(true, new o00000O0.OooO00o(bArr6));
        int i18 = 0;
        while (true) {
            int i19 = i18 * 16;
            if (i19 >= i2) {
                return bArr10;
            }
            c34205OooO00o.OooO0O0(bArr9, bArr9);
            int i20 = i2 - i19;
            if (i20 > 16) {
                i20 = 16;
            }
            System.arraycopy(bArr9, 0, bArr10, i19, i20);
            i18++;
        }
    }

    public final void OooO0O0(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int length = bArr.length;
        byte[] bArr4 = new byte[length];
        C34205OooO00o c34205OooO00o = this.f122985OooO0O0;
        c34205OooO00o.getClass();
        byte[] bArr5 = new byte[16];
        c34205OooO00o.OooO00o(true, new o00000O0.OooO00o(bArr2));
        int i = 0;
        while (true) {
            int i2 = i * 16;
            if (i2 >= bArr.length) {
                break;
            }
            OooO0OO(bArr3);
            c34205OooO00o.OooO0O0(bArr3, bArr5);
            int i3 = length - i2;
            if (i3 > 16) {
                i3 = 16;
            }
            System.arraycopy(bArr5, 0, bArr4, i2, i3);
            i++;
        }
        for (int i4 = 0; i4 < length; i4++) {
            bArr4[i4] = (byte) (bArr[i4] ^ bArr4[i4]);
        }
        System.arraycopy(bArr4, 0, bArr2, 0, bArr2.length);
        System.arraycopy(bArr4, bArr2.length, bArr3, 0, bArr3.length);
    }

    public final byte[] OooO0o() {
        byte[] bArrOooO00o = this.f122984OooO00o.OooO00o();
        if (bArrOooO00o.length >= (this.f122989OooO0o0 + 7) / 8) {
            return bArrOooO00o;
        }
        throw new IllegalStateException("Insufficient entropy provided by entropy source");
    }

    public final int OooO0o0(byte[] bArr) {
        if (this.f122991OooO0oo > 140737488355328L) {
            return -1;
        }
        int i = C34244OooO0O0.f122992OooO00o;
        if (bArr != null && bArr.length > 32768) {
            throw new IllegalArgumentException("Number of bits per request limited to 262144");
        }
        byte[] bArr2 = new byte[this.f122987OooO0Oo / 8];
        int length = this.f122990OooO0oO.length;
        byte[] bArr3 = new byte[length];
        o00000O0.OooO00o oooO00o = new o00000O0.OooO00o(this.f122988OooO0o);
        C34205OooO00o c34205OooO00o = this.f122985OooO0O0;
        c34205OooO00o.OooO00o(true, oooO00o);
        for (int i2 = 0; i2 <= bArr.length / length; i2++) {
            int i3 = i2 * length;
            int length2 = bArr.length - i3 > length ? length : bArr.length - (this.f122990OooO0oO.length * i2);
            if (length2 != 0) {
                OooO0OO(this.f122990OooO0oO);
                c34205OooO00o.OooO0O0(this.f122990OooO0oO, bArr3);
                System.arraycopy(bArr3, 0, bArr, i3, length2);
            }
        }
        OooO0O0(bArr2, this.f122988OooO0o, this.f122990OooO0oO);
        this.f122991OooO0oo++;
        return bArr.length * 8;
    }
}
