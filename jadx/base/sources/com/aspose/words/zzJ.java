package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzJ {
    private static Node zzW(Node node, boolean z) {
        Node node2 = null;
        while (node != null && zzYVU.zztq(node.getNodeType())) {
            if (node.getNodeType() == 29 || node.getNodeType() == 30) {
                node2 = node;
            }
            node = z ? node.getNextSibling() : node.getPreviousSibling();
        }
        return node2;
    }

    private static zzYK6 zzX(Node node, boolean z) {
        boolean z2;
        Node node2;
        Node nodeZzW;
        StructuredDocumentTag structuredDocumentTag = (StructuredDocumentTag) com.aspose.words.internal.zzZKW.zzZ(node.zzYB9(), StructuredDocumentTag.class);
        if (structuredDocumentTag == null && (nodeZzW = zzW(node.getPreviousSibling(), false)) != null) {
            return zzZ(nodeZzW, z, nodeZzW.getNodeType() == 29, node, nodeZzW.getPreviousSibling());
        }
        if (structuredDocumentTag == null && node.getParentNode() != null && node.getParentNode().getNodeType() == 28) {
            structuredDocumentTag = (StructuredDocumentTag) node.getParentNode();
            z2 = true;
        } else {
            z2 = false;
        }
        if (structuredDocumentTag == null) {
            zzZYT zzzyt = new zzZYT(node);
            do {
                if (zzzyt.zzZ(node.getDocument(), false, true, false, false, false)) {
                    node2 = zzzyt.getNode();
                    if (node2.getNodeType() == 28) {
                        structuredDocumentTag = (StructuredDocumentTag) node2;
                    } else {
                        CompositeNode compositeNode = (CompositeNode) com.aspose.words.internal.zzZKW.zzZ(node2, CompositeNode.class);
                        if (compositeNode != null && !com.aspose.words.internal.zzZKN.equals(compositeNode.zzZYp(), "")) {
                            return compositeNode.getLastChild() != null ? new zzYK6(compositeNode.getLastChild(), !z) : new zzYK6(compositeNode, z);
                        }
                    }
                }
            } while (!(node2 instanceof Inline));
            boolean z3 = node2.getText().length() == 1;
            if (z) {
                z = z3;
            } else if (z3) {
                z = false;
            }
            return new zzYK6(node2, z);
        }
        if (structuredDocumentTag != null) {
            return zzZ(structuredDocumentTag, z, z2, node);
        }
        return null;
    }

    private static zzYK6 zzY(Node node, boolean z) {
        Node nodeZzW;
        StructuredDocumentTag structuredDocumentTag = (StructuredDocumentTag) com.aspose.words.internal.zzZKW.zzZ(node.zzYB4(), StructuredDocumentTag.class);
        boolean z2 = true;
        if (structuredDocumentTag == null && (nodeZzW = zzW(node.getNextSibling(), true)) != null) {
            return zzZ(nodeZzW, z, nodeZzW.getNodeType() == 29, node, nodeZzW.getNextSibling());
        }
        if (structuredDocumentTag == null) {
            structuredDocumentTag = (StructuredDocumentTag) node.getAncestor(28);
            z2 = structuredDocumentTag == null;
        }
        if (structuredDocumentTag == null) {
            zzZYT zzzyt = new zzZYT(node);
            while (true) {
                if (!zzzyt.zzZ(node.getDocument(), true, true, false, false, false)) {
                    break;
                }
                if (zzzyt.getNode().getNodeType() == 28) {
                    structuredDocumentTag = (StructuredDocumentTag) zzzyt.getNode();
                    break;
                }
            }
        }
        if (structuredDocumentTag != null) {
            return zzZ(structuredDocumentTag, z, z2, node);
        }
        return null;
    }

    public static zzYK6 zzZ(Node node, boolean z) {
        zzZCT zzzct = (zzZCT) com.aspose.words.internal.zzZKW.zzZ(node, zzZCT.class);
        if (zzzct == null) {
            return new zzYK6(node, false);
        }
        int displacedByCustomXml = zzzct.getDisplacedByCustomXml();
        return displacedByCustomXml != 0 ? displacedByCustomXml != 1 ? new zzYK6(node, false) : zzX(node, z) : zzY(node, z);
    }

    private static zzYK6 zzZ(StructuredDocumentTag structuredDocumentTag, boolean z, boolean z2, Node node) {
        return zzZ(structuredDocumentTag, z, z2, node, zzZ((CompositeNode) structuredDocumentTag, z2));
    }

    public static Node zzZ(CompositeNode compositeNode, boolean z) {
        while (true) {
            Node nodeZzZYr = z ? compositeNode.zzZYr() : compositeNode.zzZYq();
            if (nodeZzZYr == null) {
                return compositeNode.hasChildNodes() ? z ? compositeNode.getFirstChild() : compositeNode.getLastChild() : compositeNode;
            }
            if (!nodeZzZYr.isComposite() || nodeZzZYr.zzYAY() == 6) {
                break;
            }
            compositeNode = (CompositeNode) nodeZzZYr;
        }
        return z ? compositeNode.getFirstChild() : compositeNode.getLastChild();
    }

    private static zzYK6 zzZ(Node node, boolean z, boolean z2, Node node2, Node node3) {
        if (node3 == null || (zzYVU.zztq(node3.getNodeType()) && node3.getParentNode() == node2.getParentNode() && (!z ? node3.zzYB9() == node2.zzYB9() : node3.zzYB4() == node2.zzYB4()))) {
            node3 = node2;
        }
        return new zzYK6(node3, node3 != node2 && (!z ? z2 || (node3.isComposite() && !((CompositeNode) node3).hasChildNodes()) : !(z2 || node3.isComposite())), node, node2);
    }
}
