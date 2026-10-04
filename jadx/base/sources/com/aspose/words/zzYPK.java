package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYPK {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("font-face-decls", "styles", "automatic-styles", "master-styles");

    public static void zzJ(zzYQ7 zzyq7) throws Exception {
        zzyq7.zzSe(false);
        zzYQO zzyqoZzEn = zzyq7.zzYuU().zzEn("/styles.xml");
        if (zzyqoZzEn == null) {
            return;
        }
        zzYQ9 zzyq9 = new zzYQ9(zzyqoZzEn.zzYvo());
        zzyq7.zzT(zzyq9);
        zzYQ7.zzQ(zzyq7, "document-styles");
        while (zzyq9.zzQ("document-styles")) {
            int iZzTP = zzUR.zzTP(zzyq9.getLocalName());
            if (iZzTP == 0) {
                zzYRZ.zzZ(zzyq7, null);
            } else if (iZzTP == 1) {
                zzYQR.zzJ(zzyq7);
            } else if (iZzTP == 2) {
                zzYTM.zzZ(zzyq7, null);
            } else if (iZzTP != 3) {
                zzyq9.zzk();
            } else {
                zzYQX.zzJ(zzyq7);
            }
        }
        zzYR7 zzyr7 = (zzYR7) com.aspose.words.internal.zzZKW.zzZ(zzyq7.zzYuS().zzYu0(), zzYR7.class);
        if (zzyr7 != null) {
            zzZ(zzyq7.zzYuS().zzYtY(), zzyr7);
        }
        zzyq7.zzYuR().zzYvw();
    }

    private static void zzZ(ArrayList<Style> arrayList, zzYR7 zzyr7) {
        for (Style style : arrayList) {
            int outlineLevel = style.zzZYj().getOutlineLevel();
            List list = zzyr7.getList();
            if (outlineLevel < list.getListLevels().getCount()) {
                ListLevel listLevel = list.getListLevels().get(outlineLevel);
                if (listLevel.getNumberStyle() != 255) {
                    style.zzZYj().zzxC(list.getListId());
                    style.zzZYj().zzrM(listLevel.zzYOa());
                }
            }
        }
    }
}
