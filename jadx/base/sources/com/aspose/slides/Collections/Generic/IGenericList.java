package com.aspose.slides.Collections.Generic;

/* JADX INFO: loaded from: classes3.dex */
public interface IGenericList<T> extends IGenericCollection<T> {
    T get_Item(int i);

    int indexOfItem(T t);

    void insertItem(int i, T t);

    void removeAt(int i);

    void set_Item(int i, T t);
}
