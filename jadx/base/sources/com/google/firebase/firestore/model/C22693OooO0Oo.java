package com.google.firebase.firestore.model;

import com.google.firebase.firestore.model.FieldIndex;
import java.util.Comparator;

/* JADX INFO: renamed from: com.google.firebase.firestore.model.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22693OooO0Oo implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return FieldIndex.IndexOffset.lambda$static$0((MutableDocument) obj, (MutableDocument) obj2);
    }
}
