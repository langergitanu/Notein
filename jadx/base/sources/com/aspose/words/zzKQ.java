package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzKQ implements Iterable<zzKR> {
    private ArrayList<zzKR> zzZm = new ArrayList<>();

    public final void clear() {
        this.zzZm.clear();
    }

    public final int getCount() {
        return this.zzZm.size();
    }

    @Override // java.lang.Iterable
    public final Iterator<zzKR> iterator() {
        return this.zzZm.iterator();
    }

    public final zzKR zzM5(int i) {
        return this.zzZm.get(i);
    }

    public final zzKR zzRZ(String str) {
        for (zzKR zzkr : this.zzZm) {
            if (com.aspose.words.internal.zzZKN.equals(zzkr.getName(), str)) {
                return zzkr;
            }
        }
        return null;
    }

    public final int zzZ(zzKR zzkr) {
        com.aspose.words.internal.zzZ4.zzY((Object) zzkr, "value");
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, zzkr);
        return this.zzZm.size() - 1;
    }

    public final zzKQ zzZTK() {
        zzKQ zzkq = new zzKQ();
        Iterator<zzKR> it = this.zzZm.iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ(zzkq.zzZm, it.next().zzZTL());
        }
        return zzkq;
    }
}
