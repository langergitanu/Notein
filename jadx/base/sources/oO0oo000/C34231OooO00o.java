package oO0oo000;

import OooOOO0.AbstractC20449OooO0Oo;
import Oooo0oO.C21022OooO0OO;
import java.util.Arrays;
import oO0oOoOo.C34200OooO0OO;
import oO0oOoOo.C34202OooO0o;
import oO0oOoOo.C34203OooO0o0;
import oO0oOoo.C34205OooO00o;
import oO0oo00O.C34232OooO00o;
import oO0oo00O.C34233OooO0O0;
import oOO000oO.C34332OooO00o;

/* JADX INFO: renamed from: oO0oo000.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34231OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public byte[] f122946OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public C34205OooO00o f122947OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C34233OooO0O0 f122948OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public C34232OooO00o f122949OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f122950OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f122951OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f122952OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public byte[] f122953OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public byte[] f122954OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public byte[] f122955OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public byte[] f122956OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public byte[] f122957OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public byte[] f122958OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public byte[] f122959OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public byte[] f122960OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public byte[] f122961OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f122962OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public byte[] f122963OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f122964OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public long f122965OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public byte[] f122966OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public long f122967OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f122968OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public long f122969OooOo0o;

    public final void OooO00o() {
        if (this.f122952OooO0o0) {
            return;
        }
        if (!this.f122950OooO0Oo) {
            throw new IllegalStateException("GCM cipher needs to be initialised");
        }
        throw new IllegalStateException("GCM cipher cannot be reused for encryption");
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0271, code lost:
    
        if (r7 == 0) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int OooO0O0(byte[] bArr, int i) throws IllegalStateException, C34203OooO0o0 {
        long j;
        long j2;
        int i2;
        int i3;
        int i4;
        OooO00o();
        if (this.f122967OooOo00 == 0) {
            OooO0o0();
        }
        int i5 = this.f122964OooOOoo;
        if (!this.f122950OooO0Oo) {
            int i6 = this.f122951OooO0o;
            if (i5 < i6) {
                throw new C34203OooO0o0("data too short");
            }
            i5 -= i6;
            if (bArr.length - i < i5) {
                throw new C34202OooO0o("Output buffer too short");
            }
        } else if (bArr.length - i < this.f122951OooO0o + i5) {
            throw new C34202OooO0o("Output buffer too short");
        }
        int i7 = 0;
        if (i5 > 0) {
            byte[] bArr2 = this.f122957OooOO0o;
            byte[] bArr3 = new byte[16];
            OooO0Oo(bArr3);
            if (!this.f122950OooO0Oo) {
                OooO0OO(0, this.f122958OooOOO, bArr2, i5);
                int i8 = i5;
                while (true) {
                    i8--;
                    if (i8 < 0) {
                        break;
                    }
                    bArr2[i8] = (byte) (bArr2[i8] ^ bArr3[i8]);
                }
            } else {
                int i9 = i5;
                while (true) {
                    i9--;
                    if (i9 < 0) {
                        break;
                    }
                    bArr2[i9] = (byte) (bArr2[i9] ^ bArr3[i9]);
                }
                OooO0OO(0, this.f122958OooOOO, bArr2, i5);
            }
            System.arraycopy(bArr2, 0, bArr, i, i5);
            this.f122967OooOo00 += (long) i5;
        }
        long j3 = this.f122969OooOo0o;
        int i10 = this.f122968OooOo0O;
        long j4 = j3 + ((long) i10);
        this.f122969OooOo0o = j4;
        if (j4 > this.f122965OooOo) {
            if (i10 > 0) {
                OooO0OO(0, this.f122960OooOOOO, this.f122966OooOo0, i10);
            }
            if (this.f122965OooOo > 0) {
                AbstractC20449OooO0Oo.Oooo0oo(this.f122960OooOOOO, this.f122961OooOOOo);
            }
            long j5 = ((this.f122967OooOo00 * 8) + 127) >>> 7;
            byte[] bArr4 = new byte[16];
            if (this.f122949OooO0OO == null) {
                C34232OooO00o c34232OooO00o = new C34232OooO00o();
                this.f122949OooO0OO = c34232OooO00o;
                j2 = 8;
                byte[] bArr5 = this.f122955OooOO0;
                long[] jArr = new long[2];
                j = 0;
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 2; i11 < i13; i13 = 2) {
                    int i14 = i11;
                    jArr[i14] = ((((long) AbstractC20449OooO0Oo.OooO0oo(i12, bArr5)) & 4294967295L) << 32) | (((long) AbstractC20449OooO0Oo.OooO0oo(i12 + 4, bArr5)) & 4294967295L);
                    i12 += 8;
                    i11 = i14 + 1;
                    i7 = i7;
                }
                i4 = i7;
                i2 = 8;
                c34232OooO00o.f122970OooO00o = jArr;
            } else {
                i4 = 0;
                j = 0;
                j2 = 8;
                i2 = 8;
            }
            C34232OooO00o c34232OooO00o2 = this.f122949OooO0OO;
            c34232OooO00o2.getClass();
            long[] jArr2 = new long[2];
            jArr2[i4] = Long.MIN_VALUE;
            if (j5 > j) {
                long[] jArr3 = new long[2];
                long[] jArr4 = c34232OooO00o2.f122970OooO00o;
                jArr3[i4] = jArr4[i4];
                jArr3[1] = jArr4[1];
                while (true) {
                    if ((1 & j5) != j) {
                        AbstractC20449OooO0Oo.Oooo0O0(jArr2, jArr3);
                    }
                    long[] jArr5 = new long[4];
                    int i15 = i4;
                    C21022OooO0OO.OooO00o(i15, jArr5, jArr3[i4]);
                    C21022OooO0OO.OooO00o(2, jArr5, jArr3[1]);
                    long j6 = jArr5[i15];
                    long j7 = jArr5[1];
                    long j8 = jArr5[2];
                    long j9 = jArr5[3];
                    long j10 = j7 ^ (((j9 ^ (j9 >>> 1)) ^ (j9 >>> 2)) ^ (j9 >>> 7));
                    long j11 = j8 ^ (((j9 << 63) ^ (j9 << 62)) ^ (j9 << 57));
                    jArr3[0] = j6 ^ (((j11 ^ (j11 >>> 1)) ^ (j11 >>> 2)) ^ (j11 >>> 7));
                    jArr3[1] = j10 ^ (((j11 << 63) ^ (j11 << 62)) ^ (j11 << 57));
                    j5 >>>= 1;
                    if (j5 <= j) {
                        break;
                    }
                    i4 = 0;
                }
            }
            int i16 = 0;
            int i17 = 2;
            for (int i18 = 0; i18 < 2; i18++) {
                AbstractC20449OooO0Oo.Oooo0(jArr2[i18], bArr4, i16);
                i16 += 8;
            }
            byte[] bArr6 = this.f122960OooOOOO;
            long[] jArr6 = new long[2];
            int i19 = 0;
            int i20 = 0;
            while (i19 < i17) {
                jArr6[i19] = (((long) AbstractC20449OooO0Oo.OooO0oo(i20 + 4, bArr6)) & 4294967295L) | ((((long) AbstractC20449OooO0Oo.OooO0oo(i20, bArr6)) & 4294967295L) << 32);
                i20 += 8;
                i19++;
                i17 = 2;
            }
            long[] jArr7 = new long[i17];
            int i21 = 0;
            int i22 = 0;
            while (i21 < i17) {
                jArr7[i21] = ((((long) AbstractC20449OooO0Oo.OooO0oo(i22, bArr4)) & 4294967295L) << 32) | (((long) AbstractC20449OooO0Oo.OooO0oo(i22 + 4, bArr4)) & 4294967295L);
                i22 += 8;
                i21++;
                i17 = 2;
            }
            AbstractC20449OooO0Oo.Oooo0O0(jArr6, jArr7);
            int i23 = 0;
            for (int i24 = 0; i24 < 2; i24++) {
                AbstractC20449OooO0Oo.Oooo0(jArr6[i24], bArr6, i23);
                i23 += 8;
            }
            AbstractC20449OooO0Oo.Oooo0oo(this.f122958OooOOO, this.f122960OooOOOO);
            i3 = 16;
        } else {
            j = 0;
            j2 = 8;
            i2 = 8;
            i3 = 16;
        }
        byte[] bArr7 = new byte[i3];
        AbstractC20449OooO0Oo.Oooo0(this.f122969OooOo0o * j2, bArr7, 0);
        AbstractC20449OooO0Oo.Oooo0(this.f122967OooOo00 * j2, bArr7, i2);
        byte[] bArr8 = this.f122958OooOOO;
        AbstractC20449OooO0Oo.Oooo0oo(bArr8, bArr7);
        this.f122948OooO0O0.OooO00o(bArr8);
        byte[] bArr9 = new byte[16];
        byte[] bArr10 = this.f122956OooOO0O;
        C34205OooO00o c34205OooO00o = this.f122947OooO00o;
        c34205OooO00o.OooO0O0(bArr10, bArr9);
        AbstractC20449OooO0Oo.Oooo0oo(bArr9, this.f122958OooOOO);
        int i25 = this.f122951OooO0o;
        byte[] bArr11 = new byte[i25];
        this.f122959OooOOO0 = bArr11;
        System.arraycopy(bArr9, 0, bArr11, 0, i25);
        if (!this.f122950OooO0Oo) {
            int i26 = this.f122951OooO0o;
            byte[] bArr12 = new byte[i26];
            System.arraycopy(this.f122957OooOO0o, i5, bArr12, 0, i26);
            byte[] bArr13 = this.f122959OooOOO0;
            if (bArr13 != null) {
                if (bArr13 != bArr12) {
                    int length = bArr13.length < i26 ? bArr13.length : i26;
                    int length2 = bArr13.length ^ i26;
                    for (int i27 = 0; i27 != length; i27++) {
                        length2 |= bArr13[i27] ^ bArr12[i27];
                    }
                    while (length < i26) {
                        byte b = bArr12[length];
                        length2 |= b ^ (~b);
                        length++;
                    }
                }
            }
            throw new C34203OooO0o0("mac check in GCM failed");
        }
        System.arraycopy(this.f122959OooOOO0, 0, bArr, i + this.f122964OooOOoo, this.f122951OooO0o);
        i5 += this.f122951OooO0o;
        c34205OooO00o.getClass();
        this.f122958OooOOO = new byte[16];
        this.f122960OooOOOO = new byte[16];
        this.f122961OooOOOo = new byte[16];
        this.f122966OooOo0 = new byte[16];
        this.f122968OooOo0O = 0;
        long j12 = j;
        this.f122969OooOo0o = j12;
        this.f122965OooOo = j12;
        this.f122963OooOOo0 = C34332OooO00o.OooO00o(this.f122956OooOO0O);
        this.f122962OooOOo = -2;
        this.f122964OooOOoo = 0;
        this.f122967OooOo00 = j12;
        byte[] bArr14 = this.f122957OooOO0o;
        if (bArr14 != null) {
            Arrays.fill(bArr14, (byte) 0);
        }
        if (this.f122950OooO0Oo) {
            this.f122952OooO0o0 = false;
            return i5;
        }
        byte[] bArr15 = this.f122946OooO;
        if (bArr15 != null) {
            OooO0o(bArr15.length, bArr15);
        }
        return i5;
    }

    public final void OooO0OO(int i, byte[] bArr, byte[] bArr2, int i2) {
        while (true) {
            i2--;
            if (i2 < 0) {
                this.f122948OooO0O0.OooO00o(bArr);
                return;
            }
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i + i2]);
        }
    }

    public final void OooO0Oo(byte[] bArr) {
        int i = this.f122962OooOOo;
        if (i == 0) {
            throw new IllegalStateException("Attempt to process too many blocks");
        }
        this.f122962OooOOo = i - 1;
        byte[] bArr2 = this.f122963OooOOo0;
        int i2 = (bArr2[15] & 255) + 1;
        bArr2[15] = (byte) i2;
        int i3 = (i2 >>> 8) + (bArr2[14] & 255);
        bArr2[14] = (byte) i3;
        int i4 = (i3 >>> 8) + (bArr2[13] & 255);
        bArr2[13] = (byte) i4;
        bArr2[12] = (byte) ((i4 >>> 8) + (bArr2[12] & 255));
        this.f122947OooO00o.OooO0O0(bArr2, bArr);
    }

    public final void OooO0o(int i, byte[] bArr) {
        OooO00o();
        for (int i2 = 0; i2 < i; i2++) {
            byte[] bArr2 = this.f122966OooOo0;
            int i3 = this.f122968OooOo0O;
            bArr2[i3] = bArr[i2];
            int i4 = i3 + 1;
            this.f122968OooOo0O = i4;
            if (i4 == 16) {
                byte[] bArr3 = this.f122960OooOOOO;
                AbstractC20449OooO0Oo.Oooo0oo(bArr3, bArr2);
                this.f122948OooO0O0.OooO00o(bArr3);
                this.f122968OooOo0O = 0;
                this.f122969OooOo0o += 16;
            }
        }
    }

    public final void OooO0o0() {
        if (this.f122969OooOo0o > 0) {
            System.arraycopy(this.f122960OooOOOO, 0, this.f122961OooOOOo, 0, 16);
            this.f122965OooOo = this.f122969OooOo0o;
        }
        int i = this.f122968OooOo0O;
        if (i > 0) {
            OooO0OO(0, this.f122961OooOOOo, this.f122966OooOo0, i);
            this.f122965OooOo += (long) this.f122968OooOo0O;
        }
        if (this.f122965OooOo > 0) {
            System.arraycopy(this.f122961OooOOOo, 0, this.f122958OooOOO, 0, 16);
        }
    }

    public final void OooO0oO(int i, byte[] bArr, byte[] bArr2, int i2) {
        if (bArr2.length - i2 < 16) {
            throw new C34202OooO0o("Output buffer too short");
        }
        if (this.f122967OooOo00 == 0) {
            OooO0o0();
        }
        byte[] bArr3 = new byte[16];
        OooO0Oo(bArr3);
        int i3 = 0;
        if (this.f122950OooO0Oo) {
            AbstractC20449OooO0Oo.Oooo0oO(i, bArr3, bArr);
            byte[] bArr4 = this.f122958OooOOO;
            AbstractC20449OooO0Oo.Oooo0oo(bArr4, bArr3);
            this.f122948OooO0O0.OooO00o(bArr4);
            System.arraycopy(bArr3, 0, bArr2, i2, 16);
        } else {
            byte[] bArr5 = this.f122958OooOOO;
            AbstractC20449OooO0Oo.Oooo0oO(i, bArr5, bArr);
            this.f122948OooO0O0.OooO00o(bArr5);
            do {
                bArr2[i2 + i3] = (byte) (bArr3[i3] ^ bArr[i + i3]);
                int i4 = i3 + 1;
                bArr2[i2 + i4] = (byte) (bArr[i4 + i] ^ bArr3[i4]);
                int i5 = i3 + 2;
                bArr2[i2 + i5] = (byte) (bArr[i5 + i] ^ bArr3[i5]);
                int i6 = i3 + 3;
                bArr2[i2 + i6] = (byte) (bArr[i6 + i] ^ bArr3[i6]);
                i3 += 4;
            } while (i3 < 16);
        }
        this.f122967OooOo00 += 16;
    }

    public final int OooO0oo(int i, byte[] bArr, byte[] bArr2) throws C34200OooO0OO {
        int i2;
        int i3;
        OooO00o();
        if (bArr.length < i) {
            throw new C34200OooO0OO("Input buffer too short");
        }
        if (!this.f122950OooO0Oo) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                byte[] bArr3 = this.f122957OooOO0o;
                int i6 = this.f122964OooOOoo;
                bArr3[i6] = bArr[i5];
                int i7 = i6 + 1;
                this.f122964OooOOoo = i7;
                if (i7 == bArr3.length) {
                    OooO0oO(0, bArr3, bArr2, i4);
                    byte[] bArr4 = this.f122957OooOO0o;
                    System.arraycopy(bArr4, 16, bArr4, 0, this.f122951OooO0o);
                    this.f122964OooOOoo = this.f122951OooO0o;
                    i4 += 16;
                }
            }
            return i4;
        }
        if (this.f122964OooOOoo != 0) {
            i2 = 0;
            while (true) {
                if (i <= 0) {
                    i3 = 0;
                    break;
                }
                i--;
                byte[] bArr5 = this.f122957OooOO0o;
                int i8 = this.f122964OooOOoo;
                int i9 = i2 + 1;
                bArr5[i8] = bArr[i2];
                int i10 = i8 + 1;
                this.f122964OooOOoo = i10;
                if (i10 == 16) {
                    OooO0oO(0, bArr5, bArr2, 0);
                    this.f122964OooOOoo = 0;
                    i3 = 16;
                    i2 = i9;
                    break;
                }
                i2 = i9;
            }
        } else {
            i2 = 0;
            i3 = 0;
        }
        while (i >= 16) {
            OooO0oO(i2, bArr, bArr2, i3);
            i2 += 16;
            i -= 16;
            i3 += 16;
        }
        if (i > 0) {
            System.arraycopy(bArr, i2, this.f122957OooOO0o, 0, i);
            this.f122964OooOOoo = i;
        }
        return i3;
    }
}
