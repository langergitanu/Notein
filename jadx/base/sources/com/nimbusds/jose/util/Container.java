package com.nimbusds.jose.util;

/* JADX INFO: loaded from: classes9.dex */
public class Container<T> {
    private T item;

    public Container() {
    }

    public T get() {
        return this.item;
    }

    public void set(T t) {
        this.item = t;
    }

    public Container(T t) {
        this.item = t;
    }
}
