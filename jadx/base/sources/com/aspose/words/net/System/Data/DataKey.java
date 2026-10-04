package com.aspose.words.net.System.Data;

/* JADX INFO: loaded from: classes5.dex */
public class DataKey {
    private final DataColumn[] zzWRI;

    public DataKey(DataColumn[] dataColumnArr) {
        if (dataColumnArr == null) {
            throw new IllegalArgumentException("Columns cannot be null");
        }
        if (dataColumnArr.length == 0) {
            throw new IllegalArgumentException("Columns must be present");
        }
        if (dataColumnArr.length > 32) {
            throw new IllegalArgumentException("Key can be created using no more than 32 columns");
        }
        for (DataColumn dataColumn : dataColumnArr) {
            if (dataColumn == null) {
                throw new IllegalArgumentException("column cannot be null");
            }
        }
        for (int i = 0; i < dataColumnArr.length; i++) {
            for (int i2 = 0; i2 < i; i2++) {
                if (dataColumnArr[i] == dataColumnArr[i2]) {
                    throw new IllegalArgumentException("Key cannot contain duplicate columns. see " + dataColumnArr[i].getColumnName());
                }
            }
        }
        DataColumn[] dataColumnArr2 = new DataColumn[dataColumnArr.length];
        this.zzWRI = dataColumnArr2;
        System.arraycopy(dataColumnArr, 0, dataColumnArr2, 0, dataColumnArr.length);
    }

    private zzS[] zzXQr() {
        zzS[] zzsArr = new zzS[this.zzWRI.length];
        int i = 0;
        while (true) {
            DataColumn[] dataColumnArr = this.zzWRI;
            if (i >= dataColumnArr.length) {
                return zzsArr;
            }
            zzsArr[i] = new zzS(dataColumnArr[i]);
            i++;
        }
    }

    public Object[] getKeyValues(DataRow dataRow) {
        Object[] objArr = new Object[this.zzWRI.length];
        int i = 0;
        while (true) {
            DataColumn[] dataColumnArr = this.zzWRI;
            if (i >= dataColumnArr.length) {
                return objArr;
            }
            objArr[i] = dataRow.get(dataColumnArr[i]);
            i++;
        }
    }

    public zzU getSortIndex() {
        return this.zzWRI[0].getTable().zzZ(zzXQr());
    }

    public DataTable getTable() {
        return this.zzWRI[0].getTable();
    }
}
