package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz4F {

    public static class zzZ {
        private static int[] zzZ0L = {19050, 19050, 28575, 19050};
        private static int[] zzZ0K = {0, 0, 0, 0};

        private static int[] zzXI(double d) {
            if (com.aspose.words.internal.zzAN.zzZD(d)) {
                return zzZ0K;
            }
            if (d < 2.0d || com.aspose.words.internal.zzAN.zzL(d, 2.0d)) {
                return zzZ0L;
            }
            double d2 = d - 2.0d;
            int iZzZb = (((int) com.aspose.words.internal.zzZKQ.zzZb(d2 / 1.5d)) + (!com.aspose.words.internal.zzAN.zzZD(d2 % 1.5d) ? 1 : 0)) * 19050;
            int[] iArr = zzZ0L;
            return new int[]{iArr[0] + iZzZb, iArr[1] + iZzZb, iArr[2] + iZzZb, iArr[3] + iZzZb};
        }

        public static void zzY(ShapeBase shapeBase, double d, double d2) {
            if (shapeBase != null) {
                shapeBase.isImage();
            }
            int[] iArrZzXI = zzXI(d2);
            int[] iArrZzXI2 = zzXI(d);
            for (int i = 4143; i <= 4146; i++) {
                int iIntValue = ((Integer) shapeBase.fetchShapeAttr(i)).intValue();
                int i2 = i - 4143;
                int i3 = iArrZzXI[i2];
                int i4 = (i3 - iArrZzXI2[i2]) + iIntValue;
                if (i4 >= 0 || i3 <= 0) {
                    i3 = i4;
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                shapeBase.setShapeAttr(i, Integer.valueOf(i3));
            }
        }
    }

    public static void zzZ(ShapeBase shapeBase, double d, double d2) {
        if (shapeBase == null || com.aspose.words.internal.zzAN.zzL(d, d2)) {
            return;
        }
        shapeBase.getMarkupLanguage();
        if (shapeBase.isImage()) {
            zzZ.zzY(shapeBase, d, d2);
        }
    }
}
