package com.aspose.words.net.System.Data;

import Oooo0oO.C21111o0ooOoO;
import Oooo0oO.o0Oo0oo;
import com.aspose.words.internal.zzZHV;
import com.aspose.words.internal.zzZKN;
import com.aspose.words.internal.zzZN5;
import com.aspose.words.internal.zzZN8;
import com.aspose.words.internal.zzZQR;
import com.aspose.words.internal.zzZQS;
import com.huawei.hms.network.embedded.C18115b5;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzR {
    private final Map<String, AtomicInteger> zzWQA = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    private final zzZN5 zzWQB;
    private final zzZQR zzWQC;
    private final boolean zzWQz;
    private final DataSet zzZQ8;

    public zzR(DataSet dataSet, zzZQR zzzqr, zzZN5 zzzn5, boolean z) {
        this.zzZQ8 = dataSet;
        this.zzWQC = zzzqr;
        this.zzWQB = zzzn5;
        this.zzWQz = z;
        for (DataTable dataTable : dataSet.getTables()) {
            this.zzWQA.put(dataTable.getTableName(), new AtomicInteger(zzS(dataTable)));
        }
    }

    private static int zzS(DataTable dataTable) {
        if (dataTable == null || dataTable.getRows().getCount() == 0) {
            return 0;
        }
        return dataTable.getRows().get(dataTable.getRows().getCount() - 1).zzXQp();
    }

    private static String zzT(zzZN5 zzzn5) {
        return (zzzn5 == null || zzzn5.getValue().length() == 0) ? "" : zzzn5.getValue().replaceAll("\\r", "").replaceAll("\\n", "").replaceAll("\\t", "").trim();
    }

    private static boolean zzU(zzZN5 zzzn5) {
        if (zzzn5 == null || zzzn5.getChildren() == null || zzzn5.getChildren().isEmpty()) {
            return false;
        }
        String name = null;
        for (zzZN5 zzzn52 : zzzn5.getChildren()) {
            if (name == null) {
                name = zzzn52.getName();
            } else if (!name.equals(zzzn52.getName())) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzV(zzZN5 zzzn5) {
        return !zzzn5.getAttributes().isEmpty();
    }

    private boolean zzW(zzZN5 zzzn5, String str, Class cls) {
        DataTable dataTable = this.zzZQ8.getTables().get(zzzn5.getName());
        if (dataTable.getColumns().contains(str) || !this.zzWQz) {
            return false;
        }
        dataTable.getColumns().add(str, cls, 4, false, true);
        return false;
    }

    private boolean zzX(zzZN5 zzzn5, String str, Class cls) {
        DataTable dataTable = this.zzZQ8.getTables().get(zzzn5.getName());
        if (dataTable.getColumns().contains(str) || !this.zzWQz) {
            return false;
        }
        dataTable.getColumns().add(str, cls, 4, true, false);
        return false;
    }

    private void zzY(zzZN5 zzzn5) throws Throwable {
        zzZ(zzzn5, (Integer) null, (String) null, (zzZN5) null);
    }

    private void zzZ(zzZN5 zzzn5, zzZQR zzzqr) throws SQLException, zzZQS {
        HashMap map = new HashMap();
        boolean z = false;
        zzZN5 zzzn52 = null;
        while (zzzqr.hasNext()) {
            int eventType = zzzqr.getEventType();
            if (eventType != 1) {
                if (eventType == 2) {
                    if (zzzn5.getName().equals(zzZN8.decode(zzzqr.getLocalName())) && !z) {
                        return;
                    }
                    z = false;
                    zzzn52 = null;
                } else if (eventType == 4 && zzzn52 != null && zzZ(zzzn52, zzzn5)) {
                    zzzn52.setValue(zzzqr.getText());
                }
            } else if (z) {
                zzZ(zzzn52, zzzqr);
                zzzn52.zzh9();
                z = false;
                zzzn52 = null;
            } else {
                zzzn52 = new zzZN5(zzZN8.decode(zzzqr.getLocalName()));
                zzzn5.zzZ(zzzn52);
                if (map.containsKey(zzzn52.getName())) {
                    zzzn52.zzh9();
                    ((zzZN5) map.get(zzzn52.getName())).zzh9();
                } else {
                    map.put(zzzn52.getName(), zzzn52);
                }
                if (zza(zzzqr)) {
                    for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
                        zzzn52.getAttributes().put(zzzqr.zzRu(i), zzzqr.getAttributeValue(i));
                    }
                    zzzn52.zzh9();
                } else if (zzzn5.getAttributes().size() != 0 && zzzn5.getName().equals(zzzn52.getName())) {
                    for (String str : zzzn5.getAttributes().keySet()) {
                        zzzn52.getAttributes().put(str, zzzn5.getAttributes().get(str));
                    }
                    zzzn52.zzh9();
                }
                z = true;
            }
            zzzqr.next();
        }
    }

    private static boolean zza(zzZQR zzzqr) {
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            if ("".equals(zzzqr.getAttributePrefix(i))) {
                return true;
            }
        }
        return false;
    }

    public final void zzXPZ() throws SQLException, InvalidConstraintException, zzZQS {
        zzZ(this.zzWQB, this.zzWQC);
        boolean zZzV = zzV(this.zzWQB);
        boolean zZzW = zzW(this.zzWQB);
        if (zZzV || !zZzW || this.zzWQB.getChildren().size() <= 1 || !zzU(this.zzWQB)) {
            if (zZzV || zZzW) {
                zzY(this.zzWQB);
                return;
            }
            this.zzZQ8.setDataSetName(this.zzWQB.getName());
            Iterator<zzZN5> it = this.zzWQB.getChildren().iterator();
            while (it.hasNext()) {
                zzY(it.next());
            }
            return;
        }
        for (zzZN5 zzzn5 : this.zzWQB.getChildren()) {
            DataTable dataTableZzX = this.zzZQ8.getTables().get(zzzn5.getName());
            if (dataTableZzX == null) {
                dataTableZzX = zzX(zzzn5);
                dataTableZzX.getColumns().add(zzzn5.getName() + "_Text");
            }
            DataRow dataRowNewRow = dataTableZzX.newRow();
            dataRowNewRow.set(0, zzzn5.getValue());
            dataTableZzX.getRows().add(dataRowNewRow);
        }
    }

    private boolean zzY(zzZN5 zzzn5, String str, Class cls) {
        DataTable dataTable = this.zzZQ8.getTables().get(zzzn5.getName());
        if (dataTable.getColumns().contains(str) || !this.zzWQz) {
            return false;
        }
        dataTable.getColumns().add(str, cls, 4, true, false);
        return true;
    }

    private static boolean zzW(zzZN5 zzzn5) {
        Iterator<zzZN5> it = zzzn5.getChildren().iterator();
        while (it.hasNext()) {
            if (!it.next().zzh8()) {
                return true;
            }
        }
        return false;
    }

    private DataTable zzX(zzZN5 zzzn5) {
        String name = zzzn5.getName();
        DataTable dataTable = this.zzZQ8.getTables().get(name);
        if (dataTable != null || !this.zzWQz) {
            return dataTable;
        }
        DataTable dataTable2 = new DataTable(name);
        this.zzZQ8.getTables().add(dataTable2);
        this.zzWQA.put(name, new AtomicInteger(0));
        return dataTable2;
    }

    private static void zzU(DataRow dataRow) {
        if (dataRow == null || dataRow.getTable() == null || dataRow.getTable().getColumns() == null) {
            return;
        }
        DataTable table = dataRow.getTable();
        Object[] objArrZzXQn = dataRow.zzXQn();
        StringBuilder sb = new StringBuilder("Insertion into " + table.getTableName() + " of VALUES(");
        for (Object obj : objArrZzXQn) {
            sb.append(obj);
            sb.append(", ");
        }
        sb.append(") failed.\nColumns: ");
        for (DataColumn dataColumn : table.getColumns()) {
            sb.append(dataColumn.getColumnName() + " (" + dataColumn.getDataType() + "), ");
        }
        System.err.println(sb.toString());
    }

    private void zzZ(zzZN5 zzzn5, Integer num, String str, zzZN5 zzzn52) throws Throwable {
        String name = zzzn5.getName();
        String strOooO0Oo = C21111o0ooOoO.OooO0Oo(name, "_Id");
        DataTable dataTableZzX = this.zzZQ8.getTables().get(name);
        if (dataTableZzX == null) {
            dataTableZzX = zzX(zzzn5);
        }
        if (dataTableZzX == null && this.zzZQ8.IsSchemaWasRead()) {
            return;
        }
        dataTableZzX.setEnforceConstraints(false);
        DataRow dataRowNewRow = dataTableZzX.newRow();
        for (zzZN5 zzzn53 : zzzn5.getChildren()) {
            if (!zzzn53.zzh8()) {
                zzZ(zzzn5, zzzn53.getName());
                dataRowNewRow.set(zzzn53.getName(), zzzn53.getValue());
            }
        }
        boolean zIsEmpty = zzzn5.getAttributes().isEmpty();
        Class cls = Integer.TYPE;
        if (!zIsEmpty) {
            for (Map.Entry<String, String> entry : zzzn5.getAttributes().entrySet()) {
                if (entry.getValue() != null) {
                    zzZ(zzzn5, entry.getKey());
                    dataRowNewRow.set(entry.getKey(), entry.getValue());
                } else {
                    zzY(zzzn5, entry.getKey(), cls);
                    dataRowNewRow.set(entry.getKey(), entry.getValue());
                }
            }
            if (zzzn5.getValue() != null) {
                String strZzT = zzT(zzzn5);
                if (strZzT.length() > 0) {
                    String str2 = zzzn5.getName() + "_Text";
                    zzZ(zzzn5, str2);
                    dataRowNewRow.set(str2, strZzT);
                }
            }
        }
        if (num != null && str != null) {
            String strZzZ = zzzn5.getName().equalsIgnoreCase(zzzn52.getName()) ? zzZ(zzzn5, str, name, dataTableZzX) : str;
            zzW(zzzn5, strZzZ, cls);
            zzZ(zzzn52, zzzn5, str, strZzZ);
            dataRowNewRow.set(strZzZ, num);
        }
        boolean zZzha = zzzn5.zzha();
        boolean zContains = dataTableZzX.getColumns().contains(strOooO0Oo);
        if (zZzha) {
            str = !zzZ(dataTableZzX, strOooO0Oo) ? strOooO0Oo : zzZ(zzzn5, strOooO0Oo, name, dataTableZzX);
            num = Integer.valueOf(this.zzWQA.get(name).getAndIncrement());
            zzX(zzzn5, str, cls);
            dataRowNewRow.set(str, num);
        } else if (zContains) {
            dataRowNewRow.set(strOooO0Oo, Integer.valueOf(this.zzWQA.get(name).getAndIncrement()));
        }
        if (zzzn5.getChildren().isEmpty() && zzzn5.getAttributes().isEmpty() && !zzZKN.zzU3(zzzn5.getValue())) {
            String str3 = zzzn5.getName() + "_Text";
            zzZ(zzzn5, str3);
            dataRowNewRow.set(str3, zzzn5.getValue());
        }
        try {
            dataTableZzX.getRows().add(dataRowNewRow);
            for (zzZN5 zzzn54 : zzzn5.getChildren()) {
                if (zzzn54.zzh8()) {
                    zzZ(zzzn54, num, str, zzzn5);
                }
            }
            dataTableZzX.setEnforceConstraints(true);
        } catch (ConstraintException e) {
            zzZHV.zzY(e);
            zzU(dataRowNewRow);
            throw e;
        } catch (InvalidConstraintException e2) {
            zzZHV.zzY(e2);
            zzU(dataRowNewRow);
            throw e2;
        }
    }

    private static boolean zzZ(DataTable dataTable, String str) {
        return dataTable.getColumns().contains(str) && !dataTable.getColumnName(dataTable.getColumns().indexOf(str)).equals(str);
    }

    private String zzZ(zzZN5 zzzn5, String str, String str2, DataTable dataTable) {
        if (this.zzZQ8.getTables().get(zzzn5.getName()).getColumns().contains(str)) {
            for (int i = 0; i < 10; i++) {
                str = zzZKN.format(C21111o0ooOoO.OooO0Oo(str2, "_Id_{0}"), 0);
                if (!dataTable.getColumns().contains(str)) {
                    break;
                }
            }
        }
        return str;
    }

    private boolean zzZ(zzZN5 zzzn5, zzZN5 zzzn52, String str, String str2) {
        String name = zzzn5.getName();
        String name2 = zzzn52.getName();
        DataTable dataTable = this.zzZQ8.getTables().get(name);
        DataTable dataTable2 = this.zzZQ8.getTables().get(name2);
        if (!this.zzWQz) {
            return false;
        }
        DataRelation dataRelation = new DataRelation(o0Oo0oo.OooO0Oo(name, C18115b5.CONNECTOR, name2), dataTable, dataTable2, new String[]{str}, new String[]{str2});
        if (this.zzZQ8.getRelations().contains(dataRelation)) {
            return false;
        }
        this.zzZQ8.getRelations().add(dataRelation);
        return true;
    }

    private boolean zzZ(zzZN5 zzzn5, String str) {
        return zzZ(zzzn5, str, String.class);
    }

    private boolean zzZ(zzZN5 zzzn5, String str, Class cls) {
        DataTable dataTable = this.zzZQ8.getTables().get(zzzn5.getName());
        if (dataTable.getColumns().contains(str) || !this.zzWQz) {
            return false;
        }
        dataTable.getColumns().add(str, cls);
        return true;
    }

    private static boolean zzZ(zzZN5 zzzn5, zzZN5 zzzn52) {
        if (!zzzn5.getName().equals(zzzn52.getName()) || zzzn52.getAttributes().isEmpty()) {
            return true;
        }
        Iterator<String> it = zzzn52.getAttributes().keySet().iterator();
        while (it.hasNext()) {
            if (zzzn52.getAttributes().get(it.next()) != null) {
                return true;
            }
        }
        return false;
    }
}
