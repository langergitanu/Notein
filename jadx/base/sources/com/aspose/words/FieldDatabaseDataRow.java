package com.aspose.words;

import com.aspose.words.net.System.Data.DBNull;
import com.aspose.words.net.System.Data.DataRow;

/* JADX INFO: loaded from: classes6.dex */
public class FieldDatabaseDataRow {
    private String[] zzYEC;

    public FieldDatabaseDataRow(String... strArr) {
        this.zzYEC = strArr;
    }

    public static FieldDatabaseDataRow createFrom(DataRow dataRow) {
        String[] strArr = new String[dataRow.getItemArray().length];
        for (int i = 0; i < dataRow.getItemArray().length; i++) {
            Object obj = dataRow.getItemArray()[i];
            strArr[i] = (obj == null || obj == DBNull.Value) ? "" : obj.toString();
        }
        return new FieldDatabaseDataRow(strArr);
    }

    public String[] getValues() {
        return this.zzYEC;
    }
}
