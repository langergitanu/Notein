package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzYAS extends zzYAU {
    private boolean zzXcM;
    private zzZ3E zzXcN;
    private zzZ3E zzXcO;
    private zzZ37 zzXcP;
    private int zzXcQ;
    private zzZKW zzXcR;
    private Paragraph zzXcS;

    public zzYAS(int i, Paragraph paragraph) {
        zzY9R.zzmW(i);
        this.zzXcQ = i;
        this.zzXcS = paragraph;
    }

    private static String zzlP(int i) {
        if (i == 10528) {
            return "Page Break";
        }
        if (i == 10784) {
            return "\ufeff";
        }
        if (i == 21577 || i == 21586 || i == 21595) {
            return "¤";
        }
        if (i == 21639) {
            return "¶";
        }
        if (i == 21779) {
            return "Column Break";
        }
        if (i == 21788) {
            return "Page Break";
        }
        if (i == 21536 || i == 21537) {
            return "¶";
        }
        switch (i) {
            case 21513:
                return "↔";
            case 21514:
                return "\uf038";
            case 21515:
                return "¶";
            default:
                switch (i) {
                    case 21857:
                        return "Section Break (Next Page)";
                    case 21858:
                        return "Section Break (Continuous)";
                    case 21859:
                        return "Section Break (Odd Page)";
                    case 21860:
                        return "Section Break (Even Page)";
                    case 21861:
                        return "Section Break (Next Column)";
                    default:
                        throw new IllegalStateException("Unexpected break type.");
                }
        }
    }

    @Override // com.aspose.words.zzYAU
    public final int getLength() {
        return zzY7w() ? 0 : 1;
    }

    @Override // com.aspose.words.zzYAU
    public final String getText() throws Exception {
        return zzlP(zzZo6());
    }

    @Override // com.aspose.words.zzYAU
    public final void zzQF(boolean z) throws Exception {
        super.zzQF(z);
    }

    public final void zzQz(boolean z) {
        this.zzXcM = z;
    }

    public final void zzV(zzZ3A zzz3a) {
        this.zzXcN = zzz3a;
    }

    public final void zzW(zzYAS zzyas) throws Exception {
        if (zzyas == null) {
            return;
        }
        zzY9R.zzmT(zzyas.zzXcQ);
        this.zzXcR = zzyas.zzXcR;
        zzZ35 zzz35ZzY = zzZ35.zzY((zzZ35) this.zzXcO);
        zzz35ZzY.zzvR(((zzZ35) zzyas.zzXcO).zzYLy());
        zzz35ZzY.zzvQ(((zzZ35) zzyas.zzXcO).zzYLx());
        zzz35ZzY.zzvT(((zzZ35) zzyas.zzXcO).zzZRg());
        zzz35ZzY.zzvS(((zzZ35) zzyas.zzXcO).zzZRf());
        zzz35ZzY.zzHj(((zzZ35) zzyas.zzXcO).zzZRi());
        zzz35ZzY.zzHi(((zzZ35) zzyas.zzXcO).zzZRh());
        zzz35ZzY.zzX(((zzZ35) zzyas.zzXcO).zzYMV());
        zzz35ZzY.setBorderAppliesTo(((zzZ35) zzyas.zzXcO).getBorderAppliesTo());
        zzz35ZzY.setBorderDistanceFrom(((zzZ35) zzyas.zzXcO).getBorderDistanceFrom());
        zzz35ZzY.zzTP(((zzZ35) zzyas.zzXcO).zzYLr());
        zzz35ZzY.setSectionStart(((zzZ35) zzyas.zzXcO).getSectionStart());
        if (((zzZ35) zzyas.zzXcO).getRestartPageNumbering()) {
            zzz35ZzY.setPageStartingNumber(((zzZ35) zzyas.zzXcO).getPageStartingNumber());
        } else {
            zzz35ZzY.zzYLo();
        }
        this.zzXcO = zzZ35.zzZ(zzz35ZzY);
        if (zzY9R.zzmP(zzZo6())) {
            zzZ2D zzz2d = (zzZ2D) zzY6S().zza9();
            zzz2d.zzV1(true);
            try {
                zzz2d.zzZ((zzZ35) this.zzXcO);
            } finally {
                zzz2d.zzV1(false);
            }
        }
    }

    public final void zzX(zzYAS zzyas) throws Exception {
        zzyas.zzaa();
        zzyas.zzaa();
        zzaa();
        if (!zzY9R.zzmU(zzyas.zzZo6())) {
            zzY9R.zzmU(zzZo6());
        }
        zzyas.zzXcN = (zzZ3A) this.zzXcN;
        zzyas.zzXcO = (zzZ35) this.zzXcO;
        zzyas.zzXcR = this.zzXcR;
        this.zzXcN = null;
        this.zzXcO = null;
        this.zzXcR = null;
        this.zzXcQ = 21537;
        zzyas.zzXcQ = 21639;
    }

    public final void zzY(zzZ36 zzz36) {
        this.zzXcO = zzz36;
    }

    public final Paragraph zzY67() {
        return this.zzXcS;
    }

    public final zzZ3A zzY68() {
        return (zzZ3A) this.zzXcN;
    }

    public final zzZ35 zzY69() {
        return (zzZ35) this.zzXcO;
    }

    public final zzZ30 zzY6a() {
        return (zzZ30) this.zzXcN;
    }

    public final zzZ3B zzY6b() {
        zzZ3B zzz3b = (zzZ3B) this.zzXcO;
        return zzz3b == null ? zzZ3B.zzZ(null) : zzz3b;
    }

    public final zzZ37 zzY6c() {
        return this.zzXcP;
    }

    public final boolean zzY6d() throws Exception {
        if (zzZo6() != 21577 || zza8().zzYTa() || zzY6S() == null || zzY6S().zza9() == null || !((zzZ3B) ((zzWV) zzY6S().zza9()).zzYTt()).zzYMU()) {
            return false;
        }
        boolean z = ((zzZ55) zzZZJ()).zzI(true, true) == this;
        zzZ37 zzz37 = (zzZ37) zzY6S().zzYTt();
        boolean z2 = false;
        for (int i = 0; i <= 4 && !z2; i++) {
            zzZ3D zzz3dZzwz = zzz37.zzYMV().zzwz(i);
            z2 |= zzz3dZzwz.zz8F() || zzz3dZzwz.isVisible();
        }
        return z && !z2;
    }

    @Override // com.aspose.words.zzYAU
    public final zzYAU zzY71() throws Exception {
        zzYAS zzyas = new zzYAS(zzZo6(), this.zzXcS);
        zzyas.zzXcP = this.zzXcP;
        zzyas.zzXcO = this.zzXcO;
        zzyas.zzXcN = this.zzXcN;
        zzZB(zzyas);
        return zzyas;
    }

    @Override // com.aspose.words.zzYAU
    public final zzZKW zzY7m() throws Exception {
        if (this.zzXcR == null && zzY9R.zzmP(zzZo6())) {
            this.zzXcR = new zzZKW();
        }
        return this.zzXcR;
    }

    @Override // com.aspose.words.zzYAU
    public final boolean zzYKV() throws Exception {
        return zzZo6() == 21537 && zzY6N().isHidden() && zzY6N().zzYKV();
    }

    public final boolean zzYRF() {
        return this.zzXcM;
    }

    public final zzZ36 zzYk1() {
        return (zzZ36) this.zzXcO;
    }

    @Override // com.aspose.words.zzYAU
    public final boolean zzYol() {
        return super.zzYol();
    }

    @Override // com.aspose.words.zzYAU
    public final int zzZXS() throws Exception {
        if (zzZo6() == 10528) {
            return com.aspose.words.internal.zzSA.zzYy(144);
        }
        if (zzZo6() == 10784) {
            return 0;
        }
        if (!zzY9R.zzlw(zzZo6())) {
            return super.zzZXS();
        }
        if (zzZZJ() == null || !zzZZJ().zzac()) {
            return 0;
        }
        return zzZZJ().getWidth() - getX();
    }

    @Override // com.aspose.words.zzYAU
    public final int zzZo6() throws Exception {
        if (zzY9R.zzmT(this.zzXcQ) && zzY6S() != null) {
            zzYCT zzyctZzYTk = zzY6S().zzYTk();
            if (((zzY9C) zzyctZzYTk.zza9()).zzbD() && ((zzYCT) zzyctZzYTk.zzYTp()) != null && ((zzYCT) zzyctZzYTk.zzYTp()).zzYTt() != null) {
                int sectionStart = ((zzZ35) ((zzYCT) zzyctZzYTk.zzYTp()).zzYTt()).getSectionStart();
                if (sectionStart == 0) {
                    this.zzXcQ = 21858;
                } else if (sectionStart == 1) {
                    this.zzXcQ = 21861;
                } else if (sectionStart == 3) {
                    this.zzXcQ = 21860;
                } else if (sectionStart != 4) {
                    this.zzXcQ = 21857;
                } else {
                    this.zzXcQ = 21859;
                }
            }
        } else if (!zzE((short) 512) && zzY6X() && 21788 == this.zzXcQ) {
            zzab();
            if (zzaa().zzbD() && zzYTl() <= 0 && !zza7().zzYMK() && ((!zza9().zzYTn() || !zza9().zza9().zzYTn()) && zzY9R.zzmO(zzVE.zzT((zzYAU) zzYo1()).zzZo6()))) {
                this.zzXcQ = 10528;
            }
            zzZ((short) 512, true);
        } else {
            int i = this.zzXcQ;
            if (i == 21788 || i == 21779) {
                if (zzYTl() > 0) {
                    return 10784;
                }
                if (zzY6S() != null && ((zzZ37) zzY6S().zzYTt()).zzYLJ().isFloating()) {
                    return 10784;
                }
            }
        }
        return this.zzXcQ;
    }

    public final void zzY(zzZ30 zzz30) {
        this.zzXcN = zzz30;
    }

    public final void zzX(zzZ37 zzz37) {
        this.zzXcP = zzz37;
    }

    public final void zzX(zzZ3B zzz3b) {
        this.zzXcO = zzz3b;
    }

    public final void zzX(zzZ35 zzz35) {
        this.zzXcO = zzz35;
    }
}
