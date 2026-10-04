package com.aspose.words.ref;

/* JADX INFO: loaded from: classes5.dex */
public class Ref<T> {
    private T value;

    public Ref(T t) {
        this.value = t;
    }

    public T get() {
        return this.value;
    }

    public T set(T t) {
        this.value = t;
        return t;
    }

    public String toString() {
        return this.value.toString();
    }
}
