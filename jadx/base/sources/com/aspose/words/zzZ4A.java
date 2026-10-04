package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ4A implements Iterable<zzZ4B> {
    private ArrayList<zzZ4B> zzZm = new ArrayList<>();

    public final void clear() {
        this.zzZm.clear();
    }

    public final int getCount() {
        return this.zzZm.size();
    }

    public final int hashCode() {
        Iterator<zzZ4B> it = this.zzZm.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 397) ^ it.next().hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public final Iterator<zzZ4B> iterator() {
        return this.zzZm.iterator();
    }

    public final void zzZ(zzZ4B zzz4b) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, zzz4b);
    }

    public final zzZ4B zzwW(int i) {
        return this.zzZm.get(i);
    }

    public final boolean zzZ(zzZ4A zzz4a) {
        return zzZ(zzz4a, new com.aspose.words.internal.zzIM<>());
    }

    public final boolean zzZ(zzZ4A zzz4a, com.aspose.words.internal.zzIM<com.aspose.words.internal.zz6R> zzim) {
        if (this.zzZm.size() != zzz4a.zzZm.size()) {
            return false;
        }
        for (int i = 0; i < this.zzZm.size(); i++) {
            if (!this.zzZm.get(i).zzZ(zzz4a.zzwW(i), zzim)) {
                return false;
            }
        }
        return true;
    }
}
