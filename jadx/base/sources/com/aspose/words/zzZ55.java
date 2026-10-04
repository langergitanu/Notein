package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
class zzZ55 extends zzTC {
    private boolean zzYdb;
    private boolean zzYdc;
    private boolean zzYdd;
    private boolean zzYde;
    private boolean zzYdf;
    private zzYAU zzYdi;
    private zzYAU zzYdj;
    private zzZ56 zzYdk;
    private zzZ53 zzYdl;
    private boolean zzYdn;
    private int zzYdo;
    private int zzYdp;
    private zzTE zzZvu;
    private int zzYdm = Integer.MIN_VALUE;
    private int zztG = Integer.MIN_VALUE;
    private int zzYdh = Integer.MIN_VALUE;
    private int zzYdg = 0;

    private static boolean zzL(zzYAU zzyau, zzYAU zzyau2) throws Exception {
        while (zzyau != zzyau2 && zzyau != null) {
            if ((zzyau.zzY7b() || zzyau.zzY6A()) && !zzY9R.zzmW(zzyau.zzZo6())) {
                return true;
            }
            zzyau = (zzYAU) zzyau.zz5Z();
        }
        return false;
    }

    public static zzZ55 zzR(zzY6N zzy6n) throws Exception {
        zzZ6T zzz6tZzY = zzY((zzZ6T) zzy6n, true);
        boolean z = zzz6tZzY != null;
        if (!z && (zzz6tZzY = zzY((zzZ6T) zzy6n, false)) == null) {
            return null;
        }
        if (zzz6tZzY.zz6y() != 4) {
            return (zzZ55) (z ? zzz6tZzY.zz6w() : zzz6tZzY.zz6x());
        }
        zzY6N zzy6n2 = (zzY6N) zzz6tZzY;
        return zzb((z ? (zzWV) ((zzYIC) zzy6n2.zzZXY()).zzZXZ() : (zzWV) ((zzYIC) zzy6n2.zzZXZ()).zzZXZ()).zz6t().zzw(false, true));
    }

    private zzZ35 zzYPN() {
        zzUZ zzuz = (zzUZ) zzqh(2);
        if (zzuz == null) {
            return null;
        }
        return (zzZ35) ((zzZ2D) zzuz.zza9()).zzYTt();
    }

    private boolean zzYPP() {
        if (!isEmpty() && zz6x() == zz6w()) {
            return zz6x() instanceof zzYAS;
        }
        return false;
    }

    private boolean zzYQ8() {
        return (((zzYBL) zzZZJ()) == null || ((zzYBL) zzZZJ()).zzh(this) == zz5Y()) ? false : true;
    }

    private boolean zzYQp() throws Exception {
        if (super.zzac() && ((zzZ55) zzYo0()) != null && zzYo0().zzac()) {
            int y = getY() + this.zzYdo;
            int y2 = ((zzZ55) zzYo0()).getY() + ((zzZ55) zzYo0()).zzYdo;
            if (zzZZJ() == zzYo0().zzZZJ() && y == y2) {
                if (zz5T()) {
                    if (zzYo0().getX() >= getRight()) {
                        return true;
                    }
                } else if (zzYo0().getRight() <= getX()) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzZ55 zzYQs() {
        zzZ55 zzz55 = this;
        while (true) {
            zzYMD zzymdZz5Y = zzz55.zz5Y();
            if (zzymdZz5Y == null || zzymdZz5Y.zz60() != 32) {
                break;
            }
            zzZ55 zzz552 = (zzZ55) zzymdZz5Y;
            if (((zzYMM) zzz552.zza9()) != ((zzYMM) zza9())) {
                return zzz55;
            }
            zzz55 = zzz552;
        }
    }

    private boolean zzYQt() {
        return this.zzYdh != Integer.MIN_VALUE;
    }

    private int zzYQu() throws Exception {
        return zzYQt() ? this.zzYdh : zzYPK();
    }

    public static boolean zza(zzZ55 zzz55) throws Exception {
        zzY9X zzy9x = (zzY9X) com.aspose.words.internal.zzZKW.zzZ(zzz55.zzI(true, true), zzY9X.class);
        if (zzy9x != null && zzy9x.zzY4Y()) {
            zzYAU zzyauZzZ = (zzYAU) zzy9x.zzYo1();
            if (zzyauZzZ != null) {
                zzyauZzZ = zzVE.zzZ(zzyauZzZ, (zzYAU) zzz55.zz6w());
            }
            if ((zzyauZzZ == null || zzY9R.zzmW(zzyauZzZ.zzZo6())) && !zzZ(zzz55, zzYAH.class)) {
                return true;
            }
        }
        return false;
    }

    public static zzZ55 zzb(zzZ55 zzz55) throws Exception {
        if (zzz55 == null) {
            return null;
        }
        zzWV zzwv = (zzWV) com.aspose.words.internal.zzZKW.zzZ(zzz55.zzZZJ().zza9(), zzWV.class);
        if (zzwv == null) {
            return zzz55;
        }
        zzYIC zzyic = (zzYIC) zzwv.zza9();
        if (zzY39.zzO(zzyic)) {
            zzwv.zz69().zzYol();
            return zzz55;
        }
        zzwv.zz69().zzYol();
        zzYIC zzyic2 = (zzYIC) zzyic.zzYTo();
        if (zzyic2 == null) {
            return zzR((zzY6N) zzyic.zza9());
        }
        if (zzY39.zzO(zzyic2)) {
            return (zzZ55) ((zzTC) ((zzWV) zzyic2.zzZXZ()).zz6t().zz6w());
        }
        return null;
    }

    public static int zzc(zzZ55 zzz55) throws Exception {
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int width = 0;
        for (zzYAU zzyau = (zzYAU) zzz55.zz6x(); zzyau != null; zzyau = (zzYAU) zzyau.zz5Z()) {
            if (!zzY9R.zzmW(zzyau.zzZo6()) && !zzyau.zzY74()) {
                width = zzyau.zzY6p() ? width + zzyau.getWidth() : 0;
                iMin = Math.min(iMin, zzyau.getX());
                iMax = Math.max(iMax, zzyau.getRight());
            }
        }
        return iMin == Integer.MAX_VALUE ? ((zzYAU) zzz55.zz6w()).getWidth() : (iMax - width) - iMin;
    }

    public static void zzw(zzYMD zzymd) throws Exception {
        zzymd.zzZZJ();
        zzymd.zzYnY();
        zzymd.zz5Z().zzN(null);
    }

    public final int getBaseline() {
        return this.zzYdo;
    }

    @Override // com.aspose.words.zzYMD
    public final int getContentHeight() {
        return zzYQj().zzYdD + zzYQj().zzYdC;
    }

    public final int getLineNumber() throws Exception {
        if (this.zztG == Integer.MIN_VALUE) {
            zza9();
            ((zzYMM) zza9()).zzaa();
            ((zzYMM) zza9()).zzaa().zzY4r();
        }
        return this.zztG;
    }

    public final void setBaseline(int i) {
        this.zzYdo = i;
    }

    public final void setLineNumber(int i) {
        this.zztG = i;
    }

    @Override // com.aspose.words.zzYMD
    public final int zz0t() {
        return this.zzYdm;
    }

    @Override // com.aspose.words.zzYMD
    public final zzTE zz0v() {
        if (this.zzZvu == null) {
            this.zzZvu = new zzTE(this);
        }
        return this.zzZvu;
    }

    @Override // com.aspose.words.zzTF, com.aspose.words.zzYMD
    public final zzYMD zz5R() {
        zzZ55 zzz55 = (zzZ55) super.zz5R();
        zzz55.zzYdl = null;
        zzz55.zzYdk = null;
        zzz55.zzYdo = 0;
        zzz55.zzYdn = false;
        zzz55.zzYdd = false;
        zzz55.zzYdj = null;
        zzz55.zzYdi = null;
        return zzz55;
    }

    @Override // com.aspose.words.zzTF
    public final boolean zz5T() {
        return ((zzZ37) ((zzYMM) zza9()).zzYTt()).zzYSg();
    }

    @Override // com.aspose.words.zzYMD
    public final int zz60() {
        return 32;
    }

    public final zzYAU zzI(boolean z, boolean z2) throws Exception {
        for (zzYAU zzyau = (zzYAU) zz6x(); zzyau != null && zzyau.zza9() == zza9(); zzyau = (zzYAU) zzyau.zzYo1()) {
            if (z2 && zzyau.zzZZJ() != this) {
                return null;
            }
            if (zzyau.zzZo6() != 0 && (!z || !zzyau.zzY74())) {
                return zzyau;
            }
        }
        return null;
    }

    @Override // com.aspose.words.zzTF, com.aspose.words.zzYMD
    public final boolean zzNd(int i) throws Exception {
        if (zzZXR()) {
            return true;
        }
        if ((i & 1) != 0) {
            zzxD(0);
            if (super.zzac()) {
                zzZ55 zzz55ZzYQn = zzYQn();
                for (zzZ55 zzz55ZzYQo = zzYQo(); zzz55ZzYQo != zzz55ZzYQn; zzz55ZzYQo = (zzZ55) zzz55ZzYQo.zzYo1()) {
                    zzxD(0);
                    zzz55ZzYQo.zzYU(false);
                    zzz55ZzYQo.zzF(null);
                }
            }
        }
        return super.zzNd(i);
    }

    public final void zzUM(boolean z) {
        this.zzYdc = z;
    }

    public final void zzUN(boolean z) {
        this.zzYdf = z;
    }

    public final void zzUO(boolean z) {
        this.zzYdb = z;
    }

    public final void zzUP(boolean z) {
        this.zzYdd = true;
    }

    public final void zzUQ(boolean z) {
        this.zzYde = z;
    }

    public final void zzUR(boolean z) {
        this.zzYdn = z;
    }

    public final ArrayList<zzYAU> zzUS(boolean z) {
        ArrayList<zzYAU> arrayList = new ArrayList<>();
        if (z) {
            for (zzYAU zzyau = (zzYAU) zz6x(); zzyau != null && this == ((zzZ55) zzyau.zzZZJ()); zzyau = (zzYAU) zzyau.zzYo1()) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, zzyau);
            }
        } else {
            for (zzYAU zzyauZzYQl = zzYQl(); zzyauZzYQl != null && this == ((zzZ55) zzyauZzYQl.zzZZJ()); zzyauZzYQl = zzyauZzYQl.zzY6U()) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, zzyauZzYQl);
            }
            if (zz5T()) {
                Collections.reverse(arrayList);
            }
        }
        return arrayList;
    }

    @Override // com.aspose.words.zzTC
    public final boolean zzX(zzTF zztf) throws Exception {
        if (!super.zzX(zztf) || ((zzYMM) zza9()).zzYos().zzYQr() || zzYQa()) {
            return false;
        }
        return ((zzZ37) ((zzYMM) zza9()).zzYTt()).zzYLV();
    }

    @Override // com.aspose.words.zzTF
    public final void zzY(zzYMD zzymd, boolean z) throws Exception {
        zzYAU zzyau = (zzYAU) com.aspose.words.internal.zzZKW.zzZ(zzymd, zzYAU.class);
        if (zzYQ0()) {
            if (zzYQl() == zzyau) {
                this.zzYdj = zzyau.zzY6Q();
            }
            if (zzYQk() == zzyau) {
                this.zzYdi = zzyau.zzY6O();
            }
        }
        ((zzYMM) zza9()).zzYof().zzP(zzyau);
        super.zzY(zzymd, z);
    }

    public final boolean zzYPJ() throws Exception {
        if (zzYQp()) {
            return true;
        }
        return ((zzZ55) zzYo1()) != null && ((zzZ55) zzYo1()).zzYQp();
    }

    public final int zzYPK() throws Exception {
        zzZ55 zzz55ZzYQn = zzYQn();
        int y = zzz55ZzYQn.getY();
        while (zzz55ZzYQn.zzYQp()) {
            zzz55ZzYQn = (zzZ55) zzz55ZzYQn.zzYo0();
            y = Math.min(y, zzz55ZzYQn.getY());
        }
        return y;
    }

    public final int zzYPL() throws Exception {
        zzZ55 zzz55ZzYQn = zzYQn();
        int bottom = zzz55ZzYQn.getBottom();
        while (zzz55ZzYQn.zzYQp()) {
            zzz55ZzYQn = (zzZ55) zzz55ZzYQn.zzYo0();
            bottom = Math.max(bottom, zzz55ZzYQn.getBottom());
        }
        return bottom;
    }

    public final int zzYPM() throws Exception {
        zzZZJ();
        int bottom = getBottom();
        zzYAU zzyau = (zzYAU) zz6x();
        if (zzY5N.zzZO(this) != null) {
            zzZNL zzznlZzYF = zzYnW().zzYF(false);
            Ref<zzYAU> ref = new Ref<>(zzyau);
            zzY9X zzy9xZzY = zzY(ref);
            zzYAU zzyau2 = ref.get();
            while (zzy9xZzY != null) {
                zzZNO zzznoZzZu = zzZ39.zzwc(zzy9xZzY.zzY6M().zzYLJ().getWrapType()) ? zzznlZzYF != null ? zzznlZzYF.zzZu(zzy9xZzY) : null : zzZNH.zzN(zzy9xZzY);
                if (zzznoZzZu != null) {
                    zzXR zzxrZzZ8R = zzznoZzZu.zzZ8T() ? zzznoZzZu.zzZ8R() : zzznoZzZu.zzZ8L();
                    if (zzxrZzZ8R.getBottom() > bottom) {
                        bottom = zzxrZzZ8R.getBottom();
                    }
                }
                ref.set(zzyau2);
                zzy9xZzY = zzY(ref);
                zzyau2 = ref.get();
            }
        }
        return bottom;
    }

    public final int zzYPO() {
        zzZ35 zzz35ZzYPN = zzYPN();
        if (zzz35ZzYPN == null || zzz35ZzYPN.zzYLd() != 1) {
            return 0;
        }
        return com.aspose.words.internal.zzSA.zzm(((double) zzz35ZzYPN.zzYLc()) / 4096.0d);
    }

    public final boolean zzYPQ() throws Exception {
        if (getHeight() == 0 && !isEmpty()) {
            return zza8().zzYTc() || !zzYPP();
        }
        return false;
    }

    public final boolean zzYPR() {
        return this.zzYdc;
    }

    public final int zzYPS() {
        return this.zzYdp;
    }

    public final boolean zzYPT() {
        return this.zzYdf;
    }

    public final int zzYPU() {
        if (zza9() != null) {
            return ((zzYMM) zza9()).zzYog();
        }
        return 0;
    }

    public final boolean zzYPV() {
        return this.zzYdb;
    }

    public final boolean zzYPW() {
        return this.zzYdd;
    }

    public final int zzYPX() {
        return this.zzYdg;
    }

    public final int zzYPY() {
        zzUZ zzuz;
        if (zzZZJ() == null) {
            return 0;
        }
        if ((zzZZJ().zz60() == 16 && !((zzYMM) zza9()).zza7().getAdjustLineHeightInTable()) || !((zzZ37) ((zzYMM) zza9()).zzYTt()).getSnapToGrid() || (zzuz = (zzUZ) zzqh(2)) == null) {
            return 0;
        }
        zzZ35 zzz35 = (zzZ35) ((zzZ2D) zzuz.zza9()).zzYTt();
        int iZzYLd = zzz35.zzYLd();
        if ((iZzYLd == 1 || iZzYLd == 2) && zzz35.zzYPY() > 0) {
            return zzz35.zzYPY();
        }
        return 0;
    }

    public final zzZ55 zzYPZ() {
        zzZ55 zzz55 = this;
        while (zzz55 != null && !zzz55.zzYnY() && !zzz55.zzYTn()) {
            zzz55 = (zzZ55) zzz55.zzYo1();
        }
        return zzz55;
    }

    public final boolean zzYQ0() {
        return this.zzYdj != null || ((zzYAU) zz6x()).zzYQ0();
    }

    public final boolean zzYQ1() {
        zzZ3B zzz3b;
        return zzYQf() && (zzz3b = (zzZ3B) ((zzWV) ((zzWT) zzZZJ()).zza9()).zzYTt()) != null && zzz3b.getFitText() && zzz3b.getOrientation() == 0;
    }

    public final int zzYQ2() throws Exception {
        return zz5T() ? zzZZJ().zz5V() : zzZZJ().zz5X();
    }

    public final boolean zzYQ3() throws Exception {
        if (zzYQb()) {
            return false;
        }
        zzZ55 zzz55 = (zzZ55) zzYo0();
        while (zzz55 != null && zzz55.zzYQb()) {
            zzz55 = (zzZ55) zzz55.zzYo0();
        }
        return zzz55 == null;
    }

    public final boolean zzYQ4() throws Exception {
        zzYAU zzyauZzY;
        zzYAU zzyauZzYQc = zzYQc();
        return (zzyauZzYQc == null || (zzyauZzY = zzVE.zzY((zzYAU) zzyauZzYQc.zz5Y(), (zzYAU) zz6x())) == null || zzyauZzY.zzZo6() != 10528) ? false : true;
    }

    public final boolean zzYQ5() throws Exception {
        if (zzYQ9()) {
            return true;
        }
        if (zza7().zzZYM() && zzI(false, true).zzZo6() == 25604) {
            return false;
        }
        zzYAU zzyauZzI = zzI(true, true);
        int iZzZo6 = zzyauZzI.zzZo6();
        if (iZzZo6 != 10528) {
            if (iZzZo6 != 21779) {
                if (iZzZo6 != 21788) {
                    switch (iZzZo6) {
                        case 21857:
                        case 21858:
                        case 21859:
                        case 21860:
                        case 21861:
                            break;
                        default:
                            return false;
                    }
                }
            }
            return true;
        }
        if (zza7().zzYMK()) {
            return true;
        }
        zzYAU zzyauZzZ = zzVE.zzZ((zzYAU) zzyauZzI.zzYo1(), zzyauZzI.zzY6S().zzZ9r());
        return (zzyauZzZ == null || zzyauZzZ == zzyauZzI.zzY6S().zzZ9r()) ? false : true;
    }

    public final boolean zzYQ6() throws Exception {
        if (zzY9R.zzlw(zzI(true, true).zzZo6()) && zzZZJ().zz60() == 2) {
            zzTC zztcZzZXJ = zzZXJ();
            if (zztcZzZXJ == null) {
                return true;
            }
            if (!zzY0B.zzZ(zztcZzZXJ.zzZZJ(), this)) {
                return false;
            }
            if (zztcZzZXJ.zz60() != 32 || zza7().zzZYM()) {
                return true;
            }
            zzZNL zzznlZzYF = zztcZzZXJ.zzZ8m().zzYF(false);
            if ((zztcZzZXJ.getY() + zztcZzZXJ.getHeight()) - ((zzznlZzYF == null || zzznlZzYF.getCount() == 0) ? ((zzZ55) zztcZzZXJ).zzYQj().zzYdu : 0) <= zzZZJ().getHeight()) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzYQ7() throws Exception {
        isActive();
        zzYAU zzyauZzYQc = zzYQc();
        if (zzyauZzYQc == null) {
            return false;
        }
        int iZzZo6 = zzyauZzYQc.zzZo6();
        return iZzZo6 == 21586 || iZzZo6 == 21595;
    }

    public final boolean zzYQ9() throws Exception {
        if (zza9() == null || zzZZJ() == null || zz6x() == null || !zzYQa() || ((zzYAU) ((zzYAU) zz6x()).zzYo0()) == null || zza9().zzYTo() == null || ((zzYAU) ((zzYAU) zz6x()).zzYo0()).zzZo6() != 21537) {
            return false;
        }
        zzYCT zzyctZzYTk = zza9().zzYTk();
        if (!(zzyctZzYTk instanceof zzYVL) && !(zzyctZzYTk instanceof zzYVN) && !(zzyctZzYTk instanceof zzUI)) {
            zza9();
            return !zzYQ8();
        }
        return false;
    }

    public final boolean zzYQa() throws Exception {
        zzYAU zzyau = (zzYAU) zz6x();
        while (zzyau != null && !(zzyau instanceof zzYA5) && !(zzyau instanceof zzYAH) && !(zzyau instanceof zzYAQ) && zzyau.zzZo6() == 0) {
            zzyau = (zzYAU) zzyau.zz5Z();
        }
        return zzyau != null && zzY9R.zzmT(zzyau.zzZo6());
    }

    public final boolean zzYQb() throws Exception {
        zzYMD zzymdZz6x = zz6x();
        while (true) {
            zzYAU zzyau = (zzYAU) zzymdZz6x;
            if (zzyau == null) {
                return true;
            }
            int iZzZo6 = zzyau.zzZo6();
            if (iZzZo6 != 0) {
                if (iZzZo6 == 21779 || iZzZo6 == 21788) {
                    return true;
                }
                return zzyau.zzZo6() == 10528 && zzyau.zza7().zzZYM();
            }
            zzymdZz6x = zzyau.zzYo1();
        }
    }

    public final zzYAU zzYQc() throws Exception {
        for (zzYAU zzyau = (zzYAU) zz6w(); zzyau != null && zzyau.zza9() == zza9() && zzyau.zzZZJ() == this; zzyau = (zzYAU) zzyau.zzYo0()) {
            if (zzyau.zzZo6() != 0 && !zzyau.zzY74()) {
                return zzyau;
            }
        }
        return null;
    }

    public final zzZ55 zzYQd() {
        zza9();
        if (((zzYAU) ((zzYAU) zz6x()).zzYo0()) != null) {
            return (zzZ55) ((zzYAU) ((zzYAU) zz6x()).zzYo0()).zzZZJ();
        }
        return null;
    }

    public final zzZ55 zzYQe() {
        zza9();
        if (((zzYAU) ((zzYAU) zz6w()).zzYo1()) != null) {
            return (zzZ55) ((zzYAU) ((zzYAU) zz6w()).zzYo1()).zzZZJ();
        }
        return null;
    }

    public final boolean zzYQf() {
        zzZZJ();
        return zzZZJ().zz60() == 16;
    }

    public final boolean zzYQg() {
        return this.zzYde;
    }

    public final boolean zzYQh() {
        return this.zzYdn;
    }

    public final zzZ53 zzYQi() {
        if (this.zzYdl == null) {
            this.zzYdl = new zzZ53(this);
        }
        return this.zzYdl;
    }

    public final zzZ56 zzYQj() {
        if (this.zzYdk == null) {
            this.zzYdk = new zzZ56();
        }
        return this.zzYdk;
    }

    public final zzYAU zzYQk() {
        zzYAU zzyau = this.zzYdi;
        return zzyau == null ? (zzYAU) zz6w() : zzyau;
    }

    public final zzYAU zzYQl() {
        zzYAU zzyau = this.zzYdj;
        return zzyau == null ? (zzYAU) zz6x() : zzyau;
    }

    public final void zzYQm() throws Exception {
        zzZ55 zzz55ZzYQn = zzYQn();
        for (zzZ55 zzz55 = this; zzz55 != zzz55ZzYQn; zzz55 = (zzZ55) zzz55.zzYo1()) {
            zzz55.zzYU(false);
        }
        zzz55ZzYQn.zzYU(false);
    }

    public final zzZ55 zzYQn() throws Exception {
        zzZ55 zzz55 = this;
        while (((zzZ55) zzz55.zzYo1()) != null && ((zzZ55) zzz55.zzYo1()).zzYQp()) {
            zzz55 = (zzZ55) zzz55.zzYo1();
        }
        return zzz55;
    }

    public final zzZ55 zzYQo() throws Exception {
        zzZ55 zzz55 = this;
        while (zzz55.zzYQp()) {
            zzz55 = (zzZ55) zzz55.zzYo0();
        }
        return zzz55;
    }

    @Override // com.aspose.words.zzYMD
    public final boolean zzYQq() {
        return ((zzYAU) ((zzYAU) zz6w()).zzYo1()) == null;
    }

    @Override // com.aspose.words.zzYMD
    public final boolean zzYQr() {
        return ((zzYAU) ((zzYAU) zz6x()).zzYo0()) == null;
    }

    public final int zzYQv() throws Exception {
        zzZ55 zzz55ZzYQs = zzYQs();
        return zzz55ZzYQs.zzYQu() + (zzYPK() - zzz55ZzYQs.zzYPK());
    }

    @Override // com.aspose.words.zzTF, com.aspose.words.zzYS
    public final void zzYU(boolean z) {
        super.zzYU(z);
        if (z) {
            return;
        }
        this.zzYdg = 0;
    }

    @Override // com.aspose.words.zzYMD
    public final void zzZ(zzTE zzte) {
        this.zzZvu = zzte;
    }

    public final boolean zzZU(zzYAU zzyau) throws Exception {
        return zz5T() || zzL((zzYAU) zz6x(), zzyau);
    }

    public final void zzZV(zzYAU zzyau) {
        this.zzYdi = zzyau;
    }

    public final void zzZW(zzYAU zzyau) {
        this.zzYdj = zzyau;
    }

    @Override // com.aspose.words.zzTC
    public final zzZNO zzZXM() {
        zzZ55 zzz55ZzYos = this;
        while (!zzz55ZzYos.zzYTm()) {
            zzz55ZzYos = ((zzYMM) zzz55ZzYos.zza9()).zzYos();
        }
        return super.zzZXM();
    }

    @Override // com.aspose.words.zzTF, com.aspose.words.zzYS
    public final boolean zzac() {
        return super.zzac();
    }

    @Override // com.aspose.words.zzTF, com.aspose.words.zzYMD
    public final com.aspose.words.internal.zzZL zzbF() throws Exception {
        if (super.zzbF() == null) {
            if (21577 != zzI(true, true).zzZo6() || ((zzYAU) ((zzYAU) zz6x()).zzYo0()) == null || 21595 != ((zzZ55) ((zzYAU) ((zzYAU) zz6x()).zzYo0()).zzZZJ()).zzYQc().zzZo6()) {
                zzA zza = new zzA(this, ((zzYMM) zza9()).zza8().zzYTe().getSaveFormat() == 45);
                new zzZ6U(this, 0L).zzZ(zza);
                super.zzF(zza.zzbF());
            }
        }
        return super.zzbF();
    }

    public final void zzxD(int i) {
        this.zzYdp = Math.max(0, i);
    }

    public final void zzxE(int i) {
        if (i != 0) {
            zzYPU();
        }
        this.zzYdg = i;
    }

    @Override // com.aspose.words.zzYMD
    public final void zzxF(int i) {
        this.zzYdm = i;
    }

    public final void zzxG(int i) {
        this.zzYdh = i;
    }

    public final void zzZ(zzZ56 zzz56) {
        this.zzYdk = zzz56;
    }

    public static boolean zzZ(zzZ55 zzz55, Class cls) {
        for (zzYAU zzyau = (zzYAU) zzz55.zz6x(); zzyau != null; zzyau = (zzYAU) zzyau.zz5Z()) {
            if (cls == zzyau.getClass()) {
                return true;
            }
        }
        return false;
    }

    private zzY9X zzY(Ref<zzYAU> ref) throws Exception {
        zzY9X zzy9x = null;
        while (ref.get() != null && ref.get().zzZZJ() == this && zzy9x == null) {
            if (ref.get().zzY74()) {
                zzy9x = (zzY9X) ref.get();
            }
            ref.set((zzYAU) ref.get().zz5Z());
        }
        return zzy9x;
    }

    private static zzZ6T zzY(zzZ6T zzz6t, boolean z) throws Exception {
        zzYMM zzymm;
        do {
            zzz6t = z ? zzz6t.zzYTo() : zzz6t.zzYTp();
            zzymm = (zzYMM) com.aspose.words.internal.zzZKW.zzZ(zzz6t, zzYMM.class);
            if (zzymm == null) {
                break;
            }
        } while (zzymm.zzYoi());
        return zzz6t;
    }
}
