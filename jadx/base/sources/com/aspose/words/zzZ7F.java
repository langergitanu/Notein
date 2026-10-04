package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ7F {
    public static zzZ5C zzZ(zzZ55 zzz55, zzY76 zzy76, zzZ5C zzz5c, zzZ5C zzz5c2, zzZ5C zzz5c3, int i) throws Exception {
        if (zzz5c2 != null || zzz5c3 != null) {
            if (zzz5c2 == null) {
                return zzZ(zzz55, zzy76, zzz5c, zzz5c3);
            }
            if (zzz5c3 == null) {
                return zzZ(zzz55, zzy76, zzz5c, zzz5c2, i);
            }
            double dZzZ = zzZ(zzz55, zzy76, zzz5c3);
            double dZzZ2 = zzZ(zzz55, zzy76, zzz5c);
            double dZzZ3 = zzZ(zzz55, zzy76, zzz5c2, i);
            if (!zzz5c2.zzYQX() || dZzZ >= 0.975d) {
                if (zzz5c2.zzYQX()) {
                    if (dZzZ3 <= 1.0d && dZzZ2 >= dZzZ3) {
                    }
                } else if (dZzZ3 > dZzZ) {
                }
                return zzz5c2;
            }
            return zzz5c3;
        }
        return zzz5c;
    }

    private static zzZ5C zzZ(zzZ55 zzz55, zzY76 zzy76, zzZ5C zzz5c, zzZ5C zzz5c2, int i) throws Exception {
        double dZzZ = zzZ(zzz55, zzy76, zzz5c);
        double dZzZ2 = zzZ(zzz55, zzy76, zzz5c2, i);
        if (dZzZ2 > 1.0d) {
            return zzz5c;
        }
        if (zzz5c.zzYQX() || !zzz5c2.zzYQX()) {
            if ((zzz5c.zzYQX() && !zzz5c2.zzYQX()) || dZzZ >= dZzZ2) {
                return zzz5c2;
            }
        } else if (dZzZ > 0.98d) {
            return zzz5c2;
        }
        return zzz5c;
    }

    private static zzZ5C zzZ(zzZ55 zzz55, zzY76 zzy76, zzZ5C zzz5c, zzZ5C zzz5c2) throws Exception {
        return zzZ(zzz55, zzy76, zzz5c2) < 0.975d ? zzz5c2 : zzz5c;
    }

    private static double zzZ(zzZ55 zzz55, zzY76 zzy76, zzZ5C zzz5c) throws Exception {
        return ((double) (zzz55.getWidth() - zzZ5B.zzZ(zzz55, zzz5c, zzy76))) / ((double) zzZ5H.zzR((zzYAU) zzz55.zz6x(), zzz5c.zzYQY().zz14()));
    }

    private static double zzZ(zzZ55 zzz55, zzY76 zzy76, zzZ5C zzz5c, int i) throws Exception {
        return ((double) (zzZ5B.zzZ(zzz55, zzz5c, zzy76) - zzz55.getWidth())) / ((double) i);
    }
}
