package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.words.net.System.Data.DBNull;
import com.aspose.words.net.System.Data.DataColumn;
import com.aspose.words.net.System.Data.DataRelation;
import com.aspose.words.net.System.Data.DataRow;
import com.aspose.words.net.System.Data.DataSet;
import com.aspose.words.net.System.Data.DataTable;
import com.aspose.words.net.System.Data.ForeignKeyConstraint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes5.dex */
final class zzR6 {
    static int zzMr = zzZKN.format("_{0:N}_320fb408a82d4bb28501c84241f52bab", zzZOZ.zzZXP).length();

    private static boolean zzW(Node node) {
        for (Node parentNode = node.getParentNode(); parentNode != null; parentNode = parentNode.getParentNode()) {
            if (zzZKN.equals(parentNode.getNodeName(), node.getNodeName()) && zzZKN.equals(parentNode.getNamespaceURI(), node.getNamespaceURI())) {
                return true;
            }
        }
        return false;
    }

    private static String zzX(Node node) {
        if (!zzZYD.zzXk(node.getNamespaceURI())) {
            return node.getNodeName();
        }
        return node.getNamespaceURI() + ">" + node.getNodeName();
    }

    private static Node zzY(Document document) {
        for (int i = 0; i < document.getChildNodes().getLength(); i++) {
            Node nodeItem = document.getChildNodes().item(i);
            if (nodeItem.getNodeType() == 1) {
                return nodeItem;
            }
        }
        return null;
    }

    public static DataSet zzZ(Document document) throws Exception {
        zzZ(document, (HashMap<String, String>) new HashMap());
        zzZOR zzzor = new zzZOR();
        zzZSN.zzZ(document, (zzZOP) zzzor);
        zzzor.zzH(0L);
        DataSet dataSet = new DataSet();
        dataSet.readXml(zzzor);
        dataSet.setDataSetName(dataSet.getDataSetName() + "_320fb408a82d4bb28501c84241f52bab");
        return dataSet;
    }

    private static ArrayList<DataRow> zzY(DataTable dataTable) {
        ArrayList<DataRow> arrayList = new ArrayList<>();
        for (DataRow dataRow : dataTable.getRows()) {
            Iterator<DataRelation> it = dataTable.getParentRelations().iterator();
            while (true) {
                if (it.hasNext()) {
                    DataRelation next = it.next();
                    next.getChildColumns();
                    if (dataRow.get(next.getChildColumns()[0]) != DBNull.Value) {
                        break;
                    }
                } else {
                    zzZQG.zzZ(arrayList, dataRow);
                    break;
                }
            }
        }
        return arrayList;
    }

    public static Object zzZ(DataSet dataSet, Document document, boolean z, boolean z2) {
        if (dataSet.getTables().getCount() == 0) {
            return new ArrayList();
        }
        Node nodeZzY = zzY(document);
        DataTable dataTableZzZ = zzZ(nodeZzY, dataSet);
        if (dataTableZzZ != null) {
            return zzZ(dataTableZzZ);
        }
        ArrayList<DataTable> arrayListZzY = zzY(nodeZzY, dataSet);
        if (!z && arrayListZzY.size() <= 1) {
            if (!z2 && dataSet.getTables().get(0).getRows().getCount() == 1) {
                return dataSet.getTables().get(0).getRows().get(0);
            }
            return dataSet.getTables().get(0);
        }
        return zzZ(dataSet, arrayListZzY).getRows().get(0);
    }

    private static ArrayList<DataTable> zzY(Node node, DataSet dataSet) {
        ArrayList<DataTable> arrayList = new ArrayList<>();
        zzIM zzim = new zzIM();
        for (int i = 0; i < node.getChildNodes().getLength(); i++) {
            Node nodeItem = node.getChildNodes().item(i);
            if (nodeItem.getNodeType() == 1) {
                zzZSP zzzsp = new zzZSP(nodeItem);
                DataTable dataTable = dataSet.getTables().get(zzzsp.getLocalName(), zzzsp.zzEm());
                if (dataTable != null && zzim.add(dataTable.getTableName())) {
                    zzZQG.zzZ(arrayList, dataTable);
                }
            }
        }
        return arrayList;
    }

    private static boolean zzY(Node node) {
        if (node.getAttributes() != null && node.getAttributes().getLength() > 0) {
            return false;
        }
        for (int i = 0; i < node.getChildNodes().getLength(); i++) {
            if (node.getChildNodes().item(i).getNodeType() == 1) {
                return false;
            }
        }
        return true;
    }

    private static DataTable zzZ(Node node, DataSet dataSet) {
        zzZSP zzzsp = new zzZSP(node);
        DataTable dataTable = dataSet.getTables().get(zzzsp.getLocalName(), zzzsp.zzEm());
        if (dataTable == null) {
            return null;
        }
        if (dataTable.getParentRelations().getCount() > 0) {
            if (zzZ(dataTable) == null) {
                return null;
            }
        } else if (zzZ(node)) {
            return null;
        }
        return dataTable;
    }

    private static DataRow zzZ(DataTable dataTable) {
        if (dataTable.getParentRelations().getCount() == 0) {
            dataTable.getRows().getCount();
            return dataTable.getRows().get(0);
        }
        ArrayList<DataRow> arrayListZzY = zzY(dataTable);
        arrayListZzY.size();
        if (arrayListZzY.size() > 0) {
            return arrayListZzY.get(0);
        }
        return null;
    }

    private static boolean zzZ(Node node) {
        zzZSP zzzsp = new zzZSP(node);
        return zzZKX.zzZ(node, zzzsp.getLocalName(), zzzsp.zzEm()) != null;
    }

    private static DataTable zzZ(DataSet dataSet, ArrayList<DataTable> arrayList) throws Throwable {
        String string = zzZOZ.zziD().toString("N");
        String strOooO0Oo = C21111o0ooOoO.OooO0Oo(string, "_Id");
        DataTable dataTable = new DataTable(string);
        dataSet.getTables().add(dataTable);
        Class cls = Integer.TYPE;
        DataColumn dataColumn = new DataColumn(strOooO0Oo, cls);
        dataColumn.setAutoIncrement(true);
        dataColumn.setAllowDBNull(false);
        dataColumn.setColumnMapping(4);
        dataColumn.setUnique(true);
        dataTable.getColumns().add(dataColumn);
        dataTable.setPrimaryKey(new DataColumn[]{dataColumn});
        dataTable.getConstraints().getCount();
        DataRow dataRowNewRow = dataTable.newRow();
        dataRowNewRow.set(0, (Object) 0);
        dataTable.getRows().add(dataRowNewRow);
        Object obj = dataRowNewRow.get(dataColumn);
        for (DataTable dataTable2 : arrayList) {
            DataColumn dataColumn2 = new DataColumn(strOooO0Oo, cls);
            dataColumn2.setAllowDBNull(true);
            dataColumn2.setColumnMapping(4);
            dataTable2.getColumns().add(dataColumn2);
            dataTable2.getConstraints().add(new ForeignKeyConstraint(dataColumn, dataColumn2));
            DataRelation dataRelation = new DataRelation(zzZKN.format("{0}_{1}", dataTable.getTableName(), dataTable2.getTableName()), dataColumn, dataColumn2);
            dataTable.getChildRelations().add(dataRelation);
            dataSet.getRelations().add(dataRelation);
            Iterator<DataRow> it = zzY(dataTable2).iterator();
            while (it.hasNext()) {
                it.next().set(dataColumn2, obj);
            }
        }
        return dataTable;
    }

    private static void zzZ(Node node, HashMap<String, String> map) {
        String str;
        NodeList childNodes = node.getChildNodes();
        if (childNodes.getLength() == 0) {
            return;
        }
        ArrayList<Node> arrayList = new ArrayList(childNodes.getLength());
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if (nodeItem.getNodeType() == 1 && !zzY(nodeItem)) {
                zzZQG.zzZ((ArrayList<Node>) arrayList, nodeItem);
            }
        }
        for (Node nodeZzZ : arrayList) {
            if (zzW(nodeZzZ)) {
                String strZzZ = zzZ(node, nodeZzZ);
                if (map.containsKey(strZzZ)) {
                    str = map.get(strZzZ);
                } else {
                    String str2 = nodeZzZ.getNodeName() + zzZKN.format("_{0:N}_320fb408a82d4bb28501c84241f52bab", zzZOZ.zziD());
                    zzZQF.zzY(map, strZzZ, str2);
                    str = str2;
                }
                nodeZzZ = zzZ(nodeZzZ, str);
            }
            zzZ(nodeZzZ, map);
        }
    }

    private static String zzZ(Node node, Node node2) {
        return zzX(node) + "<" + zzX(node2);
    }

    private static Node zzZ(Node node, String str) {
        Node parentNode = node.getParentNode();
        Element elementCreateElement = node.getOwnerDocument().createElement(str);
        while (node.getAttributes().getLength() > 0) {
            Attr attr = (Attr) node.getAttributes().item(0);
            zzZKY.zzZ(node.getAttributes(), attr);
            elementCreateElement.getAttributes().setNamedItem(attr);
        }
        while (node.getChildNodes().getLength() > 0) {
            elementCreateElement.appendChild(node.getChildNodes().item(0));
        }
        parentNode.replaceChild(elementCreateElement, node);
        return elementCreateElement;
    }
}
