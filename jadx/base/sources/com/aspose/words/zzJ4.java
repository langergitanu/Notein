package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzJ4 {
    private long zzDK;
    private long zzDL;
    private Iterable<Integer> zzZhU;
    private Iterable<Integer> zzZhV;
    private float zzZif;

    public zzJ4(long j, long j2, com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42) {
        this.zzDL = j;
        this.zzDK = j2;
        this.zzZif = com.aspose.words.internal.zzJ6.zzO(j, j2);
        this.zzZhV = zzY(j, zzzq4);
        this.zzZhU = zzY(j2, zzzq42);
    }

    private static Iterable<Integer> zzY(long j, com.aspose.words.internal.zzZQ4 zzzq4) {
        ArrayList arrayList = new ArrayList();
        if (com.aspose.words.internal.zzAN.zzS(com.aspose.words.internal.zzZPY.zzYC(j), zzzq4.zzZo())) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<int>) arrayList, 2);
        }
        if (com.aspose.words.internal.zzAN.zzS(com.aspose.words.internal.zzZPY.zzYC(j), zzzq4.zzZn())) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<int>) arrayList, 3);
        }
        int i = (int) j;
        if (com.aspose.words.internal.zzAN.zzS(Float.intBitsToFloat(i), zzzq4.zzZm())) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<int>) arrayList, 0);
        }
        if (com.aspose.words.internal.zzAN.zzS(Float.intBitsToFloat(i), zzzq4.zzkw())) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<int>) arrayList, 1);
        }
        return arrayList;
    }

    public final long zz1y() {
        return this.zzDL;
    }

    public final Iterable<Integer> zzZRP() {
        return this.zzZhU;
    }

    public final Iterable<Integer> zzZRQ() {
        return this.zzZhV;
    }

    public final double zzZRR() {
        return Math.atan2(com.aspose.words.internal.zzZPY.zzYC(this.zzDK) - com.aspose.words.internal.zzZPY.zzYC(this.zzDL), Float.intBitsToFloat((int) this.zzDK) - Float.intBitsToFloat((int) this.zzDL));
    }

    public final long zzZS6() {
        return this.zzDK;
    }

    public final float zzZSd() {
        return this.zzZif;
    }
}
