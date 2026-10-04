package com.aspose.slides.Collections.Generic;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Comparer<T> implements Comparator<T> {

    /* JADX INFO: renamed from: k4 */
    static Comparer f1589k4 = new C0271k4();

    public static <T> Comparer<T> getDefault() {
        return f1589k4;
    }

    @Override // java.util.Comparator
    public abstract int compare(T t, T t2);
}
