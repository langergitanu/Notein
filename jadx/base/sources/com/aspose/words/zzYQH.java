package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYQH {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("page-layout-properties", "header-style", "footer-style");

    public static void zzJ(zzYQ7 zzyq7) throws Exception {
        zzYQK zzyqk = new zzYQK();
        zzX(zzyq7, zzyqk);
        zzY(zzyq7, zzyqk);
        zzyq7.zzYuS().zzZ((zzYPP) zzyqk, zzyq7.zzYuO(), true);
    }

    private static void zzX(zzYQ7 zzyq7, zzYQK zzyqk) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            if ("name".equals(zzyq9ZzYuT.getLocalName())) {
                zzyqk.setName(zzyq9ZzYuT.getValue());
            } else if ("page-usage".equals(zzyq9ZzYuT.getLocalName())) {
                zzyq7.zzZ(256, false, "style:page-layout");
            }
        }
    }

    private static void zzY(zzYQ7 zzyq7, zzYQK zzyqk) throws Exception {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ("page-layout")) {
            String localName = zzyq9ZzYuT.getLocalName();
            int iZzTP = zzUR.zzTP(localName);
            if (iZzTP == 0) {
                zzYQI.zzZ(zzyq7, zzyqk);
            } else if (iZzTP == 1) {
                zzyqk.zzZ(zzYRH.zzV(zzyq7, localName));
            } else if (iZzTP != 2) {
                zzyq9ZzYuT.zzk();
            } else {
                zzyqk.zzY(zzYRH.zzV(zzyq7, localName));
            }
        }
    }
}
