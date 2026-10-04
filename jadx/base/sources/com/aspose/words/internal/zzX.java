package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzX {
    private static float[] zzU = new float[0];
    private static float[] zzT = {3.0f, 1.0f};
    private static float[] zzS = {1.0f, 1.0f};
    private static float[] zzR = {3.0f, 1.0f, 1.0f, 1.0f};
    private static float[] zzQ = {3.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};

    public static boolean zzX(int i, int i2) {
        return i2 != 0 ? i2 == 1 && i == 2 : i == 0;
    }

    public static boolean zzY(int i, int i2) {
        return i2 != 0 ? i2 != 1 ? i2 == 2 && i == 1 : i == 2 : i == 0;
    }

    public static int zzZ(zzOU zzou) {
        int iZzNN = zzou.zzNN();
        if (iZzNN == 1) {
            return 2;
        }
        if (iZzNN == 2) {
            return 1;
        }
        int endCap = zzou.getEndCap();
        if (endCap == 1) {
            return 2;
        }
        if (endCap != 2) {
            return (zzou.getDashStyle() == 0 || zzou.zzNJ() != 2) ? 0 : 1;
        }
        return 1;
    }

    public static int zzY(zzOU zzou) {
        int iZzNM = zzou.zzNM();
        if (iZzNM != 1) {
            return iZzNM != 2 ? 0 : 1;
        }
        return 2;
    }

    public static float[] zzZ(zzOU zzou, boolean z) {
        float[] fArrZzNH;
        int dashStyle = zzou.getDashStyle();
        if (dashStyle == 0) {
            fArrZzNH = zzU;
        } else if (dashStyle == 1) {
            fArrZzNH = zzT;
        } else if (dashStyle == 2) {
            fArrZzNH = zzS;
        } else if (dashStyle == 3) {
            fArrZzNH = zzR;
        } else if (dashStyle == 4) {
            fArrZzNH = zzQ;
        } else if (dashStyle == 5) {
            fArrZzNH = zzou.zzNH();
        } else {
            throw new IllegalStateException("Unknown dash style.");
        }
        float[] fArr = new float[fArrZzNH.length];
        System.arraycopy(fArrZzNH, 0, fArr, 0, fArrZzNH.length);
        zzZ(zzou, fArr, z);
        return fArr;
    }

    private static void zzZ(zzOU zzou, float[] fArr, boolean z) {
        float width = zzAN.zzf(zzou.getWidth()) ? 1.0f : zzou.getWidth();
        for (int i = 0; i < fArr.length; i++) {
            if (zzAN.zzZP(i)) {
                float f = fArr[i];
                if (z) {
                    f += 1.0f;
                }
                fArr[i] = f * width;
            } else {
                float f2 = fArr[i];
                if (z) {
                    f2 -= 1.0f;
                }
                fArr[i] = f2 * width;
            }
        }
    }
}
