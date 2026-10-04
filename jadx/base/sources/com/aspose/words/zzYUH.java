package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYUH {
    public static void zzY(Document document, zzYU6 zzyu6) throws Exception {
        if (document.zzZq2().getCount() == 0) {
            return;
        }
        zzyu6.zzY("w:divs");
        zzZ(zzyu6, document.zzZq2(), 0);
        zzyu6.zzo();
    }

    public static void zzZ(zzZZF zzzzf, zzYU6 zzyu6, int i) {
        String str = i == 20 ? "w" : "wsp";
        zzyu6.zzY(com.aspose.words.internal.zzZKN.format("{0}:rsids", str));
        zzyu6.zzYz(com.aspose.words.internal.zzZKN.format("{0}:rsidRoot", str), zzYU3.zzsV(zzzzf.zzYVk));
        for (int i2 = 0; i2 < zzzzf.zzYVj.getCount(); i2++) {
            zzyu6.zzYz(com.aspose.words.internal.zzZKN.format("{0}:rsid", str), zzYU3.zzsV(zzzzf.zzYVj.get(i2)));
        }
        zzyu6.zzp();
    }

    private static void zzZ(zzYU6 zzyu6, zzZK0 zzzk0, int i) throws Exception {
        for (int i2 = 0; i2 < zzzk0.getCount(); i2++) {
            zzZK1 zzzk1ZzA7 = zzzk0.zzA7(i2);
            if (zzzk1ZzA7.getParentId() == i) {
                zzZ(zzyu6, zzzk0, zzzk1ZzA7);
            }
        }
    }

    private static void zzZ(zzYU6 zzyu6, zzZK0 zzzk0, zzZK1 zzzk1) throws Exception {
        zzyu6.zzY("w:div");
        zzyu6.zzZj("w:id", zzzk1.getId());
        if (zzzk1.zzZ4j() != 0) {
            zzyu6.zzz(zzzk1.zzZ4j() == 1 ? "w:blockQuote" : "w:bodyDiv", true);
        }
        zzYMX zzymxZzZYj = zzzk1.zzZYj();
        zzyu6.zzQ("w:marLeft", zzymxZzZYj.zzPj(1592));
        zzyu6.zzQ("w:marRight", zzymxZzZYj.zzPj(1593));
        zzyu6.zzQ("w:marTop", zzymxZzZYj.zzPj(1594));
        zzyu6.zzQ("w:marBottom", zzymxZzZYj.zzPj(1595));
        zzyu6.zzY("w:divBdr");
        zzyu6.zzX("w:top", zzymxZzZYj.zz5A());
        zzyu6.zzX("w:left", zzymxZzZYj.zz5y());
        zzyu6.zzX("w:bottom", zzymxZzZYj.zz5z());
        zzyu6.zzX("w:right", zzymxZzZYj.zz5x());
        zzyu6.zzp();
        if (zzzk1.zzZ5x()) {
            zzyu6.zzY("w:divsChild");
            zzZ(zzyu6, zzzk0, zzzk1.getId());
            zzyu6.zzo();
        }
        zzyu6.zzp();
    }
}
