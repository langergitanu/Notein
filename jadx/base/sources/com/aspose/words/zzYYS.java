package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYYS {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("quoted-printable", "base64");

    public static com.aspose.words.internal.zzZO0 zzI4(String str) {
        if (str.length() == 0) {
            return null;
        }
        try {
            return com.aspose.words.internal.zzZO0.zzV3(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private static void zzX(com.aspose.words.internal.zzZOP zzzop, String str, int i, int i2) throws Exception {
        int i3 = i2 + i;
        while (i < i3) {
            zzzop.writeByte((byte) str.charAt(i));
            i++;
        }
    }

    public static void zzY(com.aspose.words.internal.zzZOP zzzop, String str, int i, int i2) throws Exception {
        byte[] bArrZzVT = com.aspose.words.internal.zzZQB.zzVT(str.substring(i, i2 + i));
        zzzop.write(bArrZzVT, 0, bArrZzVT.length);
    }

    private static boolean zzYd(char c) {
        return c == '\r' || c == '\n';
    }

    private static boolean zzYe(char c) {
        return com.aspose.words.internal.zzZYD.isLetterOrDigit(c) || c == '+' || c == '/' || c == '=' || zzYd(c);
    }

    public static void zzZ(com.aspose.words.internal.zzZOP zzzop, String str, int i, int i2, String str2) throws Exception {
        int iZzTP = zzUR.zzTP(str2);
        if (iZzTP == 0) {
            zzZ(zzzop, str, i, i2);
        } else if (iZzTP != 1) {
            zzX(zzzop, str, i, i2);
        } else {
            zzY(zzzop, str, i, zzx(str, i, i2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0025 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0003 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int zzx(String str, int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < i2) {
            char cCharAt = str.charAt(i + i3);
            if (!zzYe(cCharAt)) {
                break;
            }
            if (cCharAt == '=') {
                i4++;
                if (i4 > 2) {
                    break;
                }
                i3++;
                if (zzYd(cCharAt)) {
                    i5++;
                }
            } else {
                if (i4 > 0) {
                    break;
                }
                i3++;
                if (zzYd(cCharAt)) {
                }
            }
        }
        int i6 = i5 % 4;
        while (i6 > 0 && i3 > 0) {
            char cCharAt2 = str.charAt((i + i3) - 1);
            i3--;
            if (!zzYd(cCharAt2)) {
                i6--;
            }
        }
        return i3;
    }

    public static void zzZ(com.aspose.words.internal.zzZOP zzzop, String str, int i, int i2) throws Exception {
        int i3;
        int i4 = i2 + i;
        while (i < i4) {
            char cCharAt = str.charAt(i);
            int i5 = i + 1;
            if (cCharAt == '=' && (i3 = i + 2) < i4) {
                char cCharAt2 = str.charAt(i5);
                char cCharAt3 = str.charAt(i3);
                i += 3;
                if (cCharAt2 != '\r' || cCharAt3 != '\n') {
                    if (com.aspose.words.internal.zzZYD.isHexDigit(cCharAt2) && com.aspose.words.internal.zzZYD.isHexDigit(cCharAt3)) {
                        zzzop.writeByte((byte) (com.aspose.words.internal.zzZYD.zzm(cCharAt3) + (com.aspose.words.internal.zzZYD.zzm(cCharAt2) * 16)));
                    } else {
                        zzzop.writeByte((byte) 61);
                    }
                }
            } else {
                zzzop.writeByte((byte) cCharAt);
                i = i5;
            }
        }
    }
}
