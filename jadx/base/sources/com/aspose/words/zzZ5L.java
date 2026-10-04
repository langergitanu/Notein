package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ5L {
    private ArrayList<Integer> zzYex = new ArrayList<>();

    private void zzxN(int i) {
        if (!this.zzYex.contains(21) && zzZ5M.zzxP(i)) {
            Iterator<T> it = this.zzYex.iterator();
            boolean z = false;
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (zzZ5M.zzxO(iIntValue) && zzZ5M.zzxQ(iIntValue) != i) {
                    z = true;
                }
            }
            if (z) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<int>) this.zzYex, 21);
            }
        }
    }

    public final void add(int i) {
        if (this.zzYex.contains(Integer.valueOf(i))) {
            return;
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzYex, Integer.valueOf(i));
        zzxN(i);
    }

    public final int[] zzYRe() {
        int[] iArr = new int[this.zzYex.size()];
        for (int i = 0; i < this.zzYex.size(); i++) {
            iArr[i] = this.zzYex.get(i).intValue();
        }
        return iArr;
    }
}
