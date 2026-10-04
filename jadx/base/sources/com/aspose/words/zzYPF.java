package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYPF {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("number-columns-repeated", "default-cell-style-name", "visibility", "id");

    private static int zz1(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        int iZzb = 1;
        while (zzyq9ZzYuT.zzi()) {
            if (!zzyq7.zzV(zzyq9ZzYuT)) {
                int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
                if (iZzTP == 0) {
                    iZzb = zzyq9ZzYuT.zzb();
                } else if (iZzTP == 1 || iZzTP == 2 || iZzTP == 3) {
                    zzyq7.zzZ(256, false, "table:table-column");
                } else {
                    zzyq7.zzYi("handle", zzyq9ZzYuT.getLocalName());
                }
            }
        }
        return iZzb;
    }

    public static void zzZ(zzYQ7 zzyq7, zzYSL zzysl) {
        zzyq7.zzE5(null);
        zzZ(zzyq7, zzysl, zz1(zzyq7));
    }

    private static void zzZ(zzYQ7 zzyq7, zzYSL zzysl, int i) {
        if (zzysl == null) {
            return;
        }
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                return;
            }
            zzYPE zzype = (zzYPE) com.aspose.words.internal.zzZKW.zzZ(zzyq7.zzYuS().zzY(zzyq7.zzYuP(), "table-column", zzyq7.zzYuO(), true), zzYPE.class);
            if (zzype == null) {
                zzype = new zzYPE();
            }
            zzysl.zzZ(zzype);
            i = i2;
        }
    }
}
