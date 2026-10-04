package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;

/* JADX INFO: loaded from: classes3.dex */
public interface IPortionCollection extends IGenericEnumerable<IPortion> {
    void add(IPortion iPortion);

    void clear();

    boolean contains(IPortion iPortion);

    int getCount();

    IPortion get_Item(int i);

    int indexOf(IPortion iPortion);

    void insert(int i, IPortion iPortion);

    boolean remove(IPortion iPortion);

    void removeAt(int i);
}
