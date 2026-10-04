package com.aspose.words.internal;

import com.aspose.words.internal.zzR4;
import com.aspose.words.net.System.Data.DataRow;
import com.aspose.words.net.System.Data.DataSet;
import com.aspose.words.net.System.Data.DataTable;
import com.aspose.words.ref.Ref;
import com.huawei.hms.network.embedded.C18115b5;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes5.dex */
final class zzCJ {

    public static class zzZ implements zzR4.zzZ {
        private Iterable<String> zzu2;

        public zzZ(Iterable<String> iterable) {
            this.zzu2 = iterable;
        }

        @Override // com.aspose.words.internal.zzR4.zzZ
        public final zzZQ9 zzf(String str) {
            Iterable<String> iterable = this.zzu2;
            if (iterable == null) {
                zzZQ9 zzzq9Zze = zzR0.zze(str);
                return !zzZQ9.zzZ(zzzq9Zze, zzZQ9.zz35) ? zzzq9Zze : zzJB.zzZh(str);
            }
            zzZQ9 zzzq9 = null;
            for (String str2 : iterable) {
                Ref ref = new Ref(zzzq9);
                boolean z = !zzZKN.zzU3(str2) && zzZQ9.zzZ(str, str2, null, ref);
                zzZQ9 zzzq92 = (zzZQ9) ref.get();
                if (z) {
                    return zzzq92;
                }
                zzzq9 = zzzq92;
            }
            return zzR0.zzd(str);
        }
    }

    private static String zzV(Node node) {
        return node.getParentNode().getNodeName() + "\\" + node.getNodeName();
    }

    private static boolean zzW(Document document) {
        Attr attr;
        document.getChildNodes().getLength();
        Node nodeItem = document.getChildNodes().item(0);
        if (!nodeItem.hasChildNodes()) {
            return false;
        }
        if (nodeItem.getChildNodes().getLength() <= 1) {
            Node nodeItem2 = nodeItem.getChildNodes().item(0);
            return (nodeItem2.getAttributes() == null || (attr = (Attr) nodeItem2.getAttributes().getNamedItem("_3CEA27C9-DD7D-4935-9FD9-79B0CE397135")) == null || !"Array".equals(attr.getNodeValue())) ? false : true;
        }
        String nodeName = nodeItem.getChildNodes().item(0).getNodeName();
        for (int i = 0; i < nodeItem.getChildNodes().getLength(); i++) {
            if (!zzZKN.equals(nodeItem.getChildNodes().item(i).getNodeName(), nodeName)) {
                return false;
            }
        }
        return true;
    }

    private static DataSet zzX(Document document) throws Exception {
        DataSet dataSetZzZ = zzR6.zzZ(document);
        zzX(dataSetZzZ);
        return dataSetZzZ;
    }

    private static boolean zzYD(String str) {
        if (str == null) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!zzZKU.zzG(cCharAt)) {
                return cCharAt == '[';
            }
        }
        return false;
    }

    public static Object zzZ(String str, zzCN zzcn) throws Exception {
        boolean zZzYD = zzYD(str);
        Document documentZzZ = zzZ(str, zZzYD, zzcn);
        zzZ(documentZzZ, "_32FBD34A-2E27-495C-96FE-CC48EC4F120C");
        DataSet dataSetZzX = zzX(documentZzZ);
        zzZ(dataSetZzX, zzcn);
        return (zZzYD || (!zzcn.getAlwaysGenerateRootObject() && zzW(documentZzZ))) ? dataSetZzX.getTables().get(0) : zzR6.zzZ(dataSetZzX, documentZzZ, zzcn.getAlwaysGenerateRootObject(), false);
    }

    private static void zzX(DataSet dataSet) {
        for (DataTable dataTable : dataSet.getTables()) {
            if (dataTable.getColumns().get("_3CEA27C9-DD7D-4935-9FD9-79B0CE397135") != null) {
                for (int count = dataTable.getRows().getCount() - 1; count >= 0; count--) {
                    DataRow dataRow = dataTable.getRows().get(count);
                    if ("EmptyArray".equals(dataRow.get("_3CEA27C9-DD7D-4935-9FD9-79B0CE397135").toString())) {
                        dataRow.delete();
                    }
                }
            }
        }
    }

    private static void zzZ(DataSet dataSet, zzCN zzcn) {
        zzZ zzz = new zzZ(zzcn.getExactDateTimeParseFormats());
        int simpleValueParseMode = zzcn.getSimpleValueParseMode();
        if (simpleValueParseMode == 0) {
            zzR4.zzZ(dataSet, zzz);
        } else {
            if (simpleValueParseMode == 1) {
                zzCL.zzY(dataSet);
                zzR4.zzZ(dataSet, new Class[]{zz7T.zzo7}, zzz);
                return;
            }
            throw new IllegalStateException();
        }
    }

    private static Document zzZ(String str, boolean z, zzCN zzcn) throws Exception {
        String str2 = C18115b5.CONNECTOR + zzZOZ.zziD().toString("N");
        if (z) {
            str = zzZKN.format("{{ {0}: {1} }}", str2, str);
        }
        try {
            zzC5 zzc5 = new zzC5();
            zzc5.zzYy(str2);
            zzc5.zzBQ();
            boolean z2 = true;
            if (zzcn.getSimpleValueParseMode() != 1) {
                z2 = false;
            }
            zzc5.zzZT(z2);
            zzc5.setPreserveSpaces(zzcn.getPreserveSpaces());
            zzc5.zztL = 0;
            return zzCP.zzZ(str, zzc5);
        } catch (zzCK e) {
            throw new IllegalStateException("There is an error on reading the JSON. " + e.getMessage(), e);
        }
    }

    private static void zzZ(Document document, String str) {
        zzIM zzim = new zzIM();
        zzZ(document, (zzIM<String>) zzim);
        zzZ(document, (zzIM<String>) zzim, str);
    }

    private static void zzZ(Node node, zzIM<String> zzim) {
        boolean z = false;
        for (int i = 0; i < node.getChildNodes().getLength(); i++) {
            Node nodeItem = node.getChildNodes().item(i);
            if (nodeItem.getNodeType() == 10 || nodeItem.getNodeType() == 1) {
                if (!z && node.getNodeType() == 1 && node.getParentNode().getNodeType() == 1) {
                    zzim.add(zzV(node));
                    z = true;
                }
                if (nodeItem.getNodeType() == 1) {
                    zzZ(nodeItem, zzim);
                }
            }
        }
    }

    private static void zzZ(Node node, zzIM<String> zzim, String str) {
        if (node.hasChildNodes()) {
            for (int length = node.getChildNodes().getLength() - 1; length >= 0; length--) {
                Node nodeItem = node.getChildNodes().item(length);
                if (nodeItem.getNodeType() == 1) {
                    zzZ(nodeItem, zzim, str);
                }
            }
            if (node.getNodeType() != 1 || node.hasChildNodes()) {
                return;
            }
            ((Element) node).setAttribute(str, "");
            return;
        }
        if (zzZYD.zzXk(node.getNodeValue()) || !zzim.contains(zzV(node))) {
            return;
        }
        node.getParentNode().removeChild(node);
    }
}
