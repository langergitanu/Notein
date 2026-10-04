package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzRL {
    private static final com.aspose.words.internal.zzZHW zzUR;
    private static zzRL zzZrK = new zzRL();
    private static com.aspose.words.internal.zz7D<zzL4> zzZrL;
    private double zzZrE;
    private int zzZCp = 0;
    private String zzZrH = "";
    private double zzZrJ = 0.0d;
    private double zzZrF = 0.0d;
    private com.aspose.words.internal.zzPV zzZrI = com.aspose.words.internal.zzPV.zzHZ;
    private boolean zzYQ = false;
    private boolean zzZrG = true;

    static {
        com.aspose.words.internal.zz7D<zzL4> zz7d = new com.aspose.words.internal.zz7D<>();
        zzZrL = zz7d;
        zz7d.zzP(zzL4.zzZno, 0);
        zzZrL.zzP(zzL4.zzZly, 0);
        zzZrL.zzP(zzL4.zzZlx, 6);
        zzZrL.zzP(zzL4.zzZlw, 22);
        zzZrL.zzP(zzL4.zzZlu, 3);
        zzZrL.zzP(zzL4.zzZlt, 24);
        zzZrL.zzP(zzL4.zzZls, 25);
        zzZrL.zzP(zzL4.zzZlv, 1);
        zzZrL.zzP(zzL4.zzZlr, 27);
        zzZrL.zzP(zzL4.zzZlq, 26);
        zzZrL.zzP(zzL4.zzZlp, 1);
        zzZrL.zzP(zzL4.zzZlz, 2);
        zzZrL.zzP(zzL4.zzZlo, 5);
        zzZrL.zzP(zzL4.zzZln, 6);
        zzZrL.zzP(zzL4.zzZlm, 7);
        zzZrL.zzP(zzL4.zzZll, 8);
        zzZrL.zzP(zzL4.zzZlk, 9);
        zzZrL.zzP(zzL4.zzZlj, 10);
        zzZrL.zzP(zzL4.zzZli, 11);
        zzZrL.zzP(zzL4.zzZlh, 12);
        zzZrL.zzP(zzL4.zzZlg, 13);
        zzZrL.zzP(zzL4.zzZlf, 14);
        zzZrL.zzP(zzL4.zzZle, 15);
        zzZrL.zzP(zzL4.zzZld, 16);
        zzZrL.zzP(zzL4.zzZlc, 17);
        zzZrL.zzP(zzL4.zzZlb, 18);
        zzZrL.zzP(zzL4.zzZla, 19);
        zzZrL.zzP(zzL4.zzZl9, 20);
        zzZrL.zzP(zzL4.zzZl8, 21);
        zzZrL.zzP(zzL4.zzZl7, 22);
        zzZrL.zzP(zzL4.zzZl6, 23);
        zzZrL.zzP(zzL4.zzZl5, 24);
        zzZrL.zzP(zzL4.zzZl4, 25);
        zzUR = new com.aspose.words.internal.zzZHW("solid", "groove", "ridge", "inset", "outset", "double", "dotted", "dashed");
    }

    private zzRL() {
    }

    private static int zzSN(String str) {
        switch (zzUR.zzTP(com.aspose.words.internal.zzZKN.zzU2(str))) {
            case 0:
                return 9;
            case 1:
                return 4;
            case 2:
                return 6;
            case 3:
                return 3;
            case 4:
                return 5;
            case 5:
                return 10;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 0;
        }
    }

    private static double zzV(zzL4 zzl4) {
        if (zzl4.zzP(zzL4.zzZlA)) {
            return 1.5d;
        }
        if (zzl4.zzP(zzL4.zzZlB)) {
            return 3.0d;
        }
        if (zzl4.zzP(zzL4.zzZlz)) {
            return 4.5d;
        }
        double dZzL = zzL5.zzL(zzl4);
        if (com.aspose.words.internal.zzAN.zzZC(dZzL)) {
            return 0.0d;
        }
        return dZzL;
    }

    private void zzW(zzL4 zzl4) {
        this.zzZrE = zzV(zzl4);
    }

    private void zzX(zzL4 zzl4) {
        double dZzV = zzV(zzl4);
        this.zzZrF = dZzV;
        this.zzZrJ = dZzV;
    }

    public static zzRL zzY(zzPS zzps, int i) {
        String str;
        String str2;
        String str3;
        if (i == 4) {
            str = "-aw-border-insideh-style";
            str2 = "-aw-border-insideh-width";
            str3 = "-aw-border-insideh-color";
        } else {
            if (i != 5) {
                return null;
            }
            str = "-aw-border-insidev-style";
            str2 = "-aw-border-insidev-width";
            str3 = "-aw-border-insidev-color";
        }
        return zzZ(zzps, str, str2, str3, null, null, false, false);
    }

    public static zzRL zzZ(zzPS zzps, int i, boolean z) {
        return zzZ(zzps, i, false, z);
    }

    private boolean zzZXi() {
        return this.zzZCp == 0;
    }

    private void zzZXl() {
        float fZzT = Border.zzT(this.zzZCp, 1.0f);
        if (fZzT > 1.0f) {
            this.zzZrJ /= (double) fZzT;
        }
    }

    public static zzRL zzZXm() {
        return zzZrK;
    }

    public final int getLineStyle() {
        return this.zzZCp;
    }

    public final double getLineWidth() {
        return this.zzZrJ;
    }

    public final boolean isVisible() {
        return (this.zzZrG || this.zzYQ || zzZXi()) ? false : true;
    }

    public final com.aspose.words.internal.zzPV zz8Q() {
        return this.zzZrI;
    }

    public final void zzI(Border border) {
        border.zzOV(this.zzZCp);
        border.zzZ5(this.zzZrJ);
        border.zzm(this.zzZrI);
    }

    public final boolean zzZXh() {
        return this.zzZrG;
    }

    public final double zzZXj() {
        return this.zzZrE;
    }

    public final double zzZXk() {
        return this.zzZrF;
    }

    public static zzRL zzZ(zzPS zzps, int i) {
        return zzZ(zzps, i, true, false);
    }

    public final int zzZ(zzRL zzrl) {
        int iZzSN;
        int iZzSN2;
        boolean z = this.zzYQ;
        if (z && !zzrl.zzYQ) {
            return 1;
        }
        if (z && zzrl.zzYQ) {
            return 0;
        }
        if (!z && zzrl.zzYQ) {
            return -1;
        }
        if (!zzZXi() && zzrl.zzZXi()) {
            return 1;
        }
        if (zzZXi() && zzrl.zzZXi()) {
            return 0;
        }
        if (zzZXi() && !zzrl.zzZXi()) {
            return -1;
        }
        double d = this.zzZrF;
        double d2 = zzrl.zzZrF;
        if (d > d2) {
            return 1;
        }
        if (d < d2) {
            return -1;
        }
        if (this.zzZCp == zzrl.zzZCp || (iZzSN = zzSN(this.zzZrH)) == (iZzSN2 = zzSN(zzrl.zzZrH))) {
            return 0;
        }
        return com.aspose.words.internal.zzZKR.zzZ7(iZzSN, iZzSN2);
    }

    public static zzRL zzY(zzPS zzps) {
        zzRL zzrlZzZ = zzZ(zzps, 1, false, false);
        zzRL zzrlZzZ2 = zzZ(zzps, 2, false, false);
        zzRL zzrlZzZ3 = zzZ(zzps, 3, false, false);
        zzRL zzrlZzZ4 = zzZ(zzps, 0, false, false);
        if (!zzrlZzZ.zzZrG && !zzrlZzZ2.zzZrG && !zzrlZzZ3.zzZrG && !zzrlZzZ4.zzZrG) {
            int i = zzrlZzZ.zzZCp;
            int i2 = zzrlZzZ3.zzZCp;
            if (i == i2 && zzrlZzZ2.zzZCp == i2 && zzrlZzZ4.zzZCp == i2) {
                return zzrlZzZ3;
            }
        }
        return zzZrK;
    }

    public final void zzZ(Stroke stroke) {
        if (this.zzYQ) {
            stroke.setOn(false);
            return;
        }
        switch (zzUR.zzTP(this.zzZrH)) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                stroke.setLineStyle(0);
                stroke.setDashStyle(0);
                break;
            case 5:
                stroke.setLineStyle(1);
                stroke.setDashStyle(0);
                break;
            case 6:
                stroke.setLineStyle(0);
                stroke.setDashStyle(2);
                break;
            case 7:
                stroke.setLineStyle(0);
                stroke.setDashStyle(1);
                break;
            default:
                stroke.setOn(false);
                return;
        }
        stroke.setOn(true);
        stroke.setWeight(this.zzZrF);
        stroke.zzm(this.zzZrI);
        stroke.setJoinStyle(1);
    }

    private static zzRL zzZ(zzPS zzps, int i, boolean z, boolean z2) {
        if (i == 0) {
            return zzZ(zzps, "border-bottom-style", "border-bottom-width", "border-bottom-color", "-aw-border-bottom-style", "-aw-border-bottom-width", z, z2);
        }
        if (i == 1) {
            return zzZ(zzps, "border-left-style", "border-left-width", "border-left-color", "-aw-border-left-style", "-aw-border-left-width", z, z2);
        }
        if (i == 2) {
            return zzZ(zzps, "border-right-style", "border-right-width", "border-right-color", "-aw-border-right-style", "-aw-border-right-width", z, z2);
        }
        if (i != 3) {
            return null;
        }
        return zzZ(zzps, "border-top-style", "border-top-width", "border-top-color", "-aw-border-top-style", "-aw-border-top-width", z, z2);
    }

    private static zzRL zzZ(zzPS zzps, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        zzMP zzmp;
        zzMP zzmpZzZWj;
        zzMP zzmp2;
        zzPT zzptZzSx = zzps.zzSx(str);
        if (zzptZzSx == null) {
            return zzZrK;
        }
        zzPT zzptZzSx2 = zzps.zzSx(str2);
        zzPT zzptZzSx3 = zzps.zzSx(str3);
        zzPT zzptZzSx4 = com.aspose.words.internal.zzZYD.zzXk(str5) ? zzps.zzSx(str5) : null;
        zzPT zzptZzSx5 = com.aspose.words.internal.zzZYD.zzXk(str4) ? zzps.zzSx(str4) : null;
        if (zzptZzSx2 != null) {
            zzmp = zzptZzSx2.zzZWj();
        } else {
            zzmp = new zzMP(zzL4.zzZlB);
        }
        zzMP zzmp3 = zzmp;
        zzMP zzmpZzZWj2 = zzptZzSx4 != null ? zzptZzSx4.zzZWj() : zzmp3;
        if (zzptZzSx5 != null) {
            zzmpZzZWj = zzptZzSx5.zzZWj();
        } else {
            zzmpZzZWj = zzptZzSx.zzZWj();
        }
        zzMP zzmp4 = zzmpZzZWj;
        if (zzptZzSx3 != null) {
            zzmp2 = zzptZzSx3.zzZWj();
        } else {
            zzmp2 = new zzMP(new zzQC(com.aspose.words.internal.zzPV.zzHZ));
        }
        zzMP zzmp5 = zzmp2;
        boolean z3 = zzptZzSx4 == null;
        zzRL zzrl = new zzRL();
        zzrl.zzZ(zzmp4, zzmpZzZWj2, zzmp5, zzmp3, z3, z, z2);
        return zzrl;
    }

    private void zzZ(zzMP zzmp, zzMP zzmp2, zzMP zzmp3, zzMP zzmp4, boolean z, boolean z2, boolean z3) {
        if (zzmp.getCount() == 1 && zzmp2.getCount() == 1 && zzmp3.getCount() == 1) {
            if (zzmp.zzZVx().zzP(zzL4.zzZly)) {
                this.zzYQ = true;
                this.zzZrG = false;
                return;
            }
            if (zzmp.zzZVx().zzP(zzL4.zzZno)) {
                this.zzZrG = false;
                return;
            }
            zzZ(zzmp.zzZVx(), z3);
            zzX(zzmp2.zzZVx());
            zzW(zzmp4.zzZVx());
            if (this.zzZCp != 0 && (!com.aspose.words.internal.zzAN.zzZD(this.zzZrJ) || z2)) {
                if (z) {
                    zzZXl();
                }
                this.zzZrG = false;
                if (zzmp3.zzZVx().getValueType() == 2) {
                    this.zzZrI = ((zzQC) zzmp3.zzZVx()).zzZWw();
                    return;
                } else {
                    if (zzmp3.zzZVx().zzP(zzL4.zzZnp)) {
                        this.zzZrI = com.aspose.words.internal.zzPV.zzI0;
                        return;
                    }
                    return;
                }
            }
            this.zzZCp = 0;
            this.zzZrJ = 0.0d;
        }
    }

    private void zzZ(zzL4 zzl4, boolean z) {
        String strZzU2;
        int i = zzZrL.get(zzl4);
        if (com.aspose.words.internal.zz7D.zzWm(i)) {
            i = 0;
        }
        this.zzZCp = i;
        if (z) {
            if (i == 26) {
                this.zzZCp = 27;
            } else if (i == 27) {
                this.zzZCp = 26;
            }
        }
        if (this.zzZCp != 0) {
            strZzU2 = com.aspose.words.internal.zzZKN.zzU2(((zzOT) zzl4).getValue());
        } else {
            strZzU2 = "none";
        }
        this.zzZrH = strZzU2;
    }
}
