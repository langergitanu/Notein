package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzUX {
    public static boolean isLetter(char c) {
        int iZzb = zzZVU.zzb(c);
        return iZzb == 0 || iZzb == 1;
    }

    public static boolean zzH(char c) {
        return c >= 3584 && c <= 3711;
    }

    public static boolean zzI(char c) {
        if (c < 43360 || c > 43391) {
            return c >= 44032 && c <= 55215;
        }
        return true;
    }

    private static boolean zzJ(char c) {
        return c == '%' || c == '+' || c == '-' || c == '/';
    }

    public static boolean zzK(char c) {
        return c == 1548 || c == 1643 || c == 1644;
    }

    private static boolean zzL(char c) {
        return c == ',' || c == '.' || c == ':';
    }

    public static boolean zzM(char c) {
        if (c < 1424 || c > 1535) {
            return c >= 64285 && c <= 64335;
        }
        return true;
    }

    public static boolean zzN(char c) {
        return zzM(c) || zzZVS.zzS3(c);
    }

    public static boolean zzO(char c) {
        return c >= 8704 && c <= 8959;
    }

    public static boolean zzP(char c) {
        switch (zzZVU.zzb(c)) {
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return true;
            default:
                return false;
        }
    }

    public static boolean zzQ(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean zzZ(char c, boolean z) {
        if (zzL(c) || zzK(c)) {
            return true;
        }
        return z && zzJ(c);
    }

    public static boolean zzZa(int i) {
        if (i >= 131072 && i <= 173791) {
            return true;
        }
        if (i >= 173824 && i <= 177983) {
            return true;
        }
        if (i >= 177984 && i <= 178207) {
            return true;
        }
        if (i < 178208 || i > 183983) {
            return i >= 194560 && i <= 195103;
        }
        return true;
    }

    public static boolean zzZb(int i) {
        if (i >= 11904 && i <= 42191) {
            return true;
        }
        if (i >= 43360 && i <= 43391) {
            return true;
        }
        if (i >= 44032 && i <= 55295) {
            return true;
        }
        if (i >= 63744 && i <= 64255) {
            return true;
        }
        if (i < 65072 || i > 65103) {
            return i >= 65280 && i <= 65519;
        }
        return true;
    }
}
