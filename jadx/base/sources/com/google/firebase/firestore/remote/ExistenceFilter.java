package com.google.firebase.firestore.remote;

/* JADX INFO: loaded from: classes8.dex */
public final class ExistenceFilter {
    private final int count;
    private com.google.firestore.p565v1.BloomFilter unchangedNames;

    public ExistenceFilter(int i) {
        this.count = i;
    }

    public int getCount() {
        return this.count;
    }

    public com.google.firestore.p565v1.BloomFilter getUnchangedNames() {
        return this.unchangedNames;
    }

    public String toString() {
        return "ExistenceFilter{count=" + this.count + ", unchangedNames=" + this.unchangedNames + '}';
    }

    public ExistenceFilter(int i, com.google.firestore.p565v1.BloomFilter bloomFilter) {
        this.count = i;
        this.unchangedNames = bloomFilter;
    }
}
