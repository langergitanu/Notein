package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYR4 {
    public static void zzJ(zzYQ7 zzyq7) throws Exception {
        zzYQO zzyqoZzEn = zzyq7.zzYuU().zzEn("/META-INF/manifest.xml");
        if (zzyqoZzEn == null) {
            return;
        }
        zzYQ9 zzyq9 = new zzYQ9(zzyqoZzEn.zzYvo());
        zzyq7.zzZh(new ArrayList<>());
        zzyq7.zzT(zzyq9);
        while (zzyq9.zzQ("manifest")) {
            if ("file-entry".equals(zzyq9.getLocalName())) {
                zzn(zzyq7);
            } else {
                zzyq9.zzk();
            }
        }
    }

    private static void zzn(zzYQ7 zzyq7) {
        zzYR5 zzyr5 = new zzYR5();
        zzyr5.zzJ(zzyq7);
        if (zzyr5.zzYvG() != null) {
            zzyq7.zzYux().add(zzyr5);
        }
    }
}
