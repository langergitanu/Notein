package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYVZ implements zzZA3 {
    private int[] zzXUN;
    private ArrayList<Node> zzYE3;

    public zzYVZ(int... iArr) {
        this.zzXUN = iArr;
    }

    private boolean zzZe1() {
        return this.zzYE3 != null;
    }

    public void zzT(Node node, Node node2) {
        if (!zzZe1()) {
            this.zzYE3 = new ArrayList<>();
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzYE3, node2);
    }

    @Override // com.aspose.words.zzZA5
    public final void zzW(Node node, Node node2) {
        if (com.aspose.words.internal.zzZKV.zzZ(this.zzXUN, node.getNodeType(), 0, this.zzXUN.length) == -1) {
            return;
        }
        zzT(node, node2);
    }

    @Override // com.aspose.words.zzZA3
    public final void zzZ(zzYWB zzywb, zzYWB zzywb2) throws Exception {
        if (zzZe1()) {
            Iterator<Node> it = this.zzYE3.iterator();
            while (it.hasNext()) {
                zzx(it.next());
            }
            zzZcy();
        }
    }

    public void zzZcy() throws Exception {
    }

    public abstract void zzx(Node node) throws Exception;
}
