package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZYK {
    private boolean zzYPp;
    private int zzYPq;
    private Document zzYPr;
    private Node zzYPs;
    private CompositeNode zzYPt;

    public zzZYK(CompositeNode compositeNode, Node node, Document document, int i, boolean z) {
        this.zzYPt = compositeNode;
        this.zzYPs = node;
        this.zzYPr = document;
        this.zzYPq = i;
        this.zzYPp = z;
    }

    public final boolean isInline() {
        return this.zzYPp;
    }

    public final int zzZn1() {
        return this.zzYPq;
    }

    public final Document zzZn2() {
        return this.zzYPr;
    }

    public final CompositeNode zzZn3() {
        return this.zzYPt;
    }

    public final Node zzZpv() {
        return this.zzYPs;
    }
}
