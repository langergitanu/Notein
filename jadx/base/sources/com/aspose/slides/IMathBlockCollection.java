package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;

/* JADX INFO: loaded from: classes3.dex */
public interface IMathBlockCollection extends IGenericEnumerable<IMathBlock> {
    void add(IMathBlock iMathBlock);

    void clear();

    boolean contains(IMathBlock iMathBlock);

    int getCount();

    IMathBlock get_Item(int i);

    int indexOf(IMathBlock iMathBlock);

    void insert(int i, IMathBlock iMathBlock);

    boolean remove(IMathBlock iMathBlock);

    void removeAt(int i);

    void set_Item(int i, IMathBlock iMathBlock);
}
