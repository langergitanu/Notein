package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class CustomXmlSchemaCollection implements Iterable<String> {
    private ArrayList<String> zzZm = new ArrayList<>();

    public void add(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, str);
    }

    public void clear() {
        this.zzZm.clear();
    }

    public CustomXmlSchemaCollection deepClone() {
        CustomXmlSchemaCollection customXmlSchemaCollection = new CustomXmlSchemaCollection();
        Iterator<String> it = iterator();
        while (it.hasNext()) {
            customXmlSchemaCollection.add(it.next());
        }
        return customXmlSchemaCollection;
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
