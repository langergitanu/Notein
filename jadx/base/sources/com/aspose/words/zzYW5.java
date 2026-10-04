package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYW5 {
    private zzZYT zzXVt;
    private zzYWB zzZtB;

    public zzYW5(zzYWB zzywb) {
        this.zzZtB = zzywb;
    }

    private boolean zzYC() {
        return this.zzZtB.zzYA1().zzZ(this.zzXVt);
    }

    public final void reset() {
        this.zzXVt = null;
    }

    public final boolean zzSE(boolean z) {
        if (!this.zzZtB.zz13() && !this.zzZtB.isEmpty()) {
            if (this.zzXVt == null) {
                this.zzXVt = this.zzZtB.zzYA2().zzZop();
                if (this.zzZtB.zzYA4()) {
                    return true;
                }
            }
            if (zzYC()) {
                return false;
            }
            boolean zZzZ = this.zzXVt.zzZ(null, true, true, true, !z, true);
            if (zZzZ && !zzYC() && this.zzXVt.zzZoq()) {
                zZzZ = this.zzXVt.zzZ(null, true, true, true, !z, true);
            }
            if (!zZzZ) {
                return false;
            }
            if (!zzYC()) {
                return true;
            }
            if (this.zzXVt.zzZot() && this.zzXVt.getNode().isComposite()) {
                return true;
            }
        }
        return false;
    }

    public final zzZYT zzYWt() {
        return this.zzXVt;
    }
}
