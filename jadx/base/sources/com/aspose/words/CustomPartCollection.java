package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class CustomPartCollection implements Iterable<CustomPart> {
    private ArrayList<CustomPart> zzZm = new ArrayList<>();

    public void add(CustomPart customPart) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, customPart);
    }

    public void clear() {
        this.zzZm.clear();
    }

    public CustomPartCollection deepClone() {
        CustomPartCollection customPartCollection = new CustomPartCollection();
        Iterator<CustomPart> it = this.zzZm.iterator();
        while (it.hasNext()) {
            customPartCollection.add(it.next().deepClone());
        }
        return customPartCollection;
    }

    public CustomPart get(int i) {
        return this.zzZm.get(i);
    }

    public int getCount() {
        return this.zzZm.size();
    }

    @Override // java.lang.Iterable
    public Iterator<CustomPart> iterator() {
        return this.zzZm.iterator();
    }

    public void removeAt(int i) {
        this.zzZm.remove(i);
    }

    public void set(int i, CustomPart customPart) {
        this.zzZm.set(i, customPart);
    }
}
