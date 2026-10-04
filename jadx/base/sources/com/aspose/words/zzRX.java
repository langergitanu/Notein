package com.aspose.words;

import com.aspose.words.ref.RefDouble;

/* JADX INFO: loaded from: classes6.dex */
class zzRX extends zzNA {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("-aw-padding-top", "-aw-padding-right", "-aw-padding-bottom", "-aw-padding-left");

    public zzRX(String str) {
        super(str);
    }

    @Override // com.aspose.words.zzMS
    public final void zzZ(zzMP zzmp, CellFormat cellFormat) {
        zzmp.getCount();
        zzL4 zzl4ZzZVx = zzmp.zzZVx();
        RefDouble refDouble = new RefDouble(0.0d);
        boolean zZzZ = zzNA.zzZ(zzl4ZzZVx, refDouble);
        double d = refDouble.get();
        if (zZzZ) {
            int iZzTP = zzUR.zzTP(getName());
            if (iZzTP == 0) {
                cellFormat.setTopPadding(d);
                return;
            }
            if (iZzTP == 1) {
                cellFormat.setRightPadding(d);
            } else if (iZzTP == 2) {
                cellFormat.setBottomPadding(d);
            } else {
                if (iZzTP != 3) {
                    return;
                }
                cellFormat.setLeftPadding(d);
            }
        }
    }
}
