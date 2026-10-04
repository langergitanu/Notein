package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY80 {
    public static float[] zzAy(String str) {
        return zzZ(str, new int[]{0, 0, 0, 1, 1, 0, 0}, false);
    }

    private static boolean zzU(int[] iArr, int i, int i2) {
        int i3;
        return (iArr == null || iArr.length == 0 || i2 == 0 || (i3 = iArr[i % iArr.length]) <= 0 || i2 < i3) ? false : true;
    }

    private static float[] zzZ(String str, int[] iArr, boolean z) {
        com.aspose.words.internal.zzKA zzka = new com.aspose.words.internal.zzKA();
        StringBuilder sb = new StringBuilder(str.length());
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            boolean z4 = sb.length() > 0;
            boolean z5 = (cCharAt == '-' || cCharAt == '+') && z4 && !z2;
            boolean z6 = cCharAt == '.' && z3;
            boolean zZzU = zzU(iArr, i, sb.length());
            if (z4 && (com.aspose.words.internal.zzZYD.zzZ1(cCharAt) || cCharAt == ',' || z5 || z6 || zZzU)) {
                if (!zzZ(z, zzka, sb)) {
                    return null;
                }
                sb.setLength(0);
                i++;
                z3 = false;
            }
            z2 = cCharAt == 'e' || cCharAt == 'E';
            if (com.aspose.words.internal.zzZYD.isDigit(cCharAt) || cCharAt == '.' || cCharAt == '-' || z2) {
                sb.append(cCharAt);
                if (cCharAt == '.') {
                    z3 = true;
                }
            }
        }
        if (sb.length() <= 0 || zzZ(z, zzka, sb)) {
            return zzka.zzIb();
        }
        return null;
    }

    private static float zzZY(String str, boolean z) {
        double dZzZs = com.aspose.words.internal.zzJB.zzZs(str);
        if (Double.isNaN(dZzZs)) {
            return Float.NaN;
        }
        if (z) {
            dZzZs = ConvertUtil.pixelToPoint(dZzZs);
        }
        return (float) dZzZs;
    }

    public static float[] zzZZ(String str, boolean z) {
        return zzZ(str, (int[]) null, z);
    }

    private static boolean zzZ(boolean z, com.aspose.words.internal.zzKA zzka, StringBuilder sb) {
        float fZzZY = zzZY(sb.toString(), z);
        if (Float.isNaN(fZzZY)) {
            return false;
        }
        zzka.zzu(fZzZY);
        return true;
    }
}
