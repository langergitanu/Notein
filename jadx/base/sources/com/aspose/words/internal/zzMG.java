package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzMG extends zzMO {
    private zzP5 zzOU;

    public static long[] zzY(long[] jArr, long j) {
        long[] jArr2 = new long[jArr.length + 1];
        jArr2[0] = j;
        System.arraycopy(jArr, 0, jArr2, 1, jArr.length);
        return jArr2;
    }

    public abstract boolean isEmpty();

    public abstract boolean zzJR();

    public final zzP5 zzb(long j) {
        zzP5 zzp5 = this.zzOU;
        if (zzp5 != null) {
            return zzp5;
        }
        zzP5 zzp5Zzc = zzc(j);
        this.zzOU = zzp5Zzc;
        return zzp5Zzc;
    }

    public abstract zzP5 zzc(long j);
}
