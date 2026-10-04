package com.aspose.words.internal;

import com.aspose.words.ControlChar;
import com.huawei.hms.network.embedded.C18438z3;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZYD {
    private static char[] zzbO = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String getNewLine() throws Exception {
        return zz0T.zzsp() ? IOUtils.LINE_SEPARATOR_UNIX : IOUtils.LINE_SEPARATOR_WINDOWS;
    }

    public static boolean isDigit(int i) {
        return i >= 48 && i <= 57;
    }

    public static boolean isHexDigit(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        }
        if (c < 'A' || c > 'F') {
            return c >= 'a' && c <= 'f';
        }
        return true;
    }

    public static boolean isLetter(int i) {
        if (i < 97 || i > 122) {
            return i >= 65 && i <= 90;
        }
        return true;
    }

    public static boolean isLetterOrDigit(int i) {
        return isLetter(i) || isDigit(i);
    }

    public static int zzC(Object obj, Object obj2) {
        if (zzZKO.zzA(obj, obj2)) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        String str = (String) obj;
        String str2 = (String) obj2;
        int length = str.length();
        int length2 = str2.length();
        int iZzZ = zzZ(str, str2, Math.min(length, length2));
        return iZzZ != 0 ? iZzZ : length - length2;
    }

    public static char[] zzD(byte b) {
        char[] cArr = zzbO;
        return new char[]{cArr[((b & 255) >>> 4) & 15], cArr[b & 15]};
    }

    public static String zzE(String str, int i) {
        int i2 = 0;
        while (i2 < i && i2 < str.length() && zzZKU.zzG(str.charAt(i2))) {
            i2++;
        }
        return str.substring(i2);
    }

    public static String zzF(String str, int i) {
        if (str == null) {
            return null;
        }
        return str.length() <= i ? str : str.substring(0, i);
    }

    public static void zzP(StringBuilder sb) {
        int i = 0;
        while (i < sb.length() && zzZKU.zzG(sb.charAt(i))) {
            i++;
        }
        sb.delete(0, i);
    }

    public static int zzQ(StringBuilder sb) {
        if (sb == null) {
            return -1;
        }
        for (int length = sb.length() - 1; length >= 0; length--) {
            if (!zzZKU.zzG(sb.charAt(length))) {
                return length;
            }
        }
        return -1;
    }

    private static int zzR(StringBuilder sb) {
        if (sb == null) {
            return -1;
        }
        for (int i = 0; i < sb.length(); i++) {
            if (!zzZKU.zzG(sb.charAt(i))) {
                return i;
            }
        }
        return -1;
    }

    public static boolean zzS(StringBuilder sb) {
        return zzR(sb) == -1;
    }

    private static boolean zzW(String str, String str2, boolean z) {
        if (zzZKO.zzA(str, str2)) {
            return true;
        }
        if (str != null && str2 != null) {
            int length = str.length();
            int length2 = str2.length();
            if ((!z || length >= length2) && ((z || length == length2) && zzZ(str, str2, length2) == 0)) {
                return true;
            }
        }
        return false;
    }

    public static boolean zzX(String str, String str2, boolean z) {
        return zzZKN.zzT(str, str2, z ? zzZOF.ORDINAL_IGNORE_CASE$4894b8c8 : zzZOF.ORDINAL$4894b8c8) >= 0;
    }

    private static String zzX3(String str) {
        if (!zzXk(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt > ' ' && cCharAt < 127) {
                sb.append((char) ((cCharAt - ' ') | 65280));
            } else if (cCharAt == ' ') {
                sb.append((char) 12288);
            } else {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    private static String zzX4(String str) {
        StringBuilder sb = new StringBuilder(new zzZNR("[^A-Za-z0-9+/=]").zzZS(str, ""));
        if (sb.length() % 4 != 0) {
            sb.append('=');
        }
        if (sb.length() % 4 != 0) {
            sb.append('=');
        }
        return sb.toString();
    }

    public static byte[] zzX5(String str) {
        return zzQ(str, true);
    }

    public static byte[] zzX6(String str) {
        return zzQ(str, false);
    }

    private static String zzX7(String str) {
        if (str == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: s");
        }
        StringBuilder sb = new StringBuilder(str);
        boolean z = false;
        for (int i = 0; i < sb.length(); i++) {
            char cCharAt = sb.charAt(i);
            if (zzh(cCharAt)) {
                z = false;
            } else if (z) {
                sb.setCharAt(i, Character.toLowerCase(cCharAt));
            } else {
                sb.setCharAt(i, Character.toUpperCase(cCharAt));
                z = true;
            }
        }
        return sb.toString();
    }

    public static String zzX8(String str) {
        if (str == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: s");
        }
        StringBuilder sb = new StringBuilder(str);
        int i = 0;
        while (true) {
            if (i >= sb.length()) {
                break;
            }
            char cCharAt = sb.charAt(i);
            if (!zzh(cCharAt)) {
                sb.setCharAt(i, Character.toUpperCase(cCharAt));
                break;
            }
            i++;
        }
        return sb.toString();
    }

    public static String zzX9(String str) {
        char[] charArray = str.toCharArray();
        zzZKV.zzY(charArray, charArray.length);
        return new String(charArray);
    }

    public static String zzXa(String str) {
        for (int length = str.length() - 1; length >= 0; length--) {
            if (Character.isDigit(str.charAt(length))) {
                return str.substring(0, length + 1);
            }
        }
        return str;
    }

    public static byte[] zzXb(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        int i = 0;
        char c = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (isHexDigit(cCharAt)) {
                if (c == 0) {
                    c = cCharAt;
                } else {
                    bArr[i] = (byte) ((zzm(c) << 4) | zzm(cCharAt));
                    c = 0;
                    i++;
                }
            }
        }
        if (i >= length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    public static boolean zzXc(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean zzXd(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (zzZKU.zzG(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static int zzXe(String str) {
        if (str == null) {
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            if (zzZKU.zzG(str.charAt(i))) {
                return i;
            }
        }
        return -1;
    }

    public static int zzXf(String str) {
        if (str == null) {
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!zzZKU.zzG(str.charAt(i))) {
                return i;
            }
        }
        return -1;
    }

    public static boolean zzXg(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 127) {
                return false;
            }
        }
        return true;
    }

    public static boolean zzXh(String str) {
        return zzXf(str) == -1;
    }

    public static boolean zzXi(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                return false;
            }
        }
        return true;
    }

    public static String zzXj(String str) {
        return !zzXk(str) ? "" : 10 >= str.length() ? str : C22246OooO0oo.OooO00o(new StringBuilder(), str, "...", 0, 7);
    }

    public static boolean zzXk(String str) {
        return !zzZKN.zzU3(str);
    }

    public static String zzXl(String str) {
        int i = 0;
        while (i < str.length() && !zzg(str.charAt(i))) {
            i++;
        }
        if (i == str.length()) {
            return str;
        }
        char[] cArr = new char[str.length()];
        zzZKN.zzZ(str, 0, cArr, 0, i);
        while (i < str.length()) {
            cArr[i] = zzo(str.charAt(i));
            i++;
        }
        return new String(cArr);
    }

    public static boolean zzXm(String str) {
        if (str == null) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            if (zzg(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int zzZ(String str, char c, int i) {
        if (str == null) {
            return -1;
        }
        while (i < str.length()) {
            if (str.charAt(i) != c) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static boolean zzZ1(int i) {
        return i == 9 || i == 10 || i == 13 || i == 32;
    }

    public static String zzZ8(byte[] bArr) {
        return zzZ(bArr, 0, bArr.length, false);
    }

    public static zzZOP zzZW(zzZOP zzzop) {
        return zzzop;
    }

    public static int zzd(String str, String str2) {
        return zzZYC.zzd(str, str2);
    }

    public static String zze(String str, String str2) {
        return !zzXk(str) ? str2 : !zzXk(str2) ? str : zzZKN.format("{0},{1}", str, str2);
    }

    public static String zzf(String str, String str2) {
        int i;
        int length = str.length();
        int length2 = str2.length();
        if (length == 0 || length2 == 0) {
            return str;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = (length - length2) + 1;
            if (i2 >= i) {
                break;
            }
            int i4 = 0;
            while (true) {
                if (i4 >= length2) {
                    i2 += length2;
                    i3++;
                    break;
                }
                if (str.charAt(i2 + i4) != str2.charAt(i4)) {
                    i2++;
                    break;
                }
                i4++;
            }
        }
        if (i3 == 0) {
            return str;
        }
        char[] cArr = new char[length - (i3 * length2)];
        int i5 = 0;
        int i6 = 0;
        while (i5 < i) {
            int i7 = 0;
            while (true) {
                if (i7 >= length2) {
                    i5 += length2;
                    break;
                }
                if (str.charAt(i5 + i7) != str2.charAt(i7)) {
                    cArr[i6] = str.charAt(i5);
                    i5++;
                    i6++;
                    break;
                }
                i7++;
            }
        }
        if (i5 < length) {
            while (i5 < length) {
                cArr[i6] = str.charAt(i5);
                i5++;
                i6++;
            }
        }
        return new String(cArr);
    }

    private static boolean zzg(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static boolean zzh(String str, String str2) {
        return zzW(str, str2, false);
    }

    public static boolean zzi(char c) {
        switch (c) {
            case 8210:
            case 8211:
            case 8212:
            case 8213:
                return true;
            default:
                return false;
        }
    }

    public static boolean zzj(char c) {
        return c == '!' || c == ',' || c == '.' || c == '?' || c == 161 || c == 191 || c == ':' || c == ';';
    }

    public static boolean zzk(char c) {
        if (c == '\"' || c == 171 || c == 187) {
            return true;
        }
        switch (c) {
            case C18438z3.f56774j /* 8220 */:
            case 8221:
            case 8222:
            case 8223:
                return true;
            default:
                return false;
        }
    }

    public static int zzl(char c) {
        int i = c - (c <= 'Z' ? 'A' : 'a');
        if (i < 0 || i > 25) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: letter");
        }
        return i;
    }

    public static int zzm(char c) {
        int iZzl = c > '9' ? zzl(c) + 10 : c - '0';
        if (iZzl < 0 || iZzl > 15) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: digit");
        }
        return iZzl;
    }

    public static boolean zzn(char c) {
        return zzZYC.zzn(c);
    }

    public static char zzo(char c) {
        return zzg(c) ? (char) (c + ControlChar.SPACE_CHAR) : c;
    }

    public static boolean zzg(String str, String str2) {
        return zzW(str, str2, true);
    }

    public static boolean zzh(char c) {
        return !Character.isLetterOrDigit(c);
    }

    public static boolean zzi(String str, String str2) {
        return zzZKN.zzX(str, str2, zzZOF.ORDINAL_IGNORE_CASE$4894b8c8);
    }

    public static int zzj(String str, String str2) {
        return zzZKN.zzT(str, str2, zzZOF.ORDINAL_IGNORE_CASE$4894b8c8);
    }

    public static String zzD(String str, int i) {
        if (i == 0) {
            return str;
        }
        if (i == 1) {
            return str.toUpperCase();
        }
        if (i == 2) {
            return str.toLowerCase();
        }
        if (i == 3) {
            return zzX7(str);
        }
        if (i == 4) {
            return zzX8(str);
        }
        if (i == 5) {
            return zzX3(str);
        }
        throw new IllegalStateException("Unknown char case specified.");
    }

    private static byte[] zzQ(String str, boolean z) {
        if (zzZKN.zzU3(str)) {
            return new byte[0];
        }
        if (z) {
            str = zzX4(str);
        }
        try {
            return zzZQB.zzVT(str);
        } catch (NumberFormatException unused) {
            return new byte[0];
        }
    }

    public static String zzR(Object obj, String str) {
        try {
            StringBuilder sb = new StringBuilder();
            zzZNH.zzZ(sb, "{0} Start\n", str);
            for (Field field : obj.getClass().getFields()) {
                zzZNH.zzZ(sb, "{0}:{1}, 0x{1:X}\n", field.getName(), field.get(obj));
            }
            zzZNH.zzZ(sb, "{0} End", str);
            return sb.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean zzX(StringBuilder sb, String str) {
        if (sb != null && str != null) {
            int length = sb.length() - 1;
            int length2 = str.length() - 1;
            while (length >= 0 && length2 >= 0) {
                if (sb.charAt(length) != str.charAt(length2)) {
                    return false;
                }
                length--;
                length2--;
            }
            if (length2 == -1) {
                return true;
            }
        }
        return false;
    }

    public static String zzZ(byte[] bArr, int i, int i2, boolean z) {
        StringBuilder sb = new StringBuilder(i2 * 2);
        int i3 = z ? -1 : 1;
        if (z) {
            i += i2 - 1;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append(zzD(bArr[i]));
            i += i3;
        }
        return sb.toString();
    }

    private static int zzZ(String str, String str2, int i) {
        char cZzZJ;
        char cZzZJ2;
        for (int i2 = 0; i2 < i; i2++) {
            int iCharAt = str.charAt(i2);
            int iCharAt2 = str2.charAt(i2);
            if (iCharAt != iCharAt2) {
                if ((iCharAt | iCharAt2) <= 127) {
                    if (iCharAt >= 97 && iCharAt <= 122) {
                        iCharAt ^= 32;
                    }
                    if (iCharAt2 >= 97 && iCharAt2 <= 122) {
                        iCharAt2 ^= 32;
                    }
                    if (iCharAt != iCharAt2) {
                        return iCharAt - iCharAt2;
                    }
                } else {
                    char cZzZK = zzZKU.zzZK((char) iCharAt);
                    char cZzZK2 = zzZKU.zzZK((char) iCharAt2);
                    if (cZzZK != cZzZK2 && (cZzZJ = zzZKU.zzZJ(cZzZK)) != (cZzZJ2 = zzZKU.zzZJ(cZzZK2))) {
                        return cZzZJ - cZzZJ2;
                    }
                }
            }
        }
        return 0;
    }
}
