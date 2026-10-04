package oO0ooO0;

import OooOOO0.AbstractC20449OooO0Oo;
import OooOoo.C20593OooO0Oo;
import Oooo0oo.AbstractC21138OooO0oo;
import java.math.BigInteger;
import java.util.Arrays;
import oOO000oO.C34332OooO00o;
import oOO000oO.C34333OooO0O0;

/* JADX INFO: renamed from: oO0ooO0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC34264OooO0OO implements InterfaceC34261OooO00o {

    /* JADX INFO: renamed from: oO0ooO0.OooO0OO$OooO00o */
    public static abstract class OooO00o extends AbstractC34264OooO0OO {
    }

    /* JADX INFO: renamed from: oO0ooO0.OooO0OO$OooO0O0 */
    public static abstract class OooO0O0 extends AbstractC34264OooO0OO {
    }

    /* JADX INFO: renamed from: oO0ooO0.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static class C20346OooO0OO extends OooO00o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f123022OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f123023OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public C34266OooO0o0 f123024OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int[] f123025OooO0o0;

        public C20346OooO0OO(int i, int[] iArr, C34266OooO0o0 c34266OooO0o0) {
            this.f123023OooO0Oo = i;
            this.f123022OooO0OO = iArr.length == 1 ? 2 : 3;
            this.f123025OooO0o0 = iArr;
            this.f123024OooO0o = c34266OooO0o0;
        }

        @Override // oO0ooO0.AbstractC34264OooO0OO
        public final AbstractC34264OooO0OO OooO() {
            C34266OooO0o0 c34266OooO0o0 = this.f123024OooO0o;
            int iOooOO0 = c34266OooO0o0.OooOO0();
            int i = this.f123023OooO0Oo;
            int[] iArr = this.f123025OooO0o0;
            if (iOooOO0 != 0) {
                int i2 = iOooOO0 << 1;
                long[] jArr = new long[i2];
                int i3 = 0;
                while (i3 < i2) {
                    long j = c34266OooO0o0.f123036OooOo0o[i3 >>> 1];
                    int i4 = i3 + 1;
                    jArr[i3] = C34266OooO0o0.OooOO0O((int) j);
                    i3 += 2;
                    jArr[i4] = C34266OooO0o0.OooOO0O((int) (j >>> 32));
                }
                c34266OooO0o0 = new C34266OooO0o0(jArr, C34266OooO0o0.OooOO0o(jArr, i2, i, iArr));
            }
            return new C20346OooO0OO(i, iArr, c34266OooO0o0);
        }

        @Override // oO0ooO0.AbstractC34264OooO0OO
        public final AbstractC34264OooO0OO OooO00o(AbstractC34264OooO0OO abstractC34264OooO0OO) {
            C34266OooO0o0 c34266OooO0o0 = (C34266OooO0o0) this.f123024OooO0o.clone();
            C34266OooO0o0 c34266OooO0o02 = ((C20346OooO0OO) abstractC34264OooO0OO).f123024OooO0o;
            int iOooOO0 = c34266OooO0o02.OooOO0();
            if (iOooOO0 != 0) {
                long[] jArr = c34266OooO0o0.f123036OooOo0o;
                if (iOooOO0 > jArr.length) {
                    long[] jArr2 = new long[iOooOO0];
                    System.arraycopy(jArr, 0, jArr2, 0, Math.min(jArr.length, iOooOO0));
                    c34266OooO0o0.f123036OooOo0o = jArr2;
                }
                C34266OooO0o0.OooO00o(c34266OooO0o0.f123036OooOo0o, 0, c34266OooO0o02.f123036OooOo0o, 0, iOooOO0);
            }
            return new C20346OooO0OO(this.f123023OooO0Oo, this.f123025OooO0o0, c34266OooO0o0);
        }

        @Override // oO0ooO0.AbstractC34264OooO0OO
        public final int OooO0O0() {
            return this.f123024OooO0o.OooO0o0();
        }

        @Override // oO0ooO0.AbstractC34264OooO0OO
        public final AbstractC34264OooO0OO OooO0OO(AbstractC34264OooO0OO abstractC34264OooO0OO) {
            return OooO0oo(abstractC34264OooO0OO.OooO0o0());
        }

        @Override // oO0ooO0.AbstractC34264OooO0OO
        public final int OooO0Oo() {
            return this.f123023OooO0Oo;
        }

        @Override // oO0ooO0.AbstractC34264OooO0OO
        public final boolean OooO0o() {
            long[] jArr = this.f123024OooO0o.f123036OooOo0o;
            if (jArr[0] == 1) {
                for (int i = 1; i < jArr.length; i++) {
                    if (jArr[i] == 0) {
                    }
                }
                return true;
            }
            return false;
        }

        @Override // oO0ooO0.AbstractC34264OooO0OO
        public final AbstractC34264OooO0OO OooO0o0() {
            int i;
            C34266OooO0o0 c34266OooO0o0 = this.f123024OooO0o;
            int iOooO0o0 = c34266OooO0o0.OooO0o0();
            if (iOooO0o0 == 0) {
                throw new IllegalStateException();
            }
            int i2 = this.f123023OooO0Oo;
            int[] iArr = this.f123025OooO0o0;
            int i3 = 1;
            if (iOooO0o0 != 1) {
                C34266OooO0o0 c34266OooO0o02 = (C34266OooO0o0) c34266OooO0o0.clone();
                int i4 = (i2 + 63) >>> 6;
                C34266OooO0o0 c34266OooO0o03 = new C34266OooO0o0(i4);
                long[] jArr = c34266OooO0o03.f123036OooOo0o;
                C34266OooO0o0.OooO0oO(jArr, i2);
                int length = iArr.length;
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    }
                    C34266OooO0o0.OooO0oO(jArr, iArr[length]);
                }
                int iOooO0o = 0;
                C34266OooO0o0.OooO0oO(jArr, 0);
                C34266OooO0o0 c34266OooO0o04 = new C34266OooO0o0(i4);
                c34266OooO0o04.f123036OooOo0o[0] = 1;
                C34266OooO0o0 c34266OooO0o05 = new C34266OooO0o0(i4);
                int[] iArr2 = new int[2];
                iArr2[0] = iOooO0o0;
                iArr2[1] = i2 + 1;
                C34266OooO0o0[] c34266OooO0o0Arr = {c34266OooO0o02, c34266OooO0o03};
                int[] iArr3 = new int[2];
                iArr3[0] = 1;
                iArr3[1] = 0;
                C34266OooO0o0[] c34266OooO0o0Arr2 = {c34266OooO0o04, c34266OooO0o05};
                int i5 = iArr2[1];
                int i6 = i5 - iArr2[0];
                while (true) {
                    if (i6 < 0) {
                        i6 = -i6;
                        iArr2[i3] = i5;
                        iArr3[i3] = iOooO0o;
                        i3 = 1 - i3;
                        i5 = iArr2[i3];
                        iOooO0o = iArr3[i3];
                    }
                    i = 1 - i3;
                    c34266OooO0o0Arr[i3].OooO0O0(c34266OooO0o0Arr[i], iArr2[i], i6);
                    int iOooO0o2 = c34266OooO0o0Arr[i3].OooO0o(i5);
                    if (iOooO0o2 == 0) {
                        break;
                    }
                    int i7 = iArr3[i];
                    c34266OooO0o0Arr2[i3].OooO0O0(c34266OooO0o0Arr2[i], i7, i6);
                    int i8 = i7 + i6;
                    if (i8 > iOooO0o) {
                        iOooO0o = i8;
                    } else if (i8 == iOooO0o) {
                        iOooO0o = c34266OooO0o0Arr2[i3].OooO0o(iOooO0o);
                    }
                    i6 += iOooO0o2 - i5;
                    i5 = iOooO0o2;
                }
                c34266OooO0o0 = c34266OooO0o0Arr2[i];
            }
            return new C20346OooO0OO(i2, iArr, c34266OooO0o0);
        }

        @Override // oO0ooO0.AbstractC34264OooO0OO
        public final boolean OooO0oO() {
            for (long j : this.f123024OooO0o.f123036OooOo0o) {
                if (j != 0) {
                    return false;
                }
            }
            return true;
        }

        @Override // oO0ooO0.AbstractC34264OooO0OO
        public final AbstractC34264OooO0OO OooO0oo(AbstractC34264OooO0OO abstractC34264OooO0OO) {
            long[] jArr;
            int i;
            long[] jArr2;
            long[] jArr3;
            C34266OooO0o0 c34266OooO0o0 = ((C20346OooO0OO) abstractC34264OooO0OO).f123024OooO0o;
            C34266OooO0o0 c34266OooO0o02 = this.f123024OooO0o;
            int iOooO0o0 = c34266OooO0o02.OooO0o0();
            int i2 = this.f123023OooO0Oo;
            int[] iArr = this.f123025OooO0o0;
            if (iOooO0o0 != 0) {
                int iOooO0o02 = c34266OooO0o0.OooO0o0();
                if (iOooO0o02 != 0) {
                    if (iOooO0o0 > iOooO0o02) {
                        c34266OooO0o02 = c34266OooO0o0;
                        c34266OooO0o0 = c34266OooO0o02;
                        iOooO0o02 = iOooO0o0;
                        iOooO0o0 = iOooO0o02;
                    }
                    int i3 = (iOooO0o0 + 63) >>> 6;
                    int i4 = (iOooO0o02 + 63) >>> 6;
                    int i5 = ((iOooO0o0 + iOooO0o02) + 62) >>> 6;
                    if (i3 == 1) {
                        long j = c34266OooO0o02.f123036OooOo0o[0];
                        if (j != 1) {
                            long[] jArr4 = new long[i5];
                            long[] jArr5 = c34266OooO0o0.f123036OooOo0o;
                            if ((j & 1) != 0) {
                                C34266OooO0o0.OooO00o(jArr4, 0, jArr5, 0, i4);
                            }
                            int i6 = 1;
                            while (true) {
                                j >>>= 1;
                                if (j == 0) {
                                    break;
                                }
                                if ((j & 1) != 0) {
                                    jArr3 = jArr4;
                                    long jOooO0OO = C34266OooO0o0.OooO0OO(jArr3, 0, jArr5, 0, i4, i6);
                                    if (jOooO0OO != 0) {
                                        jArr3[i4] = jArr3[i4] ^ jOooO0OO;
                                    }
                                } else {
                                    jArr3 = jArr4;
                                }
                                i6++;
                                jArr4 = jArr3;
                            }
                            long[] jArr6 = jArr4;
                            c34266OooO0o02 = new C34266OooO0o0(jArr6, C34266OooO0o0.OooOO0o(jArr6, i5, i2, iArr));
                        }
                    } else {
                        int i7 = (iOooO0o02 + 70) >>> 6;
                        int[] iArr2 = new int[16];
                        int i8 = i7 << 4;
                        long[] jArr7 = new long[i8];
                        iArr2[1] = i7;
                        System.arraycopy(c34266OooO0o0.f123036OooOo0o, 0, jArr7, i7, i4);
                        int i9 = 2;
                        int i10 = i7;
                        while (i9 < 16) {
                            int i11 = i10 + i7;
                            iArr2[i9] = i11;
                            if ((i9 & 1) == 0) {
                                jArr2 = jArr7;
                                C34266OooO0o0.OooOOO0(jArr2, i11 >>> 1, jArr7, i11, i7, 1);
                            } else {
                                jArr2 = jArr7;
                                int i12 = i11 - i7;
                                for (int i13 = 0; i13 < i7; i13++) {
                                    jArr2[i11 + i13] = jArr2[i7 + i13] ^ jArr2[i12 + i13];
                                }
                            }
                            i9++;
                            jArr7 = jArr2;
                            i10 = i11;
                        }
                        long[] jArr8 = jArr7;
                        long[] jArr9 = new long[i8];
                        C34266OooO0o0.OooOOO0(jArr8, 0, jArr9, 0, i8, 4);
                        long[] jArr10 = c34266OooO0o02.f123036OooOo0o;
                        int i14 = i5 << 3;
                        long[] jArr11 = new long[i14];
                        int i15 = 0;
                        while (i15 < i3) {
                            long j2 = jArr10[i15];
                            int i16 = i15;
                            while (true) {
                                jArr = jArr10;
                                i = i14;
                                int i17 = iArr2[((int) j2) & 15];
                                int i18 = iArr2[((int) (j2 >>> 4)) & 15];
                                for (int i19 = 0; i19 < i7; i19++) {
                                    int i20 = i16 + i19;
                                    jArr11[i20] = jArr11[i20] ^ (jArr8[i17 + i19] ^ jArr9[i18 + i19]);
                                }
                                j2 >>>= 8;
                                if (j2 == 0) {
                                    break;
                                }
                                i16 += i5;
                                jArr10 = jArr;
                                i14 = i;
                            }
                            i15++;
                            jArr10 = jArr;
                            i14 = i;
                        }
                        while (true) {
                            int i21 = i14 - i5;
                            if (i21 == 0) {
                                break;
                            }
                            C34266OooO0o0.OooO0OO(jArr11, i21 - i5, jArr11, i21, i5, 8);
                            i14 = i21;
                        }
                        c34266OooO0o02 = new C34266OooO0o0(jArr11, C34266OooO0o0.OooOO0o(jArr11, i5, i2, iArr));
                    }
                    c34266OooO0o0 = c34266OooO0o02;
                }
            } else {
                c34266OooO0o0 = c34266OooO0o02;
            }
            return new C20346OooO0OO(i2, iArr, c34266OooO0o0);
        }

        @Override // oO0ooO0.AbstractC34264OooO0OO
        public final BigInteger OooOO0() {
            C34266OooO0o0 c34266OooO0o0 = this.f123024OooO0o;
            int iOooOO0 = c34266OooO0o0.OooOO0();
            if (iOooOO0 == 0) {
                return InterfaceC34261OooO00o.f123008OooO00o;
            }
            int i = iOooOO0 - 1;
            long j = c34266OooO0o0.f123036OooOo0o[i];
            byte[] bArr = new byte[8];
            int i2 = 0;
            boolean z = false;
            for (int i3 = 7; i3 >= 0; i3--) {
                byte b = (byte) (j >>> (i3 * 8));
                if (z || b != 0) {
                    bArr[i2] = b;
                    i2++;
                    z = true;
                }
            }
            byte[] bArr2 = new byte[(i * 8) + i2];
            for (int i4 = 0; i4 < i2; i4++) {
                bArr2[i4] = bArr[i4];
            }
            for (int i5 = iOooOO0 - 2; i5 >= 0; i5--) {
                long j2 = c34266OooO0o0.f123036OooOo0o[i5];
                int i6 = 7;
                while (i6 >= 0) {
                    bArr2[i2] = (byte) (j2 >>> (i6 * 8));
                    i6--;
                    i2++;
                }
            }
            return new BigInteger(1, bArr2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C20346OooO0OO)) {
                return false;
            }
            C20346OooO0OO c20346OooO0OO = (C20346OooO0OO) obj;
            return this.f123023OooO0Oo == c20346OooO0OO.f123023OooO0Oo && this.f123022OooO0OO == c20346OooO0OO.f123022OooO0OO && Arrays.equals(this.f123025OooO0o0, c20346OooO0OO.f123025OooO0o0) && this.f123024OooO0o.equals(c20346OooO0OO.f123024OooO0o);
        }

        public final int hashCode() {
            return (this.f123024OooO0o.hashCode() ^ this.f123023OooO0Oo) ^ C34332OooO00o.OooO0o(this.f123025OooO0o0);
        }
    }

    /* JADX INFO: renamed from: oO0ooO0.OooO0OO$OooO0Oo */
    public static class OooO0Oo extends OooO0O0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final BigInteger f123026OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final BigInteger f123027OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final BigInteger f123028OooO0o0;

        public OooO0Oo(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            if (bigInteger3 == null || bigInteger3.signum() < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
                throw new IllegalArgumentException("x value invalid in Fp field element");
            }
            this.f123026OooO0OO = bigInteger;
            this.f123027OooO0Oo = bigInteger2;
            this.f123028OooO0o0 = bigInteger3;
        }

        @Override // oO0ooO0.AbstractC34264OooO0OO
        public final AbstractC34264OooO0OO OooO() {
            BigInteger bigInteger = this.f123028OooO0o0;
            return new OooO0Oo(this.f123026OooO0OO, this.f123027OooO0Oo, OooOO0o(bigInteger, bigInteger));
        }

        @Override // oO0ooO0.AbstractC34264OooO0OO
        public final AbstractC34264OooO0OO OooO00o(AbstractC34264OooO0OO abstractC34264OooO0OO) {
            BigInteger bigIntegerAdd = this.f123028OooO0o0.add(abstractC34264OooO0OO.OooOO0());
            BigInteger bigInteger = this.f123026OooO0OO;
            if (bigIntegerAdd.compareTo(bigInteger) >= 0) {
                bigIntegerAdd = bigIntegerAdd.subtract(bigInteger);
            }
            return new OooO0Oo(bigInteger, this.f123027OooO0Oo, bigIntegerAdd);
        }

        @Override // oO0ooO0.AbstractC34264OooO0OO
        public final AbstractC34264OooO0OO OooO0OO(AbstractC34264OooO0OO abstractC34264OooO0OO) {
            return new OooO0Oo(this.f123026OooO0OO, this.f123027OooO0Oo, OooOO0o(this.f123028OooO0o0, OooOO0O(abstractC34264OooO0OO.OooOO0())));
        }

        @Override // oO0ooO0.AbstractC34264OooO0OO
        public final int OooO0Oo() {
            return this.f123026OooO0OO.bitLength();
        }

        @Override // oO0ooO0.AbstractC34264OooO0OO
        public final AbstractC34264OooO0OO OooO0o0() {
            return new OooO0Oo(this.f123026OooO0OO, this.f123027OooO0Oo, OooOO0O(this.f123028OooO0o0));
        }

        @Override // oO0ooO0.AbstractC34264OooO0OO
        public final AbstractC34264OooO0OO OooO0oo(AbstractC34264OooO0OO abstractC34264OooO0OO) {
            return new OooO0Oo(this.f123026OooO0OO, this.f123027OooO0Oo, OooOO0o(this.f123028OooO0o0, abstractC34264OooO0OO.OooOO0()));
        }

        @Override // oO0ooO0.AbstractC34264OooO0OO
        public final BigInteger OooOO0() {
            return this.f123028OooO0o0;
        }

        public final BigInteger OooOO0O(BigInteger bigInteger) {
            BigInteger bigIntegerMod = bigInteger;
            int i = 30;
            int i2 = 1;
            BigInteger bigInteger2 = C34333OooO0O0.f123261OooO00o;
            BigInteger bigInteger3 = this.f123026OooO0OO;
            int i3 = 0;
            if (!bigInteger3.testBit(0)) {
                throw new IllegalArgumentException("'M' must be odd");
            }
            if (bigInteger3.signum() != 1) {
                throw new ArithmeticException("BigInteger: modulus not positive");
            }
            if (bigIntegerMod.signum() < 0 || bigIntegerMod.compareTo(bigInteger3) >= 0) {
                bigIntegerMod = bigIntegerMod.mod(bigInteger3);
            }
            int iBitLength = bigInteger3.bitLength();
            int[] iArrOoooO0 = AbstractC21138OooO0oo.OoooO0(iBitLength, bigInteger3);
            int[] iArrOoooO02 = AbstractC21138OooO0oo.OoooO0(iBitLength, bigIntegerMod);
            int length = iArrOoooO0.length;
            int[] iArr = new int[length];
            int length2 = iArrOoooO0.length;
            int iNumberOfLeadingZeros = (length2 << 5) - Integer.numberOfLeadingZeros(iArrOoooO0[length2 - 1]);
            int i4 = (iNumberOfLeadingZeros + 29) / 30;
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            int[] iArr4 = new int[i4];
            int[] iArr5 = new int[i4];
            int[] iArr6 = new int[i4];
            iArr3[0] = 1;
            AbstractC20449OooO0Oo.OooOOO0(iNumberOfLeadingZeros, iArrOoooO02, iArr5);
            AbstractC20449OooO0Oo.OooOOO0(iNumberOfLeadingZeros, iArrOoooO0, iArr6);
            System.arraycopy(iArr6, 0, iArr4, 0, i4);
            int i5 = iArr6[0];
            int i6 = (2 - (i5 * i5)) * i5;
            int i7 = (2 - (i5 * i6)) * i6;
            int i8 = (2 - (i5 * i7)) * i7;
            int i9 = (2 - (i5 * i8)) * i8;
            int i10 = ((iNumberOfLeadingZeros * 49) + (iNumberOfLeadingZeros < 46 ? 80 : 47)) / 17;
            int i11 = -1;
            while (i3 < i10) {
                int i12 = iArr4[0];
                int i13 = iArr5[0];
                int i14 = i9;
                int i15 = i11;
                int i16 = i2;
                int i17 = i10;
                int i18 = 0;
                int i19 = 0;
                int i20 = i16;
                int i21 = 0;
                while (i21 < i) {
                    int i22 = i15 >> 31;
                    int i23 = i;
                    int i24 = -(i13 & 1);
                    int i25 = i13 + (((i12 ^ i22) - i22) & i24);
                    i19 += ((i16 ^ i22) - i22) & i24;
                    i20 += ((i18 ^ i22) - i22) & i24;
                    int i26 = i22 & i24;
                    i15 = (i15 ^ i26) - (i26 + 1);
                    i12 += i25 & i26;
                    i13 = i25 >> 1;
                    i16 = (i16 + (i19 & i26)) << 1;
                    i18 = (i18 + (i26 & i20)) << 1;
                    i21++;
                    i = i23;
                }
                int i27 = i;
                int[] iArr7 = {i16, i18, i19, i20};
                int i28 = iArr7[0];
                int i29 = iArr7[i16];
                int i30 = iArr7[2];
                int i31 = iArr7[3];
                int i32 = i4 - 1;
                int i33 = iArr2[i32] >> 31;
                int i34 = iArr3[i32] >> 31;
                int i35 = (i28 & i33) + (i29 & i34);
                int i36 = (i30 & i33) + (i31 & i34);
                int i37 = iArr6[0];
                int i38 = i3;
                int i39 = iNumberOfLeadingZeros;
                int[] iArr8 = iArr2;
                long j = i28;
                long j2 = iArr2[0];
                long j3 = j * j2;
                long j4 = i29;
                long j5 = iArr3[0];
                long j6 = (j4 * j5) + j3;
                long j7 = i30;
                long j8 = i31;
                long j9 = (j8 * j5) + (j7 * j2);
                int i40 = i35 - (((((int) j6) * i14) + i35) & 1073741823);
                long j10 = i37;
                long j11 = i40;
                long j12 = (j10 * j11) + j6;
                long j13 = i36 - (((((int) j9) * i14) + i36) & 1073741823);
                long j14 = (j10 * j13) + j9;
                long j15 = j12 >> i27;
                int i41 = i16;
                long j16 = j14 >> i27;
                while (i41 < i4) {
                    int i42 = iArr6[i41];
                    long j17 = j13;
                    int i43 = i41;
                    long j18 = iArr8[i41];
                    long j19 = iArr3[i41];
                    long j20 = i42;
                    long jOooO00o = C20593OooO0Oo.OooO00o(j20, j11, (j4 * j19) + (j * j18), j15);
                    long jOooO00o2 = C20593OooO0Oo.OooO00o(j20, j17, (j19 * j8) + (j7 * j18), j16);
                    int i44 = i43 - 1;
                    iArr8[i44] = ((int) jOooO00o) & 1073741823;
                    j15 = jOooO00o >> i27;
                    iArr3[i44] = ((int) jOooO00o2) & 1073741823;
                    j16 = jOooO00o2 >> i27;
                    i41 = i43 + 1;
                    j13 = j17;
                    j11 = j11;
                }
                iArr8[i32] = (int) j15;
                iArr3[i32] = (int) j16;
                int i45 = iArr7[0];
                int i46 = iArr7[i16];
                int i47 = iArr7[2];
                int i48 = iArr7[3];
                long j21 = i45;
                long j22 = iArr4[0];
                long j23 = i46;
                long j24 = iArr5[0];
                long j25 = (j23 * j24) + (j21 * j22);
                long j26 = i47;
                long j27 = i48;
                long j28 = ((j24 * j27) + (j22 * j26)) >> i27;
                long j29 = j25 >> i27;
                int i49 = i16;
                while (i49 < i4) {
                    long j30 = iArr4[i49];
                    long j31 = iArr5[i49];
                    long jOooO00o3 = C20593OooO0Oo.OooO00o(j23, j31, j21 * j30, j29);
                    long j32 = j27;
                    long jOooO00o4 = C20593OooO0Oo.OooO00o(j32, j31, j26 * j30, j28);
                    int i50 = i49 - 1;
                    iArr4[i50] = ((int) jOooO00o3) & 1073741823;
                    j29 = jOooO00o3 >> i27;
                    iArr5[i50] = ((int) jOooO00o4) & 1073741823;
                    j28 = jOooO00o4 >> i27;
                    i49++;
                    j27 = j32;
                }
                iArr4[i32] = (int) j29;
                iArr5[i32] = (int) j28;
                i3 = i38 + 30;
                i9 = i14;
                i2 = i16;
                i11 = i15;
                i10 = i17;
                i = i27;
                iNumberOfLeadingZeros = i39;
                iArr2 = iArr8;
            }
            int i51 = i2;
            int i52 = iNumberOfLeadingZeros;
            int[] iArr9 = iArr2;
            int i53 = i4 - 1;
            int i54 = iArr4[i53] >> 31;
            int i55 = 0;
            for (int i56 = 0; i56 < i53; i56++) {
                int i57 = ((iArr4[i56] ^ i54) - i54) + i55;
                iArr4[i56] = i57 & 1073741823;
                i55 = i57 >> 30;
            }
            iArr4[i53] = ((iArr4[i53] ^ i54) - i54) + i55;
            int i58 = iArr9[i53] >> 31;
            int i59 = 0;
            for (int i60 = 0; i60 < i53; i60++) {
                int i61 = (((iArr9[i60] + (iArr6[i60] & i58)) ^ i54) - i54) + i59;
                iArr9[i60] = i61 & 1073741823;
                i59 = i61 >> 30;
            }
            int i62 = (((iArr9[i53] + (i58 & iArr6[i53])) ^ i54) - i54) + i59;
            iArr9[i53] = i62;
            int i63 = i62 >> 31;
            int i64 = 0;
            for (int i65 = 0; i65 < i53; i65++) {
                int i66 = iArr9[i65] + (iArr6[i65] & i63) + i64;
                iArr9[i65] = i66 & 1073741823;
                i64 = i66 >> 30;
            }
            iArr9[i53] = iArr9[i53] + (i63 & iArr6[i53]) + i64;
            long j33 = 0;
            int i67 = 0;
            int i68 = 0;
            int i69 = 0;
            int i70 = i52;
            while (i70 > 0) {
                while (i69 < Math.min(32, i70)) {
                    j33 |= ((long) iArr9[i67]) << i69;
                    i69 += 30;
                    i67++;
                }
                iArr[i68] = (int) j33;
                j33 >>>= 32;
                i69 -= 32;
                i70 -= 32;
                i68++;
            }
            int i71 = iArr4[0] ^ 1;
            for (int i72 = i51; i72 < i4; i72++) {
                i71 |= iArr4[i72];
            }
            int i73 = ((i71 & 1) | (i71 >>> 1)) - 1;
            int i74 = 0;
            for (int i75 = 0; i75 < i4; i75++) {
                i74 |= iArr5[i75];
            }
            if (((i73 & (((i74 >>> 1) | (i74 & 1)) - 1)) >> 31) == 0) {
                throw new ArithmeticException("BigInteger not invertible.");
            }
            byte[] bArr = new byte[length << 2];
            for (int i76 = 0; i76 < length; i76++) {
                int i77 = iArr[i76];
                if (i77 != 0) {
                    AbstractC20449OooO0Oo.OooOoo(i77, ((length - 1) - i76) << 2, bArr);
                }
            }
            return new BigInteger(i51, bArr);
        }

        public final BigInteger OooOO0o(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger bigIntegerMultiply = bigInteger.multiply(bigInteger2);
            BigInteger bigInteger3 = this.f123026OooO0OO;
            BigInteger bigInteger4 = this.f123027OooO0Oo;
            if (bigInteger4 == null) {
                return bigIntegerMultiply.mod(bigInteger3);
            }
            boolean z = bigIntegerMultiply.signum() < 0;
            if (z) {
                bigIntegerMultiply = bigIntegerMultiply.abs();
            }
            int iBitLength = bigInteger3.bitLength();
            boolean zEquals = bigInteger4.equals(InterfaceC34261OooO00o.f123009OooO0O0);
            while (bigIntegerMultiply.bitLength() > iBitLength + 1) {
                BigInteger bigIntegerShiftRight = bigIntegerMultiply.shiftRight(iBitLength);
                BigInteger bigIntegerSubtract = bigIntegerMultiply.subtract(bigIntegerShiftRight.shiftLeft(iBitLength));
                if (!zEquals) {
                    bigIntegerShiftRight = bigIntegerShiftRight.multiply(bigInteger4);
                }
                bigIntegerMultiply = bigIntegerShiftRight.add(bigIntegerSubtract);
            }
            while (bigIntegerMultiply.compareTo(bigInteger3) >= 0) {
                bigIntegerMultiply = bigIntegerMultiply.subtract(bigInteger3);
            }
            return (!z || bigIntegerMultiply.signum() == 0) ? bigIntegerMultiply : bigInteger3.subtract(bigIntegerMultiply);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OooO0Oo)) {
                return false;
            }
            OooO0Oo oooO0Oo = (OooO0Oo) obj;
            return this.f123026OooO0OO.equals(oooO0Oo.f123026OooO0OO) && this.f123028OooO0o0.equals(oooO0Oo.f123028OooO0o0);
        }

        public final int hashCode() {
            return this.f123026OooO0OO.hashCode() ^ this.f123028OooO0o0.hashCode();
        }
    }

    public abstract AbstractC34264OooO0OO OooO();

    public abstract AbstractC34264OooO0OO OooO00o(AbstractC34264OooO0OO abstractC34264OooO0OO);

    public int OooO0O0() {
        return OooOO0().bitLength();
    }

    public abstract AbstractC34264OooO0OO OooO0OO(AbstractC34264OooO0OO abstractC34264OooO0OO);

    public abstract int OooO0Oo();

    public boolean OooO0o() {
        return OooO0O0() == 1;
    }

    public abstract AbstractC34264OooO0OO OooO0o0();

    public boolean OooO0oO() {
        return OooOO0().signum() == 0;
    }

    public abstract AbstractC34264OooO0OO OooO0oo(AbstractC34264OooO0OO abstractC34264OooO0OO);

    public abstract BigInteger OooOO0();

    public final String toString() {
        return OooOO0().toString(16);
    }
}
