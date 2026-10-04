package com.aspose.words.internal;

import com.aspose.words.ControlChar;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes5.dex */
public final class zzS0 {
    private static String zzZ(String str, char c) {
        StringBuilder sb = null;
        int i = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            boolean z = cCharAt == '\\' || cCharAt == c;
            boolean z2 = cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\f';
            if (z || z2) {
                if (sb == null) {
                    sb = new StringBuilder();
                    sb.append((CharSequence) str, 0, i);
                }
                sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
            }
            if (sb != null) {
                if (z2) {
                    zzZNH.zzU(sb, zzJB.zzWy(cCharAt));
                    char cCharAt2 = str.length() - 1 > i ? str.charAt(i + 1) : (char) 0;
                    if (zzZYD.isHexDigit(cCharAt2) || cCharAt2 == ' ') {
                        sb.append(ControlChar.SPACE_CHAR);
                    }
                } else {
                    sb.append(cCharAt);
                }
            }
            i++;
        }
        return sb == null ? str : sb.toString();
    }

    public static boolean zzk(String str) {
        zzZYD.zzXk(str);
        return zzZKN.equals(str, zzl(str));
    }

    public static String zzl(String str) {
        if (!zzZYD.zzXk(str)) {
            return str;
        }
        if (CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR.equals(str)) {
            return "\\-";
        }
        int i = str.charAt(0) == '-' ? 1 : 0;
        StringBuilder sb = null;
        boolean z = false;
        boolean z2 = true;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            boolean zIsHexDigit = zzZYD.isHexDigit(cCharAt);
            boolean z3 = cCharAt >= 128 || zzZYD.isLetter(cCharAt) || cCharAt == '_' || (!z2 && (zzZYD.isDigit(cCharAt) || cCharAt == '-'));
            if (!z3) {
                if (sb == null) {
                    sb = new StringBuilder();
                    sb.append((CharSequence) str, 0, i);
                }
                sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                z = false;
            }
            if (sb != null) {
                if (z3 || !zIsHexDigit) {
                    if (z && zIsHexDigit) {
                        sb.append(ControlChar.SPACE_CHAR);
                    }
                    sb.append(cCharAt);
                } else {
                    zzZNH.zzU(sb, zzJB.zzWw(cCharAt));
                }
            }
            z = !z3 && zIsHexDigit;
            i++;
            z2 = false;
        }
        return sb == null ? str : sb.toString();
    }

    public static String zzm(String str) {
        return zzZ(str, '\'');
    }

    public static String zzn(String str) {
        return zzZ(str, '\"');
    }
}
