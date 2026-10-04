package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYK2 {
    private com.aspose.words.internal.zzPG zzXCF;
    private long zzXCG;
    private long zzXCH;

    public zzYK2(long j, long j2) {
        this.zzXCH = j;
        this.zzXCG = j2;
        this.zzXCF = new com.aspose.words.internal.zzPG(j, j2);
    }

    private boolean zzX(zzYK2 zzyk2) {
        return com.aspose.words.internal.zzZPY.zzD(this.zzXCH, zzyk2.zzXCH) && com.aspose.words.internal.zzZPY.zzD(this.zzXCG, zzyk2.zzXCG);
    }

    public final boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzYK2.class) {
            return false;
        }
        return zzX((zzYK2) obj);
    }

    public final int hashCode() {
        return (com.aspose.words.internal.zzZKP.zzYs(this.zzXCH) * 397) ^ com.aspose.words.internal.zzZKP.zzYs(this.zzXCG);
    }

    public final boolean zzY(zzYK2 zzyk2) {
        return com.aspose.words.internal.zzPG.zzZ(this.zzXCF, zzyk2.zzXCF);
    }

    public final long zzYmd() {
        return this.zzXCG;
    }

    public final long zzYme() {
        return this.zzXCH;
    }

    public final boolean zzYmf() {
        return com.aspose.words.internal.zzAN.zzS(com.aspose.words.internal.zzZPY.zzYC(this.zzXCH), com.aspose.words.internal.zzZPY.zzYC(this.zzXCG));
    }

    public final long[] zzZ(zzYK2 zzyk2) {
        long[] jArr = new long[1];
        return com.aspose.words.internal.zzPG.zzZ(this.zzXCF, new com.aspose.words.internal.zzPG(zzyk2.zzXCH, zzyk2.zzXCG), jArr, true) ? jArr : new long[0];
    }
}
