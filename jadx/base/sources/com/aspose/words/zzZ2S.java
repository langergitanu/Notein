package com.aspose.words;

import com.aspose.words.net.System.Data.DataRow;
import com.aspose.words.net.System.Data.DataTable;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ2S extends zzZ2X {
    private DataTable zzY61;

    public zzZ2S(DataTable dataTable) {
        super(dataTable.getTableName());
        this.zzY61 = dataTable;
    }

    @Override // com.aspose.words.zzZ2Y
    public final boolean zzYC() {
        return zzYK7() >= this.zzY61.getRows().getCount();
    }

    @Override // com.aspose.words.zzZ2X
    public final DataRow zzYK6() {
        return this.zzY61.getRows().get(zzYK7());
    }
}
