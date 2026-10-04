package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZTX extends zzZU0 {
    private boolean zzD7;
    private long[] zzDl;

    private static boolean zzP(long[] jArr) {
        if (jArr.length < 2) {
            return true;
        }
        long j = jArr[0];
        for (long j2 : jArr) {
            if (!zzAN.zzH(j, j2)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.aspose.words.internal.zzZU0
    public final boolean isEmpty() {
        return this.zzD7;
    }

    @Override // com.aspose.words.internal.zzZU0
    public final boolean zzJB() {
        return false;
    }

    @Override // com.aspose.words.internal.zzZU0
    public final zzP8 zzJL() {
        return zz9K.zzY(this.zzDl, false);
    }

    public final long[] zzJx() {
        return this.zzDl;
    }

    @Override // com.aspose.words.internal.zzZUN
    public final void zzK0() throws Exception {
        long[] jArrZzMU = zzmY().zzMU();
        this.zzDl = jArrZzMU;
        this.zzD7 = zzP(jArrZzMU);
    }
}
