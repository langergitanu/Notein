package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYH5 {
    private zzYI2 zzXvn;
    private zzYI1 zzXvo;
    private zzYEZ zzXvp;
    private zzYHX zzXvq;
    private zzYG4 zzXvr;
    private zzYFL zzXvs;
    private zzYHM zzXvt;
    private zzYFN zzXw5;

    public zzYH5(zzYFT zzyft) {
        this.zzXvt = new zzYHM(zzyft);
        this.zzXvs = new zzYFL(zzyft);
        this.zzXvr = new zzYG4(zzyft);
        this.zzXw5 = new zzYFN(zzyft);
        this.zzXvq = new zzYHX(zzyft);
        this.zzXvp = new zzYEZ(zzyft);
        this.zzXvo = new zzYI1(zzyft);
        this.zzXvn = this.zzXvr;
    }

    private boolean zzYis() {
        return this.zzXvn.zzZrB() && this.zzXvn != this.zzXw5;
    }

    private boolean zzZ(zzYI2 zzyi2, zzYET zzyet) throws Exception {
        if (zzyi2 == this.zzXvn || !zzyi2.zzX(zzyet)) {
            return false;
        }
        this.zzXvn = zzyi2;
        return true;
    }

    public final boolean zzX(zzYET zzyet) throws Exception {
        if (zzYis()) {
            return false;
        }
        return this.zzXvn.zzX(zzyet) || zzZ(this.zzXvr, zzyet) || zzZ(this.zzXw5, zzyet) || zzZ(this.zzXvp, zzyet) || zzZ(this.zzXvq, zzyet) || zzZ(this.zzXvo, zzyet) || zzZ(this.zzXvs, zzyet) || zzZ(this.zzXvt, zzyet);
    }

    public final void zzYiQ() throws Exception {
        this.zzXvr.zzYiZ();
    }

    public final void zzYiR() throws Exception {
        this.zzXw5.zzYiZ();
    }
}
