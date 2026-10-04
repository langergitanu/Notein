package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class CustomXmlPropertyCollection implements Iterable<CustomXmlProperty> {
    private com.aspose.words.internal.zzZYT<CustomXmlProperty> zzmQ = new com.aspose.words.internal.zzZYT<>();

    public void add(CustomXmlProperty customXmlProperty) {
        this.zzmQ.zzB(customXmlProperty.getName(), customXmlProperty);
    }

    public void clear() {
        this.zzmQ.clear();
    }

    public boolean contains(String str) {
        return this.zzmQ.containsKey(str);
    }

    public CustomXmlProperty get(String str) {
        return (CustomXmlProperty) com.aspose.words.internal.zzQW.zzZ((com.aspose.words.internal.zzZYT) this.zzmQ, str);
    }

    public int getCount() {
        return this.zzmQ.getCount();
    }

    public int indexOfKey(String str) {
        return this.zzmQ.indexOfKey(str);
    }

    @Override // java.lang.Iterable
    public Iterator<CustomXmlProperty> iterator() {
        return this.zzmQ.zzl9().iterator();
    }

    public void remove(String str) {
        this.zzmQ.remove(str);
    }

    public void removeAt(int i) {
        this.zzmQ.removeAt(i);
    }

    public final void zzZ(CustomXmlProperty customXmlProperty) {
        this.zzmQ.set(customXmlProperty.getName(), customXmlProperty);
    }

    public final CustomXmlPropertyCollection zzZTD() {
        CustomXmlPropertyCollection customXmlPropertyCollection = new CustomXmlPropertyCollection();
        Iterator<CustomXmlProperty> it = iterator();
        while (it.hasNext()) {
            customXmlPropertyCollection.add(it.next().zzZTE());
        }
        return customXmlPropertyCollection;
    }

    public CustomXmlProperty get(int i) {
        return this.zzmQ.zzVY(i);
    }
}
