package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzOP extends zzPL {
    private boolean zzG7;
    private zzZQ4 zzG8;
    private zzPQ zzG9;
    private zzPQ zzGa;
    private zzPP zzGb;
    private zzPP zzGc;

    private zzOP(zzPP zzpp, zzPQ zzpq) {
        super(4);
        this.zzG8 = zzZQ4.zz2T;
        this.zzGc = zzpp;
        this.zzG9 = zzpq;
        this.zzGb = zzpp;
        this.zzGa = new zzPQ(0.0f, true);
        zzXR(4);
        this.zzG7 = true;
    }

    private boolean zzNn() {
        return this.zzGc.zzPs().zzPu() || this.zzGc.zzPr().zzPu() || this.zzGb.zzPs().zzPu() || this.zzGb.zzPr().zzPu() || this.zzG9.zzPu() || this.zzGa.zzPu() || !this.zzG7;
    }

    public final zzOP zzH(zzZQ4 zzzq4) {
        float width;
        zzZQ4 zzzq42 = zzzq4.isEmpty() ? this.zzG8 : zzzq4;
        if (!zzNn()) {
            return (zzOP) zzPI();
        }
        float fZzPv = this.zzGc.zzPs().zzPv();
        float fZzPv2 = this.zzGc.zzPr().zzPv();
        float fZzPv3 = this.zzGb.zzPs().zzPv();
        float fZzPv4 = this.zzGb.zzPr().zzPv();
        float fZzPv5 = this.zzG9.zzPv();
        float fZzPv6 = this.zzGa.zzPv();
        boolean z = this.zzG7;
        float height = !z ? zzzq42.getHeight() / zzzq42.getWidth() : 1.0f;
        if (z) {
            if (this.zzGc.zzPs().zzPu()) {
                fZzPv = zzzq42.getX() + (zzzq42.getWidth() * fZzPv);
            }
            if (this.zzGc.zzPr().zzPu()) {
                fZzPv2 = zzzq42.getY() + (zzzq42.getHeight() * fZzPv2);
            }
            if (this.zzGb.zzPs().zzPu()) {
                fZzPv3 = zzzq42.getX() + (zzzq42.getWidth() * fZzPv3);
            }
            if (this.zzGb.zzPr().zzPu()) {
                fZzPv4 = zzzq42.getY() + (zzzq42.getHeight() * fZzPv4);
            }
            if (this.zzG9.zzPu()) {
                fZzPv5 *= zzzq42.getWidth();
            }
            if (this.zzGa.zzPu()) {
                fZzPv6 *= zzzq42.getWidth();
            }
            width = fZzPv5;
        } else {
            fZzPv = zzzq42.getX() + (zzzq42.getWidth() * fZzPv);
            fZzPv2 = (zzzq42.getY() + (zzzq42.getHeight() * fZzPv2)) / height;
            fZzPv3 = zzzq42.getX() + (zzzq42.getWidth() * fZzPv3);
            fZzPv4 = (zzzq42.getY() + (zzzq42.getHeight() * fZzPv4)) / height;
            width = zzzq42.getWidth() * fZzPv5;
            fZzPv6 *= zzzq42.getWidth();
        }
        if (fZzPv6 > width) {
            fZzPv6 = width;
        }
        zzOP zzop = (zzOP) zzPI();
        zzop.zzGc = new zzPP(fZzPv, false, fZzPv2, false);
        zzop.zzGb = new zzPP(fZzPv3, false, fZzPv4, false);
        zzop.zzG9 = new zzPQ(width, false);
        zzop.zzGa = new zzPQ(fZzPv6, false);
        if (!zzop.zzG7 && !zzP9.zzO(zzop.zzNb())) {
            zzop.zzL(new zzP9(zzop.zzNb().zzOf(), zzop.zzNb().zzOe(), zzop.zzNb().zzOd(), zzop.zzNb().zzOc(), zzzq42.getWidth() * zzop.zzNb().zzOb(), zzzq42.getHeight() * zzop.zzNb().zzOa()));
        }
        if (height != 1.0f && !z) {
            if (zzop.zzNb() == null) {
                zzop.zzL(new zzP9());
            }
            zzop.zzNb().zzZ(1.0f, height, 1);
        }
        zzop.zzG7 = true;
        return zzop;
    }

    public final void zzI(zzZQ4 zzzq4) {
        this.zzG8 = zzzq4;
    }

    public final boolean zzNo() {
        return this.zzG7;
    }

    public final zzPQ zzNp() {
        return this.zzG9;
    }

    public final zzPQ zzNq() {
        return this.zzGa;
    }

    public final zzPP zzNr() {
        return this.zzGb;
    }

    public final zzPP zzNs() {
        return this.zzGc;
    }

    @Override // com.aspose.words.internal.zzPY
    public final void zzZ(zzPW zzpw) throws Exception {
    }

    public final zzZQ4 zzZj() {
        return this.zzG8;
    }

    public final void zzd(boolean z) {
        this.zzG7 = z;
    }

    public final void zzZ(zzPP zzpp) {
        this.zzGb = zzpp;
    }

    public zzOP(zzPP zzpp, zzPQ zzpq, zzPP zzpp2, zzPQ zzpq2) {
        this(zzpp, zzpq);
        this.zzGb = zzpp2;
        this.zzGa = zzpq2;
    }
}
