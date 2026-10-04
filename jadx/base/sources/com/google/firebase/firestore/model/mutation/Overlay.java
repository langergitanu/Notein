package com.google.firebase.firestore.model.mutation;

import com.google.firebase.firestore.model.DocumentKey;

/* JADX INFO: loaded from: classes8.dex */
public abstract class Overlay {
    public static Overlay create(int i, Mutation mutation) {
        return new AutoValue_Overlay(i, mutation);
    }

    public DocumentKey getKey() {
        return getMutation().getKey();
    }

    public abstract int getLargestBatchId();

    public abstract Mutation getMutation();
}
