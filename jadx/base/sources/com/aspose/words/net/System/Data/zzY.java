package com.aspose.words.net.System.Data;

import Oooo0oO.o0Oo0oo;
import com.aspose.words.internal.zzZHV;
import com.huawei.hms.network.embedded.C18115b5;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzY {
    public static void zzV(DataTable dataTable) throws SQLException {
        if (zzY(dataTable.getResultSet())) {
            for (DataRow dataRow : dataTable.zzXQi()) {
                if (dataRow != null) {
                    int rowState = dataRow.getRowState();
                    if (rowState == 1) {
                        zzZ(dataTable.getResultSet(), dataRow);
                    } else if (rowState == 8) {
                        zzW(dataTable.getResultSet(), dataRow);
                    } else if (rowState == 16) {
                        zzY(dataTable.getResultSet(), dataRow);
                    }
                }
            }
            dataTable.zzXQi().clear();
        }
    }

    private static void zzW(ResultSet resultSet, DataRow dataRow) throws SQLException {
        if (zzY(resultSet)) {
            resultSet.moveToCurrentRow();
            zzX(resultSet, dataRow);
            resultSet.deleteRow();
            resultSet.beforeFirst();
        }
    }

    public static Object[] zzX(ResultSet resultSet, DataTable dataTable) throws SQLException {
        int count = dataTable.getColumns().getCount();
        Object[] objArr = new Object[count];
        int i = 0;
        while (i < count) {
            int i2 = i + 1;
            try {
                objArr[i] = resultSet.getObject(i2);
                i = i2;
            } catch (SQLException e) {
                if ("Invalid cursor state".equalsIgnoreCase(e.getSQLState())) {
                    return null;
                }
                throw e;
            }
        }
        return objArr;
    }

    public static String zzXS(String str, String str2) {
        return (str == null || str.trim().isEmpty()) ? str2 : o0Oo0oo.OooO0Oo(str, ".", str2);
    }

    public static void zzY(ResultSet resultSet, DataTable dataTable) throws SQLException {
        if (resultSet.getType() != 1003) {
            resultSet.beforeFirst();
        }
        while (resultSet.next()) {
            DataRow dataRow = new DataRow(dataTable);
            if (!dataRow.readFrom(resultSet)) {
                return;
            }
            try {
                dataRow.setRowState(4);
                dataTable.getRows().add(dataRow);
            } catch (InvalidConstraintException e) {
                zzZHV.zzY(e);
            }
        }
    }

    public static void zzZ(DatabaseMetaData databaseMetaData, String str, String str2, DataTable dataTable) throws Exception {
        HashMap map = new HashMap();
        ResultSet indexInfo = databaseMetaData.getIndexInfo(str, str2, dataTable.getTableName(), false, false);
        while (indexInfo.next()) {
            String string = indexInfo.getString("INDEX_NAME");
            String string2 = indexInfo.getString("COLUMN_NAME");
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(dataTable.getColumns().get(string2));
        }
        for (Map.Entry entry : map.entrySet()) {
            dataTable.zzXQj().zzX((DataColumn[]) ((List) entry.getValue()).toArray(new DataColumn[((List) entry.getValue()).size()]));
        }
    }

    private static void zzX(ResultSet resultSet, DataRow dataRow) throws SQLException {
        try {
            resultSet.absolute(dataRow.zzXQp() + 1);
        } catch (Exception e) {
            zzZHV.zzZ(e);
            zzV(resultSet, dataRow);
        }
    }

    private static void zzV(ResultSet resultSet, DataRow dataRow) throws SQLException {
        resultSet.beforeFirst();
        while (!resultSet.next() && dataRow.zzXQp() != 0) {
        }
    }

    private static void zzY(ResultSet resultSet, DataRow dataRow) throws SQLException {
        if (zzY(resultSet)) {
            zzX(resultSet, dataRow);
            int i = 0;
            while (i < dataRow.zzXQn().length) {
                int i2 = i + 1;
                resultSet.updateObject(i2, dataRow.zzXQn()[i]);
                i = i2;
            }
            resultSet.updateRow();
        }
    }

    public static List<DataRelation> zzZ(DatabaseMetaData databaseMetaData, String str, String str2, DataTableCollection dataTableCollection) throws Exception {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (DataTable dataTable : dataTableCollection) {
            arrayList2.clear();
            arrayList3.clear();
            ResultSet exportedKeys = databaseMetaData.getExportedKeys(str, str2, dataTable.getTableName());
            while (exportedKeys.next()) {
                String string = exportedKeys.getString("FKTABLE_NAME");
                String string2 = exportedKeys.getString("FKCOLUMN_NAME");
                String string3 = exportedKeys.getString("PKTABLE_NAME");
                String string4 = exportedKeys.getString("PKCOLUMN_NAME");
                arrayList2.add(dataTableCollection.get(string).getColumns().get(string2));
                arrayList3.add(dataTableCollection.get(string3).getColumns().get(string4));
            }
            if (!arrayList3.isEmpty() && !arrayList2.isEmpty()) {
                arrayList.add(new DataRelation(((DataColumn) arrayList3.get(0)).getTable().getTableName() + C18115b5.CONNECTOR + ((DataColumn) arrayList2.get(0)).getTable().getTableName(), (DataColumn[]) arrayList3.toArray(new DataColumn[arrayList3.size()]), (DataColumn[]) arrayList2.toArray(new DataColumn[arrayList2.size()]), true));
            }
        }
        return arrayList;
    }

    private static boolean zzY(ResultSet resultSet) throws SQLException {
        return (resultSet == null || resultSet.getStatement() == null || resultSet.getStatement().getResultSetConcurrency() != 1008) ? false : true;
    }

    public static List<String> zzZ(DatabaseMetaData databaseMetaData, String str, String str2, String str3) throws Exception {
        ArrayList arrayList = new ArrayList();
        ResultSet primaryKeys = databaseMetaData.getPrimaryKeys(str, str2, str3);
        while (primaryKeys.next()) {
            arrayList.add(primaryKeys.getString("COLUMN_NAME"));
        }
        return arrayList;
    }

    public static List<String> zzZ(DatabaseMetaData databaseMetaData, String str, String str2) throws Exception {
        ArrayList arrayList = new ArrayList();
        ResultSet tables = databaseMetaData.getTables(str2, str, null, null);
        while (tables.next()) {
            arrayList.add(tables.getString(3));
        }
        return arrayList;
    }

    public static String zzZ(ResultSet resultSet) {
        if (resultSet != null) {
            try {
                return resultSet.getMetaData().getTableName(1);
            } catch (Exception unused) {
                return "";
            }
        }
        throw new IllegalArgumentException("resultSet");
    }

    public static void zzZ(ResultSet resultSet, DataTable dataTable) throws SQLException {
        for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
            ResultSetMetaData metaData = resultSet.getMetaData();
            DataColumn dataColumn = new DataColumn(metaData.getColumnName(i), dataTable, i);
            dataColumn.setAllowDBNull(metaData.isNullable(i) == 1);
            dataColumn.setAutoIncrement(metaData.isAutoIncrement(i));
            dataColumn.setReadOnly(metaData.isReadOnly(i));
            try {
                dataColumn.setDataType(Class.forName(metaData.getColumnClassName(i)));
            } catch (ClassNotFoundException e) {
                zzZHV.zzZ(e);
            }
            dataTable.getColumns().add(dataColumn);
        }
    }

    private static void zzZ(ResultSet resultSet, DataRow dataRow) throws SQLException {
        if (zzY(resultSet)) {
            resultSet.moveToInsertRow();
            int i = 0;
            while (i < dataRow.zzXQn().length) {
                int i2 = i + 1;
                resultSet.updateObject(i2, dataRow.zzXQn()[i]);
                i = i2;
            }
            resultSet.insertRow();
            resultSet.moveToCurrentRow();
        }
    }
}
