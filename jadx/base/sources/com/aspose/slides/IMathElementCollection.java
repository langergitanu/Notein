package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;

/* JADX INFO: loaded from: classes3.dex */
public interface IMathElementCollection extends IGenericEnumerable<IMathElement> {
    void add(IMathElement iMathElement);

    void clear();

    boolean contains(IMathElement iMathElement);

    void copyTo(IMathElement[] iMathElementArr, int i);

    int getCount();

    IMathElement get_Item(int i);

    int indexOf(IMathElement iMathElement);

    void insert(int i, IMathElement iMathElement);

    boolean remove(IMathElement iMathElement);

    void removeAt(int i);
}
