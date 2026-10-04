package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzF extends com.aspose.words.internal.zz6 {
    private com.aspose.words.internal.zz7 zzZFS;
    private zzYN8 zzZFT;
    private int zzZFU;

    private zzF(com.aspose.words.internal.zz7 zz7Var, zzYN8 zzyn8, int i) {
        this.zzZFS = zz7Var;
        this.zzZFT = zzyn8;
        this.zzZFU = i;
    }

    private static zzH zzH(com.aspose.words.internal.zzZL zzzl) {
        com.aspose.words.internal.zzZS zzzs = (com.aspose.words.internal.zzZS) com.aspose.words.internal.zzZKW.zzZ(zzzl.zzZ5(), com.aspose.words.internal.zzZS.class);
        if (zzzs != null && zzzs.zzZg() == 33554432) {
            return (zzH) com.aspose.words.internal.zzZKW.zzZ(zzzs.getTag(), zzH.class);
        }
        return null;
    }

    private zzH zzI(com.aspose.words.internal.zzZL zzzl) {
        if (zzzl == this.zzZFS) {
            return null;
        }
        zzH zzH = zzH(zzzl);
        return zzH == null ? zzI(zzzl.zzZ5()) : zzH;
    }

    private void zzV(com.aspose.words.internal.zzZS zzzs) throws Exception {
        zzG zzg = (zzG) com.aspose.words.internal.zzZKW.zzZ(zzzs.getTag(), zzG.class);
        zzZ(zzg);
        if (zzg.zzbK()) {
            ((com.aspose.words.internal.zzHT) com.aspose.words.internal.zzZKW.zzZ(zzg.zzbJ(), com.aspose.words.internal.zzHT.class)).zzZ(com.aspose.words.internal.zzP8.zzM(zzg.zzbL()));
        }
    }

    private void zzW(com.aspose.words.internal.zzZS zzzs) {
        zzH zzhZzI = zzI(zzzs);
        if (zzhZzI == null || zzhZzI.zzbM() == null) {
            return;
        }
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzg.zzW(zzhZzI.zzbM());
        for (int i = 0; i < zzzs.getCount(); i++) {
            zzg.zzX(zzzs.zzN(i));
        }
        zzzs.clear();
        zzzs.zzX(zzg);
    }

    private void zzX(com.aspose.words.internal.zzZS zzzs) throws Exception {
        zz8 zz8Var = (zz8) com.aspose.words.internal.zzZKW.zzZ(zzzs.getTag(), zz8.class);
        if (zz8Var == null || zz8Var.zzbz().zzYS8() || zz8Var.zzbz().isInline()) {
            return;
        }
        long jZzK = zz8Var.zzby().zzK(this.zzZFT);
        if (com.aspose.words.internal.zzZPY.zzYF(jZzK)) {
            return;
        }
        ((com.aspose.words.internal.zzHR) com.aspose.words.internal.zzZKW.zzZ(zz8Var.zzbJ(), com.aspose.words.internal.zzHR.class)).zzZO().zzY(Float.intBitsToFloat((int) jZzK), com.aspose.words.internal.zzZPY.zzYC(jZzK), 1);
    }

    private boolean zzY(zzG zzg) throws Exception {
        zz8 zz8Var = (zz8) com.aspose.words.internal.zzZKW.zzZ(zzg, zz8.class);
        if (zz8Var == null) {
            return false;
        }
        zzZ6L zzz6lZzbz = zz8Var.zzbz();
        if (zzz6lZzbz.zzYS8() || zzz6lZzbz.getWrapType() == 3 || !zzz6lZzbz.zzYS7()) {
            return false;
        }
        int i = this.zzZFU;
        if (i >= 15) {
            return true;
        }
        if (i >= 12 && zzz6lZzbz.isInline()) {
            return zzz6lZzbz.isImage() || zzz6lZzbz.hasChart() || zzz6lZzbz.hasSmartArt();
        }
        return false;
    }

    public static void zzZ(com.aspose.words.internal.zz7 zz7Var, zzYN8 zzyn8, int i) throws Exception {
        zz7Var.zzZ(new zzF(zz7Var, zzyn8, i));
    }

    @Override // com.aspose.words.internal.zz6
    public final boolean zzZ(com.aspose.words.internal.zzZS zzzs) throws Exception {
        int iZzZg = zzzs.zzZg();
        if (iZzZg == 33554432) {
            zzX(zzzs);
            zzV(zzzs);
            return true;
        }
        if (iZzZg != 67108864) {
            return true;
        }
        zzW(zzzs);
        return true;
    }

    private void zzZ(zzG zzg) throws Exception {
        boolean zIsInline;
        zzH zzhZzY;
        com.aspose.words.internal.zzZQ4 zzzq4ZzO;
        if (zzY(zzg) && (zzhZzY = zzY(zzg.zzbJ(), (zIsInline = ((zz8) com.aspose.words.internal.zzZKW.zzZ(zzg, zz8.class)).zzbz().isInline()))) != null) {
            if (zIsInline) {
                zzzq4ZzO = zzhZzY.zzbL();
            } else {
                zzzq4ZzO = ((com.aspose.words.internal.zzHR) com.aspose.words.internal.zzZKW.zzZ(zzg.zzbJ(), com.aspose.words.internal.zzHR.class)).zzZO().zzOo().zzO(zzZ(zzhZzY.zzbL(), zzhZzY.zzbJ(), this.zzZFS));
            }
            zzg.zz5(zzZ(zzzq4ZzO, zzg));
        }
    }

    private zzH zzY(com.aspose.words.internal.zzZL zzzl, boolean z) {
        if (zzzl == this.zzZFS || zzzl.zzZ5() == null) {
            return null;
        }
        zzH zzH = zzH(zzzl);
        if (zzH == null) {
            zzH = zzY(zzzl.zzZ5(), z);
            if (z && zzH != null && (zzzl instanceof com.aspose.words.internal.zzHR)) {
                return (zzH) com.aspose.words.internal.zzZKW.zzZ(zzZ(zzH, (com.aspose.words.internal.zzHR) com.aspose.words.internal.zzZKW.zzZ(zzzl, com.aspose.words.internal.zzHR.class)), zzH.class);
            }
        }
        return zzH;
    }

    private static com.aspose.words.internal.zzZQ4 zzZ(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZL zzzl, com.aspose.words.internal.zz7 zz7Var) {
        if (zzzl == zz7Var) {
            return zzzq4;
        }
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzZ(zzzq4, zzzl.zzZ5(), zz7Var);
        com.aspose.words.internal.zzHR zzhr = (com.aspose.words.internal.zzHR) com.aspose.words.internal.zzZKW.zzZ(zzzl, com.aspose.words.internal.zzHR.class);
        if (zzhr == null) {
            return zzzq4ZzZ;
        }
        zzzq4ZzZ.isEmpty();
        return zzhr.zzZO().zzO(zzzq4ZzZ);
    }

    private static com.aspose.words.internal.zzZQ4 zzZ(com.aspose.words.internal.zzZQ4 zzzq4, zzG zzg) {
        return zzg.zzbK() ? com.aspose.words.internal.zzZQ4.zzU(zzzq4, zzg.zzbL()) : zzzq4;
    }

    private static zzG zzZ(zzG zzg, com.aspose.words.internal.zzHR zzhr) {
        zzG zzgZzbI = zzg.zzbI();
        zzgZzbI.zz5(zzhr.zzZO().zzOo().zzO(zzgZzbI.zzbL()));
        return zzgZzbI;
    }
}
