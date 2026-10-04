package com.aspose.words.internal;

import com.aspose.words.internal.zzR4;
import com.aspose.words.net.System.Data.DBNull;
import com.aspose.words.net.System.Data.DataColumn;
import com.aspose.words.net.System.Data.DataSet;
import com.aspose.words.net.System.Data.DataTable;
import com.aspose.words.ref.Ref;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
final class zzCL {
    private static Class zzVz(int i) {
        switch (i) {
            case 0:
                throw new IllegalStateException("Unknown value type.");
            case 1:
                return String.class;
            case 2:
            case 3:
                return Long.TYPE;
            case 4:
                return Double.TYPE;
            case 5:
                return Boolean.TYPE;
            case 6:
                return zz7T.zzo7;
            case 7:
                return zzG0.class;
            default:
                throw new IllegalStateException("Wrong value type.");
        }
    }

    public static void zzY(DataSet dataSet) {
        for (DataTable dataTable : dataSet.getTables()) {
            DataColumn dataColumn = dataTable.getColumns().get("_700A2E7E-5DFE-4F6E-A019-73FEB95F11F0");
            if (dataColumn != null) {
                zzR4.zzX(dataTable);
                HashMap<String, int[]> mapZzZ = zzZ(dataTable, dataColumn);
                for (DataColumn dataColumn2 : zzR4.zzZ(dataTable, zzCQ.zzu9)) {
                    int[] iArr = mapZzZ.get(dataColumn2.getColumnName());
                    zzY(dataTable, dataColumn2, iArr);
                    Class clsZzZ = zzZ(dataTable, dataColumn2, iArr);
                    if (clsZzZ != dataColumn2.getDataType()) {
                        zzR4.zzZ(dataTable, dataColumn2, clsZzZ, (zzR4.zzZ) null);
                    }
                }
            }
        }
    }

    private static HashMap<String, int[]> zzZ(DataTable dataTable, DataColumn dataColumn) {
        dataColumn.getDataType();
        HashMap<String, int[]> map = new HashMap<>();
        for (int i = 0; i < dataTable.getRows().getCount(); i++) {
            Object obj = dataTable.getRows().get(i).get(dataColumn);
            if (obj != DBNull.Value) {
                for (zzCH zzch : zzCG.zzYC((String) obj)) {
                    Ref ref = new Ref(null);
                    boolean zZzZ = zzZQF.zzZ(map, zzch.getName(), ref);
                    int[] iArr = (int[]) ref.get();
                    if (!zZzZ) {
                        iArr = new int[dataTable.getRows().getCount()];
                        zzZQF.zzY(map, zzch.getName(), iArr);
                    }
                    iArr[i] = zzch.getType();
                }
            }
        }
        return map;
    }

    private static void zzY(DataTable dataTable, DataColumn dataColumn, int[] iArr) throws Throwable {
        for (int i = 0; i < dataTable.getRows().getCount(); i++) {
            if (iArr[i] == 7) {
                dataTable.getRows().get(i).set(dataColumn, DBNull.Value);
            }
        }
    }

    private static Class zzZ(DataTable dataTable, DataColumn dataColumn, int[] iArr) {
        Class<String> clsZzVz;
        dataColumn.getDataType();
        Class<String> cls = null;
        int i = 0;
        while (true) {
            if (i >= dataTable.getRows().getCount()) {
                break;
            }
            int i2 = iArr[i];
            Object obj = dataTable.getRows().get(i).get(dataColumn);
            if (i2 != 0 || obj != DBNull.Value) {
                if (i2 == 0) {
                    clsZzVz = zzR4.zzh((String) obj);
                } else {
                    clsZzVz = zzVz(i2);
                }
                if (clsZzVz != null && !zzZ(clsZzVz, cls)) {
                    if (cls != null && !zzZ(cls, clsZzVz)) {
                        cls = String.class;
                        break;
                    }
                    cls = clsZzVz;
                }
            }
            i++;
        }
        return cls != null ? cls : dataColumn.getDataType();
    }

    private static boolean zzZ(Class cls, Class cls2) {
        if (cls2 == cls) {
            return true;
        }
        if (cls2 == Double.TYPE && cls == Long.TYPE) {
            return true;
        }
        return cls2 != null && cls == zzG0.class;
    }
}
