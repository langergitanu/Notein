package com.google.firebase.firestore;

import androidx.core.util.Consumer;
import com.google.firebase.firestore.core.FirestoreClient;

/* JADX INFO: renamed from: com.google.firebase.firestore.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22607Oooo0oO implements Consumer {
    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        ((FirestoreClient) obj).setIndexAutoCreationEnabled(false);
    }
}
