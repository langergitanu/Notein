package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYPB {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("number-rows-repeated", "default-cell-style-name", "visibility", "id", "table-cell", "covered-table-cell");

    public static void zzV(zzYQ7 zzyq7, zzYPI zzypi) throws Exception {
        zzZ(zzyq7, zzypi, false);
    }

    public static void zzZ(zzYQ7 zzyq7, zzYPI zzypi, boolean z) throws Exception {
        zzYQ4 zzyq4 = new zzYQ4();
        zzyq7.zzE5(null);
        zzZ(zzyq7, zzyq4);
        zzYPA zzypa = (zzYPA) zzyq7.zzYuS().zzY(zzyq7.zzYuP(), "table-row", zzyq7.zzYuO(), true);
        if (zzypa != null && zzypa.zzZYf() != null) {
            zzypa.zzZYf().zzY(zzyq4.zzZYf());
        }
        zzyq4.zzZ(zzypa);
        zzypi.zzZ(zzyq4);
        zzZ(zzyq7, zzypi, zzyq4);
        if (zzypi.zzYtv() != null) {
            zzyq4.zzZYf().zzwa(com.aspose.words.internal.zzSA.zzu(zzypi.zzYtv().zzYvQ().zzYvC().zzYvO()));
        }
        if (z) {
            zzyq4.zzZYf().zzQ(4040, Boolean.TRUE);
        }
    }

    private static void zzZ(zzYQ7 zzyq7, zzYQ4 zzyq4) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            if (!zzyq7.zzV(zzyq9ZzYuT)) {
                int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
                if (iZzTP == 0) {
                    zzyq4.zzrK(zzyq9ZzYuT.zzb());
                } else if (iZzTP == 1) {
                    zzyq4.zzE3(zzyq9ZzYuT.getValue());
                } else if (iZzTP != 2 && iZzTP != 3) {
                    zzyq7.zzYi("table:table-row", zzyq9ZzYuT.getLocalName());
                } else {
                    zzyq7.zzZ(256, false, "table:table-row");
                }
            }
        }
    }

    private static void zzZ(zzYQ7 zzyq7, zzYPI zzypi, zzYQ4 zzyq4) throws Exception {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ("table-row")) {
            int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            if (iZzTP == 4) {
                zzYPH.zzZ(zzyq7, zzypi, zzyq4, false);
            } else if (iZzTP != 5) {
                zzyq9ZzYuT.zzk();
            } else {
                zzYPH.zzZ(zzyq7, zzypi, zzyq4, true);
            }
        }
    }
}
