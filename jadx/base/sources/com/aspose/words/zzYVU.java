package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYVU {
    public static Node zzA(Node node, boolean z) {
        Node nodeZzZYt = null;
        while (node != null && nodeZzZYt == null) {
            if (zzXM(node)) {
                CompositeNode compositeNode = (CompositeNode) node;
                nodeZzZYt = z ? compositeNode.zzZYt() : compositeNode.zzZYv();
            } else {
                nodeZzZYt = (!z || node.isComposite()) ? node : null;
            }
            node = node.getNextSibling();
        }
        return nodeZzZYt;
    }

    public static Node zzI(Node node, int i) {
        while (i > 0 && node != null) {
            i--;
            node = node.getParentNode();
        }
        return node;
    }

    public static boolean zzJ(Node node, int i) {
        return node != zzK(node, i);
    }

    public static Node zzK(Node node, int i) {
        CompositeNode ancestor = node.getAncestor(i);
        return ancestor != null ? ancestor : node;
    }

    public static Paragraph zzXE(Node node) {
        return zzy(node, false);
    }

    public static Paragraph zzXF(Node node) {
        return zzy(node, true);
    }

    public static float zzXG(Node node) {
        if (((Shape) node.getAncestor(18)) != null) {
            return zzY61.zzX(r0);
        }
        Paragraph paragraph = (Paragraph) node.getAncestor(8);
        if (paragraph == null) {
            return 0.0f;
        }
        int iZzYpr = paragraph.zzZYj().zzYpr();
        if (!FrameFormat.zzY(paragraph.zzZYj())) {
            Cell cell = (Cell) node.getAncestor(7);
            if (cell == null) {
                return 0.0f;
            }
            iZzYpr = cell.zz6G().getOrientation();
        }
        if (iZzYpr != 1) {
            return iZzYpr != 3 ? 0.0f : 270.0f;
        }
        return 90.0f;
    }

    public static int zzXH(Node node) {
        int i = 0;
        while (node != null) {
            node = node.getParentNode();
            i++;
        }
        return i;
    }

    public static int zzXI(Node node) {
        int i = 0;
        if (node.getParentNode() == null) {
            return 0;
        }
        for (Node firstChild = node.getParentNode().getFirstChild(); firstChild != node; firstChild = firstChild.getNextSibling()) {
            i++;
        }
        return i;
    }

    public static Table zzXJ(Node node) {
        if (node.getNodeType() != 5) {
            node = (Table) node.zztB(5);
        }
        return (Table) node;
    }

    public static boolean zzXK(Node node) {
        return node != null && node.getNodeType() == 35;
    }

    public static boolean zzXL(Node node) {
        if (node != null) {
            return node.getNodeType() == 28 || node.getNodeType() == 29 || node.getNodeType() == 30;
        }
        return false;
    }

    public static boolean zzXM(Node node) {
        return node != null && zzto(node.getNodeType());
    }

    public static boolean zzXN(Node node) {
        int nodeType = node.getNodeType();
        return nodeType == 17 || nodeType == 18;
    }

    public static boolean zzXO(Node node) {
        switch (node.getNodeType()) {
            case 28:
                if (((StructuredDocumentTag) node).getLevel() == 1) {
                }
                break;
            case 37:
                if ((node instanceof zzYD5) || (node instanceof zzYD6)) {
                }
                break;
        }
        return false;
    }

    public static boolean zzXP(Node node) {
        int nodeType = node.getNodeType();
        if (nodeType != 7) {
            if (nodeType == 28) {
                return ((StructuredDocumentTag) node).getLevel() == 4;
            }
            if (nodeType != 33 && nodeType != 34) {
                switch (nodeType) {
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                        break;
                    default:
                        return false;
                }
            }
        }
        return true;
    }

    public static boolean zzXQ(Node node) {
        int nodeType = node.getNodeType();
        if (nodeType != 6) {
            if (nodeType == 28) {
                return ((StructuredDocumentTag) node).getLevel() == 3;
            }
            if (nodeType != 33 && nodeType != 34) {
                switch (nodeType) {
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                        break;
                    default:
                        return false;
                }
            }
        }
        return true;
    }

    public static boolean zzXR(Node node) {
        int nodeType = node.getNodeType();
        if (nodeType != 5) {
            if (nodeType == 28) {
                return ((StructuredDocumentTag) node).getLevel() == 2;
            }
            if (nodeType == 37) {
                return (node instanceof zzYD5) || (node instanceof zzYD6);
            }
            if (nodeType != 33 && nodeType != 34) {
                switch (nodeType) {
                }
                return false;
            }
        }
        return true;
    }

    public static boolean zzXS(Node node) {
        int nodeType = node.getNodeType();
        if (nodeType != 1 && nodeType != 4 && nodeType != 31) {
            switch (nodeType) {
                case 17:
                case 18:
                case 19:
                case 20:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public static boolean zzXT(Node node) {
        return node.getNodeType() == 9 || node.getNodeType() == 10;
    }

    public static boolean zzXU(Node node) {
        return !zzXV(node);
    }

    public static boolean zzXV(Node node) {
        return node.getNodeType() == 21 ? !com.aspose.words.internal.zzZYD.zzXh(node.getText()) : !zzXW(node);
    }

    public static boolean zzXW(Node node) {
        int nodeType = node.getNodeType();
        if (nodeType == 27 || nodeType == 28 || nodeType == 33 || nodeType == 34) {
            return true;
        }
        switch (nodeType) {
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                return true;
            default:
                return false;
        }
    }

    public static int zzXX(Node node) {
        int i = 0;
        while (node != null) {
            if (5 == node.getNodeType()) {
                i++;
            }
            node = node.getParentNode();
            if (node != null) {
                switch (node.getNodeType()) {
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                        node = null;
                        break;
                }
            }
        }
        return i;
    }

    public static int zzXY(Node node) {
        if (node.getNodeType() != 21) {
            return zzXW(node) ? 0 : 1;
        }
        node.getText();
        return node.getText().length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean zzY(zzZAD zzzad, Node node) {
        if (node.getNodeType() == 29 || node.getNodeType() == 30) {
            return false;
        }
        if (node instanceof zzZAD) {
            return zzzad.getLevel_IMarkupNode() == ((zzZAD) node).getLevel_IMarkupNode();
        }
        int level_IMarkupNode = zzzad.getLevel_IMarkupNode();
        if (level_IMarkupNode == 1) {
            return zzXO(node);
        }
        if (level_IMarkupNode == 2) {
            return zzXR(node);
        }
        if (level_IMarkupNode == 3) {
            return zzXQ(node);
        }
        if (level_IMarkupNode != 4) {
            return false;
        }
        return zzXP(node);
    }

    public static Node zzZ(Node node, zzYWD zzywd) throws Exception {
        if (zzywd.zzJ(node)) {
            return node;
        }
        if (!node.isComposite()) {
            return null;
        }
        Iterator<T> it = ((CompositeNode) node).getChildNodes(0, false).iterator();
        while (it.hasNext()) {
            Node nodeZzZ = zzZ((Node) it.next(), zzywd);
            if (nodeZzZ != null) {
                return nodeZzZ;
            }
        }
        return null;
    }

    public static boolean zzZf(Paragraph paragraph) {
        Cell cell = (Cell) com.aspose.words.internal.zzZKW.zzZ(paragraph.zzYBd(), Cell.class);
        return cell != null && cell.getFirstParagraph() == paragraph && cell.getLastParagraph() == paragraph;
    }

    private static boolean zzi(Node node, Node node2) {
        if (node == null && node2 != null) {
            return zzXR(node2) || zzXP(node2) || zzXQ(node2);
        }
        return false;
    }

    public static void zzj(Node node, Node node2) {
        while (node2.getParentNode() != null && !node2.getParentNode().zzT(node)) {
            node2 = node2.getParentNode();
        }
        if (node2.getParentNode() == null) {
            throw new IllegalStateException("Parent cannot be null.");
        }
        node2.zzYD(node);
    }

    public static boolean zzk(Node node, Node node2) {
        return node.zztB(0) == node2.zztB(0);
    }

    public static boolean zzl(Node node, Node node2) {
        return node == node2 || node.zzYF(node2);
    }

    private static boolean zzto(int i) {
        return i == 28 || i == 27;
    }

    public static boolean zztp(int i) {
        return (i == 0 || zzto(i)) ? false : true;
    }

    public static boolean zztq(int i) {
        if (i == 29 || i == 30 || i == 33 || i == 34) {
            return true;
        }
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                return true;
            default:
                return false;
        }
    }

    private static boolean zzw(Node node, boolean z) {
        while (node != null) {
            if (zzXL(node)) {
                return true;
            }
            if (!zztq(node.getNodeType())) {
                return false;
            }
            node = z ? node.getNextSibling() : node.getPreviousSibling();
        }
        return false;
    }

    public static void zzx(Node node, boolean z) {
        zzXL(node);
        CompositeNode compositeNode = (CompositeNode) com.aspose.words.internal.zzZKW.zzZ(node, CompositeNode.class);
        if (!zzw((compositeNode == null || !z) ? node.getNextSibling() : compositeNode.getFirstChild(), true)) {
            zzZ(node.getPreviousSibling(), 0, false);
        }
        if (!zzw((compositeNode == null || !z) ? node.getPreviousSibling() : compositeNode.getLastChild(), false)) {
            zzZ(node.getNextSibling(), 1, true);
        }
        if (compositeNode != null) {
            if (!zzw(compositeNode.getPreviousSibling(), false) && (compositeNode.zzYB9() != null || compositeNode.getParentNode().getNodeType() != 28)) {
                zzZ(compositeNode.getFirstChild(), 1, true);
            }
            if (zzw(compositeNode.getNextSibling(), true)) {
                return;
            }
            if (compositeNode.zzYB4() == null && compositeNode.getParentNode().getNodeType() == 28) {
                return;
            }
            zzZ(compositeNode.getLastChild(), 0, false);
        }
    }

    private static Paragraph zzy(Node node, boolean z) {
        int i = z ? 0 : -1;
        Node child = null;
        do {
            CompositeNode compositeNodeZzYB5 = z ? node.zzYB5() : node.zzYB6();
            while (child == null && compositeNodeZzYB5 != null) {
                if (compositeNodeZzYB5.getNodeType() == 8) {
                    child = compositeNodeZzYB5;
                } else if (compositeNodeZzYB5.isComposite()) {
                    child = compositeNodeZzYB5.getChild(8, i, true);
                }
                compositeNodeZzYB5 = z ? compositeNodeZzYB5.zzYB5() : compositeNodeZzYB5.zzYB6();
            }
            node = node.zzYBd();
        } while (zzi(child, node));
        return (Paragraph) child;
    }

    public static Node zzz(Node node, boolean z) {
        Node nodeZzZYs = null;
        while (node != null && nodeZzZYs == null) {
            if (zzXM(node)) {
                CompositeNode compositeNode = (CompositeNode) node;
                nodeZzZYs = z ? compositeNode.zzZYs() : compositeNode.zzZYu();
            } else {
                nodeZzZYs = (!z || node.isComposite()) ? node : null;
            }
            node = node.getPreviousSibling();
        }
        return nodeZzZYs;
    }

    private static void zzZ(Node node, int i, boolean z) {
        while (node != null && zztq(node.getNodeType())) {
            zzZCT zzzct = (zzZCT) com.aspose.words.internal.zzZKW.zzZ(node, zzZCT.class);
            if (zzzct != null && zzzct.getDisplacedByCustomXml() == i) {
                zzzct.setDisplacedByCustomXml(2);
            }
            node = z ? node.getNextSibling() : node.getPreviousSibling();
        }
    }
}
