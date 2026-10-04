package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZRH implements zzZCW, zzZCY, Cloneable {
    private int zzYHL;
    private boolean zzYHM;
    private boolean zzYHN;
    private boolean zzYHO;
    private int zzYHP = 0;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.words.zzZCY
    public final zzZCY deepCloneComplexAttr() {
        return (zzZRH) memberwiseClone();
    }

    public final boolean equals(Object obj) {
        if (obj == null || zzZRH.class != obj.getClass()) {
            return false;
        }
        return zzZ((zzZRH) obj);
    }

    public final int hashCode() {
        return (((((((com.aspose.words.internal.zzZKP.zzYY(this.zzYHO) * 397) ^ com.aspose.words.internal.zzZKP.zzYY(this.zzYHN)) * 397) ^ this.zzYHP) * 397) ^ com.aspose.words.internal.zzZKP.zzYY(this.zzYHM)) * 397) ^ this.zzYHL;
    }

    @Override // com.aspose.words.zzZCY
    public final boolean isInheritedComplexAttr() {
        return false;
    }

    public final void zzDN(int i) {
        this.zzYHL = i;
    }

    public final void zzDO(int i) {
        this.zzYHP = i;
    }

    public final void zzW5(boolean z) {
        this.zzYHM = z;
    }

    public final void zzW6(boolean z) {
        this.zzYHN = z;
    }

    public final void zzW7(boolean z) {
        this.zzYHO = z;
    }

    @Override // com.aspose.words.zzZCW
    public final boolean zzZ(zzZCW zzzcw) {
        boolean z;
        if (zzzcw != null && zzZRH.class == zzzcw.getClass()) {
            zzZRH zzzrh = (zzZRH) zzzcw;
            boolean z2 = this.zzYHO;
            if (z2 == zzzrh.zzYHO && (z = this.zzYHN) == zzzrh.zzYHN && ((!z2 || this.zzYHM == zzzrh.zzYHM) && (!z || this.zzYHP == zzzrh.zzYHP))) {
                return true;
            }
        }
        return false;
    }

    public final int zzZh1() {
        return this.zzYHL;
    }

    public final boolean zzZh2() {
        return this.zzYHM;
    }

    public final int zzZh3() {
        return this.zzYHP;
    }

    public final boolean zzZh4() {
        return this.zzYHN;
    }

    public final boolean zzZh5() {
        return this.zzYHO;
    }

    private boolean zzZ(zzZRH zzzrh) {
        return this.zzYHO == zzzrh.zzYHO && this.zzYHN == zzzrh.zzYHN && this.zzYHM == zzzrh.zzYHM && this.zzYHP == zzzrh.zzYHP && this.zzYHL == zzzrh.zzYHL;
    }
}
