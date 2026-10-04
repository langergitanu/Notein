package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz3I {
    private static Object zzYZY = new Object();
    private static com.aspose.words.internal.zzD3<zzGO> zzYZZ;

    public static float zzHb(int i) {
        if (i == 0) {
            return 315.0f;
        }
        if (i == 1) {
            return 270.0f;
        }
        if (i == 2) {
            return 225.0f;
        }
        if (i == 3) {
            return 360.0f;
        }
        if (i == 5) {
            return 180.0f;
        }
        if (i == 6) {
            return 45.0f;
        }
        if (i == 7) {
            return 90.0f;
        }
        if (i == 8) {
            return 135.0f;
        }
        switch (i) {
            case 39:
                return 315.0f;
            case 40:
                return 270.0f;
            case 41:
                return 225.0f;
            case 42:
                return 360.0f;
            case 43:
                return 180.0f;
            case 44:
                return 45.0f;
            case 45:
                return 90.0f;
            case 46:
                return 135.0f;
            default:
                return 0.0f;
        }
    }

    public static boolean zzHc(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
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

    public static zzGO zzHd(int i) {
        if (zzYZZ == null) {
            synchronized (zzYZY) {
                try {
                    if (zzYZZ == null) {
                        zzZwn();
                    }
                } finally {
                }
            }
        }
        return zzYZZ.zzVE(i) ? zzYZZ.get(i) : zzS(0.0d, 0.0d, 0.0d, 0.0d);
    }

    public static int zzHe(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                return 2;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
                return 1;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
                return 0;
            default:
                throw new IllegalStateException("Unknown preset camera type.");
        }
    }

    private static zzGO zzS(double d, double d2, double d3, double d4) {
        zzGO zzgo = new zzGO();
        zzgo.zzZ(new zz33());
        zzgo.zzZPw().zzT(new zzHK(d));
        zzgo.zzZPw().zzS(new zzHK(d2));
        zzgo.zzZPw().zzR(new zzHK(d3));
        zzgo.zzY(new zzHK(d4));
        return zzgo;
    }

    private static void zzZwn() {
        com.aspose.words.internal.zzD3<zzGO> zzd3 = new com.aspose.words.internal.zzD3<>(62);
        zzYZZ = zzd3;
        zzd3.add(0, zzS(0.0d, 0.0d, 0.0d, 0.0d));
        zzYZZ.add(1, zzS(0.0d, 0.0d, 0.0d, 0.0d));
        zzYZZ.add(2, zzS(0.0d, 0.0d, 0.0d, 0.0d));
        zzYZZ.add(3, zzS(0.0d, 0.0d, 0.0d, 0.0d));
        zzYZZ.add(4, zzS(0.0d, 0.0d, 0.0d, 0.0d));
        zzYZZ.add(5, zzS(0.0d, 0.0d, 0.0d, 0.0d));
        zzYZZ.add(6, zzS(0.0d, 0.0d, 0.0d, 0.0d));
        zzYZZ.add(7, zzS(0.0d, 0.0d, 0.0d, 0.0d));
        zzYZZ.add(8, zzS(0.0d, 0.0d, 0.0d, 0.0d));
        zzYZZ.add(9, zzS(600000.0d, -600000.0d, 0.0d, 3900000.0d));
        zzYZZ.add(10, zzS(600000.0d, 0.0d, 0.0d, 3900000.0d));
        zzYZZ.add(11, zzS(600000.0d, 600000.0d, 0.0d, 3900000.0d));
        zzYZZ.add(12, zzS(0.0d, -600000.0d, 0.0d, 3900000.0d));
        zzYZZ.add(13, zzS(0.0d, 0.0d, 0.0d, 3900000.0d));
        zzYZZ.add(14, zzS(0.0d, 600000.0d, 0.0d, 3900000.0d));
        zzYZZ.add(15, zzS(-600000.0d, -600000.0d, 0.0d, 3900000.0d));
        zzYZZ.add(16, zzS(-600000.0d, 0.0d, 0.0d, 3900000.0d));
        zzYZZ.add(17, zzS(-600000.0d, 600000.0d, 0.0d, 3900000.0d));
        zzYZZ.add(18, zzS(0.0d, 0.0d, 0.0d, 0.0d));
        zzYZZ.add(19, zzS(1.9476E7d, 1.8882E7d, 3612000.0d, 0.0d));
        zzYZZ.add(20, zzS(1.9476E7d, 2718000.0d, 1.7988E7d, 0.0d));
        zzYZZ.add(21, zzS(2124000.0d, 2718000.0d, 3612000.0d, 0.0d));
        zzYZZ.add(22, zzS(2124000.0d, 1.8882E7d, 1.7988E7d, 0.0d));
        zzYZZ.add(23, zzS(1.95E7d, 2700000.0d, 0.0d, 0.0d));
        zzYZZ.add(24, zzS(2100000.0d, 2700000.0d, 0.0d, 0.0d));
        zzYZZ.add(25, zzS(2100000.0d, 1.89E7d, 0.0d, 0.0d));
        zzYZZ.add(26, zzS(1.95E7d, 1.89E7d, 0.0d, 0.0d));
        zzYZZ.add(27, zzS(1080000.0d, 3840000.0d, 0.0d, 0.0d));
        zzYZZ.add(28, zzS(1080000.0d, 2.004E7d, 0.0d, 0.0d));
        zzYZZ.add(29, zzS(1.8078E7d, 1.839E7d, 3456000.0d, 0.0d));
        zzYZZ.add(30, zzS(1080000.0d, 1560000.0d, 0.0d, 0.0d));
        zzYZZ.add(31, zzS(1080000.0d, 1.776E7d, 0.0d, 0.0d));
        zzYZZ.add(32, zzS(1.8078E7d, 3210000.0d, 1.8144E7d, 0.0d));
        zzYZZ.add(33, zzS(2.052E7d, 3840000.0d, 0.0d, 0.0d));
        zzYZZ.add(34, zzS(2.052E7d, 2.004E7d, 0.0d, 0.0d));
        zzYZZ.add(35, zzS(3522000.0d, 1.839E7d, 1.8144E7d, 0.0d));
        zzYZZ.add(36, zzS(2.052E7d, 1560000.0d, 0.0d, 0.0d));
        zzYZZ.add(37, zzS(2.052E7d, 1.776E7d, 0.0d, 0.0d));
        zzYZZ.add(38, zzS(3522000.0d, 3210000.0d, 3456000.0d, 0.0d));
        zzYZZ.add(39, zzS(0.0d, 0.0d, 0.0d, 0.0d));
        zzYZZ.add(40, zzS(0.0d, 0.0d, 0.0d, 0.0d));
        zzYZZ.add(41, zzS(0.0d, 0.0d, 0.0d, 0.0d));
        zzYZZ.add(42, zzS(0.0d, 0.0d, 0.0d, 0.0d));
        zzYZZ.add(43, zzS(0.0d, 0.0d, 0.0d, 0.0d));
        zzYZZ.add(44, zzS(0.0d, 0.0d, 0.0d, 0.0d));
        zzYZZ.add(45, zzS(0.0d, 0.0d, 0.0d, 0.0d));
        zzYZZ.add(46, zzS(0.0d, 0.0d, 0.0d, 0.0d));
        zzYZZ.add(47, zzS(0.0d, 0.0d, 0.0d, 2700000.0d));
        zzYZZ.add(48, zzS(0.0d, 1200000.0d, 0.0d, 2700000.0d));
        zzYZZ.add(49, zzS(0.0d, 2.04E7d, 0.0d, 2700000.0d));
        zzYZZ.add(50, zzS(2.04E7d, 0.0d, 0.0d, 2700000.0d));
        zzYZZ.add(51, zzS(1200000.0d, 0.0d, 0.0d, 2700000.0d));
        zzYZZ.add(52, zzS(2358000.0d, 858000.0d, 2.0466E7d, 2700000.0d));
        zzYZZ.add(53, zzS(2358000.0d, 2.0742E7d, 1134000.0d, 2700000.0d));
        zzYZZ.add(54, zzS(624000.0d, 2634000.0d, 2.1384E7d, 2700000.0d));
        zzYZZ.add(55, zzS(624000.0d, 1.8966E7d, 216000.0d, 2700000.0d));
        zzYZZ.add(56, zzS(2.094E7d, 858000.0d, 156000.0d, 2700000.0d));
        zzYZZ.add(57, zzS(2.094E7d, 2.0742E7d, 2.1444E7d, 2700000.0d));
        zzYZZ.add(58, zzS(486000.0d, 2124000.0d, 2.1426E7d, 4800000.0d));
        zzYZZ.add(59, zzS(486000.0d, 1.953E7d, 174000.0d, 4800000.0d));
        zzYZZ.add(60, zzS(1.8576E7d, 0.0d, 0.0d, 2700000.0d));
        zzYZZ.add(61, zzS(1.9488E7d, 0.0d, 0.0d, 2700000.0d));
    }
}
