package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;

/* JADX INFO: loaded from: classes3.dex */
public interface ISequenceCollection extends IGenericEnumerable<ISequence> {
    ISequence add(IShape iShape);

    void clear();

    int getCount();

    ISequence get_Item(int i);

    void remove(ISequence iSequence);

    void removeAt(int i);
}
