package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZWC {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("firstRow", "firstColumn", "lastColumn", "lastRow", "noHBand", "noVBand");

    public static int zzI(zzYU4 zzyu4, zzYO3 zzyo3) {
        String strZzV = zzyu4.zzV("val", null);
        int iZzjU = com.aspose.words.internal.zzZYD.zzXk(strZzV) ? zzY6G.zzjU(zzYU3.zzGU(strZzV)) : TableStyleOptions.DEFAULT;
        while (zzyu4.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 0) {
                zzyo3.zzYrc();
                iZzjU = com.aspose.words.internal.zzXU.zzZ(iZzjU, 32, zzyu4.zz8());
            } else if (iZzTP == 1) {
                zzyo3.zzYrc();
                iZzjU = com.aspose.words.internal.zzXU.zzZ(iZzjU, 128, zzyu4.zz8());
            } else if (iZzTP == 2) {
                zzyo3.zzYrc();
                iZzjU = com.aspose.words.internal.zzXU.zzZ(iZzjU, 256, zzyu4.zz8());
            } else if (iZzTP == 3) {
                zzyo3.zzYrc();
                iZzjU = com.aspose.words.internal.zzXU.zzZ(iZzjU, 64, zzyu4.zz8());
            } else if (iZzTP == 4) {
                zzyo3.zzYrc();
                iZzjU = com.aspose.words.internal.zzXU.zzZ(iZzjU, 512, !zzyu4.zz8());
            } else if (iZzTP == 5) {
                zzyo3.zzYrc();
                iZzjU = com.aspose.words.internal.zzXU.zzZ(iZzjU, 1024, !zzyu4.zz8());
            }
        }
        return iZzjU;
    }
}
