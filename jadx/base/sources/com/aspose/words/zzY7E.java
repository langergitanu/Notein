package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY7E {
    private com.aspose.words.internal.zzFL zzbw;
    private com.aspose.words.internal.zzH6 zzl7;
    private boolean zzxd;

    public zzY7E(boolean z, com.aspose.words.internal.zzH6 zzh6, com.aspose.words.internal.zzFL zzfl) {
        this.zzxd = z;
        this.zzl7 = zzh6;
        this.zzbw = zzfl;
    }

    public final zzY7F zzYh(ShapeBase shapeBase) throws Exception {
        com.aspose.words.internal.zzZY5 zzzy5 = new com.aspose.words.internal.zzZY5(this.zzl7);
        zzzy5.setPrettyFormat(this.zzxd);
        zzzy5.setExportEmbeddedImages(true);
        zzzy5.setShowPageBorder(false);
        zzzy5.zzZx(true);
        if (shapeBase.zzY9W()) {
            return new zzY7F(shapeBase.zzY9V(), new zzYC5(shapeBase).zz7s(), true);
        }
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        try {
            com.aspose.words.internal.zzZY3 zzzy3 = new com.aspose.words.internal.zzZY3(zzzor, zzzy5, this.zzbw, new com.aspose.words.internal.zzZNI(false));
            com.aspose.words.internal.zzZH zzzh = new com.aspose.words.internal.zzZH(Float.intBitsToFloat((int) shapeBase.getSize()), com.aspose.words.internal.zzZPW.zzYz(shapeBase.getSize()));
            com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
            zzzy3.startDocument();
            zzzy3.zzZ(zzzh);
            zzzy3.zzZ(zzg);
            zzYC5 zzyc5 = new zzYC5(shapeBase);
            zzzy3.zzO(shapeBase.getMarkupLanguage() == 0 ? zz2L.zzZ(zzyc5) : zzYCF.zzZ(zzyc5));
            zzzy3.zzY(zzg);
            zzzy3.zzY(zzzh);
            zzzy3.endDocument();
            zzY7F zzy7f = new zzY7F(zzzor.zzWy(), zzyc5.zz7s(), false);
            zzzor.close();
            return zzy7f;
        } catch (Throwable th) {
            zzzor.close();
            throw th;
        }
    }
}
