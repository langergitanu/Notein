package com.aspose.words;

import com.aspose.words.ref.Ref;

/* JADX INFO: loaded from: classes6.dex */
final class zzYYX {
    private static String zzW(com.aspose.words.internal.zzRK zzrk) throws Exception {
        char c;
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        boolean zZzYf = false;
        while (zzrk.zzR2() && (c = zzrk.readChar()) != 0) {
            sb.append(c);
            if (z && !com.aspose.words.internal.zzZYD.zzZ1(c)) {
                z = false;
            }
            if (c == '\\' || c == '\r' || c == '\n') {
                if (zzrk.zzR2()) {
                    char c2 = zzrk.readChar();
                    if (c == '\\') {
                        continue;
                    } else {
                        if (c2 == 0) {
                            return null;
                        }
                        zzrk.zzR4();
                        if (c != '\r' || c2 != '\n') {
                            if (c2 != ' ' && c2 != '\t') {
                                if (zZzYf || z) {
                                    return sb.toString();
                                }
                                return null;
                            }
                            zzrk.zzR6();
                        }
                    }
                } else {
                    continue;
                }
            } else if (!zZzYf) {
                zZzYf = zzYf(c);
            }
        }
        return null;
    }

    private static boolean zzYf(char c) {
        return (c >= ' ' && c <= '~') || c == '\t';
    }

    private static boolean zzYg(char c) {
        return com.aspose.words.internal.zzZYD.isLetter(c) || com.aspose.words.internal.zzZYD.isDigit(c) || c == '-';
    }

    public static FileFormatInfo zzZ(com.aspose.words.internal.zzRK zzrk) throws Exception {
        zzrk.zzR8();
        boolean z = false;
        while (!z) {
            Ref ref = new Ref(null);
            int iZzZ = zzZ(zzrk, (Ref<String>) ref);
            String str = (String) ref.get();
            if (iZzZ != 1) {
                if (iZzZ == 2 || zzW(zzrk) == null) {
                    return null;
                }
                if (com.aspose.words.internal.zzZYD.zzi(str, "content-type") || com.aspose.words.internal.zzZYD.zzi(str, "mime-version")) {
                    z = true;
                }
                zzrk.zzR6();
            }
        }
        FileFormatInfo fileFormatInfo = new FileFormatInfo();
        fileFormatInfo.setLoadFormat(51);
        fileFormatInfo.zzZ(com.aspose.words.internal.zzZO0.zzhX());
        return fileFormatInfo;
    }

    private static int zzZ(com.aspose.words.internal.zzRK zzrk, Ref<String> ref) throws Exception {
        StringBuilder sb = new StringBuilder();
        ref.set("");
        int i = 0;
        boolean z = false;
        while (zzrk.zzR2()) {
            char c = zzrk.readChar();
            if (c != '\t') {
                if (c == '\n') {
                    return zzZ(sb, ref);
                }
                if (c == '\r') {
                    if (zzrk.zzR2() && zzrk.readChar() != '\n') {
                        zzrk.zzR4();
                    }
                    return zzZ(sb, ref);
                }
                if (c != ' ') {
                    if (c != ':') {
                        if (!zzYg(c) || z) {
                            i = 1;
                        }
                        sb.append(c);
                    } else {
                        ref.set(sb.length() != 0 ? sb.toString() : null);
                        return (sb.length() == 0 || i != 0) ? 1 : 0;
                    }
                }
            }
            z = true;
        }
        return i;
    }

    private static int zzZ(StringBuilder sb, Ref<String> ref) {
        ref.set(sb.length() != 0 ? sb.toString() : null);
        return sb.length() != 0 ? 1 : 2;
    }
}
