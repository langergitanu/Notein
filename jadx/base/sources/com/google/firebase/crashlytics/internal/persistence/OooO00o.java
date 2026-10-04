package com.google.firebase.crashlytics.internal.persistence;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooO00o implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return CrashlyticsReportPersistence.lambda$static$0((File) obj, (File) obj2);
    }
}
