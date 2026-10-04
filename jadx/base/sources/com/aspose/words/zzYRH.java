package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYRH {
    public static zzYRI zzV(zzYQ7 zzyq7, String str) {
        zzYRI zzyri = new zzYRI();
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ(str)) {
            if ("header-footer-properties".equals(zzyq9ZzYuT.getLocalName())) {
                zzYRK.zzZ(zzyq7, zzyri);
            } else {
                zzyq9ZzYuT.zzk();
            }
        }
        return zzyri;
    }
}
