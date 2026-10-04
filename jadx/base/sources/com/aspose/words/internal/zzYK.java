package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzYK implements zzHN {
    private zzZZI zzXg;
    private zzFA zzXh;
    private int zzXi;
    private double zzXx;
    private double zzXy;
    private zzPM zzYX;

    public zzYK(zzFA zzfa, zzPM zzpm, int i, zzZZI zzzzi) throws Exception {
        this.zzXh = zzfa;
        this.zzXi = i;
        this.zzYX = zzpm;
        this.zzXg = zzzzi;
        this.zzXy = zzfa.zzMa().zzM9().zzZ(this);
    }

    private zzF9 zzY6() {
        return this.zzXh.zzMa();
    }

    private zzZL zzYc() {
        float fZzPg = this.zzYX.zzPg() * 0.067f;
        float fZzPg2 = this.zzYX.zzPg() * 0.108f;
        zzZG zzzgZzZ = zzZG.zzZ(zzZPY.zzG((float) this.zzXx, fZzPg2), zzZPY.zzG((float) (this.zzXx + this.zzXy), fZzPg2));
        zzzgZzZ.zzX(new zzOU(zzY6().zzZt(), fZzPg));
        return zzzgZzZ;
    }

    @Override // com.aspose.words.internal.zzF5
    public final double getHeight() {
        return zzY8() + zzY9();
    }

    @Override // com.aspose.words.internal.zzF5
    public final double getLineSpacing() {
        return this.zzYX.getLineSpacingPoints();
    }

    public abstract String getText();

    @Override // com.aspose.words.internal.zzHN
    public final double getWidth() {
        return this.zzXy;
    }

    public String toString() {
        return getText();
    }

    @Override // com.aspose.words.internal.zzHN
    public final void zzW(double d) {
        this.zzXx = d;
    }

    public final zzZZI zzY7() {
        return this.zzXg;
    }

    @Override // com.aspose.words.internal.zzF5
    public final double zzY8() {
        return this.zzYX.getDescentPoints();
    }

    @Override // com.aspose.words.internal.zzF5
    public final double zzY9() {
        return this.zzYX.getAscentPoints();
    }

    @Override // com.aspose.words.internal.zzHN
    public final zzFA zzYa() {
        return this.zzXh;
    }

    @Override // com.aspose.words.internal.zzHN
    public final int zzYb() {
        return this.zzXi;
    }

    @Override // com.aspose.words.internal.zzHN
    public final zzZL zzYp() throws Exception {
        double dZzY = zzY6().zzM9().zzY(this);
        zzPV zzpvZzZt = zzY6().zzZt();
        zzPV zzpvZzZq = zzY6().zzZq();
        zzG zzg = new zzG();
        float fZzyp = (float) this.zzXx;
        boolean zZzru = this.zzXg.zzru();
        for (zzZZG zzzzg : this.zzXg.zzyD()) {
            float f = fZzyp;
            zzg.zzX(new zzZU(zzzzg.zzZr(), zzpvZzZt, zzpvZzZq, zzZPY.zzG(fZzyp, 0.0f), zzzzg.getText(), zzZPW.zzG(zzzzg.zzyp(), (float) zzY9()), (float) dZzY, zzzzg.zzZz(), !zZzru ? zzzzg.zzZh() : null));
            fZzyp = zzzzg.zzyp() + f;
        }
        if (zzY6().zzM8()) {
            zzg.zzX(zzYc());
        }
        return zzg;
    }

    @Override // com.aspose.words.internal.zzHN
    public final zzPM zzZr() {
        return this.zzYX;
    }

    @Override // com.aspose.words.internal.zzHN
    public final boolean zzZz() {
        return this.zzXg.zzZz();
    }
}
