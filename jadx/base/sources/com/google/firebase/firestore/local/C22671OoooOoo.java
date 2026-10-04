package com.google.firebase.firestore.local;

import com.google.firebase.firestore.model.mutation.MutationBatch;
import java.util.Comparator;

/* JADX INFO: renamed from: com.google.firebase.firestore.local.OoooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22671OoooOoo implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return SQLiteMutationQueue.lambda$getAllMutationBatchesAffectingDocumentKeys$9((MutationBatch) obj, (MutationBatch) obj2);
    }
}
