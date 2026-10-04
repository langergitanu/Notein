package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYMF {
    static zzYMF zzXFZ = new zzYMF();
    private boolean zzXG0;
    private int zzYw;
    private Node zzZsY;
    private Node zzZsZ;

    private zzYMF() {
        this(1);
        this.zzXG0 = true;
    }

    public final Node getFirstChild() {
        return this.zzZsZ;
    }

    public final Node getLastChild() {
        return this.zzZsY;
    }

    public final int getLevel() {
        return this.zzYw;
    }

    public final boolean zzYo2() {
        return this.zzXG0;
    }

    public zzYMF(int i) {
        this(i, null, null);
    }

    public zzYMF(int i, Node node, Node node2) {
        this.zzYw = i;
        this.zzZsZ = node;
        this.zzZsY = node2;
    }
}
