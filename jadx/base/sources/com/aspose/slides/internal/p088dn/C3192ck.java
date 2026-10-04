package com.aspose.slides.internal.p088dn;

import androidx.core.view.InputDeviceCompat;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.internal.p463vm.C11683c5;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: com.aspose.slides.internal.dn.ck */
/* JADX INFO: loaded from: classes3.dex */
public final class C3192ck {
    /* JADX INFO: renamed from: k4 */
    public static int m13738k4(String str) {
        int[] iArr = {0};
        RuntimeException[] runtimeExceptionArr = {null};
        boolean zM13748k4 = m13748k4(str, false, iArr, runtimeExceptionArr);
        int i = iArr[0];
        RuntimeException runtimeException = runtimeExceptionArr[0];
        if (zM13748k4) {
            return i;
        }
        throw runtimeException;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m13739k4(String str, int i) {
        return m13740k4(str, i, (InterfaceC14073kp) null);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m13740k4(String str, int i, InterfaceC14073kp interfaceC14073kp) {
        int[] iArr = {0};
        RuntimeException[] runtimeExceptionArr = {null};
        boolean zM13747k4 = m13747k4(str, i, interfaceC14073kp, false, iArr, runtimeExceptionArr);
        int i2 = iArr[0];
        RuntimeException runtimeException = runtimeExceptionArr[0];
        if (zM13747k4) {
            return i2;
        }
        throw runtimeException;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m13741k4(String str, InterfaceC14073kp interfaceC14073kp) {
        return m13740k4(str, 7, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: k4 */
    public static Exception m13742k4() {
        return new FormatException("Input string was not in the correct format");
    }

    /* JADX INFO: renamed from: k4 */
    public static void m13743k4(int[] iArr, String str, C11683c5 c11683c5, boolean[] zArr) {
        if (c11683c5.m55040c5().length() + iArr[0] > str.length() || !C14113y2.m67363du(C14113y2.m67443x1(str, iArr[0], c11683c5.m55040c5().length()), c11683c5.m55040c5())) {
            return;
        }
        zArr[0] = true;
        iArr[0] = c11683c5.m55040c5().length() + iArr[0];
    }

    /* JADX INFO: renamed from: k4 */
    public static void m13744k4(int[] iArr, String str, C11683c5 c11683c5, boolean[] zArr, boolean[] zArr2) {
        if (c11683c5.m55064rv().length() + iArr[0] <= str.length()) {
            int iM67438x1 = C14113y2.m67438x1(str, c11683c5.m55064rv(), iArr[0], c11683c5.m55064rv().length(), (short) 4);
            int i = iArr[0];
            if (iM67438x1 == i) {
                zArr2[0] = true;
                zArr[0] = true;
                iArr[0] = c11683c5.m55064rv().length() + i;
                return;
            }
        }
        if (c11683c5.m55042dq().length() + iArr[0] <= str.length()) {
            int iM67438x12 = C14113y2.m67438x1(str, c11683c5.m55042dq(), iArr[0], c11683c5.m55042dq().length(), (short) 4);
            int i2 = iArr[0];
            if (iM67438x12 == i2) {
                zArr2[0] = false;
                iArr[0] = c11683c5.m55042dq().length() + i2;
                zArr[0] = true;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m13745k4(char c, boolean z) {
        if (!z) {
            return C14117yj.m67539to(c);
        }
        if (C14117yj.m67539to(c)) {
            return true;
        }
        if (c < 'A' || c > 'F') {
            return c >= 'a' && c <= 'f';
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m13746k4(int i, boolean z, RuntimeException[] runtimeExceptionArr) {
        if ((i & 512) == 0) {
            if (i <= 511) {
                return true;
            }
            if (!z) {
                runtimeExceptionArr[0] = new ArgumentException("Not a valid number style");
            }
            return false;
        }
        int i2 = i ^ 512;
        if ((i2 & 1) != 0) {
            i2 = i ^ InputDeviceCompat.SOURCE_DPAD;
        }
        if ((i2 & 2) != 0) {
            i2 ^= 2;
        }
        if (i2 == 0) {
            return true;
        }
        if (!z) {
            runtimeExceptionArr[0] = new ArgumentException(C14113y2.m67408k4("With AllowHexSpecifier only ", "AllowLeadingWhite and AllowTrailingWhite ", "are permitted."));
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x026e, code lost:
    
        r27 = r8;
        r28 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x04e8, code lost:
    
        if (r42 != false) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x04ea, code lost:
    
        r44[r17] = new com.aspose.slides.exceptions.OverflowException("Value too large or too small.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x04f1, code lost:
    
        return r17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01de A[PHI: r21
      0x01de: PHI (r21v2 int) = (r21v1 int), (r21v3 int), (r21v3 int), (r21v3 int) binds: [B:129:0x0197, B:139:0x01ac, B:140:0x01ae, B:141:0x01b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x04e0 A[LOOP:0: B:156:0x01ee->B:363:0x04e0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x033f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v55 */
    /* JADX WARN: Type inference failed for: r8v56 */
    /* JADX WARN: Type inference failed for: r8v57 */
    /* JADX WARN: Type inference failed for: r8v58 */
    /* JADX WARN: Type inference failed for: r8v59 */
    /* JADX WARN: Type inference failed for: r8v60 */
    /* JADX WARN: Type inference failed for: r8v61 */
    /* JADX WARN: Type inference failed for: r8v62 */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m13747k4(String str, int i, InterfaceC14073kp interfaceC14073kp, boolean z, int[] iArr, RuntimeException[] runtimeExceptionArr) {
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        int i3;
        boolean z5;
        ?? r1;
        boolean z6;
        boolean z7;
        int i4;
        boolean z8;
        boolean z9;
        boolean z10;
        int i5;
        boolean z11;
        int i6;
        int i7;
        ?? r8;
        ?? r82;
        boolean z12;
        ?? r83;
        boolean z13;
        boolean z14;
        boolean z15;
        iArr[0] = 0;
        runtimeExceptionArr[0] = null;
        if (str == null) {
            if (!z) {
                runtimeExceptionArr[0] = new ArgumentNullException("s");
            }
            return false;
        }
        if (str.length() == 0) {
            if (!z) {
                runtimeExceptionArr[0] = m13742k4();
            }
            return false;
        }
        C11683c5 c11683c5M55035k4 = interfaceC14073kp != null ? C11683c5.m55035k4(interfaceC14073kp) : null;
        if (c11683c5M55035k4 == null) {
            c11683c5M55035k4 = C11697x1.m55252to().m55263fa();
        }
        if (!m13746k4(i, z, runtimeExceptionArr)) {
            return false;
        }
        boolean z16 = (i & 256) != 0;
        boolean z17 = (i & 512) != 0;
        boolean z18 = (i & 64) != 0;
        boolean z19 = (i & 32) != 0;
        boolean z20 = (i & 16) != 0;
        boolean z21 = (i & 8) != 0;
        boolean z22 = (i & 4) != 0;
        boolean z23 = (i & 2) != 0;
        boolean z24 = (i & 1) != 0;
        if ((i & 128) != 0) {
            z2 = true;
            i2 = 0;
        } else {
            z2 = false;
            i2 = 0;
        }
        int[] iArr2 = new int[1];
        iArr2[i2] = i2;
        int i8 = (!z24 || m13751k4(iArr2, str, true, z, runtimeExceptionArr)) ? i2 : 1;
        char c = '0';
        int i9 = iArr2[i2];
        if (i8 != 0) {
            return i2;
        }
        if (z20 && str.charAt(i9) == '(') {
            iArr2[i2] = i9 + 1;
            int i10 = (!z24 || m13751k4(iArr2, str, true, z, runtimeExceptionArr)) ? i2 : 1;
            int i11 = iArr2[i2];
            if (i10 != 0) {
                return i2;
            }
            if (C14113y2.m67363du(C14113y2.m67443x1(str, i11, c11683c5M55035k4.m55064rv().length()), c11683c5M55035k4.m55064rv())) {
                if (!z) {
                    runtimeExceptionArr[i2] = m13742k4();
                }
                return i2;
            }
            if (C14113y2.m67363du(C14113y2.m67443x1(str, i11, c11683c5M55035k4.m55042dq().length()), c11683c5M55035k4.m55042dq())) {
                if (!z) {
                    runtimeExceptionArr[i2] = m13742k4();
                }
                return i2;
            }
            i9 = i11;
            i3 = 1;
            z3 = true;
            z4 = true;
        } else {
            int i12 = i2;
            z3 = i12 == true ? 1 : 0;
            z4 = z3 ? 1 : 0;
            i3 = i12;
        }
        if (!z22 || z3) {
            z5 = z2;
        } else {
            iArr2[i2] = i9;
            boolean z25 = z2;
            boolean[] zArr = new boolean[1];
            zArr[i2] = z3;
            boolean[] zArr2 = new boolean[1];
            zArr2[i2] = z4;
            m13744k4(iArr2, str, c11683c5M55035k4, zArr, zArr2);
            i9 = iArr2[i2];
            boolean z26 = zArr[i2];
            z4 = zArr2[i2];
            if (z26) {
                iArr2[i2] = i9;
                int i13 = (!z24 || m13751k4(iArr2, str, true, z, runtimeExceptionArr)) ? i2 : 1;
                int i14 = iArr2[i2];
                if (i13 != 0) {
                    return i2;
                }
                if (z4 && i14 > i9) {
                    return i2;
                }
                if (z16) {
                    iArr2[i2] = i14;
                    boolean[] zArr3 = new boolean[1];
                    zArr3[i2] = i2;
                    m13743k4(iArr2, str, c11683c5M55035k4, zArr3);
                    int i15 = iArr2[i2];
                    boolean z27 = zArr3[i2];
                    iArr2[i2] = i15;
                    int i16 = (z27 && z24 && !m13751k4(iArr2, str, true, z, runtimeExceptionArr)) ? 1 : i2;
                    int i17 = iArr2[i2];
                    if (i16 != 0) {
                        return i2;
                    }
                    i9 = i17;
                    z3 = z26 ? 1 : 0;
                    r1 = z27;
                    z6 = z25;
                    if (z16 || r1 != 0) {
                        z7 = r1 == true ? 1 : 0;
                    } else {
                        iArr2[i2] = i9 == true ? 1 : 0;
                        boolean z28 = r1;
                        boolean[] zArr4 = new boolean[1];
                        zArr4[i2] = z28;
                        m13743k4(iArr2, str, c11683c5M55035k4, zArr4);
                        int i18 = iArr2[i2];
                        z7 = zArr4[i2];
                        if (z7) {
                            iArr2[i2] = i18;
                            int i19 = (!z24 || m13751k4(iArr2, str, true, z, runtimeExceptionArr)) ? i2 : 1;
                            i18 = iArr2[i2];
                            if (i19 != 0) {
                                return i2;
                            }
                            if (z7 && !z3 && z22) {
                                iArr2[i2] = i18;
                                boolean[] zArr5 = new boolean[1];
                                zArr5[i2] = z3;
                                boolean[] zArr6 = new boolean[1];
                                zArr6[i2] = z4;
                                m13744k4(iArr2, str, c11683c5M55035k4, zArr5, zArr6);
                                int i20 = iArr2[i2];
                                boolean z29 = zArr5[i2];
                                z4 = zArr6[i2];
                                iArr2[i2] = i20;
                                int i21 = (z29 && z24 && !m13751k4(iArr2, str, true, z, runtimeExceptionArr)) ? 1 : i2;
                                int i22 = iArr2[i2];
                                if (i21 != 0) {
                                    return i2;
                                }
                                i9 = i22;
                                z3 = z29 ? 1 : 0;
                            } else {
                                i9 = i18;
                            }
                        }
                    }
                    boolean z30 = z7;
                    int i23 = i3;
                    int iIntValue = i2;
                    boolean z31 = iIntValue == true ? 1 : 0;
                    i4 = z31 ? 1 : 0;
                    z9 = z16;
                    z8 = z31;
                    while (true) {
                        if (m13745k4(str.charAt(i9), z17)) {
                            iArr2[i2] = i9;
                            int i24 = (z18 && (m13750k4(iArr2, str, c11683c5M55035k4.m55050ix()) || m13750k4(iArr2, str, c11683c5M55035k4.m55065to()))) ? 1 : i2;
                            i5 = iArr2[i2];
                            if (i24 == 0) {
                                iArr2[i2] = i5;
                                int i25 = (!z8 && z19 && (m13750k4(iArr2, str, c11683c5M55035k4.m55062ne()) || m13750k4(iArr2, str, c11683c5M55035k4.m55056kk()))) ? 1 : i2;
                                i5 = iArr2[i2];
                                if (i25 == 0) {
                                    if (!z9) {
                                        break;
                                    }
                                    iArr2[i2] = i5;
                                    int i26 = (z9 && m13750k4(iArr2, str, c11683c5M55035k4.m55040c5())) ? 1 : i2;
                                    i5 = iArr2[i2];
                                    if (i26 == 0) {
                                        break;
                                    }
                                } else {
                                    z13 = z9;
                                    z10 = z17;
                                    i9 = i5;
                                    z14 = true;
                                    if (i9 < str.length()) {
                                        i5 = i9;
                                        z11 = z13;
                                        break;
                                    }
                                    z9 = z13;
                                    z17 = z10;
                                    z8 = z14;
                                }
                            }
                            z15 = z9;
                            z10 = z17;
                            i9 = i5;
                            z14 = z8;
                            z13 = z15;
                            if (i9 < str.length()) {
                            }
                        } else {
                            if (z17) {
                                i4++;
                                i5 = i9 + 1;
                                char cCharAt = str.charAt(i9);
                                int i27 = C14117yj.m67539to(cCharAt) ? cCharAt - '0' : C14117yj.m67517dy(cCharAt) ? cCharAt - 'W' : cCharAt - '7';
                                boolean z32 = z9;
                                z10 = z17;
                                long j = iIntValue;
                                long j2 = j & 4294967295L;
                                if (!z) {
                                    iIntValue = (int) (((j2 * 16) + (((long) i27) & 4294967295L)) & 4294967295L);
                                    z15 = z32;
                                    if (iIntValue == 0) {
                                        z15 = z32;
                                        if (j != 0) {
                                            runtimeExceptionArr[i2] = new OverflowException("Value too large or too small.");
                                            return i2;
                                        }
                                    }
                                } else {
                                    if ((j & 4026531840L) != 0) {
                                        return i2;
                                    }
                                    iIntValue = (int) ((j2 * 16) + (((long) i27) & 4294967295L));
                                    z15 = z32;
                                }
                            } else {
                                boolean z33 = z9;
                                z10 = z17;
                                i4++;
                                if (z8) {
                                    int i28 = i9 + 1;
                                    char c2 = c;
                                    if (str.charAt(i9) != c2) {
                                        if (!z) {
                                            runtimeExceptionArr[i2] = new OverflowException("Value too large or too small.");
                                        }
                                        return i2;
                                    }
                                    i9 = i28;
                                    c = c2;
                                    z14 = z8;
                                    z13 = z33;
                                    if (i9 < str.length()) {
                                    }
                                } else {
                                    c = '0';
                                    i5 = i9 + 1;
                                    BigInteger bigIntegerSubtract = BigInteger.valueOf(iIntValue).multiply(BigInteger.valueOf(10L)).subtract(BigInteger.valueOf(str.charAt(i9) - '0'));
                                    if (bigIntegerSubtract.compareTo(BigInteger.valueOf(2147483647L)) > 0 || bigIntegerSubtract.compareTo(BigInteger.valueOf(-2147483648L)) < 0) {
                                        break;
                                    }
                                    iIntValue = bigIntegerSubtract.intValue();
                                    z15 = z33;
                                }
                            }
                            i9 = i5;
                            z14 = z8;
                            z13 = z15;
                            if (i9 < str.length()) {
                            }
                        }
                    }
                    if (i4 != 0) {
                        if (!z) {
                            runtimeExceptionArr[i2] = m13742k4();
                        }
                        return i2;
                    }
                    if (z6) {
                        iArr2[i2] = i5;
                        int[] iArr3 = {i2};
                        int i29 = (!m13752k4(iArr2, str, iArr3, z, runtimeExceptionArr) || runtimeExceptionArr[i2] == null) ? i2 : 1;
                        i5 = iArr2[i2];
                        i6 = iArr3[i2];
                        if (i29 != 0) {
                            return i2;
                        }
                    } else {
                        i6 = i2;
                    }
                    if (!z21 || z3) {
                        i7 = i5;
                    } else {
                        iArr2[i2] = i5;
                        boolean[] zArr7 = new boolean[1];
                        zArr7[i2] = z3;
                        boolean[] zArr8 = new boolean[1];
                        zArr8[i2] = z4;
                        m13744k4(iArr2, str, c11683c5M55035k4, zArr7, zArr8);
                        i7 = iArr2[i2];
                        z3 = zArr7[i2];
                        z4 = zArr8[i2];
                        if (z3 && i7 < str.length()) {
                            iArr2[i2] = i7;
                            int i30 = (!z23 || m13751k4(iArr2, str, true, z, runtimeExceptionArr)) ? i2 : 1;
                            i5 = iArr2[i2];
                            if (i30 != 0) {
                                return i2;
                            }
                            i7 = i5;
                        }
                    }
                    if (z11 && z30 == 0) {
                        iArr2[i2] = i7;
                        if (!z23 || i7 >= str.length()) {
                            r82 = i2;
                        } else {
                            ?? r84 = i2;
                            boolean zM13751k4 = m13751k4(iArr2, str, (boolean) r84, z, runtimeExceptionArr);
                            r82 = r84;
                            if (!zM13751k4) {
                                z12 = true;
                                r83 = r84;
                            }
                            int i31 = iArr2[r83 == true ? 1 : 0];
                            if (!z12) {
                                return r83;
                            }
                            iArr2[r83 == true ? 1 : 0] = i31;
                            boolean[] zArr9 = new boolean[1];
                            zArr9[r83 == true ? 1 : 0] = z30;
                            m13743k4(iArr2, str, c11683c5M55035k4, zArr9);
                            i7 = iArr2[r83 == true ? 1 : 0];
                            boolean z34 = zArr9[r83 == true ? 1 : 0];
                            r8 = r83;
                            if (z34) {
                                r8 = r83;
                                if (i7 < str.length()) {
                                    iArr2[r83 == true ? 1 : 0] = i7;
                                    boolean z35 = (!z23 || m13751k4(iArr2, str, true, z, runtimeExceptionArr)) ? r83 == true ? 1 : 0 : true;
                                    i7 = iArr2[r83 == true ? 1 : 0];
                                    r8 = r83;
                                    r8 = r83;
                                    if (z35) {
                                        return r83;
                                    }
                                    if (!z3 && z21) {
                                        iArr2[r83 == true ? 1 : 0] = i7;
                                        boolean[] zArr10 = new boolean[1];
                                        zArr10[r83 == true ? 1 : 0] = z3;
                                        boolean[] zArr11 = new boolean[1];
                                        zArr11[r83 == true ? 1 : 0] = z4;
                                        m13744k4(iArr2, str, c11683c5M55035k4, zArr10, zArr11);
                                        int i32 = iArr2[r83 == true ? 1 : 0];
                                        z4 = zArr11[r83 == true ? 1 : 0];
                                        i7 = i32;
                                        r8 = r83;
                                    }
                                }
                            }
                        }
                        z12 = r82 == true ? 1 : 0;
                        r83 = r82;
                        int i312 = iArr2[r83 == true ? 1 : 0];
                        if (!z12) {
                        }
                    } else {
                        r8 = i2;
                    }
                    iArr2[r8] = i7;
                    ?? r17 = (!z23 || i7 >= str.length() || m13751k4(iArr2, str, (boolean) r8, z, runtimeExceptionArr)) ? r8 : 1;
                    int i33 = iArr2[r8];
                    if (r17 != 0) {
                        return r8;
                    }
                    if (i23 != 0) {
                        if (i33 < str.length()) {
                            int i34 = i33 + 1;
                            if (str.charAt(i33) == ')') {
                                iArr2[r8] = i34;
                                ?? r172 = (!z23 || i34 >= str.length() || m13751k4(iArr2, str, (boolean) r8, z, runtimeExceptionArr)) ? r8 : 1;
                                i33 = iArr2[r8];
                                if (r172 != 0) {
                                    return r8;
                                }
                            }
                        }
                        if (!z) {
                            runtimeExceptionArr[r8] = m13742k4();
                        }
                        return r8;
                    }
                    if (i33 < str.length() && str.charAt(i33) != 0) {
                        if (!z) {
                            runtimeExceptionArr[r8] = m13742k4();
                        }
                        return r8;
                    }
                    if (!z4 && !z10) {
                        if (z) {
                            long j3 = -iIntValue;
                            if (j3 < -2147483648L || j3 > 2147483647L) {
                                return false;
                            }
                            iIntValue = (int) j3;
                        } else {
                            long j4 = -iIntValue;
                            if (j4 > 2147483647L || j4 < -2147483648L) {
                                runtimeExceptionArr[0] = new OverflowException("Value too large or too small.");
                                return false;
                            }
                            iIntValue = -iIntValue;
                        }
                    }
                    if (i6 > 0) {
                        BigDecimal bigDecimalMultiply = BigDecimal.valueOf(Math.pow(10.0d, i6)).multiply(BigDecimal.valueOf(iIntValue));
                        if (bigDecimalMultiply.compareTo(BigDecimal.valueOf(-2147483648L)) < 0 || bigDecimalMultiply.compareTo(BigDecimal.valueOf(2147483647L)) > 0) {
                            if (z) {
                                return false;
                            }
                            runtimeExceptionArr[0] = new OverflowException("Value too large or too small.");
                            return false;
                        }
                        iIntValue = bigDecimalMultiply.intValue();
                    }
                    iArr[0] = iIntValue;
                    return true;
                }
                z3 = z26 ? 1 : 0;
                i9 = i14;
                z5 = z25;
            } else {
                z3 = z26 ? 1 : 0;
                z5 = z25;
            }
        }
        r1 = i2;
        z6 = z5;
        if (z16) {
            z7 = r1 == true ? 1 : 0;
        }
        boolean z302 = z7;
        int i232 = i3;
        int iIntValue2 = i2;
        boolean z312 = iIntValue2 == true ? 1 : 0;
        i4 = z312 ? 1 : 0;
        z9 = z16;
        z8 = z312;
        while (true) {
            if (m13745k4(str.charAt(i9), z17)) {
            }
            z9 = z13;
            z17 = z10;
            z8 = z14;
        }
        if (i4 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f1  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m13748k4(String str, boolean z, int[] iArr, RuntimeException[] runtimeExceptionArr) {
        boolean z2;
        int i;
        int i2;
        iArr[0] = 0;
        runtimeExceptionArr[0] = null;
        C11683c5 c11683c5M55263fa = C11697x1.m55252to().m55263fa();
        if (str == null) {
            if (!z) {
                runtimeExceptionArr[0] = new ArgumentNullException("s");
            }
            return false;
        }
        int length = str.length();
        int length2 = 0;
        while (length2 < length && C14117yj.m67534ks(str.charAt(length2))) {
            length2++;
        }
        if (length2 == length) {
            if (!z) {
                runtimeExceptionArr[0] = m13742k4();
            }
            return false;
        }
        if (C14113y2.m67375k4(str, length2, c11683c5M55263fa.m55042dq(), 0, c11683c5M55263fa.m55042dq().length()) != 0) {
            if (C14113y2.m67375k4(str, length2, c11683c5M55263fa.m55064rv(), 0, c11683c5M55263fa.m55064rv().length()) == 0) {
                length2 += c11683c5M55263fa.m55064rv().length();
                z2 = false;
                i = 0;
                i2 = -1;
            }
            while (length2 < length) {
                char cCharAt = str.charAt(length2);
                if (cCharAt == 0) {
                    length2 = length;
                } else if (cCharAt >= '0' && cCharAt <= '9') {
                    byte b = (byte) (cCharAt - '0');
                    if (i > 214748364) {
                        if (!z) {
                            runtimeExceptionArr[0] = new OverflowException("Value is too large");
                        }
                        return false;
                    }
                    if (i == 214748364) {
                        int i3 = b & 255;
                        if (i3 > 7 && (i2 == 1 || i3 > 8)) {
                            if (!z) {
                                runtimeExceptionArr[0] = new OverflowException("Value is too large");
                            }
                            return false;
                        }
                        int i4 = i2 == -1 ? ((i * i2) * 10) - i3 : (i * 10) + i3;
                        if (m13749k4(z, str, length2 + 1, runtimeExceptionArr)) {
                            iArr[0] = i4;
                            return true;
                        }
                        if (!z) {
                            runtimeExceptionArr[0] = new OverflowException("Value is too large");
                        }
                        return false;
                    }
                    i = (i * 10) + (b & 255);
                    z2 = true;
                } else if (!m13749k4(z, str, length2, runtimeExceptionArr)) {
                    return false;
                }
                length2++;
            }
            if (z2) {
                if (!z) {
                    runtimeExceptionArr[0] = m13742k4();
                }
                return false;
            }
            if (i2 == -1) {
                iArr[0] = i * i2;
            } else {
                iArr[0] = i;
            }
            return true;
        }
        length2 += c11683c5M55263fa.m55042dq().length();
        z2 = false;
        i = 0;
        i2 = 1;
        while (length2 < length) {
        }
        if (z2) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m13749k4(boolean z, String str, int i, RuntimeException[] runtimeExceptionArr) {
        int length = str.length();
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt != 0 && !C14117yj.m67534ks(cCharAt)) {
                if (!z) {
                    runtimeExceptionArr[0] = m13742k4();
                }
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m13750k4(int[] iArr, String str, String str2) {
        if (str2.length() + iArr[0] > str.length() || !C14113y2.m67363du(C14113y2.m67443x1(str, iArr[0], str2.length()), str2)) {
            return false;
        }
        iArr[0] = str2.length() + iArr[0];
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m13751k4(int[] iArr, String str, boolean z, boolean z2, RuntimeException[] runtimeExceptionArr) {
        while (iArr[0] < str.length() && C14117yj.m67534ks(str.charAt(iArr[0]))) {
            iArr[0] = iArr[0] + 1;
        }
        if (!z || iArr[0] < str.length()) {
            return true;
        }
        if (!z2) {
            runtimeExceptionArr[0] = m13742k4();
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m13752k4(int[] iArr, String str, int[] iArr2, boolean z, RuntimeException[] runtimeExceptionArr) {
        iArr2[0] = 0;
        int iM67385k4 = C14113y2.m67385k4(str, new char[]{'e', 'E'}, iArr[0]);
        if (iM67385k4 < 0) {
            runtimeExceptionArr[0] = null;
            return false;
        }
        int i = iM67385k4 + 1;
        if (i == str.length()) {
            runtimeExceptionArr[0] = z ? null : m13742k4();
            return true;
        }
        if (str.charAt(i) == '-') {
            runtimeExceptionArr[0] = z ? null : new OverflowException("Value too large or too small.");
            return true;
        }
        long jLongValue = 0;
        if (str.charAt(i) != '+' || (i = iM67385k4 + 2) != str.length()) {
            while (i < str.length()) {
                if (!C14117yj.m67539to(str.charAt(i))) {
                    runtimeExceptionArr[0] = z ? null : m13742k4();
                    return true;
                }
                BigInteger bigIntegerSubtract = BigInteger.valueOf(jLongValue * 10).subtract(BigInteger.valueOf(str.charAt(i) - '0'));
                if (bigIntegerSubtract.compareTo(BigInteger.valueOf(-2147483648L)) < 0 || bigIntegerSubtract.compareTo(BigInteger.valueOf(2147483647L)) > 0) {
                    runtimeExceptionArr[0] = z ? null : new OverflowException("Value too large or too small.");
                    return true;
                }
                jLongValue = bigIntegerSubtract.longValue();
                i++;
            }
            runtimeExceptionArr[0] = null;
            iArr2[0] = (int) (-jLongValue);
            iArr[0] = i;
            return true;
        }
        runtimeExceptionArr[0] = z ? null : m13742k4();
        return true;
    }
}
