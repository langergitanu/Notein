package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
class zzY5Y implements zzZCY, Cloneable {
    private ArrayList<TextColumn> zzZm = new ArrayList<>();

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.words.zzZCY
    public zzZCY deepCloneComplexAttr() {
        zzY5Y zzy5y = (zzY5Y) memberwiseClone();
        zzy5y.zzZm = new ArrayList<>();
        Iterator<TextColumn> it = this.zzZm.iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ(zzy5y.zzZm, it.next().zzXW4());
        }
        return zzy5y;
    }

    public boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        zzY5Y zzy5y = (zzY5Y) obj;
        if (this.zzZm.size() != zzy5y.zzZm.size()) {
            return false;
        }
        for (int i = 0; i < this.zzZm.size(); i++) {
            if (!com.aspose.words.internal.zzAN.zzL(get(i).getWidth(), zzy5y.get(i).getWidth()) || !com.aspose.words.internal.zzAN.zzL(get(i).getSpaceAfter(), zzy5y.get(i).getSpaceAfter())) {
                return false;
            }
        }
        return true;
    }

    public final TextColumn get(int i) {
        return this.zzZm.get(i);
    }

    public final int getCount() {
        return this.zzZm.size();
    }

    public int hashCode() {
        int iZzXW2 = 0;
        for (int i = 0; i < this.zzZm.size(); i++) {
            iZzXW2 = get(i).zzXW2() ^ ((get(i).zzXW3() * 397) + iZzXW2);
        }
        return iZzXW2;
    }

    @Override // com.aspose.words.zzZCY
    @ReservedForInternalUse
    @Deprecated
    public boolean isInheritedComplexAttr() {
        return false;
    }

    public final void removeAt(int i) {
        this.zzZm.remove(i);
    }

    public final void setCount(int i) {
        if (this.zzZm.size() < i) {
            while (this.zzZm.size() < i) {
                zzZ(new TextColumn());
            }
        } else {
            while (this.zzZm.size() > i) {
                removeAt(this.zzZm.size() - 1);
            }
        }
    }

    public final boolean zzXW1() {
        Iterator<TextColumn> it = this.zzZm.iterator();
        while (it.hasNext()) {
            if (it.next().zzXW1()) {
                return true;
            }
        }
        return false;
    }

    public final void zzZ(TextColumn textColumn) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, textColumn);
    }
}
