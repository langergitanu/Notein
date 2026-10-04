package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.ICollection;

/* JADX INFO: loaded from: classes3.dex */
public interface IGenericCollection<T> extends IGenericEnumerable<T>, ICollection<T> {
    IGenericEnumerator<T> iteratorJava();
}
