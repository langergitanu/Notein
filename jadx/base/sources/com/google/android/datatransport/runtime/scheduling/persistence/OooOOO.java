package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class OooOOO implements SQLiteEventStore.Function {
    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        return SQLiteEventStore.lambda$loadActiveContexts$9((Cursor) obj);
    }
}
