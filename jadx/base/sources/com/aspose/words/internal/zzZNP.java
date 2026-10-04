package com.aspose.words.internal;

import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZNP {
    private static String zzUQ(String str) {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char cCharAt = str.charAt(i3);
            sb.append(cCharAt);
            if (z) {
                z = false;
            } else if (cCharAt == '{') {
                i2++;
            } else if (cCharAt != '}') {
                switch (cCharAt) {
                    case '[':
                        i++;
                        break;
                    case '\\':
                        z = true;
                        break;
                    case ']':
                        i--;
                        break;
                }
            } else {
                i2--;
                if (i <= 0 && i2 < 0) {
                    sb.replace(sb.length() - 1, sb.length(), "\\" + sb.charAt(sb.length() - 1));
                    i2 = 0;
                }
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0090, code lost:
    
        r3 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final String zzUR(String str) {
        if (zzZKN.zzU3(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '{') {
                int i2 = i - 2;
                if (i2 >= 0) {
                    char cCharAt2 = str.charAt(i2);
                    char cCharAt3 = str.charAt(i - 1);
                    if (cCharAt2 == '\\' && (cCharAt3 == 'p' || cCharAt3 == 'x')) {
                        sb.append(cCharAt);
                    } else {
                        int i3 = i - 1;
                        if (i3 < 0) {
                            sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                            sb.append(cCharAt);
                        } else if (str.charAt(i3) == '\\') {
                            sb.append(cCharAt);
                        } else {
                            int i4 = i + 1;
                            if (i4 < str.length()) {
                                sb2.setLength(0);
                                while (true) {
                                    if (i4 >= str.length()) {
                                        break;
                                    }
                                    char cCharAt4 = str.charAt(i4);
                                    sb2.append(cCharAt4);
                                    if (cCharAt4 != '{') {
                                        if (cCharAt4 != '}' || sb2.length() != 1) {
                                            if (cCharAt4 != '}') {
                                                if (!Character.isDigit(cCharAt4) && cCharAt4 != ',') {
                                                    sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                                                    break;
                                                }
                                                i4++;
                                            } else {
                                                break;
                                            }
                                        } else {
                                            sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                                            break;
                                        }
                                    } else {
                                        sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                                        sb2.setLength(0);
                                        break;
                                    }
                                }
                                sb.append(cCharAt);
                                sb.append((CharSequence) sb2);
                            }
                        }
                    }
                }
            } else {
                sb.append(cCharAt);
            }
            i++;
        }
        return sb.toString();
    }

    private static String zzUS(String str) {
        if (zzZKN.zzU3(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        boolean z = false;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\\') {
                z = true;
            } else if (cCharAt == 'p' && z) {
                i++;
                if (i < str.length()) {
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 == 'L' || cCharAt2 == 'N' || cCharAt2 == 'M' || cCharAt2 == 'S' || cCharAt2 == 'P' || cCharAt2 == 'Z' || cCharAt2 == 'C') {
                        sb.append(cCharAt);
                        sb.append("{");
                        sb.append(cCharAt2);
                        sb.append("}");
                    } else {
                        sb.append(cCharAt);
                        sb.append(cCharAt2);
                    }
                }
                z = false;
                i++;
            } else {
                z = false;
            }
            sb.append(cCharAt);
            i++;
        }
        return sb.toString();
    }

    public static String zzr(String str, int i) {
        try {
            try {
                try {
                    str = zzUR(str);
                    Pattern.compile(str, i);
                    return str;
                } catch (PatternSyntaxException unused) {
                    str = zzUS(str);
                    Pattern.compile(str, i);
                    return str;
                }
            } catch (PatternSyntaxException unused2) {
                return str;
            }
        } catch (PatternSyntaxException unused3) {
            str = zzUQ(str);
            Pattern.compile(str, i);
            return str;
        }
    }
}
