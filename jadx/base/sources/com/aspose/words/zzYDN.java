package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYDN extends zzYDG implements Cloneable {
    private boolean zzYnI;
    private zzYDM zzXon = zzYDM.zzXol;
    private zzYDM zzXom = zzYDM.zzXok;

    public final boolean getChecked() {
        return this.zzYnI;
    }

    @Override // com.aspose.words.zzYDG
    public final int getType() {
        return 13;
    }

    @Override // com.aspose.words.zzYDG
    public final Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void setChecked(boolean z) {
        this.zzYnI = z;
    }

    public final void zzY(zzYDM zzydm) {
        this.zzXom = zzydm;
    }

    public final zzYDM zzYcW() {
        return this.zzXom;
    }

    public final zzYDM zzYcX() {
        return this.zzXon;
    }

    @Override // com.aspose.words.zzYDG
    public final zzYDG zzYcY() {
        zzYDN zzydn = (zzYDN) memberwiseClone();
        zzydn.zzXon = this.zzXon.zzYcV();
        zzydn.zzXom = this.zzXom.zzYcV();
        return zzydn;
    }

    public final void zzZ(zzYDM zzydm) {
        this.zzXon = zzydm;
    }
}
