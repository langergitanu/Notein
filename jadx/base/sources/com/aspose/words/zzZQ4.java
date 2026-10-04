package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZQ4 {
    private zzZB6 zzYDK;
    private Field zzZz7;

    public static class zzZ implements zzZA5 {
        private com.aspose.words.internal.zzZYG<Node> zzYDJ = new com.aspose.words.internal.zzZYG<>();
        private com.aspose.words.internal.zzZYG<Node> zzYDI = new com.aspose.words.internal.zzZYG<>();

        @Override // com.aspose.words.zzZA5
        public final void zzW(Node node, Node node2) {
            if (node2.getNodeType() == 9) {
                this.zzYDJ.set(((BookmarkStart) node2).getName(), node2);
            } else if (node2.getNodeType() == 10) {
                this.zzYDI.set(((BookmarkEnd) node2).getName(), node2);
            }
        }

        public final void zzZdB() {
            for (String str : this.zzYDJ.zzxs()) {
                if (this.zzYDI.containsKey(str)) {
                    this.zzYDI.zzXn(str);
                } else {
                    this.zzYDJ.get(str).remove();
                }
            }
            Iterator<Node> it = this.zzYDI.zzCJ().iterator();
            while (it.hasNext()) {
                it.next().remove();
            }
        }
    }

    private zzZQ4(Field field, zzZB6 zzzb6) {
        this.zzZz7 = field;
        this.zzYDK = zzzb6;
    }

    private void zzDj(int i) {
        ((Section) this.zzZz7.getEnd().getAncestor(2)).getPageSetup().setSectionStart(i);
    }

    private String zzLW(String str) throws Exception {
        return zzZdG() ? com.aspose.words.internal.zzZKN.format("Error! Word encountered an error while loading the XML file {0}.", str) : "Error! Not a valid filename.";
    }

    private zzZP6 zzLX(String str) throws Exception {
        return new zzZP2(this.zzZz7, zzLW(str));
    }

    private zzZP6 zzQ(com.aspose.words.internal.zzZOP zzzop, String str) throws Exception {
        return zzW(zzZg(zzzop), str);
    }

    private zzZP6 zzR(com.aspose.words.internal.zzZOP zzzop, String str) throws Exception {
        com.aspose.words.internal.zzZS0 zzzs0 = new com.aspose.words.internal.zzZS0();
        zzzs0.zzR(zzZdH());
        com.aspose.words.internal.zzZOP zzzopZzZR = zzzs0.zzZR(zzzop);
        try {
            return zzQ(zzzopZzZR, str);
        } finally {
            zzzopZzZR.close();
        }
    }

    private static boolean zzS(com.aspose.words.internal.zzZOP zzzop, String str) throws Exception {
        try {
            com.aspose.words.internal.zzZOO zzzoo = new com.aspose.words.internal.zzZOO(zzzop);
            for (int i = 0; i < str.length(); i++) {
                if (zzzoo.read() != str.charAt(i)) {
                    return false;
                }
            }
            zzzop.zzH(0L);
            return true;
        } finally {
            zzzop.zzH(0L);
        }
    }

    private static Document zzT(com.aspose.words.internal.zzZOP zzzop, String str) throws Exception {
        return (!com.aspose.words.internal.zzZKN.zzU3(str) || zzS(zzzop, "<?xml")) ? "html".equals(str) ? zzZi(zzzop) : zzZj(zzzop) : zzZk(zzzop);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzZP6 zzU(Field field) throws Exception {
        return new zzZQ4(field, (zzZB6) field).zzZg8();
    }

    private zzZP6 zzW(Document document, String str) throws Exception {
        zzYWB zzywbZz9l;
        zzZ zzz;
        if (document == null) {
            return new zzZP2(this.zzZz7, "Cannot include document of this type at the moment.");
        }
        int sectionStart = ((Section) this.zzZz7.getEnd().getAncestor(2)).getPageSetup().getSectionStart();
        com.aspose.words.internal.zzZOY zzzoyZzZbn = this.zzZz7.zzZgn().zzZbn();
        try {
            if (com.aspose.words.internal.zzZYD.zzXk(this.zzYDK.getBookmarkName())) {
                Bookmark bookmark = document.getRange().getBookmarks().get(this.zzYDK.getBookmarkName());
                if (bookmark == null) {
                    zzZP2 zzzp2 = new zzZP2(this.zzZz7, "Error! Bookmark not defined.");
                    zzzoyZzZbn.dispose();
                    return zzzp2;
                }
                zzywbZz9l = bookmark.zz9l();
                zzz = new zzZ();
            } else {
                Node lastChild = document.getLastSection().getBody().getLastChild();
                Node firstChild = document.getFirstSection().getBody().getFirstChild();
                z = document.getFirstSection().getBody().zzZYr().getNodeType() == 8;
                zzywbZz9l = new zzYWB(firstChild, lastChild);
                zzz = null;
            }
            zzYWJ.zzZ(zzywbZz9l, this.zzZz7.getEnd(), new zzZSB(document, this.zzZz7.getStart().zzYBb(), this.zzZz7.zzZgo().zzZaM().zzJy(str)), zzz, 13);
            if (zzz != null) {
                zzz.zzZdB();
            }
            zzzoyZzZbn.dispose();
            if (z) {
                zzZdC();
            }
            zzZ(zzywbZz9l, sectionStart);
            if (this.zzYDK.getLockFields()) {
                zzZdD();
            }
            return new zzZP3(this.zzZz7);
        } catch (Throwable th) {
            zzzoyZzZbn.dispose();
            throw th;
        }
    }

    private static void zzZ(DocumentBuilder documentBuilder, org.w3c.dom.Node node, int i) {
        while (node.hasChildNodes()) {
            if (node.getChildNodes().getLength() != 1 || !com.aspose.words.internal.zzZSN.zzZ(node.getFirstChild(), 4)) {
                double d = i * 18;
                documentBuilder.getCurrentParagraph().getParagraphFormat().setLeftIndent(d);
                documentBuilder.writeln();
                for (int i2 = 0; i2 < node.getChildNodes().getLength(); i2++) {
                    org.w3c.dom.Node nodeItem = node.getChildNodes().item(i2);
                    if (!com.aspose.words.internal.zzZSN.zzZ(nodeItem, 6)) {
                        zzZ(documentBuilder, nodeItem, i + 1);
                    }
                }
                documentBuilder.getCurrentParagraph().getParagraphFormat().setLeftIndent(d);
                documentBuilder.writeln();
                return;
            }
            node = node.getFirstChild();
        }
        documentBuilder.getCurrentParagraph().getParagraphFormat().setLeftIndent(i * 18);
        documentBuilder.writeln(com.aspose.words.internal.zzZKN.zzTX(node.getNodeValue()));
    }

    private void zzZdC() {
        Paragraph parentParagraph = this.zzZz7.getSeparator().getParentParagraph();
        Paragraph paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(parentParagraph.zzYB4(), Paragraph.class);
        if (paragraph != null) {
            Node firstChild = paragraph.getFirstChild();
            Node firstChild2 = parentParagraph.getFirstChild();
            while (firstChild2 != null) {
                Node nextSibling = firstChild2.getNextSibling();
                paragraph.insertBefore(firstChild2, firstChild);
                firstChild2 = nextSibling;
            }
            paragraph.zzZ(parentParagraph.getNextSibling(), paragraph, firstChild);
            parentParagraph.remove();
        }
    }

    private void zzZdD() {
        for (Node node : this.zzZz7.zzZgF()) {
            if (node.getNodeType() == 22) {
                ((FieldStart) node).isLocked(true);
            }
        }
    }

    private String zzZdE() throws Exception {
        zzZR8 zzzr8ZzDH = this.zzZz7.zzZgq().zzDH(this.zzYDK.getSourceFullNameArgumentIndex());
        return (zzzr8ZzDH == null || !zzzr8ZzDH.zzZgi()) ? this.zzYDK.getSourceFullName() : com.aspose.words.internal.zzZKN.zzS(zzzr8ZzDH.getText(), '\"').replace("\\\\", "\\");
    }

    private boolean zzZdF() {
        return !com.aspose.words.internal.zzZKN.zzU3(this.zzYDK.getXslTransformation());
    }

    private boolean zzZdG() throws Exception {
        return !com.aspose.words.internal.zzZKN.zzU3(this.zzYDK.getXPath());
    }

    private com.aspose.words.internal.zzZOP zzZdH() throws Exception {
        try {
            return zzZOO.zzY(this.zzYDK.getXslTransformation(), this.zzZz7.getStart().getDocument().getResourceLoadingCallback());
        } catch (Exception unused) {
            return null;
        }
    }

    private static Document zzZg(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        int loadFormat = FileFormatUtil.zzZb(zzzop).getLoadFormat();
        if (loadFormat == 255) {
            return null;
        }
        return loadFormat != 50 ? loadFormat != 62 ? loadFormat != 65 ? new Document(zzzop, null, false) : zzZj(zzzop) : zzZk(zzzop) : zzZi(zzzop);
    }

    private zzZP6 zzZg8() throws Exception {
        zzZP6 zzzp6ZzZh;
        String strZzZdE = zzZdE();
        try {
            com.aspose.words.internal.zzZOP zzzopZzY = zzZOO.zzY(strZzZdE, this.zzZz7.getStart().getDocument().getResourceLoadingCallback());
            try {
                if (zzzopZzY == null) {
                    zzzp6ZzZh = zzLX(strZzZdE);
                    return zzzp6ZzZh;
                }
                zzzp6ZzZh = zzZdG() ? zzZh(zzzopZzY) : zzZdF() ? zzR(zzzopZzY, strZzZdE) : zzU(zzzopZzY, strZzZdE);
                return zzzp6ZzZh;
            } finally {
                if (zzzopZzY != null) {
                    zzzopZzY.close();
                }
            }
        } catch (Exception unused) {
            return zzLX(strZzZdE);
        }
    }

    private zzZP6 zzZh(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        return new zzZP5(this.zzZz7, zzY05.zzZ(com.aspose.words.internal.zzZSN.zzX(zzzop, true), this.zzYDK.getXPath(), this.zzYDK.getNamespaceMappings()));
    }

    private static Document zzZi(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        HtmlLoadOptions htmlLoadOptions = new HtmlLoadOptions();
        htmlLoadOptions.setLoadFormat(50);
        return new Document(zzzop, htmlLoadOptions, false);
    }

    private static Document zzZj(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        org.w3c.dom.Document documentZzX = com.aspose.words.internal.zzZSN.zzX(zzzop, false);
        DocumentBuilder documentBuilder = new DocumentBuilder(new Document(1));
        zzZ(documentBuilder, documentZzX.getDocumentElement(), 0);
        return documentBuilder.getDocument();
    }

    private static Document zzZk(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        TxtLoadOptions txtLoadOptions = new TxtLoadOptions();
        txtLoadOptions.setLeadingSpacesOptions(2);
        txtLoadOptions.setLoadFormat(62);
        return new Document(zzzop, txtLoadOptions, false);
    }

    private static Document zzZl(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        String strZziv = new com.aspose.words.internal.zzZOO(zzzop).zziv();
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        try {
            com.aspose.words.internal.zzZON zzzon = new com.aspose.words.internal.zzZON(zzzor);
            zzzon.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?><html>");
            zzzon.write(strZziv);
            zzzon.write("</html>");
            zzzon.flush();
            zzzor.zzH(0L);
            return zzZi(zzzor);
        } finally {
            zzzor.close();
        }
    }

    private Document zzZm(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        int loadFormat = FileFormatUtil.zzZb(zzzop).getLoadFormat();
        if (loadFormat == 255) {
            return null;
        }
        String textConverter = this.zzYDK.getTextConverter();
        if (textConverter != null) {
            textConverter = textConverter.toLowerCase();
        }
        return loadFormat != 50 ? loadFormat != 62 ? loadFormat != 65 ? new Document(zzzop, null, false) : zzT(zzzop, textConverter) : "html".equals(textConverter) ? zzZl(zzzop) : zzZk(zzzop) : (!"xml".equals(textConverter) || zzS(zzzop, "<!doctype")) ? zzZi(zzzop) : zzZj(zzzop);
    }

    private zzZP6 zzU(com.aspose.words.internal.zzZOP zzzop, String str) throws Exception {
        return zzW(zzZm(zzzop), str);
    }

    private void zzU(zzYWB zzywb) {
        ((Section) this.zzZz7.getEnd().getAncestor(2)).zzY((zzYCZ) ((Section) zzywb.zzYA1().getNode().getAncestor(2)).zzYvR().zzbn());
    }

    private static boolean zzT(Node node, int i) {
        while (node.getNodeType() != 2) {
            if (!node.zz9I() && (!node.isComposite() || node.zzYB9() != null)) {
                return false;
            }
            node = node.getParentNode();
        }
        return true;
    }

    private static boolean zzS(Node node, int i) {
        while (node.getNodeType() != 2) {
            if (!node.zzYB3() && (!node.isComposite() || node.zzYB4() != null)) {
                return false;
            }
            node = node.getParentNode();
        }
        return true;
    }

    private void zzZ(zzYWB zzywb, int i) {
        boolean zZzT = zzT(this.zzZz7.getStart(), 2);
        boolean zZzS = zzS(this.zzZz7.getEnd(), 2);
        if (zZzT && zZzS) {
            zzU(zzywb);
        } else {
            zzDj(i);
        }
    }
}
