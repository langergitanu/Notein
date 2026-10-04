package com.aspose.slides.Collections;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public interface IEnumerator<T> extends Iterator<T> {
    @Override // java.util.Iterator
    boolean hasNext();

    @Override // java.util.Iterator
    T next();

    void reset();
}
