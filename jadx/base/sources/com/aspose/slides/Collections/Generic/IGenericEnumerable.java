package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.IEnumerable;

/* JADX INFO: loaded from: classes3.dex */
public interface IGenericEnumerable<T> extends IEnumerable<T> {
    @Override // com.aspose.slides.Collections.IEnumerable, java.lang.Iterable
    IGenericEnumerator<T> iterator();
}
