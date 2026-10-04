package com.aspose.words;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzFL extends zz80 implements Cloneable, Iterable<zzFV> {
    private HashMap<Integer, zzFV> zzZe2 = new HashMap<>();

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<zzFV> iterator() {
        return this.zzZe2.values().iterator();
    }

    public final void remove(int i) {
        com.aspose.words.internal.zzZQF.zzY(this.zzZe2, Integer.valueOf(i));
    }

    public final zzFV zzLf(int i) {
        return (zzFV) com.aspose.words.internal.zzQW.zzZ(this.zzZe2, Integer.valueOf(i));
    }

    public final void zzZ(zzFV zzfv) {
        com.aspose.words.internal.zzZQF.zzY(this.zzZe2, Integer.valueOf(zzfv.getId()), zzfv);
    }

    public final zzFL zzZN8() {
        zzFL zzfl = (zzFL) memberwiseClone();
        zzfl.zzZe2 = new HashMap<>();
        Iterator<T> it = this.zzZe2.values().iterator();
        while (it.hasNext()) {
            zzfl.zzZ(((zzFV) it.next()).zzZNW());
        }
        zzfl.setExtensions(zzZBz());
        return zzfl;
    }
}
