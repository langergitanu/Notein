package com.google.firebase.firestore.local;

import com.google.firebase.firestore.model.DocumentKey;
import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
class DocumentReference {
    static final Comparator<DocumentReference> BY_KEY = new OooO00o();
    static final Comparator<DocumentReference> BY_TARGET = new OooO0O0();
    private final DocumentKey key;
    private final int targetOrBatchId;

    public DocumentReference(DocumentKey documentKey, int i) {
        this.key = documentKey;
        this.targetOrBatchId = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(DocumentReference documentReference, DocumentReference documentReference2) {
        int iCompareTo2 = documentReference.key.compareTo(documentReference2.key);
        return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(documentReference.targetOrBatchId, documentReference2.targetOrBatchId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$1(DocumentReference documentReference, DocumentReference documentReference2) {
        int iCompare = Integer.compare(documentReference.targetOrBatchId, documentReference2.targetOrBatchId);
        return iCompare != 0 ? iCompare : documentReference.key.compareTo(documentReference2.key);
    }

    public int getId() {
        return this.targetOrBatchId;
    }

    public DocumentKey getKey() {
        return this.key;
    }
}
