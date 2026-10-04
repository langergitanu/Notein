package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYWB implements Iterable<Node> {
    static zzYWB zzXV4;
    private int zzXV5;
    private int zzXV6;
    private Node zzXV7;
    private zzZYT zzXV8;
    private zzZYT zzXV9;

    static {
        zzZYT zzzyt = zzZYT.zzYR7;
        zzXV4 = new zzYWB(zzzyt, zzzyt);
    }

    public zzYWB(Node node, Node node2) {
        this(node, true, node2, true);
    }

    private Node zzZpv() {
        Node node = this.zzXV8.getNode();
        return this.zzXV8.zzZou() ? node : node.zzYAZ();
    }

    private CompositeNode zztt(int i) {
        CompositeNode ancestor;
        CompositeNode ancestor2 = this.zzXV9.getNode().getAncestor(8);
        if (ancestor2 == null || (ancestor = this.zzXV8.getNode().getAncestor(8)) == null || ancestor2 != ancestor) {
            return null;
        }
        return ancestor2;
    }

    public final DocumentBase getDocument() {
        if (zz13()) {
            return null;
        }
        return this.zzXV9.getNode().getDocument();
    }

    public final boolean isEmpty() {
        if (this.zzXV8.getNode().getNodeType() != 21) {
            return this.zzXV9.zzZ(this.zzXV8);
        }
        if (this.zzXV9.zzY(this.zzXV8)) {
            return this.zzXV9.getOffset() >= this.zzXV8.getOffset() || this.zzXV9.zzZot();
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<Node> iterator() {
        return new zzYWI(this);
    }

    public final Node remove() throws Exception {
        zzYA8();
        Node nodeZzZpv = zzZpv();
        zzYW0.zzY(this, 1);
        return nodeZzZpv;
    }

    public final boolean zz13() {
        return this.zzXV9.zz13() || this.zzXV8.zz13();
    }

    public final boolean zzYA0() {
        return this.zzXV7 != null;
    }

    public final zzZYT zzYA1() {
        return this.zzXV8;
    }

    public final zzZYT zzYA2() {
        return this.zzXV9;
    }

    public final boolean zzYA3() {
        return !this.zzXV8.zzZou();
    }

    public final boolean zzYA4() {
        return !this.zzXV9.zzZot();
    }

    public final boolean zzYA5() {
        return this.zzXV9.zzY(this.zzXV8);
    }

    public final boolean zzYA6() {
        return zzYVU.zzK(this.zzXV9.getNode(), 2) == zzYVU.zzK(this.zzXV8.getNode(), 2);
    }

    public final boolean zzYA7() {
        return zztt(8) != null;
    }

    public final Run zzYA8() {
        Run runZzng;
        if (this.zzXV9.getNode().getNodeType() != 21 || this.zzXV9.zzZot()) {
            runZzng = null;
        } else {
            Run run = (Run) this.zzXV9.getNode();
            int offset = this.zzXV9.getOffset();
            runZzng = run.zzng(offset);
            this.zzXV9.zzZoo();
            this.zzXV9.zzZos();
            if (zzYA5() && this.zzXV8.getOffset() != -1) {
                zzZYT zzzyt = this.zzXV8;
                zzzyt.setOffset(zzzyt.getOffset() - offset);
            }
        }
        if (this.zzXV8.getNode().getNodeType() == 21 && this.zzXV8.getOffset() > 0) {
            ((Run) this.zzXV8.getNode()).zznf(this.zzXV8.getOffset());
            this.zzXV8.zzZoo();
            this.zzXV8.zzZor();
        }
        return runZzng;
    }

    public final int zzYzX() {
        return this.zzXV5;
    }

    public final int zzYzY() {
        return this.zzXV6;
    }

    public final Node zzYzZ() {
        return this.zzXV7;
    }

    public final void zzZ(DocumentVisitor documentVisitor, zzZA2 zzza2) throws Exception {
        new zzYW1(this, documentVisitor, zzza2, 1).zzYzN();
    }

    public zzYWB(Node node, boolean z, Node node2, boolean z2) {
        this(node, z, node2, z2, null);
    }

    public zzYWB(Node node, boolean z, Node node2, boolean z2, BookmarkStart bookmarkStart) {
        this(z ? zzZYT.zzq(node) : zzZYT.zzp(node), z2 ? zzZYT.zzp(node2) : zzZYT.zzq(node2), bookmarkStart);
    }

    public zzYWB(zzZYT zzzyt, zzZYT zzzyt2) {
        this(zzzyt, zzzyt2, null);
    }

    private zzYWB(zzZYT zzzyt, zzZYT zzzyt2, BookmarkStart bookmarkStart) {
        this.zzXV9 = zzzyt;
        this.zzXV8 = zzzyt2;
        this.zzXV7 = null;
        this.zzXV6 = -1;
        this.zzXV5 = -1;
        if (bookmarkStart == null || !bookmarkStart.isColumn()) {
            return;
        }
        CompositeNode ancestor = bookmarkStart.getAncestor(5);
        this.zzXV7 = ancestor;
        if (ancestor != null) {
            this.zzXV6 = bookmarkStart.getFirstColumn();
            this.zzXV5 = bookmarkStart.getLastColumn();
        }
    }
}
