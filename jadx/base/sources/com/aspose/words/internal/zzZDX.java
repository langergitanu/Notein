package com.aspose.words.internal;

import com.aspose.words.ControlChar;
import com.huawei.hms.network.embedded.C18101a5;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZDX {
    static String zzWJ8;

    public static boolean zzN(char[] cArr, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            if (cArr[i] > ' ') {
                return false;
            }
            i++;
        }
        return true;
    }

    public static String zzO(char[] cArr, int i, int i2) {
        char c;
        int i3 = i2 - 1;
        int i4 = i;
        while (i4 <= i3 && cArr[i4] == ' ') {
            i4++;
        }
        if (i4 > i3) {
            return "";
        }
        int i5 = i3;
        while (i5 > i4 && cArr[i5] == ' ') {
            i5--;
        }
        int i6 = i4 + 1;
        while (i6 < i5) {
            if (cArr[i6] != ' ') {
                i6++;
            } else {
                if (cArr[i6 + 1] == ' ') {
                    break;
                }
                i6 += 2;
            }
        }
        if (i6 >= i5) {
            if (i4 == i && i5 == i3) {
                return null;
            }
            return new String(cArr, i4, (i5 - i4) + 1);
        }
        StringBuilder sb = new StringBuilder(i5 - i4);
        sb.append(cArr, i4, i6 - i4);
        while (i6 <= i5) {
            int i7 = i6 + 1;
            char c2 = cArr[i6];
            if (c2 == ' ') {
                sb.append(ControlChar.SPACE_CHAR);
                while (true) {
                    i6 = i7 + 1;
                    c = cArr[i7];
                    if (c != ' ') {
                        break;
                    }
                    i7 = i6;
                }
                sb.append(c);
            } else {
                sb.append(c2);
                i6 = i7;
            }
        }
        return sb.toString();
    }

    public static boolean zzX(String str, char[] cArr, int i, int i2) {
        if (str.length() != i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (str.charAt(i3) != cArr[i + i3]) {
                return false;
            }
        }
        return true;
    }

    private static String zzXLB() {
        String str = zzWJ8;
        if (str != null) {
            return str;
        }
        try {
            String property = System.getProperty(C18101a5.f54156e);
            zzWJ8 = property == null ? IOUtils.LINE_SEPARATOR_UNIX : property;
            return property;
        } catch (Throwable unused) {
            zzWJ8 = IOUtils.LINE_SEPARATOR_UNIX;
            return IOUtils.LINE_SEPARATOR_UNIX;
        }
    }

    public static boolean zzXu(String str, String str2) {
        int i;
        char cCharAt;
        int i2;
        char cCharAt2;
        int length = str.length();
        int length2 = str2.length();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= length && i4 >= length2) {
                return true;
            }
            if (i3 >= length) {
                i = i3;
                cCharAt = 0;
            } else {
                i = i3 + 1;
                cCharAt = str.charAt(i3);
            }
            if (i4 >= length2) {
                i2 = i4;
                cCharAt2 = 0;
            } else {
                i2 = i4 + 1;
                cCharAt2 = str2.charAt(i4);
            }
            if (cCharAt != cCharAt2) {
                while (true) {
                    if (cCharAt > ' ' && cCharAt != '_' && cCharAt != '-') {
                        break;
                    }
                    if (i >= length) {
                        cCharAt = 0;
                    } else {
                        int i5 = i + 1;
                        char cCharAt3 = str.charAt(i);
                        i = i5;
                        cCharAt = cCharAt3;
                    }
                }
                while (true) {
                    if (cCharAt2 > ' ' && cCharAt2 != '_' && cCharAt2 != '-') {
                        break;
                    }
                    if (i2 >= length2) {
                        cCharAt2 = 0;
                    } else {
                        int i6 = i2 + 1;
                        char cCharAt4 = str2.charAt(i2);
                        i2 = i6;
                        cCharAt2 = cCharAt4;
                    }
                }
                if (cCharAt == cCharAt2) {
                    continue;
                } else {
                    if (cCharAt2 == 0) {
                        return true;
                    }
                    if (cCharAt == 0 || Character.toLowerCase(cCharAt) != Character.toLowerCase(cCharAt2)) {
                        return false;
                    }
                }
            }
            i3 = i;
            i4 = i2;
        }
    }

    public static boolean zzXv(String str, String str2) {
        int i;
        int iCharAt;
        int i2;
        int iCharAt2;
        int length = str.length();
        int length2 = str2.length();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= length && i4 >= length2) {
                return true;
            }
            if (i3 >= length) {
                i = i3;
                iCharAt = 65536;
            } else {
                i = i3 + 1;
                iCharAt = str.charAt(i3);
            }
            if (i4 >= length2) {
                i2 = i4;
                iCharAt2 = 65536;
            } else {
                i2 = i4 + 1;
                iCharAt2 = str2.charAt(i4);
            }
            if (iCharAt != iCharAt2) {
                while (true) {
                    if (iCharAt > 32 && iCharAt != 95 && iCharAt != 45) {
                        break;
                    }
                    if (i >= length) {
                        iCharAt = 65536;
                    } else {
                        int i5 = i + 1;
                        char cCharAt = str.charAt(i);
                        i = i5;
                        iCharAt = cCharAt;
                    }
                }
                while (true) {
                    if (iCharAt2 > 32 && iCharAt2 != 95 && iCharAt2 != 45) {
                        break;
                    }
                    if (i2 >= length2) {
                        iCharAt2 = 65536;
                    } else {
                        int i6 = i2 + 1;
                        char cCharAt2 = str2.charAt(i2);
                        i2 = i6;
                        iCharAt2 = cCharAt2;
                    }
                }
                if (iCharAt == iCharAt2) {
                    continue;
                } else {
                    if (iCharAt == 65536 || iCharAt2 == 65536) {
                        break;
                    }
                    if (iCharAt >= 127) {
                        iCharAt = Character.toLowerCase((char) iCharAt);
                    } else if (iCharAt <= 90 && iCharAt >= 65) {
                        iCharAt += 32;
                    }
                    if (iCharAt2 >= 127) {
                        iCharAt2 = Character.toLowerCase((char) iCharAt2);
                    } else if (iCharAt2 <= 90 && iCharAt2 >= 65) {
                        iCharAt2 += 32;
                    }
                    if (iCharAt != iCharAt2) {
                        break;
                    }
                }
            }
            i3 = i;
            i4 = i2;
        }
        return false;
    }

    public static String zzZ(Collection<?> collection, String str, String str2) {
        if (str2 == null) {
            str2 = str;
        }
        int size = collection.size();
        StringBuilder sb = new StringBuilder((size << 3) + 16);
        Iterator<?> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (i != 0) {
                if (i == size - 1) {
                    sb.append(str2);
                } else {
                    sb.append(str);
                }
            }
            i++;
            sb.append(it.next());
        }
        return sb.toString();
    }

    public static void zzt(StringBuilder sb) {
        sb.append(zzXLB());
    }

    public static String zzwY(String str) {
        char cCharAt;
        int length = str.length();
        int i = 0;
        while (i < length && (cCharAt = str.charAt(i)) > ' ' && Character.isLetterOrDigit(cCharAt)) {
            i++;
        }
        if (i == length) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            sb.append(str.substring(0, i));
        }
        while (i < length) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 > ' ' && Character.isLetterOrDigit(cCharAt2)) {
                sb.append(Character.toUpperCase(cCharAt2));
            }
            i++;
        }
        return sb.toString();
    }

    public static boolean zzwZ(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) > ' ') {
                return false;
            }
        }
        return true;
    }
}
