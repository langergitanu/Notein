package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import Oooo0oO.o0Oo0oo;
import com.aspose.words.C22241OooO0Oo;
import com.aspose.words.ControlChar;
import com.aspose.words.ref.Ref;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.net.URISyntaxException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZVR {
    private static char[] zz7J = {'-', FilenameUtils.EXTENSION_SEPARATOR, '_', '~', ':', IOUtils.DIR_SEPARATOR_UNIX, '?', '#', '[', ']', '@', '!', '$', '&', '\'', '(', ')', '*', '+', ',', ';', '%', '='};
    private static char[] zz7I = {ControlChar.SPACE_CHAR, '<', '>', '{', '}', '|', '^', '[', ']', '`', '\"'};
    private static char[] zz7H = {IOUtils.DIR_SEPARATOR_UNIX, IOUtils.DIR_SEPARATOR_WINDOWS};

    private static boolean zz0(char c) {
        return c >= ' ' && c <= '~';
    }

    private static boolean zz1(char c) {
        return " <>{}|^[]`\"%".indexOf(c) >= 0;
    }

    private static boolean zz2(char c) {
        if (c < 'a' || c > 'z') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    public static String zz3(String str, String str2) {
        if (!zzZYD.zzXk(str)) {
            return str2;
        }
        char c = str.indexOf(92) >= 0 ? '\\' : '/';
        String strZzZ = zzZKN.zzZ(str2, c == '\\' ? '/' : '\\', c);
        if (!zzWF(str) || !zzZYD.zzXk(strZzZ) || strZzZ.charAt(0) != '/') {
            if (androidx.core.content.OooO0O0.OooO00o(1, str) == c) {
                return C21111o0ooOoO.OooO0Oo(str, strZzZ);
            }
            return str + c + strZzZ;
        }
        String strZzZ2 = zzZKN.zzZ(str, IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX);
        String strZzZ3 = zzZKN.zzZ(strZzZ, IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX);
        if (zzZKN.zzS(strZzZ3, "//", zzZOF.ORDINAL$4894b8c8)) {
            return C21111o0ooOoO.OooO0Oo(strZzZ2.substring(0, strZzZ2.indexOf(58) + 1), strZzZ3);
        }
        zzZNT zzzntZzZU = zzZNR.zzZU(strZzZ2, "^[^:]*:[/]*[^/]+");
        if (!zzzntZzZU.zzhL()) {
            return C21111o0ooOoO.OooO0Oo(strZzZ2, strZzZ3);
        }
        return zzzntZzZU.getValue() + strZzZ3;
    }

    private static boolean zz4(String str, String str2) {
        return zzWB(str2) && zzWF(str);
    }

    public static String zz5(String str, String str2) {
        if (str == null) {
            str = "";
        }
        return zzZYD.zzXk(str2) ? o0Oo0oo.OooO0Oo(str, "#", str2) : str;
    }

    public static String zz6(String str, String str2) {
        String strZz7 = zz7(str, str2);
        return !zzWF(strZz7) ? zzWt(strZz7) : strZz7;
    }

    public static String zz7(String str, String str2) {
        return (!zzWr(str2) || zz4(str, str2)) ? zz3(str, str2) : str2;
    }

    public static String zz8(String str, String str2) {
        String strZz7 = zz7(str, str2);
        if (!zzZYD.zzXk(strZz7)) {
            return "";
        }
        int length = strZz7.length();
        if (zzWF(strZz7)) {
            int iIndexOf = strZz7.indexOf(58);
            int iIndexOf2 = strZz7.indexOf(63);
            if (iIndexOf2 > iIndexOf) {
                length = iIndexOf2;
            }
        }
        if (length <= 0) {
            return "";
        }
        for (int i = length - 1; i >= 0; i--) {
            char cCharAt = strZz7.charAt(i);
            if (cCharAt == '.') {
                int i2 = i + 1;
                return strZz7.substring(i2, ((length - i) - 1) + i2);
            }
            if (cCharAt == '\\' || cCharAt == '/') {
                break;
            }
        }
        return "";
    }

    private static void zzW(StringBuilder sb, String str) {
        for (byte b : new zzZNI().getBytes(str)) {
            zzZ(sb, b);
        }
    }

    public static boolean zzWA(String str) {
        return zzZKN.zzS(str, "\\\\", zzZOF.ORDINAL$4894b8c8);
    }

    private static boolean zzWB(String str) {
        return str.length() > 1 && str.charAt(0) == '/' && str.charAt(1) != '/' && zz0T.zzsp();
    }

    public static boolean zzWC(String str) {
        return str.length() > 2 && zz2(str.charAt(0)) && str.charAt(1) == ':' && (str.charAt(2) == '\\' || str.charAt(2) == '/');
    }

    private static boolean zzWD(String str) {
        return zzWC(str) || zzWB(str);
    }

    public static boolean zzWE(String str) {
        return zzWD(str) || zzWA(str);
    }

    public static boolean zzWF(String str) {
        return !zzZKN.zzS(str, "\\\\?\\", zzZOF.ORDINAL$4894b8c8) && str.indexOf(58) > 1;
    }

    public static String zzWG(String str) {
        int iIndexOf = str.indexOf(35);
        return iIndexOf < 0 ? "" : zzZKN.zzW(str.substring(iIndexOf + 1), '\'', '\"');
    }

    public static String zzWH(String str) {
        int iIndexOf = str.indexOf(35);
        return iIndexOf < 0 ? str : str.substring(0, iIndexOf);
    }

    private static boolean zzWf(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!zzZZ(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private static String zzWg(String str) {
        if (!zzWf(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (zzZZ(cCharAt)) {
                sb.append(cCharAt);
                i = i2;
            } else {
                String strZzS = zzZKN.zzS(cCharAt, 1);
                if (zzZVS.zzz(str, i)) {
                    strZzS = str.substring(i, i + 2);
                    i += 2;
                } else {
                    i = i2;
                }
                zzW(sb, strZzS);
            }
        }
        return sb.toString();
    }

    private static String zzWh(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\\') {
                sb.append(IOUtils.DIR_SEPARATOR_UNIX);
            } else if (zz0(cCharAt) && cCharAt != ' ') {
                sb.append(cCharAt);
            } else if (zzZZ(cCharAt)) {
                zzZ(sb, (byte) cCharAt);
            } else {
                sb.append(cCharAt);
            }
        }
        return zzWg(sb.toString());
    }

    private static String zzWi(String str) {
        zzZKL zzzklZzWo = zzWo(str);
        if (zzzklZzWo == null || !zzzklZzWo.zzf4()) {
            return null;
        }
        return zzWg(zzzklZzWo.zzf3());
    }

    public static String zzWj(String str) {
        if (!zzZYD.zzXk(str)) {
            return str;
        }
        if (!zzWC(str) && !zzWA(str)) {
            String strZzWi = zzWi(str);
            return strZzWi != null ? strZzWi : zzWh(str);
        }
        String strReplace = str.replace("%", "%25");
        String strZzWi2 = zzWi(strReplace);
        return strZzWi2 != null ? strZzWi2 : zzWh(zzWl(strReplace));
    }

    public static String zzWk(String str) {
        return str.replace("file:///", "");
    }

    public static String zzWl(String str) {
        return zzZKN.format("file:///{0}", str);
    }

    public static String zzWm(String str) {
        zzWn(str);
        String strSubstring = str.substring(8);
        return (strSubstring.length() <= 1 || strSubstring.charAt(0) != '\\' || strSubstring.charAt(1) == '\\') ? strSubstring : zzZKN.zzV(strSubstring, 0, "\\");
    }

    public static boolean zzWn(String str) {
        return zzZKN.zzS(str, "file:///", zzZOF.ORDINAL$4894b8c8);
    }

    public static zzZKL zzWo(String str) {
        if (!zzZYD.zzXk(str)) {
            return null;
        }
        try {
            return new zzZKL(str, (byte) 0);
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    private static char zzWp(String str) {
        return (char) (zzZYD.zzm(str.charAt(2)) + (zzZYD.zzm(str.charAt(1)) * 16));
    }

    private static boolean zzWq(String str) {
        return str.length() == 3 && str.charAt(0) == '%' && zzZYD.isHexDigit(str.charAt(1)) && zzZYD.isHexDigit(str.charAt(2));
    }

    public static boolean zzWr(String str) {
        return zzWF(str) || zzWD(str) || zzWA(str);
    }

    private static boolean zzWs(String str) {
        if (zzZYD.zzXk(str) && !zzWC(str) && !zzWA(str)) {
            if (zzZKN.zzZ(str, zz7I) >= 0) {
                return true;
            }
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '%' && i + 2 < str.length() && !zzWq(str.substring(i, i + 3))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String zzWt(String str) {
        if (!zzZYD.zzXk(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '%' && i + 2 < str.length()) {
                int i2 = i + 3;
                String strSubstring = str.substring(i, i2);
                if (zzWq(strSubstring)) {
                    sb.append(zzWp(strSubstring));
                    i = i2;
                }
            }
            sb.append(cCharAt);
            i++;
        }
        return sb.toString();
    }

    public static String zzWu(String str) {
        String strZzTX = zzZKN.zzTX(str);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strZzTX.length(); i++) {
            char cCharAt = strZzTX.charAt(i);
            if (zz1(cCharAt)) {
                zzZ(sb, (byte) cCharAt);
            } else {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public static String zzWv(String str) {
        return zzWs(str) ? zzWu(str) : str;
    }

    public static boolean zzWw(String str) {
        return zzZKN.zzS(str, "#", zzZOF.ORDINAL$4894b8c8);
    }

    public static boolean zzWx(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        int iZzY = zzZKN.zzY(str, zz7H);
        int iZzT = zzZKN.zzT(str, "://", zzZOF.ORDINAL$4894b8c8);
        if (iLastIndexOf > iZzY) {
            return iZzT < 0 || iZzT + 2 != iZzY;
        }
        return false;
    }

    public static String zzWy(String str) {
        int iZzY = zzZKN.zzY(str, zz7H);
        return iZzY < 0 ? "." : str.substring(0, Math.max(iZzY, 1));
    }

    public static boolean zzWz(String str) {
        return zzZKN.zzS(str, "cid:", zzZOF.ORDINAL$4894b8c8);
    }

    public static int zzY(String str, Ref<String> ref) {
        return zzY(str, 0, ref);
    }

    private static void zzZ(StringBuilder sb, byte b) {
        sb.append('%');
        sb.append(zzZYD.zzD(b));
    }

    private static boolean zzZZ(char c) {
        return c < 128;
    }

    public static String zz2(String str, String str2) throws Exception {
        return (str == null || !zzZKN.equals(zzZOQ.zzVh(str2), str2)) ? str2 : zzZOQ.zzZW(zzZOQ.zzVd(str), zzZOQ.zzVh(str2));
    }

    public static int zzY(String str, int i, Ref<String> ref) {
        ref.set("");
        Ref ref2 = new Ref(null);
        int iZzZ = zzZ(str, i, ref2);
        String str2 = (String) ref2.get();
        if (iZzZ == -1) {
            return -1;
        }
        int length = str2.length() + iZzZ;
        while (length < str.length()) {
            char cCharAt = str.charAt(length);
            if (!Character.isLetterOrDigit(cCharAt) && !zzZ1.zzZ(zz7J, cCharAt)) {
                break;
            }
            length++;
        }
        ref.set(C22241OooO0Oo.OooO00o(length, iZzZ, iZzZ, iZzZ, str));
        return iZzZ;
    }

    public static int zzZ(String str, int i, Ref<String> ref) {
        do {
            ref.set("");
            while (i < str.length() && !Character.isLetter(str.charAt(i))) {
                i++;
            }
            int i2 = i + 1;
            char cCharAt = 0;
            while (i2 < str.length()) {
                cCharAt = str.charAt(i2);
                if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '.' && cCharAt != '+' && cCharAt != '-') {
                    break;
                }
                i2++;
            }
            if (cCharAt == ':') {
                ref.set(C22241OooO0Oo.OooO00o(i2, i, i, i, str));
                return i;
            }
            i = i2 + 1;
        } while (i < str.length());
        return -1;
    }
}
