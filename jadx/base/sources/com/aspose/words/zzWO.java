package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzWO implements zzZCY, Iterable<zzZS> {
    private ArrayList<zzZS> zzZm = new ArrayList<>();

    @Override // com.aspose.words.zzZCY
    public final zzZCY deepCloneComplexAttr() {
        zzWO zzwo = new zzWO();
        for (int i = 0; i < this.zzZm.size(); i++) {
            zzwo.zzU(zzOs(i).zzbn());
        }
        return zzwo;
    }

    public final int getCount() {
        return this.zzZm.size();
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (zzZS zzzs : this.zzZm) {
            if (zzzs != null) {
                iHashCode = (iHashCode * 397) ^ zzzs.hashCode();
            }
        }
        return iHashCode;
    }

    @Override // com.aspose.words.zzZCY
    public final boolean isInheritedComplexAttr() {
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<zzZS> iterator() {
        return this.zzZm.iterator();
    }

    public final zzWP zzOs(int i) {
        return (zzWP) this.zzZm.get(i);
    }

    public final void zzT(zzZS zzzs) {
        this.zzZm.add(0, zzzs);
    }

    public final void zzU(zzZS zzzs) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, zzzs);
    }
}
