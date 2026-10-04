package com.aspose.words;

import com.huawei.hms.network.embedded.C18115b5;
import com.huawei.hms.network.embedded.C18241k5;
import com.huawei.hms.network.embedded.C18358t1;
import com.microsoft.identity.client.internal.MsalUtils;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ1N {
    private static String[] zzY37 = {"'", ".", "+", CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, "=", C18358t1.g.f56183c, C18115b5.CONNECTOR, "`", "~", C18241k5.f55433h, "!", "#", "$", "%", "&", "@", "/", MsalUtils.QUERY_STRING_SYMBOL, "^", "|", ";", "\\", "\"", "<", ">", "[", "]", "(", ")", "{", "}"};
    private static char[] zzY36 = {'*', '_'};
    private static String[] zzY35 = {"(", ")", "<", ">"};
    private static String[] zzY34 = {"[", "]"};

    public static boolean zzA(StringBuilder sb) {
        return sb.length() >= 2 && zzYx(sb.charAt(0)) && com.aspose.words.internal.zzZYD.zzZ1(sb.charAt(1));
    }

    public static int zzB(String str, int i, int i2) {
        if (str == null) {
            return -1;
        }
        while (i <= i2) {
            if (zzYz(str.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int zzC(String str, int i, int i2) {
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            return 0;
        }
        int i3 = i;
        while (i2 > 0 && i3 < str.length()) {
            i2 -= zzYA(str.charAt(i3));
            i3++;
        }
        return i3 - i;
    }

    public static StringBuilder zzIr(String str) {
        StringBuilder sb = new StringBuilder();
        if (str.length() == 0) {
            return sb;
        }
        char cCharAt = str.charAt(0);
        int i = 1;
        while (i < str.length()) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt != '\\' || !com.aspose.words.internal.zzZ1.zzZ(zzY36, cCharAt2)) {
                sb.append(cCharAt);
            }
            i++;
            cCharAt = cCharAt2;
        }
        sb.append(cCharAt);
        return sb;
    }

    public static String zzIs(String str) {
        return zzW(str, zzY34);
    }

    public static String zzIt(String str) {
        return zzV(str, zzY37);
    }

    public static String zzIu(String str) {
        return zzW(str, zzY35);
    }

    public static String zzIv(String str) {
        if (str == null) {
            return null;
        }
        return str.replace("\\'", "'").replace("\\\"", "\"").replace("\\)", ")");
    }

    public static String zzIw(String str) {
        if (str == null) {
            return null;
        }
        return str.replace("\\\"", "\"").replace("\"", "\\\"");
    }

    public static int zzIx(String str) {
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            return 0;
        }
        int iZzYA = 0;
        for (int i = 0; i < str.length(); i++) {
            iZzYA += zzYA(str.charAt(i));
        }
        return iZzYA;
    }

    public static byte zzN(Style style) {
        if (style == null) {
            return (byte) 14;
        }
        String name = style.getName();
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        if (com.aspose.words.internal.zzZKN.zzS(name, "Quote", i)) {
            return (byte) 18;
        }
        if (com.aspose.words.internal.zzZKN.zzS(style.getName(), "List", i)) {
            return (byte) 26;
        }
        if (com.aspose.words.internal.zzZKN.zzS(style.getName(), "IndentedCode", i)) {
            return (byte) 24;
        }
        if (com.aspose.words.internal.zzZKN.zzS(style.getName(), "FencedCode", i)) {
            return (byte) 25;
        }
        if (com.aspose.words.internal.zzZKN.zzS(style.getName(), "SetextHeading", i)) {
            return (byte) 17;
        }
        if (com.aspose.words.internal.zzZKN.zzS(style.getName(), "InlineCode", i)) {
            return (byte) 4;
        }
        return style.isHeading() ? (byte) 16 : (byte) 14;
    }

    private static boolean zzP(char c, char c2) {
        if (com.aspose.words.internal.zzZKU.zzG(c)) {
            return false;
        }
        return !zzP(c) || com.aspose.words.internal.zzZKU.zzG(c2) || zzP(c2);
    }

    private static boolean zzQ(char c, char c2) {
        if (com.aspose.words.internal.zzZKU.zzG(c2)) {
            return false;
        }
        return !zzP(c2) || com.aspose.words.internal.zzZKU.zzG(c) || zzP(c);
    }

    public static int zzR(char c, char c2) {
        boolean zZzQ = zzQ(c, c2);
        boolean zZzP = zzP(c, c2);
        if (zZzQ && zZzP) {
            return 3;
        }
        if (zZzQ) {
            return 1;
        }
        return zZzP ? 2 : 0;
    }

    public static boolean zzS(char c, char c2) {
        return Character.isLetterOrDigit(c) && Character.isLetterOrDigit(c2);
    }

    public static String zzUv(String str) {
        String strZzZ = com.aspose.words.internal.zzZKN.zzZ(str, ControlChar.LINE_BREAK_CHAR, ControlChar.SPACE_CHAR);
        return (!com.aspose.words.internal.zzZYD.zzXh(strZzZ) && strZzZ.charAt(0) == ' ' && androidx.core.content.OooO0O0.OooO00o(1, strZzZ) == ' ') ? androidx.core.content.OooO0OO.OooO00o(1, 1, strZzZ) : strZzZ;
    }

    public static zzJZ zzV(zzJZ zzjz, zzJZ zzjz2) {
        zzJZ zzjz3 = zzjz.zzX(zzjz2) ? zzjz : zzjz2;
        if (zzjz == zzjz3) {
            zzjz = zzjz2;
        }
        for (zzJZ zzjz4 = (zzJZ) zzjz3.zzZT5(); zzjz4 != zzjz; zzjz4 = (zzJZ) zzjz4.zzZT5()) {
            if (!zzjz4.zzZT2() && zzjz4.isLinked() && zzjz4.getType() == 7) {
                return zzjz4;
            }
        }
        return null;
    }

    public static boolean zzW(zzJZ zzjz, zzJZ zzjz2) {
        String text = zzjz.getText();
        int start = zzjz2.getStart() - 1;
        int i = 0;
        int i2 = 0;
        char c = 0;
        for (int end = zzjz.getEnd() + 1; end <= start; end++) {
            if (zzZ(end, zzjz, zzjz2) > zzjz2.getPriority()) {
                c = 0;
            } else {
                char cCharAt = text.charAt(end);
                if (c != '\\') {
                    if (cCharAt == '[') {
                        i++;
                    } else if (cCharAt == ']') {
                        i2++;
                    }
                    if (i < i2) {
                        return false;
                    }
                }
                c = cCharAt;
            }
        }
        return i == i2;
    }

    public static int zzY(String str, char c, int i, int i2) {
        int iZzZ;
        while (i < i2 && (iZzZ = com.aspose.words.internal.zzZKN.zzZ(str, c, i, (i2 - i) + 1)) != -1) {
            if (!zzZu(str, iZzZ)) {
                return iZzZ;
            }
            i = iZzZ + 1;
        }
        return -1;
    }

    public static int zzYA(char c) {
        return c == '\t' ? 4 : 1;
    }

    public static boolean zzYB(char c) {
        return c == '.' || c == ')';
    }

    public static int zzYC(char c) {
        if (com.aspose.words.internal.zzZKU.zzG(c)) {
            return 0;
        }
        if (c != '*') {
            return c != '+' ? 1 : 2;
        }
        return 3;
    }

    public static int zzYD(char c) {
        if (com.aspose.words.internal.zzZKU.zzG(c)) {
            return 0;
        }
        return c != ')' ? 4 : 5;
    }

    public static int zzYE(char c) {
        if (com.aspose.words.internal.zzZKU.zzG(c)) {
            return 0;
        }
        if (c == '.') {
            return 4;
        }
        switch (c) {
            case ')':
                return 5;
            case '*':
                return 3;
            case '+':
                return 2;
            default:
                return 1;
        }
    }

    public static int zzYM(String str, String str2) {
        int i;
        int iZzT = com.aspose.words.internal.zzZKN.zzT(str, str2, com.aspose.words.internal.zzZOF.INVARIANT_CULTURE_IGNORE_CASE$4894b8c8);
        if (iZzT == -1) {
            return -1;
        }
        int length = str2.length() + iZzT;
        if (length < str.length() && str.charAt(length) == '.') {
            length++;
        }
        int i2 = 0;
        while (true) {
            i = length + i2;
            if (i >= str.length() || !com.aspose.words.internal.zzZYD.isDigit(str.charAt(i))) {
                break;
            }
            i2++;
        }
        if (i2 == 0) {
            return 0;
        }
        return com.aspose.words.internal.zzJB.parseInt(str.substring(length, i));
    }

    private static boolean zzYx(char c) {
        return c == '-' || c == '+' || c == '*';
    }

    public static boolean zzYy(char c) {
        return com.aspose.words.internal.zzZ1.zzZ(zzY36, c);
    }

    public static boolean zzYz(char c) {
        return c == ' ' || c == '\t' || c == '\n' || c == 11 || c == '\f' || c == '\r';
    }

    public static boolean zzZ(String str, int i, int i2, char... cArr) {
        char c = 0;
        while (i <= i2) {
            char cCharAt = str.charAt(i);
            if (com.aspose.words.internal.zzZ1.zzZ(cArr, cCharAt) && c != '\\') {
                return true;
            }
            i++;
            c = cCharAt;
        }
        return false;
    }

    public static boolean zzZu(String str, int i) {
        int i2 = i - 1;
        while (i2 >= 0 && str.charAt(i2) == '\\') {
            i2--;
        }
        return ((i - i2) + 1) % 2 == 1;
    }

    public static char zzuX(int i) {
        if (i == 0) {
            return ControlChar.SPACE_CHAR;
        }
        if (i == 1) {
            return '-';
        }
        if (i == 2) {
            return '+';
        }
        if (i == 3) {
            return '*';
        }
        if (i == 4) {
            return FilenameUtils.EXTENSION_SEPARATOR;
        }
        if (i == 5) {
            return ')';
        }
        throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Unknown list marker: '{0}'", Integer.valueOf(i)));
    }

    public static char zzuY(int i) {
        if (i == 1) {
            return '=';
        }
        if (i == 2) {
            return '-';
        }
        throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Invalid level for a SetextHeading: '{0}'", Integer.valueOf(i)));
    }

    public static boolean zzz(StringBuilder sb) {
        int i;
        int i2 = 0;
        while (i2 < sb.length() && com.aspose.words.internal.zzZYD.isDigit(sb.charAt(i2))) {
            i2++;
        }
        return i2 != 0 && i2 < 10 && (i = i2 + 1) < sb.length() && zzYB(sb.charAt(i2)) && com.aspose.words.internal.zzZYD.zzZ1(sb.charAt(i));
    }

    private static boolean zzP(char c) {
        return c == '$' || c == '+' || c == '<' || c == '=' || c == '>' || c == '\\' || c == '^' || c == '`' || c == '~' || c == '|' || com.aspose.words.internal.zzZKU.zzP(c);
    }

    private static int zzZ(int i, zzJZ zzjz, zzJZ zzjz2) {
        int priority = Integer.MIN_VALUE;
        while (zzjz != zzjz2) {
            if (!zzjz.zzZT2() && zzjz.isLinked() && zzjz.getEnd() < i && i < zzjz.zzZSY().getStart()) {
                priority = zzjz.getPriority();
            }
            zzjz = (zzJZ) zzjz.zzZT5();
        }
        return priority;
    }

    public static int zzA(String str, int i, int i2) {
        if (str == null) {
            return -1;
        }
        while (i <= i2) {
            if (!zzYz(str.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private static String zzV(String str, String[] strArr) {
        if (str.contains(Character.toString(IOUtils.DIR_SEPARATOR_WINDOWS))) {
            for (String str2 : strArr) {
                str = str.replace(com.aspose.words.internal.zzZKN.format("{0}{1}", Character.valueOf(IOUtils.DIR_SEPARATOR_WINDOWS), str2), str2);
            }
        }
        return str;
    }

    public static boolean zzz(String str, int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        char c = 0;
        while (i <= i2) {
            char cCharAt = str.charAt(i);
            if (c != '\\') {
                if (cCharAt == '(') {
                    i3++;
                } else if (cCharAt == ')') {
                    i4++;
                }
                if (i3 < i4) {
                    return false;
                }
            }
            i++;
            c = cCharAt;
        }
        return i3 == i4;
    }

    private static String zzW(String str, String[] strArr) {
        for (String str2 : strArr) {
            str = str.replace(str2, com.aspose.words.internal.zzZKN.format("{0}{1}", Character.valueOf(IOUtils.DIR_SEPARATOR_WINDOWS), str2));
        }
        return str;
    }
}
