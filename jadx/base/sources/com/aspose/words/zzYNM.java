package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYNM extends zzTN {
    private zzTN zzZGs;
    private zzTN zzZGt;

    public zzYNM(zzTN zztn, zzTN zztn2) {
        this.zzZGt = zztn;
        this.zzZGs = zztn2;
    }

    public final String toString() {
        return this.zzZGt.zzZYm() + " | " + this.zzZGs.zzZYm();
    }

    @Override // com.aspose.words.zzTN
    public final boolean zzZ(zzZRE zzzre) {
        return this.zzZGt.zzZ(zzzre) || this.zzZGs.zzZ(zzzre);
    }
}
