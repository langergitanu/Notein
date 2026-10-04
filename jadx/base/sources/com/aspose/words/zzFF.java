package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzFF {
    private static Object[] zzZdq = {zzFE.zzZdi, zzFE.zzZdg, new int[]{4}, new int[]{5}, new int[]{6}, new int[]{7}, new int[]{8}, new int[]{9}};
    private static Object[] zzZdp = {zzFE.zzZdh, zzFE.zzZdf, null, null, null, null, null, null};
    private static int[] zzZdo = {0, 0, 2, 2, 0, 2};
    private static int[] zzZdn = {0, 0, 0, 0, 0, 0};
    private static int[] zzZdm = {3, 5, 5, 7, 5, 5};
    private static zzF9[] zzZdl = {null, new zzF9(0), new zzF9(1), new zzF9(2), null, new zzF9(2)};
    private static zzEL[] zzZdk = {null, new zzEL(1, (zzZCM) null), null, null, null, null};

    private static zzZCM[] zzL1(int i) {
        return i == 41 ? zzFE.zzZdb : (zzZCM[]) zzZdp[(i - 1) % 8];
    }

    private static int[] zzL2(int i) {
        return i == 41 ? zzFE.zzZdc : (int[]) zzZdq[(i - 1) % 8];
    }

    private static void zzL3(int i) {
        if (i <= 0 || i > 48) {
            throw new IllegalArgumentException("Style value must be in range between 1 and 48 inclusively.");
        }
    }

    public static zzF9 zzL4(int i) {
        zzL3(i);
        return zzZdl[(i - 1) / 8];
    }

    public static zzEL zzL5(int i) {
        zzL3(i);
        return new zzEL(zzL2(i), zzL1(i));
    }

    public static zzEL zzL6(int i) {
        zzL3(i);
        return new zzEL(0, zzL2(i), zzL1(i), (float) com.aspose.words.internal.zzSA.zzYA(zzZdm[(i - 1) / 8]));
    }

    public static zzEL zze(int i, boolean z) {
        zzL3(i);
        zzEL zzel = zzZdk[(i - 1) / 8];
        switch (i) {
            case 33:
                return z ? new zzEL(0, zzFE.zzYp(92.5d)) : new zzEL(0, zzFE.zzYp(50.0d));
            case 34:
                return new zzEL(zzFE.zzZde, zzFE.zzZdd);
            case 35:
                return new zzEL(4, zzFE.zzYp(50.0d));
            case 36:
                return new zzEL(5, zzFE.zzYp(50.0d));
            case 37:
                return new zzEL(6, zzFE.zzYp(50.0d));
            case 38:
                return new zzEL(7, zzFE.zzYp(50.0d));
            case 39:
                return new zzEL(8, zzFE.zzYp(50.0d));
            case 40:
                return new zzEL(9, zzFE.zzYp(50.0d));
            default:
                return zzel;
        }
    }

    public static zzF3 zzf(int i, boolean z) {
        zzL3(i);
        int i2 = (i - 1) / 8;
        return new zzF3(z ? zzZdn[i2] : zzZdo[i2], zzL2(i), zzL1(i));
    }
}
