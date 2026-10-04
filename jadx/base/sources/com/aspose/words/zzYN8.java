package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
class zzYN8 extends zzTF {
    private ArrayList<zzY9X> zzXHo;
    private ArrayList<zzY9X> zzXHp;
    private ArrayList<zzY9X> zzXHq;
    private ArrayList<zzY9X> zzXHr;
    private zzZKY zzXHs;
    private zzZKY zzXHt;
    private zzZNL zzZA0;
    private zzZNL zzZA1;
    private zzY5N zzZA2;

    private void zzG(ArrayList<zzY9X> arrayList, ArrayList<zzY9X> arrayList2) throws Exception {
        zzYIA zzyia;
        if (isEmpty() || (zzyia = (zzYIA) com.aspose.words.internal.zzZKW.zzZ((zzTC) ((zzUZ) zz6x()).zz6x(), zzYIA.class)) == null || !zzyia.zzYjB()) {
            return;
        }
        for (zzYIC zzyic = (zzYIC) ((zzY6N) ((zzYIC) zzyia.zza9()).zza9()).zzZXZ(); zzyic != null && zzyic.zzBz(); zzyic = (zzYIC) zzyic.zzYTp()) {
            zzZ((zzYIA) zzyic.zz6x(), arrayList, arrayList2);
        }
    }

    public static boolean zzT(zzZKY zzzky) throws Exception {
        if (zzzky == null || !zzzky.zzZ4V()) {
            return false;
        }
        zzzky.getHeight();
        zzzky.getHeight();
        return !zzzky.zzZ4X();
    }

    private boolean zzYqc() {
        return (zzab() == null || zzab().zzZoR() == null || !zzab().zzZoR().zzO(this)) ? false : true;
    }

    private zzZ2D zzYqd() {
        zzZ2D zzz2d;
        zzZ6T zzz6tZza9 = zza9();
        while (true) {
            zzz2d = (zzZ2D) zzz6tZza9;
            if (zzz2d.zzYTo() == null) {
                break;
            }
            if (((zzZ35) zzz2d.zzYTt()).getRestartPageNumbering()) {
                if (((zzZ35) zzz2d.zzYTt()).getSectionStart() != 0 || zza8().getContinuousSectionPageNumberingRestart() != 1) {
                    if (!zzZ2D.zzZ((zzZ35) ((zzZ2D) zzz2d.zzYTo()).zzYTt(), (zzZ35) zzz2d.zzYTt())) {
                        break;
                    }
                } else {
                    zzTC zztcZzZXW = zzz2d.zzZXW();
                    if (zztcZzZXW == ((zzTC) ((zzUZ) zztcZzZXW.zzZ8m().zz6x()).zz6x())) {
                        return zzz2d;
                    }
                }
            }
            zzz6tZza9 = zzz2d.zzYTo();
        }
        return zzz2d;
    }

    private void zzYqe() {
        if (((zzUZ) zz6x()) == null || ((zzUZ) zz6x()).zza9() == zza9()) {
            return;
        }
        zzZ(((zzUZ) zz6x()).zza9());
        zzV((zzZKY) null);
        zzU((zzZKY) null);
    }

    private static void zzZP(zzYAU zzyau) throws Exception {
        zzZNO zzznoZzR = zzZNO.zzR(zzyau);
        if (zzznoZzR.zzZ8T()) {
            return;
        }
        zzznoZzR.zzZ8K();
    }

    public final int getIndex() {
        zzZ2C zzz2c = (zzZ2C) zzaa();
        if (zzz2c == null || !zzz2c.zzYIZ().zzZ4(this)) {
            return -1;
        }
        return zzz2c.zzYIZ().getIndex();
    }

    public final int getPageNumber() {
        if (zza9() == null || zzaa() == null) {
            return -1;
        }
        if (zzYqc() && zzab().zzZoR().zzYq3()) {
            return zzab().zzZoR().zzYq4();
        }
        zzYL5<zzYN8> zzyl5ZzYIZ = zzab().zzZp0().zzYIZ();
        zzyl5ZzYIZ.zzZ4(this);
        int index = zzyl5ZzYIZ.getIndex();
        zzZ2D zzz2dZzYqd = zzYqd();
        zzZ35 zzz35 = (zzZ35) zzz2dZzYqd.zzYTt();
        zzyl5ZzYIZ.zzZ4(zzz2dZzYqd.zzYJb());
        int index2 = zzyl5ZzYIZ.getIndex();
        int pageStartingNumber = zzz35.getRestartPageNumbering() ? zzz35.getPageStartingNumber() : 1;
        if (!com.aspose.words.internal.zzAN.zzZP(pageStartingNumber) ? zzz35.getSectionStart() == 4 : zzz35.getSectionStart() == 3) {
            pageStartingNumber++;
        }
        if (zzz2dZzYqd.zzYJb().isEmpty() || (zza7().zzYML() && ((zzZ2D) zzz2dZzYqd.zzYJb().zza9()) != zzz2dZzYqd && zzz2dZzYqd.zzYJb().getPageNumber() % 2 != pageStartingNumber % 2)) {
            pageStartingNumber--;
        }
        int i = (pageStartingNumber + index) - index2;
        if (zzYqc()) {
            zzab().zzZoR().zzqL(i);
        }
        return i;
    }

    public final int getPaperTray() {
        zzZ35 zzz35 = (zzZ35) ((zzZ2D) zza9()).zzYTt();
        return zzYTm() ? zzz35.getFirstPageTray() : zzz35.getOtherPagesTray();
    }

    public final zzZNL zz5N() {
        return zzYF(true);
    }

    public final zzY5N zz5O() {
        return zzYG(true);
    }

    @Override // com.aspose.words.zzTF
    public final int zz5V() throws Exception {
        return getWidth() - ((int) (((zzZ2D) zza9()).zzTs(zzYqk()) >> 32));
    }

    @Override // com.aspose.words.zzTF
    public final int zz5X() {
        return (int) ((zzZ2D) zza9()).zzTs(zzYqk());
    }

    @Override // com.aspose.words.zzYMD
    public final int zz60() {
        return 1;
    }

    @Override // com.aspose.words.zzTF, com.aspose.words.zzYMD
    public final void zzF(com.aspose.words.internal.zzZL zzzl) {
        super.zzF(zzzl);
    }

    @Override // com.aspose.words.zzTF, com.aspose.words.zzYMD
    public final boolean zzNd(int i) throws Exception {
        if (super.zzNd(i)) {
            return true;
        }
        if ((i & 1) == 0) {
            return false;
        }
        this.zzXHr = null;
        this.zzXHq = null;
        this.zzXHp = null;
        this.zzXHo = null;
        return false;
    }

    @Override // com.aspose.words.zzTF
    public final void zzU(zzYMD zzymd) throws Exception {
        zzymd.zza9();
        zzNd(3);
        zzymd.zzZZJ();
        zzUZ zzuz = (zzUZ) zzymd;
        zzuz.zzY((zzTF) this);
        if (((zzUZ) zz6x()) == null || zzuz.zz5Z() == ((zzUZ) zz6x())) {
            zzZ(zzuz);
        }
        if (((zzUZ) zz6w()) == null || zzuz.zz5Y() == ((zzUZ) zz6w())) {
            zzY((zzYMD) zzuz);
        }
        if (zzuz.zz0n()) {
            zzYqe();
            zzuz.zza9();
            if (((zzZ2D) zzuz.zza9()).zzYJ9() == zzuz) {
                ((zzZ2D) zzuz.zza9()).zzQ(this);
            }
            if (((zzZ2D) zzuz.zza9()).zzYJa() == null) {
                ((zzZ2D) zzuz.zza9()).zzP(this);
            }
        }
    }

    public final void zzV(zzZKY zzzky) {
        if (zzzky != null) {
            zzzky.zzY((zzTF) this);
        }
        this.zzXHt = zzzky;
    }

    @Override // com.aspose.words.zzTF
    public final void zzY(zzYMD zzymd, boolean z) throws Exception {
        zzymd.zzZZJ();
        zzNd(3);
        zzUZ zzuzZz0H = ((zzUZ) zzymd).zz0H();
        if (zzuzZz0H.zz0e()) {
            zzUZ zzuzZzYn = zzuzZz0H.zzYn(true);
            zzY44.zzn(zzuzZzYn);
            if (zzuzZzYn != null && ((zzYN8) zzuzZzYn.zzZZJ()) != this) {
                zzuzZzYn = null;
            }
            zzUZ zzuzZzYm = zzuzZz0H.zzYm(true);
            if (zzuzZzYm != null && ((zzYN8) zzuzZzYm.zzZZJ()) != this) {
                zzuzZzYm = null;
            }
            if (zzuzZz0H == zzYql()) {
                zzY((zzYMD) (zzuzZzYm != null ? zzuzZzYm.zz0a() : null));
            }
            if (zzuzZz0H == ((zzUZ) zz6x())) {
                zzZ(zzuzZzYn);
            }
            zzYqe();
            if (((zzZ2D) zzuzZz0H.zza9()).zzYJb() == this) {
                ((zzZ2D) zzuzZz0H.zza9()).zzQ((((zzYN8) zzYo1()) == null || ((zzZ2D) ((zzYN8) zzYo1()).zza9()) != ((zzZ2D) zzuzZz0H.zza9())) ? null : (zzYN8) zzYo1());
            }
            if (((zzZ2D) zzuzZz0H.zza9()).zzYJa() == this) {
                ((zzZ2D) zzuzZz0H.zza9()).zzP((((zzYN8) zzYo0()) == null || ((zzZ2D) zzuzZz0H.zza9()).zzYJb() == null) ? null : (zzYN8) zzYo0());
            }
            Iterator<zzUZ> it = zzuzZz0H.zz0c().iterator();
            while (it.hasNext()) {
                it.next().zzY((zzTF) null);
            }
            if (((zzUZ) zz6x()) == null) {
                remove();
            }
        }
    }

    public final zzZNL zzYE(boolean z) {
        if (this.zzZA0 == null && z) {
            this.zzZA0 = new zzZNL();
        }
        return this.zzZA0;
    }

    public final zzZNL zzYF(boolean z) {
        if (this.zzZA1 == null && z) {
            this.zzZA1 = new zzZNL();
        }
        return this.zzZA1;
    }

    public final zzY5N zzYG(boolean z) {
        if (!isActive()) {
            return null;
        }
        if (this.zzZA2 == null && z) {
            this.zzZA2 = new zzY5N(this);
        }
        return this.zzZA2;
    }

    @Override // com.aspose.words.zzYMD
    public final boolean zzYQq() {
        return ((zzYN8) zzYo1()) == null;
    }

    @Override // com.aspose.words.zzYMD
    public final boolean zzYQr() {
        return ((zzYN8) zzYo0()) == null;
    }

    public final void zzYqf() throws Exception {
        if (this.zzXHp == null || this.zzXHo == null) {
            this.zzXHp = new ArrayList<>();
            ArrayList<zzY9X> arrayList = new ArrayList<>();
            this.zzXHo = arrayList;
            zzZ(this, this.zzXHp, arrayList);
            zzG(this.zzXHp, this.zzXHo);
        }
    }

    public final void zzYqg() throws Exception {
        if (this.zzXHr == null || this.zzXHq == null) {
            this.zzXHr = new ArrayList<>();
            ArrayList<zzY9X> arrayList = new ArrayList<>();
            this.zzXHq = arrayList;
            zzZKY zzzky = this.zzXHt;
            if (zzzky != null) {
                zzZ(zzzky, this.zzXHr, arrayList);
            }
            zzZKY zzzky2 = this.zzXHs;
            if (zzzky2 != null) {
                zzZ(zzzky2, this.zzXHr, this.zzXHq);
            }
        }
    }

    public final long zzYqh() throws Exception {
        if (isEmpty() || ((zzTC) ((zzUZ) zz6x()).zz6x()).zz60() != 8) {
            return 0L;
        }
        zzYIA zzyia = (zzYIA) ((zzTC) ((zzUZ) zz6x()).zz6x());
        if (!zzyia.zzYjB()) {
            return 0L;
        }
        zzY6N zzy6n = (zzY6N) ((zzYIC) zzyia.zza9()).zza9();
        long jZzYqr = ((zzYIC) zzy6n.zzZXZ()).zz6x().zzYqr();
        long jZzYqr2 = zzyia.zzYqr();
        return com.aspose.words.internal.zzZPZ.zzZm(((int) jZzYqr2) - ((int) jZzYqr), (((int) (jZzYqr2 >> 32)) - zzy6n.zzXYi()) - ((int) (jZzYqr >> 32)));
    }

    public final boolean zzYqi() {
        if (((zzYN8) zzYo0()) == null || ((zzUZ) zz6x()) == null || !((zzUZ) zz6x()).zzYTm()) {
            return false;
        }
        ((zzUZ) zz6x()).zza9();
        zza9();
        boolean zZzYqk = zzYqk();
        int sectionStart = ((zzZ35) ((zzZ2D) zza9()).zzYTt()).getSectionStart();
        if (sectionStart != 3 ? sectionStart != 4 ? true : zZzYqk : !zZzYqk) {
            return zza7().zzYML() && ((zzZ35) ((zzZ2D) zza9()).zzYTt()).getRestartPageNumbering() && ((zzYN8) zzYo0()).zzYqk() == zZzYqk;
        }
        return true;
    }

    public final void zzYqj() {
        this.zzZA1 = null;
        this.zzZA0 = null;
    }

    public final boolean zzYqk() {
        return com.aspose.words.internal.zzAN.zzZP(getPageNumber());
    }

    public final zzUZ zzYql() {
        if (((zzUZ) zz6w()) == null) {
            return null;
        }
        return ((zzUZ) zz6w()).zz0H();
    }

    public final int zzYqm() {
        return ((zzZ35) ((zzZ2D) zza9()).zzYTt()).getPageHeight() - ((zzZ2D) zza9()).zzTq(zzYqk());
    }

    public final int zzYqn() throws Exception {
        int iZzYqm = zzYqm();
        return zzT(this.zzXHs) ? Math.min(iZzYqm, this.zzXHs.zzZ4T()) : iZzYqm;
    }

    public final int zzYqo() throws Exception {
        int iZzTr = ((zzZ2D) zza9()).zzTr(zzYqk());
        return zzT(this.zzXHt) ? Math.max(iZzTr, this.zzXHt.zzZ4U()) : iZzTr;
    }

    public final zzZKY zzYqp() {
        return this.zzXHs;
    }

    public final zzZKY zzYqq() {
        return this.zzXHt;
    }

    @Override // com.aspose.words.zzYMD
    public final long zzYqr() throws Exception {
        return zzYK();
    }

    @Override // com.aspose.words.zzTF
    public final void zzZ(zzYMD zzymd, zzTF zztf) throws Exception {
        zzUZ zzuz = (zzUZ) zzymd;
        if (!zzuz.zzYnZ()) {
            zzw(zzuz);
            return;
        }
        zzYN8 zzyn8 = new zzYN8();
        zza9().zzZ(this, zzYo1(), zzyn8, true);
        ArrayList<zzYMD> arrayListZzZ = zzZ((zzYMD) null, (zzYMD) null);
        for (int i = 0; i < arrayListZzZ.size(); i++) {
            ((zzUZ) arrayListZzZ.get(i)).zzY((zzTF) zzyn8);
        }
        for (int i2 = 0; i2 < arrayListZzZ.size(); i2++) {
            zzZ2D zzz2d = (zzZ2D) ((zzUZ) arrayListZzZ.get(i2)).zza9();
            if (zzz2d.zzYJa() == this) {
                zzz2d.zzP(zzyn8);
            }
            if (zzz2d != ((zzZ2D) zza9()) && zzz2d.zzYJb() == this) {
                zzz2d.zzQ(zzyn8);
            }
        }
        zzyn8.zzZ(arrayListZzZ.get(0));
        zzyn8.zzY((zzYMD) C21505OooO0Oo.OooO00o(1, arrayListZzZ));
        zzZ((zzYMD) null);
        zzY((zzYMD) null);
    }

    public final boolean zzZ3() {
        return ((zzZ35) ((zzZ2D) zza9()).zzYTt()).getOrientation() == 2;
    }

    public final void zzZ4P() throws Exception {
        setX(0);
        setY(zzYTm() ? 0 : zzYo0().getBottom());
        zzZ35 zzz35 = (zzZ35) ((zzZ2D) zza9()).zzYTt();
        setWidth(zzz35.getPageWidth());
        setHeight(zzz35.getPageHeight());
    }

    @Override // com.aspose.words.zzTF, com.aspose.words.zzYMD
    public final com.aspose.words.internal.zzZL zzbF() throws Exception {
        if (super.zzbF() == null) {
            com.aspose.words.internal.zzZH zzzh = new com.aspose.words.internal.zzZH(com.aspose.words.internal.zzSA.zzE(getSize()), getPaperTray(), zzZ3());
            ArrayList arrayList = new ArrayList();
            zzZKY zzzky = this.zzXHt;
            if (zzzky != null) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzZL>) arrayList, zzzky.zzbF());
            }
            zzZKY zzzky2 = this.zzXHs;
            if (zzzky2 != null) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzZL>) arrayList, zzzky2.zzbF());
            }
            zz5.zzZ((ArrayList<com.aspose.words.internal.zzZL>) arrayList, this);
            zzZ6O zzz6oZzZ = zz5.zzZ(this);
            if (zzz6oZzZ != null) {
                com.aspose.words.internal.zzG zzgZzZ = zz5.zzZ(zzz6oZzZ);
                if (zzz6oZzZ.zzYSw()) {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzG>) arrayList, zzgZzZ);
                } else {
                    arrayList.add(0, zzgZzZ);
                }
            }
            zzzh.zzZ(arrayList);
            super.zzF(zzzh);
        }
        return super.zzbF();
    }

    public final void zzw(zzUZ zzuz) throws Exception {
        zza9();
        zzUZ zzuzZz0H = zzuz.zz0H();
        zzUZ zzuzZzYn = zzuzZz0H.zzYn(true);
        zzuzZzYn.zzZZJ();
        zzY((zzYMD) zzuzZz0H.zz0a());
        zzYN8 zzyn8 = new zzYN8();
        ArrayList<zzYMD> arrayListZzZ = zzZ(zzuzZzYn, (zzYMD) null);
        for (int i = 0; i < arrayListZzZ.size(); i++) {
            zzUZ zzuz2 = (zzUZ) arrayListZzZ.get(i);
            zzuz2.zzNd(3);
            zzuz2.zzY((zzTF) zzyn8);
        }
        zzyn8.zzZ(arrayListZzZ.get(0));
        zzyn8.zzY((zzYMD) C21505OooO0Oo.OooO00o(1, arrayListZzZ));
        zzyn8.zzZ((zzZ2D) ((zzUZ) zzyn8.zz6x()).zza9());
        for (int i2 = 0; i2 < arrayListZzZ.size(); i2++) {
            zzUZ zzuz3 = (zzUZ) arrayListZzZ.get(i2);
            if (zzuz3.zz0n()) {
                ((zzZ2D) zzuz3.zza9()).zzQ((zzYN8) ((zzZ2D) zzuz3.zza9()).zzYJ9().zzZZJ());
                ((zzZ2D) zzuz3.zza9()).zzP((zzYN8) ((zzZ2D) zzuz3.zza9()).zzYJ8().zzZZJ());
                ((zzZ2D) zzuz3.zza9()).zzZoU();
            }
        }
        ((zzZ2D) ((zzUZ) zzyn8.zz6x()).zza9()).zzZ(this, null, zzyn8, true);
        zzyn8.zza9();
        ((zzUZ) zzyn8.zz6x()).zza9();
    }

    public final ArrayList<zzUZ> zzT(zzUZ zzuz, zzUZ zzuz2) {
        if (zzuz == null) {
            zzuz = (zzUZ) zz6x();
        }
        ArrayList<zzUZ> arrayList = new ArrayList<>();
        while (zzuz != null && this == ((zzYN8) zzuz.zzZZJ())) {
            com.aspose.words.internal.zzZQG.zzZ(arrayList, zzuz);
            if (zzuz == zzuz2) {
                break;
            }
            zzuz = zzuz.zzYn(true);
        }
        return arrayList;
    }

    private static void zzZ(zzTF zztf, ArrayList<zzY9X> arrayList, ArrayList<zzY9X> arrayList2) throws Exception {
        if (zztf == null) {
            return;
        }
        if (zztf.zz60() == 32) {
            for (zzYMD zzymdZz6x = zztf.zz6x(); zzymdZz6x != null; zzymdZz6x = zzymdZz6x.zz5Z()) {
                zzYAU zzyau = (zzYAU) zzymdZz6x;
                if (zzyau.zzY74()) {
                    zzZP(zzyau);
                    zzY9X zzy9x = (zzY9X) zzyau;
                    if (zzyau.zzY6M().getZOrder() >= 0) {
                        arrayList2.add(zzy9x);
                    } else {
                        arrayList.add(zzy9x);
                    }
                }
            }
            return;
        }
        for (zzYMD zzymdZz6x2 = zztf.zz6x(); zzymdZz6x2 != null; zzymdZz6x2 = zzymdZz6x2.zz5Z()) {
            zzTF zztfZzO = (zzTF) zzymdZz6x2;
            if (zzymdZz6x2.zz60() == 16) {
                zzWT zzwt = (zzWT) zzymdZz6x2;
                if (zzwt.zz5K()) {
                    zztfZzO = zzWK.zzO(zzwt);
                }
            }
            zzZ(zztfZzO, arrayList, arrayList2);
        }
    }

    public final void zzU(zzZKY zzzky) {
        if (zzzky != null) {
            zzzky.zzY((zzTF) this);
        }
        this.zzXHs = zzzky;
    }

    public final void zzZ(int i, int i2, zzZNL zzznl, zzZNL zzznl2) throws Exception {
        if (((zzUZ) zz6x()) == null || ((zzUZ) zz6x()).getX() == Integer.MIN_VALUE || ((zzUZ) zz6x()).getY() == Integer.MIN_VALUE) {
            return;
        }
        if (zzYqo() == i && zzYqn() == i2 && zzYF(true).zzZ(zzznl)) {
            zzYF(true).zzY(zzznl);
            zzYE(true).zzY(zzznl2);
            return;
        }
        zzYG(true).zzXVN();
        Iterator<zzZNO> it = zzznl.iterator();
        while (it.hasNext()) {
            zzYG(true).zzZ(it.next(), true, false);
        }
        zzYG(true).zzq(null);
        zzYG(true).zzXVU();
        for (zzYMD zzymdZz5Z = (zzUZ) zz6x(); zzymdZz5Z != null; zzymdZz5Z = zzymdZz5Z.zz5Z()) {
            zzymdZz5Z.zzNd(1);
        }
    }
}
