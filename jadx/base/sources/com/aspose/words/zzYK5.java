package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYK5 {
    private static com.aspose.words.internal.zzZQC<Node> zzX8(Node node) {
        com.aspose.words.internal.zzZQC<Node> zzzqc = new com.aspose.words.internal.zzZQC<>();
        while (node != null && node.getNodeType() != 1 && node.getNodeType() != 31) {
            zzzqc.push(node);
            if (node.zzYAY() == 3) {
                while (node != null && node.getNodeType() != 3 && node.getNodeType() != 4) {
                    node = node.getParentNode();
                }
            } else {
                node = node.getParentNode();
            }
        }
        return zzzqc;
    }

    private static Document zzX9(Node node) throws Exception {
        node.getDocument();
        int nodeType = node.getDocument().getNodeType();
        if (nodeType == 1) {
            Document document = (Document) node.getDocument().deepClone(false);
            zzZ(document, node);
            return document;
        }
        if (nodeType != 31) {
            return null;
        }
        Document documentZzZ = zzZ((GlossaryDocument) node.getDocument(), false);
        zzZ(documentZzZ.getGlossaryDocument(), node);
        return documentZzZ;
    }

    public static Document zzZ(Range range) throws Exception {
        if (range.getNode() == null) {
            throw new UnsupportedOperationException("Not yet supported. Initially range was attached to a single node, but in the future it may be changed.");
        }
        Node node = range.getNode();
        switch (node.getNodeType()) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
                return zzX9(node);
            case 1:
                return (Document) node.deepClone(true);
            case 11:
            case 12:
            case 29:
            case 30:
            default:
                throw new IllegalArgumentException();
            case 31:
                return zzZ((GlossaryDocument) node, true);
        }
    }

    private static Document zzZ(GlossaryDocument glossaryDocument, boolean z) throws Exception {
        Document document = new Document(1);
        document.setGlossaryDocument((GlossaryDocument) glossaryDocument.deepClone(z));
        return document;
    }

    private static void zzZ(DocumentBase documentBase, Node node) throws Exception {
        node.getDocument();
        com.aspose.words.internal.zzZQC<Node> zzzqcZzX8 = zzX8(node);
        CompositeNode compositeNode = documentBase;
        while (zzzqcZzX8.size() != 0) {
            Node nodePop = zzzqcZzX8.pop();
            Node nodeZzZ = zzZ(documentBase, nodePop, nodePop == node, compositeNode);
            compositeNode = nodeZzZ.isComposite() ? (CompositeNode) nodeZzZ : null;
        }
    }

    private static Node zzZ(DocumentBase documentBase, Node node, boolean z, CompositeNode compositeNode) throws Exception {
        if (node.getNodeType() == 25) {
            return zzZ(documentBase, (FormField) node, compositeNode);
        }
        Node nodeImportNode = documentBase.importNode(node, z, 1);
        compositeNode.appendChild(nodeImportNode);
        return nodeImportNode;
    }

    private static Node zzZ(DocumentBase documentBase, FormField formField, CompositeNode compositeNode) throws Exception {
        Node start = formField.getField().getStart();
        BookmarkStart bookmarkStart = formField.getBookmarkStart();
        Node node = null;
        BookmarkEnd bookmarkEnd = bookmarkStart != null ? new Bookmark(bookmarkStart).getBookmarkEnd() : null;
        boolean z = false;
        boolean z2 = false;
        while (start != null && start.getNodeType() != 24) {
            Node nodeImportNode = documentBase.importNode(start, false);
            compositeNode.appendChild(nodeImportNode);
            if (start == formField) {
                node = nodeImportNode;
            }
            z = z || start == bookmarkStart;
            z2 = z2 || start == bookmarkEnd;
            start = start.getNextSibling();
        }
        if (start != null) {
            compositeNode.appendChild(documentBase.importNode(start, true));
        }
        if (bookmarkStart != null && !z) {
            Node nodeImportNode2 = documentBase.importNode(bookmarkStart, false);
            if (compositeNode.getParentNode().zzT(nodeImportNode2)) {
                compositeNode.zzYC(nodeImportNode2);
            } else {
                compositeNode.insertBefore(nodeImportNode2, node);
            }
        }
        if (bookmarkEnd != null && !z2) {
            compositeNode.appendChild(documentBase.importNode(bookmarkEnd, false));
        }
        return node;
    }
}
