package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Function;

/* JADX INFO: renamed from: com.google.firebase.firestore.local.o00o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22687o00o0O implements Function {
    @Override // com.google.firebase.firestore.util.Function
    public final Object apply(Object obj) {
        return SQLitePersistence.lambda$getPageSize$0((Cursor) obj);
    }
}
