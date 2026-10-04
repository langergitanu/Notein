package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
class zzYMM extends zzZ6T {
    private zzJR zzXGk;
    private boolean zzXGn;
    private boolean zzXGp;
    private zzZ55 zzXGq;
    private zzZ55 zzYft;
    private zzYAU zzYys;
    private zzYAU zzYyt;
    private int zzXGA = Integer.MIN_VALUE;
    private int zzXGz = Integer.MIN_VALUE;
    private int zzXGr = Integer.MIN_VALUE;
    private boolean zzXGo = false;
    private boolean zzXGm = false;
    private ArrayList<Integer> zzXGl = new ArrayList<>();

    private int zz1(int i, int i2, int i3) {
        return (this.zzXGq.zzYPO() * 2) + zzT9.zzK(i, 1, i2, i3);
    }

    private static boolean zzP(zzYMM zzymm) throws Exception {
        for (zzYAU zzyau = zzymm.zzYyt; zzyau != null; zzyau = (zzYAU) zzyau.zzYo1()) {
            if (!(zzyau instanceof zzYA3)) {
                return zzY9R.zzlw(zzyau.zzZo6());
            }
        }
        return false;
    }

    public static zzYMM zzR(zzZ6T zzz6t) {
        while (zzz6t != null && 32 != zzz6t.zz6y()) {
            zzz6t = ((zzTG) zzz6t).zzZXZ();
        }
        return (zzYMM) zzz6t;
    }

    private void zzYoc() throws Exception {
        zzYMQ zzymq = new zzYMQ(this);
        zzymq.zzYoO();
        this.zzXGA = com.aspose.words.internal.zzSA.zzYx(zzymq.getMinWidth());
        this.zzXGz = com.aspose.words.internal.zzSA.zzYx(zzymq.getMaxWidth());
        this.zzXGr = com.aspose.words.internal.zzSA.zzYx(zzymq.getHeight());
    }

    private int zzYod() throws Exception {
        for (zzYAU zzyau = this.zzYyt; zzyau != null && zzyau.zza9() == this; zzyau = (zzYAU) zzyau.zzYo1()) {
            if (zzyau.zzZo6() != 0 && zzyau.zzY7r() != 5121) {
                zzZ32 zzz32ZzY6N = zzyau.zzY6N();
                return zz1(zzz32ZzY6N.getSize(), zzz32ZzY6N.zzZ9q(), (zza7().getBalanceSingleByteDoubleByteWidth() ? 2 : 1) * zzz32ZzY6N.getSpacing());
            }
        }
        return com.aspose.words.internal.zzSA.zzYy(12);
    }

    private boolean zzYoj() throws Exception {
        zza9();
        if (zzYTp() != null || this.zzYys.zzZo6() != 21577 || ((zzZ37) zzYTt()).zzYLD()) {
            return false;
        }
        zzZ4N zzz4nZzYPe = this.zzYys.zzaa().zzY4s().zzYPe();
        zzz4nZzYPe.zzX(this.zzYys);
        zzYA5 zzya5 = null;
        ArrayList arrayList = null;
        while (zzz4nZzYPe.movePrevious()) {
            zzYAU zzyau = (zzYAU) zzz4nZzYPe.zzYPi();
            if (!(zzyau instanceof zzYAT)) {
                if (zzyau.zzZo6() == 21595 && zzyau.zza6() != null && zzyau.zza6().zza9() == this.zzYys.zza4()) {
                    return arrayList == null;
                }
                if (zzyau.zza9() != this && zzyau.zza9() != null) {
                    zzY9R.zzmO(zzyau.zzZo6());
                    return false;
                }
                if (zzyau instanceof zzYA5) {
                    if (zzya5 != null) {
                        return false;
                    }
                    zzya5 = (zzYA5) com.aspose.words.internal.zzZKW.zzZ(zzyau, zzYA5.class);
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (!zzya5.zzZj((zzYAU) it.next())) {
                                return false;
                            }
                        }
                    }
                    arrayList = null;
                } else {
                    if (!zzyau.zzY7w()) {
                        return false;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzYAU>) arrayList, zzyau);
                }
            }
        }
        return false;
    }

    private int zzYom() {
        return zz1(zza7().zzYMp(), zza7().zzYMn(), (zza7().getBalanceSingleByteDoubleByteWidth() ? 2 : 1) * zza7().zzYMo());
    }

    private int zzYon() throws Exception {
        zzZ35 zzz35 = (zzZ35) zzYTk().zzYTt();
        if (zzz35 == null || zza9().zz6y() != 2 || zzz35.zzYLd() != 1 || !((zzZ37) zzYTt()).zzYLY() || zza7().zzZYM()) {
            return 0;
        }
        int iZzYLc = zzz35.zzYLc();
        return zzX(this.zzXGq).getWidth() % ((int) ((((double) com.aspose.words.internal.zzSA.zzYy(iZzYLc)) / 4096.0d) + ((double) zza7().zzYMp())));
    }

    private zzTF zzZL(zzYAU zzyau) throws Exception {
        zzyau.zzY6S();
        zzYMD zzymdZzy = zzy(zzyau);
        zzYMD zzymdZzz = zzz(zzyau);
        if (zzymdZzy != null && !zzY9R.zzmW(((zzYAU) zzymdZzy).zzZo6())) {
            return zzymdZzy.zzZZJ();
        }
        if (zzymdZzz != null && zzY9R.zzmQ(zzyau.zzZo6())) {
            return zzymdZzz.zzZZJ();
        }
        if (zzymdZzy != null) {
            zzymdZzy = zzymdZzy.zzZZJ();
        }
        if (zzymdZzz != null) {
            zzymdZzz = zzymdZzz.zzZZJ();
        }
        zzZ55 zzz55 = new zzZ55();
        zzZ(zzymdZzy, zzymdZzz, zzz55, true);
        zzz55.zzZZJ();
        return zzz55;
    }

    public final int getMaxWidth() throws Exception {
        if (Integer.MIN_VALUE == this.zzXGz) {
            zzYoc();
        }
        return this.zzXGz;
    }

    public final int getMinWidth() throws Exception {
        if (Integer.MIN_VALUE == this.zzXGA) {
            zzYoc();
        }
        return this.zzXGA;
    }

    @Override // com.aspose.words.zzZ6T
    public final void merge() throws Exception {
        zza9();
        if (zzYTp() == null) {
            return;
        }
        zzYTp().zza9();
        zza9();
        if (zzYTp().zz6y() != 32) {
            return;
        }
        zzYAU zzyau = this.zzYys;
        if (zzyau == null || !zzY9R.zzmO(zzyau.zzZo6())) {
            zzYMM zzymm = (zzYMM) zzYTp();
            while (true) {
                zzZ55 zzz55 = zzymm.zzXGq;
                if (zzz55 == null) {
                    break;
                } else {
                    zzz55.remove();
                }
            }
            zzYAU zzyau2 = zzymm.zzYys;
            while (true) {
                zzyau2.zzZ(this);
                zzyau2.zzY((zzTF) null);
                if (zzyau2.zzYo0() == this.zzYys) {
                    break;
                } else {
                    zzyau2 = (zzYAU) zzyau2.zzYo0();
                }
            }
            this.zzYys = zzymm.zzYys;
            while (zzyau2 != null && this == zzyau2.zza9()) {
                ((zzZ55) zzX(zzyau2)).zzU(zzyau2);
                zzyau2 = (zzYAU) zzyau2.zzYo1();
            }
            zzZ37 zzz37 = (zzZ37) ((zzYMM) zzYTp()).zzYTt();
            zzYTp().remove();
            zzZ(zzz37);
        }
    }

    public final void zz2(zzZ55 zzz55) {
        this.zzYft = zzz55;
    }

    public final void zz3(zzZ55 zzz55) {
        this.zzXGq = zzz55;
    }

    public final void zz6b() {
        if (zza9() == null || 16 != zza9().zz6y()) {
            return;
        }
        zzWV zzwv = (zzWV) zza9();
        if (((zzYIC) zzwv.zza9()) == null || ((zzY6N) ((zzYIC) zzwv.zza9()).zza9()) == null || ((zzY6N) ((zzYIC) zzwv.zza9()).zza9()).zzXYa()) {
            return;
        }
        this.zzXGA = Integer.MIN_VALUE;
        this.zzXGz = Integer.MIN_VALUE;
        this.zzXGo = false;
        ((zzWV) zza9()).zz6b();
    }

    @Override // com.aspose.words.zzZ6T
    public final zzZ6T zz6u() throws Exception {
        zzYMM zzymm = new zzYMM();
        zzymm.zzZ((zzZ37) zzYTt());
        return zzymm;
    }

    @Override // com.aspose.words.zzZ6T
    public final zzYMD zz6w() {
        return this.zzYft;
    }

    @Override // com.aspose.words.zzZ6T
    public final zzYMD zz6x() {
        return this.zzXGq;
    }

    @Override // com.aspose.words.zzZ6T
    public final int zz6y() {
        return 32;
    }

    @Override // com.aspose.words.zzZ6T
    public final void zzB(zzYMD zzymd) throws Exception {
        int iZz60 = zzymd.zz60();
        if (iZz60 == 32) {
            super.zzB(zzymd);
            return;
        }
        if (iZz60 != 64) {
            return;
        }
        zzYAU zzyau = (zzYAU) zzymd;
        zzyau.zzZZJ();
        zzYAU zzyau2 = this.zzYyt;
        if (zzyau == zzyau2) {
            this.zzYyt = (((zzYAU) zzyau2.zzYo1()) == null || this != ((zzYAU) this.zzYyt.zzYo1()).zzY6S()) ? null : (zzYAU) this.zzYyt.zzYo1();
        }
        zzYAU zzyau3 = this.zzYys;
        if (zzyau == zzyau3) {
            this.zzYys = (((zzYAU) zzyau3.zzYo0()) == null || this != this.zzYys.zzYo0().zza9()) ? null : (zzYAU) this.zzYys.zzYo0();
        }
        if (((zzYAU) zzyau.zzYo0()) != null) {
            zzyau.zzYo0().zzu(zzyau.zzYo1());
        }
        if (((zzYAU) zzyau.zzYo1()) != null) {
            zzyau.zzYo1().zzt(zzyau.zzYo0());
        }
        zzyau.zzZ((zzZ6T) null);
        if (this.zzYyt == null) {
            remove();
        }
    }

    public final boolean zzRA(boolean z) throws Exception {
        if (z && this.zzXGm) {
            return this.zzXGn;
        }
        boolean zZzYoj = zzYoj();
        if (z) {
            this.zzXGn = zZzYoj;
            this.zzXGm = true;
        }
        return zZzYoj;
    }

    public final boolean zzUL(boolean z) throws Exception {
        zzZ6T zzz6tZzYTp = z ? zzYTp() : zzYTo();
        if (zzz6tZzYTp == null || zzz6tZzYTp.zz6y() != 32) {
            return false;
        }
        zzYMM zzymm = z ? this : (zzYMM) zzz6tZzYTp;
        zzYMM zzymm2 = z ? (zzYMM) zzz6tZzYTp : this;
        if (zzP(zzymm2)) {
            return false;
        }
        return zzZ(zzymm, zzymm2);
    }

    @Override // com.aspose.words.zzZ6T
    public final zzTF zzX(zzYMD zzymd) throws Exception {
        if (zzymd.zz60() == 64) {
            return zzZL((zzYAU) zzymd);
        }
        if (zzymd.zz60() == 32) {
            return zz1((zzZ55) zzymd);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.aspose.words.zzZ6T
    public final void zzY(zzYMD zzymd) {
        this.zzYft = (zzZ55) zzymd;
    }

    public final int zzYM4() throws Exception {
        int iZzYM6;
        if (((zzZ37) zzYTt()).zzYM5()) {
            iZzYM6 = (((zzZ37) zzYTt()).zzYM4() * zzYom()) / 100;
        } else {
            iZzYM6 = (((zzZ37) zzYTt()).zzYSg() ? ((zzZ37) zzYTt()).zzYM6() : ((zzZ37) zzYTt()).zzYM3()) + ((zzZ37) zzYTt()).zzYM4();
        }
        return iZzYM6 + zzYon();
    }

    public final int zzYM7() {
        if (((zzZ37) zzYTt()).zzYM8()) {
            return (((zzZ37) zzYTt()).zzYM7() * zzYom()) / 100;
        }
        int iZzYM7 = ((zzZ37) zzYTt()).zzYM7() + (((zzZ37) zzYTt()).zzYSg() ? ((zzZ37) zzYTt()).zzYM3() : ((zzZ37) zzYTt()).zzYM6());
        return (((zzZ37) zzYTt()).zzYM9() || ((zzZ37) zzYTt()).zzYMa() >= 0) ? iZzYM7 : iZzYM7 + ((zzZ37) zzYTt()).zzYMa();
    }

    public final int zzYMa() throws Exception {
        return ((zzZ37) zzYTt()).zzYM9() ? (((zzZ37) zzYTt()).zzYMa() * zzYod()) / 100 : ((zzZ37) zzYTt()).zzYMa();
    }

    public final zzZ55 zzYSj() {
        return this.zzYft;
    }

    @Override // com.aspose.words.zzZ6T
    public final boolean zzYTs() {
        return this.zzYyt == null && this.zzXGq == null;
    }

    public final boolean zzYoe() {
        return (!zza7().getAutoHyphenation() || ((zzZ37) zzYTt()).getSuppressAutoHyphens() || ((zzZ37) zzYTt()).zzYSg()) ? false : true;
    }

    public final zzJR zzYof() {
        if (this.zzXGk == null) {
            zzZ6R zzz6rZza8 = zzab().zza8();
            this.zzXGk = zzYBO.zzZ(zzz6rZza8.zzYSN() ? zzz6rZza8.getTextShaperFactory() : null);
        }
        return this.zzXGk;
    }

    public final int zzYog() {
        if (zza7().zzZYM()) {
            return (((zzZ37) zzYTt()).getAlignment() == 3 || ((zzZ37) zzYTt()).getAlignment() == 9) ? 1 : 0;
        }
        int iZzYMx = zza7().zzYMx();
        return (zza7().zzYMB() && (iZzYMx == 1 || iZzYMx == 2)) ? 2 : 0;
    }

    public final boolean zzYoh() throws Exception {
        for (zzYAU zzyau = this.zzYyt; zzyau != ((zzYAU) this.zzYys.zzYo1()); zzyau = (zzYAU) zzyau.zzYo1()) {
            if (!zzyau.zzY74() && !zzyau.zzYol()) {
                return false;
            }
        }
        return true;
    }

    public final boolean zzYoi() throws Exception {
        if (this.zzXGo) {
            return this.zzXGp;
        }
        boolean zZzYoh = zzYoh();
        this.zzXGp = zZzYoh;
        this.zzXGo = true;
        return zZzYoh;
    }

    public final boolean zzYok() throws Exception {
        return zzRA(false);
    }

    public final boolean zzYol() throws Exception {
        return zzRA(true);
    }

    public final boolean zzYoo() {
        zzZ6T zzz6tZzYTp = zzYTp();
        if (zzz6tZzYTp != null && zzz6tZzYTp.zz6y() == 32) {
            zzYMM zzymm = (zzYMM) zzz6tZzYTp;
            zzZ3D zzz3dZzwz = ((zzZ37) zzYTt()).zzYMV().zzwz(0);
            zzZ3D zzz3dZzwz2 = ((zzZ37) zzymm.zzYTt()).zzYMV().zzwz(0);
            zzZ3D zzz3dZzwz3 = ((zzZ37) zzYTt()).zzYMV().zzwz(4);
            zzZ3D zzz3dZzwz4 = ((zzZ37) zzymm.zzYTt()).zzYMV().zzwz(4);
            if (zzz3dZzwz.equals(zzz3dZzwz2) && zzz3dZzwz3.isVisible() && !zzz3dZzwz4.isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList<Integer> zzYop() throws Exception {
        zzab().zzZoE();
        return this.zzXGl;
    }

    public final int zzYoq() throws Exception {
        if (this.zzXGr == Integer.MIN_VALUE) {
            zzYoc();
        }
        return this.zzXGr;
    }

    public final zzYMM zzYor() {
        if (((zzYAU) this.zzYyt.zzYo0()) != null) {
            return ((zzYAU) this.zzYyt.zzYo0()).zzY6S();
        }
        return null;
    }

    public final zzZ55 zzYos() {
        return this.zzXGq;
    }

    @Override // com.aspose.words.zzZ6T
    public final void zzZ(zzYMD zzymd) {
        this.zzXGq = (zzZ55) zzymd;
    }

    public final zzYAU zzZ9r() {
        return this.zzYys;
    }

    public final zzYAU zzZ9s() {
        return this.zzYyt;
    }

    public final void zzZM(zzYAU zzyau) {
        this.zzYys = zzyau;
    }

    public final void zzZN(zzYAU zzyau) {
        this.zzYyt = zzyau;
    }

    public final boolean zzZXP() throws Exception {
        zzZ55 zzz55 = this.zzXGq;
        return zzz55 == this.zzYft && zzz55.zzZXP();
    }

    @Override // com.aspose.words.zzZ6T
    public final zzYAU zzZXV() {
        return this.zzYys;
    }

    @Override // com.aspose.words.zzZ6T
    public final void zzZY0() throws Exception {
        while (true) {
            zzZ55 zzz55 = this.zzXGq;
            if (zzz55 == null) {
                break;
            }
            while (((zzYAU) zzz55.zz6x()) != null) {
                zzz55.zzY(zzz55.zz6x(), true);
            }
        }
        for (zzYAU zzyau = this.zzYys; zzyau != null && ((zzZ55) zzyau.zzZZJ()) == null; zzyau = (zzYAU) zzyau.zzYo0()) {
            zzX(zzyau).zzU(zzyau);
            zzyau.zzZZJ();
        }
    }

    @Override // com.aspose.words.zzZ6T
    public final void zzZ(zzZ3E zzz3e) throws Exception {
        super.zzZ(zzz3e);
        zz6b();
    }

    private zzTF zz1(zzZ55 zzz55) throws Exception {
        zza9();
        zzz55.zza9();
        if (((zzZ55) zzz55.zzYo0()) != null) {
            ((zzZ55) zzz55.zzYo0()).zza9();
        }
        if (((zzZ55) zzz55.zzYo1()) != null) {
            ((zzZ55) zzz55.zzYo1()).zza9();
        }
        zzYMD zzymdZzy = zzy(zzz55);
        if (zzymdZzy != null) {
            return zzymdZzy.zzZZJ();
        }
        zzYMD zzymdZzz = zzz(zzz55);
        if (zzymdZzz != null) {
            return zzymdZzz.zzZZJ();
        }
        return zza9().zzX(zzz55);
    }

    private static boolean zzZ(zzYMM zzymm, zzYMM zzymm2) throws Exception {
        zzZ37 zzz37 = (zzZ37) zzymm.zzYTt();
        zzZ37 zzz372 = (zzZ37) zzymm2.zzYTt();
        if (zzymm2.zzYM7() == zzymm.zzYM7() && zzymm2.zzYM4() == zzymm.zzYM4()) {
            boolean z = true;
            for (int i = 0; i <= 3; i++) {
                z &= !zzz372.zzYMV().zzwz(i).isVisible();
                if (!zzz37.zzYMV().zzwz(i).equals(zzz372.zzYMV().zzwz(i))) {
                    return false;
                }
            }
            if ((!zzz37.zzYMV().zzwz(4).isVisible() || zzz372.zzYMV().zzwz(4).isVisible() || !z || !zzz372.zzYMW().isEmpty()) && zzz37.zzYLJ().getHorizontalAlignment() == zzz372.zzYLJ().getHorizontalAlignment() && zzz37.zzYLJ().zzYMf() == zzz372.zzYLJ().zzYMf() && zzz37.zzYLJ().getLeft() == zzz372.zzYLJ().getLeft() && zzz37.zzYLJ().getTop() == zzz372.zzYLJ().getTop() && zzz37.zzYLJ().getVerticalAlignment() == zzz372.zzYLJ().getVerticalAlignment() && zzz37.zzYLJ().zzYMd() == zzz372.zzYLJ().zzYMd()) {
                return true;
            }
        }
        return false;
    }
}
