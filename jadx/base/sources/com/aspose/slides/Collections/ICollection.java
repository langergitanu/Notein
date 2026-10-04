package com.aspose.slides.Collections;

import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: loaded from: classes3.dex */
public interface ICollection<T> extends IEnumerable<T> {
    void copyTo(AbstractC14092to abstractC14092to, int i);

    Object getSyncRoot();

    boolean isSynchronized();

    int size();
}
