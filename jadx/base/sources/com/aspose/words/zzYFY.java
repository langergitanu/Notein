package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYFY extends zzYFW {
    public zzYFY(zzYFT zzyft) {
        super(zzyft, new Shape(zzyft.getDocument(), 75));
    }

    @Override // com.aspose.words.zzYFW, com.aspose.words.zzYHQ
    public final void zzYjb() throws Exception {
        if (zzYiN().getType() == 103) {
            getShape().setWrapType(0);
            getDocument().getLists().zzo(getShape());
        }
        super.zzYjb();
    }
}
