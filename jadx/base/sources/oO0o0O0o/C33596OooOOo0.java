package oO0o0O0o;

import com.aspose.words.ControlChar;
import io.ktor.utils.p616io.Oooo000;
import o000oo0.C24684Oooo;

/* JADX INFO: renamed from: oO0o0O0o.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C33596OooOOo0 extends C33594OooOOOo {
    /* JADX WARN: Removed duplicated region for block: B:106:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean OooOO0(String str) {
        char c;
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        int length = str.length() - 1;
        int i2 = 0;
        while (true) {
            c = ControlChar.SPACE_CHAR;
            if (i2 > length || str.charAt(i2) > ' ') {
                break;
            }
            i2++;
        }
        if (i2 > length) {
            return false;
        }
        while (length > i2 && str.charAt(length) <= ' ') {
            length--;
        }
        if (str.charAt(i2) == '+' || str.charAt(i2) == '-') {
            i2++;
        }
        if (i2 > length) {
            return false;
        }
        if (str.charAt(i2) != '0') {
            z = true;
            z2 = false;
        } else {
            int i3 = i2 + 1;
            if (i3 > length) {
                return true;
            }
            if ((str.charAt(i3) | ControlChar.SPACE_CHAR) == 120) {
                int i4 = i2 + 2;
                int i5 = i4;
                while (true) {
                    if (i5 > length) {
                        z = z5;
                        break;
                    }
                    z = z5;
                    if (((str.charAt(i5) - '0') & 65535) >= 10 && (((r15 | ControlChar.SPACE_CHAR) - 97) & 65535) >= 6) {
                        break;
                    }
                    i5++;
                    z5 = z;
                }
                boolean z6 = i4 != i5 ? z : false;
                if (i5 <= length) {
                    if (str.charAt(i5) == '.') {
                        int i6 = i5 + 1;
                        int i7 = i6;
                        while (i7 <= length) {
                            char c2 = c;
                            if (((str.charAt(i7) - '0') & 65535) >= 10 && (((r15 | ControlChar.SPACE_CHAR) - 97) & 65535) >= 6) {
                                break;
                            }
                            i7++;
                            c = c2;
                        }
                        z4 = i6 != i7 ? z : false;
                        i5 = i7;
                    } else {
                        z4 = false;
                    }
                    if (z6 || z4) {
                        i2 = i5;
                    }
                    if (i2 != -1 || i2 > length) {
                        return false;
                    }
                    z2 = z;
                }
                i2 = -1;
                if (i2 != -1) {
                }
                return false;
            }
        }
        if (!z2) {
            int i8 = i2;
            while (i8 <= length && ((str.charAt(i8) - '0') & 65535) < 10) {
                i8++;
            }
            boolean z7 = i2 != i8 ? z : false;
            if (i8 > length) {
                i2 = i8;
            } else {
                if (str.charAt(i8) == '.') {
                    int i9 = i8 + 1;
                    i = i9;
                    while (i <= length && ((str.charAt(i) - '0') & 65535) < 10) {
                        i++;
                    }
                    if (i9 != i) {
                        z3 = z;
                    }
                    if (!z7 || z3) {
                        i2 = i;
                    } else {
                        String str2 = length == i + 2 ? "NaN" : length == i + 7 ? "Infinity" : null;
                        i2 = (str2 != null && C33599OooOo0O.Oooo00O(str, str2, i, false) == i) ? length + 1 : -1;
                    }
                } else {
                    i = i8;
                }
                z3 = false;
                if (z7) {
                    i2 = i;
                }
            }
            if (i2 == -1) {
                return false;
            }
            if (i2 > length) {
                return z;
            }
        }
        int i10 = i2 + 1;
        int iCharAt = str.charAt(i2) | ControlChar.SPACE_CHAR;
        if (iCharAt != (z2 ? 112 : 101)) {
            if (z2 || (!(iCharAt == 102 || iCharAt == 100) || i10 <= length)) {
                return false;
            }
            return z;
        }
        if (i10 > length) {
            return false;
        }
        if ((str.charAt(i10) == '+' || str.charAt(i10) == '-') && (i10 = i2 + 2) > length) {
            return false;
        }
        while (i10 <= length && ((str.charAt(i10) - '0') & 65535) < 10) {
            i10++;
        }
        if (i10 > length) {
            return z;
        }
        if (i10 != length) {
            return false;
        }
        int iCharAt2 = str.charAt(i10) | ControlChar.SPACE_CHAR;
        if (iCharAt2 == 102 || iCharAt2 == 100) {
            return z;
        }
        return false;
    }

    public static final void OooOO0O(String str) {
        throw new NumberFormatException(C24684Oooo.OooO00o('\'', "Invalid number format: '", str));
    }

    public static Integer OooOO0o(int i, String str) {
        boolean z;
        int i2;
        int i3;
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        Oooo000.OooO0O0(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char cCharAt = str.charAt(0);
        int i5 = -2147483647;
        if (kotlin.jvm.internal.OooOOO0.OooO(cCharAt, 48) < 0) {
            i2 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i5 = Integer.MIN_VALUE;
                z = true;
            }
        } else {
            z = false;
            i2 = 0;
        }
        int i6 = -59652323;
        while (i2 < length) {
            int iDigit = Character.digit((int) str.charAt(i2), i);
            if (iDigit < 0) {
                return null;
            }
            if ((i4 < i6 && (i6 != -59652323 || i4 < (i6 = i5 / i))) || (i3 = i4 * i) < i5 + iDigit) {
                return null;
            }
            i4 = i3 - iDigit;
            i2++;
        }
        return z ? Integer.valueOf(i4) : Integer.valueOf(-i4);
    }

    public static Long OooOOO(String str) {
        boolean z;
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        Oooo000.OooO0O0(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (kotlin.jvm.internal.OooOOO0.OooO(cCharAt, 48) < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
                i = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i = 1;
            }
        } else {
            z = false;
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j2 < j3) {
                if (j3 != -256204778801521550L) {
                    return null;
                }
                j3 = j / ((long) 10);
                if (j2 < j3) {
                    return null;
                }
            }
            long j4 = j2 * ((long) 10);
            long j5 = iDigit;
            if (j4 < j + j5) {
                return null;
            }
            j2 = j4 - j5;
            i++;
        }
        return z ? Long.valueOf(j2) : Long.valueOf(-j2);
    }

    public static Integer OooOOO0(String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        return OooOO0o(10, str);
    }
}
