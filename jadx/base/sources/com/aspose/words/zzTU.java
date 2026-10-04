package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzTU implements zzZA2 {
    private ArrayList<zzZA2> zzZt0;

    public zzTU(zzZA2... zzza2Arr) {
        this.zzZt0 = new ArrayList<>(zzza2Arr.length);
        for (zzZA2 zzza2 : zzza2Arr) {
            zzZ(zzza2);
        }
    }

    public final void zzZ(zzZA2 zzza2) {
        if (zzza2 != null) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzZt0, zzza2);
        }
    }

    @Override // com.aspose.words.zzZA2
    public final Node zzZ(Node node, Node node2, boolean z, zzZA5 zzza5) throws Exception {
        for (zzZA2 zzza2 : this.zzZt0) {
            if (node2 != null) {
                node2 = zzza2.zzZ(node, node2, z, zzza5);
            }
        }
        return node2;
    }
}
