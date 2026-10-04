package com.google.firebase.firestore.remote;

import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.DocumentViewChange;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.util.Assert;
import com.google.protobuf.ByteString;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class TargetState {
    private int outstandingResponses = 0;
    private final Map<DocumentKey, DocumentViewChange.Type> documentChanges = new HashMap();
    private boolean hasChanges = true;
    private ByteString resumeToken = ByteString.EMPTY;
    private boolean current = false;

    /* JADX INFO: renamed from: com.google.firebase.firestore.remote.TargetState$1 */
    public static /* synthetic */ class C170911 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$firebase$firestore$core$DocumentViewChange$Type */
        static final /* synthetic */ int[] f51811x33862af7;

        static {
            int[] iArr = new int[DocumentViewChange.Type.values().length];
            f51811x33862af7 = iArr;
            try {
                iArr[DocumentViewChange.Type.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51811x33862af7[DocumentViewChange.Type.MODIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51811x33862af7[DocumentViewChange.Type.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public void addDocumentChange(DocumentKey documentKey, DocumentViewChange.Type type) {
        this.hasChanges = true;
        this.documentChanges.put(documentKey, type);
    }

    public void clearChanges() {
        this.hasChanges = false;
        this.documentChanges.clear();
    }

    public boolean hasChanges() {
        return this.hasChanges;
    }

    public boolean isCurrent() {
        return this.current;
    }

    public boolean isPending() {
        return this.outstandingResponses != 0;
    }

    public void markCurrent() {
        this.hasChanges = true;
        this.current = true;
    }

    public void recordPendingTargetRequest() {
        this.outstandingResponses++;
    }

    public void recordTargetResponse() {
        this.outstandingResponses--;
    }

    public void removeDocumentChange(DocumentKey documentKey) {
        this.hasChanges = true;
        this.documentChanges.remove(documentKey);
    }

    public TargetChange toTargetChange() {
        ImmutableSortedSet<DocumentKey> immutableSortedSetEmptyKeySet = DocumentKey.emptyKeySet();
        ImmutableSortedSet<DocumentKey> immutableSortedSetEmptyKeySet2 = DocumentKey.emptyKeySet();
        ImmutableSortedSet<DocumentKey> immutableSortedSetEmptyKeySet3 = DocumentKey.emptyKeySet();
        ImmutableSortedSet<DocumentKey> immutableSortedSetInsert = immutableSortedSetEmptyKeySet;
        ImmutableSortedSet<DocumentKey> immutableSortedSetInsert2 = immutableSortedSetEmptyKeySet2;
        ImmutableSortedSet<DocumentKey> immutableSortedSetInsert3 = immutableSortedSetEmptyKeySet3;
        for (Map.Entry<DocumentKey, DocumentViewChange.Type> entry : this.documentChanges.entrySet()) {
            DocumentKey key = entry.getKey();
            DocumentViewChange.Type value = entry.getValue();
            int i = C170911.f51811x33862af7[value.ordinal()];
            if (i == 1) {
                immutableSortedSetInsert = immutableSortedSetInsert.insert(key);
            } else if (i == 2) {
                immutableSortedSetInsert2 = immutableSortedSetInsert2.insert(key);
            } else {
                if (i != 3) {
                    throw Assert.fail("Encountered invalid change type: %s", value);
                }
                immutableSortedSetInsert3 = immutableSortedSetInsert3.insert(key);
            }
        }
        return new TargetChange(this.resumeToken, this.current, immutableSortedSetInsert, immutableSortedSetInsert2, immutableSortedSetInsert3);
    }

    public void updateResumeToken(ByteString byteString) {
        if (byteString.isEmpty()) {
            return;
        }
        this.hasChanges = true;
        this.resumeToken = byteString;
    }
}
