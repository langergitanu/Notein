package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzXZC implements Iterable<zzXZD> {
    private ArrayList<zzXZD> zzYtn = new ArrayList<>();

    public final int getCount() {
        return this.zzYtn.size();
    }

    @Override // java.lang.Iterable
    public final Iterator<zzXZD> iterator() {
        return this.zzYtn.iterator();
    }

    public final void zzZ(String str, zzXZH zzxzh) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzYtn, new zzXZD(str, zzxzh));
    }

    public final zzXZD zzhi(int i) {
        return this.zzYtn.get(i);
    }
}
