package com.aspose.words.internal;

import androidx.core.location.LocationRequestCompat;
import com.aspose.words.net.System.Data.Constraint;
import com.aspose.words.net.System.Data.ConstraintCollection;
import com.aspose.words.net.System.Data.DBNull;
import com.aspose.words.net.System.Data.DataColumn;
import com.aspose.words.net.System.Data.DataRow;
import com.aspose.words.net.System.Data.DataRowCollection;
import com.aspose.words.net.System.Data.DataSet;
import com.aspose.words.net.System.Data.DataTable;
import com.aspose.words.net.System.Data.ForeignKeyConstraint;
import com.aspose.words.net.System.Data.UniqueConstraint;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zzR4 {
    private static Class[] zzMp = {Long.TYPE, Double.TYPE, Boolean.TYPE, zz7T.zzo7};

    public interface zzZ {
        zzZQ9 zzf(String str);
    }

    public static void zzX(DataTable dataTable) {
        for (DataColumn dataColumn : dataTable.getColumns()) {
            if (dataColumn.getColumnMapping() == 3) {
                dataColumn.setColumnMapping(1);
            }
        }
    }

    private static Object zzY(String str, Class cls, zzZ zzz) {
        if (zzZKN.zzU3(str)) {
            return DBNull.Value;
        }
        if (cls == Long.TYPE) {
            return Long.valueOf(zzJB.zzZl(str));
        }
        if (cls == Double.TYPE) {
            return Double.valueOf(zzJB.zzZs(str));
        }
        if (cls == Boolean.TYPE) {
            return Boolean.valueOf(zzZYD.zzh(str, TelemetryEventStrings.Value.TRUE));
        }
        if (cls == zz7T.zzo7) {
            return zz7T.zzM(zzZ(str, zzz));
        }
        return null;
    }

    public static void zzZ(DataSet dataSet) {
        zzZ(dataSet, (zzZ) null);
    }

    private static boolean zzg(String str) {
        long jZzZl = zzJB.zzZl(str);
        return jZzZl != Long.MIN_VALUE && jZzZl >= Long.MIN_VALUE && jZzZl <= LocationRequestCompat.PASSIVE_INTERVAL;
    }

    public static Class zzh(String str) {
        if (zzZKN.zzU3(str)) {
            return null;
        }
        for (Class cls : zzMp) {
            if (cls != zz7T.zzo7 && zzZ(str, cls, (zzZ) null)) {
                return cls;
            }
        }
        return String.class;
    }

    public static void zzZ(DataSet dataSet, zzZ zzz) {
        zzZ(dataSet, zzMp, zzz);
    }

    public static void zzZ(DataSet dataSet, Class[] clsArr, zzZ zzz) {
        for (DataTable dataTable : dataSet.getTables()) {
            zzX(dataTable);
            for (DataColumn dataColumn : zzZ(dataTable, new String[0])) {
                Class clsZzZ = zzZ(dataTable.getRows(), dataColumn, clsArr, zzz);
                if (clsZzZ != null) {
                    zzZ(dataTable, dataColumn, clsZzZ, zzz);
                }
            }
        }
    }

    public static ArrayList<DataColumn> zzZ(DataTable dataTable, String... strArr) {
        ArrayList<DataColumn> arrayList = new ArrayList<>(dataTable.getColumns().getCount());
        for (DataColumn dataColumn : dataTable.getColumns()) {
            if (dataColumn.getDataType() == String.class && dataColumn.getColumnMapping() != 4 && !zzZ(dataColumn, dataTable.getConstraints()) && (strArr == null || !zzZ1.zzY(strArr, dataColumn.getColumnName()))) {
                zzZQG.zzZ(arrayList, dataColumn);
            }
        }
        return arrayList;
    }

    private static boolean zzZ(DataColumn dataColumn, ConstraintCollection constraintCollection) {
        for (Constraint constraint : constraintCollection) {
            UniqueConstraint uniqueConstraint = (UniqueConstraint) zzZKW.zzZ(constraint, UniqueConstraint.class);
            if (uniqueConstraint != null && zzZKV.zzZ(uniqueConstraint.getColumns(), dataColumn, uniqueConstraint.getColumns().length) >= 0) {
                return true;
            }
            ForeignKeyConstraint foreignKeyConstraint = (ForeignKeyConstraint) zzZKW.zzZ(constraint, ForeignKeyConstraint.class);
            if (foreignKeyConstraint != null && zzZKV.zzZ(foreignKeyConstraint.getColumns(), dataColumn, foreignKeyConstraint.getColumns().length) >= 0) {
                return true;
            }
        }
        return false;
    }

    private static Class zzZ(DataRowCollection dataRowCollection, DataColumn dataColumn, Class[] clsArr, zzZ zzz) {
        dataColumn.getDataType();
        for (Class cls : clsArr) {
            Iterator<DataRow> it = dataRowCollection.iterator();
            boolean z = true;
            boolean z2 = false;
            boolean zZzZ = true;
            while (true) {
                if (!it.hasNext()) {
                    z = z2;
                    break;
                }
                Object obj = it.next().get(dataColumn);
                if (obj != DBNull.Value) {
                    String str = (String) obj;
                    if (zzZKN.equals(str, "")) {
                        continue;
                    } else {
                        zZzZ = zzZ(str, cls, zzz);
                        if (!zZzZ) {
                            break;
                        }
                        z2 = true;
                    }
                }
            }
            if (!z) {
                return null;
            }
            if (zZzZ) {
                return cls;
            }
        }
        return null;
    }

    private static boolean zzZ(String str, Class cls, zzZ zzz) {
        if (zzZKN.zzU3(str)) {
            return false;
        }
        if (cls == Long.TYPE) {
            return zzg(str);
        }
        return cls == Double.TYPE ? !Double.isNaN(zzJB.zzZs(str)) : cls == Boolean.TYPE ? zzZYD.zzh(str, TelemetryEventStrings.Value.TRUE) || zzZYD.zzh(str, TelemetryEventStrings.Value.FALSE) : cls == zz7T.zzo7 && !zzZQ9.zzZ(zzZ(str, zzz), zzZQ9.zz35);
    }

    private static zzZQ9 zzZ(String str, zzZ zzz) {
        if (zzz != null) {
            return zzz.zzf(str);
        }
        return zzJB.zzZh(str);
    }

    public static void zzZ(DataTable dataTable, DataColumn dataColumn, Class cls, zzZ zzz) throws Throwable {
        String columnName = dataColumn.getColumnName();
        dataColumn.setColumnName(zzZOZ.zziD().toString());
        DataColumn dataColumnAdd = dataTable.getColumns().add(columnName, cls);
        for (DataRow dataRow : dataTable.getRows()) {
            Object obj = dataRow.get(dataColumn);
            if (obj != DBNull.Value) {
                dataRow.set(dataColumnAdd, zzY((String) obj, cls, zzz));
            } else {
                dataRow.set(dataColumnAdd, obj);
            }
        }
        dataTable.getColumns().remove(dataColumn);
    }
}
