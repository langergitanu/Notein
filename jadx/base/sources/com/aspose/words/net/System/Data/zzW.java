package com.aspose.words.net.System.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzW {

    /* JADX INFO: renamed from: com.aspose.words.net.System.Data.zzW$1 */
    public static /* synthetic */ class C159131 {
        static final /* synthetic */ int[] zzWQS;

        static {
            int[] iArr = new int[Rule.values().length];
            zzWQS = iArr;
            try {
                iArr[Rule.CASCADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zzWQS[Rule.SET_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zzWQS[Rule.SET_DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static void zzX(DataTable dataTable, DataRow dataRow) {
        zzY(dataTable, dataRow);
    }

    public static void zzY(DataTable dataTable, DataRow dataRow) {
        DataColumn[] primaryKey = dataTable.getPrimaryKey();
        if (primaryKey == null || primaryKey.length <= 0) {
            dataTable.getRows().removeAt(zzZ(dataTable, zzZ(dataTable, dataRow, dataTable.getColumns().zzXQs())));
        } else {
            int iZzhd = dataTable.zzXQj().zzW(primaryKey).zzhd(zzV.zzZ(primaryKey, dataRow));
            if (iZzhd != -1) {
                dataTable.getRows().removeAt(iZzhd);
            }
        }
    }

    public static void zzZ(DataTable dataTable, ArrayList<DataRow> arrayList, DataRow dataRow) throws ConstraintException, InvalidConstraintException {
        if (dataTable.getEnforceConstraints()) {
            dataTable.getConstraints().zzZ(dataRow);
        }
        dataRow.zzhh(arrayList.size());
        arrayList.add(dataRow);
        dataTable.zzXQj().zzXQ2();
        dataTable.onDataRowInserted(dataRow);
    }

    public static void zzZ(DataTable dataTable, ArrayList<DataRow> arrayList, DataRow dataRow, int i) throws ConstraintException, InvalidConstraintException {
        if (dataTable.getEnforceConstraints()) {
            dataTable.getConstraints().zzZ(dataRow);
        }
        if (i > arrayList.size()) {
            i = arrayList.size();
        }
        if (i < 0) {
            i = 0;
        }
        dataRow.zzhh(i);
        arrayList.add(i, dataRow);
        dataTable.zzXQj().zzXQ2();
        dataTable.onDataRowInserted(dataRow);
    }

    public static DataRow zzY(DataTable dataTable, Object[] objArr) throws Throwable {
        if (dataTable == null || objArr == null || objArr.length == 0) {
            return null;
        }
        DataColumn[] primaryKey = dataTable.getPrimaryKey();
        int i = 0;
        if (primaryKey != null && primaryKey.length > 0 && dataTable.zzXQj().zzW(primaryKey) != null) {
            ArrayList arrayList = new ArrayList();
            int length = primaryKey.length;
            while (i < length) {
                arrayList.add(objArr[dataTable.getColumns().indexOf(primaryKey[i])]);
                i++;
            }
            return zzZ(dataTable, arrayList.toArray());
        }
        DataRow dataRowNewRow = dataTable.newRow();
        while (i < objArr.length) {
            dataRowNewRow.set(i, objArr[i]);
            i++;
        }
        int iZzZ = zzZ(dataTable, zzZ(dataTable, dataRowNewRow, dataTable.getColumns().zzXQs()));
        if (iZzZ == -1) {
            return null;
        }
        return dataTable.getRows().get(iZzZ);
    }

    public static void zzZ(DataTable dataTable, ArrayList<DataRow> arrayList, int i) {
        if (i < 0 || i >= arrayList.size()) {
            return;
        }
        DataRow dataRow = dataTable.getRows().get(i);
        String tableName = dataTable.getTableName();
        if (dataTable.getDataSet() != null) {
            for (DataRelation dataRelation : dataTable.getDataSet().getRelations()) {
                String tableName2 = dataRelation.getChildTable().getTableName();
                if (tableName.equals(dataRelation.getParentTable().getTableName()) || tableName.equals(tableName2)) {
                    if (!tableName.equals(tableName2)) {
                        zzZ(dataRelation.getParentColumns(), dataRelation.getChildTable(), dataRelation.getChildColumns(), dataRow, Rule.CASCADE);
                    }
                }
            }
        }
        for (ForeignKeyConstraint foreignKeyConstraint : dataTable.getConstraints().zzXQu()) {
            if (!tableName.equals(foreignKeyConstraint.getTable().getTableName())) {
                zzZ(foreignKeyConstraint.getRelatedColumns(), foreignKeyConstraint.getTable(), foreignKeyConstraint.getColumns(), dataRow, foreignKeyConstraint.getDeleteRule());
            }
        }
        dataTable.onDataRowDeleted(dataRow);
        arrayList.remove(i);
        dataTable.zzXQj().zzXQ2();
    }

    public static void zzZ(DataTable dataTable, DataRow dataRow) throws Throwable {
        DataColumn[] primaryKey = dataTable.getPrimaryKey();
        if (primaryKey != null && primaryKey.length != 0) {
            int iZzhd = dataTable.zzXQj().zzW(primaryKey).zzhd(zzV.zzZ(primaryKey, dataRow));
            if (iZzhd == -1) {
                dataTable.getRows().add(dataRow);
                return;
            }
            DataRow dataRow2 = dataTable.getRows().get(iZzhd);
            int i = 0;
            for (Object obj : dataRow.zzXQn()) {
                DataColumn dataColumn = dataTable.getColumns().get(i);
                if (!dataColumn.isReadOnly() && !dataColumn.getAutoIncrement()) {
                    dataRow2.set(i, obj);
                    dataTable.zzXQj().zzXQ2();
                    i++;
                }
            }
            dataTable.onDataRowChanged(dataRow2);
            return;
        }
        dataTable.getRows().add(dataRow);
    }

    public static boolean zzZ(DataTable dataTable, DataColumn[] dataColumnArr, DataColumn[] dataColumnArr2, DataRow dataRow) {
        return dataTable.zzXQj().zzW(dataColumnArr).hasValue(zzV.zzZ(dataColumnArr2, dataRow));
    }

    public static DataRow zzZ(DataTable dataTable, Object[] objArr) throws Throwable {
        DataColumn[] primaryKey = dataTable.getPrimaryKey();
        if (primaryKey == null || primaryKey.length != objArr.length) {
            return null;
        }
        DataRow dataRowNewRow = dataTable.newRow();
        for (int i = 0; i < primaryKey.length; i++) {
            dataRowNewRow.set(primaryKey[i].getColumnName(), objArr[i]);
        }
        int iZzhd = dataTable.zzXQj().zzW(primaryKey).zzhd(zzV.zzZ(primaryKey, dataRowNewRow));
        if (iZzhd == -1) {
            return null;
        }
        return dataTable.getRows().get(iZzhd);
    }

    private static int zzZ(DataTable dataTable, Map<Integer, Object> map) {
        Iterator<DataRow> it = dataTable.getRows().iterator();
        int i = 0;
        while (it.hasNext() && !zzZ(it.next(), map)) {
            i++;
        }
        return i;
    }

    private static Map<Integer, Object> zzZ(DataTable dataTable, DataRow dataRow, DataColumn[] dataColumnArr) {
        HashMap map = new HashMap();
        for (DataColumn dataColumn : dataColumnArr) {
            int iIndexOf = dataTable.getColumns().indexOf(dataColumn.getColumnName());
            map.put(Integer.valueOf(iIndexOf), dataRow.get(iIndexOf));
        }
        return map;
    }

    private static boolean zzZ(DataRow dataRow, Map<Integer, Object> map) {
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<Integer, Object> entry : map.entrySet()) {
                Object obj = dataRow.get(entry.getKey().intValue());
                if (obj != null || entry.getValue() != null) {
                    if (!entry.getValue().equals(obj)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static void zzZ(DataColumn[] dataColumnArr, DataTable dataTable, DataColumn[] dataColumnArr2, DataRow dataRow, Rule rule) throws Throwable {
        if (rule == Rule.NONE) {
            return;
        }
        List<Integer> listZzhc = dataTable.zzXQj().zzW(dataColumnArr2).zzhc(zzV.zzZ(dataColumnArr, dataRow));
        int i = C159131.zzWQS[rule.ordinal()];
        if (i == 1) {
            Iterator<Integer> it = listZzhc.iterator();
            while (it.hasNext()) {
                dataTable.getRows().removeAt(it.next().intValue());
            }
            return;
        }
        if (i == 2) {
            for (Integer num : listZzhc) {
                for (DataColumn dataColumn : dataColumnArr2) {
                    dataTable.getRows().get(num.intValue()).set(dataColumn.getColumnName(), (Object) null);
                }
            }
            return;
        }
        if (i != 3) {
            return;
        }
        for (Integer num2 : listZzhc) {
            for (DataColumn dataColumn2 : dataColumnArr2) {
                dataTable.getRows().get(num2.intValue()).set(dataColumn2.getColumnName(), dataColumn2.getDefaultValue());
            }
        }
    }
}
