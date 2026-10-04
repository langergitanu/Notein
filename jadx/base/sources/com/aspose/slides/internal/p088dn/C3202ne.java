package com.aspose.slides.internal.p088dn;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.internal.p463vm.C11683c5;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14060gf;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: com.aspose.slides.internal.dn.ne */
/* JADX INFO: loaded from: classes3.dex */
public final class C3202ne {
    /* JADX INFO: renamed from: k4 */
    public static long m13782k4(String str, int i, InterfaceC14073kp interfaceC14073kp) {
        long[] jArr = {0};
        RuntimeException[] runtimeExceptionArr = {null};
        boolean zM13783k4 = m13783k4(str, i, interfaceC14073kp, false, jArr, runtimeExceptionArr);
        long j = jArr[0];
        RuntimeException runtimeException = runtimeExceptionArr[0];
        if (zM13783k4) {
            return j;
        }
        throw runtimeException;
    }

    /* JADX WARN: Code restructure failed: missing block: B:211:0x0318, code lost:
    
        throw new com.aspose.slides.exceptions.OverflowException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0547, code lost:
    
        if (r32 != false) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0549, code lost:
    
        r34[0] = new com.aspose.slides.exceptions.OverflowException("Value too large or too small.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0550, code lost:
    
        return false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0173 A[PHI: r5 r9 r13
      0x0173: PHI (r5v3 int) = (r5v2 int), (r5v2 int), (r5v52 int), (r5v53 int) binds: [B:94:0x0117, B:95:0x0119, B:121:0x0176, B:119:0x016f] A[DONT_GENERATE, DONT_INLINE]
      0x0173: PHI (r9v3 boolean) = (r9v2 boolean), (r9v2 boolean), (r9v28 boolean), (r9v29 boolean) binds: [B:94:0x0117, B:95:0x0119, B:121:0x0176, B:119:0x016f] A[DONT_GENERATE, DONT_INLINE]
      0x0173: PHI (r13v5 boolean) = (r13v4 boolean), (r13v4 boolean), (r13v19 boolean), (r13v22 boolean) binds: [B:94:0x0117, B:95:0x0119, B:121:0x0176, B:119:0x016f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x053a A[LOOP:0: B:152:0x01f1->B:353:0x053a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0391 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r19v31 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v77 */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m13783k4(String str, int i, InterfaceC14073kp interfaceC14073kp, boolean z, long[] jArr, RuntimeException[] runtimeExceptionArr) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        C14060gf c14060gf;
        int i2;
        boolean z8;
        ?? r19;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i3;
        boolean z15;
        C14060gf c14060gf2;
        boolean z16;
        C14060gf c14060gf3;
        boolean z17;
        boolean z18;
        int i4;
        int i5;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        jArr[0] = 0;
        runtimeExceptionArr[0] = null;
        if (str == null) {
            if (!z) {
                runtimeExceptionArr[0] = new ArgumentNullException("s");
            }
            return false;
        }
        if (str.length() == 0) {
            if (!z) {
                runtimeExceptionArr[0] = new FormatException();
            }
            return false;
        }
        C11683c5 c11683c5M55035k4 = interfaceC14073kp != null ? C11683c5.m55035k4(interfaceC14073kp) : null;
        if (c11683c5M55035k4 == null) {
            c11683c5M55035k4 = C11697x1.m55252to().m55263fa();
        }
        if (!C3192ck.m13746k4(i, z, runtimeExceptionArr)) {
            return false;
        }
        boolean z27 = (i & 256) != 0;
        boolean z28 = (i & 512) != 0;
        boolean z29 = (i & 64) != 0;
        boolean z30 = (i & 32) != 0;
        boolean z31 = (i & 16) != 0;
        boolean z32 = (i & 8) != 0;
        boolean z33 = (i & 4) != 0;
        boolean z34 = (i & 2) != 0;
        boolean z35 = (i & 1) != 0;
        boolean z36 = (i & 128) != 0;
        char c = '0';
        int[] iArr = {0};
        boolean z37 = z35 && !C3192ck.m13751k4(iArr, str, true, z, runtimeExceptionArr);
        int i6 = iArr[0];
        if (z37) {
            return false;
        }
        if (z31) {
            boolean z38 = false;
            z2 = z38;
            if (str.charAt(i6) == '(') {
                iArr[0] = i6 + 1;
                boolean z39 = z35 && !C3192ck.m13751k4(iArr, str, true, z, runtimeExceptionArr);
                int i7 = iArr[0];
                if (z39) {
                    return false;
                }
                if (C14113y2.m67363du(C14113y2.m67443x1(str, i7, c11683c5M55035k4.m55064rv().length()), c11683c5M55035k4.m55064rv())) {
                    if (!z) {
                        runtimeExceptionArr[0] = C3192ck.m13742k4();
                    }
                    return false;
                }
                if (C14113y2.m67363du(C14113y2.m67443x1(str, i7, c11683c5M55035k4.m55042dq().length()), c11683c5M55035k4.m55042dq())) {
                    if (!z) {
                        runtimeExceptionArr[0] = C3192ck.m13742k4();
                    }
                    return false;
                }
                z4 = true;
                z5 = true;
                i6 = i7;
                z3 = true;
                z6 = z38;
            }
            if (z33 || z3) {
                z7 = z6 ? 1 : 0;
            } else {
                iArr[z6 ? 1 : 0] = i6;
                boolean[] zArr = new boolean[1];
                zArr[z6 ? 1 : 0] = z3;
                boolean[] zArr2 = new boolean[1];
                zArr2[z6 ? 1 : 0] = z4;
                C3192ck.m13744k4(iArr, str, c11683c5M55035k4, zArr, zArr2);
                int i8 = iArr[z6 ? 1 : 0];
                boolean z40 = zArr[z6 ? 1 : 0];
                boolean z41 = zArr2[z6 ? 1 : 0];
                if (z40) {
                    iArr[z6 ? 1 : 0] = i8;
                    boolean z42 = (!z35 || C3192ck.m13751k4(iArr, str, true, z, runtimeExceptionArr)) ? z6 ? 1 : 0 : true;
                    int i9 = iArr[z6 ? 1 : 0];
                    if (z42) {
                        return z6;
                    }
                    if (z27) {
                        iArr[z6 ? 1 : 0] = i9;
                        boolean[] zArr3 = new boolean[1];
                        zArr3[z6 ? 1 : 0] = z6;
                        C3192ck.m13743k4(iArr, str, c11683c5M55035k4, zArr3);
                        int i10 = iArr[z6 ? 1 : 0];
                        boolean z43 = zArr3[z6 ? 1 : 0];
                        iArr[z6 ? 1 : 0] = i10;
                        boolean z44 = (z43 && z35 && !C3192ck.m13751k4(iArr, str, true, z, runtimeExceptionArr)) ? true : z6 ? 1 : 0;
                        int i11 = iArr[z6 ? 1 : 0];
                        if (z44) {
                            return z6;
                        }
                        z7 = z43 ? 1 : 0;
                        z4 = z41 ? 1 : 0;
                        z3 = z40 ? 1 : 0;
                        i6 = i11;
                    } else {
                        z4 = z41 ? 1 : 0;
                        z3 = z40 ? 1 : 0;
                        i6 = i9;
                    }
                } else {
                    z3 = z40 ? 1 : 0;
                    i6 = i8;
                    z4 = z41 ? 1 : 0;
                }
                z7 = z6 ? 1 : 0;
            }
            if (z27 && !z7) {
                iArr[z6 ? 1 : 0] = i6;
                boolean[] zArr4 = new boolean[1];
                zArr4[z6 ? 1 : 0] = z7;
                C3192ck.m13743k4(iArr, str, c11683c5M55035k4, zArr4);
                int i12 = iArr[z6 ? 1 : 0];
                z26 = zArr4[z6 ? 1 : 0];
                if (z26) {
                    z7 = z26 ? 1 : 0;
                    i6 = i12;
                } else {
                    iArr[z6 ? 1 : 0] = i12;
                    boolean z45 = (!z35 || C3192ck.m13751k4(iArr, str, true, z, runtimeExceptionArr)) ? z6 ? 1 : 0 : true;
                    int i13 = iArr[z6 ? 1 : 0];
                    if (z45) {
                        return z6;
                    }
                    if (z26 && !z3 && z33) {
                        iArr[z6 ? 1 : 0] = i13;
                        boolean[] zArr5 = new boolean[1];
                        zArr5[z6 ? 1 : 0] = z3;
                        boolean[] zArr6 = new boolean[1];
                        zArr6[z6 ? 1 : 0] = z4;
                        C3192ck.m13744k4(iArr, str, c11683c5M55035k4, zArr5, zArr6);
                        int i14 = iArr[z6 ? 1 : 0];
                        boolean z46 = zArr5[z6 ? 1 : 0];
                        boolean z47 = zArr6[z6 ? 1 : 0];
                        iArr[z6 ? 1 : 0] = i14;
                        boolean z48 = (z46 && z35 && !C3192ck.m13751k4(iArr, str, true, z, runtimeExceptionArr)) ? true : z6 ? 1 : 0;
                        int i15 = iArr[z6 ? 1 : 0];
                        if (z48) {
                            return z6;
                        }
                        z7 = z26 ? 1 : 0;
                        z4 = z47 ? 1 : 0;
                        z3 = z46 ? 1 : 0;
                        i6 = i15;
                    } else {
                        z7 = z26 ? 1 : 0;
                        i6 = i13;
                    }
                }
            }
            c14060gf = new C14060gf(z6 ? 1 : 0 ? 1 : 0);
            boolean z49 = z6 ? 1 : 0;
            i2 = z49 ? 1 : 0;
            z11 = z36;
            z10 = z27;
            z9 = z29;
            r19 = z6;
            z8 = z49;
            while (true) {
                z12 = z11;
                if (C3192ck.m13745k4(str.charAt(i6), z28)) {
                    iArr[r19] = i6;
                    boolean z50 = z9 && (C3192ck.m13750k4(iArr, str, c11683c5M55035k4.m55050ix()) || C3192ck.m13750k4(iArr, str, c11683c5M55035k4.m55065to()));
                    i6 = iArr[0];
                    if (!z50) {
                        iArr[0] = i6;
                        boolean z51 = !z8 && z30 && (C3192ck.m13750k4(iArr, str, c11683c5M55035k4.m55062ne()) || C3192ck.m13750k4(iArr, str, c11683c5M55035k4.m55056kk()));
                        i4 = iArr[0];
                        if (!z51) {
                            z18 = z10;
                            z13 = z3;
                            break;
                        }
                        i6 = i4;
                        z23 = z10;
                        z13 = z3;
                        z14 = z28;
                        c14060gf2 = c14060gf;
                        z24 = true;
                        z22 = z9;
                        z21 = z24;
                        z20 = z23;
                        if (i6 < str.length()) {
                            c14060gf = c14060gf2;
                            i4 = i6;
                            z18 = z20;
                            break;
                        }
                        r19 = 0;
                        z11 = z12;
                        z3 = z13 ? 1 : 0;
                        z28 = z14;
                        z9 = z22;
                        z10 = z20;
                        c14060gf = c14060gf2;
                        z8 = z21;
                    } else {
                        z25 = z10;
                        z13 = z3;
                        z14 = z28;
                    }
                } else {
                    if (z28) {
                        i2++;
                        i3 = i6 + 1;
                        char cCharAt = str.charAt(i6);
                        if (C14117yj.m67539to(cCharAt)) {
                            z17 = z10;
                            c14060gf3 = new C14060gf(cCharAt - '0');
                        } else {
                            boolean z52 = z10;
                            if (C14117yj.m67517dy(cCharAt)) {
                                c14060gf3 = new C14060gf(cCharAt - 'W');
                                z17 = z52;
                            } else {
                                c14060gf3 = new C14060gf(cCharAt - '7');
                                z17 = z52;
                            }
                        }
                        if (z) {
                            boolean z53 = c14060gf.compareTo(new C14060gf(65535)) > 0;
                            z13 = z3;
                            C14060gf c14060gfM66617to = C14060gf.m66617to(C14060gf.m66606h4(c14060gf, new C14060gf(16)), c14060gf3);
                            if (z53 && c14060gfM66617to.compareTo(new C14060gf(16)) < 0) {
                                return false;
                            }
                            c14060gf2 = c14060gfM66617to;
                            z14 = z28;
                        } else {
                            z13 = z3;
                            BigInteger bigIntegerAdd = new BigInteger(c14060gf.toString()).multiply(BigInteger.valueOf(16L)).add(new BigInteger(c14060gf3.toString()));
                            if (bigIntegerAdd.compareTo(new BigInteger("18446744073709551615")) > 0 || bigIntegerAdd.compareTo(BigInteger.ZERO) < 0) {
                                break;
                            }
                            z14 = z28;
                            c14060gf2 = new C14060gf(bigIntegerAdd.longValue());
                        }
                        z15 = z9;
                        z16 = z17;
                    } else {
                        boolean z54 = z10;
                        z13 = z3;
                        z14 = z28;
                        i2++;
                        if (z8) {
                            int i16 = i6 + 1;
                            char c2 = c;
                            if (str.charAt(i6) != c2) {
                                if (z) {
                                    return false;
                                }
                                runtimeExceptionArr[0] = new OverflowException("Value too large or too small.");
                                return false;
                            }
                            i6 = i16;
                            c = c2;
                            z25 = z54;
                        } else {
                            BigInteger bigIntegerMultiply = new BigInteger(c14060gf.toString()).multiply(BigInteger.valueOf(10L));
                            c = '0';
                            i3 = i6 + 1;
                            z15 = z9;
                            BigInteger bigIntegerAdd2 = bigIntegerMultiply.add(BigInteger.valueOf(str.charAt(i6) - '0'));
                            if (bigIntegerAdd2.compareTo(new BigInteger("18446744073709551615")) > 0 || bigIntegerAdd2.compareTo(BigInteger.ZERO) < 0) {
                                break;
                            }
                            c14060gf2 = new C14060gf(bigIntegerAdd2.longValue());
                            z16 = z54;
                        }
                    }
                    i6 = i3;
                    z22 = z15;
                    z21 = z8;
                    z20 = z16;
                    if (i6 < str.length()) {
                    }
                }
                c14060gf2 = c14060gf;
                z24 = z8;
                z23 = z25;
                z22 = z9;
                z21 = z24;
                z20 = z23;
                if (i6 < str.length()) {
                }
            }
            if (i2 != 0) {
                if (z) {
                    return false;
                }
                runtimeExceptionArr[0] = C3192ck.m13742k4();
                return false;
            }
            if (z12) {
                iArr[0] = i4;
                int[] iArr2 = {0};
                boolean z55 = C3192ck.m13752k4(iArr, str, iArr2, z, runtimeExceptionArr) && runtimeExceptionArr[0] != null;
                int i17 = iArr[0];
                int i18 = iArr2[0];
                if (z55) {
                    return false;
                }
                i5 = i18;
                i4 = i17;
            } else {
                i5 = 0;
            }
            if (!z32 || z13) {
                z19 = z13 ? 1 : 0;
            } else {
                iArr[0] = i4;
                boolean[] zArr7 = {z13};
                boolean[] zArr8 = {z4};
                C3192ck.m13744k4(iArr, str, c11683c5M55035k4, zArr7, zArr8);
                int i19 = iArr[0];
                z19 = zArr7[0];
                z4 = zArr8[0];
                if (!z19 || i19 >= str.length()) {
                    i4 = i19;
                } else {
                    iArr[0] = i19;
                    boolean z56 = z34 && !C3192ck.m13751k4(iArr, str, true, z, runtimeExceptionArr);
                    i4 = iArr[0];
                    if (z56) {
                        return false;
                    }
                }
            }
            if (z18 && !z7) {
                iArr[0] = i4;
                boolean z57 = z34 && i4 < str.length() && !C3192ck.m13751k4(iArr, str, false, z, runtimeExceptionArr);
                int i20 = iArr[0];
                if (z57) {
                    return false;
                }
                iArr[0] = i20;
                boolean[] zArr9 = {z7};
                C3192ck.m13743k4(iArr, str, c11683c5M55035k4, zArr9);
                int i21 = iArr[0];
                if (!zArr9[0] || i21 >= str.length()) {
                    i4 = i21;
                } else {
                    iArr[0] = i21;
                    boolean z58 = z34 && !C3192ck.m13751k4(iArr, str, true, z, runtimeExceptionArr);
                    i4 = iArr[0];
                    if (z58) {
                        return false;
                    }
                    if (!z19 && z32) {
                        iArr[0] = i4;
                        boolean[] zArr10 = {z19};
                        boolean[] zArr11 = {z4};
                        C3192ck.m13744k4(iArr, str, c11683c5M55035k4, zArr10, zArr11);
                        i4 = iArr[0];
                        z4 = zArr11[0];
                    }
                }
            }
            iArr[0] = i4;
            boolean z59 = z34 && i4 < str.length() && !C3192ck.m13751k4(iArr, str, false, z, runtimeExceptionArr);
            int i22 = iArr[0];
            if (z59) {
                return false;
            }
            if (z5) {
                if (i22 < str.length()) {
                    int i23 = i22 + 1;
                    if (str.charAt(i22) == ')') {
                        iArr[0] = i23;
                        boolean z60 = z34 && i23 < str.length() && !C3192ck.m13751k4(iArr, str, false, z, runtimeExceptionArr);
                        i22 = iArr[0];
                        if (z60) {
                            return false;
                        }
                    }
                }
                if (!z) {
                    runtimeExceptionArr[0] = C3192ck.m13742k4();
                }
                return false;
            }
            if (i22 < str.length() && str.charAt(i22) != 0) {
                if (!z) {
                    runtimeExceptionArr[0] = C3192ck.m13742k4();
                }
                return false;
            }
            if (z4 && c14060gf.compareTo(new C14060gf(0)) > 0) {
                if (!z) {
                    runtimeExceptionArr[0] = new OverflowException("Negative number");
                }
                return false;
            }
            if (i5 > 0) {
                BigDecimal bigDecimalMultiply = BigDecimal.valueOf(Math.pow(10.0d, i5)).multiply(new BigDecimal(c14060gf.toString()));
                if (bigDecimalMultiply.compareTo(new BigDecimal(Integer.MIN_VALUE)) < 0 || bigDecimalMultiply.compareTo(new BigDecimal(Integer.MAX_VALUE)) > 0) {
                    if (z) {
                        return false;
                    }
                    runtimeExceptionArr[0] = new OverflowException("Value too large or too small.");
                    return false;
                }
                c14060gf = new C14060gf(bigDecimalMultiply.longValue());
            }
            jArr[0] = c14060gf.longValue();
            return true;
        }
        z2 = false;
        z3 = z2 ? 1 : 0;
        z4 = z3 ? 1 : 0;
        z5 = z4 ? 1 : 0;
        z6 = z2;
        if (z33) {
            z7 = z6 ? 1 : 0;
        }
        if (z27) {
            iArr[z6 ? 1 : 0] = i6;
            boolean[] zArr42 = new boolean[1];
            zArr42[z6 ? 1 : 0] = z7;
            C3192ck.m13743k4(iArr, str, c11683c5M55035k4, zArr42);
            int i122 = iArr[z6 ? 1 : 0];
            z26 = zArr42[z6 ? 1 : 0];
            if (z26) {
            }
        }
        c14060gf = new C14060gf(z6 ? 1 : 0 ? 1 : 0);
        boolean z492 = z6 ? 1 : 0;
        i2 = z492 ? 1 : 0;
        z11 = z36;
        z10 = z27;
        z9 = z29;
        r19 = z6;
        z8 = z492;
        while (true) {
            z12 = z11;
            if (C3192ck.m13745k4(str.charAt(i6), z28)) {
            }
            c14060gf2 = c14060gf;
            z24 = z8;
            z23 = z25;
            z22 = z9;
            z21 = z24;
            z20 = z23;
            if (i6 < str.length()) {
            }
            r19 = 0;
            z11 = z12;
            z3 = z13 ? 1 : 0;
            z28 = z14;
            z9 = z22;
            z10 = z20;
            c14060gf = c14060gf2;
            z8 = z21;
        }
        if (i2 != 0) {
        }
    }
}
