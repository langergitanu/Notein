package com.aspose.words.ref;

import com.aspose.words.internal.zzZPZ;

/* JADX INFO: loaded from: classes5.dex */
public class RefPoint {
    private long value;

    public RefPoint(long j) {
        this.value = j;
    }

    public long get() {
        return this.value;
    }

    public long set(long j) {
        this.value = j;
        return j;
    }

    public String toString() {
        return zzZPZ.zzYD(this.value).toString();
    }
}
