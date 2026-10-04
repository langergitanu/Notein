package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYK6 {
    private CompositeNode zzXCK;
    private Node zzXCL;
    private boolean zzXCM;
    private Node zzXCN;
    private Node zzXCO;
    private boolean zzXCP;
    private Node zzXKm;
    private Node zzYR6;

    public zzYK6(Node node, boolean z) {
        this(node, z, null, null);
    }

    public final Node getNextSibling() {
        return this.zzXCL;
    }

    public final Node getNode() {
        return this.zzYR6;
    }

    public final Node getPreviousSibling() {
        return this.zzXKm;
    }

    public final CompositeNode zzYmg() {
        return this.zzXCK;
    }

    public final boolean zzYmh() {
        return this.zzXCM;
    }

    public final int zzYmi() {
        Cloneable cloneable = this.zzXCN;
        if (cloneable != null) {
            return ((zzZCT) cloneable).getDisplacedByCustomXml();
        }
        return 2;
    }

    public final Node zzYmj() {
        return this.zzXCN;
    }

    public final Node zzYmk() {
        return this.zzXCO;
    }

    public final boolean zzYml() {
        return this.zzXCP;
    }

    public zzYK6(Node node, boolean z, Node node2, Node node3) {
        this.zzYR6 = node;
        this.zzXKm = node.getPreviousSibling();
        this.zzXCL = node.getNextSibling();
        this.zzXCK = node.getParentNode();
        this.zzXCP = z;
        if (node2 != null) {
            zzYVU.zzXL(node2);
        }
        this.zzXCO = node2;
        this.zzXCN = node3;
        this.zzXCM = node3 != null && node3.zzYF(node2);
    }
}
