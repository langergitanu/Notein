package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zz1O {
    private zz2J zzYYr;
    private boolean zzYYs;
    protected zz2N zzZjb;
    protected zz2S zzZjc;

    public zz1O(zz2J zz2j) {
        this.zzYYr = zz2j;
    }

    public static long zzJ(ShapeBase shapeBase) {
        float fZzZA9;
        float fZzZAa = 1.0f;
        ShapeBase shapeBase2 = shapeBase;
        boolean z = false;
        float f = 1.0f;
        for (GroupShape groupShape = (GroupShape) com.aspose.words.internal.zzZKW.zzZ(shapeBase.getParentNode(), GroupShape.class); groupShape != null; groupShape = (GroupShape) com.aspose.words.internal.zzZKW.zzZ(groupShape.getParentNode(), GroupShape.class)) {
            if (zzYBX.zzY7(zzQ((float) shapeBase2.getRotation(), shapeBase2.getFlipOrientation()))) {
                z = !z;
            }
            if (z) {
                fZzZAa *= groupShape.zzY9i().zzZTh().zzZA9();
                fZzZA9 = groupShape.zzY9i().zzZTh().zzZAa();
            } else {
                fZzZAa *= groupShape.zzY9i().zzZTh().zzZAa();
                fZzZA9 = groupShape.zzY9i().zzZTh().zzZA9();
            }
            f *= fZzZA9;
            shapeBase2 = groupShape;
        }
        return com.aspose.words.internal.zzZPW.zzG(fZzZAa, f);
    }

    public static long zzK(ShapeBase shapeBase) {
        long jZzJ = zzJ(shapeBase);
        int i = (int) jZzJ;
        return com.aspose.words.internal.zzZPW.zzG(!com.aspose.words.internal.zzAN.zzf(Float.intBitsToFloat(i)) ? 1.0f / Float.intBitsToFloat(i) : 1.0f, com.aspose.words.internal.zzAN.zzf(com.aspose.words.internal.zzZPW.zzYz(jZzJ)) ? 1.0f : 1.0f / com.aspose.words.internal.zzZPW.zzYz(jZzJ));
    }

    private static float zzQ(float f, int i) {
        return (i == 1 || i == 2) ? -f : f;
    }

    private static com.aspose.words.internal.zzP9 zzW(zz53 zz53Var) {
        GroupShape groupShape = (GroupShape) com.aspose.words.internal.zzZKW.zzZ(zz53Var.zzZye(), GroupShape.class);
        if (groupShape == null) {
            return new com.aspose.words.internal.zzP9();
        }
        zz07 zz07VarZzZTh = groupShape.zzY9i().zzZTh();
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzZ(zz07VarZzZTh.zzZAa(), zz07VarZzZTh.zzZA9(), 0);
        if (groupShape.getParentNode() != null && groupShape.getParentNode().getNodeType() == 17) {
            zzp9.zzZ(zzW(groupShape.zzY9i()), 1);
        }
        return zzp9;
    }

    private static com.aspose.words.internal.zzP9 zzX(zz2J zz2j) {
        com.aspose.words.internal.zzP9 zzp9ZzW = zzW(zz2j);
        if (zzp9ZzW.isIdentity()) {
            return zzp9ZzW;
        }
        zz07 zz07VarZzZTh = zz2j.zzZTh();
        long jZzR = zzp9ZzW.zzR(zz07VarZzZTh.zzZPI());
        zzp9ZzW.zzY(-((Float.intBitsToFloat((int) jZzR) - Float.intBitsToFloat((int) zz07VarZzZTh.zzNV())) + ((float) zz07VarZzZTh.zzQb())), -((com.aspose.words.internal.zzZPY.zzYC(jZzR) - com.aspose.words.internal.zzZPY.zzYC(zz07VarZzZTh.zzNV())) + ((float) zz07VarZzZTh.zzYm())), 1);
        return zzp9ZzW;
    }

    private long zzZub() {
        return (this.zzYYs && this.zzYYr.zzZvw()) ? ((ShapeBase) com.aspose.words.internal.zzZKW.zzZ(this.zzYYr.zzZye(), ShapeBase.class)) == null ? com.aspose.words.internal.zzZPW.zzG(1.0f, 1.0f) : zzK(this.zzYYr.zzZyb()) : com.aspose.words.internal.zzZPW.zzG(1.0f, 1.0f);
    }

    public final zz2G zzS(zz50 zz50Var) {
        return zzZ(zzZRN(), zz50Var, this.zzYYr.zzZTf().zzZAP());
    }

    public void zzZ(com.aspose.words.internal.zzZL zzzl, zz05 zz05Var) throws Exception {
    }

    public final long zzZRN() {
        zz07 zz07VarZzZTh = this.zzYYr.zzZTh();
        zz2O zz2o = (zz2O) com.aspose.words.internal.zzZKW.zzZ(this.zzYYr, zz2O.class);
        boolean z = (!this.zzYYr.zzZyb().isTopLevel() || zz2o == null || this.zzYYr.getFitShapeToText() || zz2o.zzZTl().zzZts() == 2 || this.zzYYr.zzZyb().zzY9i() == null) ? false : true;
        double dZzp = z ? com.aspose.words.internal.zzSA.zzp(this.zzYYr.zzZyb().zzY9O().getWidth()) : zz07VarZzZTh.getWidth();
        double dZzp2 = z ? com.aspose.words.internal.zzSA.zzp(this.zzYYr.zzZyb().zzY9O().getHeight()) : zz07VarZzZTh.getHeight();
        long jZzJ = zzJ(this.zzYYr.zzZyb());
        int i = (int) jZzJ;
        if ((!com.aspose.words.internal.zzAN.zzS(Float.intBitsToFloat(i), 1.0f) || !com.aspose.words.internal.zzAN.zzS(com.aspose.words.internal.zzZPW.zzYz(jZzJ), 1.0f)) && this.zzYYr.zzZvw()) {
            this.zzYYs = true;
            dZzp *= (double) Float.intBitsToFloat(i);
            dZzp2 *= (double) com.aspose.words.internal.zzZPW.zzYz(jZzJ);
        }
        return com.aspose.words.internal.zzZPW.zzG((float) dZzp, (float) dZzp2);
    }

    public final zz2G zzZ(long j, zz50 zz50Var, zzZCC zzzcc) {
        zzGR zzgrZzZ = zzZ(zz50Var.zzZIB());
        zzgrZzZ.zzZK(this.zzYYr.zzZTh().zzZv());
        zzgrZzZ.zzYK(zz50Var.zzZy7());
        zzgrZzZ.zzY4(this.zzYYr.zzZTh().zzZPI());
        zzgrZzZ.zzYJ(zz50Var.zzZy6());
        zzgrZzZ.zzYI(zz50Var.zzZy5());
        zzgrZzZ.zzY4(this.zzYYr.zzZyb().zzZPF());
        return new zz2G(Float.intBitsToFloat((int) j), com.aspose.words.internal.zzZPW.zzYz(j), this.zzYYr.getOutline(), this.zzYYr.getFill(), zzgrZzZ, zzzcc);
    }

    private zzGR zzZ(zzZC3 zzzc3) {
        zz1K zz1kZzZTj = this.zzYYr.zzZTj();
        if (zz1kZzZTj == null) {
            zz1kZzZTj = new zz1K();
        }
        return new zzGR(this.zzYYr, zzzc3, zz1kZzZTj);
    }

    public final com.aspose.words.internal.zzG zzZ(zz7H zz7h, zz2G zz2g) throws Exception {
        return zzZ(zz2g, zz7F.zzY(zz7h, zz2g));
    }

    public final void zzZ(zz05 zz05Var, com.aspose.words.internal.zzG zzg) throws Exception {
        long jZzZub = zzZub();
        zz35 zz35VarZzY = zz05Var.zzY(Float.intBitsToFloat((int) jZzZub), com.aspose.words.internal.zzZPW.zzYz(jZzZub), true);
        for (int i = 0; i < zzg.getCount(); i++) {
            com.aspose.words.internal.zzZL zzzlZzN = zzg.zzN(i);
            if (zzzlZzN != null) {
                com.aspose.words.internal.zzZG zzzg = (com.aspose.words.internal.zzZG) com.aspose.words.internal.zzZKW.zzZ(zzzlZzN, com.aspose.words.internal.zzZG.class);
                if (zzzg != null) {
                    zzZ(zzzg, zz05Var);
                } else {
                    zzZ(zzzlZzN, zz05Var);
                }
            }
        }
        zzg.zzW(zz35VarZzY.zzZwb());
    }

    public final void zzZ(zz05 zz05Var, com.aspose.words.internal.zzG zzg, boolean z) {
        long jZzZub = zzZub();
        double dZzZs6 = zz05Var.zzZs9().zzZs6();
        double dZzZs5 = zz05Var.zzZs9().zzZs5();
        double dZzZs4 = zz05Var.zzZs9().zzZs4();
        if (!z) {
            zz05Var.zzZs9().zzXe(0.0d);
            zz05Var.zzZs9().zzXg(1.0d);
            zz05Var.zzZs9().zzXf(1.0d);
        } else {
            zz05Var.zzZs9().zzXg(dZzZs5);
            zz05Var.zzZs9().zzXf(dZzZs5);
        }
        zz35 zz35VarZzY = zz05Var.zzY(Float.intBitsToFloat((int) jZzZub), com.aspose.words.internal.zzZPW.zzYz(jZzZub), true);
        if (!z) {
            zz05Var.zzZs9().zzXe(dZzZs4);
        }
        zz05Var.zzZs9().zzXg(dZzZs6);
        zz05Var.zzZs9().zzXf(dZzZs5);
        if (zzg.zzZO() == null) {
            zzg.zzW(zz35VarZzY.zzZwc());
        } else {
            zzg.zzZO().zzZ(zz35VarZzY.zzZwc(), 0);
        }
    }

    public final zzZS8 zzZ(zz2J zz2j, com.aspose.words.internal.zzG zzg, zz2G zz2g) throws Exception {
        com.aspose.words.internal.zzG zzg2;
        long size = new com.aspose.words.internal.zzH().zzZ((com.aspose.words.internal.zzZL) zzg).getSize();
        boolean z = false;
        if (zz2j.zzZHY() == 2 && zzg.getCount() > 0 && (zzg2 = (com.aspose.words.internal.zzG) com.aspose.words.internal.zzZKW.zzZ(zzg.zzN(0), com.aspose.words.internal.zzG.class)) != null && zzg2.zzZK()) {
            size = com.aspose.words.internal.zzZPW.zzG(zz2j.getWidth(), zz2j.getHeight());
            z = true;
        }
        zzZS8 zzzs8ZzZ = zzZ(zz2j, size, this.zzZjc, this.zzZjb, zz2g);
        if (zzzs8ZzZ != null) {
            zzzs8ZzZ.zzW8(z);
        }
        return zzzs8ZzZ;
    }

    public final zzZS8 zzZ(zz2J zz2j, long j, zz2S zz2s, zz2N zz2n, zz2G zz2g) throws Exception {
        if (zz7Y.zzZ(zz2s, this.zzZjb)) {
            return zzZS7.zzZ(zz2j, j, zz2s, zz2n, zz3I.zzHe(zz2s.zzZvF().zzZPy()), zz2g);
        }
        return null;
    }

    private com.aspose.words.internal.zzG zzZ(zz2G zz2g, com.aspose.words.internal.zzG zzg) throws Exception {
        zz2N zz2n = this.zzZjb;
        if (zz2n == null || zz2n.zzZvo() == 0.0d) {
            return zzg;
        }
        zzGR zzgrZzZvb = zz2g.zzZvb();
        com.aspose.words.internal.zzPV zzpvZzZ = com.aspose.words.internal.zzPV.zzKa;
        if (this.zzZjb.zzZvq() != null) {
            zzpvZzZ = this.zzZjb.zzZvq().zzZ(zzgrZzZvb.getThemeProvider(), zzgrZzZvb.zzZPL());
        }
        return zzT8.zzZ(zzg, new com.aspose.words.internal.zzOU(zzpvZzZ, (float) this.zzZjb.zzZvo()), zzgrZzZvb.zzZPK());
    }

    private void zzZ(com.aspose.words.internal.zzZG zzzg, zz05 zz05Var) {
        zzZ(zzzg.zzZ0(), zz05Var);
        zzZ(zzzg.zzZ1(), zz05Var);
    }

    public final void zzZ(com.aspose.words.internal.zzP8 zzp8, zz05 zz05Var) {
        zzp8.zzY(zzZ(zz05Var, true));
    }

    public final com.aspose.words.internal.zzP9 zzZ(zz05 zz05Var, boolean z) {
        long jZzZub = zzZub();
        return zz05Var.zzY(Float.intBitsToFloat((int) jZzZub), com.aspose.words.internal.zzZPW.zzYz(jZzZub), z).zzZwc();
    }

    private void zzZ(com.aspose.words.internal.zzPY zzpy, zz05 zz05Var) {
        com.aspose.words.internal.zzP9 zzp9ZzX;
        if (zzpy == null) {
            return;
        }
        if (zzpy.zzPH() == 5) {
            zzp9ZzX = zzZ(zz05Var, false);
        } else {
            zzp9ZzX = zzX(this.zzYYr);
        }
        if (com.aspose.words.internal.zzP9.zzO(zzp9ZzX)) {
            return;
        }
        int iZzPH = zzpy.zzPH();
        if (iZzPH == 2) {
            com.aspose.words.internal.zzOH zzoh = (com.aspose.words.internal.zzOH) zzpy;
            if (zzoh.zzNa() == 4) {
                zzoh.zzNb().zzZ(zzp9ZzX, 1);
                return;
            }
            return;
        }
        if (iZzPH == 3) {
            com.aspose.words.internal.zzPA zzpa = (com.aspose.words.internal.zzPA) zzpy;
            if (!com.aspose.words.internal.zzAN.zzZD(this.zzYYr.getFill().zzZBu()) && !com.aspose.words.internal.zzAN.zzL(180.0d, this.zzYYr.getFill().zzZBu())) {
                zzpa.zzNb().zzZ(zzp9ZzX, 1);
                return;
            } else {
                zzpa.zzP(com.aspose.words.internal.zzJ6.zzZ(zzpa.zzOw(), zzp9ZzX));
                return;
            }
        }
        if (iZzPH == 4) {
            ((com.aspose.words.internal.zzOP) zzpy).zzNb().zzZ(zzp9ZzX, 1);
        } else {
            if (iZzPH != 5) {
                return;
            }
            com.aspose.words.internal.zzP0 zzp0 = (com.aspose.words.internal.zzP0) zzpy;
            zzp0.zzUu().zzY(zzp9ZzX);
            zzp0.zzo(zzp9ZzX.zzR(zzp0.zzNV()));
        }
    }
}
