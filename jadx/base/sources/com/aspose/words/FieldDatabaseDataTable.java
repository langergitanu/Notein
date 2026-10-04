package com.aspose.words;

import com.aspose.words.net.System.Data.DataRow;
import com.aspose.words.net.System.Data.DataTable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class FieldDatabaseDataTable {
    private String[] zzYEB;
    private ArrayList<FieldDatabaseDataRow> zzZEU = new ArrayList<>();

    public FieldDatabaseDataTable(String... strArr) {
        this.zzYEB = strArr;
    }

    public static FieldDatabaseDataTable createFrom(DataTable dataTable) {
        String[] strArr = new String[dataTable.getColumns().getCount()];
        for (int i = 0; i < dataTable.getColumns().getCount(); i++) {
            strArr[i] = dataTable.getColumns().get(i).getColumnName();
        }
        FieldDatabaseDataTable fieldDatabaseDataTable = new FieldDatabaseDataTable(strArr);
        Iterator<DataRow> it = dataTable.getRows().iterator();
        while (it.hasNext()) {
            fieldDatabaseDataTable.getRows().add(FieldDatabaseDataRow.createFrom(it.next()));
        }
        return fieldDatabaseDataTable;
    }

    public String[] getColumnNames() {
        return this.zzYEB;
    }

    public ArrayList<FieldDatabaseDataRow> getRows() {
        return this.zzZEU;
    }
}
