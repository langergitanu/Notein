package com.google.firebase.firestore.local;

import com.google.firebase.firestore.model.FieldIndex;
import java.util.Comparator;

/* JADX INFO: renamed from: com.google.firebase.firestore.local.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22664OoooO00 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return SQLiteIndexManager.lambda$new$0((FieldIndex) obj, (FieldIndex) obj2);
    }
}
