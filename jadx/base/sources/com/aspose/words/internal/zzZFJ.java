package com.aspose.words.internal;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.microsoft.identity.common.java.AuthenticationConstants;
import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;
import java.io.OutputStreamWriter;
import java.io.Writer;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZFJ {
    /* JADX WARN: Removed duplicated region for block: B:116:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String zzUv(String str) {
        char cCharAt;
        String strSubstring = str;
        if (strSubstring != null && strSubstring.length() >= 3) {
            boolean z = false;
            char cCharAt2 = strSubstring.charAt(0);
            if ((cCharAt2 == 'c' || cCharAt2 == 'C') && ((cCharAt = strSubstring.charAt(1)) == 's' || cCharAt == 'S')) {
                strSubstring = strSubstring.substring(2);
                cCharAt2 = strSubstring.charAt(0);
                z = true;
            }
            if (cCharAt2 == 'A') {
                if (zzZDX.zzXv(strSubstring, AuthenticationConstants.ENCODING_ASCII_STRING)) {
                    return "US-ASCII";
                }
            } else if (cCharAt2 == 'C') {
                if (zzZDX.zzXu(strSubstring, "cp")) {
                    return "IBM" + zzZDX.zzwY(strSubstring).substring(2);
                }
                if (zzZDX.zzXu(strSubstring, TranslateLanguage.CZECH) && zzZDX.zzXu(strSubstring, "csIBM")) {
                    return zzZDX.zzwY(strSubstring).substring(2);
                }
            } else if (cCharAt2 == 'E') {
                if (strSubstring.startsWith("EBCDIC-CP-") || strSubstring.startsWith("ebcdic-cp-")) {
                    String strSubstring2 = zzZDX.zzwY(strSubstring).substring(8);
                    return (strSubstring2.equals(AbstractDevicePopManager.CertificateProperties.COUNTRY) || strSubstring2.equals("CA") || strSubstring2.equals("WT") || strSubstring2.equals("NL")) ? "IBM037" : (strSubstring2.equals("DK") || strSubstring2.equals("NO")) ? "IBM277" : (strSubstring2.equals("FI") || strSubstring2.equals("SE")) ? "IBM278" : (strSubstring2.equals("ROECE") || strSubstring2.equals("YU")) ? "IBM870" : strSubstring2.equals("IT") ? "IBM280" : strSubstring2.equals("ES") ? "IBM284" : strSubstring2.equals("GB") ? "IBM285" : strSubstring2.equals("FR") ? "IBM297" : strSubstring2.equals("AR1") ? "IBM420" : strSubstring2.equals("AR2") ? "IBM918" : strSubstring2.equals("HE") ? "IBM424" : strSubstring2.equals("CH") ? "IBM500" : strSubstring2.equals("IS") ? "IBM871" : "IBM037";
                }
            } else if (cCharAt2 == 'S') {
                if (zzZDX.zzXv(strSubstring, "Shift_JIS")) {
                    return "Shift_JIS";
                }
            } else if (cCharAt2 == 'U') {
                if (strSubstring.length() >= 2) {
                    char cCharAt3 = strSubstring.charAt(1);
                    if (cCharAt3 == 'C') {
                        if (zzZDX.zzXv(strSubstring, "UCS-2")) {
                            return "UTF-16";
                        }
                        if (zzZDX.zzXv(strSubstring, "UCS-4")) {
                            return "UTF-32";
                        }
                    } else if (cCharAt3 == 'N') {
                        if (z) {
                            if (zzZDX.zzXv(strSubstring, "Unicode")) {
                                return "UTF-16";
                            }
                            if (zzZDX.zzXv(strSubstring, "UnicodeAscii")) {
                                return "ISO-8859-1";
                            }
                            if (zzZDX.zzXv(strSubstring, "UnicodeAscii")) {
                                return "US-ASCII";
                            }
                        }
                    } else if (cCharAt3 != 'c') {
                        if (cCharAt3 != 'n') {
                            if (cCharAt3 == 'S') {
                                if (zzZDX.zzXv(strSubstring, "US-ASCII")) {
                                    return "US-ASCII";
                                }
                            } else if (cCharAt3 == 'T') {
                                if (zzZDX.zzXv(strSubstring, "UTF-8")) {
                                    return "UTF-8";
                                }
                                if (zzZDX.zzXv(strSubstring, "UTF-16BE")) {
                                    return "UTF-16BE";
                                }
                                if (zzZDX.zzXv(strSubstring, "UTF-16LE")) {
                                    return "UTF-16LE";
                                }
                                if (zzZDX.zzXv(strSubstring, "UTF-16")) {
                                    return "UTF-16";
                                }
                                if (zzZDX.zzXv(strSubstring, "UTF-32BE")) {
                                    return "UTF-32BE";
                                }
                                if (zzZDX.zzXv(strSubstring, "UTF-32LE")) {
                                    return "UTF-32LE";
                                }
                                if (zzZDX.zzXv(strSubstring, "UTF-32")) {
                                    return "UTF-32";
                                }
                                if (zzZDX.zzXv(strSubstring, "UTF")) {
                                    return "UTF-16";
                                }
                            } else if (cCharAt3 != 's') {
                                if (cCharAt3 == 't') {
                                }
                            }
                        }
                    }
                }
            } else if (cCharAt2 != 'a') {
                if (cCharAt2 != 'c') {
                    if (cCharAt2 != 'e') {
                        if (cCharAt2 != 's') {
                            if (cCharAt2 != 'u') {
                                if (cCharAt2 == 'I') {
                                    if (zzZDX.zzXv(strSubstring, "ISO-8859-1") || zzZDX.zzXv(strSubstring, "ISO-Latin1")) {
                                        return "ISO-8859-1";
                                    }
                                    if (!zzZDX.zzXu(strSubstring, "ISO-10646")) {
                                        zzZDX.zzXu(strSubstring, "IBM");
                                        return strSubstring;
                                    }
                                    String strSubstring3 = strSubstring.substring(strSubstring.indexOf("10646") + 5);
                                    if (zzZDX.zzXv(strSubstring3, "UCS-Basic")) {
                                        return "US-ASCII";
                                    }
                                    if (zzZDX.zzXv(strSubstring3, "Unicode-Latin1")) {
                                        return "ISO-8859-1";
                                    }
                                    if (zzZDX.zzXv(strSubstring3, "UCS-2")) {
                                        return "UTF-16";
                                    }
                                    if (zzZDX.zzXv(strSubstring3, "UCS-4")) {
                                        return "UTF-32";
                                    }
                                    if (zzZDX.zzXv(strSubstring3, "UTF-1") || zzZDX.zzXv(strSubstring3, "J-1") || zzZDX.zzXv(strSubstring3, "US-ASCII")) {
                                        return "US-ASCII";
                                    }
                                } else if (cCharAt2 == 'J') {
                                    if (zzZDX.zzXv(strSubstring, "JIS_Encoding")) {
                                        return "Shift_JIS";
                                    }
                                } else if (cCharAt2 != 'i') {
                                    if (cCharAt2 == 'j') {
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return strSubstring;
    }

    public static String zzY(Writer writer) {
        if (writer instanceof OutputStreamWriter) {
            return zzUv(((OutputStreamWriter) writer).getEncoding());
        }
        return null;
    }
}
