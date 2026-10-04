package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22561OooO0Oo implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return CrashlyticsController.lambda$static$0(file, str);
    }
}
