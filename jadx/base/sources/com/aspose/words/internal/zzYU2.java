package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzYU2 {
    public static void zzV(boolean z, String str) {
        if (z != zzZ5L.zzXH0()) {
            if (!z) {
                throw new zzZ0H(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Attempt to use unapproved implementation in approved thread: ", str));
            }
            throw new zzZ0H(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Attempt to use approved implementation in unapproved thread: ", str));
        }
        if (zzZ0L.zzXEf()) {
            throw new zzZ14(zzZ0L.zzXEg());
        }
    }
}
