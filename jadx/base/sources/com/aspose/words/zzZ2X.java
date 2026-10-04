package com.aspose.words;

import com.aspose.words.net.System.Data.DataColumnCollection;
import com.aspose.words.net.System.Data.DataRelation;
import com.aspose.words.net.System.Data.DataRow;
import com.aspose.words.net.System.Data.DataSet;
import com.aspose.words.net.System.Data.DataTable;
import com.aspose.words.ref.Ref;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZ2X extends zzZ2Y implements zzZAF {
    private String[] zzY63;
    private String zzYDj;

    public zzZ2X(String str) {
        this.zzYDj = str;
    }

    private void zzYK4() throws Exception {
        if (this.zzY63 != null) {
            return;
        }
        DataColumnCollection columns = zzYK5().getTable().getColumns();
        this.zzY63 = new String[columns.getCount()];
        for (int i = 0; i < columns.getCount(); i++) {
            this.zzY63[i] = zzZ2M.zzIN(columns.get(i).getColumnName());
        }
    }

    private DataRow zzYK5() throws Exception {
        zzYC();
        return zzYK6();
    }

    @Override // com.aspose.words.zzZAF
    public final int getFieldCount() throws Exception {
        return zzYK5().getTable().getColumns().getCount();
    }

    @Override // com.aspose.words.zzZAF
    public final String getTableName() {
        return this.zzYDj;
    }

    @Override // com.aspose.words.zzZAF
    public final boolean getValue(String str, Ref<Object> ref) throws Exception {
        return zzZ2M.zzZ(this, str, ref);
    }

    @Override // com.aspose.words.zzZAF
    public final int zzMq(String str) throws Exception {
        int iIndexOf = zzYK5().getTable().getColumns().indexOf(str);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        zzYK4();
        return com.aspose.words.internal.zzZ1.zzX(this.zzY63, str);
    }

    public abstract DataRow zzYK6() throws Exception;

    @Override // com.aspose.words.zzZAF
    public final boolean zzZ(int i, Ref<Object> ref) throws Exception {
        if (i < 0 || i >= getFieldCount()) {
            ref.set(null);
            return false;
        }
        ref.set(zzYK5().get(i));
        return true;
    }

    @Override // com.aspose.words.zzZAF
    public final boolean zzZhb() {
        return true;
    }

    @Override // com.aspose.words.zzZAF
    public final zzZAF zzu(String str, boolean z) throws Exception {
        DataTable dataTable;
        DataRow dataRowZzYK5 = zzYK5();
        DataTable table = dataRowZzYK5.getTable();
        DataSet dataSet = table.getDataSet();
        if (dataSet == null) {
            return null;
        }
        DataRelation dataRelationZzZ = zzZ(dataSet, table.getTableName(), str);
        if (dataRelationZzZ != null) {
            return new zzZ2V(dataRowZzYK5, dataRelationZzZ);
        }
        if (z || (dataTable = dataSet.getTables().get(str)) == null) {
            return null;
        }
        return new zzZ2S(dataTable);
    }

    private static DataRelation zzZ(DataSet dataSet, String str, String str2) {
        for (DataRelation dataRelation : dataSet.getRelations()) {
            if (com.aspose.words.internal.zzZYD.zzi(dataRelation.getParentTable().getTableName(), str) && com.aspose.words.internal.zzZYD.zzi(dataRelation.getChildTable().getTableName(), str2)) {
                return dataRelation;
            }
        }
        return null;
    }
}
