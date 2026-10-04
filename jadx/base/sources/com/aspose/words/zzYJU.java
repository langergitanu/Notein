package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYJU implements Iterable<zzYJW> {
    private zzZ9K zzXCw;
    private ArrayList<zzYJW> zzZm = new ArrayList<>();

    public zzYJU(zzZ9K zzz9k) {
        this.zzXCw = zzz9k;
    }

    @Override // java.lang.Iterable
    public final Iterator<zzYJW> iterator() {
        return this.zzZm.iterator();
    }

    public final void zzY(zzYJW zzyjw) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, zzyjw);
        zzyjw.zzZ(this.zzXCw);
    }
}
