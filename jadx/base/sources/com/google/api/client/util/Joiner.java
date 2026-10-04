package com.google.api.client.util;

/* JADX INFO: loaded from: classes7.dex */
public final class Joiner {
    private final com.google.common.base.Joiner wrapped;

    private Joiner(com.google.common.base.Joiner joiner) {
        this.wrapped = joiner;
    }

    /* JADX INFO: renamed from: on */
    public static Joiner m75071on(char c) {
        return new Joiner(com.google.common.base.Joiner.m75078on(c));
    }

    public final String join(Iterable<?> iterable) {
        return this.wrapped.join((Iterable<? extends Object>) iterable);
    }
}
