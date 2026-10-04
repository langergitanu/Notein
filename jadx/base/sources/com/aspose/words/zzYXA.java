package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYXA {
    private zzYX9 zzXX6;
    private zzYX6 zzXX7;

    public zzYXA(zzYX6 zzyx6) {
        this.zzXX7 = zzyx6;
        this.zzXX6 = zzyx6 != null ? zzYX8.zzO(zzyx6.getDocument(), zzyx6.getId()) : null;
    }

    public final boolean isDefined() {
        zzYX6 zzyx6 = this.zzXX7;
        return (zzyx6 == null || this.zzXX6 == null || zzyx6.isRemoved() || this.zzXX6.isRemoved()) ? false : true;
    }

    public final boolean isEmpty() {
        if (!isDefined()) {
            return false;
        }
        Node nodeNextPreOrder = this.zzXX7.nextPreOrder(this.zzXX6);
        while (nodeNextPreOrder != null) {
            if (zzYJ3.zzp(nodeNextPreOrder, this.zzXX7 instanceof zzYX3)) {
                return false;
            }
            nodeNextPreOrder = nodeNextPreOrder.nextPreOrder(this.zzXX6);
        }
        return true;
    }

    public final void remove() {
        this.zzXX7.remove();
        this.zzXX6.remove();
    }

    public final boolean zzYBU() {
        return this.zzXX7 instanceof zzYX3;
    }

    public final zzYX9 zzYBV() {
        return this.zzXX6;
    }

    public final zzYX6 zzYBW() {
        return this.zzXX7;
    }

    public zzYXA(Node node, boolean z) {
        zzYX6 zzyx6ZzE = zzYX8.zzE(node, z);
        this.zzXX7 = zzyx6ZzE;
        this.zzXX6 = zzyx6ZzE != null ? zzYX8.zzO(node.getDocument(), this.zzXX7.getId()) : null;
    }
}
