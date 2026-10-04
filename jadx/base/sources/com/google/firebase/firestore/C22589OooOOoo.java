package com.google.firebase.firestore;

import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.util.Function;

/* JADX INFO: renamed from: com.google.firebase.firestore.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22589OooOOoo implements Function {
    @Override // com.google.firebase.firestore.util.Function
    public final Object apply(Object obj) {
        return ((FirestoreClient) obj).disableNetwork();
    }
}
