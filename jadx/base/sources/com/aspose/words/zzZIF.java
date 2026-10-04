package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZIF implements Iterable<zzZAS> {
    private ArrayList<zzZAS> zzXK = new ArrayList<>();

    public final int getCount() {
        return this.zzXK.size();
    }

    @Override // java.lang.Iterable
    public final Iterator<zzZAS> iterator() {
        return this.zzXK.iterator();
    }

    public final int zzP(zzZAS zzzas) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzXK, zzzas);
        return this.zzXK.size() - 1;
    }

    public final zzZAS[] zzZ2v() {
        return (zzZAS[]) this.zzXK.toArray(new zzZAS[0]);
    }

    public final zzZAS zzzK(int i) {
        return this.zzXK.get(i);
    }
}
