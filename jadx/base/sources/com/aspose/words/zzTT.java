package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzTT implements zzZA5 {
    private ArrayList<zzZA5> zzZsW = new ArrayList<>();

    @Override // com.aspose.words.zzZA5
    public final void zzW(Node node, Node node2) {
        Iterator<zzZA5> it = this.zzZsW.iterator();
        while (it.hasNext()) {
            it.next().zzW(node, node2);
        }
    }

    public final void zzY(zzZA5 zzza5) {
        this.zzZsW.remove(zzza5);
    }

    public final void zzZ(zzZA5 zzza5) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZsW, zzza5);
    }

    public static zzZA5 zzZ(zzZA5... zzza5Arr) {
        zzTT zztt = new zzTT();
        for (int i = 0; i < 2; i++) {
            zzZA5 zzza5 = zzza5Arr[i];
            if (zzza5 != null) {
                zztt.zzZ(zzza5);
            }
        }
        return zztt;
    }
}
