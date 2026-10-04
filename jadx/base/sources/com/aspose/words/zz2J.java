package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zz2J extends zz7S implements zzZC0, zzZCL {
    private zz86 zzYZi;
    private int zzZ3e = 255;
    private zz2N zzZjb;
    private zz2S zzZjc;
    private zz4G zzZje;
    private zz7H zzZjg;
    private com.aspose.words.internal.zzZYG<zz82> zzZjj;
    private zz1K zzZjk;

    private zz86 zzZvj() {
        if (this.zzYZi == null) {
            this.zzYZi = new zz86(this.zzZjk, zzZyb().getDocument().zzZqI());
        }
        return this.zzYZi;
    }

    @Override // com.aspose.words.zzZCL
    public final zz4G getOutline() {
        if (this.zzZje == null) {
            this.zzZje = new zz4G();
        }
        return this.zzZje;
    }

    @Override // com.aspose.words.zzZCL
    public final void setOutline(zz4G zz4g) {
        this.zzZje = zz4g;
    }

    @Override // com.aspose.words.zzZC0
    public final void zzLV(int i) {
        this.zzZ3e = i;
    }

    @Override // com.aspose.words.zzZC0
    public final void zzR(com.aspose.words.internal.zzZYG<zz82> zzzyg) {
        this.zzZjj = zzzyg;
    }

    @Override // com.aspose.words.zz7S, com.aspose.words.zz53
    public zz53 zzY(boolean z, zzZA5 zzza5) {
        zz2J zz2j = (zz2J) super.zzY(z, zzza5);
        zz07 zz07Var = this.zzZji;
        if (zz07Var != null) {
            zz2j.zzZji = zz07Var.zzZAi();
        }
        zz7H zz7h = this.zzZjg;
        if (zz7h != null) {
            zz2j.zzZjg = zz7h.zzZAQ();
        }
        zz4G zz4g = this.zzZje;
        if (zz4g != null) {
            zz2j.zzZje = zz4g.zzZxK();
        }
        zz1K zz1k = this.zzZjk;
        if (zz1k != null) {
            zz2j.zzZjk = zz1k.zzZu8();
        }
        zz2S zz2s = this.zzZjc;
        if (zz2s != null) {
            zz2j.zzZjc = zz2s.zzZvG();
        }
        zz2N zz2n = this.zzZjb;
        if (zz2n != null) {
            zz2j.zzZjb = zz2n.zzZvt();
        }
        zz2j.zzYZi = null;
        com.aspose.words.internal.zzZYG<zz82> zzzyg = this.zzZjj;
        if (zzzyg != null) {
            zz2j.zzZjj = zz80.zzN(zzzyg);
        }
        return zz2j;
    }

    @Override // com.aspose.words.zzZC0
    public final void zzZ(zz7H zz7h) {
        this.zzZjg = zz7h;
    }

    @Override // com.aspose.words.zzZC0
    public final com.aspose.words.internal.zzZYG<zz82> zzZTb() {
        return this.zzZjj;
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

    @Override // com.aspose.words.zz7S, com.aspose.words.zzZC0
    public final zz2C zzZTe() {
        if (this.zzZjd == null && zzZvj().zzZTe() != null) {
            this.zzZjd = zzZvj().zzZTe();
        }
        return this.zzZjd;
    }

    @Override // com.aspose.words.zzZC0
    public final zz7H zzZTf() {
        if (this.zzZjg == null) {
            this.zzZjg = new zz7H();
        }
        return this.zzZjg;
    }

    @Override // com.aspose.words.zzZC0
    public final int zzZTg() {
        return this.zzZ3e;
    }

    @Override // com.aspose.words.zzZC0, com.aspose.words.zzZCL
    public final zz1K zzZTj() {
        return this.zzZjk;
    }

    public boolean zzZvw() {
        return false;
    }

    @Override // com.aspose.words.zzZC0
    public final void zzZ(zz2S zz2s) {
        this.zzZjc = zz2s;
    }

    @Override // com.aspose.words.zzZC0
    public final void zzZ(zz2N zz2n) {
        this.zzZjb = zz2n;
    }

    @Override // com.aspose.words.zz7S, com.aspose.words.zzZC0
    public final void zzZ(zz2C zz2c) {
        this.zzZjd = zz2c;
    }

    @Override // com.aspose.words.zzZCL
    public final void zzZ(zz1K zz1k) {
        this.zzZjk = zz1k;
    }
}
