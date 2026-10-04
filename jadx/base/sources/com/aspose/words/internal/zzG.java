package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzG extends zz7 implements zzHR, zzHT, zzHU, Cloneable {
    private boolean zzZA;
    private zzL zzZB;
    private zzP8 zzZC;
    private zzP9 zzZD;
    private boolean zzZE;

    private zzG zzX(zzG zzg) {
        zzP9 zzp9 = this.zzZD;
        if (zzp9 != null) {
            zzg.zzZD = zzp9.zzOh();
        }
        zzP8 zzp8 = this.zzZC;
        if (zzp8 != null) {
            zzg.zzZC = zzp8.zzO8();
        }
        return zzg;
    }

    @Override // com.aspose.words.internal.zz7, com.aspose.words.internal.zzZL
    public final Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.words.internal.zz7
    public final zz7 zzP(boolean z) {
        return zzX((zzG) super.zzP(z));
    }

    public final void zzQ(boolean z) {
        this.zzZE = z;
    }

    public final void zzR(boolean z) {
        this.zzZA = z;
    }

    @Override // com.aspose.words.internal.zzHR
    public final void zzW(zzP9 zzp9) {
        this.zzZD = zzp9;
    }

    @Override // com.aspose.words.internal.zz7, com.aspose.words.internal.zzZL
    public final void zzZ(zz6 zz6Var) throws Exception {
        zz6Var.zzZ(this);
        super.zzZ(zz6Var);
        zz6Var.zzY(this);
    }

    public final zzG zzZJ() {
        return (zzG) memberwiseClone();
    }

    public final boolean zzZK() {
        return this.zzZE;
    }

    public final boolean zzZL() {
        return this.zzZA;
    }

    public final zzL zzZM() {
        return this.zzZB;
    }

    @Override // com.aspose.words.internal.zzHU
    public final zzP8 zzZN() {
        return this.zzZC;
    }

    @Override // com.aspose.words.internal.zzHR, com.aspose.words.internal.zzHU
    public final zzP9 zzZO() {
        return this.zzZD;
    }

    @Override // com.aspose.words.internal.zzHT
    public final void zzZ(zzP8 zzp8) {
        this.zzZC = zzp8;
    }

    public final void zzZ(zzL zzl) {
        this.zzZB = zzl;
    }
}
