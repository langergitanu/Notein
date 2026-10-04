package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYGP extends zzYHQ {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\listoverridestartat", "\\levelstartat", "\\listoverrideformat");
    private zzZ4B zzXuL;
    private List zzYo7;

    public zzYGP(zzYFT zzyft, List list) {
        super(zzyft);
        this.zzYo7 = list;
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzT(zzYET zzyet) throws Exception {
        int iZzTP = zzUR.zzTP(zzyet.getName());
        if (iZzTP == 0) {
            this.zzXuL.zzYbX = true;
            return;
        }
        if (iZzTP == 1) {
            this.zzXuL.zzYbY = zzyet.zzYeT();
        } else if (iZzTP != 2) {
            zzO(zzyet);
        } else {
            this.zzXuL.zzYbW = true;
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzZ(zzYET zzyet) {
        this.zzXuL = new zzZ4B(getDocument(), this.zzYo7.zzYPb().getCount());
        this.zzYo7.zzYPb().zzZ(this.zzXuL);
    }

    @Override // com.aspose.words.zzYHQ
    public final zzYHQ zzZ(zzYHP zzyhp) {
        if (zzyhp.getType() != 65) {
            return null;
        }
        return new zzYGQ(this.zzXw4, this.zzXuL.getListLevel());
    }
}
