package com.aspose.slides.Collections.Generic;

/* JADX INFO: loaded from: classes3.dex */
public interface IGenericEqualityComparer<T> {
    boolean equals(Object obj, Object obj2);

    boolean equalsT(T t, T t2);

    int hashCode(Object obj);

    int hashCodeT(T t);
}
