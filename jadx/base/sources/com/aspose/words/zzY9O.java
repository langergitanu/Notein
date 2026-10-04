package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY9O {
    String zzLJ;
    private boolean zzXbd;
    boolean zzXbe;
    boolean zzXbf;
    String zzXbg;
    boolean zzXbh;
    boolean zzXbi;
    int zzXbj;
    boolean zzXbk;

    public zzY9O(int i, int i2, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.zzXbk = i == 12803;
        this.zzXbj = i2;
        this.zzXbg = str;
        this.zzLJ = str2;
        this.zzXbi = z;
        this.zzXbh = z2;
        this.zzXbf = z3;
        this.zzXbe = z4;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof zzY9O)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        zzY9O zzy9o = (zzY9O) obj;
        return this.zzXbk == zzy9o.zzXbk && this.zzXbj == zzy9o.zzXbj && this.zzXbi == zzy9o.zzXbi && com.aspose.words.internal.zzZKN.equals(zzy9o.zzXbg, this.zzXbg) && com.aspose.words.internal.zzZKN.equals(zzy9o.zzLJ, this.zzLJ) && this.zzXbf == zzy9o.zzXbf && this.zzXbe == zzy9o.zzXbe && this.zzXbd == zzy9o.zzXbd;
    }

    public final int hashCode() {
        int iZzYY = ((((com.aspose.words.internal.zzZKP.zzYY(this.zzXbk) * 397) ^ this.zzXbj) * 397) ^ com.aspose.words.internal.zzZKP.zzYY(this.zzXbi)) * 397;
        String str = this.zzXbg;
        int iHashCode = (iZzYY ^ (str != null ? str.hashCode() : 0)) * 397;
        String str2 = this.zzLJ;
        return ((((((iHashCode ^ (str2 != null ? str2.hashCode() : 0)) * 397) ^ com.aspose.words.internal.zzZKP.zzYY(this.zzXbf)) * 397) ^ com.aspose.words.internal.zzZKP.zzYY(this.zzXbe)) * 397) ^ com.aspose.words.internal.zzZKP.zzYY(this.zzXbd);
    }

    public final void zzTC(boolean z) {
        this.zzXbd = z;
    }

    public final boolean zzYKQ() {
        return this.zzXbd;
    }
}
