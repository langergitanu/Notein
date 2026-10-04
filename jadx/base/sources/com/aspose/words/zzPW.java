package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzPW {
    private int zzZn;

    public zzPW(int i) {
        this.zzZn = i;
    }

    public final int getValue() {
        return this.zzZn;
    }

    public final void zzMu(int i) {
        long j = ((long) this.zzZn) + ((long) i);
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        if (j < -2147483648L) {
            j = -2147483648L;
        }
        this.zzZn = (int) j;
    }
}
