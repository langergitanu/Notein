package com.aspose.slides.internal.p088dn;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.internal.p463vm.C11683c5;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import java.math.BigInteger;

/* JADX INFO: renamed from: com.aspose.slides.internal.dn.x6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3207x6 {
    /* JADX INFO: renamed from: k4 */
    public static long m13897k4(String str) {
        long[] jArr = {0};
        RuntimeException[] runtimeExceptionArr = {null};
        boolean zM13901k4 = m13901k4(str, false, jArr, runtimeExceptionArr);
        long j = jArr[0];
        RuntimeException runtimeException = runtimeExceptionArr[0];
        if (zM13901k4) {
            return j;
        }
        throw runtimeException;
    }

    /* JADX INFO: renamed from: k4 */
    public static long m13898k4(String str, int i) {
        return m13899k4(str, i, null);
    }

    /* JADX INFO: renamed from: k4 */
    public static long m13899k4(String str, int i, InterfaceC14073kp interfaceC14073kp) {
        long[] jArr = {0};
        RuntimeException[] runtimeExceptionArr = {null};
        boolean zM13900k4 = m13900k4(str, i, interfaceC14073kp, false, jArr, runtimeExceptionArr);
        long j = jArr[0];
        RuntimeException runtimeException = runtimeExceptionArr[0];
        if (zM13900k4) {
            return j;
        }
        throw runtimeException;
    }

    /* JADX WARN: Code restructure failed: missing block: B:198:0x02b1, code lost:
    
        throw new com.aspose.slides.exceptions.OverflowException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x049f, code lost:
    
        if (r36 != false) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x04a1, code lost:
    
        r38[r21] = new com.aspose.slides.exceptions.OverflowException("Value too large or too small.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x04a8, code lost:
    
        return r21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03a4  */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v17 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v81 */
    /* JADX WARN: Type inference failed for: r6v82 */
    /* JADX WARN: Type inference failed for: r6v83 */
    /* JADX WARN: Type inference failed for: r6v84 */
    /* JADX WARN: Type inference failed for: r6v85 */
    /* JADX WARN: Type inference failed for: r6v86 */
    /* JADX WARN: Type inference failed for: r6v87 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m13900k4(String str, int i, InterfaceC14073kp interfaceC14073kp, boolean z, long[] jArr, RuntimeException[] runtimeExceptionArr) {
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        char c;
        boolean z7;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ?? r6;
        ?? r62;
        boolean z8;
        ?? r63;
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
        boolean z9 = (i & 256) != 0;
        boolean z10 = (i & 512) != 0;
        boolean z11 = (i & 64) != 0;
        boolean z12 = (i & 32) != 0;
        boolean z13 = (i & 16) != 0;
        boolean z14 = (i & 8) != 0;
        boolean z15 = (i & 4) != 0;
        boolean z16 = (i & 2) != 0;
        boolean z17 = (i & 1) != 0;
        boolean z18 = (i & 128) != 0;
        int[] iArr = new int[1];
        iArr[0] = 0;
        if (!z17 || C3192ck.m13751k4(iArr, str, true, z, runtimeExceptionArr)) {
            z2 = false;
            i2 = 0;
        } else {
            z2 = true;
            i2 = 0;
        }
        int i9 = iArr[i2];
        if (z2) {
            return i2;
        }
        if (z13 && str.charAt(i9) == '(') {
            iArr[i2] = i9 + 1;
            int i10 = (!z17 || C3192ck.m13751k4(iArr, str, true, z, runtimeExceptionArr)) ? i2 : 1;
            int i11 = iArr[i2];
            if (i10 != 0) {
                return i2;
            }
            if (C14113y2.m67363du(C14113y2.m67443x1(str, i11, c11683c5M55035k4.m55064rv().length()), c11683c5M55035k4.m55064rv())) {
                if (!z) {
                    runtimeExceptionArr[i2] = C3192ck.m13742k4();
                }
                return i2;
            }
            if (C14113y2.m67363du(C14113y2.m67443x1(str, i11, c11683c5M55035k4.m55042dq().length()), c11683c5M55035k4.m55042dq())) {
                if (!z) {
                    runtimeExceptionArr[i2] = C3192ck.m13742k4();
                }
                return i2;
            }
            z3 = true;
            z4 = true;
            i9 = i11;
            z5 = true;
        } else {
            int i12 = i2;
            z3 = i12 == true ? 1 : 0;
            z4 = z3 ? 1 : 0;
            z5 = i12;
        }
        if (z15 && z5 == 0) {
            iArr[i2] = i9;
            boolean[] zArr = new boolean[1];
            zArr[i2] = z5;
            boolean[] zArr2 = new boolean[1];
            zArr2[i2] = z3;
            C3192ck.m13744k4(iArr, str, c11683c5M55035k4, zArr, zArr2);
            int i13 = iArr[i2];
            boolean z19 = zArr[i2];
            boolean z20 = zArr2[i2];
            if (z19) {
                iArr[i2] = i13;
                int i14 = (!z17 || C3192ck.m13751k4(iArr, str, true, z, runtimeExceptionArr)) ? i2 : 1;
                int i15 = iArr[i2];
                if (i14 != 0) {
                    return i2;
                }
                if (z9) {
                    iArr[i2] = i15;
                    boolean[] zArr3 = new boolean[1];
                    zArr3[i2] = i2;
                    C3192ck.m13743k4(iArr, str, c11683c5M55035k4, zArr3);
                    int i16 = iArr[i2];
                    boolean z21 = zArr3[i2];
                    iArr[i2] = i16;
                    int i17 = (z21 && z17 && !C3192ck.m13751k4(iArr, str, true, z, runtimeExceptionArr)) ? 1 : i2;
                    int i18 = iArr[i2];
                    if (i17 != 0) {
                        return i2;
                    }
                    z6 = z21 ? 1 : 0;
                    z3 = z20 ? 1 : 0;
                    z5 = z19 ? 1 : 0;
                    i9 = i18;
                } else {
                    z3 = z20 ? 1 : 0;
                    z5 = z19 ? 1 : 0;
                    i9 = i15;
                }
            } else {
                z5 = z19 ? 1 : 0;
                i9 = i13;
                z3 = z20 ? 1 : 0;
            }
            z6 = i2;
        } else {
            z6 = i2;
        }
        if (z9 && z6 == 0) {
            iArr[i2] = i9;
            boolean[] zArr4 = new boolean[1];
            zArr4[i2] = z6;
            C3192ck.m13743k4(iArr, str, c11683c5M55035k4, zArr4);
            int i19 = iArr[i2];
            boolean z22 = zArr4[i2];
            if (z22) {
                iArr[i2] = i19;
                int i20 = (!z17 || C3192ck.m13751k4(iArr, str, true, z, runtimeExceptionArr)) ? i2 : 1;
                int i21 = iArr[i2];
                if (i20 != 0) {
                    return i2;
                }
                if (z22 && z5 == 0 && z15) {
                    iArr[i2] = i21;
                    c = '0';
                    boolean[] zArr5 = new boolean[1];
                    zArr5[i2] = z5;
                    boolean[] zArr6 = new boolean[1];
                    zArr6[i2] = z3;
                    C3192ck.m13744k4(iArr, str, c11683c5M55035k4, zArr5, zArr6);
                    int i22 = iArr[i2];
                    boolean z23 = zArr5[i2];
                    boolean z24 = zArr6[i2];
                    iArr[i2] = i22;
                    int i23 = (z23 && z17 && !C3192ck.m13751k4(iArr, str, true, z, runtimeExceptionArr)) ? 1 : i2;
                    int i24 = iArr[i2];
                    if (i23 != 0) {
                        return i2;
                    }
                    z6 = z22 ? 1 : 0;
                    z3 = z24 ? 1 : 0;
                    i9 = i24;
                    z5 = z23 ? 1 : 0;
                } else {
                    c = '0';
                    z6 = z22 ? 1 : 0;
                    i9 = i21;
                }
            } else {
                c = '0';
                z6 = z22 ? 1 : 0;
                i9 = i19;
            }
        } else {
            c = '0';
        }
        long jLongValue = 0;
        int i25 = i2;
        int i26 = i25 == true ? 1 : 0;
        boolean z25 = z18;
        int i27 = i25;
        while (true) {
            z7 = z25;
            if (!C3192ck.m13745k4(str.charAt(i9), z10)) {
                iArr[i2] = i9;
                int i28 = (z11 && (C3192ck.m13750k4(iArr, str, c11683c5M55035k4.m55050ix()) || C3192ck.m13750k4(iArr, str, c11683c5M55035k4.m55065to()))) ? 1 : i2;
                i9 = iArr[i2];
                i3 = i27;
                if (i28 == 0) {
                    iArr[i2] = i9;
                    int i29 = (i27 == 0 && z12 && (C3192ck.m13750k4(iArr, str, c11683c5M55035k4.m55062ne()) || C3192ck.m13750k4(iArr, str, c11683c5M55035k4.m55056kk()))) ? 1 : i2;
                    i7 = iArr[i2];
                    if (i29 == 0) {
                        break;
                    }
                    i9 = i7;
                    i3 = 1;
                }
            } else if (z10) {
                i26++;
                int i30 = i9 + 1;
                char cCharAt = str.charAt(i9);
                if (C14117yj.m67539to(cCharAt)) {
                    i5 = cCharAt - '0';
                    i6 = i27 == true ? 1 : 0;
                    i4 = i30;
                } else {
                    int i31 = i27 == true ? 1 : 0;
                    i4 = i30;
                    if (C14117yj.m67517dy(cCharAt)) {
                        i5 = cCharAt - 'W';
                        i6 = i31;
                    } else {
                        i5 = cCharAt - '7';
                        i6 = i31;
                    }
                }
                jLongValue = ((jLongValue & 4294967295L) * 16) + (((long) i5) & 4294967295L);
                if (!z) {
                    BigInteger bigIntegerValueOf = BigInteger.valueOf(jLongValue);
                    if (bigIntegerValueOf.compareTo(BigInteger.valueOf(4294967295L)) > 0 || bigIntegerValueOf.compareTo(BigInteger.valueOf(0L)) < 0) {
                        break;
                    }
                    jLongValue = bigIntegerValueOf.longValue();
                } else if (jLongValue > 4294967295L) {
                    return i2;
                }
                i3 = i6;
                i9 = i4;
            } else {
                boolean z26 = i27 == true ? 1 : 0;
                i26++;
                if (z26) {
                    int i32 = i9 + 1;
                    char cCharAt2 = str.charAt(i9);
                    char c2 = c;
                    if (cCharAt2 != c2) {
                        if (!z) {
                            runtimeExceptionArr[i2] = new OverflowException("Value too large or too small.");
                        }
                        return i2;
                    }
                    i3 = z26 ? 1 : 0;
                    c = c2;
                    i9 = i32;
                } else {
                    int i33 = i9 + 1;
                    c = '0';
                    BigInteger bigIntegerAdd = BigInteger.valueOf(jLongValue).multiply(BigInteger.valueOf(10L)).add(BigInteger.valueOf(str.charAt(i9) - '0'));
                    if (bigIntegerAdd.compareTo(BigInteger.valueOf(4294967295L)) > 0 || bigIntegerAdd.compareTo(BigInteger.valueOf(0L)) < 0) {
                        break;
                    }
                    i9 = i33;
                    jLongValue = bigIntegerAdd.longValue();
                    i3 = z26 ? 1 : 0;
                }
            }
            if (i9 >= str.length()) {
                i7 = i9;
                break;
            }
            z25 = z7;
            i27 = i3;
        }
        if (i26 == 0) {
            if (!z) {
                runtimeExceptionArr[i2] = C3192ck.m13742k4();
            }
            return i2;
        }
        if (z7) {
            iArr[i2] = i7;
            int[] iArr2 = {i2};
            int i34 = (!C3192ck.m13752k4(iArr, str, iArr2, z, runtimeExceptionArr) || runtimeExceptionArr[i2] == null) ? i2 : 1;
            int i35 = iArr[i2];
            i8 = iArr2[i2];
            if (i34 != 0) {
                return i2;
            }
            i7 = i35;
        } else {
            i8 = i2;
        }
        if (z14 && z5 == 0) {
            iArr[i2] = i7;
            boolean[] zArr7 = new boolean[1];
            zArr7[i2] = z5;
            boolean[] zArr8 = new boolean[1];
            zArr8[i2] = z3;
            C3192ck.m13744k4(iArr, str, c11683c5M55035k4, zArr7, zArr8);
            int i36 = iArr[i2];
            boolean z27 = zArr7[i2];
            z3 = zArr8[i2];
            if (!z27 || i36 >= str.length()) {
                z5 = z27 ? 1 : 0;
                i7 = i36;
            } else {
                iArr[i2] = i36;
                int i37 = (!z16 || C3192ck.m13751k4(iArr, str, true, z, runtimeExceptionArr)) ? i2 : 1;
                int i38 = iArr[i2];
                if (i37 != 0) {
                    return i2;
                }
                i7 = i38;
                z5 = z27 ? 1 : 0;
            }
        }
        if (z9 && z6 == 0) {
            iArr[i2] = i7;
            if (!z16 || i7 >= str.length()) {
                r62 = i2;
            } else {
                ?? r64 = i2;
                boolean zM13751k4 = C3192ck.m13751k4(iArr, str, (boolean) r64, z, runtimeExceptionArr);
                r62 = r64;
                if (!zM13751k4) {
                    z8 = true;
                    r63 = r64;
                }
                int i39 = iArr[r63 == true ? 1 : 0];
                if (!z8) {
                    return r63;
                }
                iArr[r63 == true ? 1 : 0] = i39;
                boolean[] zArr9 = new boolean[1];
                zArr9[r63 == true ? 1 : 0] = z6;
                C3192ck.m13743k4(iArr, str, c11683c5M55035k4, zArr9);
                int i40 = iArr[r63 == true ? 1 : 0];
                if (!zArr9[r63 == true ? 1 : 0] || i40 >= str.length()) {
                    i7 = i40;
                    r6 = r63;
                } else {
                    iArr[r63 == true ? 1 : 0] = i40;
                    boolean z28 = (!z16 || C3192ck.m13751k4(iArr, str, true, z, runtimeExceptionArr)) ? r63 == true ? 1 : 0 : true;
                    i7 = iArr[r63 == true ? 1 : 0];
                    r6 = r63;
                    r6 = r63;
                    if (z28) {
                        return r63;
                    }
                    if (z5 == 0 && z14) {
                        iArr[r63 == true ? 1 : 0] = i7;
                        boolean[] zArr10 = new boolean[1];
                        zArr10[r63 == true ? 1 : 0] = z5;
                        boolean[] zArr11 = new boolean[1];
                        zArr11[r63 == true ? 1 : 0] = z3;
                        C3192ck.m13744k4(iArr, str, c11683c5M55035k4, zArr10, zArr11);
                        i7 = iArr[r63 == true ? 1 : 0];
                        z3 = zArr11[r63 == true ? 1 : 0];
                        r6 = r63;
                    }
                }
            }
            z8 = r62 == true ? 1 : 0;
            r63 = r62;
            int i392 = iArr[r63 == true ? 1 : 0];
            if (!z8) {
            }
        } else {
            r6 = i2;
        }
        iArr[r6] = i7;
        ?? r21 = (!z16 || i7 >= str.length() || C3192ck.m13751k4(iArr, str, (boolean) r6, z, runtimeExceptionArr)) ? r6 : 1;
        int i41 = iArr[r6];
        if (r21 != 0) {
            return r6;
        }
        if (z4) {
            if (i41 < str.length()) {
                int i42 = i41 + 1;
                if (str.charAt(i41) == ')') {
                    iArr[r6] = i42;
                    ?? r212 = (!z16 || i42 >= str.length() || C3192ck.m13751k4(iArr, str, (boolean) r6, z, runtimeExceptionArr)) ? r6 : 1;
                    i41 = iArr[r6];
                    if (r212 != 0) {
                        return r6;
                    }
                }
            }
            if (!z) {
                runtimeExceptionArr[r6] = C3192ck.m13742k4();
            }
            return r6;
        }
        if (i41 < str.length() && str.charAt(i41) != 0) {
            if (!z) {
                runtimeExceptionArr[r6] = C3192ck.m13742k4();
            }
            return r6;
        }
        if (z3 && (jLongValue & 4294967295L) > 0) {
            if (!z) {
                runtimeExceptionArr[r6] = new OverflowException("Negative number");
            }
            return r6;
        }
        if (i8 > 0) {
            double dPow = Math.pow(10.0d, i8) * (jLongValue & 4294967295L);
            if (dPow < -2.147483648E9d || dPow > 2.147483647E9d) {
                if (z) {
                    return false;
                }
                runtimeExceptionArr[0] = new OverflowException("Value too large or too small.");
                return false;
            }
            jLongValue = (long) dPow;
        }
        jArr[0] = jLongValue;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b9  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m13901k4(String str, boolean z, long[] jArr, RuntimeException[] runtimeExceptionArr) {
        Object[] objArr;
        long j;
        Object[] objArr2;
        long j2;
        boolean z2 = false;
        long j3 = 0;
        jArr[0] = 0;
        runtimeExceptionArr[0] = null;
        if (str == null) {
            if (!z) {
                runtimeExceptionArr[0] = new ArgumentNullException("s");
            }
            return false;
        }
        int length = str.length();
        int i = 0;
        while (i < length && C14117yj.m67534ks(str.charAt(i))) {
            i++;
        }
        if (i == length) {
            if (!z) {
                runtimeExceptionArr[0] = C3192ck.m13742k4();
            }
            return false;
        }
        if (str.charAt(i) != '+') {
            if (str.charAt(i) == '-') {
                i++;
                objArr = false;
                j = 0;
                objArr2 = true;
            }
            while (i < length) {
                char cCharAt = str.charAt(i);
                boolean z3 = z2;
                if (cCharAt < '0' || cCharAt > '9') {
                    j2 = j3;
                    if (!C3192ck.m13749k4(z, str, i, runtimeExceptionArr)) {
                        return z3;
                    }
                } else {
                    j2 = j3;
                    long j4 = cCharAt - '0';
                    long j5 = j & 4294967295L;
                    if (j5 > 429496729 || (j5 == 429496729 && (j4 & 4294967295L) > 5)) {
                        if (!z) {
                            runtimeExceptionArr[z3 ? 1 : 0] = new OverflowException("Value is too large");
                        }
                        return z3;
                    }
                    j = (j5 * 10) + (j4 & 4294967295L);
                    objArr = true;
                }
                i++;
                z2 = z3 ? 1 : 0;
                j3 = j2;
            }
            boolean z4 = z2;
            long j6 = j3;
            if (objArr == true) {
                if (!z) {
                    runtimeExceptionArr[z4 ? 1 : 0] = C3192ck.m13742k4();
                }
                return z4;
            }
            if (!objArr2 == true || (j & 4294967295L) <= j6) {
                jArr[z4 ? 1 : 0] = j;
                return true;
            }
            if (!z) {
                runtimeExceptionArr[z4 ? 1 : 0] = new OverflowException("Negative number");
            }
            return z4;
        }
        i++;
        objArr = false;
        objArr2 = false;
        j = 0;
        while (i < length) {
        }
        boolean z42 = z2;
        long j62 = j3;
        if (objArr == true) {
        }
    }
}
