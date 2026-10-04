package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Function;

/* JADX INFO: renamed from: com.google.firebase.firestore.local.OooooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22674OooooO0 implements Function {
    @Override // com.google.firebase.firestore.util.Function
    public final Object apply(Object obj) {
        return SQLiteMutationQueue.lambda$getHighestUnacknowledgedBatchId$5((Cursor) obj);
    }
}
