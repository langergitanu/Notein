package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYN6 extends zzY9A {
    private int zzXHf;
    private zzV1 zzXHg;
    private zzUY zzXHh;
    private zzYN8 zzYBS;

    public zzYN6(zzZ2C zzz2c) {
        super(zzz2c);
        this.zzXHh = new zzUY();
        this.zzXHg = new zzV1();
        this.zzXHf = Integer.MIN_VALUE;
    }

    public static boolean zzN(zzYN8 zzyn8) throws Exception {
        if (!zzyn8.zzYTm()) {
            return true;
        }
        if (zzyn8.isEmpty()) {
            zzYN8 zzyn82 = (zzYN8) zzyn8.zzYo1();
            if (zzyn82 == null) {
                return false;
            }
            boolean zZzYqi = zzyn82.zzYqi();
            if (zZzYqi) {
                zzyn8.zzYU(false);
            }
            return zZzYqi;
        }
        if (!zzyn8.zzYqi()) {
            return true;
        }
        if (!zzyn8.isEmpty()) {
            ((zzUZ) zzyn8.zz6x()).zzN(null);
        }
        zzyn8.zzV((zzZKY) null);
        zzyn8.zzU((zzZKY) null);
        zzyn8.toString();
        zzyn8.zzYU(true);
        return false;
    }

    private static zzUZ zzP(zzUZ zzuz, zzUZ zzuz2) {
        if (((zzYN8) zzuz.zzZZJ()) != ((zzYN8) zzuz2.zzZZJ())) {
            zzuz2 = zzr(zzuz);
        }
        int columnsCount = ((zzZ35) ((zzZ2D) zzuz.zza9()).zzYTt()).getColumnsCount();
        zzuz2.zza9();
        int columnIndex = zzuz.getColumnIndex();
        zzUZ zzuz3 = null;
        int i = 0;
        while (i < columnsCount) {
            zzuz2.zzYl(i < columnIndex);
            if (i == columnIndex) {
                zzuz3 = zzuz2;
            }
            zzuz2 = (zzUZ) zzuz2.zzYo1();
            i++;
        }
        return zzuz3;
    }

    private static void zzQ(zzUZ zzuz, zzUZ zzuz2) throws Exception {
        if (zzuz == null) {
            return;
        }
        zzt(zzP(zzuz, zzuz2));
    }

    private static boolean zzR(zzUZ zzuz, zzUZ zzuz2) throws Exception {
        zzUZ zzuz3;
        zzZ2D zzz2d = (zzZ2D) zzuz.zza9();
        zzZ2D zzz2d2 = (zzZ2D) zzuz2.zza9();
        if (((zzZ2D) zzz2d.zzYTp()) != zzz2d2 || zzz2d2 == null || ((zzZ35) zzz2d2.zzYTt()).getSectionStart() != 1 || !zzz2d2.zzYJ4()) {
            return false;
        }
        zzUZ zzuz4 = null;
        while (zzuz != null) {
            if (!zzuz.zz03() && !zzuz.isEmpty()) {
                zzuz4 = zzuz;
            }
            zzuz = (zzUZ) zzuz.zzYo1();
        }
        if (zzuz4 == null || (zzuz3 = (zzUZ) zzuz4.zzYo1()) == null) {
            return false;
        }
        zzQ(zzuz3, zzz2d2.zzYJ9());
        return true;
    }

    private static void zzS(zzUZ zzuz, zzUZ zzuz2) throws Exception {
        if (zzuz.zza7().zzZYM() || zzZ3A.zzS(zzuz.zza9())) {
            if (zzuz.zza7().zzZYM() || ((zzZ35) ((zzZ2D) zzuz.zza9()).zzYTt()).zzYLl() != 2) {
                if (!zzuz.zza7().zzZYM() || ((zzZ35) ((zzZ2D) zzuz.zza9()).zzYTt()).getColumnsCount() <= 1) {
                    zzuz.zza9();
                    zzuz2.zza9();
                    int height = zzuz.zz09().getHeight();
                    ((zzYVQ) zzuz.zz09().zz6x()).zzN(zzuz2.zzab().zzZoZ().zzY(zzuz2, true));
                    zzuz.setHeight(zzuz.getHeight() - height);
                    zzuz.zzYU(true);
                }
            }
        }
    }

    private static void zzU(zzUZ zzuz, int i) throws Exception {
        zzUZ zzuzZzYn = zzuz.zzYn(true);
        if (zzuzZzYn == null) {
            return;
        }
        if (zzuzZzYn.zza9() == zzuz.zza9()) {
            zzuzZzYn.zzZZJ();
            zzuz.zzZZJ();
            return;
        }
        if (zzR(zzuz, zzuzZzYn)) {
            return;
        }
        boolean zZzO = zzO(zzuz, zzuzZzYn);
        if (zZzO && zzuzZzYn.zzZZJ() != zzuz.zzZZJ()) {
            zzUZ zzuzZzr = zzr(zzuz);
            zzYMD zzymdZzM = zzYJP.zzM(zzuzZzYn);
            if (zzymdZzM != null) {
                zzymdZzM.zzO(zzuzZzr);
            }
        } else if (zZzO || zzuzZzYn.zzZZJ() != zzuz.zzZZJ()) {
            zzY44.zzZ(zzuz, zzuzZzYn, i);
        } else {
            ((zzYN8) zzuzZzYn.zzZZJ()).zzw(zzuz);
        }
        if (!zZzO || zzuz.zz09() == null) {
            return;
        }
        zzS(zzuz, zzuzZzYn);
    }

    private static void zzY(zzTF zztf, zzTF zztf2) {
        if (zztf == null || zztf2 == null || zztf == zztf2) {
            return;
        }
        zzYMD zzymdZz6x = zztf.zz6x();
        zzYMD zzymdZz6w = zztf.zz6w();
        zzYMD zzymdZz6x2 = zztf2.zz6x();
        if (zzymdZz6x2 != null && zzymdZz6w != null) {
            ((zzTC) zzymdZz6w).zzZXK();
        }
        zzYMD zzymd = zzymdZz6x;
        while (zzymd != null) {
            zzYMD zzymdZz5Z = zzymd.zz5Z();
            zzymd.zzY(zztf2);
            zzymd = zzymdZz5Z;
        }
        if (zztf2.zz6w() == null) {
            zztf2.zzY(zzymdZz6w);
        }
        if (zztf.zz6x() != null) {
            zztf2.zzZ(zzymdZz6x);
        }
        if (zzymdZz6x2 != null && zzymdZz6w != null) {
            ((zzTC) zzymdZz6w).zzZXK();
        }
        zztf.zzZ((zzYMD) null);
        zztf.zzY((zzYMD) null);
    }

    private void zzYq2() throws Exception {
        zzUZ zzuzZzYn = null;
        do {
            if (zzuzZzYn != null && !zzuzZzYn.isActive()) {
                return;
            }
            zzuzZzYn = zzuzZzYn == null ? (zzUZ) this.zzYBS.zz6x() : zzuzZzYn.zzYn(true);
            if (zzuzZzYn == null || zzuzZzYn.zzZZJ() != this.zzYBS) {
                return;
            }
            if (zzv(zzuzZzYn) || !zzuzZzYn.isActive()) {
                zzuzZzYn.isActive();
                zzuzZzYn = null;
            }
        } while (this.zzYBS.isActive());
    }

    private static zzYAU zzZO(zzYAU zzyau) {
        zzYAU zzyau2 = (zzYAU) zzyau.zzYo0();
        while (zzyau2 != null && (zzyau2 instanceof zzYAT)) {
            zzyau2 = (zzYAU) zzyau2.zzYo0();
        }
        return zzyau2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static zzUZ zzr(zzUZ zzuz) {
        zzuz.zza9();
        zzuz.zza9();
        zzuz.zza9();
        zzuz.zz0l();
        zzuz.zz0g();
        zzZ2D zzz2d = (zzZ2D) ((zzZ2D) zzuz.zza9()).zzYTp();
        zzUZ[] zzuzArrZz05 = zzz2d.zzYJ9().zz05();
        for (int i = 0; i < zzuzArrZz05.length; i++) {
            zzuzArrZz05[i].zzZ((zzZ6T) zzz2d);
            zzuzArrZz05[i].zzY((zzYN8) zzuz.zzZZJ());
            if (i > 0) {
                zzuzArrZz05[i].zzt(zzuzArrZz05[i - 1]);
            }
            if (i < zzuzArrZz05.length - 1) {
                zzuzArrZz05[i].zzu(zzuzArrZz05[i + 1]);
            }
        }
        zzuzArrZz05[zzuzArrZz05.length - 1].zzu(zzz2d.zzYJ9());
        zzz2d.zzYJ9().zzt(zzuzArrZz05[zzuzArrZz05.length - 1]);
        ((zzYN8) zzuz.zzZZJ()).zzY(zzuzArrZz05[zzuzArrZz05.length - 1]);
        zzz2d.zzE(zzuzArrZz05[0]);
        zzz2d.zzQ((zzYN8) zzuzArrZz05[0].zzZZJ());
        return zzuzArrZz05[0];
    }

    private static boolean zzs(zzUZ zzuz) throws Exception {
        zzYAU zzyauZzZO;
        if (!(zzuz.zz6w() instanceof zzZ55)) {
            return false;
        }
        zzYAU zzyauZzYQc = ((zzZ55) zzuz.zz6w()).zzYQc();
        if (!zzY9R.zzmT(zzyauZzYQc.zzZo6()) || (zzyauZzZO = zzZO(zzyauZzYQc)) == null) {
            return false;
        }
        if (zzyauZzZO.zzZo6() == 10528) {
            zzyauZzZO.zza9();
            zzyauZzYQc.zza9();
            return true;
        }
        if (!zzY9R.zzmR(zzyauZzZO.zzZo6())) {
            return false;
        }
        zzyauZzZO.zza9();
        zzyauZzYQc.zza9();
        zzYAU zzyauZzZO2 = zzZO(zzyauZzZO);
        return zzyauZzZO2 != null && zzyauZzZO2.zzZo6() == 10528;
    }

    private static void zzt(zzUZ zzuz) throws Exception {
        for (zzUZ zzuz2 = (zzUZ) zzuz.zzYo0(); zzuz2 != null; zzuz2 = (zzUZ) zzuz2.zzYo0()) {
            zzY(zzuz2, zzuz);
        }
        zzuz.zzNd(5);
    }

    private boolean zzu(zzUZ zzuz) throws Exception {
        zzuz.zz0q();
        int height = zzuz.getHeight();
        for (zzUZ zzuz2 = zzuz; zzuz2 != null && zzuz2.zz0H() == zzuz; zzuz2 = (zzUZ) zzuz2.zzYo1()) {
            boolean z = zzuz2.isEmpty() && zzuz2.zz09() == null && zzuz2.zz08() == null;
            if (zzuz2.zz03() || (zzuz2.zzY8m() && z)) {
                zzuz2.zzYU(true);
            } else {
                if (this.zzXHh.zzX(zzuz2, height)) {
                    return true;
                }
                if (!zzuz2.isActive()) {
                    return false;
                }
                zzuz2.zzZZJ().isActive();
            }
        }
        zzuz.isActive();
        if (this.zzXHg.zz0H() == null && zzV1.zzX(zzuz)) {
            this.zzXHg.zzY(zzuz);
            if (zzuz.isActive()) {
                zzuz.zzZZJ();
            }
        }
        zzU(zzuz, height);
        return false;
    }

    private boolean zzv(zzUZ zzuz) throws Exception {
        if (zzuz != null) {
            zzuz.isActive();
        }
        if (zzuz.zz0b()) {
            return zzu(zzuz);
        }
        return false;
    }

    @Override // com.aspose.words.zzY9A
    public final void zzJ(zzYMD zzymd) throws Exception {
        zzYN8 zzyn8 = (zzYN8) zzymd;
        if (zzyn8 != null) {
            zzyn8.zza9();
        }
        if (zzyn8.zzac()) {
            return;
        }
        zzYMD.zzr(zzyn8);
        this.zzXHf = Integer.MIN_VALUE;
        this.zzYBS = zzyn8;
        zzyn8.zzZ4P();
        if (zzN(this.zzYBS)) {
            zzZKV.zzT(this.zzYBS);
            zzYq2();
            if (this.zzYBS.zzYG(false) != null && this.zzYBS.zz5O().zzXVW()) {
                zzYq2();
            }
            if (this.zzYBS.isActive()) {
                zzY3B.zzJ(this.zzYBS);
                this.zzYBS.zzYU(true);
            }
        }
        this.zzYBS.getIndex();
        zzYMD.zzq(zzyn8);
    }

    public final boolean zzO(zzYN8 zzyn8) {
        zzYN8 zzyn82 = this.zzYBS;
        return zzyn82 != null && com.aspose.words.internal.zzZKO.zzA(zzyn8, zzyn82);
    }

    public final boolean zzYq3() {
        return this.zzXHf != Integer.MIN_VALUE;
    }

    public final int zzYq4() {
        return this.zzXHf;
    }

    public final zzUZ zzYq5() {
        return this.zzXHg.zz0H();
    }

    public final void zzqL(int i) {
        this.zzXHf = i;
    }

    private static boolean zzO(zzUZ zzuz, zzUZ zzuz2) throws Exception {
        if (!((zzZ2D) zzuz2.zza9()).zzYJ4() || zzuz.zz0j()) {
            return false;
        }
        for (zzUZ zzuz3 = zzuz; zzuz3 != null && zzuz3.zz0H() == zzuz; zzuz3 = (zzUZ) zzuz3.zzYo1()) {
            if (zzs(zzuz3)) {
                return false;
            }
        }
        int iZzYqn = ((zzYN8) zzuz.zzZZJ()).zzYqn() - zzuz.getBottom();
        if (iZzYqn < 0) {
            return false;
        }
        zzTC zztcZz02 = zzuz2.zz02();
        if (zztcZz02 != null && ((zzYBL) zztcZz02.zzZZJ()).zzac()) {
            return (32 == zztcZz02.zz60() ? zztcZz02.zz0t() : ((zzYIA) zztcZz02).zz56()) <= iZzYqn;
        }
        return true;
    }
}
