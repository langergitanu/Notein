package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYQX {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("master-page", "handout-master", "layer-set");

    public static void zzJ(zzYQ7 zzyq7) throws Exception {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ("master-styles")) {
            int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            if (iZzTP == 0) {
                zzYQY.zzJ(zzyq7);
            } else if (iZzTP == 1 || iZzTP == 2) {
                zzyq7.zzZ(256, true, "master-styles");
            } else {
                zzyq9ZzYuT.zzk();
            }
        }
        zzZ(zzyq7.zzYuR());
    }

    private static void zzZ(zzYQZ zzyqz) {
        zzYR0 zzyr0ZzEq;
        for (zzYR0 zzyr0 : zzyqz) {
            if (com.aspose.words.internal.zzZYD.zzXk(zzyr0.zzYvx()) && (zzyr0ZzEq = zzyqz.zzEq(zzyr0.zzYvx())) != null) {
                zzZ(zzyr0, zzyr0ZzEq, 1);
                zzZ(zzyr0, zzyr0ZzEq, 3);
                zzZ(zzyr0, zzyr0ZzEq, 0);
                zzZ(zzyr0, zzyr0ZzEq, 2);
            }
        }
    }

    private static void zzZ(zzYR0 zzyr0, zzYR0 zzyr02, int i) {
        HeaderFooter byHeaderFooterType = zzyr02.zzYBx().getHeadersFooters().getByHeaderFooterType(i);
        if (byHeaderFooterType == null || zzyr0.zzYBx().getHeadersFooters().getByHeaderFooterType(i) != null) {
            return;
        }
        zzyr0.zzYBx().getHeadersFooters().add(byHeaderFooterType.deepClone(true));
    }
}
