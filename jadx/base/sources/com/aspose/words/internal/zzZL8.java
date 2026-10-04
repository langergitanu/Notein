package com.aspose.words.internal;

import com.aspose.words.internal.zzZNC;
import com.aspose.words.net.System.Data.DataColumn;
import com.aspose.words.net.System.Data.DataException;
import com.aspose.words.net.System.Data.DataRelation;
import com.aspose.words.net.System.Data.DataSet;
import com.aspose.words.net.System.Data.DataTable;
import com.aspose.words.net.System.Data.InvalidConstraintException;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZL8 {
    public static String zzUh(String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        if (iLastIndexOf > 0) {
            str = str.substring(iLastIndexOf + 1);
        }
        int iLastIndexOf2 = str.lastIndexOf(58);
        if (iLastIndexOf2 > 0) {
            str = str.substring(iLastIndexOf2 + 1);
        }
        return zzZN8.decode(str);
    }

    private static boolean zzW(zzZLW zzzlw) {
        zzZML zzzml = zzzlw instanceof zzZML ? (zzZML) zzzlw : null;
        if (zzzml != null) {
            zzZMQ zzzmq = zzzml.zzgo() instanceof zzZMQ ? (zzZMQ) zzzml.zzgo() : null;
            if (zzzmq == null || zzzmq == zzZL9.zzZQ1) {
                return true;
            }
            return zzzmq.zzgG().getCount() <= 0 && zzzmq.getContentType() == 0;
        }
        zzZME zzzme = (zzZME) zzzlw;
        for (int i = 0; i < zzzme.zzgc().getCount(); i++) {
            if (zzW((zzZLW) zzzme.zzgc().zzQt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean zzY(String str, Map<zzZMC, zzZNC.zzZ> map) {
        for (zzZNC.zzZ zzz : map.values()) {
            if (zzz.zzZVK.equals(str) && (zzz.zzZVG || zzz.zzZVE)) {
                return true;
            }
        }
        return false;
    }

    public static DataRelation zzZ(zzZNC.zzY zzy, DataSet dataSet, zzZML zzzml) throws DataException, InvalidConstraintException {
        DataRelation dataRelation;
        DataTable dataTable = dataSet.getTables().get(zzy.getParentTableName());
        DataTable dataTable2 = dataSet.getTables().get(zzy.getChildTableName());
        String strZzho = zzy.zzho() != null ? zzy.zzho() : zzZN8.decode(dataTable.getTableName()) + '_' + zzZN8.decode(dataTable2.getTableName());
        if (zzzml != null) {
            String[] strArrSplit = zzy.zzhn().split(" ");
            String[] strArrSplit2 = zzy.zzhm().split(" ");
            int length = strArrSplit.length;
            DataColumn[] dataColumnArr = new DataColumn[length];
            for (int i = 0; i < length; i++) {
                dataColumnArr[i] = dataTable.getColumns().get(zzZN8.decode(strArrSplit[i]));
            }
            int length2 = strArrSplit2.length;
            DataColumn[] dataColumnArr2 = new DataColumn[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                DataColumn dataColumn = dataTable2.getColumns().get(zzZN8.decode(strArrSplit2[i2]));
                dataColumnArr2[i2] = dataColumn;
                if (dataColumn == null) {
                    dataColumnArr2[i2] = zzZ(dataColumnArr[i2], dataTable2);
                }
            }
            dataRelation = new DataRelation(strZzho, dataColumnArr, dataColumnArr2, zzy.zzhi());
        } else {
            DataColumn dataColumn2 = dataTable.getColumns().get(zzZN8.decode(zzy.zzhn()));
            DataColumn dataColumnZzZ = dataTable2.getColumns().get(zzZN8.decode(zzy.zzhm()));
            if (dataColumnZzZ == null) {
                dataColumnZzZ = zzZ(dataColumn2, dataTable2);
            }
            dataRelation = new DataRelation(strZzho, dataColumn2, dataColumnZzZ, zzy.zzhi());
        }
        dataRelation.setNested(zzy.zzhk());
        if (zzy.zzhi()) {
            dataRelation.getParentTable().setPrimaryKey(dataRelation.getParentColumns());
        }
        return dataRelation;
    }

    public static zzZMN zzZZ(Object obj) {
        if (obj instanceof zzZMQ) {
            return null;
        }
        zzZMN zzzmn = obj instanceof zzZMN ? (zzZMN) obj : null;
        return (zzzmn != null || obj == null) ? zzzmn : ((zzZLN) obj).zzZQM;
    }

    public static Object zzY(zzZML zzzml, zzZN3 zzzn3) {
        if (zzzml.zzgO() == zzZN4.zzZV6) {
            return zzzml.zzgM();
        }
        zzZML zzzml2 = (zzZML) zzzn3.zzh5().zzS(zzzml.zzgO());
        if (zzzml2 == null) {
            return null;
        }
        return zzzml2.zzgM();
    }

    private static DataColumn zzZ(DataColumn dataColumn, DataTable dataTable) {
        DataColumn dataColumnAdd = dataTable.getColumns().add(dataColumn.getColumnName(), dataColumn.getDataType());
        dataColumnAdd.setNamespace("");
        dataColumnAdd.setColumnMapping(4);
        return dataColumnAdd;
    }

    public static Object zzZ(zzZN3 zzzn3, zzZMX zzzmx) {
        if (zzzmx.zzgM() != null) {
            return zzzmx.zzgM();
        }
        if (zzzmx.zzgN() != null) {
            return zzzmx.zzgN();
        }
        if (zzzmx.zzgO() == zzZN4.zzZV6) {
            return null;
        }
        zzZLZ zzzlzZzS = zzzn3.zzh4().zzS(zzzmx.zzgO());
        zzZMX zzzmx2 = zzzlzZzS instanceof zzZMX ? (zzZMX) zzzlzZzS : null;
        if (zzzmx2 == null) {
            return null;
        }
        if (zzzmx2.zzgM() != null) {
            return zzzmx2.zzgM();
        }
        return zzzmx2.zzgN();
    }

    public static boolean zzZ(zzZML zzzml, zzZN3 zzzn3) {
        if (zzzml.zzgb().size() > 0) {
            for (Map.Entry<String, String> entry : zzzml.zzgb().entrySet()) {
                if ("IsDataSet".equals(entry.getKey())) {
                    return Boolean.parseBoolean(entry.getValue());
                }
            }
        }
        if (zzzn3.zzh5().getCount() != 1 || !(zzzml.zzgd() instanceof zzZMQ)) {
            return false;
        }
        zzZMQ zzzmq = (zzZMQ) zzzml.zzgd();
        if (zzzmq.zzgG().getCount() > 0) {
            return false;
        }
        zzZME zzzme = zzzmq.zzgA() instanceof zzZME ? (zzZME) zzzmq.zzgA() : null;
        if (zzzme == null || zzzme.zzgc().getCount() == 0) {
            return false;
        }
        Iterator<zzZLZ> it = zzzme.zzgc().iterator();
        while (it.hasNext()) {
            if (zzW((zzZLW) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static void zzZ(zzZM8 zzzm8, Map<zzZMC, zzZNC.zzZ> map) {
        boolean z;
        boolean z2;
        String strZzUh = zzUh(zzzm8.zzgf().getXPath());
        int count = zzzm8.zzgg().getCount();
        String[] strArr = new String[count];
        boolean[] zArr = new boolean[count];
        Iterator<zzZLZ> it = zzzm8.zzgg().iterator();
        boolean z3 = false;
        int i = 0;
        while (it.hasNext()) {
            String xPath = ((zzZLD) it.next()).getXPath();
            boolean z4 = xPath.length() > 0 && xPath.charAt(0) == '@';
            int iLastIndexOf = xPath.lastIndexOf(58);
            if (iLastIndexOf > 0) {
                xPath = xPath.substring(iLastIndexOf + 1);
            } else if (z4) {
                xPath = xPath.substring(1);
            }
            strArr[i] = zzZN8.decode(xPath);
            zArr[i] = z4;
            i++;
        }
        String name = zzzm8.getName();
        if (zzzm8.zzgb().isEmpty()) {
            z = false;
            z2 = false;
        } else {
            boolean z5 = false;
            for (Map.Entry<String, String> entry : zzzm8.zzgb().entrySet()) {
                if ("ConstraintName".equals(entry.getKey())) {
                    name = entry.getValue();
                }
                if ("IsNested".equals(entry.getKey()) && TelemetryEventStrings.Value.TRUE.equals(entry.getValue())) {
                    z3 = true;
                }
                if ("ConstraintOnly".equals(entry.getKey()) && TelemetryEventStrings.Value.TRUE.equals(entry.getValue())) {
                    z5 = true;
                }
            }
            z = z3;
            z2 = z5;
        }
        map.put(zzzm8, new zzZNC.zzZ(strZzUh, strArr, zArr, name, false, zzzm8.zzge().getName(), z, z2));
    }

    public static void zzZ(zzZMC zzzmc, Map<zzZMC, zzZNC.zzZ> map) {
        String strZzUh = zzUh(zzzmc.zzgf().getXPath());
        int count = zzzmc.zzgg().getCount();
        String[] strArr = new String[count];
        boolean[] zArr = new boolean[count];
        Iterator<zzZLZ> it = zzzmc.zzgg().iterator();
        boolean z = false;
        int i = 0;
        while (it.hasNext()) {
            String xPath = ((zzZLD) it.next()).getXPath();
            boolean z2 = xPath.length() > 0 && xPath.charAt(0) == '@';
            int iLastIndexOf = xPath.lastIndexOf(58);
            if (iLastIndexOf > 0) {
                xPath = xPath.substring(iLastIndexOf + 1);
            } else if (z2) {
                xPath = xPath.substring(1);
            }
            strArr[i] = zzZN8.decode(xPath);
            zArr[i] = z2;
            i++;
        }
        String name = zzzmc.getName();
        if (!zzzmc.zzgb().isEmpty()) {
            for (Map.Entry<String, String> entry : zzzmc.zzgb().entrySet()) {
                if ("ConstraintName".equals(entry.getKey())) {
                    name = entry.getValue();
                }
                if ("PrimaryKey".equals(entry.getKey())) {
                    z = Boolean.parseBoolean(entry.getValue());
                }
            }
        }
        map.put(zzzmc, new zzZNC.zzZ(strZzUh, strArr, zArr, name, z, null, false, false));
    }
}
