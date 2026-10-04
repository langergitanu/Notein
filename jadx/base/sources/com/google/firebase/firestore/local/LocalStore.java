package com.google.firebase.firestore.local;

import android.util.SparseArray;
import com.google.firebase.Timestamp;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.bundle.BundleCallback;
import com.google.firebase.firestore.bundle.BundleMetadata;
import com.google.firebase.firestore.bundle.NamedQuery;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.core.Target;
import com.google.firebase.firestore.core.TargetIdGenerator;
import com.google.firebase.firestore.local.LruGarbageCollector;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldIndex;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ObjectValue;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationBatch;
import com.google.firebase.firestore.model.mutation.MutationBatchResult;
import com.google.firebase.firestore.model.mutation.PatchMutation;
import com.google.firebase.firestore.model.mutation.Precondition;
import com.google.firebase.firestore.remote.RemoteEvent;
import com.google.firebase.firestore.remote.TargetChange;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Consumer;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.firestore.util.Supplier;
import com.google.firebase.firestore.util.Util;
import com.google.protobuf.ByteString;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public final class LocalStore implements BundleCallback {
    private static final long RESUME_TOKEN_MAX_AGE_SECONDS = TimeUnit.MINUTES.toSeconds(5);
    private final BundleCache bundleCache;
    private DocumentOverlayCache documentOverlayCache;
    private GlobalsCache globalsCache;
    private IndexManager indexManager;
    private LocalDocumentsView localDocuments;
    private final ReferenceSet localViewReferences;
    private MutationQueue mutationQueue;
    private final Persistence persistence;
    private final SparseArray<TargetData> queryDataByTarget;
    private final QueryEngine queryEngine;
    private final RemoteDocumentCache remoteDocuments;
    private final TargetCache targetCache;
    private final Map<Target, Integer> targetIdByTarget;
    private final TargetIdGenerator targetIdGenerator;

    public static class AllocateQueryHolder {
        TargetData cached;
        int targetId;

        private AllocateQueryHolder() {
        }
    }

    public static class DocumentChangeResult {
        private final Map<DocumentKey, MutableDocument> changedDocuments;
        private final Set<DocumentKey> existenceChangedKeys;

        private DocumentChangeResult(Map<DocumentKey, MutableDocument> map, Set<DocumentKey> set) {
            this.changedDocuments = map;
            this.existenceChangedKeys = set;
        }
    }

    public LocalStore(Persistence persistence, QueryEngine queryEngine, User user) {
        Assert.hardAssert(persistence.isStarted(), "LocalStore was passed an unstarted persistence implementation", new Object[0]);
        this.persistence = persistence;
        this.queryEngine = queryEngine;
        this.globalsCache = persistence.getGlobalsCache();
        TargetCache targetCache = persistence.getTargetCache();
        this.targetCache = targetCache;
        this.bundleCache = persistence.getBundleCache();
        this.targetIdGenerator = TargetIdGenerator.forTargetCache(targetCache.getHighestTargetId());
        this.remoteDocuments = persistence.getRemoteDocumentCache();
        ReferenceSet referenceSet = new ReferenceSet();
        this.localViewReferences = referenceSet;
        this.queryDataByTarget = new SparseArray<>();
        this.targetIdByTarget = new HashMap();
        persistence.getReferenceDelegate().setInMemoryPins(referenceSet);
        initializeUserComponents(user);
    }

    private void applyWriteToRemoteDocuments(MutationBatchResult mutationBatchResult) {
        MutationBatch batch = mutationBatchResult.getBatch();
        for (DocumentKey documentKey : batch.getKeys()) {
            MutableDocument mutableDocument = this.remoteDocuments.get(documentKey);
            SnapshotVersion snapshotVersion = mutationBatchResult.getDocVersions().get(documentKey);
            Assert.hardAssert(snapshotVersion != null, "docVersions should contain every doc in the write.", new Object[0]);
            if (mutableDocument.getVersion().compareTo(snapshotVersion) < 0) {
                batch.applyToRemoteDocument(mutableDocument, mutationBatchResult);
                if (mutableDocument.isValidDocument()) {
                    this.remoteDocuments.add(mutableDocument, mutationBatchResult.getCommitVersion());
                }
            }
        }
        this.mutationQueue.removeMutationBatch(batch);
    }

    private Set<DocumentKey> getKeysWithTransformResults(MutationBatchResult mutationBatchResult) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < mutationBatchResult.getMutationResults().size(); i++) {
            if (!mutationBatchResult.getMutationResults().get(i).getTransformResults().isEmpty()) {
                hashSet.add(mutationBatchResult.getBatch().getMutations().get(i).getKey());
            }
        }
        return hashSet;
    }

    private void initializeUserComponents(User user) {
        IndexManager indexManager = this.persistence.getIndexManager(user);
        this.indexManager = indexManager;
        this.mutationQueue = this.persistence.getMutationQueue(user, indexManager);
        DocumentOverlayCache documentOverlayCache = this.persistence.getDocumentOverlayCache(user);
        this.documentOverlayCache = documentOverlayCache;
        this.localDocuments = new LocalDocumentsView(this.remoteDocuments, this.mutationQueue, documentOverlayCache, this.indexManager);
        this.remoteDocuments.setIndexManager(this.indexManager);
        this.queryEngine.initialize(this.localDocuments, this.indexManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ImmutableSortedMap lambda$acknowledgeBatch$3(MutationBatchResult mutationBatchResult) {
        MutationBatch batch = mutationBatchResult.getBatch();
        this.mutationQueue.acknowledgeBatch(batch, mutationBatchResult.getStreamToken());
        applyWriteToRemoteDocuments(mutationBatchResult);
        this.mutationQueue.performConsistencyCheck();
        this.documentOverlayCache.removeOverlaysForBatchId(mutationBatchResult.getBatch().getBatchId());
        this.localDocuments.recalculateAndSaveOverlays(getKeysWithTransformResults(mutationBatchResult));
        return this.localDocuments.getDocuments(batch.getKeys());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$allocateTarget$8(AllocateQueryHolder allocateQueryHolder, Target target) {
        int iNextId = this.targetIdGenerator.nextId();
        allocateQueryHolder.targetId = iNextId;
        TargetData targetData = new TargetData(target, iNextId, this.persistence.getReferenceDelegate().getCurrentSequenceNumber(), QueryPurpose.LISTEN);
        allocateQueryHolder.cached = targetData;
        this.targetCache.addTargetData(targetData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ImmutableSortedMap lambda$applyBundledDocuments$11(ImmutableSortedMap immutableSortedMap, TargetData targetData) {
        ImmutableSortedSet<DocumentKey> immutableSortedSetEmptyKeySet = DocumentKey.emptyKeySet();
        HashMap map = new HashMap();
        Iterator it = immutableSortedMap.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            DocumentKey documentKey = (DocumentKey) entry.getKey();
            MutableDocument mutableDocument = (MutableDocument) entry.getValue();
            if (mutableDocument.isFoundDocument()) {
                immutableSortedSetEmptyKeySet = immutableSortedSetEmptyKeySet.insert(documentKey);
            }
            map.put(documentKey, mutableDocument);
        }
        this.targetCache.removeMatchingKeysForTargetId(targetData.getTargetId());
        this.targetCache.addMatchingKeys(immutableSortedSetEmptyKeySet, targetData.getTargetId());
        DocumentChangeResult documentChangeResultPopulateDocumentChanges = populateDocumentChanges(map);
        return this.localDocuments.getLocalViewOfDocuments(documentChangeResultPopulateDocumentChanges.changedDocuments, documentChangeResultPopulateDocumentChanges.existenceChangedKeys);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ImmutableSortedMap lambda$applyRemoteEvent$6(RemoteEvent remoteEvent, SnapshotVersion snapshotVersion) {
        Map<Integer, TargetChange> targetChanges = remoteEvent.getTargetChanges();
        long currentSequenceNumber = this.persistence.getReferenceDelegate().getCurrentSequenceNumber();
        for (Map.Entry<Integer, TargetChange> entry : targetChanges.entrySet()) {
            Integer key = entry.getKey();
            int iIntValue = key.intValue();
            TargetChange value = entry.getValue();
            TargetData targetData = this.queryDataByTarget.get(iIntValue);
            if (targetData != null) {
                this.targetCache.removeMatchingKeys(value.getRemovedDocuments(), iIntValue);
                this.targetCache.addMatchingKeys(value.getAddedDocuments(), iIntValue);
                TargetData targetDataWithSequenceNumber = targetData.withSequenceNumber(currentSequenceNumber);
                if (remoteEvent.getTargetMismatches().containsKey(key)) {
                    ByteString byteString = ByteString.EMPTY;
                    SnapshotVersion snapshotVersion2 = SnapshotVersion.NONE;
                    targetDataWithSequenceNumber = targetDataWithSequenceNumber.withResumeToken(byteString, snapshotVersion2).withLastLimboFreeSnapshotVersion(snapshotVersion2);
                } else if (!value.getResumeToken().isEmpty()) {
                    targetDataWithSequenceNumber = targetDataWithSequenceNumber.withResumeToken(value.getResumeToken(), remoteEvent.getSnapshotVersion());
                }
                this.queryDataByTarget.put(iIntValue, targetDataWithSequenceNumber);
                if (shouldPersistTargetData(targetData, targetDataWithSequenceNumber, value)) {
                    this.targetCache.updateTargetData(targetDataWithSequenceNumber);
                }
            }
        }
        Map<DocumentKey, MutableDocument> documentUpdates = remoteEvent.getDocumentUpdates();
        Set<DocumentKey> resolvedLimboDocuments = remoteEvent.getResolvedLimboDocuments();
        for (DocumentKey documentKey : documentUpdates.keySet()) {
            if (resolvedLimboDocuments.contains(documentKey)) {
                this.persistence.getReferenceDelegate().updateLimboDocument(documentKey);
            }
        }
        DocumentChangeResult documentChangeResultPopulateDocumentChanges = populateDocumentChanges(documentUpdates);
        Map<DocumentKey, MutableDocument> map = documentChangeResultPopulateDocumentChanges.changedDocuments;
        SnapshotVersion lastRemoteSnapshotVersion = this.targetCache.getLastRemoteSnapshotVersion();
        if (!snapshotVersion.equals(SnapshotVersion.NONE)) {
            Assert.hardAssert(snapshotVersion.compareTo(lastRemoteSnapshotVersion) >= 0, "Watch stream reverted to previous snapshot?? (%s < %s)", snapshotVersion, lastRemoteSnapshotVersion);
            this.targetCache.setLastRemoteSnapshotVersion(snapshotVersion);
        }
        return this.localDocuments.getLocalViewOfDocuments(map, documentChangeResultPopulateDocumentChanges.existenceChangedKeys);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ LruGarbageCollector.Results lambda$collectGarbage$18(LruGarbageCollector lruGarbageCollector) {
        return lruGarbageCollector.collect(this.queryDataByTarget);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$configureFieldIndexes$15(List list) {
        Collection<FieldIndex> fieldIndexes = this.indexManager.getFieldIndexes();
        Comparator<FieldIndex> comparator = FieldIndex.SEMANTIC_COMPARATOR;
        final IndexManager indexManager = this.indexManager;
        Objects.requireNonNull(indexManager);
        Consumer consumer = new Consumer() { // from class: com.google.firebase.firestore.local.OooO0oO
            @Override // com.google.firebase.firestore.util.Consumer
            public final void accept(Object obj) {
                indexManager.addFieldIndex((FieldIndex) obj);
            }
        };
        final IndexManager indexManager2 = this.indexManager;
        Objects.requireNonNull(indexManager2);
        Util.diffCollections(fieldIndexes, list, comparator, consumer, new Consumer() { // from class: com.google.firebase.firestore.local.OooOOo0
            @Override // com.google.firebase.firestore.util.Consumer
            public final void accept(Object obj) {
                indexManager2.deleteFieldIndex((FieldIndex) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteAllFieldIndexes$16() {
        this.indexManager.deleteAllFieldIndexes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Collection lambda$getFieldIndexes$14() {
        return this.indexManager.getFieldIndexes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ NamedQuery lambda$getNamedQuery$13(String str) {
        return this.bundleCache.getNamedQuery(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$hasNewerBundle$9(BundleMetadata bundleMetadata) {
        BundleMetadata bundleMetadata2 = this.bundleCache.getBundleMetadata(bundleMetadata.getBundleId());
        return Boolean.valueOf(bundleMetadata2 != null && bundleMetadata2.getCreateTime().compareTo(bundleMetadata.getCreateTime()) >= 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyLocalViewChanges$7(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LocalViewChanges localViewChanges = (LocalViewChanges) it.next();
            int targetId = localViewChanges.getTargetId();
            this.localViewReferences.addReferences(localViewChanges.getAdded(), targetId);
            ImmutableSortedSet<DocumentKey> removed = localViewChanges.getRemoved();
            Iterator<DocumentKey> it2 = removed.iterator();
            while (it2.hasNext()) {
                this.persistence.getReferenceDelegate().removeReference(it2.next());
            }
            this.localViewReferences.removeReferences(removed, targetId);
            if (!localViewChanges.isFromCache()) {
                TargetData targetData = this.queryDataByTarget.get(targetId);
                Assert.hardAssert(targetData != null, "Can't set limbo-free snapshot version for unknown target: %s", Integer.valueOf(targetId));
                TargetData targetDataWithLastLimboFreeSnapshotVersion = targetData.withLastLimboFreeSnapshotVersion(targetData.getSnapshotVersion());
                this.queryDataByTarget.put(targetId, targetDataWithLastLimboFreeSnapshotVersion);
                if (shouldPersistTargetData(targetData, targetDataWithLastLimboFreeSnapshotVersion, null)) {
                    this.targetCache.updateTargetData(targetDataWithLastLimboFreeSnapshotVersion);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ImmutableSortedMap lambda$rejectBatch$4(int i) {
        MutationBatch mutationBatchLookupMutationBatch = this.mutationQueue.lookupMutationBatch(i);
        Assert.hardAssert(mutationBatchLookupMutationBatch != null, "Attempt to reject nonexistent batch!", new Object[0]);
        this.mutationQueue.removeMutationBatch(mutationBatchLookupMutationBatch);
        this.mutationQueue.performConsistencyCheck();
        this.documentOverlayCache.removeOverlaysForBatchId(i);
        this.localDocuments.recalculateAndSaveOverlays(mutationBatchLookupMutationBatch.getKeys());
        return this.localDocuments.getDocuments(mutationBatchLookupMutationBatch.getKeys());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releaseTarget$17(int i) {
        TargetData targetData = this.queryDataByTarget.get(i);
        Assert.hardAssert(targetData != null, "Tried to release nonexistent target: %s", Integer.valueOf(i));
        Iterator<DocumentKey> it = this.localViewReferences.removeReferencesForId(i).iterator();
        while (it.hasNext()) {
            this.persistence.getReferenceDelegate().removeReference(it.next());
        }
        this.persistence.getReferenceDelegate().removeTarget(targetData);
        this.queryDataByTarget.remove(i);
        this.targetIdByTarget.remove(targetData.getTarget());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveBundle$10(BundleMetadata bundleMetadata) {
        this.bundleCache.saveBundleMetadata(bundleMetadata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveNamedQuery$12(NamedQuery namedQuery, TargetData targetData, int i, ImmutableSortedSet immutableSortedSet) {
        if (namedQuery.getReadTime().compareTo(targetData.getSnapshotVersion()) > 0) {
            TargetData targetDataWithResumeToken = targetData.withResumeToken(ByteString.EMPTY, namedQuery.getReadTime());
            this.queryDataByTarget.append(i, targetDataWithResumeToken);
            this.targetCache.updateTargetData(targetDataWithResumeToken);
            this.targetCache.removeMatchingKeysForTargetId(i);
            this.targetCache.addMatchingKeys(immutableSortedSet, i);
        }
        this.bundleCache.saveNamedQuery(namedQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setLastStreamToken$5(ByteString byteString) {
        this.mutationQueue.setLastStreamToken(byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startIndexManager$0() {
        this.indexManager.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startMutationQueue$1() {
        this.mutationQueue.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ LocalDocumentsResult lambda$writeLocally$2(Set set, List list, Timestamp timestamp) {
        Map<DocumentKey, MutableDocument> all = this.remoteDocuments.getAll(set);
        HashSet hashSet = new HashSet();
        for (Map.Entry<DocumentKey, MutableDocument> entry : all.entrySet()) {
            if (!entry.getValue().isValidDocument()) {
                hashSet.add(entry.getKey());
            }
        }
        Map<DocumentKey, OverlayedDocument> overlayedDocuments = this.localDocuments.getOverlayedDocuments(all);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Mutation mutation = (Mutation) it.next();
            ObjectValue objectValueExtractTransformBaseValue = mutation.extractTransformBaseValue(overlayedDocuments.get(mutation.getKey()).getDocument());
            if (objectValueExtractTransformBaseValue != null) {
                arrayList.add(new PatchMutation(mutation.getKey(), objectValueExtractTransformBaseValue, objectValueExtractTransformBaseValue.getFieldMask(), Precondition.exists(true)));
            }
        }
        MutationBatch mutationBatchAddMutationBatch = this.mutationQueue.addMutationBatch(timestamp, arrayList, list);
        this.documentOverlayCache.saveOverlays(mutationBatchAddMutationBatch.getBatchId(), mutationBatchAddMutationBatch.applyToLocalDocumentSet(overlayedDocuments, hashSet));
        return LocalDocumentsResult.fromOverlayedDocuments(mutationBatchAddMutationBatch.getBatchId(), overlayedDocuments);
    }

    private static Target newUmbrellaTarget(String str) {
        return Query.atPath(ResourcePath.fromString("__bundle__/docs/" + str)).toTarget();
    }

    private DocumentChangeResult populateDocumentChanges(Map<DocumentKey, MutableDocument> map) {
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Map<DocumentKey, MutableDocument> all = this.remoteDocuments.getAll(map.keySet());
        for (Map.Entry<DocumentKey, MutableDocument> entry : map.entrySet()) {
            DocumentKey key = entry.getKey();
            MutableDocument value = entry.getValue();
            MutableDocument mutableDocument = all.get(key);
            if (value.isFoundDocument() != mutableDocument.isFoundDocument()) {
                hashSet.add(key);
            }
            if (value.isNoDocument() && value.getVersion().equals(SnapshotVersion.NONE)) {
                arrayList.add(value.getKey());
                map2.put(key, value);
            } else if (!mutableDocument.isValidDocument() || value.getVersion().compareTo(mutableDocument.getVersion()) > 0 || (value.getVersion().compareTo(mutableDocument.getVersion()) == 0 && mutableDocument.hasPendingWrites())) {
                Assert.hardAssert(!SnapshotVersion.NONE.equals(value.getReadTime()), "Cannot add a document when the remote version is zero", new Object[0]);
                this.remoteDocuments.add(value, value.getReadTime());
                map2.put(key, value);
            } else {
                Logger.debug("LocalStore", "Ignoring outdated watch update for %s.Current version: %s  Watch version: %s", key, mutableDocument.getVersion(), value.getVersion());
            }
        }
        this.remoteDocuments.removeAll(arrayList);
        return new DocumentChangeResult(map2, hashSet);
    }

    private static boolean shouldPersistTargetData(TargetData targetData, TargetData targetData2, TargetChange targetChange) {
        if (targetData.getResumeToken().isEmpty()) {
            return true;
        }
        long seconds = targetData2.getSnapshotVersion().getTimestamp().getSeconds() - targetData.getSnapshotVersion().getTimestamp().getSeconds();
        long j = RESUME_TOKEN_MAX_AGE_SECONDS;
        if (seconds >= j || targetData2.getLastLimboFreeSnapshotVersion().getTimestamp().getSeconds() - targetData.getLastLimboFreeSnapshotVersion().getTimestamp().getSeconds() >= j) {
            return true;
        }
        if (targetChange == null) {
            return false;
        }
        return targetChange.getRemovedDocuments().size() + (targetChange.getModifiedDocuments().size() + targetChange.getAddedDocuments().size()) > 0;
    }

    private void startIndexManager() {
        this.persistence.runTransaction("Start IndexManager", new OooO(this, 0));
    }

    private void startMutationQueue() {
        this.persistence.runTransaction("Start MutationQueue", new androidx.fragment.app.OooOO0(this, 1));
    }

    public ImmutableSortedMap<DocumentKey, Document> acknowledgeBatch(final MutationBatchResult mutationBatchResult) {
        return (ImmutableSortedMap) this.persistence.runTransaction("Acknowledge batch", new Supplier() { // from class: com.google.firebase.firestore.local.OooOO0o
            @Override // com.google.firebase.firestore.util.Supplier
            public final Object get() {
                return this.f68205OooOo0o.lambda$acknowledgeBatch$3(mutationBatchResult);
            }
        });
    }

    public TargetData allocateTarget(final Target target) {
        int targetId;
        TargetData targetData = this.targetCache.getTargetData(target);
        if (targetData != null) {
            targetId = targetData.getTargetId();
        } else {
            final AllocateQueryHolder allocateQueryHolder = new AllocateQueryHolder();
            this.persistence.runTransaction("Allocate target", new Runnable() { // from class: com.google.firebase.firestore.local.OooOOO0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f68209OooOo0o.lambda$allocateTarget$8(allocateQueryHolder, target);
                }
            });
            targetId = allocateQueryHolder.targetId;
            targetData = allocateQueryHolder.cached;
        }
        if (this.queryDataByTarget.get(targetId) == null) {
            this.queryDataByTarget.put(targetId, targetData);
            this.targetIdByTarget.put(target, Integer.valueOf(targetId));
        }
        return targetData;
    }

    @Override // com.google.firebase.firestore.bundle.BundleCallback
    public ImmutableSortedMap<DocumentKey, Document> applyBundledDocuments(final ImmutableSortedMap<DocumentKey, MutableDocument> immutableSortedMap, String str) {
        final TargetData targetDataAllocateTarget = allocateTarget(newUmbrellaTarget(str));
        return (ImmutableSortedMap) this.persistence.runTransaction("Apply bundle documents", new Supplier() { // from class: com.google.firebase.firestore.local.OooOo0
            @Override // com.google.firebase.firestore.util.Supplier
            public final Object get() {
                return this.f68225OooOo0o.lambda$applyBundledDocuments$11(immutableSortedMap, targetDataAllocateTarget);
            }
        });
    }

    public ImmutableSortedMap<DocumentKey, Document> applyRemoteEvent(final RemoteEvent remoteEvent) {
        final SnapshotVersion snapshotVersion = remoteEvent.getSnapshotVersion();
        return (ImmutableSortedMap) this.persistence.runTransaction("Apply remote event", new Supplier() { // from class: com.google.firebase.firestore.local.OooOo00
            @Override // com.google.firebase.firestore.util.Supplier
            public final Object get() {
                return this.f68228OooOo0o.lambda$applyRemoteEvent$6(remoteEvent, snapshotVersion);
            }
        });
    }

    public LruGarbageCollector.Results collectGarbage(final LruGarbageCollector lruGarbageCollector) {
        return (LruGarbageCollector.Results) this.persistence.runTransaction("Collect garbage", new Supplier() { // from class: com.google.firebase.firestore.local.OooOOoo
            @Override // com.google.firebase.firestore.util.Supplier
            public final Object get() {
                return this.f68221OooOo0o.lambda$collectGarbage$18(lruGarbageCollector);
            }
        });
    }

    public void configureFieldIndexes(final List<FieldIndex> list) {
        this.persistence.runTransaction("Configure indexes", new Runnable() { // from class: com.google.firebase.firestore.local.OooOo
            @Override // java.lang.Runnable
            public final void run() {
                this.f68223OooOo0o.lambda$configureFieldIndexes$15(list);
            }
        });
    }

    public void deleteAllFieldIndexes() {
        this.persistence.runTransaction("Delete All Indexes", new Runnable() { // from class: com.google.firebase.firestore.local.OooOo0O
            @Override // java.lang.Runnable
            public final void run() {
                this.f68230OooOo0o.lambda$deleteAllFieldIndexes$16();
            }
        });
    }

    public QueryResult executeQuery(Query query, boolean z) {
        ImmutableSortedSet<DocumentKey> matchingKeysForTargetId;
        SnapshotVersion lastLimboFreeSnapshotVersion;
        TargetData targetData = getTargetData(query.toTarget());
        SnapshotVersion snapshotVersion = SnapshotVersion.NONE;
        ImmutableSortedSet<DocumentKey> immutableSortedSetEmptyKeySet = DocumentKey.emptyKeySet();
        if (targetData != null) {
            lastLimboFreeSnapshotVersion = targetData.getLastLimboFreeSnapshotVersion();
            matchingKeysForTargetId = this.targetCache.getMatchingKeysForTargetId(targetData.getTargetId());
        } else {
            matchingKeysForTargetId = immutableSortedSetEmptyKeySet;
            lastLimboFreeSnapshotVersion = snapshotVersion;
        }
        QueryEngine queryEngine = this.queryEngine;
        if (z) {
            snapshotVersion = lastLimboFreeSnapshotVersion;
        }
        return new QueryResult(queryEngine.getDocumentsMatchingQuery(query, snapshotVersion, matchingKeysForTargetId), matchingKeysForTargetId);
    }

    public Collection<FieldIndex> getFieldIndexes() {
        return (Collection) this.persistence.runTransaction("Get indexes", new C22646OooOoO(this, 0));
    }

    public int getHighestUnacknowledgedBatchId() {
        return this.mutationQueue.getHighestUnacknowledgedBatchId();
    }

    public IndexManager getIndexManagerForCurrentUser() {
        return this.indexManager;
    }

    public SnapshotVersion getLastRemoteSnapshotVersion() {
        return this.targetCache.getLastRemoteSnapshotVersion();
    }

    public ByteString getLastStreamToken() {
        return this.mutationQueue.getLastStreamToken();
    }

    public LocalDocumentsView getLocalDocumentsForCurrentUser() {
        return this.localDocuments;
    }

    public NamedQuery getNamedQuery(final String str) {
        return (NamedQuery) this.persistence.runTransaction("Get named query", new Supplier() { // from class: com.google.firebase.firestore.local.OooO0oo
            @Override // com.google.firebase.firestore.util.Supplier
            public final Object get() {
                return this.f68196OooOo0o.lambda$getNamedQuery$13(str);
            }
        });
    }

    public MutationBatch getNextMutationBatch(int i) {
        return this.mutationQueue.getNextMutationBatchAfterBatchId(i);
    }

    public ImmutableSortedSet<DocumentKey> getRemoteDocumentKeys(int i) {
        return this.targetCache.getMatchingKeysForTargetId(i);
    }

    public ByteString getSessionToken() {
        return this.globalsCache.getSessionsToken();
    }

    public TargetData getTargetData(Target target) {
        Integer num = this.targetIdByTarget.get(target);
        return num != null ? this.queryDataByTarget.get(num.intValue()) : this.targetCache.getTargetData(target);
    }

    public ImmutableSortedMap<DocumentKey, Document> handleUserChange(User user) {
        List<MutationBatch> allMutationBatches = this.mutationQueue.getAllMutationBatches();
        initializeUserComponents(user);
        startIndexManager();
        startMutationQueue();
        List<MutationBatch> allMutationBatches2 = this.mutationQueue.getAllMutationBatches();
        ImmutableSortedSet<DocumentKey> immutableSortedSetEmptyKeySet = DocumentKey.emptyKeySet();
        Iterator it = Arrays.asList(allMutationBatches, allMutationBatches2).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                Iterator<Mutation> it3 = ((MutationBatch) it2.next()).getMutations().iterator();
                while (it3.hasNext()) {
                    immutableSortedSetEmptyKeySet = immutableSortedSetEmptyKeySet.insert(it3.next().getKey());
                }
            }
        }
        return this.localDocuments.getDocuments(immutableSortedSetEmptyKeySet);
    }

    public boolean hasNewerBundle(final BundleMetadata bundleMetadata) {
        return ((Boolean) this.persistence.runTransaction("Has newer bundle", new Supplier() { // from class: com.google.firebase.firestore.local.OooOo0o
            @Override // com.google.firebase.firestore.util.Supplier
            public final Object get() {
                return this.f68232OooOo0o.lambda$hasNewerBundle$9(bundleMetadata);
            }
        })).booleanValue();
    }

    public void notifyLocalViewChanges(final List<LocalViewChanges> list) {
        this.persistence.runTransaction("notifyLocalViewChanges", new Runnable() { // from class: com.google.firebase.firestore.local.OooOOOo
            @Override // java.lang.Runnable
            public final void run() {
                this.f68214OooOo0o.lambda$notifyLocalViewChanges$7(list);
            }
        });
    }

    public Document readDocument(DocumentKey documentKey) {
        return this.localDocuments.getDocument(documentKey);
    }

    public ImmutableSortedMap<DocumentKey, Document> rejectBatch(final int i) {
        return (ImmutableSortedMap) this.persistence.runTransaction("Reject batch", new Supplier() { // from class: com.google.firebase.firestore.local.OooOOOO
            @Override // com.google.firebase.firestore.util.Supplier
            public final Object get() {
                return this.f68212OooOo0o.lambda$rejectBatch$4(i);
            }
        });
    }

    public void releaseTarget(final int i) {
        this.persistence.runTransaction("Release target", new Runnable() { // from class: com.google.firebase.firestore.local.OooOO0
            @Override // java.lang.Runnable
            public final void run() {
                this.f68198OooOo0o.lambda$releaseTarget$17(i);
            }
        });
    }

    @Override // com.google.firebase.firestore.bundle.BundleCallback
    public void saveBundle(final BundleMetadata bundleMetadata) {
        this.persistence.runTransaction("Save bundle", new Runnable() { // from class: com.google.firebase.firestore.local.OooOOO
            @Override // java.lang.Runnable
            public final void run() {
                this.f68207OooOo0o.lambda$saveBundle$10(bundleMetadata);
            }
        });
    }

    @Override // com.google.firebase.firestore.bundle.BundleCallback
    public void saveNamedQuery(final NamedQuery namedQuery, final ImmutableSortedSet<DocumentKey> immutableSortedSet) {
        final TargetData targetDataAllocateTarget = allocateTarget(namedQuery.getBundledQuery().getTarget());
        final int targetId = targetDataAllocateTarget.getTargetId();
        this.persistence.runTransaction("Saved named query", new Runnable() { // from class: com.google.firebase.firestore.local.OooOO0O
            @Override // java.lang.Runnable
            public final void run() {
                this.f68200OooOo0o.lambda$saveNamedQuery$12(namedQuery, targetDataAllocateTarget, targetId, immutableSortedSet);
            }
        });
    }

    public void setIndexAutoCreationEnabled(boolean z) {
        this.queryEngine.setIndexAutoCreationEnabled(z);
    }

    public void setLastStreamToken(final ByteString byteString) {
        this.persistence.runTransaction("Set stream token", new Runnable() { // from class: com.google.firebase.firestore.local.OooOoO0
            @Override // java.lang.Runnable
            public final void run() {
                this.f68236OooOo0o.lambda$setLastStreamToken$5(byteString);
            }
        });
    }

    public void setSessionsToken(ByteString byteString) {
        this.globalsCache.setSessionToken(byteString);
    }

    public void start() {
        this.persistence.getOverlayMigrationManager().run();
        startIndexManager();
        startMutationQueue();
    }

    public LocalDocumentsResult writeLocally(final List<Mutation> list) {
        final Timestamp timestampNow = Timestamp.now();
        final HashSet hashSet = new HashSet();
        Iterator<Mutation> it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getKey());
        }
        return (LocalDocumentsResult) this.persistence.runTransaction("Locally write mutations", new Supplier() { // from class: com.google.firebase.firestore.local.OooOOo
            @Override // com.google.firebase.firestore.util.Supplier
            public final Object get() {
                return this.f68216OooOo0o.lambda$writeLocally$2(hashSet, list, timestampNow);
            }
        });
    }
}
