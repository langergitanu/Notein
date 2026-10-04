package com.google.firebase.crashlytics.internal.persistence;

import com.google.firebase.firestore.model.DocumentKey;
import java.io.File;
import java.util.Comparator;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.persistence.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22579OooO0Oo implements Comparator {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f68036OooOo0o;

    public /* synthetic */ C22579OooO0Oo(int i) {
        this.f68036OooOo0o = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f68036OooOo0o) {
            case 0:
                return CrashlyticsReportPersistence.oldestEventFileFirst((File) obj, (File) obj2);
            default:
                return ((DocumentKey) obj).compareTo2((DocumentKey) obj2);
        }
    }
}
