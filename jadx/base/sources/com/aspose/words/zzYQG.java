package com.aspose.words;

import java.util.ArrayList;
import org.w3c.dom.Text;

/* JADX INFO: loaded from: classes6.dex */
final class zzYQG {
    private ArrayList<org.w3c.dom.Node> zzXNN;

    private zzYQG() {
    }

    private static boolean zzEf(String str) {
        return "text:line-break".equals(str) || "text:s".equals(str) || "text:tab".equals(str);
    }

    private static boolean zzEg(String str) {
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        return (com.aspose.words.internal.zzZKN.zzS(str, "draw", i) || com.aspose.words.internal.zzZKN.zzS(str, "dr3d", i) || com.aspose.words.internal.zzZKN.zzS(str, "svg", i) || com.aspose.words.internal.zzZKN.zzS(str, "office:annotation", i)) ? false : true;
    }

    private static String zzEh(String str) {
        String strZzZ = com.aspose.words.internal.zzZKN.zzZ(com.aspose.words.internal.zzZKN.zzZ(com.aspose.words.internal.zzZKN.zzZ(str, ControlChar.PARAGRAPH_BREAK_CHAR, ControlChar.SPACE_CHAR), '\n', ControlChar.SPACE_CHAR), '\t', ControlChar.SPACE_CHAR);
        if (strZzZ.contains(" ")) {
            strZzZ = new com.aspose.words.internal.zzZNR(" {2,}", 0).zzZS(strZzZ, " ");
        }
        StringBuilder sb = new StringBuilder();
        com.aspose.words.internal.zzZNH.zzU(sb, "<p ");
        com.aspose.words.internal.zzZNH.zzU(sb, "xmlns:text=\"urn:oasis:names:tc:opendocument:xmlns:text:1.0\" ");
        com.aspose.words.internal.zzZNH.zzU(sb, "xmlns:draw=\"urn:oasis:names:tc:opendocument:xmlns:drawing:1.0\" ");
        com.aspose.words.internal.zzZNH.zzU(com.aspose.words.internal.zzZNH.zzU(com.aspose.words.internal.zzZNH.zzU(sb, "xmlns:xlink=\""), "http://www.w3.org/1999/xlink"), "\" ");
        com.aspose.words.internal.zzZNH.zzU(sb, "xmlns:svg=\"urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0\" ");
        com.aspose.words.internal.zzZNH.zzU(sb, ">");
        com.aspose.words.internal.zzZNH.zzU(sb, strZzZ);
        com.aspose.words.internal.zzZNH.zzU(sb, "</p>");
        return sb.toString();
    }

    private String zzEi(String str) throws Exception {
        this.zzXNN = new ArrayList<>();
        org.w3c.dom.Document documentZzN = com.aspose.words.internal.zzZSN.zzN(zzEh(str), true);
        zzY(documentZzN.getFirstChild().getChildNodes());
        zzYv7();
        return com.aspose.words.internal.zzZSN.zzT(documentZzN);
    }

    public static String zzEj(String str) throws Exception {
        return str.length() == 0 ? zzEh(str) : new zzYQG().zzEi(str);
    }

    private void zzSm(boolean z) {
        int size = z ? 0 : this.zzXNN.size() - 1;
        while (this.zzXNN.size() > 0 && com.aspose.words.internal.zzZSN.zzZ(this.zzXNN.get(size), 6)) {
            this.zzXNN.get(size).getParentNode().removeChild(this.zzXNN.get(size));
            this.zzXNN.remove(size);
            if (!z) {
                size--;
            }
        }
    }

    private void zzY(org.w3c.dom.NodeList nodeList) {
        int i = 0;
        while (i < nodeList.getLength()) {
            org.w3c.dom.Node nodeItem = nodeList.item(i);
            if (com.aspose.words.internal.zzZSN.zzZ(nodeItem, 4)) {
                String textContent = nodeItem.getTextContent();
                int i2 = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
                if (com.aspose.words.internal.zzZKN.zzS(textContent, " ", i2)) {
                    Text textCreateTextNode = nodeItem.getOwnerDocument().createTextNode(" ");
                    nodeItem.setTextContent(com.aspose.words.internal.zzZKN.zzU(nodeItem.getTextContent(), ControlChar.SPACE_CHAR));
                    nodeItem.getParentNode().insertBefore(textCreateTextNode, nodeItem);
                    i++;
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<Text>) this.zzXNN, textCreateTextNode);
                }
                com.aspose.words.internal.zzZQG.zzZ(this.zzXNN, nodeItem);
                if (com.aspose.words.internal.zzZKN.zzW(nodeItem.getTextContent(), " ", i2)) {
                    Text textCreateTextNode2 = nodeItem.getOwnerDocument().createTextNode(" ");
                    nodeItem.setTextContent(com.aspose.words.internal.zzZKN.zzT(nodeItem.getTextContent(), ControlChar.SPACE_CHAR));
                    nodeItem.getParentNode().insertBefore(textCreateTextNode2, nodeItem.getNextSibling());
                    i++;
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<Text>) this.zzXNN, textCreateTextNode2);
                }
            }
            if (com.aspose.words.internal.zzZSN.zzZ(nodeItem, 1)) {
                if (zzEf(nodeItem.getNodeName())) {
                    com.aspose.words.internal.zzZQG.zzZ(this.zzXNN, nodeItem);
                }
                if (nodeItem.hasChildNodes() && zzEg(nodeItem.getNodeName())) {
                    zzY(nodeItem.getChildNodes());
                }
            }
            if (com.aspose.words.internal.zzZSN.zzZ(nodeItem, 6)) {
                com.aspose.words.internal.zzZQG.zzZ(this.zzXNN, nodeItem);
            }
            i++;
        }
    }

    private void zzYv7() {
        zzSm(true);
        zzSm(false);
        for (int i = 1; i < this.zzXNN.size(); i++) {
            org.w3c.dom.Node node = this.zzXNN.get(i);
            org.w3c.dom.Node node2 = this.zzXNN.get(i - 1);
            if (com.aspose.words.internal.zzZSN.zzZ(node, 6) && com.aspose.words.internal.zzZSN.zzZ(node2, 6)) {
                node.getParentNode().removeChild(node);
            }
        }
    }
}
