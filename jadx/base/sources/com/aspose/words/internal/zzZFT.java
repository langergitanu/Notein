package com.aspose.words.internal;

import androidx.datastore.preferences.protobuf.C21825OoooOO0;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZFT extends RuntimeException {
    final zzZQS zzWMT;

    private zzZFT(zzZQS zzzqs) {
        super(zzzqs.getMessage(), zzzqs);
        this.zzWMT = zzzqs;
    }

    public static void zzY(zzZQS zzzqs) throws zzZFT {
        throw new zzZFT(zzzqs);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder("[");
        C21825OoooOO0.OooO0OO(zzZFT.class, sb, "] ");
        sb.append(this.zzWMT.getMessage());
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        C21825OoooOO0.OooO0OO(zzZFT.class, sb, "] ");
        sb.append(this.zzWMT.toString());
        return sb.toString();
    }
}
