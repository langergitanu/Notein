package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzK1 implements zzZC0, zzZCL, Cloneable {
    private zz2N zzZjb;
    private zz2S zzZjc;
    private zz2C zzZjd;
    private zz4G zzZje;
    private zz7X zzZjf;
    private zz7H zzZjg;
    private int zzZjh = 255;
    private zz07 zzZji;
    private com.aspose.words.internal.zzZYG<zz82> zzZjj;
    private zz1K zzZjk;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
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
        this.zzZjj = zzzyg;
    }

    @Override // com.aspose.words.zzZC0
    public final void zzZ(zz07 zz07Var) {
        this.zzZji = zz07Var;
    }

    @Override // com.aspose.words.zzZC0
    public final com.aspose.words.internal.zzZYG<zz82> zzZTb() {
        return this.zzZjj;
    }

    @Override // com.aspose.words.zzZC0
    public final zz2N zzZTc() {
        return this.zzZjb;
    }

    @Override // com.aspose.words.zzZC0
    public final zz2S zzZTd() {
        return this.zzZjc;
    }

    @Override // com.aspose.words.zzZC0
    public final zz2C zzZTe() {
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

    public final zzK1 zzZTi() {
        zzK1 zzk1 = (zzK1) memberwiseClone();
        zz07 zz07Var = this.zzZji;
        if (zz07Var != null) {
            zzk1.zzZji = zz07Var.zzZAi();
        }
        zz7H zz7h = this.zzZjg;
        if (zz7h != null) {
            zzk1.zzZjg = zz7h.zzZAQ();
        }
        zz7X zz7x = this.zzZjf;
        if (zz7x != null) {
            zzk1.zzZjf = zz7x.zzZQ6();
        }
        zz4G zz4g = this.zzZje;
        if (zz4g != null) {
            zzk1.zzZje = zz4g.zzZxK();
        }
        zz1K zz1k = this.zzZjk;
        if (zz1k != null) {
            zzk1.zzZjk = zz1k.zzZu8();
        }
        zz2C zz2c = this.zzZjd;
        if (zz2c != null) {
            zzk1.zzZjd = zz2c.zzZuX();
        }
        zz2S zz2s = this.zzZjc;
        if (zz2s != null) {
            zzk1.zzZjc = zz2s.zzZvG();
        }
        zz2N zz2n = this.zzZjb;
        if (zz2n != null) {
            zzk1.zzZjb = zz2n.zzZvt();
        }
        com.aspose.words.internal.zzZYG<zz82> zzzyg = this.zzZjj;
        if (zzzyg != null) {
            zzk1.zzZjj = zz80.zzN(zzzyg);
        }
        return zzk1;
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
    public final void zzZ(zz2C zz2c) {
        this.zzZjd = zz2c;
    }

    @Override // com.aspose.words.zzZC0
    public final void zzZ(zz2S zz2s) {
        this.zzZjc = zz2s;
    }

    @Override // com.aspose.words.zzZC0
    public final void zzZ(zz2N zz2n) {
        this.zzZjb = zz2n;
    }
}
