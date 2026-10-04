package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY8N extends zzZ7I {
    private com.aspose.words.internal.zzD4 zzX9f = new com.aspose.words.internal.zzD4();
    private int zzXa4 = 15;
    private DocumentBase zzZCL;

    private zzY8N() {
    }

    public static void zzI(DocumentBase documentBase) throws Exception {
        new zzY8N().zzS(documentBase);
    }

    private void zzS(DocumentBase documentBase) throws Exception {
        this.zzZCL = documentBase;
        zzY2O();
        zzD(documentBase);
        zzY2M();
        zzY2N();
    }

    private void zzY2M() {
        for (zzZ4J zzz4j : this.zzZCL.getLists().zzYOX()) {
            zzz4j.zzxh(zzkE(zzz4j.zzYOO()));
            for (ListLevel listLevel : zzz4j.zzYOP()) {
                listLevel.zzx2(this.zzZCL.getStyles().zzZ8(listLevel.zzYOc(), false) != null ? zzkE(listLevel.zzYOc()) : StyleIdentifier.NIL);
            }
        }
    }

    private void zzY2N() {
        for (Style style : this.zzZCL.getStyles()) {
            int iZzkE = zzkE(style.zzY3t());
            int iZzkE2 = zzkE(style.zzY3v());
            int iZzkE3 = this.zzZCL.getStyles().zzZ8(style.zzY3u(), false) != null ? zzkE(style.zzY3u()) : StyleIdentifier.NIL;
            if (style.zzZ7j() > 14) {
                style.zzZc(zzkE(style.zzZ7j()), false);
            }
            style.zzl3(iZzkE);
            style.zzl5(iZzkE2);
            style.zzl4(iZzkE3);
        }
        this.zzZCL.getStyles().zzY2X();
    }

    private void zzY2O() {
        int iZzY38 = this.zzZCL.getStyles().zzY38() + 1;
        Style[] styleArr = new Style[iZzY38];
        for (Style style : this.zzZCL.getStyles()) {
            styleArr[style.zzZ7j()] = style;
        }
        for (int i = 0; i < iZzY38; i++) {
            Style style2 = styleArr[i];
            if (style2 != null && style2.zzZ7j() > 14) {
                this.zzX9f.set(style2.zzZ7j(), this.zzXa4);
                this.zzXa4++;
            }
        }
    }

    private int zzkE(int i) {
        if (i > 14) {
            int i2 = this.zzX9f.get(i);
            if (i2 >= 0) {
                return i2;
            }
            int i3 = this.zzXa4;
            if (i < i3) {
                return i3;
            }
        }
        return i;
    }

    @Override // com.aspose.words.zzZ7I
    public final void zzV(zzYEF zzyef) {
        if (zzyef.contains(50)) {
            zzyef.zzBl(zzkE(zzyef.zzZ7j()));
        }
    }

    @Override // com.aspose.words.zzZ7I
    public final void zzX(zzY6G zzy6g) {
        if (zzy6g.contains(4005)) {
            zzy6g.zzBl(zzkE(zzy6g.zzZ7j()));
        }
    }

    @Override // com.aspose.words.zzZ7I
    public final void zzY(zzYMX zzymx) {
        if (zzymx.contains(1000)) {
            zzymx.zzBl(zzkE(zzymx.zzZ7j()));
        }
    }

    @Override // com.aspose.words.zzZ7I
    public final void zzZ(zzZZF zzzzf) {
        zzzzf.zzYVZ = zzkE(zzzzf.zzYVZ);
        zzzzf.zzYVY = zzkE(zzzzf.zzYVY);
    }
}
