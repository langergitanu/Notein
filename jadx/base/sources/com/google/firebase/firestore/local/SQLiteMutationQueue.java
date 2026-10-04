package com.google.firebase.firestore.local;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationBatch;
import com.google.firebase.firestore.proto.WriteBatch;
import com.google.firebase.firestore.remote.WriteStream;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Consumer;
import com.google.firebase.firestore.util.Function;
import com.google.firebase.firestore.util.Preconditions;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
final class SQLiteMutationQueue implements MutationQueue {
    private static final int BLOB_MAX_INLINE_LENGTH = 1000000;

    /* JADX INFO: renamed from: db */
    private final SQLitePersistence f51786db;
    private final IndexManager indexManager;
    private ByteString lastStreamToken;
    private int nextBatchId;
    private final LocalSerializer serializer;
    private final String uid;

    public static class BlobAccumulator implements Consumer<Cursor> {
        private final ArrayList<ByteString> chunks = new ArrayList<>();
        private boolean more = true;

        public BlobAccumulator(byte[] bArr) {
            addChunk(bArr);
        }

        private void addChunk(byte[] bArr) {
            this.chunks.add(ByteString.copyFrom(bArr));
        }

        public int numChunks() {
            return this.chunks.size();
        }

        public ByteString result() {
            return ByteString.copyFrom(this.chunks);
        }

        @Override // com.google.firebase.firestore.util.Consumer
        public void accept(Cursor cursor) {
            byte[] blob = cursor.getBlob(0);
            addChunk(blob);
            if (blob.length < SQLiteMutationQueue.BLOB_MAX_INLINE_LENGTH) {
                this.more = false;
            }
        }
    }

    public SQLiteMutationQueue(SQLitePersistence sQLitePersistence, LocalSerializer localSerializer, User user, IndexManager indexManager) {
        this.f51786db = sQLitePersistence;
        this.serializer = localSerializer;
        this.uid = user.isAuthenticated() ? user.getUid() : "";
        this.lastStreamToken = WriteStream.EMPTY_STREAM_TOKEN;
        this.indexManager = indexManager;
    }

    private MutationBatch decodeInlineMutationBatch(int i, byte[] bArr) {
        try {
            if (bArr.length < BLOB_MAX_INLINE_LENGTH) {
                return this.serializer.decodeMutationBatch(WriteBatch.parseFrom(bArr));
            }
            BlobAccumulator blobAccumulator = new BlobAccumulator(bArr);
            while (blobAccumulator.more) {
                this.f51786db.query("SELECT SUBSTR(mutations, ?, ?) FROM mutations WHERE uid = ? AND batch_id = ?").binding(Integer.valueOf((blobAccumulator.numChunks() * BLOB_MAX_INLINE_LENGTH) + 1), Integer.valueOf(BLOB_MAX_INLINE_LENGTH), this.uid, Integer.valueOf(i)).first(blobAccumulator);
            }
            return this.serializer.decodeMutationBatch(WriteBatch.parseFrom(blobAccumulator.result()));
        } catch (InvalidProtocolBufferException e) {
            throw Assert.fail("MutationBatch failed to parse: %s", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getAllMutationBatches$6(List list, Cursor cursor) {
        list.add(decodeInlineMutationBatch(cursor.getInt(0), cursor.getBlob(1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getAllMutationBatchesAffectingDocumentKey$7(List list, Cursor cursor) {
        list.add(decodeInlineMutationBatch(cursor.getInt(0), cursor.getBlob(1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getAllMutationBatchesAffectingDocumentKeys$8(Set set, List list, Cursor cursor) {
        int i = cursor.getInt(0);
        if (set.contains(Integer.valueOf(i))) {
            return;
        }
        set.add(Integer.valueOf(i));
        list.add(decodeInlineMutationBatch(i, cursor.getBlob(1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getAllMutationBatchesAffectingDocumentKeys$9(MutationBatch mutationBatch, MutationBatch mutationBatch2) {
        return Integer.compare(mutationBatch.getBatchId(), mutationBatch2.getBatchId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getAllMutationBatchesAffectingQuery$10(List list, int i, Cursor cursor) {
        int i2 = cursor.getInt(0);
        int size = list.size();
        if ((size <= 0 || i2 != ((MutationBatch) list.get(size - 1)).getBatchId()) && EncodedPath.decodeResourcePath(cursor.getString(1)).length() == i) {
            list.add(decodeInlineMutationBatch(i2, cursor.getBlob(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$getHighestUnacknowledgedBatchId$5(Cursor cursor) {
        return Integer.valueOf(cursor.getInt(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ MutationBatch lambda$getNextMutationBatchAfterBatchId$4(Cursor cursor) {
        return decodeInlineMutationBatch(cursor.getInt(0), cursor.getBlob(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$loadNextBatchIdAcrossAllUsers$1(List list, Cursor cursor) {
        list.add(cursor.getString(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadNextBatchIdAcrossAllUsers$2(Cursor cursor) {
        this.nextBatchId = Math.max(this.nextBatchId, cursor.getInt(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ MutationBatch lambda$lookupMutationBatch$3(int i, Cursor cursor) {
        return decodeInlineMutationBatch(i, cursor.getBlob(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$performConsistencyCheck$11(List list, Cursor cursor) {
        list.add(EncodedPath.decodeResourcePath(cursor.getString(0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0(Cursor cursor) {
        this.lastStreamToken = ByteString.copyFrom(cursor.getBlob(0));
    }

    private void loadNextBatchIdAcrossAllUsers() {
        final ArrayList arrayList = new ArrayList();
        this.f51786db.query("SELECT uid FROM mutation_queues").forEach(new Consumer() { // from class: com.google.firebase.firestore.local.Oooooo
            @Override // com.google.firebase.firestore.util.Consumer
            public final void accept(Object obj) {
                SQLiteMutationQueue.lambda$loadNextBatchIdAcrossAllUsers$1(arrayList, (Cursor) obj);
            }
        });
        this.nextBatchId = 0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f51786db.query("SELECT MAX(batch_id) FROM mutations WHERE uid = ?").binding((String) it.next()).forEach(new Consumer() { // from class: com.google.firebase.firestore.local.OoooooO
                @Override // com.google.firebase.firestore.util.Consumer
                public final void accept(Object obj) {
                    this.f68292OooO00o.lambda$loadNextBatchIdAcrossAllUsers$2((Cursor) obj);
                }
            });
        }
        this.nextBatchId++;
    }

    private void writeMutationQueueMetadata() {
        this.f51786db.execute("INSERT OR REPLACE INTO mutation_queues (uid, last_acknowledged_batch_id, last_stream_token) VALUES (?, ?, ?)", this.uid, -1, this.lastStreamToken.toByteArray());
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public void acknowledgeBatch(MutationBatch mutationBatch, ByteString byteString) {
        this.lastStreamToken = (ByteString) Preconditions.checkNotNull(byteString);
        writeMutationQueueMetadata();
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public MutationBatch addMutationBatch(Timestamp timestamp, List<Mutation> list, List<Mutation> list2) {
        int i = this.nextBatchId;
        this.nextBatchId = i + 1;
        MutationBatch mutationBatch = new MutationBatch(i, timestamp, list, list2);
        this.f51786db.execute("INSERT INTO mutations (uid, batch_id, mutations) VALUES (?, ?, ?)", this.uid, Integer.valueOf(i), this.serializer.encodeMutationBatch(mutationBatch).toByteArray());
        HashSet hashSet = new HashSet();
        SQLiteStatement sQLiteStatementPrepare = this.f51786db.prepare("INSERT INTO document_mutations (uid, path, batch_id) VALUES (?, ?, ?)");
        Iterator<Mutation> it = list2.iterator();
        while (it.hasNext()) {
            DocumentKey key = it.next().getKey();
            if (hashSet.add(key)) {
                this.f51786db.execute(sQLiteStatementPrepare, this.uid, EncodedPath.encode(key.getPath()), Integer.valueOf(i));
                this.indexManager.addToCollectionParentIndex(key.getCollectionPath());
            }
        }
        return mutationBatch;
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public List<MutationBatch> getAllMutationBatches() {
        final ArrayList arrayList = new ArrayList();
        this.f51786db.query("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? ORDER BY batch_id ASC").binding(Integer.valueOf(BLOB_MAX_INLINE_LENGTH), this.uid).forEach(new Consumer() { // from class: com.google.firebase.firestore.local.OooooOo
            @Override // com.google.firebase.firestore.util.Consumer
            public final void accept(Object obj) {
                this.f68288OooO00o.lambda$getAllMutationBatches$6(arrayList, (Cursor) obj);
            }
        });
        return arrayList;
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public List<MutationBatch> getAllMutationBatchesAffectingDocumentKey(DocumentKey documentKey) {
        String strEncode = EncodedPath.encode(documentKey.getPath());
        final ArrayList arrayList = new ArrayList();
        this.f51786db.query("SELECT m.batch_id, SUBSTR(m.mutations, 1, ?) FROM document_mutations dm, mutations m WHERE dm.uid = ? AND dm.path = ? AND dm.uid = m.uid AND dm.batch_id = m.batch_id ORDER BY dm.batch_id").binding(Integer.valueOf(BLOB_MAX_INLINE_LENGTH), this.uid, strEncode).forEach(new Consumer() { // from class: com.google.firebase.firestore.local.OoooOoO
            @Override // com.google.firebase.firestore.util.Consumer
            public final void accept(Object obj) {
                this.f68280OooO00o.lambda$getAllMutationBatchesAffectingDocumentKey$7(arrayList, (Cursor) obj);
            }
        });
        return arrayList;
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public List<MutationBatch> getAllMutationBatchesAffectingDocumentKeys(Iterable<DocumentKey> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<DocumentKey> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(EncodedPath.encode(it.next().getPath()));
        }
        SQLitePersistence.LongQuery longQuery = new SQLitePersistence.LongQuery(this.f51786db, "SELECT DISTINCT dm.batch_id, SUBSTR(m.mutations, 1, ?) FROM document_mutations dm, mutations m WHERE dm.uid = ? AND dm.path IN (", Arrays.asList(Integer.valueOf(BLOB_MAX_INLINE_LENGTH), this.uid), arrayList, ") AND dm.uid = m.uid AND dm.batch_id = m.batch_id ORDER BY dm.batch_id");
        final ArrayList arrayList2 = new ArrayList();
        final HashSet hashSet = new HashSet();
        while (longQuery.hasMoreSubqueries()) {
            longQuery.performNextSubquery().forEach(new Consumer() { // from class: com.google.firebase.firestore.local.o0OoOo0
                @Override // com.google.firebase.firestore.util.Consumer
                public final void accept(Object obj) {
                    this.f68336OooO00o.lambda$getAllMutationBatchesAffectingDocumentKeys$8(hashSet, arrayList2, (Cursor) obj);
                }
            });
        }
        if (longQuery.getSubqueriesPerformed() > 1) {
            Collections.sort(arrayList2, new C22671OoooOoo());
        }
        return arrayList2;
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public List<MutationBatch> getAllMutationBatchesAffectingQuery(Query query) {
        Assert.hardAssert(!query.isCollectionGroupQuery(), "CollectionGroup queries should be handled in LocalDocumentsView", new Object[0]);
        ResourcePath path = query.getPath();
        final int length = path.length() + 1;
        String strEncode = EncodedPath.encode(path);
        String strPrefixSuccessor = EncodedPath.prefixSuccessor(strEncode);
        final ArrayList arrayList = new ArrayList();
        this.f51786db.query("SELECT dm.batch_id, dm.path, SUBSTR(m.mutations, 1, ?) FROM document_mutations dm, mutations m WHERE dm.uid = ? AND dm.path >= ? AND dm.path < ? AND dm.uid = m.uid AND dm.batch_id = m.batch_id ORDER BY dm.batch_id").binding(Integer.valueOf(BLOB_MAX_INLINE_LENGTH), this.uid, strEncode, strPrefixSuccessor).forEach(new Consumer() { // from class: com.google.firebase.firestore.local.Ooooo0o
            @Override // com.google.firebase.firestore.util.Consumer
            public final void accept(Object obj) {
                this.f68284OooO00o.lambda$getAllMutationBatchesAffectingQuery$10(arrayList, length, (Cursor) obj);
            }
        });
        return arrayList;
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public int getHighestUnacknowledgedBatchId() {
        return ((Integer) this.f51786db.query("SELECT IFNULL(MAX(batch_id), ?) FROM mutations WHERE uid = ?").binding(-1, this.uid).firstValue(new C22674OooooO0())).intValue();
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public ByteString getLastStreamToken() {
        return this.lastStreamToken;
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public MutationBatch getNextMutationBatchAfterBatchId(int i) {
        return (MutationBatch) this.f51786db.query("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id >= ? ORDER BY batch_id ASC LIMIT 1").binding(Integer.valueOf(BLOB_MAX_INLINE_LENGTH), this.uid, Integer.valueOf(i + 1)).firstValue(new Function() { // from class: com.google.firebase.firestore.local.Ooooooo
            @Override // com.google.firebase.firestore.util.Function
            public final Object apply(Object obj) {
                return this.f68293OooO00o.lambda$getNextMutationBatchAfterBatchId$4((Cursor) obj);
            }
        });
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public boolean isEmpty() {
        return this.f51786db.query("SELECT batch_id FROM mutations WHERE uid = ? LIMIT 1").binding(this.uid).isEmpty();
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public MutationBatch lookupMutationBatch(final int i) {
        return (MutationBatch) this.f51786db.query("SELECT SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id = ?").binding(Integer.valueOf(BLOB_MAX_INLINE_LENGTH), this.uid, Integer.valueOf(i)).firstValue(new Function() { // from class: com.google.firebase.firestore.local.Ooooo00
            @Override // com.google.firebase.firestore.util.Function
            public final Object apply(Object obj) {
                return this.f68282OooO00o.lambda$lookupMutationBatch$3(i, (Cursor) obj);
            }
        });
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public void performConsistencyCheck() {
        if (isEmpty()) {
            final ArrayList arrayList = new ArrayList();
            this.f51786db.query("SELECT path FROM document_mutations WHERE uid = ?").binding(this.uid).forEach(new Consumer() { // from class: com.google.firebase.firestore.local.Oooooo0
                @Override // com.google.firebase.firestore.util.Consumer
                public final void accept(Object obj) {
                    SQLiteMutationQueue.lambda$performConsistencyCheck$11(arrayList, (Cursor) obj);
                }
            });
            Assert.hardAssert(arrayList.isEmpty(), "Document leak -- detected dangling mutation references when queue is empty. Dangling keys: %s", arrayList);
        }
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public void removeMutationBatch(MutationBatch mutationBatch) {
        SQLiteStatement sQLiteStatementPrepare = this.f51786db.prepare("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        SQLiteStatement sQLiteStatementPrepare2 = this.f51786db.prepare("DELETE FROM document_mutations WHERE uid = ? AND path = ? AND batch_id = ?");
        int batchId = mutationBatch.getBatchId();
        Assert.hardAssert(this.f51786db.execute(sQLiteStatementPrepare, this.uid, Integer.valueOf(batchId)) != 0, "Mutation batch (%s, %d) did not exist", this.uid, Integer.valueOf(mutationBatch.getBatchId()));
        Iterator<Mutation> it = mutationBatch.getMutations().iterator();
        while (it.hasNext()) {
            DocumentKey key = it.next().getKey();
            this.f51786db.execute(sQLiteStatementPrepare2, this.uid, EncodedPath.encode(key.getPath()), Integer.valueOf(batchId));
            this.f51786db.getReferenceDelegate().removeMutationReference(key);
        }
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public void setLastStreamToken(ByteString byteString) {
        this.lastStreamToken = (ByteString) Preconditions.checkNotNull(byteString);
        writeMutationQueueMetadata();
    }

    @Override // com.google.firebase.firestore.local.MutationQueue
    public void start() {
        loadNextBatchIdAcrossAllUsers();
        if (this.f51786db.query("SELECT last_stream_token FROM mutation_queues WHERE uid = ?").binding(this.uid).first(new Consumer() { // from class: com.google.firebase.firestore.local.OooooOO
            @Override // com.google.firebase.firestore.util.Consumer
            public final void accept(Object obj) {
                this.f68287OooO00o.lambda$start$0((Cursor) obj);
            }
        }) == 0) {
            writeMutationQueueMetadata();
        }
    }
}
