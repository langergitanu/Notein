package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYJ4 {
    private static boolean zz8(Node node, Node node2) {
        if (node != null && node2 != null) {
            zzYX6 zzyx6ZzE = node.getNodeType() == 16 ? zzYX8.zzE(node, true) : (zzYX3) node;
            zzYX6 zzyx6ZzE2 = node2.getNodeType() == 14 ? zzYX8.zzE(node2, false) : (zzYXB) node2;
            Document document = (Document) node.getDocument();
            if (com.aspose.words.internal.zzZKN.equals(zzyx6ZzE.getName(), zzyx6ZzE2.getName()) && com.aspose.words.internal.zzZKN.equals(zzyx6ZzE.getAuthor(), document.zzZqs().getAuthor()) && com.aspose.words.internal.zzZQ9.zzZ(zzyx6ZzE.zzkT(), document.zzZqs().zzZx())) {
                return true;
            }
        }
        return false;
    }

    private static boolean zz9(Node node, Node node2) {
        return (node instanceof zzYX3) || (node instanceof zzYXB) || (node2 instanceof zzYX4) || (node2 instanceof zzYXC) || zzWQ(node) || zzWQ(node2);
    }

    private static void zzD(Node node, int i) {
        if (node.isComposite() && !(node instanceof ShapeBase) && node.getNodeType() != 19) {
            CompositeNode compositeNode = (CompositeNode) node;
            for (Node node2 : compositeNode.getChildNodes(0, false)) {
                if (!(compositeNode instanceof InlineStory)) {
                    zzD(node2, i);
                } else if (i == 1) {
                    zzWV(node2);
                } else {
                    zzWU(node2);
                }
            }
        }
        zzZ8X zzz8x = (zzZ8X) com.aspose.words.internal.zzZKW.zzZ(node, zzZ8X.class);
        if (zzz8x != null) {
            zzZ(zzz8x, ((Document) node.getDocument()).zzZqs(), i);
        }
    }

    private static void zzR(Node node, Node node2, boolean z) {
        CompositeNode compositeNode;
        if (node2 == null) {
            return;
        }
        CompositeNode parentNode = node2.getParentNode();
        if (parentNode.zzT(node) || !node2.isComposite()) {
            parentNode.zzZ(node, node2, z);
            return;
        }
        while (true) {
            compositeNode = (CompositeNode) node2;
            if (compositeNode.zzT(node) || !compositeNode.getFirstChild().isComposite()) {
                break;
            } else {
                node2 = z ? compositeNode.getLastChild() : compositeNode.getFirstChild();
            }
        }
        compositeNode.zzZ(node, (Node) null, !z);
    }

    private static boolean zzV(zzZ8X zzz8x, zzZV7 zzzv7) {
        zzZV8 insertRevision = zzz8x.getInsertRevision();
        if (insertRevision == null) {
            return false;
        }
        return com.aspose.words.internal.zzZKN.equals(zzzv7.getAuthor(), insertRevision.getAuthor());
    }

    public static void zzW(zzZ8X zzz8x, zzZV7 zzzv7) {
        zzz8x.setDeleteRevision(new zzZV8(1, zzzv7.getAuthor(), zzzv7.zzZx()));
    }

    private static boolean zzWQ(Node node) {
        zzZA6 zzza6 = (zzZA6) com.aspose.words.internal.zzZKW.zzZ(node, zzZA6.class);
        if (zzza6 == null) {
            return false;
        }
        return (zzza6.getMoveToRevision() == null && zzza6.getMoveFromRevision() == null) ? false : true;
    }

    private static Node zzWR(Node node) {
        while (node.isComposite()) {
            CompositeNode compositeNode = (CompositeNode) node;
            if (!compositeNode.hasChildNodes()) {
                break;
            }
            node = compositeNode.getFirstChild();
        }
        return node;
    }

    private static Node zzWS(Node node) {
        Node nextSibling = node.getNextSibling();
        return nextSibling != null ? zzWR(nextSibling) : node.getParentNode();
    }

    private static Node zzWT(Node node) {
        if (node.isComposite()) {
            CompositeNode compositeNode = (CompositeNode) node;
            if (compositeNode.hasChildNodes()) {
                return compositeNode.getLastChild();
            }
        }
        while (node.getPreviousSibling() == null && node.getParentNode() != null) {
            node = node.getParentNode();
        }
        return node.getPreviousSibling();
    }

    private static void zzWU(Node node) {
        if (node.isComposite()) {
            Iterator<T> it = ((CompositeNode) node).getChildNodes(0, false).iterator();
            while (it.hasNext()) {
                zzWU((Node) it.next());
            }
        }
        zzZ8X zzz8x = (zzZ8X) com.aspose.words.internal.zzZKW.zzZ(node, zzZ8X.class);
        if (zzz8x != null) {
            zzW(zzz8x, ((Document) node.getDocument()).zzZqs());
        }
    }

    private static void zzWV(Node node) {
        if (node.isComposite()) {
            Iterator<T> it = ((CompositeNode) node).getChildNodes(0, false).iterator();
            while (it.hasNext()) {
                zzWV((Node) it.next());
            }
        }
        zzZ8X zzz8x = (zzZ8X) com.aspose.words.internal.zzZKW.zzZ(node, zzZ8X.class);
        if (zzz8x == null) {
            return;
        }
        zzz8x.removeMoveRevisions();
        zzX(zzz8x, ((Document) node.getDocument()).zzZqs());
    }

    public static boolean zzWW(Node node) {
        if (node.getAncestor(19) != null || node.getNodeType() == 7) {
            return false;
        }
        com.aspose.words.internal.zzIM zzim = new com.aspose.words.internal.zzIM();
        zzY(node, zzim);
        if (zzim.contains(node)) {
            return false;
        }
        zzY81 zzy81 = new zzY81(node.getDocument());
        try {
            Iterator it = zzim.iterator();
            while (it.hasNext()) {
                ((Node) it.next()).remove();
            }
            zzy81.dispose();
            return true;
        } catch (Throwable th) {
            zzy81.dispose();
            throw th;
        }
    }

    public static void zzX(zzZ8X zzz8x, zzZV7 zzzv7) {
        zzz8x.setInsertRevision(new zzZV8(0, zzzv7.getAuthor(), zzzv7.zzZx()));
    }

    private static boolean zzY(Node node, CompositeNode compositeNode, Node node2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Node nodeDeepClone;
        Node nodeZzr = zzr(node, false);
        Node nodeZzq = zzq(node, false);
        Node node3 = node2 != null ? node2 : compositeNode;
        Node nodeZzr2 = (node2 != null || compositeNode.getLastChild() == null) ? zzr(node3, false) : zzr(compositeNode.getLastChild(), true);
        Node nodeZzq2 = zzq(node3, true);
        zzYX6 zzyx6 = (zzYX6) com.aspose.words.internal.zzZKW.zzZ(nodeZzr, zzYX3.class);
        if (zzyx6 == null) {
            zzyx6 = (zzYX6) com.aspose.words.internal.zzZKW.zzZ(nodeZzq, zzYX3.class);
        }
        zzYX6 zzyx62 = (zzYX6) com.aspose.words.internal.zzZKW.zzZ(nodeZzr2, zzYXB.class);
        if (zzyx62 == null) {
            zzyx62 = (zzYX6) com.aspose.words.internal.zzZKW.zzZ(nodeZzq2, zzYXB.class);
        }
        zzYX4 zzyx4 = (zzYX4) com.aspose.words.internal.zzZKW.zzZ(nodeZzr, zzYX4.class);
        if (zzyx4 == null) {
            zzyx4 = (zzYX4) com.aspose.words.internal.zzZKW.zzZ(nodeZzq, zzYX4.class);
        }
        zzYXC zzyxc = (zzYXC) com.aspose.words.internal.zzZKW.zzZ(nodeZzr2, zzYXC.class);
        if (zzyxc == null) {
            zzyxc = (zzYXC) com.aspose.words.internal.zzZKW.zzZ(nodeZzq2, zzYXC.class);
        }
        if (zz8(zzyx6, zzyx62)) {
            z = zzyx6 == nodeZzq;
            z4 = false;
            z5 = false;
            z3 = zzyx62 == nodeZzq2;
            z2 = false;
        } else if (zz8(zzyx4, zzyxc)) {
            boolean z6 = zzyx4 == nodeZzr;
            z3 = false;
            z5 = false;
            z4 = zzyxc == nodeZzr2;
            z2 = z6;
            z = false;
        } else {
            if (zz9(nodeZzr, nodeZzq) || zz9(nodeZzr2, nodeZzq2)) {
                return false;
            }
            if (!node.isComposite() && !(node instanceof zzZA6)) {
                return false;
            }
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = true;
        }
        boolean z7 = (node instanceof zzZA1) || (node instanceof zzZD7);
        Document document = (Document) node.getDocument();
        zzY81 zzy81 = new zzY81(document);
        if (z7) {
            nodeDeepClone = null;
        } else {
            try {
                nodeDeepClone = node.deepClone(true);
                compositeNode.insertBefore(nodeDeepClone, node2);
                zzD(nodeDeepClone, 0);
            } catch (Throwable th) {
                zzy81.dispose();
                throw th;
            }
        }
        zzD(node, 1);
        if (z) {
            zzR(zzyx6, node, false);
        }
        if (z2) {
            zzR(zzyx4, node, true);
        }
        if (z3) {
            zzR(zzyx62, nodeDeepClone, false);
        }
        if (z4) {
            zzR(zzyxc, nodeDeepClone, true);
        }
        if (z5) {
            zzZ(new zzYWB(node, node), new zzYWB(nodeDeepClone, nodeDeepClone), document.zzZqs().getAuthor(), document.zzZqs().zzZx());
        }
        zzy81.dispose();
        return true;
    }

    public static void zzZ(Node node, CompositeNode compositeNode, Node node2) {
        if (compositeNode == null || compositeNode.getDocument() != node.getDocument()) {
            zzWV(node);
            return;
        }
        if (node.getDocument().zzZqo() && zzY(node, compositeNode, node2)) {
            return;
        }
        if ((node instanceof zzZ8X) || node.isComposite()) {
            Node nodeDeepClone = node.deepClone(true);
            zzY81 zzy81 = new zzY81(node.getDocument());
            try {
                compositeNode.insertBefore(nodeDeepClone, node2);
                zzy81.dispose();
                zzWU(nodeDeepClone);
            } catch (Throwable th) {
                zzy81.dispose();
                throw th;
            }
        }
        zzWV(node);
    }

    private static Node zzq(Node node, boolean z) {
        for (Node nodeZzWR = z ? zzWR(node) : zzWS(node); nodeZzWR != null; nodeZzWR = zzWS(nodeZzWR)) {
            if (nodeZzWR.getNodeType() == 13 || nodeZzWR.getNodeType() == 14 || nodeZzWR.getNodeType() == 15 || nodeZzWR.getNodeType() == 16 || (nodeZzWR instanceof zzZ8X)) {
                return nodeZzWR;
            }
        }
        return null;
    }

    private static Node zzr(Node node, boolean z) {
        if (!z) {
            node = zzWT(zzWR(node));
        }
        while (node != null) {
            if (node.getNodeType() == 13 || node.getNodeType() == 14 || node.getNodeType() == 15 || node.getNodeType() == 16 || (node instanceof zzZ8X)) {
                return node;
            }
            node = zzWT(node);
        }
        return null;
    }

    private static void zzX(Node node, com.aspose.words.internal.zzIM<Node> zzim) {
        while (node.getParentNode() != null) {
            node = node.getParentNode();
            zzim.remove(node);
        }
    }

    public static void zzZ(zzYWB zzywb, zzYWB zzywb2, String str, com.aspose.words.internal.zzZQ9 zzzq9) {
        Document document = (Document) zzywb.getDocument();
        String str2 = "move" + com.aspose.words.internal.zzZKP.zzQ(Integer.valueOf(com.aspose.words.internal.zzZZS.zzY(new Object[0]).hashCode()), "X8") + com.aspose.words.internal.zzZKP.zzQ(Integer.valueOf(com.aspose.words.internal.zzZZS.zzY(new Object[0]).hashCode()), "X8");
        int iZzZpW = document.zzZpW();
        zzR(new zzYXB(document, iZzZpW, str, str2, zzzq9, 2), zzywb2.zzYA2().getNode(), false);
        zzR(new zzYXC(document, iZzZpW, 2), zzywb2.zzYA1().getNode(), true);
        int iZzZpW2 = document.zzZpW();
        zzR(new zzYX3(document, iZzZpW2, str, str2, zzzq9, 2), zzywb.zzYA2().getNode(), false);
        zzR(new zzYX4(document, iZzZpW2, 2), zzywb.zzYA1().getNode(), true);
    }

    private static void zzZ(zzZA6 zzza6, zzZV7 zzzv7, int i) {
        zzYX5 zzyx5 = new zzYX5(i, zzzv7.getAuthor(), zzzv7.zzZx());
        if (i == 1) {
            zzza6.setMoveToRevision(zzyx5);
        } else {
            zzza6.setMoveFromRevision(zzyx5);
        }
    }

    private static void zzY(Node node, com.aspose.words.internal.zzIM<Node> zzim) {
        if (node.getAncestor(19) == null && node.getParentNode().getNodeType() != 18) {
            zzZ8X zzz8x = (zzZ8X) com.aspose.words.internal.zzZKW.zzZ(node, zzZ8X.class);
            if (zzz8x != null) {
                zzZV7 zzzv7ZzZqs = ((Document) node.getDocument()).zzZqs();
                if (zzV(zzz8x, zzzv7ZzZqs)) {
                    zzim.add(node);
                } else {
                    zzW(zzz8x, zzzv7ZzZqs);
                    zzX(node, zzim);
                }
            }
            if (node.isComposite()) {
                Iterator<T> it = ((CompositeNode) node).getChildNodes(0, false).iterator();
                while (it.hasNext()) {
                    zzY((Node) it.next(), zzim);
                }
            }
        }
    }
}
