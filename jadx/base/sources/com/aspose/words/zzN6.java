package com.aspose.words;

import com.aspose.words.ref.RefDouble;

/* JADX INFO: loaded from: classes6.dex */
final class zzN6 extends zzNA {
    public zzN6() {
        super("padding-top");
    }

    @Override // com.aspose.words.zzMS
    public final void zzZ(zzMP zzmp, Table table) throws Exception {
        zzmp.getCount();
        zzL4 zzl4ZzZVx = zzmp.zzZVx();
        RefDouble refDouble = new RefDouble(0.0d);
        boolean zZzZ = zzNA.zzZ(zzl4ZzZVx, refDouble);
        double d = refDouble.get();
        if (zZzZ) {
            table.setTopPadding(d);
        }
    }

    @Override // com.aspose.words.zzMS
    public final void zzZ(zzMP zzmp, CellFormat cellFormat) {
        zzmp.getCount();
        zzL4 zzl4ZzZVx = zzmp.zzZVx();
        RefDouble refDouble = new RefDouble(0.0d);
        boolean zZzZ = zzNA.zzZ(zzl4ZzZVx, refDouble);
        double d = refDouble.get();
        if (zZzZ) {
            cellFormat.setTopPadding(d);
        }
    }
}
