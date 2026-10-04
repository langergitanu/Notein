package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZW1 implements zzF7 {
    private String mName;
    private int zz83;
    private boolean zz88;
    private zzZW5 zzOg;

    public zzZW1(String str, boolean z) {
        this.mName = str;
        this.zz88 = z;
    }

    private boolean zzW(zzZW5 zzzw5) {
        int iZzAG = zzzw5.zzAG();
        return (iZzAG == 4 || iZzAG == 6) && zzzw5.zznT() == this.zz88 && zzZKN.zzX(zzzw5.zznU(), this.mName, zzZOF.ORDINAL$4894b8c8);
    }

    @Override // com.aspose.words.internal.zzF7
    public final void zzR(zzZW5 zzzw5) {
        if (zzW(zzzw5)) {
            zzZW5 zzzw52 = this.zzOg;
            if (zzzw52 == null) {
                this.zzOg = zzzw5;
                this.zz83 = 0;
                return;
            }
            int iZznP = zzzw52.zznP() - zzzw5.zznP();
            if (iZznP == 0) {
                this.zz83++;
            } else if (iZznP > 0) {
                this.zzOg = zzzw5;
                this.zz83 = 0;
            }
        }
    }

    @Override // com.aspose.words.internal.zzF7
    public final zzZW5 zzRB() {
        if (this.zz83 == 0) {
            return this.zzOg;
        }
        return null;
    }
}
