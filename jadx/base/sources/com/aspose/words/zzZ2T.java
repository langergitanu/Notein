package com.aspose.words;

import com.aspose.words.net.System.Data.DataSet;
import com.aspose.words.net.System.Data.DataTable;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ2T implements zzZAE {
    private DataSet zzZQ8;

    public zzZ2T(DataSet dataSet) {
        this.zzZQ8 = dataSet;
    }

    @Override // com.aspose.words.zzZAE
    public final zzZAF zzJD(String str) throws Exception {
        DataTable dataTable = this.zzZQ8.getTables().get(str);
        if (dataTable != null) {
            return new zzZ2S(dataTable);
        }
        return null;
    }
}
