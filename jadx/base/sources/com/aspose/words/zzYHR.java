package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYHR extends zzYHQ implements zzZ9H {
    private zzYFN zzXw5;

    public zzYHR(zzYFT zzyft) {
        super(zzyft);
        this.zzXw5 = new zzYFN(zzyft, this);
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzT(zzYET zzyet) throws Exception {
        if (this.zzXw5.zzX(zzyet)) {
            return;
        }
        zzO(zzyet);
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzYjb() throws Exception {
        if (zzYiL().zzYiN().getType() != 79 || getDocument().getStyles().zzY37().zzYdR().zzZYI()) {
            return;
        }
        this.zzXw4.zzBW(getDocument().getStyles().zzY37().getNameFarEast());
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzZ(zzYET zzyet) {
        if (zzYiL().zzYiN().getType() == 79) {
            getDocument().getStyles().zzY37().setName(zzYEF.zzYdx());
        }
    }

    @Override // com.aspose.words.zzZ9H
    public final zzYEF zzZYh() {
        return getDocument().getStyles().zzY37();
    }

    @Override // com.aspose.words.zzZ9H
    public final zzYMX zzZYj() {
        return null;
    }
}
