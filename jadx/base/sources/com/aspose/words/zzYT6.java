package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYT6 extends zzYSZ {
    private String mName;
    private String zzXRp;
    private String zzXRq;
    private String zzXRr;
    private int zzXRs;
    private zzYT5 zzXRt;
    private zzYSQ zzXRu;

    public zzYT6(zzYPO zzypo) {
        super(zzypo);
    }

    public final String getName() {
        return this.mName;
    }

    public final void setName(String str) {
        this.mName = str;
    }

    public final void zzGt(String str) {
        this.zzXRp = str;
    }

    public final void zzGu(String str) {
        this.zzXRq = str;
    }

    public final void zzGv(String str) {
        this.zzXRr = str;
    }

    public final zzYT5 zzYxM() {
        if (this.zzXRt == null) {
            this.zzXRt = new zzYT5(zzYxl().zzYx1());
        }
        return this.zzXRt;
    }

    public final zzYSR zzYxN() {
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzXRp)) {
            return (zzYSR) this.zzXRj.zzYh(this.zzXRp, "chart");
        }
        return null;
    }

    public final zzYSR zzYxO() {
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzXRq)) {
            return (zzYSR) this.zzXRj.zzYh(this.zzXRq, "chart");
        }
        return null;
    }

    public final String zzYxP() {
        return this.zzXRr;
    }

    public final int zzYxQ() {
        return this.zzXRs;
    }

    public final zzYSQ zzYxR() {
        return this.zzXRu;
    }

    public final void zzZ(zzYSQ zzysq) {
        this.zzXRu = zzysq;
    }

    public final void zzsQ(int i) {
        this.zzXRs = i;
    }
}
