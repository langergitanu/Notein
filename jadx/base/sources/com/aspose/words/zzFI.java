package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzFI implements zzZCG {
    private zzZV0 zzZdN;
    private com.aspose.words.internal.zzH zzZdO;
    private zzGR zzZdP;
    private zz1K zzZdQ;
    private zzF8 zzZdR;
    private zzDI zzZyQ;

    public zzFI(zzDI zzdi) {
        this.zzZyQ = zzdi;
    }

    private zzBW zzLa(int i) throws Exception {
        return this.zzZyQ.zzZIB().getThemeProvider().getThemeColor(this.zzZdR.zzZMr().getColors()[i % this.zzZdR.zzZMr().getColors().length]);
    }

    private zz4G zzLd(int i) throws Exception {
        if (this.zzZdR.zzZMs() == null) {
            return null;
        }
        zz4G lineStyle = this.zzZyQ.zzZIB().getThemeProvider().getLineStyle(this.zzZdR.zzZMs().zzZM9());
        if (this.zzZdR.zzZMs().getLineWidth() > 0.0d) {
            lineStyle.zzXK(this.zzZdR.zzZMs().getLineWidth());
        }
        lineStyle.zzV(zzLc(i));
        return lineStyle;
    }

    private com.aspose.words.internal.zzH zzZMR() {
        if (this.zzZdO == null) {
            this.zzZdO = new com.aspose.words.internal.zzH();
        }
        return this.zzZdO;
    }

    private zz1K zzZMU() {
        zz1K zz1k = new zz1K();
        if (this.zzZdR.zzZMs() != null) {
            zz1k.zzZ(new zz5U());
            zz1k.zzZu4().zzIU(this.zzZdR.zzZMs().zzZM9());
        }
        if (this.zzZdR.zzZMr() != null) {
            zz1k.zzZ(new zz7U());
            zz1k.zzZu6().zzIU(this.zzZdR.zzZMr().zzZM9());
        }
        if (this.zzZdR.zzZMq() != null) {
            zz1k.zzZ(new zz8A());
            zz1k.zzZu7().zzIU(this.zzZdR.zzZMq().zzZM9());
        }
        return zz1k;
    }

    private zz1K zzZMV() {
        if (this.zzZdQ == null) {
            this.zzZdQ = zzZMU();
        }
        return this.zzZdQ;
    }

    public final zzDI zz43() {
        return this.zzZyQ;
    }

    public final boolean zz7e() {
        return this.zzZyQ.getChartSpace().zz7e();
    }

    public zzZCM zzL9(int i) {
        return this.zzZdR.zzZMr().zzZM8()[i % this.zzZdR.zzZMr().zzZM8().length];
    }

    public zzZCM zzLb(int i) {
        if (this.zzZdR.zzZMs().zzZM8() == null) {
            return null;
        }
        return this.zzZdR.zzZMs().zzZM8()[i % this.zzZdR.zzZMs().zzZM8().length];
    }

    public final zzBW zzLc(int i) throws Exception {
        if (this.zzZdR.zzZMs().getColors() == null) {
            return null;
        }
        return this.zzZyQ.zzZIB().getThemeProvider().getThemeColor(this.zzZdR.zzZMs().getColors()[i % this.zzZdR.zzZMs().getColors().length]);
    }

    public final com.aspose.words.internal.zzOU zzLe(int i) throws Exception {
        zz4G zz4gZzLd;
        if (this.zzZdR.zzZMs() == null || (zz4gZzLd = zzLd(i)) == null) {
            return null;
        }
        zzZMW().zzZ(zzLb(i));
        return zz4gZzLd.zzZ(zzZMW(), false);
    }

    public final com.aspose.words.internal.zzPY zzY(int i, com.aspose.words.internal.zzZL zzzl) throws Exception {
        if (this.zzZdR.zzZMr() == null) {
            return null;
        }
        zz7X fillStyle = this.zzZyQ.zzZIB().getThemeProvider().getFillStyle(this.zzZdR.zzZMr().zzZM9());
        fillStyle.zzV(zzLa(i));
        zzZMW().zzZK(zzZMR().zzZ(zzzl));
        zzZMW().zzZ(zzL9(i));
        return fillStyle.zzZ(zzZMW());
    }

    public final void zzZ(zz4G zz4g, int i) throws Exception {
        zz4G zz4gZzLd = zzLd(i);
        if (!zz4g.zzLh(9) && zz4gZzLd != null) {
            zz4g.setFill(zz4gZzLd.getFill());
            zzZMW().zzZ(zzLb(i));
            if (zzZMW().zzZPL() != null) {
                zz4g.zzV(zzBW.zzj(zz4g.getFill().zzY(zzZMW())));
            }
        }
        if (zz4gZzLd != null && com.aspose.words.internal.zzAN.zzZD(zz4g.zzZxH()) && !zz4g.zzLh(0)) {
            zz4g.zzXK(zz4gZzLd.zzZxH());
        }
        zzZMW().zzZ(null);
    }

    public final boolean zzZMS() {
        return this.zzZyQ.getChartSpace().zzZMS();
    }

    public final zzF8 zzZMT() {
        return this.zzZdR;
    }

    public final zzGR zzZMW() {
        if (this.zzZdP == null) {
            zzGR zzgr = new zzGR(this, this.zzZyQ.zzZIB(), zzZMV());
            this.zzZdP = zzgr;
            zzgr.zzYJ(1.0d);
            this.zzZdP.zzYI(1.0d);
        }
        return this.zzZdP;
    }

    public final zzZV0 zzZMX() throws Exception {
        if (this.zzZdN == null && this.zzZdR.zzZMq() != null) {
            this.zzZdN = this.zzZyQ.zzZIB().getThemeProvider().getEffectStyle(this.zzZdR.zzZMq().zzZM9());
        }
        return this.zzZdN;
    }

    @Override // com.aspose.words.zzZCG
    public final zz7X zzZMY() {
        return null;
    }

    public final zzZCM zzZ(int i, zzZCM[] zzzcmArr) {
        if (zzzcmArr != null && zzzcmArr.length >= this.zzZyQ.zzZIx()) {
            return zzzcmArr[i % zzzcmArr.length];
        }
        zzZCM zzzcm = zzzcmArr != null ? zzzcmArr[i % zzzcmArr.length] : null;
        int iZzZIx = this.zzZyQ.zzZIx();
        if (zzzcmArr != null && zzzcmArr.length < iZzZIx) {
            iZzZIx = (iZzZIx + 1) / zzzcmArr.length;
            i /= zzzcmArr.length;
        }
        double d = ((((double) (i + 1)) / ((double) (iZzZIx + 2))) * 140.0d) - 70.0d;
        zzZCM zzzcmZzYq = d > 0.0d ? zzFE.zzYq(Math.abs(100.0d - d)) : null;
        if (d < 0.0d) {
            zzzcmZzYq = zzFE.zzYp(Math.abs(d + 100.0d));
        }
        if (zzzcm == null || zzzcmZzYq == null) {
            return zzzcmZzYq;
        }
        zzBL zzbl = new zzBL();
        zzbl.zzW(zzzcm);
        zzbl.zzW(zzzcmZzYq);
        return zzbl;
    }

    public final void zzZ(zzF8 zzf8) {
        this.zzZdR = zzf8;
    }
}
