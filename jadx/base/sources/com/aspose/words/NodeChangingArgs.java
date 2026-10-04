package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class NodeChangingArgs {
    private Node zzXVP;
    private Node zzXVQ;
    private Node zzYR6;
    private int zzoJ;

    public NodeChangingArgs(Node node, Node node2, Node node3, int i) {
        this.zzYR6 = node;
        this.zzXVQ = node2;
        this.zzXVP = node3;
        this.zzoJ = i;
    }

    public int getAction() {
        return this.zzoJ;
    }

    public Node getNewParent() {
        return this.zzXVP;
    }

    public Node getNode() {
        return this.zzYR6;
    }

    public Node getOldParent() {
        return this.zzXVQ;
    }
}
