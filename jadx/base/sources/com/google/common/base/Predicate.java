package com.google.common.base;

/* JADX INFO: loaded from: classes6.dex */
@ElementTypesAreNonnullByDefault
public interface Predicate<T> {
    boolean apply(@ParametricNullness T t);

    boolean equals(Object obj);
}
