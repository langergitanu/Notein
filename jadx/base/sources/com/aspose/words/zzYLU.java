package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYLU implements Cloneable, Iterable<zzYLT> {
    private ArrayList<zzYLT> zzXEO = new ArrayList<>();

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final int getCount() {
        return this.zzXEO.size();
    }

    @Override // java.lang.Iterable
    public final Iterator<zzYLT> iterator() {
        return this.zzXEO.iterator();
    }

    public final zzYLU zzYnv() {
        zzYLU zzylu = (zzYLU) memberwiseClone();
        zzylu.zzXEO = new ArrayList<>();
        Iterator<zzYLT> it = iterator();
        while (it.hasNext()) {
            zzylu.zzZ(it.next().zzYnu());
        }
        return zzylu;
    }

    public final void zzZ(zzYLT zzylt) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzXEO, zzylt);
    }
}
