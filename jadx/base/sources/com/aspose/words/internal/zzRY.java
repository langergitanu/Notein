package com.aspose.words.internal;

import com.aspose.words.net.System.Data.DBNull;
import com.aspose.words.net.System.Data.DataColumn;
import com.aspose.words.net.System.Data.DataRow;
import com.aspose.words.net.System.Data.DataSet;
import com.aspose.words.net.System.Data.DataTable;

/* JADX INFO: loaded from: classes5.dex */
public final class zzRY implements zzH8 {
    private DataTable zzNQ;

    public zzRY(String str, zzRZ zzrz) throws Exception {
        zzZKN.zzU3(str);
        this.zzNQ = zzZ(str, (zzZOP) null, zzrz);
    }

    private static DataTable zzZ(String str, zzZOP zzzop, zzRZ zzrz) throws Exception {
        zzZOP zzzopZzVj = zzzop != null ? zzzop : zzZOU.zzVj(str);
        return zzZ(zzzopZzVj, zzzopZzVj == zzzop, zzrz).getTables().get(0);
    }

    @Override // com.aspose.words.internal.zzH8
    public final Object zzRt() {
        return this.zzNQ;
    }

    public zzRY(zzZOP zzzop, zzRZ zzrz) throws Exception {
        this.zzNQ = zzZ((String) null, zzzop, zzrz);
    }

    private static DataSet zzZ(zzZOP zzzop, boolean z, zzRZ zzrz) throws Exception {
        DataSet dataSet = new DataSet();
        zzZOO zzzoo = new zzZOO(zzzop);
        try {
            zzRX zzrx = new zzRX(zzzoo, zzrz.hasHeaders(), zzrz.getDelimiter(), zzrz.getQuoteChar(), zzrz.getQuoteChar(), zzrz.getCommentChar());
            try {
                try {
                    zzZ(zzrx, zzZ(dataSet, zzrx));
                    if (!z) {
                        zzrx.dispose();
                    }
                    if (!z) {
                        zzzoo.close();
                    }
                    zzR4.zzZ(dataSet);
                    return dataSet;
                } catch (zzAO e) {
                    throw new IllegalStateException("There is an error on parsing the CSV data. " + e.getMessage(), e);
                }
            } finally {
            }
        } finally {
        }
    }

    private static DataTable zzZ(DataSet dataSet, zzRX zzrx) throws Exception {
        String str;
        DataTable dataTableAdd = dataSet.getTables().add("Table");
        String[] strArrZzRs = zzrx.hasHeaders() ? zzrx.zzRs() : null;
        int i = 1;
        for (int i2 = 0; i2 < zzrx.getFieldCount(); i2++) {
            if (strArrZzRs != null && zzZYD.zzXk(strArrZzRs[i2])) {
                str = strArrZzRs[i2];
            } else {
                str = zzZKN.format("Column{0}", Integer.valueOf(i));
                i++;
            }
            dataTableAdd.getColumns().add(new DataColumn(str, String.class));
        }
        return dataTableAdd;
    }

    private static void zzZ(zzRX zzrx, DataTable dataTable) throws Exception {
        while (zzrx.zzRo()) {
            DataRow dataRowNewRow = dataTable.newRow();
            for (int i = 0; i < dataTable.getColumns().getCount(); i++) {
                String str = zzrx.get(i);
                if (!zzZKN.zzU3(str)) {
                    dataRowNewRow.set(i, str);
                } else {
                    dataRowNewRow.set(i, DBNull.Value);
                }
            }
            dataTable.getRows().add(dataRowNewRow);
        }
    }
}
