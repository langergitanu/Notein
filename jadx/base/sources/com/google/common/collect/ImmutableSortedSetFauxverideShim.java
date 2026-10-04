package com.google.common.collect;

import com.google.common.collect.ImmutableSortedSet;

/* JADX INFO: loaded from: classes8.dex */
@ElementTypesAreNonnullByDefault
abstract class ImmutableSortedSetFauxverideShim<E> extends ImmutableSet<E> {
    @Deprecated
    public static <E> ImmutableSortedSet.Builder<E> builder() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <E> ImmutableSortedSet.Builder<E> builderWithExpectedSize(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <E> ImmutableSortedSet<E> copyOf(E[] eArr) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    /* JADX INFO: renamed from: of */
    public static <E> ImmutableSortedSet<E> m75208of(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    /* JADX INFO: renamed from: of */
    public static <E> ImmutableSortedSet<E> m75209of(E e, E e2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    /* JADX INFO: renamed from: of */
    public static <E> ImmutableSortedSet<E> m75210of(E e, E e2, E e3) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    /* JADX INFO: renamed from: of */
    public static <E> ImmutableSortedSet<E> m75211of(E e, E e2, E e3, E e4) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    /* JADX INFO: renamed from: of */
    public static <E> ImmutableSortedSet<E> m75212of(E e, E e2, E e3, E e4, E e5) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    /* JADX INFO: renamed from: of */
    public static <E> ImmutableSortedSet<E> m75213of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        throw new UnsupportedOperationException();
    }
}
