package com.google.android.gms.internal.mlkit_translate;

import androidx.core.database.OooO00o;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
final class zzav extends zzbh {
    private zzav() {
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zzbh
    public final File zza() {
        File file = new File(zzh.JAVA_IO_TMPDIR.zza());
        String str = System.currentTimeMillis() + CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
        for (int i = 0; i < 10000; i++) {
            File file2 = new File(file, str + i);
            if (file2.mkdir()) {
                return file2;
            }
        }
        throw new IllegalStateException(OooO00o.OooO00o("Failed to create directory within 10000 attempts (tried ", str, "0 to ", str, "9999)"));
    }

    public /* synthetic */ zzav(zzau zzauVar) {
        super(null);
    }
}
