package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzZ1 {
    public static byte[] zzXW = new byte[0];
    public static String[] zzXV = new String[0];
    public static Object[] zzXU = new Object[0];

    private zzZ1() {
    }

    public static int binarySearch(int[] iArr, int i, int i2, int i3) {
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >> 1;
            int i7 = iArr[i6];
            if (i7 == i3) {
                return i6;
            }
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static boolean zzX(byte[] bArr) {
        return bArr != null && bArr.length > 0;
    }

    public static String zzY(byte[] bArr) {
        return bArr == null ? "Null" : zzZ(bArr, 0, bArr.length);
    }

    public static boolean zzZ(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int zzX(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            if (zzZYD.zzi(strArr[i], str)) {
                return i;
            }
        }
        return -1;
    }

    public static byte[] zzY(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        if (i > bArr.length) {
            i = bArr.length;
        }
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    public static boolean zzZ(int[] iArr, int[] iArr2) {
        if (iArr == iArr2) {
            return true;
        }
        if (iArr == null || iArr2 == null || iArr.length != iArr2.length) {
            return false;
        }
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static String zzY(String[] strArr) {
        return zzZ(strArr) ? zzZKN.zzO(strArr) : "";
    }

    public static boolean zzY(String[] strArr, String str) {
        if (str == null) {
            for (String str2 : strArr) {
                if (str2 == null) {
                    return true;
                }
            }
        } else {
            for (String str3 : strArr) {
                if (zzZKN.zzX(str, str3, zzZOF.ORDINAL$4894b8c8)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean zzZ(float[] fArr, float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        if (fArr == null || fArr2 == null || fArr.length != fArr2.length) {
            return false;
        }
        for (int i = 0; i < fArr.length; i++) {
            if (fArr[i] != fArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean zzZ(double[] dArr, double[] dArr2) {
        if (dArr == dArr2) {
            return true;
        }
        if (dArr2 == null || 4 != dArr2.length) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if (dArr[i] != dArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static String zzZ(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return "Null";
        }
        StringBuilder sb = new StringBuilder();
        while (i2 > 0) {
            zzZNH.zzZ(sb, "{0:X2} ", Integer.valueOf(bArr[i] & 255));
            i++;
            i2--;
        }
        return sb.toString();
    }

    public static int zzZ(int[] iArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i) {
            int i4 = (i3 + i) >> 1;
            if (iArr[i4] < i2) {
                i3 = i4 + 1;
            } else {
                i = i4;
            }
        }
        return (i3 >= iArr.length || iArr[i3] != i2) ? ~i3 : i3;
    }

    public static int zzZ(short[] sArr, int i, short s) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >> 1;
            short s2 = sArr[i4];
            if (s2 == s) {
                return i4;
            }
            if (s2 < s) {
                i3 = i4 + 1;
            } else {
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public static int zzZ(char[] cArr, int i, char c) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >> 1;
            char c2 = cArr[i4];
            if (c2 == c) {
                return i4;
            }
            if (c2 < c) {
                i3 = i4 + 1;
            } else {
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public static int zzZ(String[] strArr, String str) {
        return zzZ(strArr, 0, strArr.length, str);
    }

    public static int zzZ(String[] strArr, int i, int i2, String str) {
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) / 2;
            int iZzd = zzZYD.zzd(strArr[i5], str);
            if (iZzd == 0) {
                return i5;
            }
            if (iZzd < 0) {
                i4 = i5 + 1;
            } else {
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static int zzZ(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i2 <= 0 || i < 0 || i >= bArr.length || i3 < 0 || i3 >= bArr2.length) {
            return 0;
        }
        int iMin = Math.min(Math.min(i2, bArr.length - i), bArr2.length - i3);
        for (int i4 = 0; i4 < iMin; i4++) {
            bArr2[i3 + i4] = bArr[i + i4];
        }
        return iMin;
    }

    public static boolean zzZ(byte[] bArr, byte[] bArr2, int i) {
        if (bArr.length < i || bArr2.length < i) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static boolean zzZ(String[] strArr) {
        return strArr != null && strArr.length > 0;
    }

    public static boolean zzZ(byte[] bArr, byte b) {
        for (byte b2 : bArr) {
            if (b == b2) {
                return true;
            }
        }
        return false;
    }

    public static boolean zzZ(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    public static int zzZ(byte[] bArr, byte[] bArr2, int i, int i2) {
        int iMin = Math.min(bArr.length - bArr2.length, i2);
        while (i < iMin) {
            if (bArr[i] == bArr2[0]) {
                for (int i3 = 1; i3 < bArr2.length; i3++) {
                    if (bArr[i + i3] != bArr2[i3]) {
                        break;
                    }
                }
                return i;
            }
            i++;
        }
        return -1;
    }

    public static boolean zzZ(char[] cArr, char c) {
        for (char c2 : cArr) {
            if (c == c2) {
                return true;
            }
        }
        return false;
    }

    public static byte[] zzZ(zzZOZ zzzoz) {
        byte[] byteArray = zzzoz.toByteArray();
        zzZKV.zzP(byteArray, 0, 4);
        zzZKV.zzP(byteArray, 4, 2);
        zzZKV.zzP(byteArray, 6, 2);
        return byteArray;
    }

    public static void zzZ(int i, byte[] bArr, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            bArr[i2 + i3] = (byte) i;
            i >>= 8;
        }
    }

    public static <T> T[] zzZ(T[] tArr, T[] tArr2, T[] tArr3) {
        if (tArr == null) {
            return tArr2;
        }
        if (tArr2 == null) {
            return tArr;
        }
        if (tArr3.length != tArr.length + tArr2.length) {
            return null;
        }
        System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static <T> int zzZ(T[] tArr, T[] tArr2) {
        if (tArr2 == null && tArr == null) {
            return 0;
        }
        if (tArr == null) {
            return tArr2.length;
        }
        if (tArr2 == null) {
            return tArr.length;
        }
        return tArr.length + tArr2.length;
    }
}
