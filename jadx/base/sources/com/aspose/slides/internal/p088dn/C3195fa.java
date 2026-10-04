package com.aspose.slides.internal.p088dn;

import androidx.core.location.LocationRequestCompat;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.internal.p463vm.C11683c5;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import java.math.BigInteger;

/* JADX INFO: renamed from: com.aspose.slides.internal.dn.fa */
/* JADX INFO: loaded from: classes3.dex */
public final class C3195fa {
    /* JADX INFO: renamed from: k4 */
    public static long m13767k4(String str, int i) {
        return m13768k4(str, i, null);
    }

    /* JADX INFO: renamed from: k4 */
    public static long m13768k4(String str, int i, InterfaceC14073kp interfaceC14073kp) {
        long[] jArr = {0};
        RuntimeException[] runtimeExceptionArr = {null};
        boolean zM13769k4 = m13769k4(str, i, interfaceC14073kp, false, jArr, runtimeExceptionArr);
        long j = jArr[0];
        RuntimeException runtimeException = runtimeExceptionArr[0];
        if (zM13769k4) {
            return j;
        }
        throw runtimeException;
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x0273, code lost:
    
        r32 = r10;
        r33 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x04eb, code lost:
    
        if (r38 != false) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x04ed, code lost:
    
        r40[r21] = new com.aspose.slides.exceptions.OverflowException("Value too large or too small.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x04f4, code lost:
    
        return r21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03cd  */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v11 */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r21v19 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v69 */
    /* JADX WARN: Type inference failed for: r5v70 */
    /* JADX WARN: Type inference failed for: r5v71 */
    /* JADX WARN: Type inference failed for: r5v72 */
    /* JADX WARN: Type inference failed for: r5v73 */
    /* JADX WARN: Type inference failed for: r5v74 */
    /* JADX WARN: Type inference failed for: r5v75 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m13769k4(String str, int i, InterfaceC14073kp interfaceC14073kp, boolean z, long[] jArr, RuntimeException[] runtimeExceptionArr) {
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        char c;
        boolean z7;
        boolean z8;
        boolean z9;
        int i3;
        int i4;
        int i5;
        int i6;
        ?? r5;
        ?? r52;
        boolean z10;
        ?? r53;
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
                runtimeExceptionArr[0] = C3192ck.m13742k4();
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
        boolean z11 = (i & 256) != 0;
        boolean z12 = (i & 512) != 0;
        boolean z13 = (i & 64) != 0;
        boolean z14 = (i & 32) != 0;
        boolean z15 = (i & 16) != 0;
        boolean z16 = (i & 8) != 0;
        boolean z17 = (i & 4) != 0;
        boolean z18 = (i & 2) != 0;
        boolean z19 = (i & 1) != 0;
        boolean z20 = (i & 128) != 0;
        int[] iArr = new int[1];
        iArr[0] = 0;
        if (!z19 || C3192ck.m13751k4(iArr, str, true, z, runtimeExceptionArr)) {
            z2 = false;
            i2 = 0;
        } else {
            z2 = true;
            i2 = 0;
        }
        int i7 = iArr[i2];
        if (z2) {
            return i2;
        }
        if (z15 && str.charAt(i7) == '(') {
            iArr[i2] = i7 + 1;
            int i8 = (!z19 || C3192ck.m13751k4(iArr, str, true, z, runtimeExceptionArr)) ? i2 : 1;
            int i9 = iArr[i2];
            if (i8 != 0) {
                return i2;
            }
            if (C14113y2.m67363du(C14113y2.m67443x1(str, i9, c11683c5M55035k4.m55064rv().length()), c11683c5M55035k4.m55064rv())) {
                if (!z) {
                    runtimeExceptionArr[i2] = C3192ck.m13742k4();
                }
                return i2;
            }
            if (C14113y2.m67363du(C14113y2.m67443x1(str, i9, c11683c5M55035k4.m55042dq().length()), c11683c5M55035k4.m55042dq())) {
                if (!z) {
                    runtimeExceptionArr[i2] = C3192ck.m13742k4();
                }
                return i2;
            }
            z3 = true;
            z4 = true;
            i7 = i9;
            z5 = true;
        } else {
            int i10 = i2;
            z3 = i10 == true ? 1 : 0;
            z4 = z3 ? 1 : 0;
            z5 = i10;
        }
        if (z17 && z5 == 0) {
            iArr[i2] = i7;
            boolean[] zArr = new boolean[1];
            zArr[i2] = z5;
            boolean[] zArr2 = new boolean[1];
            zArr2[i2] = z3;
            C3192ck.m13744k4(iArr, str, c11683c5M55035k4, zArr, zArr2);
            int i11 = iArr[i2];
            boolean z21 = zArr[i2];
            boolean z22 = zArr2[i2];
            if (z21) {
                iArr[i2] = i11;
                int i12 = (!z19 || C3192ck.m13751k4(iArr, str, true, z, runtimeExceptionArr)) ? i2 : 1;
                int i13 = iArr[i2];
                if (i12 != 0) {
                    return i2;
                }
                if (z11) {
                    iArr[i2] = i13;
                    boolean[] zArr3 = new boolean[1];
                    zArr3[i2] = i2;
                    C3192ck.m13743k4(iArr, str, c11683c5M55035k4, zArr3);
                    int i14 = iArr[i2];
                    boolean z23 = zArr3[i2];
                    iArr[i2] = i14;
                    int i15 = (z23 && z19 && !C3192ck.m13751k4(iArr, str, true, z, runtimeExceptionArr)) ? 1 : i2;
                    int i16 = iArr[i2];
                    if (i15 != 0) {
                        return i2;
                    }
                    z6 = z23 ? 1 : 0;
                    z3 = z22 ? 1 : 0;
                    z5 = z21 ? 1 : 0;
                    i7 = i16;
                } else {
                    z3 = z22 ? 1 : 0;
                    z5 = z21 ? 1 : 0;
                    i7 = i13;
                }
            } else {
                z5 = z21 ? 1 : 0;
                i7 = i11;
                z3 = z22 ? 1 : 0;
            }
            z6 = i2;
        } else {
            z6 = i2;
        }
        if (z11 && z6 == 0) {
            iArr[i2] = i7;
            boolean[] zArr4 = new boolean[1];
            zArr4[i2] = z6;
            C3192ck.m13743k4(iArr, str, c11683c5M55035k4, zArr4);
            int i17 = iArr[i2];
            boolean z24 = zArr4[i2];
            if (z24) {
                iArr[i2] = i17;
                int i18 = (!z19 || C3192ck.m13751k4(iArr, str, true, z, runtimeExceptionArr)) ? i2 : 1;
                int i19 = iArr[i2];
                if (i18 != 0) {
                    return i2;
                }
                if (z24 && z5 == 0 && z17) {
                    iArr[i2] = i19;
                    c = '0';
                    boolean[] zArr5 = new boolean[1];
                    zArr5[i2] = z5;
                    boolean[] zArr6 = new boolean[1];
                    zArr6[i2] = z3;
                    C3192ck.m13744k4(iArr, str, c11683c5M55035k4, zArr5, zArr6);
                    int i20 = iArr[i2];
                    boolean z25 = zArr5[i2];
                    boolean z26 = zArr6[i2];
                    iArr[i2] = i20;
                    int i21 = (z25 && z19 && !C3192ck.m13751k4(iArr, str, true, z, runtimeExceptionArr)) ? 1 : i2;
                    int i22 = iArr[i2];
                    if (i21 != 0) {
                        return i2;
                    }
                    z6 = z24 ? 1 : 0;
                    z3 = z26 ? 1 : 0;
                    i7 = i22;
                    z5 = z25 ? 1 : 0;
                } else {
                    c = '0';
                    z6 = z24 ? 1 : 0;
                    i7 = i19;
                }
            } else {
                c = '0';
                z6 = z24 ? 1 : 0;
                i7 = i17;
            }
        } else {
            c = '0';
        }
        long jLongValue = 0;
        int i23 = i2;
        int i24 = i23 == true ? 1 : 0;
        boolean z27 = z20;
        int i25 = i23;
        boolean z28 = z11;
        while (true) {
            z7 = z27;
            if (!C3192ck.m13745k4(str.charAt(i7), z12)) {
                iArr[i2] = i7;
                int i26 = (z13 && (C3192ck.m13750k4(iArr, str, c11683c5M55035k4.m55050ix()) || C3192ck.m13750k4(iArr, str, c11683c5M55035k4.m55065to()))) ? 1 : i2;
                i7 = iArr[i2];
                if (i26 == 0) {
                    iArr[i2] = i7;
                    int i27 = (i25 == 0 && z14 && (C3192ck.m13750k4(iArr, str, c11683c5M55035k4.m55062ne()) || C3192ck.m13750k4(iArr, str, c11683c5M55035k4.m55056kk()))) ? 1 : i2;
                    i7 = iArr[i2];
                    if (i27 == 0) {
                        if (!z28) {
                            break;
                        }
                        iArr[i2] = i7;
                        int i28 = (z28 && C3192ck.m13750k4(iArr, str, c11683c5M55035k4.m55040c5())) ? 1 : i2;
                        i7 = iArr[i2];
                        if (i28 == 0) {
                            break;
                        }
                        z8 = z28;
                        z9 = z12;
                        i5 = i25;
                    } else {
                        z8 = z28;
                        z9 = z12;
                        i5 = 1;
                    }
                } else {
                    z8 = z28;
                    z9 = z12;
                    i5 = i25;
                }
            } else if (z12) {
                i24++;
                int i29 = i7 + 1;
                char cCharAt = str.charAt(i7);
                int i30 = C14117yj.m67539to(cCharAt) ? cCharAt - '0' : C14117yj.m67517dy(cCharAt) ? cCharAt - 'W' : cCharAt - '7';
                boolean z29 = i25 == true ? 1 : 0;
                BigInteger bigIntegerValueOf = BigInteger.valueOf(jLongValue);
                z8 = z28;
                z9 = z12;
                jLongValue = bigIntegerValueOf.multiply(BigInteger.valueOf(16L)).add(BigInteger.valueOf(i30)).longValue();
                if (jLongValue == 0 && !bigIntegerValueOf.equals(BigInteger.ZERO)) {
                    if (!z) {
                        runtimeExceptionArr[i2] = new OverflowException("Value too large or too small.");
                    }
                    return i2;
                }
                i5 = z29 ? 1 : 0;
                i7 = i29;
            } else {
                boolean z30 = i25 == true ? 1 : 0;
                z8 = z28;
                z9 = z12;
                i24++;
                if (z30) {
                    i3 = i7 + 1;
                    char cCharAt2 = str.charAt(i7);
                    char c2 = c;
                    if (cCharAt2 != c2) {
                        if (!z) {
                            runtimeExceptionArr[i2] = new OverflowException(C14113y2.m67408k4("Value too large or too ", "small."));
                        }
                        return i2;
                    }
                    i4 = z30 ? 1 : 0;
                    c = c2;
                } else {
                    i3 = i7 + 1;
                    c = '0';
                    BigInteger bigIntegerSubtract = BigInteger.valueOf(jLongValue * 10).subtract(BigInteger.valueOf(str.charAt(i7) - '0'));
                    if (bigIntegerSubtract.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) < 0 || bigIntegerSubtract.compareTo(BigInteger.valueOf(LocationRequestCompat.PASSIVE_INTERVAL)) > 0) {
                        break;
                    }
                    jLongValue = bigIntegerSubtract.longValue();
                    i4 = z30 ? 1 : 0;
                }
                i7 = i3;
                i5 = i4;
            }
            if (i7 >= str.length()) {
                break;
            }
            z27 = z7;
            z28 = z8;
            z12 = z9;
            i25 = i5;
        }
        if (i24 == 0) {
            if (!z) {
                runtimeExceptionArr[i2] = C3192ck.m13742k4();
            }
            return i2;
        }
        if (z7) {
            iArr[i2] = i7;
            int[] iArr2 = {i2};
            int i31 = (!C3192ck.m13752k4(iArr, str, iArr2, z, runtimeExceptionArr) || runtimeExceptionArr[i2] == null) ? i2 : 1;
            i7 = iArr[i2];
            i6 = iArr2[i2];
            if (i31 != 0) {
                return i2;
            }
        } else {
            i6 = i2;
        }
        if (z16 && z5 == 0) {
            iArr[i2] = i7;
            boolean[] zArr7 = new boolean[1];
            zArr7[i2] = z5;
            boolean[] zArr8 = new boolean[1];
            zArr8[i2] = z3;
            C3192ck.m13744k4(iArr, str, c11683c5M55035k4, zArr7, zArr8);
            int i32 = iArr[i2];
            boolean z31 = zArr7[i2];
            z3 = zArr8[i2];
            if (!z31 || i32 >= str.length()) {
                z5 = z31 ? 1 : 0;
                i7 = i32;
            } else {
                iArr[i2] = i32;
                int i33 = (!z18 || C3192ck.m13751k4(iArr, str, true, z, runtimeExceptionArr)) ? i2 : 1;
                int i34 = iArr[i2];
                if (i33 != 0) {
                    return i2;
                }
                z5 = z31 ? 1 : 0;
                i7 = i34;
            }
        }
        if (z8 && z6 == 0) {
            iArr[i2] = i7;
            if (!z18 || i7 >= str.length()) {
                r52 = i2;
            } else {
                ?? r54 = i2;
                boolean zM13751k4 = C3192ck.m13751k4(iArr, str, (boolean) r54, z, runtimeExceptionArr);
                r52 = r54;
                if (!zM13751k4) {
                    z10 = true;
                    r53 = r54;
                }
                int i35 = iArr[r53 == true ? 1 : 0];
                if (!z10) {
                    return r53;
                }
                iArr[r53 == true ? 1 : 0] = i35;
                boolean[] zArr9 = new boolean[1];
                zArr9[r53 == true ? 1 : 0] = z6;
                C3192ck.m13743k4(iArr, str, c11683c5M55035k4, zArr9);
                int i36 = iArr[r53 == true ? 1 : 0];
                if (!zArr9[r53 == true ? 1 : 0] || i36 >= str.length()) {
                    i7 = i36;
                    r5 = r53;
                } else {
                    iArr[r53 == true ? 1 : 0] = i36;
                    boolean z32 = (!z18 || C3192ck.m13751k4(iArr, str, true, z, runtimeExceptionArr)) ? r53 == true ? 1 : 0 : true;
                    i7 = iArr[r53 == true ? 1 : 0];
                    r5 = r53;
                    r5 = r53;
                    if (z32) {
                        return r53;
                    }
                    if (z5 == 0 && z16) {
                        iArr[r53 == true ? 1 : 0] = i7;
                        boolean[] zArr10 = new boolean[1];
                        zArr10[r53 == true ? 1 : 0] = z5;
                        boolean[] zArr11 = new boolean[1];
                        zArr11[r53 == true ? 1 : 0] = z3;
                        C3192ck.m13744k4(iArr, str, c11683c5M55035k4, zArr10, zArr11);
                        i7 = iArr[r53 == true ? 1 : 0];
                        z3 = zArr11[r53 == true ? 1 : 0];
                        r5 = r53;
                    }
                }
            }
            z10 = r52 == true ? 1 : 0;
            r53 = r52;
            int i352 = iArr[r53 == true ? 1 : 0];
            if (!z10) {
            }
        } else {
            r5 = i2;
        }
        iArr[r5] = i7;
        ?? r21 = (!z18 || i7 >= str.length() || C3192ck.m13751k4(iArr, str, (boolean) r5, z, runtimeExceptionArr)) ? r5 : 1;
        int i37 = iArr[r5];
        if (r21 != 0) {
            return r5;
        }
        if (z4) {
            if (i37 < str.length()) {
                int i38 = i37 + 1;
                if (str.charAt(i37) == ')') {
                    iArr[r5] = i38;
                    ?? r212 = (!z18 || i38 >= str.length() || C3192ck.m13751k4(iArr, str, (boolean) r5, z, runtimeExceptionArr)) ? r5 : 1;
                    i37 = iArr[r5];
                    if (r212 != 0) {
                        return r5;
                    }
                }
            }
            if (!z) {
                runtimeExceptionArr[r5] = C3192ck.m13742k4();
            }
            return r5;
        }
        if (i37 < str.length() && str.charAt(i37) != 0) {
            if (!z) {
                runtimeExceptionArr[r5] = C3192ck.m13742k4();
            }
            return r5;
        }
        if (!z3 && !z9) {
            BigInteger bigIntegerNegate = BigInteger.valueOf(jLongValue).negate();
            if (bigIntegerNegate.compareTo(BigInteger.valueOf(LocationRequestCompat.PASSIVE_INTERVAL)) > 0 || bigIntegerNegate.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) < 0) {
                if (z) {
                    return false;
                }
                runtimeExceptionArr[0] = new OverflowException();
                return false;
            }
            jLongValue = bigIntegerNegate.longValue();
        }
        long j = jLongValue;
        if (i6 > 0) {
            double dPow = Math.pow(10.0d, i6) * j;
            if (dPow < -2.147483648E9d || dPow > 2.147483647E9d) {
                if (z) {
                    return false;
                }
                runtimeExceptionArr[0] = new OverflowException("Value too large or too small.");
                return false;
            }
            j = (long) dPow;
        }
        jArr[0] = j;
        return true;
    }
}
