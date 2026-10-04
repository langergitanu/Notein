package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: loaded from: classes6.dex */
final class zzXYX {
    private static com.aspose.words.internal.zzZYK zzWSh;

    static {
        com.aspose.words.internal.zzZYK zzzyk = new com.aspose.words.internal.zzZYK();
        zzWSh = zzzyk;
        zzzyk.zzY("quot", '\"');
        zzWSh.zzY("amp", '&');
        zzWSh.zzY("apos", '\'');
        zzWSh.zzY(TranslateLanguage.LITHUANIAN, '<');
        zzWSh.zzY("gt", '>');
    }

    public static String zzyj(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        StringBuilder sb2 = new StringBuilder(10);
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            if (z) {
                char cCharAt = str.charAt(i);
                if (cCharAt != '&') {
                    if (cCharAt != ';') {
                        sb2.append(str.charAt(i));
                        if (sb2.length() > 9) {
                            sb.append('&');
                            com.aspose.words.internal.zzZNH.zzZ(sb, sb2);
                            sb2.setLength(0);
                        }
                    } else if (sb2.length() == 0) {
                        com.aspose.words.internal.zzZNH.zzU(sb, "&;");
                    } else {
                        if (sb2.charAt(0) == '#') {
                            try {
                                if (sb2.charAt(1) == 'x' || sb2.charAt(1) == 'X') {
                                    sb.append((char) com.aspose.words.internal.zzJB.zzZe(sb2.substring(2, sb2.length())));
                                } else {
                                    sb.append((char) com.aspose.words.internal.zzJB.parseInt(sb2.substring(1, sb2.length())));
                                }
                            } catch (Exception unused) {
                                sb.append('&');
                                com.aspose.words.internal.zzZNH.zzZ(sb, sb2).append(';');
                            }
                        } else {
                            char cZzXq = zzWSh.zzXq(sb2.toString());
                            if (com.aspose.words.internal.zzZYK.zzx(cZzXq)) {
                                sb.append('&');
                                com.aspose.words.internal.zzZNH.zzZ(sb, sb2).append(';');
                            } else {
                                sb.append(cZzXq);
                            }
                        }
                        sb2.delete(0, sb2.length());
                    }
                    z = false;
                } else {
                    sb.append('&');
                    com.aspose.words.internal.zzZNH.zzZ(sb, sb2);
                    sb2.setLength(0);
                }
            } else if (str.charAt(i) != '&') {
                sb.append(str.charAt(i));
            } else {
                z = true;
            }
        }
        if (z) {
            sb.append('&');
            com.aspose.words.internal.zzZNH.zzZ(sb, sb2);
        }
        return sb.toString();
    }
}
