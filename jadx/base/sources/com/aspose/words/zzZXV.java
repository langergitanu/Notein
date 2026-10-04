package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZXV implements zzZCU {
    private static Object zzYOZ = new Object();
    private static Theme zzYP0;

    private static com.aspose.words.internal.zz77 zz2Z() throws Exception {
        com.aspose.words.internal.zz77 zz77Var = new com.aspose.words.internal.zz77("document.xml", "test");
        zz77Var.zz5(new com.aspose.words.internal.zzZOR());
        com.aspose.words.internal.zzZYQ.zzY("<document />", zz77Var.zzR1());
        zz77Var.zzR1().zzH(0L);
        return zz77Var;
    }

    private static Theme zzZwa() throws Exception {
        com.aspose.words.internal.zzZOP zzzopZzW = com.aspose.words.internal.zzZXR.zzW("Aspose.Words.Resources.theme1.xml", Document.class);
        try {
            zzzopZzW.zzH(0L);
            zzZW1 zzzw1 = new zzZW1(zzzopZzW, new zzYO3());
            zzZXU zzzxuZzS = zzZWW.zzS(zz2Z());
            zzzxuZzS.zzZ(zzzw1);
            Theme themeZzX = zzZW9.zzX(zzzxuZzS);
            zzzopZzW.close();
            return themeZzX;
        } catch (Throwable th) {
            if (zzzopZzW != null) {
                zzzopZzW.close();
            }
            throw th;
        }
    }

    @Override // com.aspose.words.zzZCU
    public final Theme zzZmw() throws Exception {
        if (zzYP0 == null) {
            synchronized (zzYOZ) {
                try {
                    if (zzYP0 == null) {
                        zzYP0 = zzZwa();
                    }
                } finally {
                }
            }
        }
        return zzYP0;
    }
}
