package com.facebook.soloader;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: renamed from: com.facebook.soloader.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22321OooOoOO implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return (str.equals("dso_state") || str.equals("dso_lock") || str.equals("dso_deps")) ? false : true;
    }
}
