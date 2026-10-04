package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzKU extends zzOO {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzKU() {
        zzOT zzot = zzL4.zzZlE;
        super("writing-mode", true, zzot, zzL3.zzX(zzot, zzL4.zzZlD, zzL4.zzZlC, zzL4.zzZlK, zzL4.zzZlJ, zzL4.zzZlI, zzL4.zzZlH, zzL4.zzZlG, zzL4.zzZlF));
    }

    @Override // com.aspose.words.zzMS
    public final void zzZ(zzMP zzmp, CellFormat cellFormat) {
        zzmp.getCount();
        zzL4 zzl4ZzZVx = zzmp.zzZVx();
        if (zzl4ZzZVx.getValueType() == 0) {
            cellFormat.setOrientation(zzL5.zzS6(((zzOT) zzl4ZzZVx).getValue()));
        }
    }
}
