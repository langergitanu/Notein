package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYSL implements Iterable<zzYPE> {
    private ArrayList<zzYPE> zzXK = new ArrayList<>();

    public final int getCount() {
        return this.zzXK.size();
    }

    @Override // java.lang.Iterable
    public final Iterator<zzYPE> iterator() {
        return this.zzXK.iterator();
    }

    public final int zzYwX() {
        int iZzYts = 0;
        for (zzYPE zzype : this.zzXK) {
            if (zzype.zzYts() == Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            iZzYts += zzype.zzYts();
        }
        return iZzYts;
    }

    public final boolean zzYwY() {
        Iterator<zzYPE> it = this.zzXK.iterator();
        while (it.hasNext()) {
            if (it.next().zzYts() == Integer.MIN_VALUE) {
                return false;
            }
        }
        return true;
    }

    public final void zzZ(zzYPE zzype) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzXK, zzype);
    }

    public final zzYPE zzsE(int i) {
        return this.zzXK.get(i);
    }
}
