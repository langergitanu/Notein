package com.google.firebase.firestore.local;

import com.google.firebase.firestore.local.LruGarbageCollector;
import java.util.Comparator;

/* JADX INFO: renamed from: com.google.firebase.firestore.local.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22651OooOooO implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return LruGarbageCollector.RollingSequenceNumberBuffer.lambda$static$0((Long) obj, (Long) obj2);
    }
}
