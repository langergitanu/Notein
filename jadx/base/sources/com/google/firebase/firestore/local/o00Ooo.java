package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Function;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class o00Ooo implements Function {
    @Override // com.google.firebase.firestore.util.Function
    public final Object apply(Object obj) {
        return SQLitePersistence.lambda$getPageCount$1((Cursor) obj);
    }
}
