package com.aspose.words;

import com.aspose.words.ref.RefDouble;

/* JADX INFO: loaded from: classes6.dex */
final class zzN9 extends zzNA {
    public zzN9() {
        super("padding-left");
    }

    @Override // com.aspose.words.zzMS
    public final void zzZ(zzMP zzmp, Table table) throws Exception {
        zzmp.getCount();
        zzL4 zzl4ZzZVx = zzmp.zzZVx();
        RefDouble refDouble = new RefDouble(0.0d);
        boolean zZzZ = zzNA.zzZ(zzl4ZzZVx, refDouble);
        double d = refDouble.get();
        if (zZzZ) {
            table.setLeftPadding(d);
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
            cellFormat.setLeftPadding(d);
        }
    }
}
