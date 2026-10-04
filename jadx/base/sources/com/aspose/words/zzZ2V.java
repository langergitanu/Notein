package com.aspose.words;

import com.aspose.words.net.System.Data.DataRelation;
import com.aspose.words.net.System.Data.DataRow;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ2V extends zzZ2X {
    private DataRow[] zzd4;

    public zzZ2V(DataRow dataRow, DataRelation dataRelation) {
        super(dataRelation.getChildTable().getTableName());
        this.zzd4 = dataRow.getChildRows(dataRelation);
    }

    @Override // com.aspose.words.zzZ2Y
    public final boolean zzYC() {
        return zzYK7() >= this.zzd4.length;
    }

    @Override // com.aspose.words.zzZ2X
    public final DataRow zzYK6() {
        return this.zzd4[zzYK7()];
    }
}
