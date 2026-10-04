package oO0o0O0o;

import Oooo0.C20856OooooOo;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import oOo000Oo.AbstractC34421OooO0Oo;

/* JADX INFO: renamed from: oO0o0O0o.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C33595OooOOo extends C33596OooOOo0 {
    public static String OooOOOO(char[] cArr, int i, int i2) {
        AbstractC34421OooO0Oo.OooO00o.OooO00o(i, i2, cArr.length);
        return new String(cArr, i, i2 - i);
    }

    public static byte[] OooOOOo(String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        byte[] bytes = str.getBytes(C33580OooO00o.f121231OooO0O0);
        kotlin.jvm.internal.OooOOO0.OooO0o(bytes, "getBytes(...)");
        return bytes;
    }

    public static boolean OooOOo(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static boolean OooOOo0(String str, String suffix, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(suffix, "suffix");
        return !z ? str.endsWith(suffix) : OooOOoo(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static boolean OooOOoo(String str, int i, String other, int i2, int i3, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(other, "other");
        return !z ? str.regionMatches(i, other, i2, i3) : str.regionMatches(z, i, other, i2, i3);
    }

    public static boolean OooOo(int i, String str, String str2, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        return !z ? str.startsWith(str2, i) : OooOOoo(str, i, str2, 0, str2.length(), z);
    }

    public static String OooOo0(String str, char c, char c2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        String strReplace = str.replace(c, c2);
        kotlin.jvm.internal.OooOOO0.OooO0o(strReplace, "replace(...)");
        return strReplace;
    }

    public static String OooOo00(String str, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + FilenameUtils.EXTENSION_SEPARATOR).toString());
        }
        if (i == 0) {
            return "";
        }
        int i2 = 1;
        if (i == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = str.charAt(0);
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(str.length() * i);
        if (1 <= i) {
            while (true) {
                sb.append((CharSequence) str);
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0Oo(string);
        return string;
    }

    public static String OooOo0O(String str, String oldValue, String newValue) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(oldValue, "oldValue");
        kotlin.jvm.internal.OooOOO0.OooO0oO(newValue, "newValue");
        int iOooo00O = C33599OooOo0O.Oooo00O(str, oldValue, 0, false);
        if (iOooo00O < 0) {
            return str;
        }
        int length = oldValue.length();
        int i = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, iOooo00O);
            sb.append(newValue);
            i2 = iOooo00O + length;
            if (iOooo00O >= str.length()) {
                break;
            }
            iOooo00O = C33599OooOo0O.Oooo00O(str, oldValue, iOooo00O + i, false);
        } while (iOooo00O > 0);
        sb.append((CharSequence) str, i2, str.length());
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
        return string;
    }

    public static String OooOo0o(String str, String str2) {
        int iOooo0O0 = C33599OooOo0O.Oooo0O0(str, str2, 0, false, 2);
        if (iOooo0O0 < 0) {
            return str;
        }
        int length = str2.length() + iOooo0O0;
        if (length < iOooo0O0) {
            throw new IndexOutOfBoundsException(C20856OooooOo.OooO0O0("End index (", length, ") is less than start index (", ").", iOooo0O0));
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str, 0, iOooo0O0);
        sb.append((CharSequence) "");
        sb.append((CharSequence) str, length, str.length());
        return sb.toString();
    }

    public static boolean OooOoO0(String str, String prefix, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(prefix, "prefix");
        return !z ? str.startsWith(prefix) : OooOOoo(str, 0, prefix, 0, prefix.length(), z);
    }
}
