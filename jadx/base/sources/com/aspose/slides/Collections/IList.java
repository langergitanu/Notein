package com.aspose.slides.Collections;

/* JADX INFO: loaded from: classes3.dex */
public interface IList extends ICollection {
    int addItem(Object obj);

    void clear();

    boolean contains(Object obj);

    Object get_Item(int i);

    int indexOf(Object obj);

    void insertItem(int i, Object obj);

    boolean isFixedSize();

    boolean isReadOnly();

    void removeAt(int i);

    void removeItem(Object obj);

    void set_Item(int i, Object obj);
}
