package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzDA {
    public long zzuR;
    public long zzuS;

    public zzDA() {
    }

    public static boolean zzX(zzDA zzda, zzDA zzda2) {
        return zzda.zzuS == zzda2.zzuS && zzda.zzuR == zzda2.zzuR;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzDA)) {
            zzDA zzda = (zzDA) obj;
            if (this.zzuS == zzda.zzuS && this.zzuR == zzda.zzuR) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public zzDA(long j, long j2) {
        this.zzuS = j;
        this.zzuR = j2;
    }

    public zzDA(double d, double d2) {
        this.zzuS = (long) d;
        this.zzuR = (long) d2;
    }

    public zzDA(zzDA zzda) {
        this.zzuS = zzda.zzuS;
        this.zzuR = zzda.zzuR;
    }
}
