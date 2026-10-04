package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz1U implements zzZC0, zzZCL {
    private zz86 zzYZi;
    private DocumentBase zzZG3;
    private com.aspose.words.internal.zzZYG<zz82> zzZaq;
    private zz2N zzZjb;
    private zz2S zzZjc;
    private zz2C zzZjd;
    private zz4G zzZje;
    private zz7X zzZjf;
    private zz7H zzZjg;
    private int zzZjh = 255;
    private zz07 zzZji;
    private zz1K zzZjk;

    public zz1U(DocumentBase documentBase) {
        this.zzZG3 = documentBase;
    }

    private zz86 zzZvj() {
        if (this.zzYZi == null) {
            this.zzYZi = new zz86(this.zzZjk, this.zzZG3.zzZqI());
        }
        return this.zzYZi;
    }

    @Override // com.aspose.words.zzZCL
    public final zz7X getFill() {
        return this.zzZjf;
    }

    @Override // com.aspose.words.zzZCL
    public final zz4G getOutline() {
        return this.zzZje;
    }

    @Override // com.aspose.words.zzZC0, com.aspose.words.zzZCL
    public final void setFill(zz7X zz7x) {
        this.zzZjf = zz7x;
    }

    @Override // com.aspose.words.zzZCL
    public final void setOutline(zz4G zz4g) {
        this.zzZje = zz4g;
    }

    @Override // com.aspose.words.zzZC0
    public final void zzLV(int i) {
        this.zzZjh = i;
    }

    @Override // com.aspose.words.zzZC0
    public final void zzR(com.aspose.words.internal.zzZYG<zz82> zzzyg) {
        this.zzZaq = zzzyg;
    }

    @Override // com.aspose.words.zzZC0
    public final void zzZ(zz07 zz07Var) {
        this.zzZji = zz07Var;
    }

    @Override // com.aspose.words.zzZC0
    public final com.aspose.words.internal.zzZYG<zz82> zzZTb() {
        return this.zzZaq;
    }

    @Override // com.aspose.words.zzZC0
    public final zz2N zzZTc() {
        zz2N zz2n = this.zzZjb;
        return zz2n != null ? zz2n : zzZvj().zzZTc();
    }

    @Override // com.aspose.words.zzZC0
    public final zz2S zzZTd() {
        zz2S zz2s = this.zzZjc;
        return zz2s != null ? zz2s : zzZvj().zzZTd();
    }

    @Override // com.aspose.words.zzZC0
    public final zz2C zzZTe() {
        if (this.zzZjd == null && zzZvj().zzZTe() != null) {
            this.zzZjd = zzZvj().zzZTe();
        }
        return this.zzZjd;
    }

    @Override // com.aspose.words.zzZC0
    public final zz7H zzZTf() {
        return this.zzZjg;
    }

    @Override // com.aspose.words.zzZC0
    public final int zzZTg() {
        return this.zzZjh;
    }

    @Override // com.aspose.words.zzZC0
    public final zz07 zzZTh() {
        return this.zzZji;
    }

    @Override // com.aspose.words.zzZC0, com.aspose.words.zzZCL
    public final zz1K zzZTj() {
        return this.zzZjk;
    }

    @Override // com.aspose.words.zzZC0
    public final void zzZ(zz7H zz7h) {
        this.zzZjg = zz7h;
    }

    @Override // com.aspose.words.zzZCL
    public final void zzZ(zz1K zz1k) {
        this.zzZjk = zz1k;
    }

    @Override // com.aspose.words.zzZC0
    public final void zzZ(zz2S zz2s) {
        this.zzZjc = zz2s;
    }

    @Override // com.aspose.words.zzZC0
    public final void zzZ(zz2N zz2n) {
        this.zzZjb = zz2n;
    }

    @Override // com.aspose.words.zzZC0
    public final void zzZ(zz2C zz2c) {
        this.zzZjd = zz2c;
    }
}
