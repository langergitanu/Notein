package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.protobuf.ByteString;

/* JADX INFO: loaded from: classes8.dex */
public class SQLiteGlobalsCache implements GlobalsCache {
    private static final String SESSION_TOKEN = "sessionToken";

    /* JADX INFO: renamed from: db */
    private final SQLitePersistence f51784db;

    public SQLiteGlobalsCache(SQLitePersistence sQLitePersistence) {
        this.f51784db = sQLitePersistence;
    }

    private byte[] get(String str) {
        return (byte[]) this.f51784db.query("SELECT value FROM globals WHERE name = ?").binding(str).firstValue(new C22660Oooo0oO());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$get$0(Cursor cursor) {
        return cursor.getBlob(0);
    }

    private void set(String str, byte[] bArr) {
        this.f51784db.execute("INSERT OR REPLACE INTO globals (name, value) VALUES (?, ?)", str, bArr);
    }

    @Override // com.google.firebase.firestore.local.GlobalsCache
    public ByteString getSessionsToken() {
        byte[] bArr = get(SESSION_TOKEN);
        return bArr == null ? ByteString.EMPTY : ByteString.copyFrom(bArr);
    }

    @Override // com.google.firebase.firestore.local.GlobalsCache
    public void setSessionToken(ByteString byteString) {
        set(SESSION_TOKEN, byteString.toByteArray());
    }
}
