package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY4Q {
    private com.aspose.words.internal.zzRK zzYzJ;

    private zzY4Q(com.aspose.words.internal.zzRK zzrk) {
        this.zzYzJ = zzrk;
    }

    public static boolean zzK(char c, int i) {
        if (c != 0 && c != 7) {
            if (c == 128) {
                return i == 932;
            }
            if (c != 133) {
                switch (c) {
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                        break;
                    default:
                        return false;
                }
            }
        }
        return true;
    }

    private static boolean zzXE(char c) {
        return com.aspose.words.internal.zzZKU.zzG(c) || zzXF(c) || c == ',' || c == ';' || c == '|' || c == '\f' || c == 7;
    }

    private static boolean zzXF(char c) {
        return c == '\n' || c == 133;
    }

    public static boolean zzZ(char c) {
        if (c <= 31 || c == 127) {
            return true;
        }
        return c >= 128 && c <= 159;
    }

    private FileFormatInfo zzZ1V() throws Exception {
        int i;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        boolean z = false;
        while (this.zzYzJ.zzR2()) {
            char c = this.zzYzJ.readChar();
            if (com.aspose.words.internal.zzUX.zzN(c)) {
                z = true;
            }
            if (zzZ(c) && !zzK(c, this.zzYzJ.zzQZ().getCodePage())) {
                i9++;
            }
            if (c == 0) {
                i11++;
                if (i11 > i10) {
                    i10 = i11;
                }
            } else {
                i11 = 0;
            }
            i6++;
            if (zzXE(c)) {
                if (i3 != 0) {
                    i4++;
                    i5 += i3;
                    i3 = 0;
                }
                if (zzXF(c)) {
                    i8++;
                }
            } else {
                i3++;
                if (Character.isLetterOrDigit(c)) {
                    i7++;
                }
            }
        }
        if (i3 != 0) {
            i4++;
            i5 += i3;
        }
        if (i6 > 0) {
            double d = i7;
            i = 1;
            if (d / ((double) i6) >= 0.3d) {
                i2 = 2;
            }
        } else {
            i = 1;
        }
        if (i8 > 0 && i6 / i8 < 200) {
            i2++;
        }
        if (i4 > 0 && i5 / i4 < 50) {
            i2++;
        }
        if (i10 > 2) {
            i2 -= 2;
        }
        if ((i9 > 2 ? i2 - ((i9 * 100) / i6) : i2 + i) < 2) {
            return null;
        }
        FileFormatInfo fileFormatInfo = new FileFormatInfo();
        fileFormatInfo.setLoadFormat(62);
        fileFormatInfo.zzZ(this.zzYzJ.zzQZ());
        fileFormatInfo.zzVL(z);
        return fileFormatInfo;
    }

    public static FileFormatInfo zzZ(com.aspose.words.internal.zzRK zzrk) throws Exception {
        return new zzY4Q(zzrk).zzZ1V();
    }
}
