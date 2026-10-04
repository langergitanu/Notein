package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzF0 {
    private zz49 zzZcN;
    private zz49 zzZcO;
    private zz30 zzZcP;
    private zz30 zzZcQ;
    private zz30 zzZcR;

    public zzF0(zzDI zzdi) throws Exception {
        zz30 zz30VarZzZ = zzZ(zzdi.getChartSpace().zzaR(), zzdi);
        this.zzZcR = zz30VarZzZ;
        this.zzZcP = zzZ(zz30VarZzZ);
        this.zzZcQ = zzZ(this.zzZcR);
        if (this.zzZcR.zzLh(17) || this.zzZcR.zzZvS().getValue() != 1000) {
            this.zzZcP.zzX(new zz0K((int) (((double) this.zzZcR.zzZvS().getValue()) * 1.2d)));
        } else {
            this.zzZcP.zzX(new zz0K(1800));
        }
        this.zzZcO = new zz49();
        zz49 zz49Var = new zz49();
        this.zzZcN = zz49Var;
        zz49Var.setAlignment(1);
    }

    private static zz7X zzX(zzDI zzdi) throws Exception {
        return new zz1C(zzdi.zzZIC().zzZMC().zzLc(0));
    }

    private static zz30 zzZ(zz30 zz30Var) {
        zz30 zz30Var2 = new zz30();
        zz30Var2.zzU(zz30Var);
        if (!zz30Var.zzLh(1)) {
            zz30Var2.setBold(true);
        }
        return zz30Var2;
    }

    public final zz49 zzZM3() {
        return this.zzZcN;
    }

    public final zz49 zzZM4() {
        return this.zzZcO;
    }

    public final zz30 zzZM5() {
        return this.zzZcP;
    }

    public final zz30 zzZM6() {
        return this.zzZcQ;
    }

    public final zz30 zzZM7() {
        return this.zzZcR;
    }

    private static zz30 zzZ(zzCL zzcl, zzDI zzdi) throws Exception {
        zz30 zz30Var = new zz30();
        zz30Var.zzX(new zz0K(1000));
        zz30Var.zzZ(new zz7P());
        zz30Var.zzZvQ().zzOH(zzdi.zzZIB().getThemeProvider().getFontName(131073));
        if (!com.aspose.words.internal.zzZYD.zzXk(zz30Var.zzZvQ().zzZAY())) {
            zz30Var.zzZvQ().zzOH("Calibri");
        }
        zz30Var.setFill(zzX(zzdi));
        zz30 zz30VarZzZHj = zzcl != null ? zzcl.zzZHj() : new zz30();
        zz30VarZzZHj.zzU(zz30Var);
        return zz30VarZzZHj;
    }
}
