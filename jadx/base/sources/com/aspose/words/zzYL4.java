package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYL4 {
    private ArrayList<com.aspose.words.internal.zz6R> zzXDy = new ArrayList<>();

    public final void zzYmR() throws Exception {
        for (com.aspose.words.internal.zz6R zz6r : this.zzXDy) {
            zzZ((Node) zz6r.getFirst(), (Node) zz6r.zzwW());
        }
    }

    public abstract void zzZ(Node node, Node node2) throws Exception;

    public final void zzb(Node node, Node node2) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzXDy, new com.aspose.words.internal.zz6R(node, node2));
    }
}
