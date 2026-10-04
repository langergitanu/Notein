package com.google.firebase.firestore.core;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.DocumentViewChange;
import com.google.firebase.firestore.core.LimboDocumentChange;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.core.ViewSnapshot;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.DocumentSet;
import com.google.firebase.firestore.remote.TargetChange;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class View {
    private boolean current;
    private DocumentSet documentSet;
    private final Query query;
    private ImmutableSortedSet<DocumentKey> syncedDocuments;
    private ViewSnapshot.SyncState syncState = ViewSnapshot.SyncState.NONE;
    private ImmutableSortedSet<DocumentKey> limboDocuments = DocumentKey.emptyKeySet();
    private ImmutableSortedSet<DocumentKey> mutatedKeys = DocumentKey.emptyKeySet();

    /* JADX INFO: renamed from: com.google.firebase.firestore.core.View$1 */
    public static /* synthetic */ class C170621 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$firebase$firestore$core$DocumentViewChange$Type */
        static final /* synthetic */ int[] f51778x33862af7;

        static {
            int[] iArr = new int[DocumentViewChange.Type.values().length];
            f51778x33862af7 = iArr;
            try {
                iArr[DocumentViewChange.Type.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51778x33862af7[DocumentViewChange.Type.MODIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51778x33862af7[DocumentViewChange.Type.METADATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51778x33862af7[DocumentViewChange.Type.REMOVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class DocumentChanges {
        final DocumentViewChangeSet changeSet;
        final DocumentSet documentSet;
        final ImmutableSortedSet<DocumentKey> mutatedKeys;
        private final boolean needsRefill;

        public /* synthetic */ DocumentChanges(DocumentSet documentSet, DocumentViewChangeSet documentViewChangeSet, ImmutableSortedSet immutableSortedSet, boolean z, C170621 c170621) {
            this(documentSet, documentViewChangeSet, immutableSortedSet, z);
        }

        public boolean needsRefill() {
            return this.needsRefill;
        }

        private DocumentChanges(DocumentSet documentSet, DocumentViewChangeSet documentViewChangeSet, ImmutableSortedSet<DocumentKey> immutableSortedSet, boolean z) {
            this.documentSet = documentSet;
            this.changeSet = documentViewChangeSet;
            this.mutatedKeys = immutableSortedSet;
            this.needsRefill = z;
        }
    }

    public View(Query query, ImmutableSortedSet<DocumentKey> immutableSortedSet) {
        this.query = query;
        this.documentSet = DocumentSet.emptySet(query.comparator());
        this.syncedDocuments = immutableSortedSet;
    }

    private void applyTargetChange(TargetChange targetChange) {
        if (targetChange != null) {
            Iterator<DocumentKey> it = targetChange.getAddedDocuments().iterator();
            while (it.hasNext()) {
                this.syncedDocuments = this.syncedDocuments.insert(it.next());
            }
            for (DocumentKey documentKey : targetChange.getModifiedDocuments()) {
                Assert.hardAssert(this.syncedDocuments.contains(documentKey), "Modified document %s not found in view.", documentKey);
            }
            Iterator<DocumentKey> it2 = targetChange.getRemovedDocuments().iterator();
            while (it2.hasNext()) {
                this.syncedDocuments = this.syncedDocuments.remove(it2.next());
            }
            this.current = targetChange.isCurrent();
        }
    }

    private static int changeTypeOrder(DocumentViewChange documentViewChange) {
        int i = C170621.f51778x33862af7[documentViewChange.getType().ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 3) {
                if (i == 4) {
                    return 0;
                }
                throw new IllegalArgumentException("Unknown change type: " + documentViewChange.getType());
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ int lambda$applyChanges$0(DocumentViewChange documentViewChange, DocumentViewChange documentViewChange2) {
        int iCompare = Integer.compare(changeTypeOrder(documentViewChange), changeTypeOrder(documentViewChange2));
        return iCompare != 0 ? iCompare : this.query.comparator().compare(documentViewChange.getDocument(), documentViewChange2.getDocument());
    }

    private boolean shouldBeLimboDoc(DocumentKey documentKey) {
        Document document;
        return (this.syncedDocuments.contains(documentKey) || (document = this.documentSet.getDocument(documentKey)) == null || document.hasLocalMutations()) ? false : true;
    }

    private boolean shouldWaitForSyncedDocument(Document document, Document document2) {
        return document.hasLocalMutations() && document2.hasCommittedMutations() && !document2.hasLocalMutations();
    }

    private List<LimboDocumentChange> updateLimboDocuments() {
        if (!this.current) {
            return Collections.EMPTY_LIST;
        }
        ImmutableSortedSet<DocumentKey> immutableSortedSet = this.limboDocuments;
        this.limboDocuments = DocumentKey.emptyKeySet();
        for (Document document : this.documentSet) {
            if (shouldBeLimboDoc(document.getKey())) {
                this.limboDocuments = this.limboDocuments.insert(document.getKey());
            }
        }
        ArrayList arrayList = new ArrayList(this.limboDocuments.size() + immutableSortedSet.size());
        for (DocumentKey documentKey : immutableSortedSet) {
            if (!this.limboDocuments.contains(documentKey)) {
                arrayList.add(new LimboDocumentChange(LimboDocumentChange.Type.REMOVED, documentKey));
            }
        }
        for (DocumentKey documentKey2 : this.limboDocuments) {
            if (!immutableSortedSet.contains(documentKey2)) {
                arrayList.add(new LimboDocumentChange(LimboDocumentChange.Type.ADDED, documentKey2));
            }
        }
        return arrayList;
    }

    public ViewChange applyChanges(DocumentChanges documentChanges) {
        return applyChanges(documentChanges, null);
    }

    public ViewChange applyOnlineStateChange(OnlineState onlineState) {
        if (!this.current || onlineState != OnlineState.OFFLINE) {
            return new ViewChange(null, Collections.EMPTY_LIST);
        }
        this.current = false;
        return applyChanges(new DocumentChanges(this.documentSet, new DocumentViewChangeSet(), this.mutatedKeys, false, null));
    }

    public DocumentChanges computeDocChanges(ImmutableSortedMap<DocumentKey, Document> immutableSortedMap) {
        return computeDocChanges(immutableSortedMap, null);
    }

    public ImmutableSortedSet<DocumentKey> getLimboDocuments() {
        return this.limboDocuments;
    }

    public ViewSnapshot.SyncState getSyncState() {
        return this.syncState;
    }

    public ImmutableSortedSet<DocumentKey> getSyncedDocuments() {
        return this.syncedDocuments;
    }

    public ViewChange applyChanges(DocumentChanges documentChanges, TargetChange targetChange) {
        return applyChanges(documentChanges, targetChange, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DocumentChanges computeDocChanges(ImmutableSortedMap<DocumentKey, Document> immutableSortedMap, DocumentChanges documentChanges) {
        boolean z;
        ImmutableSortedSet<DocumentKey> immutableSortedSetRemove;
        DocumentViewChangeSet documentViewChangeSet = documentChanges != null ? documentChanges.changeSet : new DocumentViewChangeSet();
        DocumentSet documentSet = documentChanges != null ? documentChanges.documentSet : this.documentSet;
        ImmutableSortedSet<DocumentKey> immutableSortedSetRemove2 = documentChanges != null ? documentChanges.mutatedKeys : this.mutatedKeys;
        Document lastDocument = (this.query.getLimitType().equals(Query.LimitType.LIMIT_TO_FIRST) && ((long) documentSet.size()) == this.query.getLimit()) ? documentSet.getLastDocument() : null;
        Document firstDocument = (this.query.getLimitType().equals(Query.LimitType.LIMIT_TO_LAST) && ((long) documentSet.size()) == this.query.getLimit()) ? documentSet.getFirstDocument() : null;
        DocumentSet documentSetRemove = documentSet;
        boolean z2 = false;
        for (Map.Entry<DocumentKey, Document> entry : immutableSortedMap) {
            DocumentKey key = entry.getKey();
            Document document = documentSet.getDocument(key);
            Document value = this.query.matches(entry.getValue()) ? entry.getValue() : null;
            boolean z3 = document != null && this.mutatedKeys.contains(document.getKey());
            boolean z4 = value != null && (value.hasLocalMutations() || (this.mutatedKeys.contains(value.getKey()) && value.hasCommittedMutations()));
            if (document == null || value == null) {
                if (document != null || value == null) {
                    if (document != null && value == null) {
                        documentViewChangeSet.addChange(DocumentViewChange.create(DocumentViewChange.Type.REMOVED, document));
                        if (lastDocument != null || firstDocument != null) {
                            z2 = true;
                        }
                    }
                    z = false;
                } else {
                    documentViewChangeSet.addChange(DocumentViewChange.create(DocumentViewChange.Type.ADDED, value));
                }
                z = true;
            } else if (document.getData().equals(value.getData())) {
                if (z3 != z4) {
                    documentViewChangeSet.addChange(DocumentViewChange.create(DocumentViewChange.Type.METADATA, value));
                    z = true;
                }
                z = false;
            } else {
                if (!shouldWaitForSyncedDocument(document, value)) {
                    documentViewChangeSet.addChange(DocumentViewChange.create(DocumentViewChange.Type.MODIFIED, value));
                    if ((lastDocument != null && this.query.comparator().compare(value, lastDocument) > 0) || (firstDocument != null && this.query.comparator().compare(value, firstDocument) < 0)) {
                    }
                    z = true;
                }
                z = false;
            }
            if (z) {
                if (value != null) {
                    documentSetRemove = documentSetRemove.add(value);
                    immutableSortedSetRemove = value.hasLocalMutations() ? immutableSortedSetRemove2.insert(value.getKey()) : immutableSortedSetRemove2.remove(value.getKey());
                } else {
                    documentSetRemove = documentSetRemove.remove(key);
                    immutableSortedSetRemove = immutableSortedSetRemove2.remove(key);
                }
                immutableSortedSetRemove2 = immutableSortedSetRemove;
            }
        }
        if (this.query.hasLimit()) {
            long size = documentSetRemove.size();
            long limit = this.query.getLimit();
            while (true) {
                size -= limit;
                if (size <= 0) {
                    break;
                }
                Document lastDocument2 = this.query.getLimitType().equals(Query.LimitType.LIMIT_TO_FIRST) ? documentSetRemove.getLastDocument() : documentSetRemove.getFirstDocument();
                documentSetRemove = documentSetRemove.remove(lastDocument2.getKey());
                immutableSortedSetRemove2 = immutableSortedSetRemove2.remove(lastDocument2.getKey());
                documentViewChangeSet.addChange(DocumentViewChange.create(DocumentViewChange.Type.REMOVED, lastDocument2));
                limit = 1;
            }
        }
        ImmutableSortedSet<DocumentKey> immutableSortedSet = immutableSortedSetRemove2;
        DocumentSet documentSet2 = documentSetRemove;
        Assert.hardAssert(!z2 || documentChanges == null, "View was refilled using docs that themselves needed refilling.", new Object[0]);
        return new DocumentChanges(documentSet2, documentViewChangeSet, immutableSortedSet, z2, null);
    }

    public ViewChange applyChanges(DocumentChanges documentChanges, TargetChange targetChange, boolean z) {
        ViewSnapshot viewSnapshot;
        Assert.hardAssert(!documentChanges.needsRefill, "Cannot apply changes that need a refill", new Object[0]);
        DocumentSet documentSet = this.documentSet;
        this.documentSet = documentChanges.documentSet;
        this.mutatedKeys = documentChanges.mutatedKeys;
        List<DocumentViewChange> changes = documentChanges.changeSet.getChanges();
        Collections.sort(changes, new Comparator() { // from class: com.google.firebase.firestore.core.OooOoo
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return this.f68185OooOo0o.lambda$applyChanges$0((DocumentViewChange) obj, (DocumentViewChange) obj2);
            }
        });
        applyTargetChange(targetChange);
        List<LimboDocumentChange> listUpdateLimboDocuments = z ? Collections.EMPTY_LIST : updateLimboDocuments();
        ViewSnapshot.SyncState syncState = (this.limboDocuments.size() == 0 && this.current && !z) ? ViewSnapshot.SyncState.SYNCED : ViewSnapshot.SyncState.LOCAL;
        boolean z2 = syncState != this.syncState;
        this.syncState = syncState;
        if (changes.size() != 0 || z2) {
            viewSnapshot = new ViewSnapshot(this.query, documentChanges.documentSet, documentSet, changes, syncState == ViewSnapshot.SyncState.LOCAL, documentChanges.mutatedKeys, z2, false, (targetChange == null || targetChange.getResumeToken().isEmpty()) ? false : true);
        } else {
            viewSnapshot = null;
        }
        return new ViewChange(viewSnapshot, listUpdateLimboDocuments);
    }
}
