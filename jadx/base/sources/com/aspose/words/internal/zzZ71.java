package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZ71 {
    private zzZ72 zzWou;

    public final synchronized zzZ72 zzXHs() {
        try {
            if (this.zzWou == null) {
                this.zzWou = zzXKm();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzWou;
    }

    public abstract zzZ72 zzXKm();
}
