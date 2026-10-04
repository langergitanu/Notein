package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYUL {
    public static int zzf4(int i) {
        if (i <= 1024) {
            return 80;
        }
        return (((i - 1) / 1024) * 16) + 96;
    }
}
