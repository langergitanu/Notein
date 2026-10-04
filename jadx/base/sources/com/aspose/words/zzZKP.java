package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZKP extends InternableComplexAttr implements zzZCY, Cloneable {
    private int zzYtF;
    private int zzZn;

    public zzZKP(int i, int i2) {
        zzAe(i);
        setValue(i2);
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private boolean zzZ(zzZKP zzzkp) {
        return this.zzZn == zzzkp.zzZn && this.zzYtF == zzzkp.zzYtF;
    }

    @Override // com.aspose.words.zzZCY
    public final zzZCY deepCloneComplexAttr() {
        return (zzZKP) memberwiseClone();
    }

    public final boolean equals(Object obj) {
        if (obj == null || zzZKP.class != obj.getClass()) {
            return false;
        }
        return zzZ((zzZKP) obj);
    }

    public final int getValue() {
        if (this.zzYtF == 2) {
            return 0;
        }
        return this.zzZn;
    }

    public final int hashCode() {
        return (this.zzZn * 397) ^ this.zzYtF;
    }

    @Override // com.aspose.words.zzZCY
    public final boolean isInheritedComplexAttr() {
        return false;
    }

    public final void setValue(int i) {
        notifyChanging();
        if (i == 0) {
            this.zzYtF = 2;
        } else if (this.zzYtF == 2) {
            this.zzYtF = 0;
        }
        this.zzZn = i;
    }

    public final void zzAe(int i) {
        notifyChanging();
        this.zzYtF = i;
        if (i == 2) {
            this.zzZn = 0;
        }
    }

    public final int zzZ4A() {
        return this.zzYtF;
    }
}
