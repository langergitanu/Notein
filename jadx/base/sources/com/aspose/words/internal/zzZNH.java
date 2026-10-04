package com.aspose.words.internal;

import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.words.ControlChar;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZNH {
    public static StringBuilder zzU(StringBuilder sb, String str) {
        if (str != null) {
            sb.append(str);
        }
        return sb;
    }

    public static StringBuilder zzV(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        return sb;
    }

    public static StringBuilder zzW(StringBuilder sb, int i) {
        if (i == 0) {
            return sb;
        }
        if (i < 0) {
            throw new IllegalArgumentException("repeatCount is negative!");
        }
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = '0';
        }
        return sb.insert(0, cArr);
    }

    public static StringBuilder zzZ(StringBuilder sb, Object obj) {
        if (obj != null) {
            sb.append(obj);
        }
        return sb;
    }

    public static StringBuilder zzZ(StringBuilder sb, char c, int i) {
        if (i == 0) {
            return sb;
        }
        if (i < 0) {
            throw new IllegalArgumentException("repeatCount is negative!");
        }
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = c;
        }
        sb.append(cArr);
        return sb;
    }

    public static StringBuilder zzZ(StringBuilder sb, int i, String str, int i2) {
        String strSubstring;
        if (str == null || str.length() == 0 || i2 == 0) {
            return sb;
        }
        if (i2 >= 0) {
            int length = sb.length();
            if (i >= 0 && i <= length) {
                sb.ensureCapacity((str.length() * i2) + length);
                if (i < length) {
                    strSubstring = sb.substring(i);
                    sb.setLength(i);
                } else {
                    strSubstring = null;
                }
                for (int i3 = 0; i3 < i2; i3++) {
                    sb.append(str);
                }
                if (strSubstring != null) {
                    sb.append(strSubstring);
                }
                return sb;
            }
            throw new IllegalArgumentException("index is out of bounds!");
        }
        throw new IllegalArgumentException("count is negative!");
    }

    public static StringBuilder zzZ(StringBuilder sb, String str, String str2) {
        if (str != null) {
            if (!"".equals(str)) {
                if (str2 == null) {
                    str2 = "";
                }
                int length = str.length();
                int length2 = str2.length();
                int i = 0;
                while (true) {
                    int iIndexOf = sb.indexOf(str, i);
                    if (iIndexOf < 0) {
                        return sb;
                    }
                    sb.replace(iIndexOf, iIndexOf + length, str2);
                    i = iIndexOf + length2;
                }
            } else {
                throw new IllegalArgumentException("oldStr");
            }
        } else {
            throw new NullPointerException("oldStr");
        }
    }

    public static StringBuilder zzZ(StringBuilder sb, String str, String str2, int i, int i2) {
        int i3;
        int length = sb.length();
        if (i > length) {
            throw new IndexOutOfBoundsException("startIndex is not within this instance");
        }
        if (i2 < 0 || i > length - i2) {
            throw new IllegalArgumentException("count cannot be less than zero");
        }
        if (str != null) {
            if (str.isEmpty()) {
                throw new IllegalArgumentException("oldValue is empty");
            }
            if (i >= 0) {
                int i4 = i + i2;
                if (i4 <= sb.length()) {
                    int length2 = str.length();
                    if (i2 >= length2) {
                        int length3 = str2.length();
                        while (true) {
                            int iIndexOf = sb.indexOf(str, i);
                            if (iIndexOf < 0 || (i3 = iIndexOf + length2) > i4) {
                                break;
                            }
                            sb.replace(iIndexOf, i3, str2);
                            i = iIndexOf + length3;
                            i4 = (i4 - length2) + length3;
                        }
                    }
                    return sb;
                }
                throw new IllegalArgumentException("startIndex + count is not within this instance");
            }
            throw new IllegalArgumentException("startIndex cannot be less than zero");
        }
        throw new NullPointerException("oldValue is null");
    }

    public static StringBuilder zzZ(StringBuilder sb, char c, char c2) {
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == c) {
                sb.setCharAt(i, c2);
            }
        }
        return sb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x011b, code lost:
    
        throw new java.lang.IllegalArgumentException(androidx.appcompat.widget.C21532OooOOo.OooO0OO(r12, "Invalid Format String at position: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01c1, code lost:
    
        throw new java.lang.IllegalArgumentException(androidx.appcompat.widget.C21532OooOOo.OooO0OO(r6, "Invalid Format String at position: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        throw new java.lang.IllegalArgumentException(androidx.appcompat.widget.C21532OooOOo.OooO0OO(r12, "Invalid Format String at position: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e1, code lost:
    
        throw new java.lang.IllegalArgumentException(androidx.appcompat.widget.C21532OooOOo.OooO0OO(r6, "Invalid Format String at position: "));
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static StringBuilder zzZ(StringBuilder sb, String str, Object... objArr) {
        char c;
        int i;
        char c2;
        int i2;
        boolean z;
        String str2;
        String string;
        char c3;
        boolean z2;
        char c4;
        if (str != null && objArr != null) {
            char[] charArray = str.toCharArray();
            int length = charArray.length;
            int i3 = 0;
            loop0: while (true) {
                int i4 = i3;
                int i5 = i4;
                while (i4 < length) {
                    char c5 = charArray[i4];
                    int i6 = i4 + 1;
                    if (c5 == '}') {
                        if (i6 >= length || charArray[i6] != '}') {
                            break loop0;
                        }
                        i6 = i4 + 2;
                    }
                    if (c5 == '{') {
                        if (i6 >= length || charArray[i6] != '{') {
                            i4 = i6 - 1;
                            break;
                        }
                        i6++;
                    }
                    i4 = i6;
                    charArray[i5] = c5;
                    i5++;
                }
                if (i5 > i3) {
                    sb.append(charArray, i3, i5 - i3);
                }
                if (i4 == length) {
                    return sb;
                }
                int i7 = i4 + 1;
                if (i7 == length || (c = charArray[i7]) < '0' || c > '9') {
                    break;
                }
                int i8 = 0;
                while (true) {
                    i8 = ((i8 * 10) + c) - 48;
                    i = 1;
                    i7++;
                    if (i7 != length) {
                        c2 = charArray[i7];
                        if (c2 < '0' || c2 > '9' || i8 >= 1000000) {
                            break;
                        }
                        c = c2;
                    } else {
                        throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i7, "Invalid Format String at position: "));
                    }
                }
                if (i8 < objArr.length) {
                    while (i7 < length && (c2 = charArray[i7]) == ' ') {
                        i7++;
                    }
                    if (c2 == ',') {
                        do {
                            i7++;
                            if (i7 >= length) {
                                break;
                            }
                        } while (charArray[i7] == ' ');
                        if (i7 != length) {
                            char c6 = charArray[i7];
                            if (c6 == '-') {
                                i7++;
                                if (i7 != length) {
                                    c6 = charArray[i7];
                                    z2 = true;
                                } else {
                                    throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i7, "Invalid Format String at position: "));
                                }
                            } else {
                                z2 = false;
                            }
                            if (c6 < '0' || c6 > '9') {
                                break;
                            }
                            int i9 = 0;
                            while (true) {
                                i2 = ((i9 * 10) + c6) - 48;
                                i7 += i;
                                if (i7 != length) {
                                    c4 = charArray[i7];
                                    if (c4 < '0' || c4 > '9' || i2 >= 1000000) {
                                        break;
                                    }
                                    i9 = i2;
                                    c6 = c4;
                                    i = 1;
                                } else {
                                    throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i7, "Invalid Format String at position: "));
                                }
                            }
                            boolean z3 = z2;
                            c2 = c4;
                            z = z3;
                        } else {
                            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i7, "Invalid Format String at position: "));
                        }
                    } else {
                        i2 = 0;
                        z = false;
                    }
                    while (i7 < length) {
                        c2 = charArray[i7];
                        if (c2 != ' ') {
                            break;
                        }
                        i7++;
                    }
                    Object obj = objArr[i8];
                    if (c2 == ':') {
                        int i10 = i7 + 1;
                        int i11 = i10;
                        int i12 = i11;
                        while (i11 != length) {
                            char c7 = charArray[i11];
                            int i13 = i11 + 1;
                            if (c7 == '{') {
                                if (i13 >= length || charArray[i13] != '{') {
                                    break loop0;
                                }
                            } else if (c7 == '}') {
                                if (i13 >= length || charArray[i13] != '}') {
                                    if (i12 > i10) {
                                        str2 = new String(charArray, i10, i12 - i10);
                                        i7 = i11;
                                        c2 = c7;
                                    } else {
                                        i7 = i11;
                                        c2 = c7;
                                        str2 = null;
                                    }
                                }
                            } else {
                                i11 = i13;
                                charArray[i12] = c7;
                                i12++;
                            }
                            i11 += 2;
                            charArray[i12] = c7;
                            i12++;
                        }
                        throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i11, "Invalid Format String at position: "));
                    }
                    str2 = null;
                    if (c2 == '}') {
                        int i14 = i7 + 1;
                        if (obj == null) {
                            string = "";
                        } else if (!(obj instanceof String)) {
                            if (obj instanceof Number) {
                                string = zzZKP.zzQ(obj, str2);
                            } else if (obj instanceof zzZOZ) {
                                string = ((zzZOZ) obj).toString(str2);
                            } else if (obj instanceof zzZQ9) {
                                string = ((zzZQ9) obj).toString(str2);
                            }
                        } else {
                            string = obj.toString();
                        }
                        String str3 = string != null ? string : "";
                        int length2 = i2 - str3.length();
                        if (z || length2 <= 0) {
                            c3 = ControlChar.SPACE_CHAR;
                        } else {
                            c3 = ControlChar.SPACE_CHAR;
                            zzZ(sb, ControlChar.SPACE_CHAR, length2);
                        }
                        sb.append(str3);
                        if (z && length2 > 0) {
                            zzZ(sb, c3, length2);
                        }
                        i3 = i14;
                    } else {
                        throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i7, "Invalid Format String at position: "));
                    }
                } else {
                    throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i7, "Invalid Format String at position: "));
                }
            }
        } else {
            throw new IllegalArgumentException(str == null ? "format" : "args");
        }
    }
}
