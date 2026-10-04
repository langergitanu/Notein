package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzDD {
    private long zzuX;
    private long zzuY;

    public zzDD() {
    }

    private static boolean zzI(long j, long j2) {
        return (j ^ Long.MIN_VALUE) < (j2 ^ Long.MIN_VALUE);
    }

    public static zzDD zzJ(long j, long j2) {
        boolean z = ((j > 0L ? 1 : (j == 0L ? 0 : -1)) < 0) != ((j2 > 0L ? 1 : (j2 == 0L ? 0 : -1)) < 0);
        if (j < 0) {
            j = -j;
        }
        if (j2 < 0) {
            j2 = -j2;
        }
        long j3 = j >>> 32;
        long j4 = j & 4294967295L;
        long j5 = j2 >>> 32;
        long j6 = j2 & 4294967295L;
        long j7 = j4 * j6;
        long j8 = (j4 * j5) + (j3 * j6);
        long j9 = (j3 * j5) + (j8 >>> 32);
        long j10 = (j8 << 32) + j7;
        if (zzI(j10, j7)) {
            j9++;
        }
        zzDD zzdd = new zzDD(j9, j10);
        return z ? zzZ(zzdd) : zzdd;
    }

    public static boolean zzZ(zzDD zzdd, zzDD zzdd2) {
        if (zzdd == zzdd2) {
            return true;
        }
        return zzdd.zzuY == zzdd2.zzuY && zzdd.zzuX == zzdd2.zzuX;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzDD)) {
            zzDD zzdd = (zzDD) obj;
            if (zzdd.zzuY == this.zzuY && zzdd.zzuX == this.zzuX) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return zzZKP.zzYs(this.zzuY) ^ zzZKP.zzYs(this.zzuX);
    }

    private zzDD(long j, long j2) {
        this.zzuX = j2;
        this.zzuY = j;
    }

    private static zzDD zzZ(zzDD zzdd) {
        long j = zzdd.zzuX;
        return j == 0 ? new zzDD(-zzdd.zzuY, 0L) : new zzDD(~zzdd.zzuY, (~j) + 1);
    }
}
