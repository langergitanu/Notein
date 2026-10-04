package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzG implements Cloneable {
    private com.aspose.words.internal.zzZQ4 zzZFV;
    protected boolean zzZFW;
    private com.aspose.words.internal.zzZL zzZFX;

    public zzG(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZL zzzl) {
        zz5(zzzq4);
        this.zzZFX = zzzl;
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void zz5(com.aspose.words.internal.zzZQ4 zzzq4) {
        this.zzZFV = zzzq4;
        this.zzZFW = true;
    }

    public final zzG zzbI() {
        return (zzG) memberwiseClone();
    }

    public final com.aspose.words.internal.zzZL zzbJ() {
        return this.zzZFX;
    }

    public final boolean zzbK() {
        return this.zzZFW;
    }

    public final com.aspose.words.internal.zzZQ4 zzbL() {
        return this.zzZFV;
    }
}
