package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYTV extends zzYJC implements zzZCY, Cloneable {
    private int[] zzXSf;
    private int[] zzXSg;
    private byte[] zzXSh;
    private boolean zzXSi;
    private boolean zzXSj;
    private String zzYuN;

    public zzYTV() {
        super("", com.aspose.words.internal.zzZQ9.zz35);
        this.zzXSh = new byte[9];
        this.zzXSg = new int[9];
        this.zzXSf = new int[9];
        this.zzYuN = "";
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.words.zzZCY
    public final zzZCY deepCloneComplexAttr() {
        return (zzYTV) memberwiseClone();
    }

    public final String getNumberFormat() {
        return this.zzYuN;
    }

    public final int hashCode() {
        int iZzYY = (com.aspose.words.internal.zzZKP.zzYY(this.zzXSj) * 397) ^ com.aspose.words.internal.zzZKP.zzYY(this.zzXSi);
        for (byte b : this.zzXSh) {
            iZzYY = (iZzYY * 397) ^ b;
        }
        for (int i : this.zzXSg) {
            iZzYY = (iZzYY * 397) ^ i;
        }
        for (int i2 : this.zzXSf) {
            iZzYY = (iZzYY * 397) ^ i2;
        }
        String str = this.zzYuN;
        return str != null ? (iZzYY * 397) ^ str.hashCode() : iZzYY;
    }

    public final boolean isActive() {
        return this.zzXSj || zzYys();
    }

    @Override // com.aspose.words.zzZCY
    @ReservedForInternalUse
    @Deprecated
    public final boolean isInheritedComplexAttr() {
        return false;
    }

    public final void setNumberFormat(String str) {
        this.zzYuN = str;
    }

    public final void zzSt(boolean z) {
        this.zzXSi = z;
    }

    public final void zzSu(boolean z) {
        this.zzXSj = z;
    }

    public final int[] zzYyn() {
        return this.zzXSf;
    }

    public final int[] zzYyo() {
        return this.zzXSg;
    }

    public final byte[] zzYyp() {
        return this.zzXSh;
    }

    public final boolean zzYyq() {
        return this.zzXSi;
    }

    public final boolean zzYyr() {
        return this.zzXSj;
    }

    public final boolean zzYys() {
        if (this.zzXSi) {
            for (int i : this.zzXSg) {
                if (i != 23) {
                    return true;
                }
            }
        }
        return false;
    }
}
