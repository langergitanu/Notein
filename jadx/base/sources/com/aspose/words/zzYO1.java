package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYO1 implements zzZBU {
    private static boolean zzLX;
    private boolean zzXIs;
    private OoxmlSaveOptions zzXIt;

    public zzYO1() {
        this(false);
    }

    private void zzY(DocumentBuilder documentBuilder, StructuredDocumentTag structuredDocumentTag) throws Exception {
        documentBuilder.getCurrentStory().appendChild(structuredDocumentTag);
        documentBuilder.getCurrentParagraph().remove();
        structuredDocumentTag.zzQl(this.zzXIt.zzXoJ && structuredDocumentTag.getXmlMapping().zzX(new zzXYV()));
    }

    private void zzZ(Node node, Document document) throws Exception {
        NodeImporter nodeImporter = new NodeImporter((Document) com.aspose.words.internal.zzZKW.zzZ(node.getDocument(), Document.class), document, 0);
        int nodeType = node.getNodeType();
        if (nodeType == 28) {
            zzZ((StructuredDocumentTag) node, nodeImporter);
        } else if (nodeType == 29) {
            zzZ((StructuredDocumentTagRangeStart) node, nodeImporter);
        }
        zzZ(node, document, nodeImporter);
    }

    private static void zzb(Document document) {
        for (Section section : document.getSections()) {
            for (Paragraph paragraph : section.getBody().getParagraphs()) {
                for (Run run : paragraph.getRuns()) {
                    run.zzZYh().remove(40);
                    run.zzZYh().remove(30);
                }
                paragraph.zzZYj().remove(1580);
                paragraph.zzYp5().remove(40);
                paragraph.zzYp5().remove(30);
            }
            section.zzYvR().remove(2250);
        }
    }

    private String zzc(Document document) throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        try {
            com.aspose.words.internal.zzZOO zzzoo = new com.aspose.words.internal.zzZOO(zzzor);
            try {
                document.zzZ(zzzor, this.zzXIt);
                zzzor.zzH(0L);
                return zzzoo.zziv();
            } finally {
                zzzoo.close();
            }
        } finally {
            zzzor.close();
        }
    }

    @Override // com.aspose.words.zzZBU
    public final String zzZ8(Node node) throws Exception {
        Document document = (Document) com.aspose.words.internal.zzZKW.zzZ(node.getDocument(), Document.class);
        boolean z = document != null;
        Document document2 = z ? (Document) document.getDocument().deepClone(false) : new Document();
        if (z) {
            zzZ(node, document2);
        }
        document2.setWarningCallback(null);
        document2.getBuiltInDocumentProperties().clear();
        document2.getCustomXmlParts().clear();
        if (this.zzXIs) {
            CleanupOptions cleanupOptions = new CleanupOptions();
            cleanupOptions.setUnusedBuiltinStyles(true);
            document2.cleanup(cleanupOptions);
            document2.zzZpV().zzYVj.clear();
            document2.zzY((Theme) null);
            zzYEB zzyeb = new zzYEB();
            com.aspose.words.internal.zzIM zzim = new com.aspose.words.internal.zzIM();
            zzyeb.zzZ(document2, zzim);
            document2.getFontInfos().zzY(zzim);
            document2.getVariables().clear();
            document2.joinRunsWithSameFormatting();
            zzb(document2);
            this.zzXIt.zzYd3();
            this.zzXIt.zzRO(false);
        }
        return zzc(document2);
    }

    public zzYO1(boolean z) {
        this(new OoxmlSaveOptions(24));
        this.zzXIs = z;
    }

    public zzYO1(OoxmlSaveOptions ooxmlSaveOptions) {
        this.zzXIt = ooxmlSaveOptions;
        if (zzLX) {
            ooxmlSaveOptions.zzYZd();
        }
    }

    private static void zzY(DocumentBuilder documentBuilder, NodeImporter nodeImporter, StructuredDocumentTag structuredDocumentTag, StructuredDocumentTag structuredDocumentTag2) {
        Table table = (Table) nodeImporter.importNode((Table) structuredDocumentTag.getAncestor(5), false);
        while (true) {
            Node lastChild = structuredDocumentTag2.getLastChild();
            if (lastChild != null) {
                table.prependChild(lastChild);
            } else {
                documentBuilder.getCurrentStory().prependChild(table);
                return;
            }
        }
    }

    private static void zzZ(Node node, Document document, NodeImporter nodeImporter) throws Exception {
        zzYD zzyd;
        if (!node.isComposite()) {
            return;
        }
        if (node.zzYAY() != 3 && node.zzYAY() != 6) {
            return;
        }
        zzYD zzyd2 = null;
        try {
            zzYD zzyd3 = new zzYD(document);
            try {
                zzyd = new zzYD((Document) node.getDocument());
                try {
                    Paragraph paragraph = (Paragraph) document.getChild(8, 0, true);
                    if (paragraph != null) {
                        Iterator<T> it = ((CompositeNode) node).getChildNodes(10, true).iterator();
                        while (it.hasNext()) {
                            Bookmark bookmark = zzyd.get(((BookmarkEnd) it.next()).getName());
                            if (bookmark != null && zzyd3.get(bookmark.getName()) == null) {
                                BookmarkStart bookmarkStart = (BookmarkStart) nodeImporter.importNode(bookmark.getBookmarkStart(), false);
                                paragraph.prependChild(bookmarkStart);
                                Bookmark bookmark2 = zzyd3.get(bookmarkStart.getName());
                                bookmark2.getBookmarkEnd().zzOY(2);
                                bookmark2.getBookmarkStart().zzOY(2);
                            }
                        }
                    }
                    zzyd3.clear();
                    zzyd.clear();
                } catch (Throwable th) {
                    th = th;
                    zzyd2 = zzyd3;
                    if (zzyd2 != null) {
                        zzyd2.clear();
                    }
                    if (zzyd != null) {
                        zzyd.clear();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                zzyd = null;
            }
        } catch (Throwable th3) {
            th = th3;
            zzyd = null;
        }
    }

    private void zzZ(StructuredDocumentTag structuredDocumentTag, NodeImporter nodeImporter) throws Exception {
        if (structuredDocumentTag.hasChildNodes()) {
            Document document = (Document) com.aspose.words.internal.zzZKW.zzZ(nodeImporter.zzYAh().zzYVI(), Document.class);
            StructuredDocumentTag structuredDocumentTag2 = (StructuredDocumentTag) nodeImporter.importNode(structuredDocumentTag, true);
            Section section = (Section) structuredDocumentTag.getAncestor(2);
            if (section != null) {
                document.getSections().add((Section) nodeImporter.importNode(section, false));
            }
            DocumentBuilder documentBuilder = new DocumentBuilder(document);
            documentBuilder.moveToDocumentEnd();
            int level = structuredDocumentTag2.getLevel();
            if (level == 1) {
                zzZ(documentBuilder, structuredDocumentTag2);
                return;
            }
            if (level == 2) {
                zzY(documentBuilder, structuredDocumentTag2);
            } else if (level == 3) {
                zzY(documentBuilder, nodeImporter, structuredDocumentTag, structuredDocumentTag2);
            } else {
                if (level == 4) {
                    zzZ(documentBuilder, nodeImporter, structuredDocumentTag, structuredDocumentTag2);
                    return;
                }
                throw new IllegalStateException("Unexpected SDT level.");
            }
        }
    }

    private static void zzZ(StructuredDocumentTagRangeStart structuredDocumentTagRangeStart, NodeImporter nodeImporter) {
        if (structuredDocumentTagRangeStart.getParentNode() != null) {
            StructuredDocumentTagRangeEnd rangeEnd = structuredDocumentTagRangeStart.getRangeEnd();
            if (rangeEnd != null) {
                Document document = (Document) com.aspose.words.internal.zzZKW.zzZ(nodeImporter.zzYAh().zzYVI(), Document.class);
                Section parentSection = rangeEnd.getParentNode() != null ? ((Body) rangeEnd.getParentNode()).getParentSection() : null;
                Section parentSection2 = structuredDocumentTagRangeStart.getParentNode() != null ? ((Body) structuredDocumentTagRangeStart.getParentNode()).getParentSection() : null;
                for (Section section = parentSection2; section != parentSection.getNextSibling() && section != null; section = (Section) section.getNextSibling()) {
                    if (com.aspose.words.internal.zzZKO.zzA(section, parentSection2)) {
                        document.ensureMinimum();
                        document.getFirstSection().getBody().remove();
                    }
                    zzZ(section, nodeImporter, structuredDocumentTagRangeStart);
                }
                return;
            }
            throw new IllegalStateException("Structured document tag range end was not found in the document.");
        }
        throw new IllegalStateException("Structured document tag range start is not descendant of a document.");
    }

    private static void zzZ(Section section, NodeImporter nodeImporter, StructuredDocumentTagRangeStart structuredDocumentTagRangeStart) {
        Section lastSection;
        Document document = (Document) nodeImporter.zzYAh().zzYVI();
        boolean zZzA = com.aspose.words.internal.zzZKO.zzA(((Body) structuredDocumentTagRangeStart.getParentNode()).getParentSection(), section);
        boolean zZzA2 = com.aspose.words.internal.zzZKO.zzA(((Body) structuredDocumentTagRangeStart.getRangeEnd().getParentNode()).getParentSection(), section);
        if (zZzA2) {
            lastSection = document.getLastSection();
        } else {
            Section section2 = (Section) nodeImporter.importNode(section, !zZzA);
            document.insertBefore(section2, document.getLastSection());
            lastSection = section2;
        }
        if (zZzA2 || zZzA) {
            Iterator<T> it = section.getChildNodes(4, false).iterator();
            while (it.hasNext()) {
                lastSection.appendChild((HeaderFooter) nodeImporter.importNode((HeaderFooter) it.next(), true));
            }
            lastSection.appendChild(nodeImporter.importNode(section.getBody(), false));
            zzZ(zZzA ? structuredDocumentTagRangeStart.getNextSibling() : section.getBody().getFirstChild(), structuredDocumentTagRangeStart.getRangeEnd(), nodeImporter, lastSection);
        }
    }

    private static void zzZ(Node node, Node node2, NodeImporter nodeImporter, Section section) {
        while (node != null && node != node2) {
            section.getBody().appendChild(nodeImporter.importNode(node, true));
            node = node.getNextSibling();
        }
    }

    private void zzZ(DocumentBuilder documentBuilder, StructuredDocumentTag structuredDocumentTag) throws Exception {
        documentBuilder.insertNode(structuredDocumentTag);
        structuredDocumentTag.zzQl(this.zzXIt.zzXoJ && structuredDocumentTag.getXmlMapping().zzX(new zzXYV()));
    }

    private static void zzZ(DocumentBuilder documentBuilder, NodeImporter nodeImporter, StructuredDocumentTag structuredDocumentTag, StructuredDocumentTag structuredDocumentTag2) {
        Cell cell = (Cell) structuredDocumentTag2.getChild(7, 0, true);
        if (com.aspose.words.internal.zzZKO.zzA(cell, cell.getParentNode().getLastChild())) {
            while (true) {
                Node lastChild = cell.getLastChild();
                if (lastChild != null) {
                    documentBuilder.getCurrentStory().prependChild(lastChild);
                } else {
                    documentBuilder.getCurrentParagraph().remove();
                    return;
                }
            }
        } else {
            Row row = (Row) structuredDocumentTag.getParentNode();
            Row row2 = (Row) nodeImporter.importNode(structuredDocumentTag.getParentNode(), false);
            Table table = (Table) nodeImporter.importNode(row.getParentTable(), false);
            table.appendChild(row2);
            while (true) {
                Node lastChild2 = structuredDocumentTag2.getLastChild();
                if (lastChild2 != null) {
                    row2.prependChild(lastChild2);
                } else {
                    documentBuilder.getCurrentStory().prependChild(table);
                    return;
                }
            }
        }
    }
}
