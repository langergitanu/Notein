package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY1Z {
    public static void zzY(IWarningCallback iWarningCallback, int i, String str, Object... objArr) {
        zzZ(iWarningCallback, 1, i, str, objArr);
    }

    public static void zzZ(IWarningCallback iWarningCallback, int i, int i2, String str) {
        if (iWarningCallback != null) {
            OooO00o.OooO0O0(iWarningCallback, i, i2, str);
        }
    }

    public static int zzi7(int i) {
        if (i == 10) {
            return 10;
        }
        if (i == 46) {
            return 6;
        }
        if (i == 30) {
            return 12;
        }
        if (i == 31) {
            return 13;
        }
        if (i == 50 || i == 51) {
            return 16;
        }
        if (i == 60 || i == 61) {
            return 15;
        }
        switch (i) {
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                return 9;
            default:
                switch (i) {
                    case 40:
                        return 7;
                    case 41:
                        return 6;
                    case 42:
                        return 18;
                    default:
                        switch (i) {
                            case 70:
                                return 11;
                            case 71:
                            case 72:
                                return 18;
                            case 73:
                                return 23;
                            default:
                                return 0;
                        }
                }
        }
    }

    public static int zzi8(int i) {
        if (i == 10) {
            return 10;
        }
        if (i == 53) {
            return 24;
        }
        if (i == 60) {
            return 15;
        }
        if (i == 30) {
            return 12;
        }
        if (i == 31) {
            return 13;
        }
        if (i == 50 || i == 51) {
            return 16;
        }
        switch (i) {
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                return 9;
            default:
                switch (i) {
                    case 62:
                        return 11;
                    case 63:
                        return 23;
                    case 64:
                        return 7;
                    default:
                        return 0;
                }
        }
    }

    public static void zzZ(IWarningCallback iWarningCallback, int i, int i2, String str, Object... objArr) {
        if (iWarningCallback != null) {
            iWarningCallback.warning(new WarningInfo(i, i2, com.aspose.words.internal.zzZKN.format(str, objArr)));
        }
    }

    public static void zzZ(IWarningCallback iWarningCallback, int i, String str, Object... objArr) {
        zzZ(iWarningCallback, 16777216, i, str, objArr);
    }
}
