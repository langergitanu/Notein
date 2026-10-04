package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class TabStopCollection extends InternableComplexAttr implements IExpandableAttr, Cloneable {
    private boolean zzX73;
    private com.aspose.words.internal.zzZYV<TabStop> zzhu = new com.aspose.words.internal.zzZYV<>();

    private int zzY0p() {
        for (int i = 0; i < getCount(); i++) {
            if (get(i).zzY0A()) {
                return i;
            }
        }
        return -1;
    }

    private void zzko(int i) {
        notifyChanging();
        this.zzhu.remove(i);
    }

    private int zzkp(int i) {
        return this.zzhu.indexOfKey(i);
    }

    public void add(TabStop tabStop) {
        notifyChanging();
        if (tabStop == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: tabStop");
        }
        this.zzhu.set(tabStop.zzY0E(), tabStop);
    }

    public TabStop after(double d) {
        int iZzr = com.aspose.words.internal.zzSA.zzr(d);
        for (int i = 0; i < getCount(); i++) {
            if (zzkq(i) > iZzr) {
                TabStop tabStop = get(i);
                if (tabStop.getAlignment() != 4) {
                    return tabStop;
                }
            }
        }
        return null;
    }

    public TabStop before(double d) {
        int iZzr = com.aspose.words.internal.zzSA.zzr(d);
        for (int count = getCount() - 1; count >= 0; count--) {
            if (zzkq(count) < iZzr) {
                TabStop tabStop = get(count);
                if (tabStop.getAlignment() != 4) {
                    return tabStop;
                }
            }
        }
        return null;
    }

    public void clear() {
        notifyChanging();
        this.zzhu.clear();
    }

    @Override // com.aspose.words.IExpandableAttr
    @ReservedForInternalUse
    @Deprecated
    public void collapse(IExpandableAttr iExpandableAttr) {
        if (iExpandableAttr == null) {
            return;
        }
        TabStopCollection tabStopCollection = (TabStopCollection) iExpandableAttr;
        for (int i = 0; i < tabStopCollection.getCount(); i++) {
            TabStop tabStop = tabStopCollection.get(i);
            int indexByPosition = getIndexByPosition(tabStop.getPosition());
            if (indexByPosition < 0) {
                add(tabStop.getPosition(), 7, 0);
            } else if (get(indexByPosition).equals(tabStop)) {
                removeByIndex(indexByPosition);
            }
        }
    }

    @Override // com.aspose.words.zzZCY
    @ReservedForInternalUse
    @Deprecated
    public zzZCY deepCloneComplexAttr() {
        TabStopCollection tabStopCollection = (TabStopCollection) memberwiseClone();
        tabStopCollection.zzhu = new com.aspose.words.internal.zzZYV<>();
        for (int i = 0; i < getCount(); i++) {
            tabStopCollection.zzhu.add(zzkq(i), get(i).zzY0F());
        }
        return tabStopCollection;
    }

    public boolean equals(TabStopCollection tabStopCollection) {
        if (com.aspose.words.internal.zzZKO.zzA(null, tabStopCollection)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, tabStopCollection)) {
            return true;
        }
        if (this.zzX73 != tabStopCollection.zzX73 || getCount() != tabStopCollection.getCount()) {
            return false;
        }
        for (int i = 0; i < getCount(); i++) {
            if (!get(i).equals(tabStopCollection.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.aspose.words.IExpandableAttr
    @ReservedForInternalUse
    @Deprecated
    public IExpandableAttr expand(IExpandableAttr iExpandableAttr) {
        TabStopCollection tabStopCollection = iExpandableAttr != null ? (TabStopCollection) iExpandableAttr.deepCloneComplexAttr() : new TabStopCollection();
        int iZzY0p = tabStopCollection.zzY0p();
        for (int i = 0; i < getCount(); i++) {
            TabStop tabStop = get(i);
            if (tabStop.zzY0A() && iZzY0p != -1) {
                tabStopCollection.removeByIndex(iZzY0p);
                iZzY0p = tabStopCollection.getCount();
            }
            tabStopCollection.add(tabStop.zzY0F());
        }
        tabStopCollection.zzY0q();
        return tabStopCollection;
    }

    public TabStop get(int i) {
        return this.zzhu.zzVY(i);
    }

    public int getCount() {
        return this.zzhu.getCount();
    }

    public int getIndexByPosition(double d) {
        return zzkp(com.aspose.words.internal.zzSA.zzr(d));
    }

    public double getPositionByIndex(int i) {
        return ((double) zzkq(i)) / 20.0d;
    }

    public int hashCode() {
        return (this.zzhu.hashCode() * 397) ^ com.aspose.words.internal.zzZKP.zzYY(this.zzX73);
    }

    @Override // com.aspose.words.zzZCY
    @ReservedForInternalUse
    @Deprecated
    public boolean isInheritedComplexAttr() {
        return false;
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public void removeByIndex(int i) {
        notifyChanging();
        this.zzhu.removeAt(i);
    }

    public void removeByPosition(double d) {
        zzko(com.aspose.words.internal.zzSA.zzr(d));
    }

    public final void zzPK(boolean z) {
        this.zzX73 = z;
    }

    public final TabStop zzY0o() {
        int iZzY0p = zzY0p();
        if (iZzY0p >= 0) {
            return get(iZzY0p);
        }
        return null;
    }

    public final void zzY0q() {
        if (getCount() == 0) {
            return;
        }
        notifyChanging();
        for (int count = getCount() - 1; count > 0; count--) {
            TabStop tabStop = get(count);
            TabStop tabStop2 = get(count - 1);
            if (tabStop.isClear() && tabStop2.isClear() && tabStop.zzY0E() - tabStop2.zzY0E() <= 25) {
                removeByIndex(count);
            }
        }
    }

    public final float[] zzY0r() {
        int i = 0;
        for (int i2 = 0; i2 < getCount(); i2++) {
            if (get(i2).getAlignment() == 4) {
                i++;
            }
        }
        float[] fArr = new float[i];
        int i3 = 0;
        for (int i4 = 0; i4 < getCount(); i4++) {
            if (get(i4).getAlignment() == 4) {
                fArr[i3] = (float) get(i4).getPosition();
                i3++;
            }
        }
        return fArr;
    }

    public final boolean zzY0s() {
        if (this.zzX73) {
            return true;
        }
        for (int i = 0; i < getCount(); i++) {
            if (get(i).zzY0D() != 0) {
                return true;
            }
        }
        return false;
    }

    public final TabStopCollection zzY0t() {
        TabStopCollection tabStopCollection = (TabStopCollection) memberwiseClone();
        tabStopCollection.zzhu = new com.aspose.words.internal.zzZYV<>();
        for (int i = 0; i < getCount(); i++) {
            tabStopCollection.zzhu.add(this.zzhu.zzT3(i), this.zzhu.zzVY(i).zzY0F());
        }
        return tabStopCollection;
    }

    public final void zzYpj() {
        notifyChanging();
        for (int count = getCount() - 1; count >= 0; count--) {
            if (get(count).isClear()) {
                removeByIndex(count);
            }
        }
    }

    public final int zzkq(int i) {
        return this.zzhu.zzT3(i);
    }

    public final TabStop zzkr(int i) {
        return this.zzhu.get(i);
    }

    public TabStop get(double d) {
        return zzkr(com.aspose.words.internal.zzSA.zzr(d));
    }

    public void add(double d, int i, int i2) {
        add(new TabStop(d, i, i2));
    }

    public boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != TabStopCollection.class) {
            return false;
        }
        return equals((TabStopCollection) obj);
    }
}
