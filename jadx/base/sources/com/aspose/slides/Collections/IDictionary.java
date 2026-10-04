package com.aspose.slides.Collections;

/* JADX INFO: loaded from: classes3.dex */
public interface IDictionary extends ICollection {
    void addItem(Object obj, Object obj2);

    void clear();

    boolean contains(Object obj);

    ICollection getKeys();

    ICollection getValues();

    Object get_Item(Object obj);

    boolean isFixedSize();

    boolean isReadOnly();

    @Override // com.aspose.slides.Collections.IEnumerable, java.lang.Iterable
    IDictionaryEnumerator iterator();

    void removeItem(Object obj);

    void set_Item(Object obj, Object obj2);
}
