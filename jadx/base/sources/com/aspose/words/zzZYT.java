package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZYT implements Cloneable {
    static zzZYT zzYR7 = new zzZYT(null);
    private int mLength;
    private int zzUt;
    private Node zzYR6;

    public zzZYT(Node node) {
        this(node, 0);
    }

    private int getLength() {
        if (this.mLength == -1) {
            if (21 != this.zzYR6.getNodeType() || ((Run) this.zzYR6).zzZYh().contains(885)) {
                this.mLength = 1;
            } else {
                this.mLength = this.zzYR6.zz0R();
            }
        }
        return this.mLength;
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private boolean zzR(boolean z, boolean z2) {
        if (!z2) {
            return false;
        }
        if (z) {
            if (zzZot()) {
                return false;
            }
            zzZor();
            return true;
        }
        if (zzZou()) {
            return false;
        }
        this.zzUt = 0;
        return true;
    }

    private boolean zzS(Node node, boolean z) {
        Node node2 = this.zzYR6;
        if (node == node2) {
            return false;
        }
        if (z && node2.getNextSibling() != null) {
            zzo(this.zzYR6.getNextSibling());
            this.zzUt = 0;
            return true;
        }
        if (z || this.zzYR6.getPreviousSibling() == null) {
            return false;
        }
        zzo(this.zzYR6.getPreviousSibling());
        this.zzUt = getLength();
        return true;
    }

    public static zzZYT zzp(Node node) {
        zzZYT zzzyt = new zzZYT(node);
        zzzyt.zzZor();
        return zzzyt;
    }

    public static zzZYT zzq(Node node) {
        zzZYT zzzyt = new zzZYT(node);
        zzzyt.zzUt = 0;
        return zzzyt;
    }

    public final Node getNode() {
        return this.zzYR6;
    }

    public final int getOffset() {
        return this.zzUt;
    }

    public final void setOffset(int i) {
        this.zzUt = i;
    }

    public final boolean zz13() {
        return this.zzYR6 == null;
    }

    public final boolean zzY(zzZYT zzzyt) {
        return zzzyt != null && this.zzYR6 == zzzyt.zzYR6;
    }

    public final boolean zzZ(Node node, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return zzZ(node, z, z2, z3, z4, z5, null);
    }

    public final void zzZoo() {
        this.mLength = -1;
    }

    public final zzZYT zzZop() {
        return (zzZYT) memberwiseClone();
    }

    public final boolean zzZoq() {
        return !this.zzYR6.isComposite() && zzZot();
    }

    public final void zzZor() {
        this.zzUt = getLength();
    }

    public final void zzZos() {
        this.zzUt = 0;
    }

    public final boolean zzZot() {
        return getLength() <= this.zzUt;
    }

    public final boolean zzZou() {
        return this.zzUt <= 0;
    }

    public final void zzo(Node node) {
        this.zzYR6 = node;
        this.mLength = -1;
    }

    public zzZYT(Node node, int i) {
        this.zzYR6 = node;
        this.zzUt = i;
        this.mLength = -1;
    }

    public final boolean zzZ(Node node, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, zzZBT zzzbt) {
        if (zz13()) {
            if (node == null) {
                throw new NullPointerException("Value cannot be null.\r\nParameter name: root");
            }
            zzo(node);
            this.zzUt = z ? 0 : getLength();
            return true;
        }
        this.zzUt = Math.min(getLength(), Math.max(0, this.zzUt));
        int i = zzY(z, z4, z5) ? 1 : zzZ(node, z, z2, z3) ? 5 : zzR(z, z5) ? 2 : zzS(node, z) ? 3 : zzY(node, z, z2, z3, z4, z5) ? 4 : 0;
        if (i == 0) {
            return false;
        }
        if (zzzbt != null) {
            zzzbt.zzyo(i);
        }
        return true;
    }

    private boolean zzY(boolean z, boolean z2, boolean z3) {
        if ((this.zzYR6 instanceof CompositeNode) || !z2) {
            return false;
        }
        if (z) {
            if (this.zzUt + (z3 ? 1 : 2) > getLength()) {
                return false;
            }
            this.zzUt++;
        } else {
            int i = this.zzUt;
            if (i - (z3 ? 1 : 2) < 0) {
                return false;
            }
            this.zzUt = i - 1;
        }
        return true;
    }

    private boolean zzY(Node node, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Node node2 = this.zzYR6;
        if (node2 == node || node2.getParentNode() == null) {
            return false;
        }
        if (!z3 && node != this.zzYR6.getParentNode() && zzYVU.zzXS(this.zzYR6.getParentNode())) {
            return false;
        }
        zzo(this.zzYR6.getParentNode());
        this.zzUt = z ? getLength() : 0;
        return z5 || zzZ(node, z, z2, z3, z4, false);
    }

    public final boolean zzZ(zzZYT zzzyt) {
        return zzzyt != null && zzY(zzzyt) && this.zzUt == zzzyt.zzUt;
    }

    private boolean zzZ(Node node, boolean z, boolean z2, boolean z3) {
        Node node2;
        if (!z2) {
            return false;
        }
        if (!(z && zzZou()) && (z || !zzZot())) {
            return false;
        }
        if ((!z3 && (node2 = this.zzYR6) != node && zzYVU.zzXS(node2)) || !this.zzYR6.isComposite()) {
            return false;
        }
        CompositeNode compositeNode = (CompositeNode) this.zzYR6;
        if (!compositeNode.hasChildNodes()) {
            return false;
        }
        zzo(z ? compositeNode.getFirstChild() : compositeNode.getLastChild());
        this.zzUt = z ? 0 : getLength();
        return true;
    }
}
