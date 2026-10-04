package com.aspose.words.net.System.Data;

import com.aspose.words.internal.zzZKN;
import com.aspose.words.internal.zzZN8;
import com.aspose.words.internal.zzZN9;
import com.aspose.words.internal.zzZQR;
import com.aspose.words.internal.zzZQS;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzQ {
    private DataTable zzWQx;
    private DataSet zzWQy;
    private Map zzWQw = new HashMap();
    private Map zzWQv = new HashMap();

    public zzQ(DataSet dataSet) {
        this.zzWQy = dataSet;
    }

    private static String zz5(zzZQR zzzqr) throws zzZQS {
        while (zzzqr.hasNext()) {
            if (zzzqr.getEventType() == 4) {
                return zzzqr.getText();
            }
            zzzqr.next();
        }
        return null;
    }

    private void zz6(zzZQR zzzqr) throws Throwable {
        String localName = zzzqr.getLocalName();
        while (zzzqr.hasNext()) {
            int eventType = zzzqr.getEventType();
            if (eventType == 1) {
                DataTable dataTableZzya = zzya(zzzqr.getLocalName());
                if (dataTableZzya != null) {
                    zzZ(dataTableZzya, zzzqr);
                }
            } else if (eventType == 2 && localName.equals(zzzqr.getLocalName())) {
                return;
            }
            zzzqr.next();
        }
    }

    private void zz7(zzZQR zzzqr) throws zzZQS {
        String localName = zzzqr.getLocalName();
        while (zzzqr.zzsa()) {
            int eventType = zzzqr.getEventType();
            if (eventType == 1) {
                String attributeValue = zzzqr.getAttributeValue("urn:schemas-microsoft-com:xml-diffgram-v1", "id");
                DataRow dataRow = attributeValue != null ? (DataRow) this.zzWQv.get(attributeValue) : null;
                if (dataRow != null) {
                    dataRow.zzXU(zzzqr.getLocalName(), zzzqr.getAttributeValue("urn:schemas-microsoft-com:xml-diffgram-v1", "error"));
                }
            } else if (eventType == 2 && localName.equals(zzzqr.getLocalName())) {
                return;
            }
            zzzqr.next();
        }
    }

    private void zz8(zzZQR zzzqr) throws Throwable {
        String localName = zzzqr.getLocalName();
        while (zzzqr.hasNext()) {
            int eventType = zzzqr.getEventType();
            if (eventType == 1) {
                DataTable dataTableZzya = zzya(zzzqr.getLocalName());
                if (dataTableZzya != null) {
                    ArrayList arrayList = new ArrayList();
                    zzW.zzZ(dataTableZzya, zzZ(dataTableZzya, zzzqr, arrayList));
                    if (!arrayList.isEmpty()) {
                        DataTable table = ((DataRow) arrayList.get(0)).getTable();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            zzW.zzZ(table, (DataRow) it.next());
                        }
                    }
                }
            } else if (eventType == 2 && localName.equals(zzzqr.getLocalName())) {
                return;
            }
            zzzqr.next();
        }
    }

    private void zzY(DataTable dataTable, DataRow dataRow, zzZQR zzzqr, int i, List<DataRow> list) throws Throwable {
        String localName = zzzqr.getLocalName();
        while (zzzqr.hasNext()) {
            int next = zzzqr.next();
            if (next == 1) {
                String strDecode = zzZN8.decode(zzzqr.getLocalName());
                if (dataTable.getColumns().contains(strDecode)) {
                    Object objZzW = zzZN9.zzW(dataTable.getColumns().get(strDecode).getDataType(), zz5(zzzqr));
                    if (i == 512) {
                        dataRow.set(strDecode, objZzW);
                    } else {
                        dataRow.setOriginalValue(strDecode, objZzW);
                    }
                } else {
                    DataTable dataTableZzya = zzya(strDecode);
                    if (dataTableZzya != null) {
                        if (i == 256) {
                            zzZ(dataTableZzya, zzzqr);
                        } else if (i == 512) {
                            list.add(zzZ(dataTableZzya, zzzqr, list));
                        }
                    }
                }
            } else if (next == 2 && localName.equals(zzzqr.getLocalName())) {
                return;
            }
        }
    }

    private void zzZ(DataTable dataTable, zzZQR zzzqr) throws Throwable {
        String attributeValue = zzzqr.getAttributeValue("urn:schemas-microsoft-com:xml-diffgram-v1", "id");
        zzzqr.getAttributeValue("urn:schemas-microsoft-com:xml-msdata", "rowOrder");
        DataRow dataRow = (DataRow) this.zzWQw.get(attributeValue);
        if (dataRow != null) {
            zzZ(dataTable, dataRow, zzzqr, 256, new ArrayList<>());
            return;
        }
        DataRow dataRowNewRow = dataTable.newRow();
        ArrayList arrayList = new ArrayList();
        zzZ(dataTable, dataRowNewRow, zzzqr, 512, arrayList);
        zzW.zzX(dataTable, dataRowNewRow);
        if (arrayList.isEmpty()) {
            return;
        }
        DataTable table = ((DataRow) arrayList.get(0)).getTable();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zzW.zzY(table, (DataRow) it.next());
        }
    }

    private DataTable zzya(String str) {
        String strZzUB = zzZN8.zzUB(str);
        DataSet dataSet = this.zzWQy;
        if (dataSet != null) {
            return dataSet.getTables().get(strZzUB);
        }
        if (strZzUB.equals(this.zzWQx.getTableName())) {
            return this.zzWQx;
        }
        return null;
    }

    public final void zz9(zzZQR zzzqr) throws ConstraintException, InvalidConstraintException, zzZQS {
        DataSet dataSet = this.zzWQy;
        boolean z = false;
        if (dataSet != null) {
            boolean enforceConstraints = dataSet.getEnforceConstraints();
            this.zzWQy.setEnforceConstraints(false);
            z = enforceConstraints;
        }
        while (zzzqr.hasNext()) {
            if (zzzqr.getEventType() == 1 && !"diffgram".equals(zzzqr.getLocalName())) {
                if ("before".equals(zzzqr.getLocalName())) {
                    zz6(zzzqr);
                } else if ("errors".equals(zzzqr.getLocalName())) {
                    zz7(zzzqr);
                } else {
                    zz8(zzzqr);
                }
            }
            zzzqr.next();
        }
        DataSet dataSet2 = this.zzWQy;
        if (dataSet2 != null) {
            dataSet2.setEnforceConstraints(z);
        }
    }

    private DataRow zzZ(DataTable dataTable, zzZQR zzzqr, List<DataRow> list) throws Throwable {
        DataRow dataRowNewRow = dataTable.newRow();
        String attributeValue = zzzqr.getAttributeValue("urn:schemas-microsoft-com:xml-diffgram-v1", "id");
        String attributeValue2 = zzzqr.getAttributeValue("", "hasErrors");
        String attributeValue3 = zzzqr.getAttributeValue("urn:schemas-microsoft-com:xml-diffgram-v1", "hasChanges");
        if (attributeValue3 != null) {
            if (zzZKN.zzV(attributeValue3, "modified", true) == 0) {
                this.zzWQw.put(attributeValue, dataRowNewRow);
            } else if (zzZKN.zzV(attributeValue3, "inserted", true) != 0) {
                throw new UnsupportedOperationException("Invalid row change state");
            }
        }
        if (attributeValue2 != null && zzZKN.zzV(attributeValue2, TelemetryEventStrings.Value.TRUE, true) == 0) {
            this.zzWQv.put(attributeValue, dataRowNewRow);
        }
        zzZ(dataTable, dataRowNewRow, zzzqr, 512, list);
        return dataRowNewRow;
    }

    private void zzZ(DataTable dataTable, DataRow dataRow, zzZQR zzzqr, int i, List<DataRow> list) throws Throwable {
        zzZ(dataTable, dataRow, zzzqr, i);
        zzY(dataTable, dataRow, zzzqr, i, list);
    }

    private static void zzZ(DataTable dataTable, DataRow dataRow, zzZQR zzzqr, int i) throws Throwable {
        if (zzzqr.getAttributeCount() == 0) {
            return;
        }
        for (int i2 = 0; i2 < zzzqr.getAttributeCount(); i2++) {
            String attributeNamespace = zzzqr.getAttributeNamespace(i2);
            if (!"http://www.w3.org/2000/xmlns/".equals(attributeNamespace) && !"http://www.w3.org/XML/1998/namespace".equals(attributeNamespace) && !"urn:schemas-microsoft-com:xml-diffgram-v1".equals(attributeNamespace) && !"urn:schemas-microsoft-com:xml-msdata".equals(attributeNamespace) && !"urn:schemas-microsoft-com:xml-msprop".equals(attributeNamespace) && !"http://www.w3.org/2001/XMLSchema".equals(attributeNamespace)) {
                String strZzRu = zzzqr.zzRu(i2);
                String attributeValue = zzzqr.getAttributeValue(i2);
                DataColumn dataColumn = dataTable.getColumns().get(zzZN8.decode(strZzRu));
                if (dataColumn != null && dataColumn.getColumnMapping() == 2 && ((dataColumn.getNamespace() == null && "".equals(zzzqr.getNamespaceURI())) || dataColumn.getNamespace().equals(zzzqr.getNamespaceURI()))) {
                    Object objZzW = zzZN9.zzW(dataColumn.getDataType(), attributeValue);
                    if (i == 512) {
                        dataRow.set(dataColumn.getColumnName(), objZzW);
                    } else {
                        dataRow.setOriginalValue(dataColumn.getColumnName(), objZzW);
                    }
                }
            }
        }
    }
}
