package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes8.dex */
@ElementTypesAreNonnullByDefault
final class NullnessCasts {
    private NullnessCasts() {
    }

    @ParametricNullness
    public static <T> T uncheckedCastNullableTToT(T t) {
        return t;
    }

    @ParametricNullness
    public static <T> T uncheckedNull() {
        return null;
    }
}
