package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzL0 extends zzOO {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzL0() {
        zzOT zzot = zzL4.zzZmT;
        super("vertical-align", false, zzot, zzL3.zzZ(zzL3.zzX(zzot, zzL4.zzZmS, zzL4.zzZmR, zzL4.zzZmY, zzL4.zzZlO, zzL4.zzZmW, zzL4.zzZmX, zzL4.zzZmQ), zzL3.zzZkj, zzL3.zzZkl));
    }

    @Override // com.aspose.words.zzMS
    public final void zzZ(zzMP zzmp, CellFormat cellFormat) {
        zzmp.getCount();
        zzL4 zzl4ZzZVx = zzmp.zzZVx();
        if (zzl4ZzZVx.getValueType() != 0) {
            return;
        }
        if (zzl4ZzZVx.zzP(zzL4.zzZmT)) {
            cellFormat.setVerticalAlignment(2);
            return;
        }
        if (zzl4ZzZVx.zzP(zzL4.zzZmY)) {
            cellFormat.setVerticalAlignment(0);
        } else if (zzl4ZzZVx.zzP(zzL4.zzZmF) || !zzl4ZzZVx.zzP(zzL4.zzZmX)) {
            cellFormat.setVerticalAlignment(1);
        } else {
            cellFormat.setVerticalAlignment(2);
        }
    }
}
