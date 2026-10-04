package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ53 {
    private zzZ55 zzYeg;

    public zzZ53(zzZ55 zzz55) {
        this.zzYeg = zzz55;
    }

    private static boolean zz8(zzZ55 zzz55) {
        return zzz55.zzYTn() && zzYJP.zzk(zzz55) > 0 && zzYJP.zzM((zzYMM) zzz55.zza9()) == null;
    }

    private static boolean zz9(zzZ55 zzz55) throws Exception {
        zzYA5 zzya5 = null;
        for (zzYAU zzyau = (zzYAU) zzz55.zz6x(); zzyau != null; zzyau = (zzYAU) zzyau.zz5Z()) {
            if (zzY9R.zzmT(zzyau.zzZo6()) && !zzZQ(zzyau)) {
                return true;
            }
            if (zzyau.zzZo6() != 0) {
                if (!zzyau.zzYol() && (zzya5 == null || !zzyau.zzY7w() || !zzya5.zzZj(zzyau))) {
                    return false;
                }
            } else if (zzya5 == null) {
                zzya5 = (zzYA5) com.aspose.words.internal.zzZKW.zzZ(zzyau, zzYA5.class);
            }
        }
        return false;
    }

    private static boolean zzQ(zzYMM zzymm) {
        return ((zzZ37) zzymm.zzYTt()).zzYMV().zzwz(4).isVisible() || ((zzZ37) zzymm.zzYTt()).zzYMV().zzwz(5).isVisible();
    }

    private boolean zzUK(boolean z) throws Exception {
        if (!zzUL(z)) {
            return false;
        }
        if (z && ((zzZ37) ((zzYMM) this.zzYeg.zza9()).zzYTt()).zzYMV().zzwz(4).isVisible()) {
            return true;
        }
        zzYMM zzymm = (zzYMM) (z ? ((zzYMM) this.zzYeg.zza9()).zzYTp() : ((zzYMM) this.zzYeg.zza9()).zzYTo());
        return zzQ(zzymm) || !((zzZ37) zzymm.zzYTt()).zzYMW().isEmpty();
    }

    private boolean zzYPy() throws Exception {
        zzYAU zzyauZzI;
        if (((zzYMM) this.zzYeg.zza9()).zzYoi() || (zzyauZzI = this.zzYeg.zzI(true, true)) == null) {
            return false;
        }
        if (zzY9R.zzmT(zzyauZzI.zzZo6()) && !zzZQ(zzyauZzI)) {
            return false;
        }
        if (zzyauZzI.zzZo6() == 21788 || zzyauZzI.zzZo6() == 21779) {
            return this.zzYeg.zzYnZ() && this.zzYeg.zzYnY();
        }
        return true;
    }

    private int zzYPz() throws Exception {
        if (((zzZ37) ((zzYMM) this.zzYeg.zza9()).zzYTt()).zzYSg()) {
            return 0;
        }
        int iZzYMa = ((zzYMM) this.zzYeg.zza9()).zzYMa();
        if (this.zzYeg.zzYQ3()) {
            if (iZzYMa > 0) {
                return -iZzYMa;
            }
            return 0;
        }
        if (iZzYMa < 0) {
            return iZzYMa;
        }
        return 0;
    }

    private static boolean zzZQ(zzYAU zzyau) throws Exception {
        zzY9R.zzmT(zzyau.zzZo6());
        int storyType = zzyau.zzaa().getStoryType();
        if (storyType == 2 || storyType == 3 || storyType == 4) {
            return true;
        }
        switch (storyType) {
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return true;
            default:
                zzyau.zzaa();
                return false;
        }
    }

    public final boolean zzUL(boolean z) throws Exception {
        if ((!(this.zzYeg.zzYTn() && z) && (!this.zzYeg.zzYTm() || z)) || !((zzYMM) this.zzYeg.zza9()).zzUL(z)) {
            return false;
        }
        if (z) {
            return this.zzYeg.zzYTn() && zzVE.zzT((zzYAU) this.zzYeg.zz6x()).zzZo6() != 10528;
        }
        return this.zzYeg.zzYTm();
    }

    public final int zzYPA() throws Exception {
        return (!zzUL(true) || ((zzYMM) this.zzYeg.zza9()).zzYoo()) ? zzYPB().zzYN3() : com.aspose.words.internal.zzSA.zzn(((zzZ37) ((zzYMM) this.zzYeg.zza9()).zzYTt()).zzYMV().zzwz(4).zzZSd());
    }

    public final zzZ3D zzYPB() throws Exception {
        return ((zzYMM) this.zzYeg.zza9()).zzYoi() ? zzZ3D.zzYaA : (zzUL(true) || !this.zzYeg.zzYTn() || zz9(this.zzYeg)) ? zzZ3D.zzYaA : ((zzZ37) ((zzYMM) this.zzYeg.zza9()).zzYTt()).zzYMV().zzwz(0);
    }

    public final zzZ3D zzYPC() throws Exception {
        return ((zzYMM) this.zzYeg.zza9()).zzYoi() ? zzZ3D.zzYaA : zzUL(false) ? ((zzZ37) ((zzYMM) ((zzYMM) this.zzYeg.zza9()).zzYTo()).zzYTt()).zzYMV().zzwz(4) : (!this.zzYeg.zzYQ3() || zz9(this.zzYeg)) ? zzZ3D.zzYaA : ((zzZ37) ((zzYMM) this.zzYeg.zza9()).zzYTt()).zzYMV().zzwz(3);
    }

    public final zzZ3D zzYPD() throws Exception {
        if (!((zzYMM) this.zzYeg.zza9()).zzYoi() && zzYPy()) {
            return ((zzZ37) ((zzYMM) this.zzYeg.zza9()).zzYTt()).zzYMV().zzwz(2);
        }
        return zzZ3D.zzYaA;
    }

    public final zzZ3D zzYPE() throws Exception {
        if (!((zzYMM) this.zzYeg.zza9()).zzYoi() && zzYPy()) {
            return ((zzZ37) ((zzYMM) this.zzYeg.zza9()).zzYTt()).zzYMV().zzwz(1);
        }
        return zzZ3D.zzYaA;
    }

    public final zzYCP zzYPF() throws Exception {
        boolean zIsEmpty = ((zzZ37) ((zzYMM) this.zzYeg.zza9()).zzYTt()).zzYMW().isEmpty();
        int height = this.zzYeg.getHeight();
        int i = (zzYPC().isVisible() || !zIsEmpty) ? this.zzYeg.zzYQj().zzYdA : 0;
        if (zzYPB().isVisible() || !zIsEmpty) {
            if (!zzUK(true)) {
                height -= this.zzYeg.zzYQj().zzYdu;
            }
            if (zz8(this.zzYeg)) {
                height = this.zzYeg.zzYQj().getHeight() - this.zzYeg.zzYQj().zzYdu;
            }
        }
        return new zzYCP(i, height);
    }

    public final com.aspose.words.internal.zzZQ5 zzYPG() throws Exception {
        int iZzYPz = zzYPz() - (zzYPE().zzYN3() + zzZ3D.zzYN2());
        int iZzYN3 = zzYPD().zzYN3() + zzZ3D.zzYN2() + this.zzYeg.getWidth();
        boolean zIsEmpty = ((zzZ37) ((zzYMM) this.zzYeg.zza9()).zzYTt()).zzYMW().isEmpty();
        int i = 0;
        int i2 = (zzUL(false) || (zIsEmpty && !zzYPC().isVisible())) ? 0 : this.zzYeg.zzYQj().zzYdA;
        int height = this.zzYeg.getHeight();
        if (!zzUL(true) && !zz8(this.zzYeg) && (!zIsEmpty || zzYPB().isVisible())) {
            i = this.zzYeg.zzYQj().zzYdu;
        }
        return com.aspose.words.internal.zzZQ5.zzT(iZzYPz, i2, iZzYN3, height - i);
    }

    public final com.aspose.words.internal.zzZQ5 zzYPH() throws Exception {
        int iZzYPz = zzYPz() - (com.aspose.words.internal.zzSA.zzn(zzYPE().zzZSd()) + zzZ3D.zzYN2());
        int iZzn = com.aspose.words.internal.zzSA.zzn(zzYPD().zzZSd()) + zzZ3D.zzYN2() + this.zzYeg.getWidth();
        int iZzn2 = zzUK(false) ? 0 : (this.zzYeg.zzYQj().zzYdA + this.zzYeg.zzYQj().zzYdz) - com.aspose.words.internal.zzSA.zzn(zzYPC().zzZSd());
        int height = this.zzYeg.getHeight();
        if (!zzUK(true) && !zz8(this.zzYeg)) {
            height = ((height - this.zzYeg.zzYQj().zzYdu) - this.zzYeg.zzYQj().zzYdv) + com.aspose.words.internal.zzSA.zzn(zzYPB().zzZSd());
        }
        return com.aspose.words.internal.zzZQ5.zzT(iZzYPz, iZzn2, iZzn, height);
    }
}
