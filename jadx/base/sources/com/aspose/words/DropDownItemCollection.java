package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class DropDownItemCollection implements zzZCY, Iterable<String> {
    private ArrayList<String> zzZm = new ArrayList<>();

    private DropDownItemCollection zzZjR() {
        DropDownItemCollection dropDownItemCollection = new DropDownItemCollection();
        Iterator<String> it = iterator();
        while (it.hasNext()) {
            dropDownItemCollection.add(it.next());
        }
        return dropDownItemCollection;
    }

    public int add(String str) {
        int count = getCount();
        insert(count, str);
        return count;
    }

    public void clear() {
        this.zzZm.clear();
    }

    public boolean contains(String str) {
        return this.zzZm.contains(str);
    }

    @Override // com.aspose.words.zzZCY
    @ReservedForInternalUse
    @Deprecated
    public zzZCY deepCloneComplexAttr() {
        return zzZjR();
    }

    public String get(int i) {
        return this.zzZm.get(i);
    }

    public int getCount() {
        return this.zzZm.size();
    }

    public int indexOf(String str) {
        return this.zzZm.indexOf(str);
    }

    public void insert(int i, String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        if (getCount() >= 25) {
            throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("There can be a maximum of {0} items in a dropdown form field.", 25));
        }
        this.zzZm.add(i, str);
    }

    @Override // com.aspose.words.zzZCY
    @ReservedForInternalUse
    @Deprecated
    public boolean isInheritedComplexAttr() {
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<String> iterator() {
        return this.zzZm.iterator();
    }

    public void remove(String str) {
        this.zzZm.remove(str);
    }

    public void removeAt(int i) {
        this.zzZm.remove(i);
    }

    public void set(int i, String str) {
        this.zzZm.set(i, str);
    }
}
