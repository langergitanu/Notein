package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class ListLevelCollection implements Cloneable, Iterable<ListLevel> {
    private ArrayList<ListLevel> zzZm;

    public ListLevelCollection() {
        this.zzZm = new ArrayList<>();
    }

    private static int zzwZ(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1 || i == 2) {
            return 9;
        }
        throw new IllegalStateException("Unknown list type.");
    }

    public final void clear() {
        this.zzZm.clear();
    }

    public ListLevel get(int i) {
        return this.zzZm.get(i);
    }

    public int getCount() {
        return this.zzZm.size();
    }

    @Override // java.lang.Iterable
    public Iterator<ListLevel> iterator() {
        return this.zzZm.iterator();
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public void set(int i, ListLevel listLevel) {
        this.zzZm.set(i, listLevel);
    }

    public final void zzU(ListLevel listLevel) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, listLevel);
    }

    public final void zzZ(int i, DocumentBase documentBase) {
        int iZzwZ = zzwZ(i);
        while (this.zzZm.size() > iZzwZ) {
            ArrayList<ListLevel> arrayList = this.zzZm;
            Class.getSimpleName();
        }
        while (this.zzZm.size() < iZzwZ) {
            zzU(new ListLevel(documentBase, this.zzZm.size()));
        }
    }

    public final int zzwX(int i) {
        return Math.min(i, getCount() - 1);
    }

    public final ListLevel zzwY(int i) {
        if (getCount() == 0) {
            return null;
        }
        return get(zzwX(i));
    }

    public final ListLevelCollection zzz(DocumentBase documentBase) {
        ListLevelCollection listLevelCollection = (ListLevelCollection) memberwiseClone();
        listLevelCollection.zzZm = new ArrayList<>(this.zzZm.size());
        Iterator<ListLevel> it = this.zzZm.iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ(listLevelCollection.zzZm, it.next().zzA(documentBase));
        }
        return listLevelCollection;
    }

    public ListLevelCollection(DocumentBase documentBase, int i) {
        int iZzwZ = zzwZ(i);
        this.zzZm = new ArrayList<>(iZzwZ);
        for (int i2 = 0; i2 < iZzwZ; i2++) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzZm, new ListLevel(documentBase, i2));
        }
    }
}
