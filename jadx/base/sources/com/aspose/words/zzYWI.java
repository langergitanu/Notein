package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
class zzYWI implements zzZBT, Iterator<Node> {
    private boolean zzXVs;
    private zzZYT zzXVt;
    private zzYWB zzZtB;

    public zzYWI(zzYWB zzywb) {
        this(zzywb, false);
    }

    private boolean zzSF(boolean z) {
        if (!zzYAq()) {
            return false;
        }
        if (!zzYAr() && !this.zzZtB.zzYA3()) {
            return true;
        }
        if (this.zzXVt.zzZot() && z) {
            return true;
        }
        return !z && this.zzXVt.zzZ(this.zzZtB.zzYA1());
    }

    private boolean zzYAq() {
        return this.zzZtB.zzYA1().zzY(this.zzXVt);
    }

    private boolean zzYAr() {
        return this.zzZtB.zzYA2().zzY(this.zzXVt);
    }

    private boolean zzYAt() {
        return this.zzXVs || zzYAs();
    }

    public static Node zzYg(Node node) {
        if (node == null) {
            return null;
        }
        try {
            int nodeType = node.getNodeType();
            if (nodeType == 3) {
                return ((Body) node).getFirstChild();
            }
            if (nodeType != 4) {
                return node;
            }
            Body body = ((Section) node.getParentNode()).getBody();
            if (body != null) {
                return body.getFirstChild();
            }
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Node zzYh(Node node) {
        if (node == null) {
            return null;
        }
        return node.getNodeType() != 3 ? node : node.getParentNode();
    }

    private boolean zzYi(Node node) {
        if (!this.zzZtB.zzYA0()) {
            return false;
        }
        Node nodeZzYzZ = this.zzZtB.zzYzZ();
        if (node != nodeZzYzZ) {
            return zzYVU.zzXQ(node) && !zzYVU.zztq(node.getNodeType()) && node.zzYBd() == nodeZzYzZ;
        }
        return true;
    }

    private static boolean zzty(int i) {
        if (i == 0) {
            return true;
        }
        if (i == 1) {
            return false;
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: behavior");
    }

    private boolean zztz(int i) {
        if (i == 0) {
            return true;
        }
        if (i == 1) {
            return next().getNodeType() == 21;
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: behavior");
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: getCurrentNode, reason: merged with bridge method [inline-methods] */
    public final Node next() {
        zzZYT zzzyt = this.zzXVt;
        if (zzzyt != null) {
            return zzzyt.getNode();
        }
        return null;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return zzF(true, true);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public final void reset() {
        this.zzXVt = null;
    }

    public final boolean zzF(boolean z, boolean z2) {
        boolean z3;
        if (this.zzZtB.zz13() || this.zzZtB.isEmpty()) {
            return false;
        }
        if (this.zzXVt == null) {
            this.zzXVt = this.zzZtB.zzYA2().zzZop();
            if (this.zzZtB.zzYA4() && zzYAt()) {
                return true;
            }
        }
        if (zzSF(true)) {
            return false;
        }
        while (true) {
            Node next = next();
            while (true) {
                z3 = z;
                if (!this.zzXVt.zzZ(null, true, z3, true, !z2, true, this) || zzSF(z2)) {
                    return false;
                }
                if (!z2 || (!this.zzXVt.zzZot() && next() != next)) {
                    break;
                }
                z = z3;
            }
            if (zzYAt()) {
                return true;
            }
            z = z3;
        }
    }

    public final boolean zzSG(boolean z) {
        return zzF(z, true);
    }

    public final boolean zzYAs() {
        return zzYj(next());
    }

    public final boolean zzYAu() {
        return zzF(true, true);
    }

    public final zzZYT zzYWt() {
        return this.zzXVt;
    }

    public final boolean zzYj(Node node) {
        if (!this.zzZtB.zzYA0() || node == this.zzZtB.zzYzZ()) {
            return true;
        }
        while (true) {
            CompositeNode ancestor = node.getAncestor(5);
            if (ancestor == null) {
                return false;
            }
            if (ancestor == this.zzZtB.zzYzZ()) {
                if (node.zzYAY() == 4) {
                    return !zzYVU.zztq(node.getNodeType());
                }
                if (node.zzYAY() != 5) {
                    node = node.getAncestor(7);
                }
                if (node == null) {
                    return false;
                }
                while (node.getParentNode().zzYAY() == 5) {
                    node = node.getParentNode();
                }
                boolean zZztq = zzYVU.zztq(node.getNodeType());
                if (zZztq && (node = node.zzYB9()) == null) {
                    return false;
                }
                int iZzYzX = this.zzZtB.zzYzX() - (zZztq ? 1 : 0);
                int iZzz = node.getParentNode().zzz(node);
                return iZzz >= this.zzZtB.zzYzY() && iZzz <= iZzYzX;
            }
            node = ancestor;
        }
    }

    public boolean zzYq(Node node) {
        return false;
    }

    public final Node zzZ(zzZA2 zzza2, int i) throws Exception {
        return zzZ(next(), zzza2, (zzZA5) null, zztz(i), zzty(i));
    }

    public final zzYWB zzZga() {
        return this.zzZtB;
    }

    public void zztA(int i) {
    }

    @Override // com.aspose.words.zzZBT
    public final void zzyo(int i) {
        Node nodeZzYg;
        if (i == 4) {
            Node nodeZzYh = zzYh(next());
            if (nodeZzYh != next()) {
                this.zzXVt = zzZYT.zzp(nodeZzYh);
            }
        } else if (i == 5 && (nodeZzYg = zzYg(next())) != next()) {
            this.zzXVt = zzZYT.zzq(nodeZzYg);
        }
        zztA(i);
    }

    public zzYWI(zzYWB zzywb, boolean z) {
        this.zzZtB = zzywb;
        this.zzXVs = z;
    }

    public final Node zzZ(Node node, zzZA2 zzza2, zzZA5 zzza5, boolean z, boolean z2) throws Exception {
        Node nodeZzZ = zzZ(node, zzza5, z, z2, true);
        if (nodeZzZ == null) {
            return null;
        }
        if (node.getNodeType() == 21) {
            zzZYT zzzytZzYA2 = this.zzZtB.zzYA2();
            zzZYT zzzytZzYA1 = this.zzZtB.zzYA1();
            Run run = (Run) nodeZzZ;
            int offset = zzYAr() ? zzzytZzYA2.getOffset() : 0;
            int length = ((!zzYAq() || zzzytZzYA1.zzZot()) ? run.getText().length() : zzzytZzYA1.getOffset()) - offset;
            if (length < run.getText().length()) {
                nodeZzZ = run.zzG(offset, length, !z);
            }
        }
        return zzza2 != null ? zzza2.zzZ(node, nodeZzZ, z2, zzza5) : nodeZzZ;
    }

    private Node zzZ(Node node, zzZA5 zzza5, boolean z, boolean z2, boolean z3) {
        if ((z3 && !zzYj(node)) || zzYq(node)) {
            return null;
        }
        if (!z) {
            return node;
        }
        Node nodeZzZ = node.zzZ(false, zzza5);
        if (z2 && node.isComposite()) {
            CompositeNode compositeNode = (CompositeNode) nodeZzZ;
            boolean zZzYi = zzYi(node);
            Node firstChild = ((CompositeNode) node).getFirstChild();
            while (firstChild != null) {
                zzZA5 zzza52 = zzza5;
                Node nodeZzZ2 = zzZ(firstChild, zzza52, true, true, zZzYi);
                if (nodeZzZ2 != null) {
                    compositeNode.zzA(nodeZzZ2);
                }
                firstChild = firstChild.getNextSibling();
                zzza5 = zzza52;
            }
        }
        return nodeZzZ;
    }
}
