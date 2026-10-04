package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYWA extends zzYWI {
    private static Shading zzXV3 = new Shading();

    private zzYWA(Node node, Node node2) {
        super(new zzYWB(node, node2), true);
    }

    private static boolean zzB(Node node, boolean z) {
        Node nodeZzSI = node.zzSI(!z);
        while (nodeZzSI != null) {
            if (!(nodeZzSI.getNodeType() == 21 ? com.aspose.words.internal.zzZKN.zzU3(nodeZzSI.getText()) : zzYVU.zzXW(nodeZzSI))) {
                return false;
            }
            nodeZzSI = nodeZzSI.zzSI(!z);
        }
        return zzYa(node.getParentNode());
    }

    private static Node zzW(Node node, Node node2, boolean z) {
        if (node == node2) {
            return node;
        }
        while (zzB(node, z)) {
            if (node2.zzYF(node.getParentNode())) {
                return zzZ(node2, z ^ true, node.getParentNode()) ? node.getParentNode() : node;
            }
            node = node.getParentNode();
        }
        return node;
    }

    private static void zzY(Node node, Node node2, com.aspose.words.internal.zzPV zzpv) {
        Shape shapeZzu = zzu(node, node2);
        if (shapeZzu != null) {
            zzZ(shapeZzu, zzpv);
        } else if (node == node2) {
            zzZ(node, zzpv);
        } else {
            new zzYWA(node, node2).zzZU(zzpv);
        }
    }

    private static Shading zzY7(Node node) {
        int nodeType = node.getNodeType();
        return nodeType != 7 ? nodeType != 8 ? ((Inline) node).getFont().getShading() : ((Paragraph) node).getParagraphFormat().getShading() : ((Cell) node).getCellFormat().getShading();
    }

    private static Object zzY8(Node node) {
        int nodeType = node.getNodeType();
        return nodeType != 7 ? nodeType != 8 ? ((Inline) node).zzZYh().zzPk(StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_6) : ((Paragraph) node).zzZYj().zzPk(1460) : ((Cell) node).zz6G().zzPk(3170);
    }

    private static boolean zzY9(Node node) {
        Object objZzY8 = zzY8(node);
        return (objZzY8 == null || zzXV3.equals((Shading) objZzY8)) ? false : true;
    }

    private static boolean zzYa(Node node) {
        int nodeType = node.getNodeType();
        if (nodeType == 7 || nodeType == 8) {
            return true;
        }
        return node instanceof Inline;
    }

    private boolean zzYzV() {
        if (next() == zzZga().zzYA1().getNode() || !next().isComposite()) {
            return false;
        }
        if (zzZga().zzYA1().getNode().zzYF(next())) {
            return true;
        }
        int nodeType = next().getNodeType();
        return (nodeType == 7 || nodeType == 8 || zzYVU.zzXO(next())) ? false : true;
    }

    private boolean zzYzW() {
        if (next().isComposite()) {
            return zzZga().zzYA2().getNode().zzYF(next()) || zzZga().zzYA1().getNode().zzYF(next());
        }
        return false;
    }

    public static void zzZ(Node node, Node node2, com.aspose.words.internal.zzPV zzpv) {
        node.zzYF(node2);
        node2.zzYF(node);
        Node nodeZzW = zzW(node, node2, true);
        Node nodeZzW2 = node2.zzYF(nodeZzW) ? nodeZzW : zzW(node2, node, false);
        if (nodeZzW == nodeZzW2) {
            while (zzB(nodeZzW, true) && zzB(nodeZzW, false)) {
                nodeZzW = nodeZzW.getParentNode();
                nodeZzW2 = nodeZzW;
            }
        }
        zzY(nodeZzW, nodeZzW2, zzpv);
    }

    private void zzZU(com.aspose.words.internal.zzPV zzpv) {
        boolean zZzYzV = false;
        while (zzSG(zZzYzV)) {
            if (!zzYzW()) {
                zzZ(next(), zzpv);
            }
            zZzYzV = zzYzV();
        }
    }

    private static Shape zzu(Node node, Node node2) {
        if (node.getParentNode() != node2.getParentNode() || node.getParentNode().getNodeType() != 18) {
            return null;
        }
        Shape shape = (Shape) node.getParentNode();
        if (shape.getFilled()) {
            return null;
        }
        return shape;
    }

    private static boolean zzZ(Node node, boolean z, Node node2) {
        while (node != node2) {
            if (!zzB(node, z)) {
                return false;
            }
            node = node.getParentNode();
        }
        return true;
    }

    private static void zzZ(Shape shape, com.aspose.words.internal.zzPV zzpv) {
        if (shape.getMarkupLanguage() == 0) {
            ((zzZC0) shape.zzY9i()).setFill(new zz1C(zzBW.zzj(zzpv)));
            return;
        }
        shape.zzY9J().zzIc(0);
        shape.zzY9J().setOn(true);
        shape.zzY9J().zzm(zzpv);
    }

    private static void zzZ(Node node, com.aspose.words.internal.zzPV zzpv) {
        if (!zzYa(node) || zzY9(node)) {
            return;
        }
        zzY7(node).zzZK(zzpv);
    }
}
