package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.words.NativeLibSettings;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZOQ {
    private static final boolean zzZXq = zzZHP.zzsq();
    private static String zzZXr;
    public static final char zzZXs;
    public static final char zzZXt;

    static {
        if (zzZHP.zzss()) {
            zzZXt = IOUtils.DIR_SEPARATOR_WINDOWS;
            zzZXs = IOUtils.DIR_SEPARATOR_UNIX;
        } else {
            zzZXt = IOUtils.DIR_SEPARATOR_UNIX;
            zzZXs = IOUtils.DIR_SEPARATOR_WINDOWS;
        }
    }

    public static boolean hasExtension(String str) {
        char cCharAt;
        if (str == null) {
            return false;
        }
        int length = str.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
            cCharAt = str.charAt(length);
            if (cCharAt == '.') {
                return length != str.length() - 1;
            }
        } while (!zzZS(cCharAt));
        return false;
    }

    private static String zzVa(String str) {
        return !zzZKN.zzU3(str) ? str.replaceAll("\\\\", "/") : str;
    }

    private static File zzVb(String str) {
        if (zzZXq) {
            str = zzVa(str);
        }
        return new File(str);
    }

    public static boolean zzVc(String str) {
        if (zzVb(str).isAbsolute()) {
            return true;
        }
        int length = str.length();
        if (length <= 0 || !zzZT(str.charAt(0))) {
            return length >= 2 && str.charAt(1) == ':';
        }
        return true;
    }

    public static String zzVd(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        File fileZzVb = zzVb(str);
        char cOooO00o = androidx.core.content.OooO0O0.OooO00o(1, str);
        String name = fileZzVb.getName();
        if (zzZT(cOooO00o) && name != null && name.length() > 0) {
            return fileZzVb.getPath();
        }
        String parent = fileZzVb.getParent();
        if (parent != null) {
            return parent;
        }
        if (zzVc(str)) {
            return null;
        }
        return "";
    }

    public static String zzVe(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        String name = zzVb(str).getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf > 0 ? name.substring(iLastIndexOf) : iLastIndexOf == 0 ? name : "";
    }

    public static String zzVf(String str) throws Exception {
        return zzVb(str).getCanonicalPath();
    }

    public static String zzVg(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        if (zzZT(androidx.core.content.OooO0O0.OooO00o(1, str))) {
            return "";
        }
        String name = zzVb(str).getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf > 0 ? name.substring(0, iLastIndexOf) : name;
    }

    public static String zzVh(String str) {
        return (str == null || str.isEmpty()) ? str : zzZT(androidx.core.content.OooO0O0.OooO00o(1, str)) ? "" : zzVb(str).getName();
    }

    private static boolean zzZS(char c) {
        return zzZT(c) || c == ':';
    }

    private static boolean zzZT(char c) {
        return c == zzZXt || c == zzZXs;
    }

    private static File zzZV(String str, String str2) {
        if (zzZXq) {
            str = zzVa(str);
            str2 = zzVa(str2);
        }
        return new File(str, str2);
    }

    public static String zzZW(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("parent");
        }
        if (str2 != null) {
            return (zzVc(str2) || "".equals(str)) ? str2 : zzZV(str, str2).getPath();
        }
        throw new NullPointerException("child");
    }

    public static String zzZX(String str, String str2) {
        String strOooO0Oo;
        char cCharAt;
        if (str == null || str.isEmpty()) {
            return str;
        }
        int length = str.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
            cCharAt = str.charAt(length);
            if (cCharAt == '.') {
                strOooO0Oo = str.substring(0, length);
                break;
            }
        } while (!zzZS(cCharAt));
        strOooO0Oo = str;
        if (str2 == null || str.length() == 0) {
            return strOooO0Oo;
        }
        if (str2.length() == 0 || str2.charAt(0) != '.') {
            strOooO0Oo = C21111o0ooOoO.OooO0Oo(strOooO0Oo, ".");
        }
        return C21111o0ooOoO.OooO0Oo(strOooO0Oo, str2);
    }

    public static String zzix() {
        if (zzZXr == null) {
            String tmpDirectoryPath = NativeLibSettings.getTmpDirectoryPath();
            zzZXr = tmpDirectoryPath;
            zzZXr = zzVb(tmpDirectoryPath).getAbsolutePath();
        }
        return zzZXr;
    }
}
