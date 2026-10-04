package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYC8 {
    private zzZ5I[] zzXmJ;
    private com.aspose.words.internal.zzZQ4 zzXmK = com.aspose.words.internal.zzZQ4.zz2T;
    private long[] zzXmL;
    private zzYM6[] zzXmM;
    private long zzXmN;
    private long zzXmO;

    public zzYC8(long j, long j2) {
        this.zzXmO = 0L;
        this.zzXmN = 0L;
        this.zzXmN = j;
        this.zzXmO = j2;
    }

    public final void zzY(zzYM6[] zzym6Arr) {
        this.zzXmM = zzym6Arr;
    }

    public final long zzY8X() {
        return this.zzXmN;
    }

    public final long zzY8Y() {
        return this.zzXmO;
    }

    public final com.aspose.words.internal.zzZQ4 zzY8Z() {
        return this.zzXmK;
    }

    public final long[] zzY90() {
        return this.zzXmL;
    }

    public final zzYM6[] zzY91() {
        return this.zzXmM;
    }

    public final void zzYZ(com.aspose.words.internal.zzZQ4 zzzq4) {
        this.zzXmK = zzzq4;
    }

    public final void zzZ(zzZ5I[] zzz5iArr) {
        this.zzXmJ = zzz5iArr;
    }

    public final zzZ5I zzm5(int i) {
        zzZ5I[] zzz5iArr = this.zzXmJ;
        if (zzz5iArr == null) {
            return null;
        }
        return zzz5iArr[i];
    }

    public final void zzy(long[] jArr) {
        this.zzXmL = jArr;
    }
}
