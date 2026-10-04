package com.google.firebase.firestore;

/* JADX INFO: loaded from: classes8.dex */
public final class PersistentCacheIndexManager {
    private FirestoreClientProvider client;

    public PersistentCacheIndexManager(FirestoreClientProvider firestoreClientProvider) {
        this.client = firestoreClientProvider;
    }

    public void deleteAllIndexes() {
        this.client.procedure(new C22608Oooo0oo());
    }

    public void disableIndexAutoCreation() {
        this.client.procedure(new C22607Oooo0oO());
    }

    public void enableIndexAutoCreation() {
        this.client.procedure(new C22605Oooo0o());
    }
}
