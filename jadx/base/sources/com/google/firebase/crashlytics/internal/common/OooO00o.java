package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooO00o implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return CrashlyticsAppQualitySessionsStore.lambda$static$0(file, str);
    }
}
