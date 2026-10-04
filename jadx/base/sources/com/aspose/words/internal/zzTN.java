package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzTN {
    private static char[][] zzRi = {new char[]{22777, 36019, 21443, 32902, 20237, 38520, 26578, 25420, 29590}, new char[]{25342, 20336, 20191}};
    private static char[][] zzRh = {new char[]{22777, 36144, 21441, 32902, 20237, 38470, 26578, 25420, 29590}, new char[]{25342, 20336, 20191}};
    private static char[][] zzRg = {new char[]{19968, 20108, 19977, 22235, 20116, 20845, 19971, 20843, 20061}, new char[]{21313, 30334, 21315}};

    private static String zzV(long j, int i) {
        if (j == 0) {
            return "";
        }
        if (j < 10) {
            return Character.toString(zzx((int) j, i));
        }
        if (j == 10) {
            return Character.toString((char) 21313);
        }
        ArrayList<Integer> arrayListZzQ = zzIU.zzQ(j, 1);
        StringBuilder sb = new StringBuilder();
        if (j < 20) {
            sb.append((char) 21313);
            sb.append(zzx(arrayListZzQ.get(0).intValue(), i));
        } else if (j < 100) {
            sb.append(zzx(arrayListZzQ.get(1).intValue(), i));
            sb.append((char) 21313);
            if (arrayListZzQ.get(0).intValue() != 0) {
                sb.append(zzx(arrayListZzQ.get(0).intValue(), i));
            }
        } else {
            for (int size = arrayListZzQ.size() - 1; size >= 0; size--) {
                sb.append(zzx(arrayListZzQ.get(size).intValue(), i));
            }
        }
        return sb.toString();
    }

    private static String zzW(long j, int i) {
        if (j == 0) {
            return "";
        }
        ArrayList<Integer> arrayListZzQ = zzIU.zzQ(j, 1);
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (int size = arrayListZzQ.size() - 1; size >= 0; size--) {
            int iIntValue = arrayListZzQ.get(size).intValue();
            if (iIntValue == 0) {
                z = true;
            } else {
                if (z) {
                    sb.append(zzYW(i));
                    z = false;
                }
                zzZNH.zzU(sb, zzZ(iIntValue, size, j, i));
            }
        }
        return sb.toString();
    }

    public static String zzX(long j, int i) {
        switch (i) {
            case 38:
            case 39:
            case 42:
            case 43:
                return zzW(j, i);
            case 40:
            default:
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: numberStyle");
            case 41:
                return zzV(j, i);
        }
    }

    private static char zzYW(int i) {
        switch (i) {
            case 38:
            case 39:
            case 42:
                return (char) 38646;
            case 40:
            default:
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: numberStyle");
            case 41:
                return (char) 9675;
            case 43:
                return (char) 12295;
        }
    }

    private static char zzYX(int i) {
        if (i == 38 || i == 39) {
            return (char) 33836;
        }
        if (i == 42 || i == 43) {
            return (char) 19975;
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: numberStyle");
    }

    private static String zzZ(int i, int i2, long j, int i3) {
        StringBuilder sb = new StringBuilder();
        if ((i3 != 39 && i3 != 43) || j >= 20 || i2 != 1) {
            sb.append(zzx(i, i3));
        }
        int i4 = i2 % 4;
        if (i4 != 0) {
            sb.append(zzw(i4, i3));
        }
        zzZNH.zzZ(sb, zzYX(i3), i2 / 4);
        return sb.toString();
    }

    private static char zzw(int i, int i2) {
        if (i == 4) {
            return zzYX(i2);
        }
        if (i2 == 38) {
            return zzRi[1][i - 1];
        }
        if (i2 != 39) {
            if (i2 == 42) {
                return zzRh[1][i - 1];
            }
            if (i2 != 43) {
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: numberStyle");
            }
        }
        return zzRg[1][i - 1];
    }

    private static char zzx(int i, int i2) {
        if (i == 0) {
            return zzYW(i2);
        }
        switch (i2) {
            case 38:
                return zzRi[0][i - 1];
            case 39:
            case 41:
            case 43:
                return zzRg[0][i - 1];
            case 40:
            default:
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: numberStyle");
            case 42:
                return zzRh[0][i - 1];
        }
    }
}
