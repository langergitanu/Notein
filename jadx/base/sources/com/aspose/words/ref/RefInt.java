package com.aspose.words.ref;

/* JADX INFO: loaded from: classes5.dex */
public class RefInt {
    private int value;

    public RefInt(int i) {
        this.value = i;
    }

    public int get() {
        return this.value;
    }

    public int set(int i) {
        this.value = i;
        return i;
    }

    public String toString() {
        return Integer.toString(this.value);
    }

    public int set(long j) {
        return set((int) j);
    }

    public RefInt(long j) {
        this.value = (int) j;
    }
}
