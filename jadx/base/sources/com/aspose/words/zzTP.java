package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzTP {
    private zzVE zzZsV;

    public zzTP(zzVE zzve) throws Exception {
        this.zzZsV = new zzVE(zzve);
    }

    public final zzTO zzZ(zzVF zzvf, int i, boolean z, zzZ7A zzz7a, boolean z2) throws Exception {
        this.zzZsV.zz0Z();
        zzTO zztoZzZ = zzZ(this.zzZsV, zzvf, z2);
        int iZzZD = zzYAW.zzZD(zzvf.zz14());
        int iZzZYn = i - zztoZzZ.zzZYn();
        int iZzYL5 = zzvf.zz14().zzY6N().zzYL5() / 2;
        zzVE zzve = new zzVE(this.zzZsV);
        zzve.movePrevious();
        zzVE zzve2 = new zzVE(this.zzZsV);
        zzve2.moveNext();
        if (!z && !this.zzZsV.zz14().zzY6D() && zzve.zz14().zzY6D() && !zzve2.zz14().zzY6D()) {
            return null;
        }
        if (iZzZYn > 0) {
            if (com.aspose.words.internal.zzZYD.zzXk(zzvf.zz14().getText()) && zzZL0.zzZ(zzvf.zz14(), zzvf.getCharacter()) && !((zzZ55) zzvf.zz14().zzZZJ()).zzYQf() && zzz7a.zzW(this.zzZsV) && iZzZYn < iZzYL5 && !zzvf.zz14().zzY6N().zzZr().zzPl().isEmbedded()) {
                return zztoZzZ;
            }
        } else if (iZzZD == 15) {
            if (zzz7a.zzX(this.zzZsV) || (i <= iZzYL5 && !z)) {
                return zztoZzZ;
            }
        } else if (!this.zzZsV.zz14().zzY6D() || !zzz7a.zzY(this.zzZsV)) {
            if (zzve.zz14().zzY6D() && zzz7a.zzY(zzve)) {
                return zztoZzZ;
            }
            if ((!z || iZzZD == 23) && (!z || zzve.zz14() == zzvf.zz14() || zzve.zz14().zzY7u() == zzvf.zz14().zzY7u())) {
                return zztoZzZ;
            }
        }
        return null;
    }

    private static zzTO zzZ(zzVE zzve, zzVF zzvf, boolean z) throws Exception {
        zzTO zzto = new zzTO();
        zzYAU zzyauZz14 = zzve.zz14();
        zzYAU zzyauZz142 = zzve.zz14();
        int i = 27;
        boolean z2 = false;
        while (true) {
            int iZzZD = z2 ? 28 : zzYAW.zzZD(zzve.zz14());
            boolean z3 = zzve.zz14() == zzvf.zz14() && zzve.getIndex() == zzvf.getIndex();
            zzYJZ zzyjzZzF = zzYAV.zzF(i, iZzZD, z);
            zzYAU zzyauZz143 = iZzZD == 28 ? zzve.zz14() : zzyauZz142;
            if (i == 1 && zzyauZz143 == zzyauZz14) {
                zzyjzZzF = null;
            }
            zzYJZ zzyjz = (!zzyauZz143.zzY6N().zzZr().zzPl().isEmbedded() || zzYAV.zzVI(i, iZzZD)) ? zzyjzZzF : null;
            if (zzyjz != null) {
                int iZzpC = zzyjz.zzpC(zzyauZz143.zzVH(zzyauZz143.zzY6N().zzYL5(), 1));
                if (zzZ(zzyauZz143, iZzpC, (i == 15 && iZzZD == 23) || (iZzZD == 15 && i == 23))) {
                    zzto.zzZ(zzyauZz143, zzyjz.zzYmb(), iZzpC);
                    if (i == 7 && iZzZD == 1) {
                        zzto.zzZ(zzyauZz143, zzyjz.zzYmb(), iZzpC);
                    }
                }
            }
            if (iZzZD == 28) {
                return zzto;
            }
            if (!z3) {
                if (zzve.zz14() == zzvf.zz14()) {
                    zzve.moveNext();
                } else {
                    boolean z4 = (i == 0 || i == 27) && zzyauZz14 == zzyauZz142;
                    zzyauZz142 = zzve.zz14();
                    zzve.zzV((zzYAU) zzve.zz14().zzYo1());
                    if (z4) {
                        zzyauZz14 = zzyauZz142;
                    }
                }
            }
            i = iZzZD;
            z2 = z3;
        }
    }

    private static boolean zzZ(zzYAU zzyau, int i, boolean z) throws Exception {
        if (i <= 0) {
            return false;
        }
        int iZzZo6 = zzyau.zzZo6();
        if (iZzZo6 != 9217) {
            return iZzZo6 == 10754;
        }
        zzY9S zzy9s = (zzY9S) com.aspose.words.internal.zzZKW.zzZ(zzyau, zzY9S.class);
        return !zzy9s.zzY4C() && (zzy9s.zzY5J() > i || (!z && zzZ(zzy9s)));
    }

    private static boolean zzZ(zzY9S zzy9s) throws Exception {
        return zzy9s.zzly(zzy9s.getText().charAt(zzy9s.getText().length() - 1));
    }
}
