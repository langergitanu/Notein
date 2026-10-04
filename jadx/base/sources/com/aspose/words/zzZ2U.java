package com.aspose.words;

import com.aspose.words.net.System.Data.DataRow;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ2U extends zzZ2X {
    private DataRow zzY62;

    public zzZ2U(DataRow dataRow) {
        super(dataRow.getTable().getTableName());
        this.zzY62 = dataRow;
    }

    @Override // com.aspose.words.zzZ2Y
    public final boolean zzYC() {
        return zzYK7() > 0;
    }

    @Override // com.aspose.words.zzZ2X
    public final DataRow zzYK6() {
        return this.zzY62;
    }
}
