package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
class zzYW0 extends zzYVW {
    private boolean zzXUO;
    private boolean zzXUP;
    private ArrayList<CompositeNode> zzXUQ;
    private int zzXUR;
    private ArrayList<Node> zzYCb;

    public zzYW0(zzYWB zzywb, int i, boolean z) {
        super(zzywb);
        this.zzYCb = new ArrayList<>();
        this.zzXUQ = new ArrayList<>();
        if (zzywb.zzYA0()) {
            throw new IllegalArgumentException("Table column bookmark range removal is not supported.\r\nParameter name: range");
        }
        this.zzXUR = i;
        this.zzXUP = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void zzW(CompositeNode compositeNode, CompositeNode compositeNode2) {
        Document documentZzYBb = compositeNode.zzYBb();
        if (documentZzYBb.zzZqp() && (compositeNode instanceof zzZ8X)) {
            zzYJ4.zzW((zzZ8X) compositeNode, documentZzYBb.zzZqs());
            return;
        }
        zzY81 zzy81 = new zzY81(documentZzYBb);
        try {
            compositeNode2.zzZ(compositeNode.getFirstChild(), (Node) null, compositeNode2.getFirstChild());
            zzy81.dispose();
            compositeNode.remove();
        } catch (Throwable th) {
            zzy81.dispose();
            throw th;
        }
    }

    private static void zzX(CompositeNode compositeNode, CompositeNode compositeNode2) {
        if (compositeNode2.zzYAY() != 6) {
            compositeNode2.zzZ(compositeNode.getNextSibling(), compositeNode2, compositeNode2.getFirstChild());
        }
        if (compositeNode2.getNodeType() != 27 || compositeNode != compositeNode2.getParentNode()) {
            zzW(compositeNode, compositeNode2);
            return;
        }
        zzY81 zzy81 = new zzY81(compositeNode2.getDocument());
        try {
            compositeNode.zzZ(compositeNode2.getFirstChild(), (Node) null, compositeNode2);
            zzy81.dispose();
            compositeNode2.remove();
        } catch (Throwable th) {
            zzy81.dispose();
            throw th;
        }
    }

    public static void zzY(zzYWB zzywb, int i) throws Exception {
        new zzYW0(zzywb, i, false).zzYzM();
    }

    private boolean zzY0(Node node) {
        Node node2 = zzZga().zzYA2().getNode();
        return this.zzXUP && zzYVU.zztq(node2.getNodeType()) && node2.zzYB4() == node && node2.zzYAY() != 6;
    }

    private void zzYzK() {
        for (CompositeNode compositeNode : this.zzXUQ) {
            Node nodeZzYB9 = compositeNode.zzYAY() != 6 ? compositeNode.zzYB9() : compositeNode.getPreviousSibling();
            if (compositeNode.getParentNode() != null && nodeZzYB9 != null && compositeNode.getNodeType() != 5 && nodeZzYB9.getNodeType() != 5 && compositeNode.getNodeType() != 28 && compositeNode.getNodeType() != 35) {
                if (!nodeZzYB9.isComposite()) {
                    nodeZzYB9 = nodeZzYB9.getParentNode();
                }
                if (compositeNode.getNodeType() == 2) {
                    zzY((Section) nodeZzYB9, (Section) compositeNode);
                } else {
                    zzX((CompositeNode) nodeZzYB9, compositeNode);
                }
            }
        }
    }

    private void zzYzL() {
        Node lastChild;
        for (CompositeNode compositeNode : this.zzXUQ) {
            if (compositeNode.getParentNode() != null) {
                CompositeNode compositeNodeZzYB9 = compositeNode.zzYAY() != 6 ? compositeNode.zzYB9() : compositeNode.getPreviousSibling();
                if (compositeNodeZzYB9 != null && compositeNodeZzYB9.getNodeType() != 5 && compositeNode.getNodeType() != 5 && compositeNodeZzYB9.getNodeType() != 28) {
                    if (compositeNodeZzYB9.isComposite()) {
                        lastChild = compositeNodeZzYB9.getLastChild();
                    } else {
                        lastChild = compositeNodeZzYB9;
                        compositeNodeZzYB9 = compositeNodeZzYB9.getParentNode();
                    }
                    if (compositeNode.getNodeType() == 2) {
                        Section section = (Section) compositeNode;
                        Body body = section.getBody();
                        Body body2 = ((Section) compositeNodeZzYB9).getBody();
                        body2.zzY(body.getFirstChild(), null, body2.getLastChild());
                        if (section.getNextSibling() != null) {
                            zzX(section, (Section) section.getNextSibling());
                        }
                    } else {
                        CompositeNode compositeNode2 = compositeNodeZzYB9;
                        compositeNode2.zzY(compositeNode.getFirstChild(), null, lastChild);
                        if (compositeNode.zzYAY() != 6) {
                            compositeNode2.zzY(compositeNode.zzYB9().getNextSibling(), compositeNode, lastChild);
                        }
                    }
                    compositeNode.remove();
                }
            }
        }
    }

    public static void zzZ(Node node, boolean z, Node node2, boolean z2) throws Exception {
        zzZ(node, z, node2, z2, 1);
    }

    public static void zzm(Node node, Node node2) throws Exception {
        zzZ(node, true, node2, true);
    }

    public static void zzn(Node node, Node node2) {
        if (node2 != null && node2.getParentNode() != node.getParentNode()) {
            throw new IllegalArgumentException("Start and end nodes must have the same parent.");
        }
        while (node != node2) {
            Node nextSibling = node.getNextSibling();
            node.remove();
            node = nextSibling;
        }
    }

    public void zz98() {
        Iterator<Node> it = this.zzYCb.iterator();
        while (it.hasNext()) {
            it.next().remove();
        }
    }

    @Override // com.aspose.words.zzYVW
    public void zz9c() {
        if (this.zzXUO) {
            return;
        }
        zzM(next());
    }

    public void zzM(Node node) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzYCb, node);
    }

    @Override // com.aspose.words.zzYVW
    public final void zzYAF() {
        if (zzY0(next())) {
            return;
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzXUQ, (CompositeNode) next());
    }

    public final ArrayList<Node> zzYzH() {
        return this.zzYCb;
    }

    public final void zzYzI() {
        this.zzXUO = false;
    }

    public final void zzYzJ() {
        this.zzXUO = true;
    }

    public final void zzYzM() throws Exception {
        zzYzw();
        zz98();
        zzts(this.zzXUR);
    }

    @Override // com.aspose.words.zzYVW
    public final void zzZe4() {
        if (this.zzXUO) {
            return;
        }
        if (!zzY0(next())) {
            zzM(next());
            return;
        }
        CompositeNode compositeNode = (CompositeNode) next();
        while (true) {
            Node nodeZzZYr = compositeNode.zzZYr();
            if (nodeZzZYr == null || !nodeZzZYr.isComposite() || nodeZzZYr.zzYAY() == 6) {
                break;
            }
            compositeNode = (CompositeNode) nodeZzZYr;
            for (Node nextSibling = nodeZzZYr.getNextSibling(); nextSibling != null; nextSibling = nextSibling.getNextSibling()) {
                zzM(nextSibling);
            }
        }
        Iterator<V> it = compositeNode.iterator();
        while (it.hasNext()) {
            zzM((Node) it.next());
        }
    }

    public final void zzts(int i) {
        if (i != 0) {
            if (i == 1) {
                zzYzL();
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: joinMode");
                }
                zzYzK();
            }
        }
    }

    public static void zzZ(Node node, boolean z, Node node2, boolean z2, int i) throws Exception {
        zzY(new zzYWB(node, z, node2, z2), i);
    }

    private static void zzY(Section section, Section section2) {
        Body body = section.getBody();
        Body body2 = section2.getBody();
        body2.zzZ(body.getFirstChild(), (Node) null, body2.getFirstChild());
        zzX(section, section2);
        section.remove();
    }

    private static void zzX(Section section, Section section2) {
        for (HeaderFooter headerFooter : section.getHeadersFooters().toArray()) {
            HeaderFooter byHeaderFooterType = section2.getHeadersFooters().getByHeaderFooterType(headerFooter.getHeaderFooterType());
            if (byHeaderFooterType == null || byHeaderFooterType.isLinkedToPrevious()) {
                if (byHeaderFooterType != null) {
                    byHeaderFooterType.remove();
                }
                section2.getHeadersFooters().add(headerFooter);
            }
        }
    }
}
