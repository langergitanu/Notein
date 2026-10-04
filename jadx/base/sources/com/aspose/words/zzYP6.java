package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYP6 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("min-height", "min-width", "chain-next-name", "corner-radius", "max-height", "max-width", "id");

    private static void zzX(zzYQ7 zzyq7, Shape shape) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        double dZzFV = Double.NaN;
        double dZzFV2 = Double.NaN;
        while (zzyq9ZzYuT.zzi()) {
            switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                case 0:
                    dZzFV = zzYSF.zzFV(zzyq9ZzYuT.getValue());
                    break;
                case 1:
                    dZzFV2 = zzYSF.zzFV(zzyq9ZzYuT.getValue());
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    zzyq7.zzZ(256, false, "text-box");
                    break;
                default:
                    zzyq7.zzYi("text-box", zzyq9ZzYuT.getLocalName());
                    break;
            }
        }
        zzYC3 zzyc3ZzYvW = shape.zzYvW();
        if (dZzFV <= 0.0d) {
            zzyc3ZzYvW.remove(4132);
        }
        if (dZzFV2 <= 0.0d) {
            zzyc3ZzYvW.remove(4131);
        }
        if (zzyc3ZzYvW.zzPk(4132) != null || Double.isNaN(dZzFV)) {
            return;
        }
        zzyc3ZzYvW.zzQ(4132, Double.valueOf(dZzFV));
        zzyc3ZzYvW.zzQ(190, Boolean.TRUE);
    }

    public static void zzZ(zzYQ7 zzyq7, CompositeNode compositeNode, Shape shape) throws Exception {
        zzyq7.zzE5(null);
        if (zzyq7.zzYuz()) {
            for (int i = 129; i <= 132; i++) {
                if (shape.zzYvW().zzPk(i) == null) {
                    shape.zzYvW().zzQ(i, 0);
                }
            }
        }
        zzX(zzyq7, shape);
        zzYP5.zzZ(zzyq7, "text-box", shape);
        zzyq7.zzZ(compositeNode, shape);
    }
}
