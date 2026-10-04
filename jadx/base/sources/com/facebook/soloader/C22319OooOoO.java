package com.facebook.soloader;

import android.os.StrictMode;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.soloader.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22319OooOoO extends AbstractC22320OooOoO0 {
    @Override // com.facebook.soloader.AbstractC22320OooOoO0
    public final String OooO0OO() {
        return "SystemLoadWrapperSoSource";
    }

    @Override // com.facebook.soloader.AbstractC22320OooOoO0
    public final int OooO0Oo(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        try {
            System.loadLibrary(str.substring(3, str.length() - 3));
            return 1;
        } catch (Exception e) {
            Log.e("SoLoader", "Error loading library: " + str, e);
            return 0;
        }
    }

    @Override // com.facebook.soloader.AbstractC22320OooOoO0
    public final String toString() {
        return "SystemLoadWrapperSoSource[" + SysUtil.getClassLoaderLdLoadLibrary() + "]";
    }
}
