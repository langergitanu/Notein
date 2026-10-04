package com.aspose.words;

import com.google.common.net.HttpHeaders;

/* JADX INFO: loaded from: classes6.dex */
final class zzXZV extends zzZ1D {
    private zzYU6 zzXSu;

    public zzXZV(zzYU6 zzyu6) {
        super(false);
        this.zzXSu = zzyu6;
    }

    private void zzXRK() {
        this.zzXSu.zzY("Table.Columns");
        for (int i = 0; i < zzYHm().getColumnCount(); i++) {
            this.zzXSu.zzY("TableColumn");
            this.zzXSu.zz0(HttpHeaders.WIDTH, com.aspose.words.internal.zzZKN.format("{0}pt", com.aspose.words.internal.zzJB.zzZU(zzuW(i))));
            this.zzXSu.zzp();
        }
        this.zzXSu.zzp();
    }

    @Override // com.aspose.words.zzZ1D
    public final void zzYYt() {
        this.zzXSu.zzp();
    }

    @Override // com.aspose.words.zzZ1D
    public final void zzYYu() {
        this.zzXSu.zzY("TableCell");
        zzWH zzwhZz4K = zzYHm().zz4K();
        if (zzwhZz4K.zzBx() > 1) {
            this.zzXSu.zzZj("ColumnSpan", zzwhZz4K.zzBx());
        }
        if (zzwhZz4K.getRowSpan() > 1) {
            this.zzXSu.zzZj("RowSpan", zzwhZz4K.getRowSpan());
        }
        zzY04.zzZ(this.zzXSu, zzwhZz4K.zz6G());
    }

    @Override // com.aspose.words.zzZ1D
    public final void zzYYv() {
        this.zzXSu.zzp();
    }

    @Override // com.aspose.words.zzZ1D
    public final void zzYYw() {
        this.zzXSu.zzY("TableRow");
    }

    @Override // com.aspose.words.zzZ1D
    public final void zzt(Table table) {
        this.zzXSu.zzp();
        this.zzXSu.zzp();
    }

    @Override // com.aspose.words.zzZ1D
    public final void zzu(Table table) {
        this.zzXSu.zzY("Table");
        zzY04.zzY(this.zzXSu, table);
        zzXRK();
        this.zzXSu.zzY("TableRowGroup");
    }
}
