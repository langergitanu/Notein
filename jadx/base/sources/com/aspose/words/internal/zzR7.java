package com.aspose.words.internal;

import com.aspose.words.net.System.Data.DataRowCollection;
import com.aspose.words.net.System.Data.DataSet;
import com.aspose.words.net.System.Data.DataTable;

/* JADX INFO: loaded from: classes5.dex */
final class zzR7 extends zzAE implements zzH9 {
    static zzR7 zzMs = new zzR7();

    private zzR7() {
        super(zzYS.zzY(DataSet.class));
    }

    @Override // com.aspose.words.internal.zzH9
    public final Object zzW(Object obj) {
        return obj;
    }

    @Override // com.aspose.words.internal.zzH9
    public final Object zzX(Object obj) {
        return obj;
    }

    @Override // com.aspose.words.internal.zzAE, com.aspose.words.internal.zzAF
    public final zzAD zzZ(Object obj, String str) {
        DataTable dataTable = ((DataSet) obj).getTables().get(str);
        return dataTable != null ? new zzAD(this, dataTable, 9, dataTable, DataRowCollection.class) : super.zzZ(obj, str);
    }

    @Override // com.aspose.words.internal.zzAE, com.aspose.words.internal.zzAF
    public final Object zzZ(zzAD zzad, Object obj, Object obj2) throws Exception {
        if (zzad.zzAG() == 9) {
            return ((DataTable) obj).getRows();
        }
        return super.zzZ(zzad, obj, obj2);
    }

    @Override // com.aspose.words.internal.zzAE, com.aspose.words.internal.zzAF
    public final boolean zzZ(Class cls) {
        return DataSet.class.isAssignableFrom(cls);
    }
}
