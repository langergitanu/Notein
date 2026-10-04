package com.google.firebase.firestore.model;

import com.google.firestore.p565v1.Value;
import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
public interface Document {
    public static final Comparator<Document> KEY_COMPARATOR = new OooO00o();

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ int lambda$static$0(Document document, Document document2) {
        return document.getKey().compareTo(document2.getKey());
    }

    ObjectValue getData();

    Value getField(FieldPath fieldPath);

    DocumentKey getKey();

    SnapshotVersion getReadTime();

    SnapshotVersion getVersion();

    boolean hasCommittedMutations();

    boolean hasLocalMutations();

    boolean hasPendingWrites();

    boolean isFoundDocument();

    boolean isNoDocument();

    boolean isUnknownDocument();

    boolean isValidDocument();

    MutableDocument mutableCopy();
}
