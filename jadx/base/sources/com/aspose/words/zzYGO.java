package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYGO extends zzYHQ {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\listid", "\\ls");
    private com.aspose.words.internal.zzD3<Style> zzXvQ;
    private List zzYo7;

    public zzYGO(zzYFT zzyft, com.aspose.words.internal.zzD3<Style> zzd3) {
        super(zzyft);
        this.zzXvQ = zzd3;
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzT(zzYET zzyet) throws Exception {
        int iZzTP = zzUR.zzTP(zzyet.getName());
        if (iZzTP == 0) {
            this.zzYo7.zzxB(zzyet.zzYeT());
        } else if (iZzTP != 1) {
            zzO(zzyet);
        } else {
            this.zzYo7.zzxC(zzyet.zzYeT());
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzYjb() {
        if (zzYiN().getType() == 69) {
            getDocument().getLists().zzQ(this.zzYo7);
            Style style = this.zzXvQ.get(this.zzYo7.zzYP8());
            if (style != null) {
                style.zzZYj().zzxC(this.zzYo7.getListId());
            }
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzZ(zzYET zzyet) {
        if (zzYiN().getType() == 69) {
            this.zzYo7 = new List(getDocument(), this.zzXw4.getDocument().getLists().zzYP2());
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final zzYHQ zzZ(zzYHP zzyhp) {
        int type = zzyhp.getType();
        if (type == 69) {
            return this;
        }
        if (type != 70) {
            return null;
        }
        return new zzYGP(this.zzXw4, this.zzYo7);
    }
}
