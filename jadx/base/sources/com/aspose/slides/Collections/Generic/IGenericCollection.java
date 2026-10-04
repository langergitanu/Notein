package com.aspose.slides.Collections.Generic;

/* JADX INFO: loaded from: classes3.dex */
public interface IGenericCollection<T> extends IGenericEnumerable<T> {
    void addItem(T t);

    void clear();

    boolean containsItem(T t);

    void copyToTArray(T[] tArr, int i);

    boolean isReadOnly();

    boolean removeItem(T t);

    int size();
}
