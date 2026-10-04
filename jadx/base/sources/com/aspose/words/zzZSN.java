package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZSN implements Iterable<zzZBJ> {
    private ArrayList<zzZBJ> zzZm = new ArrayList<>();

    public final int getCount() {
        return this.zzZm.size();
    }

    @Override // java.lang.Iterable
    public final Iterator<zzZBJ> iterator() {
        return this.zzZm.iterator();
    }

    public final void zzZ(zzZBJ zzzbj) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, zzzbj);
    }
}
