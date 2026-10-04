package com.google.firebase.firestore.local;

import OooOoo.C20593OooO0Oo;
import OoooooO.C21445Oooo;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import com.aspose.slides.C22218Oooo;
import com.google.firebase.firestore.local.MemoryIndexManager;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.proto.Target;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Consumer;
import com.google.firebase.firestore.util.Logger;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
class SQLiteSchema {
    static final int MIGRATION_BATCH_SIZE = 100;
    static final int VERSION = 17;

    /* JADX INFO: renamed from: db */
    private final SQLiteDatabase f51792db;
    private final LocalSerializer serializer;

    public SQLiteSchema(SQLiteDatabase sQLiteDatabase, LocalSerializer localSerializer) {
        this.f51792db = sQLiteDatabase;
        this.serializer = localSerializer;
    }

    private void addPathLength() {
        if (tableContainsColumn("remote_documents", "path_length")) {
            return;
        }
        this.f51792db.execSQL("ALTER TABLE remote_documents ADD COLUMN path_length INTEGER");
    }

    private void addPendingDataMigration(String str) {
        this.f51792db.execSQL("INSERT OR IGNORE INTO data_migrations (migration_name) VALUES (?)", new String[]{str});
    }

    private void addReadTime() {
        this.f51792db.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_seconds INTEGER");
        this.f51792db.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_nanos INTEGER");
    }

    private void addSequenceNumber() {
        if (tableContainsColumn("target_documents", "sequence_number")) {
            return;
        }
        this.f51792db.execSQL("ALTER TABLE target_documents ADD COLUMN sequence_number INTEGER");
    }

    private void addTargetCount() {
        if (!tableContainsColumn("target_globals", "target_count")) {
            this.f51792db.execSQL("ALTER TABLE target_globals ADD COLUMN target_count INTEGER");
        }
        long jQueryNumEntries = DatabaseUtils.queryNumEntries(this.f51792db, "targets");
        ContentValues contentValues = new ContentValues();
        contentValues.put("target_count", Long.valueOf(jQueryNumEntries));
        this.f51792db.update("target_globals", contentValues, null, null);
    }

    private void createBundleCache() {
        ifTablesDontExist(new String[]{"bundles", "named_queries"}, new Runnable() { // from class: com.google.firebase.firestore.local.o0OOO0o
            @Override // java.lang.Runnable
            public final void run() {
                this.f68334OooOo0o.lambda$createBundleCache$15();
            }
        });
    }

    private void createDataMigrationTable() {
        ifTablesDontExist(new String[]{"data_migrations"}, new Runnable() { // from class: com.google.firebase.firestore.local.o00000OO
            @Override // java.lang.Runnable
            public final void run() {
                this.f68304OooOo0o.lambda$createDataMigrationTable$17();
            }
        });
    }

    private void createFieldIndex() {
        ifTablesDontExist(new String[]{"index_configuration", "index_state", "index_entries"}, new Runnable() { // from class: com.google.firebase.firestore.local.o000000
            @Override // java.lang.Runnable
            public final void run() {
                this.f68297OooOo0o.lambda$createFieldIndex$5();
            }
        });
    }

    private void createGlobalsTable() {
        ifTablesDontExist(new String[]{"globals"}, new Runnable() { // from class: com.google.firebase.firestore.local.o00000Oo
            @Override // java.lang.Runnable
            public final void run() {
                this.f68305OooOo0o.lambda$createGlobalsTable$18();
            }
        });
    }

    private void createOverlays() {
        ifTablesDontExist(new String[]{"document_overlays"}, new Runnable() { // from class: com.google.firebase.firestore.local.o0OO00O
            @Override // java.lang.Runnable
            public final void run() {
                this.f68333OooOo0o.lambda$createOverlays$16();
            }
        });
    }

    private void createV1MutationQueue() {
        ifTablesDontExist(new String[]{"mutation_queues", "mutations", "document_mutations"}, new Runnable() { // from class: com.google.firebase.firestore.local.oo0o0Oo
            @Override // java.lang.Runnable
            public final void run() {
                this.f68350OooOo0o.lambda$createV1MutationQueue$0();
            }
        });
    }

    private void createV1RemoteDocumentCache() {
        ifTablesDontExist(new String[]{"remote_documents"}, new Runnable() { // from class: com.google.firebase.firestore.local.o0000Ooo
            @Override // java.lang.Runnable
            public final void run() {
                this.f68312OooOo0o.lambda$createV1RemoteDocumentCache$4();
            }
        });
    }

    private void createV1TargetCache() {
        ifTablesDontExist(new String[]{"targets", "target_globals", "target_documents"}, new Runnable() { // from class: com.google.firebase.firestore.local.o000000O
            @Override // java.lang.Runnable
            public final void run() {
                this.f68298OooOo0o.lambda$createV1TargetCache$3();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.firebase.firestore.local.o000000o] */
    private void createV8CollectionParentsIndex() {
        ifTablesDontExist(new String[]{"collection_parents"}, new Runnable() { // from class: com.google.firebase.firestore.local.o0ooOOo
            @Override // java.lang.Runnable
            public final void run() {
                this.f68341OooOo0o.lambda$createV8CollectionParentsIndex$9();
            }
        });
        final MemoryIndexManager.MemoryCollectionParentIndex memoryCollectionParentIndex = new MemoryIndexManager.MemoryCollectionParentIndex();
        final SQLiteStatement sQLiteStatementCompileStatement = this.f51792db.compileStatement("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)");
        final ?? r2 = new Consumer() { // from class: com.google.firebase.firestore.local.o000000o
            @Override // com.google.firebase.firestore.util.Consumer
            public final void accept(Object obj) {
                SQLiteSchema.lambda$createV8CollectionParentsIndex$10(memoryCollectionParentIndex, sQLiteStatementCompileStatement, (ResourcePath) obj);
            }
        };
        new SQLitePersistence.Query(this.f51792db, "SELECT path FROM remote_documents").forEach(new Consumer() { // from class: com.google.firebase.firestore.local.o00000
            @Override // com.google.firebase.firestore.util.Consumer
            public final void accept(Object obj) {
                SQLiteSchema.lambda$createV8CollectionParentsIndex$11(r2, (Cursor) obj);
            }
        });
        new SQLitePersistence.Query(this.f51792db, "SELECT path FROM document_mutations").forEach(new Consumer() { // from class: com.google.firebase.firestore.local.o00000O0
            @Override // com.google.firebase.firestore.util.Consumer
            public final void accept(Object obj) {
                SQLiteSchema.lambda$createV8CollectionParentsIndex$12(r2, (Cursor) obj);
            }
        });
    }

    private void dropLastLimboFreeSnapshotVersion() {
        new SQLitePersistence.Query(this.f51792db, "SELECT target_id, target_proto FROM targets").forEach(new Consumer() { // from class: com.google.firebase.firestore.local.o00000o0
            @Override // com.google.firebase.firestore.util.Consumer
            public final void accept(Object obj) {
                this.f68306OooO00o.lambda$dropLastLimboFreeSnapshotVersion$6((Cursor) obj);
            }
        });
    }

    private void dropV1TargetCache() {
        if (tableExists("targets")) {
            this.f51792db.execSQL("DROP TABLE targets");
        }
        if (tableExists("target_globals")) {
            this.f51792db.execSQL("DROP TABLE target_globals");
        }
        if (tableExists("target_documents")) {
            this.f51792db.execSQL("DROP TABLE target_documents");
        }
    }

    private void ensurePathLength() {
        final boolean[] zArr;
        SQLitePersistence.Query queryBinding = new SQLitePersistence.Query(this.f51792db, "SELECT path FROM remote_documents WHERE path_length IS NULL LIMIT ?").binding(100);
        final SQLiteStatement sQLiteStatementCompileStatement = this.f51792db.compileStatement("UPDATE remote_documents SET path_length = ? WHERE path = ?");
        do {
            zArr = new boolean[]{false};
            queryBinding.forEach(new Consumer() { // from class: com.google.firebase.firestore.local.o0ooOoO
                @Override // com.google.firebase.firestore.util.Consumer
                public final void accept(Object obj) {
                    SQLiteSchema.lambda$ensurePathLength$14(zArr, sQLiteStatementCompileStatement, (Cursor) obj);
                }
            });
        } while (zArr[0]);
    }

    private void ensureReadTime() {
        this.f51792db.execSQL("UPDATE remote_documents SET read_time_seconds = 0, read_time_nanos = 0 WHERE read_time_seconds IS NULL");
    }

    private void ensureSequenceNumbers() {
        final boolean[] zArr;
        Long l = (Long) new SQLitePersistence.Query(this.f51792db, "SELECT highest_listen_sequence_number FROM target_globals LIMIT 1").firstValue(new o0O0O00());
        Assert.hardAssert(l != null, "Missing highest sequence number", new Object[0]);
        final long jLongValue = l.longValue();
        final SQLiteStatement sQLiteStatementCompileStatement = this.f51792db.compileStatement("INSERT INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)");
        SQLitePersistence.Query queryBinding = new SQLitePersistence.Query(this.f51792db, "SELECT RD.path FROM remote_documents AS RD WHERE NOT EXISTS (SELECT TD.path FROM target_documents AS TD WHERE RD.path = TD.path AND TD.target_id = 0) LIMIT ?").binding(100);
        do {
            zArr = new boolean[]{false};
            queryBinding.forEach(new Consumer() { // from class: com.google.firebase.firestore.local.o000OOo
                @Override // com.google.firebase.firestore.util.Consumer
                public final void accept(Object obj) {
                    SQLiteSchema.lambda$ensureSequenceNumbers$8(zArr, sQLiteStatementCompileStatement, jLongValue, (Cursor) obj);
                }
            });
        } while (zArr[0]);
    }

    private void ensureTargetGlobal() {
        if (DatabaseUtils.queryNumEntries(this.f51792db, "target_globals") == 1) {
            return;
        }
        this.f51792db.execSQL("INSERT INTO target_globals (highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos) VALUES (?, ?, ?, ?)", new String[]{"0", "0", "0", "0"});
    }

    private boolean hasReadTime() {
        boolean zTableContainsColumn = tableContainsColumn("remote_documents", "read_time_seconds");
        boolean zTableContainsColumn2 = tableContainsColumn("remote_documents", "read_time_nanos");
        Assert.hardAssert(zTableContainsColumn == zTableContainsColumn2, "Table contained just one of read_time_seconds or read_time_nanos", new Object[0]);
        return zTableContainsColumn && zTableContainsColumn2;
    }

    private void ifTablesDontExist(String[] strArr, Runnable runnable) {
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("["), TextUtils.join(", ", strArr), "]");
        boolean z = false;
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            boolean zTableExists = tableExists(str);
            if (i == 0) {
                z = zTableExists;
            } else if (zTableExists != z) {
                String strOooO0O0 = C20593OooO0Oo.OooO0O0("Expected all of ", strOooO0OO, " to either exist or not, but ");
                throw new IllegalStateException(z ? C21445Oooo.OooO0O0(C22218Oooo.OooO0OO(strOooO0O0), strArr[0], " exists and ", str, " does not") : C21445Oooo.OooO0O0(C22218Oooo.OooO0OO(strOooO0O0), strArr[0], " does not exist and ", str, " does"));
            }
        }
        if (z) {
            Logger.debug("SQLiteSchema", C20593OooO0Oo.OooO0O0("Skipping migration because all of ", strOooO0OO, " already exist"), new Object[0]);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createBundleCache$15() {
        this.f51792db.execSQL("CREATE TABLE bundles (bundle_id TEXT PRIMARY KEY, create_time_seconds INTEGER, create_time_nanos INTEGER, schema_version INTEGER, total_documents INTEGER, total_bytes INTEGER)");
        this.f51792db.execSQL("CREATE TABLE named_queries (name TEXT PRIMARY KEY, read_time_seconds INTEGER, read_time_nanos INTEGER, bundled_query_proto BLOB)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createDataMigrationTable$17() {
        this.f51792db.execSQL("CREATE TABLE data_migrations (migration_name TEXT, PRIMARY KEY (migration_name))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createFieldIndex$5() {
        this.f51792db.execSQL("CREATE TABLE index_configuration (index_id INTEGER, collection_group TEXT, index_proto BLOB, PRIMARY KEY (index_id))");
        this.f51792db.execSQL("CREATE TABLE index_state (index_id INTEGER, uid TEXT, sequence_number INTEGER, read_time_seconds INTEGER, read_time_nanos INTEGER, document_key TEXT, largest_batch_id INTEGER, PRIMARY KEY (index_id, uid))");
        this.f51792db.execSQL("CREATE TABLE index_entries (index_id INTEGER, uid TEXT, array_value BLOB, directional_value BLOB, document_key TEXT, PRIMARY KEY (index_id, uid, array_value, directional_value, document_key))");
        this.f51792db.execSQL("CREATE INDEX read_time ON remote_documents(read_time_seconds, read_time_nanos)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createGlobalsTable$18() {
        this.f51792db.execSQL("CREATE TABLE globals (name TEXT PRIMARY KEY, value BLOB)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createOverlays$16() {
        this.f51792db.execSQL("CREATE TABLE document_overlays (uid TEXT, collection_path TEXT, document_id TEXT, collection_group TEXT, largest_batch_id INTEGER, overlay_mutation BLOB, PRIMARY KEY (uid, collection_path, document_id))");
        this.f51792db.execSQL("CREATE INDEX batch_id_overlay ON document_overlays (uid, largest_batch_id)");
        this.f51792db.execSQL("CREATE INDEX collection_group_overlay ON document_overlays (uid, collection_group)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createV1MutationQueue$0() {
        this.f51792db.execSQL("CREATE TABLE mutation_queues (uid TEXT PRIMARY KEY, last_acknowledged_batch_id INTEGER, last_stream_token BLOB)");
        this.f51792db.execSQL("CREATE TABLE mutations (uid TEXT, batch_id INTEGER, mutations BLOB, PRIMARY KEY (uid, batch_id))");
        this.f51792db.execSQL("CREATE TABLE document_mutations (uid TEXT, path TEXT, batch_id INTEGER, PRIMARY KEY (uid, path, batch_id))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createV1RemoteDocumentCache$4() {
        this.f51792db.execSQL("CREATE TABLE remote_documents (path TEXT PRIMARY KEY, contents BLOB)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createV1TargetCache$3() {
        this.f51792db.execSQL("CREATE TABLE targets (target_id INTEGER PRIMARY KEY, canonical_id TEXT, snapshot_version_seconds INTEGER, snapshot_version_nanos INTEGER, resume_token BLOB, last_listen_sequence_number INTEGER,target_proto BLOB)");
        this.f51792db.execSQL("CREATE INDEX query_targets ON targets (canonical_id, target_id)");
        this.f51792db.execSQL("CREATE TABLE target_globals (highest_target_id INTEGER, highest_listen_sequence_number INTEGER, last_remote_snapshot_version_seconds INTEGER, last_remote_snapshot_version_nanos INTEGER)");
        this.f51792db.execSQL("CREATE TABLE target_documents (target_id INTEGER, path TEXT, PRIMARY KEY (target_id, path))");
        this.f51792db.execSQL("CREATE INDEX document_targets ON target_documents (path, target_id)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createV8CollectionParentsIndex$10(MemoryIndexManager.MemoryCollectionParentIndex memoryCollectionParentIndex, SQLiteStatement sQLiteStatement, ResourcePath resourcePath) {
        if (memoryCollectionParentIndex.add(resourcePath)) {
            String lastSegment = resourcePath.getLastSegment();
            ResourcePath resourcePathPopLast = resourcePath.popLast();
            sQLiteStatement.clearBindings();
            sQLiteStatement.bindString(1, lastSegment);
            sQLiteStatement.bindString(2, EncodedPath.encode(resourcePathPopLast));
            sQLiteStatement.execute();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createV8CollectionParentsIndex$11(Consumer consumer, Cursor cursor) {
        consumer.accept(EncodedPath.decodeResourcePath(cursor.getString(0)).popLast());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createV8CollectionParentsIndex$12(Consumer consumer, Cursor cursor) {
        consumer.accept(EncodedPath.decodeResourcePath(cursor.getString(0)).popLast());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createV8CollectionParentsIndex$9() {
        this.f51792db.execSQL("CREATE TABLE collection_parents (collection_id TEXT, parent TEXT, PRIMARY KEY(collection_id, parent))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dropLastLimboFreeSnapshotVersion$6(Cursor cursor) {
        int i = cursor.getInt(0);
        try {
            this.f51792db.execSQL("UPDATE targets SET target_proto = ? WHERE target_id = ?", new Object[]{Target.parseFrom(cursor.getBlob(1)).toBuilder().clearLastLimboFreeSnapshotVersion().build().toByteArray(), Integer.valueOf(i)});
        } catch (InvalidProtocolBufferException unused) {
            throw Assert.fail("Failed to decode Query data for target %s", Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$ensurePathLength$14(boolean[] zArr, SQLiteStatement sQLiteStatement, Cursor cursor) {
        zArr[0] = true;
        String string = cursor.getString(0);
        ResourcePath resourcePathDecodeResourcePath = EncodedPath.decodeResourcePath(string);
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, resourcePathDecodeResourcePath.length());
        sQLiteStatement.bindString(2, string);
        Assert.hardAssert(sQLiteStatement.executeUpdateDelete() != -1, "Failed to update document path", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$ensureSequenceNumbers$7(Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$ensureSequenceNumbers$8(boolean[] zArr, SQLiteStatement sQLiteStatement, long j, Cursor cursor) {
        zArr[0] = true;
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindString(1, cursor.getString(0));
        sQLiteStatement.bindLong(2, j);
        Assert.hardAssert(sQLiteStatement.executeInsert() != -1, "Failed to insert a sentinel row", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeAcknowledgedMutations$1(String str, Cursor cursor) {
        removeMutationBatch(str, cursor.getInt(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeAcknowledgedMutations$2(Cursor cursor) {
        final String string = cursor.getString(0);
        new SQLitePersistence.Query(this.f51792db, "SELECT batch_id FROM mutations WHERE uid = ? AND batch_id <= ?").binding(string, Long.valueOf(cursor.getLong(1))).forEach(new Consumer() { // from class: com.google.firebase.firestore.local.o00000O
            @Override // com.google.firebase.firestore.util.Consumer
            public final void accept(Object obj) {
                this.f68301OooO00o.lambda$removeAcknowledgedMutations$1(string, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$rewriteCanonicalIds$13(Cursor cursor) {
        int i = cursor.getInt(0);
        try {
            this.f51792db.execSQL("UPDATE targets SET canonical_id  = ? WHERE target_id = ?", new Object[]{this.serializer.decodeTargetData(Target.parseFrom(cursor.getBlob(1))).getTarget().getCanonicalId(), Integer.valueOf(i)});
        } catch (InvalidProtocolBufferException unused) {
            throw Assert.fail("Failed to decode Query data for target %s", Integer.valueOf(i));
        }
    }

    private void removeAcknowledgedMutations() {
        new SQLitePersistence.Query(this.f51792db, "SELECT uid, last_acknowledged_batch_id FROM mutation_queues").forEach(new Consumer() { // from class: com.google.firebase.firestore.local.o0Oo0oo
            @Override // com.google.firebase.firestore.util.Consumer
            public final void accept(Object obj) {
                this.f68335OooO00o.lambda$removeAcknowledgedMutations$2((Cursor) obj);
            }
        });
    }

    private void removeMutationBatch(String str, int i) {
        SQLiteStatement sQLiteStatementCompileStatement = this.f51792db.compileStatement("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        sQLiteStatementCompileStatement.bindString(1, str);
        sQLiteStatementCompileStatement.bindLong(2, i);
        Assert.hardAssert(sQLiteStatementCompileStatement.executeUpdateDelete() != 0, "Mutation batch (%s, %d) did not exist", str, Integer.valueOf(i));
        this.f51792db.execSQL("DELETE FROM document_mutations WHERE uid = ? AND batch_id = ?", new Object[]{str, Integer.valueOf(i)});
    }

    private void rewriteCanonicalIds() {
        new SQLitePersistence.Query(this.f51792db, "SELECT target_id, target_proto FROM targets").forEach(new Consumer() { // from class: com.google.firebase.firestore.local.o00000oO
            @Override // com.google.firebase.firestore.util.Consumer
            public final void accept(Object obj) {
                this.f68307OooO00o.lambda$rewriteCanonicalIds$13((Cursor) obj);
            }
        });
    }

    private boolean tableContainsColumn(String str, String str2) {
        return getTableColumns(str).indexOf(str2) != -1;
    }

    private boolean tableExists(String str) {
        return !new SQLitePersistence.Query(this.f51792db, "SELECT 1=1 FROM sqlite_master WHERE tbl_name = ?").binding(str).isEmpty();
    }

    public List<String> getTableColumns(String str) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = this.f51792db.rawQuery("PRAGMA table_info(" + str + ")", null);
            int columnIndex = cursorRawQuery.getColumnIndex("name");
            while (cursorRawQuery.moveToNext()) {
                arrayList.add(cursorRawQuery.getString(columnIndex));
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public void runSchemaUpgrades() {
        runSchemaUpgrades(0);
    }

    public void runSchemaUpgrades(int i) {
        runSchemaUpgrades(i, 17);
    }

    public void runSchemaUpgrades(int i, int i2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i < 1 && i2 >= 1) {
            createV1MutationQueue();
            createV1TargetCache();
            createV1RemoteDocumentCache();
        }
        if (i < 3 && i2 >= 3 && i != 0) {
            dropV1TargetCache();
            createV1TargetCache();
        }
        if (i < 4 && i2 >= 4) {
            ensureTargetGlobal();
            addTargetCount();
        }
        if (i < 5 && i2 >= 5) {
            addSequenceNumber();
        }
        if (i < 6 && i2 >= 6) {
            removeAcknowledgedMutations();
        }
        if (i < 7 && i2 >= 7) {
            ensureSequenceNumbers();
        }
        if (i < 8 && i2 >= 8) {
            createV8CollectionParentsIndex();
        }
        if (i < 9 && i2 >= 9) {
            if (!hasReadTime()) {
                addReadTime();
            } else {
                dropLastLimboFreeSnapshotVersion();
            }
        }
        if (i == 9 && i2 >= 10) {
            dropLastLimboFreeSnapshotVersion();
        }
        if (i < 11 && i2 >= 11) {
            rewriteCanonicalIds();
        }
        if (i < 12 && i2 >= 12) {
            createBundleCache();
        }
        if (i < 13 && i2 >= 13) {
            addPathLength();
            ensurePathLength();
        }
        if (i < 14 && i2 >= 14) {
            createOverlays();
            createDataMigrationTable();
            addPendingDataMigration(Persistence.DATA_MIGRATION_BUILD_OVERLAYS);
        }
        if (i < 15 && i2 >= 15) {
            ensureReadTime();
        }
        if (i < 16 && i2 >= 16) {
            createFieldIndex();
        }
        if (i < 17 && i2 >= 17) {
            createGlobalsTable();
        }
        Logger.debug("SQLiteSchema", "Migration from version %s to %s took %s milliseconds", Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }
}
