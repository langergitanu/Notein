package com.aspose.words;

import com.aspose.words.net.System.Data.DataRow;
import com.aspose.words.net.System.Data.DataView;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ2R extends zzZ2X {
    private DataView zzY60;

    public zzZ2R(DataView dataView) {
        super(dataView.getTable().getTableName());
        this.zzY60 = dataView;
    }

    @Override // com.aspose.words.zzZ2Y
    public final boolean zzYC() {
        return zzYK7() >= this.zzY60.getCount();
    }

    @Override // com.aspose.words.zzZ2X
    public final DataRow zzYK6() {
        return this.zzY60.get(zzYK7()).getRow();
    }
}
