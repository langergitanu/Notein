package com.aspose.words;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class DocumentPropertyCollection implements Iterable<DocumentProperty> {
    private com.aspose.words.internal.zzZYT<DocumentProperty> zzmQ = new com.aspose.words.internal.zzZYT<>(false);

    public void clear() {
        this.zzmQ.clear();
    }

    public boolean contains(String str) {
        return this.zzmQ.containsKey(str);
    }

    public DocumentProperty get(String str) {
        com.aspose.words.internal.zzZ4.zzU(str, "name");
        return (DocumentProperty) com.aspose.words.internal.zzQW.zzZ((com.aspose.words.internal.zzZYT) this.zzmQ, str);
    }

    public int getCount() {
        return this.zzmQ.getCount();
    }

    public int indexOf(String str) {
        return this.zzmQ.indexOfKey(str);
    }

    @Override // java.lang.Iterable
    public Iterator<DocumentProperty> iterator() {
        return this.zzmQ.zzl9().iterator();
    }

    public void remove(String str) {
        com.aspose.words.internal.zzZ4.zzU(str, "name");
        this.zzmQ.remove(str);
    }

    public void removeAt(int i) {
        this.zzmQ.removeAt(i);
    }

    public abstract DocumentPropertyCollection zz7d();

    public final DocumentProperty zzS(String str, Object obj) {
        com.aspose.words.internal.zzZ4.zzU(str, "name");
        com.aspose.words.internal.zzZ4.zzY(obj, "value");
        DocumentProperty documentProperty = new DocumentProperty(str, obj);
        this.zzmQ.zzB(str, documentProperty);
        return documentProperty;
    }

    public final DocumentProperty zzT(String str, Object obj) {
        com.aspose.words.internal.zzZ4.zzU(str, "name");
        com.aspose.words.internal.zzZ4.zzY(obj, "value");
        DocumentProperty documentProperty = (DocumentProperty) com.aspose.words.internal.zzQW.zzZ((com.aspose.words.internal.zzZYT) this.zzmQ, str);
        return documentProperty != null ? documentProperty : zzS(str, obj);
    }

    public final DocumentPropertyCollection zzZoh() {
        DocumentPropertyCollection documentPropertyCollectionZz7d = zz7d();
        Iterator<Map.Entry<K, V>> it = this.zzmQ.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            documentPropertyCollectionZz7d.zzmQ.zzB((String) entry.getKey(), ((DocumentProperty) entry.getValue()).zzZoi());
        }
        return documentPropertyCollectionZz7d;
    }

    public DocumentProperty get(int i) {
        return this.zzmQ.zzVY(i);
    }
}
