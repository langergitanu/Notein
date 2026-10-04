package com.aspose.words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Text;

/* JADX INFO: loaded from: classes6.dex */
final class zzY05 {
    private static boolean zzJ(org.w3c.dom.Node node) {
        do {
            node = node.getLastChild();
            if (node == null) {
                return false;
            }
            if (com.aspose.words.internal.zzZSN.zzZ(node, 6)) {
                return true;
            }
        } while (com.aspose.words.internal.zzZSN.zzZ(node, 1));
        return false;
    }

    private static String zzK(org.w3c.dom.Node node) {
        if (com.aspose.words.internal.zzZSN.zzZ(node, 6)) {
            return "";
        }
        if (com.aspose.words.internal.zzZSN.zzZ(node, 4)) {
            return ((Text) node).getData();
        }
        if (com.aspose.words.internal.zzZSN.zzZ(node, 1)) {
            return zzZ((Element) node);
        }
        if (com.aspose.words.internal.zzZSN.zzZ(node, 10)) {
            return ((Attr) node).getNodeValue();
        }
        com.aspose.words.internal.zzZKN.format("Unexpected node type: {0}.", Short.valueOf(node.getNodeType()));
        return "";
    }

    public static String zzZ(org.w3c.dom.Document document, String str, String str2) throws Exception {
        try {
            ArrayList<org.w3c.dom.Node> arrayListZzZ = com.aspose.words.internal.zzZSN.zzZ(document.getDocumentElement(), str, zzyt(str2));
            StringBuilder sb = new StringBuilder();
            Iterator<org.w3c.dom.Node> it = arrayListZzZ.iterator();
            while (it.hasNext()) {
                com.aspose.words.internal.zzZNH.zzU(sb, com.aspose.words.internal.zzZKN.zzTX(zzK(it.next())));
            }
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    private static Map<String, String> zzyt(String str) throws Exception {
        if (com.aspose.words.internal.zzZKN.zzU3(str)) {
            return null;
        }
        try {
            org.w3c.dom.Document documentZzN = com.aspose.words.internal.zzZSN.zzN(com.aspose.words.internal.zzZKN.format("<root {0} />", str), false);
            documentZzN.getDocumentElement();
            NamedNodeMap attributes = documentZzN.getDocumentElement().getAttributes();
            if (attributes.getLength() == 0) {
                return null;
            }
            HashMap map = new HashMap(attributes.getLength());
            for (int i = 0; i < attributes.getLength(); i++) {
                com.aspose.words.internal.zzZQF.zzY(map, attributes.item(i).getLocalName(), attributes.item(i).getNodeValue());
            }
            return map;
        } catch (Exception unused) {
            return null;
        }
    }

    private static String zzZ(Element element) {
        StringBuilder sb = new StringBuilder();
        Element element2 = null;
        for (int i = 0; i < element.getChildNodes().getLength(); i++) {
            org.w3c.dom.Node nodeItem = element.getChildNodes().item(i);
            String strZzK = zzK(nodeItem);
            if (!com.aspose.words.internal.zzZKN.zzU3(strZzK)) {
                if (element2 != null) {
                    if (com.aspose.words.internal.zzZSN.zzZ(nodeItem, 1)) {
                        sb.append(ControlChar.SPACE_CHAR);
                    }
                    if (com.aspose.words.internal.zzZSN.zzZ(nodeItem, 4) && zzJ(element2)) {
                        sb.append(ControlChar.SPACE_CHAR);
                    }
                }
                com.aspose.words.internal.zzZNH.zzU(sb, strZzK);
                element2 = (Element) com.aspose.words.internal.zzZKW.zzZ(nodeItem, Element.class);
            }
        }
        return sb.toString();
    }
}
