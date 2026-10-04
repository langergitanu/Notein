package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzYL8 {
    private long zzXDR;
    private int zzXDS;

    public zzYL8(long j) {
        this(j, 0);
    }

    private boolean zzX(zzYL8 zzyl8) {
        if (com.aspose.words.internal.zzZKO.zzA(null, zzyl8)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, zzyl8)) {
            return true;
        }
        return com.aspose.words.internal.zzZKO.equals(Integer.valueOf(zzyl8.zzXDS), Integer.valueOf(this.zzXDS)) && com.aspose.words.internal.zzZPY.zzD(zzyl8.zzXDR, this.zzXDR);
    }

    public boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzYL8.class) {
            return false;
        }
        return zzX((zzYL8) obj);
    }

    public int hashCode() {
        int i = this.zzXDS * 397;
        long j = this.zzXDR;
        return i ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return zzY3D.toString(this.zzXDS) + ":{X=" + Float.intBitsToFloat((int) this.zzXDR) + ", Y=" + com.aspose.words.internal.zzZPY.zzYC(this.zzXDR) + "}";
    }

    public final void zzXu(long j) {
        this.zzXDR = j;
    }

    public final long zzYn8() {
        return this.zzXDR;
    }

    public final int zzYn9() {
        return this.zzXDS;
    }

    public final void zzpZ(int i) {
        this.zzXDS = i;
    }

    public zzYL8(long j, int i) {
        this.zzXDR = j;
        this.zzXDS = i;
    }
}
