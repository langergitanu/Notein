package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zz0A {
    zzZCO zzYXc;
    zzCM zzYXd;
    private com.aspose.words.internal.zzZQ4 zzZgO;
    private zzDI zzZyQ;
    private float zzwo = Float.NaN;
    private float zzHi = Float.NaN;
    private com.aspose.words.internal.zzG zzYXe = new com.aspose.words.internal.zzG();

    public zz0A(zzZCO zzzco, zzDI zzdi, com.aspose.words.internal.zzZQ4 zzzq4) {
        this.zzZyQ = zzdi;
        this.zzYXc = zzzco;
        this.zzZgO = zzDG.zzZ(zzzq4, zzZLx(), this.zzZyQ);
        zzZsj();
    }

    private void zzD(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42) throws Exception {
        com.aspose.words.internal.OooO0O0.OooO00o(this.zzYXe);
        if (zzZLx() != null) {
            zzZsk();
        } else {
            zzO(zzzq4, zzzq42);
        }
    }

    private float zzZLs() {
        return this.zzZyQ.zzZIC().zzZdM;
    }

    private zzEH zzZLx() {
        if (zzZsf() != null) {
            return zzZsf().zz3y();
        }
        return null;
    }

    private boolean zzZsd() {
        return getTitlePosition() == 0 || getTitlePosition() == 1;
    }

    private zzCU zzZsf() {
        return this.zzYXc.getDCTitle();
    }

    private double zzZsg() {
        if (zzZsf() == null) {
            return 0.0d;
        }
        if (zzZsf().zz3u() == null || zzZsf().zz3u().zzZGz() == 0) {
            return zzZsf().zzaR().zzZHh().zzZCC().zzZQQ();
        }
        zzZsf().zz3u().zzZGw().zzZtK().zzV(zzZsf().zzaR().zzZHh());
        return zzZsf().zz3u().zzZGw().zzZtK().zzZCC().zzZQQ();
    }

    private float zzZsh() {
        return zzDG.zzYd(zzZsg()) ? com.aspose.words.internal.zzZPW.zzYz(this.zzZyQ.zzZIz()) * 0.82f : (zzZLs() * 2.0f) + (Float.intBitsToFloat((int) this.zzZyQ.zzZIz()) * (zzZsd() ? 0.795f : 0.2f));
    }

    private void zzZsi() throws Exception {
        if (this.zzYXd == null) {
            this.zzHi = 0.0f;
            this.zzwo = 0.0f;
            return;
        }
        zzCK zzckZzZ = zzCK.zzZ(this.zzYXd, new zzCV(zzZsf().zzaR(), zzZsf().zzaQ(), zzZHb(), this.zzZyQ.zzZIC().zzZMQ().zzZM3(), this.zzZyQ.zzZIC().zzZMN(), zzZsh()), this.zzZyQ, com.aspose.words.internal.zzZQ4.zz2T, 38100.0f, 38100.0f, 19050.0f, 19050.0f);
        this.zzYXe.zzX((com.aspose.words.internal.zzZL) zzckZzZ.zzZGn());
        this.zzHi = Float.intBitsToFloat((int) zzckZzZ.zzZGm().getSize());
        this.zzwo = com.aspose.words.internal.zzZPW.zzYz(zzckZzZ.zzZGm().getSize());
    }

    private void zzZsj() {
        if (this.zzYXc.isVisible()) {
            this.zzYXd = this.zzYXc.generateAutoTitle(this.zzZyQ);
        }
    }

    private void zzZsk() throws Exception {
        float fIntBitsToFloat = Float.intBitsToFloat((int) this.zzZyQ.zzZIz()) - getWidth();
        float fZzYz = com.aspose.words.internal.zzZPW.zzYz(this.zzZyQ.zzZIz()) - getHeight();
        if (this.zzZgO.getX() <= fIntBitsToFloat) {
            fIntBitsToFloat = this.zzZgO.getX();
        }
        if (this.zzZgO.getY() <= fZzYz) {
            fZzYz = this.zzZgO.getY();
        }
        this.zzYXe.zzZO().zzY(fIntBitsToFloat, fZzYz, 0);
    }

    public final float getHeight() throws Exception {
        if (Float.isNaN(this.zzwo)) {
            zzZsi();
        }
        return this.zzwo;
    }

    public boolean getOverlay() {
        return zzZsf() != null && zzZsf().getOverlay();
    }

    public final int getTitlePosition() {
        return this.zzYXc.getTitlePosition();
    }

    public final float getWidth() throws Exception {
        if (Float.isNaN(this.zzHi)) {
            zzZsi();
        }
        return this.zzHi;
    }

    public final void translate(float f, float f2) {
        if (this.zzYXe.zzZO() == null) {
            com.aspose.words.internal.OooO0O0.OooO00o(this.zzYXe);
        }
        this.zzYXe.zzZO().zzY(f, f2, 0);
    }

    public final zzDI zz43() {
        return this.zzZyQ;
    }

    public final void zzE(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42) throws Exception {
        zzD(zzzq4, zzzq42);
        if (this.zzYXe.getCount() > 0) {
            this.zzZyQ.zzsD().zzX((com.aspose.words.internal.zzZL) this.zzYXe);
        }
    }

    public abstract void zzO(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42) throws Exception;

    public float zzZHa() throws Exception {
        if (zzZse()) {
            return 0.0f;
        }
        return getHeight();
    }

    public zz30 zzZHb() throws Exception {
        zz30 zz30Var = new zz30();
        zz30Var.zzU(this.zzZyQ.zzZIC().zzZMQ().zzZM6());
        return zz30Var;
    }

    public final com.aspose.words.internal.zzZQ4 zzZLA() {
        return this.zzZgO;
    }

    public final boolean zzZse() {
        return this.zzZyQ.getChartSpace().zzZHX().zz45().zzZQD();
    }
}
