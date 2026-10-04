package com.google.common.base;

/* JADX INFO: loaded from: classes6.dex */
@ElementTypesAreNonnullByDefault
public interface Function<F, T> {
    @ParametricNullness
    T apply(@ParametricNullness F f);

    boolean equals(Object obj);
}
