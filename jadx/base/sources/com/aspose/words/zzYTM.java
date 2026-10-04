package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYTM {
    public static void zzZ(zzYQ7 zzyq7, zzZ3Z zzz3z) throws Exception {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        int i = 0;
        while (zzyq9ZzYuT.zzQ("automatic-styles")) {
            if (zzz3z != null) {
                zzz3z.zzYX(zzyq9ZzYuT.zz5());
            }
            if (!zzYQR.zzW(zzyq7, true)) {
                if ("page-layout".equals(zzyq9ZzYuT.getLocalName())) {
                    zzYQH.zzJ(zzyq7);
                    i++;
                } else {
                    zzyq9ZzYuT.zzk();
                }
            }
        }
        if (i > 1) {
            zzyq7.getDocument().zzO(null);
            zzyq7.getDocument().getViewOptions().setDisplayBackgroundShape(false);
        }
        zzyq7.zzA(true, true);
    }
}
