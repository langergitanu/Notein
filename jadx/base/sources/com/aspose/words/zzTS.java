package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzTS implements zzZA3 {
    private ArrayList<zzZA3> zzZsW = new ArrayList<>();

    @Override // com.aspose.words.zzZA5
    public final void zzW(Node node, Node node2) {
        Iterator<zzZA3> it = this.zzZsW.iterator();
        while (it.hasNext()) {
            it.next().zzW(node, node2);
        }
    }

    public final void zzZ(zzZA3 zzza3) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZsW, zzza3);
    }

    @Override // com.aspose.words.zzZA3
    public final void zzZ(zzYWB zzywb, zzYWB zzywb2) throws Exception {
        Iterator<zzZA3> it = this.zzZsW.iterator();
        while (it.hasNext()) {
            it.next().zzZ(zzywb, zzywb2);
        }
    }
}
