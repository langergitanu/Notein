package com.google.firebase.crashlytics.internal.persistence;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooO0O0 implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return CrashlyticsReportPersistence.lambda$static$1(file, str);
    }
}
