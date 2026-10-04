package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz8H {

    public static class zzX implements zzZ {
        private int zzDG;

        public zzX(int i) {
            this.zzDG = i;
        }

        @Override // com.aspose.words.internal.zz8H.zzZ
        public final zz8G zzZ(zz8G zz8g, zz8G zz8g2) {
            return zz8F.zzY(zz8g, zz8g2, this.zzDG);
        }
    }

    public static class zzY implements zzZ {
        private int zzDG;

        public zzY(int i) {
            this.zzDG = i;
        }

        @Override // com.aspose.words.internal.zz8H.zzZ
        public final zz8G zzZ(zz8G zz8g, zz8G zz8g2) {
            return zz8F.zzZ(zz8g, zz8g2, this.zzDG);
        }
    }

    public interface zzZ {
        zz8G zzZ(zz8G zz8g, zz8G zz8g2);
    }

    private static boolean zzU(zzZQ5 zzzq5) {
        return zzzq5.getHeight() * zzzq5.getWidth() < 10;
    }

    private static zzXN zzW(zzXN zzxn, zzZQ5 zzzq5) {
        zzXN zzxn2 = new zzXN(zzzq5.getWidth(), zzzq5.getHeight(), 72.0f, 72.0f);
        zzxn.zzZ(zzZQ4.zzN(zzzq5), zzxn2, zzZQ4.zzN(new zzZQ5(0L, zzzq5.getSize())), false, false);
        return zzxn2;
    }

    private static void zzX(zzXN zzxn, zzXN zzxn2, zzZQ5 zzzq5, zzZ zzz) {
        for (int i = 0; i < zzzq5.getWidth(); i++) {
            for (int i2 = 0; i2 < zzzq5.getHeight(); i2++) {
                zz8G zz8g = new zz8G(zzxn.getPixel(i, i2));
                int x = zzzq5.getX() + i;
                int y = zzzq5.getY() + i2;
                zzxn2.setPixel(x, y, zzz.zzZ(zz8g, new zz8G(zzxn2.getPixel(x, y))).zzyf());
            }
        }
    }

    public static void zzY(zzXN zzxn, zzXN zzxn2, zzZQ5 zzzq5, int i) {
        zzZ(zzxn, zzxn2, zzzq5, new zzY(i));
    }

    public static void zzZ(zzXN zzxn, zzXN zzxn2, zzZQ5 zzzq5, int i) {
        if (i == 5570569) {
            zzZ(zzxn2, zzzq5);
        } else {
            zzZ(zzxn, zzxn2, zzzq5, new zzX(i));
        }
    }

    private static void zzY(zzXN zzxn, zzXN zzxn2, zzZQ5 zzzq5, zzZ zzz) {
        zzXN zzxnZzW = zzW(zzxn2, zzzq5);
        try {
            zzXQ zzxqZzWz = zzxn.zzWz();
            zzXQ zzxqZzWz2 = zzxnZzW.zzWz();
            for (int i = 0; i < zzxqZzWz.zzWP(); i++) {
                zz8G zz8gZzZ = zzz.zzZ(new zz8G(zzxqZzWz.zz4(i), zzxqZzWz.zz3(i), zzxqZzWz.zz2(i), zzxqZzWz.zz1(i)), new zz8G(zzxqZzWz2.zz4(i), zzxqZzWz2.zz3(i), zzxqZzWz2.zz2(i), zzxqZzWz2.zz1(i)));
                zzxqZzWz2.zzY(i, zz8gZzZ.zzyj(), zz8gZzZ.zzyi(), zz8gZzZ.zzyh(), zz8gZzZ.zzyg());
            }
            zzxqZzWz.zzWQ();
            zzxqZzWz2.zzWQ();
            zzxnZzW.zzZ(new zzZQ4(0.0f, 0.0f, zzzq5.getWidth(), zzzq5.getHeight()), zzxn2, zzZQ4.zzN(zzzq5), false, false);
            zzxnZzW.dispose();
        } catch (Throwable th) {
            zzxnZzW.dispose();
            throw th;
        }
    }

    private static void zzZ(zzXN zzxn, zzXN zzxn2, zzZQ5 zzzq5, zzZ zzz) {
        if (zzxn == null) {
            return;
        }
        zzxn.getWidth();
        zzzq5.getWidth();
        zzxn.getHeight();
        zzzq5.getHeight();
        zzzq5.getX();
        zzxn.getWidth();
        zzxn2.getWidth();
        zzzq5.getY();
        zzxn.getHeight();
        zzxn2.getHeight();
        if (zzU(zzzq5)) {
            zzX(zzxn, zzxn2, zzzq5, zzz);
        } else {
            zzY(zzxn, zzxn2, zzzq5, zzz);
        }
    }

    private static void zzX(zzXN zzxn, zzZQ5 zzzq5) {
        for (int i = 0; i < zzzq5.getWidth(); i++) {
            for (int i2 = 0; i2 < zzzq5.getHeight(); i2++) {
                int x = zzzq5.getX() + i;
                int y = zzzq5.getY() + i2;
                zzxn.setPixel(x, y, zz8F.zzY(new zz8G(zzxn.getPixel(x, y))).zzyf());
            }
        }
    }

    private static void zzZ(zzXN zzxn, zzZQ5 zzzq5) {
        if (zzU(zzzq5)) {
            zzX(zzxn, zzzq5);
        } else {
            zzY(zzxn, zzzq5);
        }
    }

    private static void zzY(zzXN zzxn, zzZQ5 zzzq5) {
        zzXQ zzxqZzWz = zzxn.zzWz();
        for (int i = 0; i < zzzq5.getWidth(); i++) {
            for (int i2 = 0; i2 < zzzq5.getHeight(); i2++) {
                int x = zzzq5.getX() + i + (zzzq5.getHeight() * (zzzq5.getY() + i2));
                zz8G zz8gZzY = zz8F.zzY(new zz8G(zzxqZzWz.zz4(x), zzxqZzWz.zz3(x), zzxqZzWz.zz2(x), zzxqZzWz.zz1(x)));
                zzxqZzWz.zzY(x, zz8gZzY.zzyj(), zz8gZzY.zzyi(), zz8gZzY.zzyh(), zz8gZzY.zzyg());
            }
        }
        zzxqZzWz.zzWQ();
    }
}
