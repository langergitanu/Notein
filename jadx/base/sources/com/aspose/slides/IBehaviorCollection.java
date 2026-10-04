package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;

/* JADX INFO: loaded from: classes3.dex */
public interface IBehaviorCollection extends IGenericEnumerable<IBehavior> {
    void add(IBehavior iBehavior);

    void clear();

    boolean contains(IBehavior iBehavior);

    int getCount();

    IBehavior get_Item(int i);

    int indexOf(IBehavior iBehavior);

    void insert(int i, IBehavior iBehavior);

    boolean remove(IBehavior iBehavior);

    void removeAt(int i);

    void set_Item(int i, IBehavior iBehavior);
}
