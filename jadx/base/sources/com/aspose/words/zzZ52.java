package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ52 extends InternableComplexAttr implements zzZCY, Cloneable {
    private int zzYtF;
    private int zzZn;

    public zzZ52(int i, int i2) {
        this.zzZn = i;
        this.zzYtF = i2;
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private boolean zzY(zzZ52 zzz52) {
        return this.zzZn == zzz52.zzZn && this.zzYtF == zzz52.zzYtF;
    }

    public static zzZ52 zzYPx() {
        return (zzZ52) ((zzZ52) zzYMX.zzOt(1650)).memberwiseClone();
    }

    @Override // com.aspose.words.zzZCY
    public final zzZCY deepCloneComplexAttr() {
        return (zzZ52) memberwiseClone();
    }

    public final boolean equals(Object obj) {
        if (obj == null || zzZ52.class != obj.getClass()) {
            return false;
        }
        return zzY((zzZ52) obj);
    }

    public final int getValue() {
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
        this.zzZn = i;
    }

    public final void zzAe(int i) {
        notifyChanging();
        this.zzYtF = i;
    }

    public final int zzZ4A() {
        return this.zzYtF;
    }
}
