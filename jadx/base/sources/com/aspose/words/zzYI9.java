package com.aspose.words;

import com.aspose.words.ref.Ref;

/* JADX INFO: loaded from: classes6.dex */
final class zzYI9 {
    private com.aspose.words.internal.zzZQ5 zzXwX;
    private zzYIA zzXwY;
    private int zzXwZ;
    private boolean zzXx0;

    private zzYI9(zzYIA zzyia) {
        this.zzXwY = zzyia;
    }

    public static void zzA(zzYIA zzyia) throws Exception {
        for (zzWT zzwt = (zzWT) zzyia.zz6x(); zzwt != null; zzwt = (zzWT) zzwt.zz5Z()) {
            zzWK.zzQ(zzwt);
        }
        zzyia.zzYTn();
    }

    public static zzYI9 zzB(zzYIA zzyia) throws Exception {
        zzYI9 zzyi9 = new zzYI9(zzyia);
        zzyi9.zzZoN();
        return zzyi9;
    }

    private static boolean zzG(zzWT zzwt) throws Exception {
        boolean zZzY57 = false;
        if (!zzwt.zza7().zzYMC()) {
            return false;
        }
        for (zzYMD zzymdZz5Z = (zzTC) zzwt.zz6x(); zzymdZz5Z != null && !zZzY57; zzymdZz5Z = zzymdZz5Z.zz5Z()) {
            if (zzymdZz5Z.zz60() == 32) {
                for (zzYAU zzyau = (zzYAU) ((zzZ55) zzymdZz5Z).zz6x(); zzyau != null; zzyau = (zzYAU) zzyau.zz5Z()) {
                    if (zzyau.zzZo6() == 25604) {
                        zzY9X zzy9x = (zzY9X) zzyau;
                        zZzY57 = zzy9x.zzY6M().zzYLJ().getWrapType() == 0 ? !zzy9x.zzY53().hasImage() : zzy9x.zzY57();
                        if (!zZzY57) {
                        }
                    }
                }
            }
        }
        return zZzY57;
    }

    private static void zzH(zzWT zzwt) throws Exception {
        if (zzwt.zzaa().getStoryType() == 4) {
            return;
        }
        Object[] objArr = new Object[3];
        zzZ(zzwt, objArr);
        boolean z = false;
        zzWT zzwt2 = (zzWT) objArr[0];
        if (zzwt2 == null || zzwt2.isEmpty() || zzG(zzwt2)) {
            return;
        }
        int iIntValue = ((Integer) objArr[1]).intValue();
        int iIntValue2 = ((Integer) objArr[2]).intValue();
        if (zzwt2.zzZXQ() != 0) {
            return;
        }
        zzZ3B zzz3b = (zzZ3B) ((zzWV) zzwt.zza9()).zzYTt();
        boolean z2 = ((zzTC) zzwt2.zz6x()) != ((zzWV) zzwt2.zza9()).zzZXW();
        if (zzz3b.getVerticalAlignment() == 0 || z2) {
            zzwt2.zzZXQ();
            return;
        }
        if (((zzWV) zzwt.zza9()).zz6c()) {
            iIntValue2 = zzwt.getWidth();
        }
        int iMax = Math.max(0, iIntValue2 - iIntValue);
        if (!zzwt.zza7().zzZYM() && zzz3b.getVerticalAlignment() == 1) {
            z = true;
        }
        if (((zzWV) zzwt.zza9()).zz6c() && !z) {
            iMax -= zzwt.zz5X() + zzwt.zz5V();
        }
        if (zzz3b.getVerticalAlignment() == 1) {
            iMax /= 2;
        }
        if (((zzWV) zzwt.zza9()).zz6c() && z) {
            iMax -= zzz3b.getOrientation() == 3 ? zzwt.zz5X() : zzwt.zz5V();
        }
        zzwt2.zzMG(iMax);
    }

    public static zzYIA zzI(zzWT zzwt) {
        zzYMD zzymdZz5Z;
        zzYIA zzyia = (zzYIA) zzwt.zzZZJ();
        if (((zzWV) zzwt.zza9()).zz6n() == null) {
            return zzyia;
        }
        zzYIC zzyic = (zzYIC) ((zzWV) zzwt.zza9()).zz6k().zza9();
        while (((zzYIC) zzyia.zza9()) != zzyic && (zzymdZz5Z = zzyia.zz5Z()) != null && zzymdZz5Z.zz60() == 8) {
            zzyia = (zzYIA) zzymdZz5Z;
        }
        return zzyia;
    }

    private static void zzS(zzYIC zzyic) throws Exception {
        for (zzWV zzwv = (zzWV) zzyic.zzZXZ(); zzwv != null; zzwv = (zzWV) zzwv.zzYTp()) {
            zzwv.zz69().zzQF(zzyic.zzYol());
        }
        zzyic.zz69().zzQF(zzyic.zzYol());
    }

    private static boolean zzV(zzYIA zzyia, int i) throws Exception {
        int iZzw = zzw(zzyia);
        if (iZzw <= i) {
            return false;
        }
        zzyia.zzZZJ();
        zzY5N zzy5nZz5O = zzyia.zzZ8m().zz5O();
        zzy5nZz5O.zzXVN();
        while (i < iZzw) {
            zzy5nZz5O.zzZ(zzy5nZz5O.zzXVS().zzBz(i), false, true);
            i++;
        }
        return zzy5nZz5O.zzq(null) > 0;
    }

    public static void zzW(zzYIA zzyia, int i) throws Exception {
        zzWT zzwtZzO;
        int iZzYjV = i - zzyia.zzYjV();
        zzZ(zzyia, iZzYjV - zzyia.zzYjM(), true);
        zzyia.zzpb(iZzYjV);
        zzZNG zzzng = (zzZNG) com.aspose.words.internal.zzZKW.zzZ(zzyia.zzZXN(), zzZNG.class);
        if (zzzng != null) {
            zzzng.zz5S();
        }
        zzZ(zzyia, zzyia.getHeight() - zzyia.zzYjM(), false);
        if (zzyia.zza7().zzZYM()) {
            for (zzWT zzwt = (zzWT) zzyia.zz6x(); zzwt != null && !zzwt.isVirtual(); zzwt = (zzWT) zzwt.zz5Z()) {
                if (((zzWV) zzwt.zza9()).zz6m() != 0 && (zzwtZzO = zzWK.zzO(zzwt)) != null && ((zzWT) zzwtZzO.zzYo1()) != null) {
                    zzwtZzO.zzYj(true);
                    zzYMI.zzY(zzwtZzO, false);
                    zzwtZzO.zzYj(false);
                }
            }
        }
    }

    public static void zzX(zzYBL zzybl) throws Exception {
        if (zzybl.zz60() == 16) {
            zzWT zzwt = (zzWT) zzybl;
            if (zzwt.isSink()) {
                zzX(zzWK.zzO(zzwt));
            }
        }
        if (zzybl.isEmpty()) {
            return;
        }
        zzTC zztcZzy = (zzTC) zzybl.zz6x();
        while (zztcZzy != null) {
            if (zztcZzy.zz60() == 8) {
                zztcZzy = zzy((zzYIA) zztcZzy);
            }
            zztcZzy = (zzTC) zztcZzy.zz5Z();
        }
    }

    public static boolean zzY(zzTF zztf, boolean z) throws Exception {
        zzYIA zzyia;
        if (!zztf.isActive() || !zztf.zzab().zza7().zzZYM() || (zzyia = (zzYIA) com.aspose.words.internal.zzZKW.zzZ(zztf.zz6w(), zzYIA.class)) == null || !((zzYIC) zzyia.zza9()).zzBz() || (zzyia.zzYTn() && zzyia.zza9().zzYTn())) {
            return false;
        }
        zzYIA zzyiaZzYk3 = ((zzYIC) ((zzY6N) ((zzYIC) zzyia.zza9()).zza9()).zzZXZ()).zzYk3();
        if (zzyiaZzYk3.zzZZJ() == zzyia.zzZZJ() && (!zzyiaZzYk3.zzYnZ() || !z)) {
            zztf.zzV((zzYIC) zzyiaZzYk3.zza9());
            zzyiaZzYk3.zzZZJ();
            zzyiaZzYk3.zzN((zzTF) zztf.zzYo1());
            return true;
        }
        return false;
    }

    private static void zzZ(zzYIA zzyia, int i, boolean z) throws Exception {
        zzY(zzyia, i, z);
        zzX(zzyia, i, z);
    }

    private void zzZoN() throws Exception {
        int iZzYjq;
        zzYMD.zzr(this.zzXwY);
        zzra();
        zzA(this.zzXwY);
        this.zzXwY.zzYTn();
        zzYI7 zzyi7 = new zzYI7(this.zzXwY);
        int iZzw = zzw(this.zzXwY);
        do {
            for (zzWT zzwt = (zzWT) this.zzXwY.zz6x(); zzwt != null; zzwt = (zzWT) zzwt.zz5Z()) {
                zzWK.zzY(zzwt, false);
            }
            this.zzXwY.zzYU(true);
            this.zzXwY.zzYjQ();
            zzu(this.zzXwY);
            iZzYjq = zzyi7.zzYjq();
            if (iZzYjq == 1) {
                zzz(this.zzXwY);
            }
        } while (iZzYjq != 0);
        boolean zZzV = zzV(this.zzXwY, iZzw);
        this.zzXx0 = zZzV;
        this.zzXwZ = 1073741823;
        if (!zZzV) {
            com.aspose.words.internal.zzZQ5 zzzq5 = new com.aspose.words.internal.zzZQ5(this.zzXwY.getX(), this.zzXwY.getY(), this.zzXwY.getWidth(), this.zzXwY.getHeight());
            if (this.zzXwX.isEmpty() || !this.zzXwX.equals(zzzq5)) {
                zzY44.zzs(this.zzXwY);
            }
            if ((this.zzXwX.isEmpty() || this.zzXwX.getHeight() != this.zzXwY.getHeight()) && ((zzYIC) this.zzXwY.zza9()).zzBz()) {
                ((zzY6N) ((zzYIC) this.zzXwY.zza9()).zza9()).zzXYh();
            }
            this.zzXwZ = zzyi7.zzYjw();
        }
        zzYMD.zzq(this.zzXwY);
    }

    private void zzra() throws Exception {
        if (this.zzXwY.zzYTm()) {
            if (((zzYIC) this.zzXwY.zza9()).zzYTm()) {
                ((zzY6N) ((zzYIC) this.zzXwY.zza9()).zza9()).zzPH(false);
            }
            ((zzYIC) this.zzXwY.zza9()).zzYjX();
            zzS((zzYIC) this.zzXwY.zza9());
        }
        this.zzXwX = this.zzXwY.zzac() ? new com.aspose.words.internal.zzZQ5(this.zzXwY.getX(), this.zzXwY.getY(), this.zzXwY.getWidth(), this.zzXwY.getHeight()) : com.aspose.words.internal.zzZQ5.zz2U;
        zzYIA zzyia = this.zzXwY;
        zzyia.setWidth(zzYIB.zzW((zzYIC) zzyia.zza9()));
        zzYIA zzyia2 = this.zzXwY;
        zzyia2.setX(zzYIB.zzU(zzyia2));
        this.zzXwY.zzYzp();
    }

    private static void zzu(zzYIA zzyia) throws Exception {
        if (zzyia.zza9().zzYTn() && zzyia.zzYTn()) {
            zzY6N zzy6n = (zzY6N) ((zzYIC) zzyia.zza9()).zza9();
            if (zzy6n.zzY6a().zzYKv()) {
                for (zzYIC zzyic = (zzYIC) zzy6n.zzZXZ(); zzyic != null; zzyic = (zzYIC) zzyic.zzYTp()) {
                    for (zzWV zzwv = (zzWV) zzyic.zzZXZ(); zzwv != null && !zzwv.zzYTn(); zzwv = (zzWV) zzwv.zzYTp()) {
                        int iMax = 0;
                        for (zzWT zzwtZz6t = zzwv.zz6t(); zzwtZz6t != null; zzwtZz6t = (zzWT) zzwtZz6t.zzYo1()) {
                            zzY5N zzy5nZzYG = zzwtZz6t.zzYG(false);
                            if (zzy5nZzYG != null) {
                                iMax = Math.max(zzy5nZzYG.zzXVO(), iMax);
                            }
                        }
                        if (iMax > 0) {
                            int iZz6f = zzwv.zz6f();
                            zzwv.zzOB(iMax / 50);
                            if (iZz6f < zzwv.zz6f()) {
                                zzy6n.zzZ(zzy6n, new zzYZC(zzy6n, 1, zzy6n.zzaa().zzYDM()));
                            }
                        }
                    }
                }
            }
        }
    }

    private static void zzv(zzYIA zzyia) throws Exception {
        for (zzWT zzwt = (zzWT) zzyia.zz6x(); zzwt != null && !zzwt.zzYnY(); zzwt = (zzWT) zzwt.zz5Z()) {
            if (((zzYIA) zzwt.zzZZJ()).zzYTm()) {
                zzH(zzwt);
            }
            zzX(zzwt);
        }
    }

    private static int zzw(zzYIA zzyia) {
        zzY5N zzy5nZzYG;
        if (zzyia.zzZZJ().zz60() == 2 && (zzy5nZzYG = zzyia.zzZ8m().zzYG(false)) != null) {
            return zzy5nZzYG.zzXVS().getCount();
        }
        return 0;
    }

    private static void zzx(zzYIA zzyia) throws Exception {
        if (zzyia == ((zzYIC) zzyia.zza9()).zzYk3()) {
            for (zzWV zzwv = (zzWV) ((zzYIC) zzyia.zza9()).zzZXZ(); zzwv != null; zzwv = (zzWV) zzwv.zzYTp()) {
                if (zzwv.zz6c() && !zzwv.zzYTs() && zzwv.zz6o() == null) {
                    if (zzwv.zz6x() != zzwv.zz6w()) {
                        zzwv.zz6c();
                    }
                    zzWT zzwt = (zzWT) zzwv.zz6x();
                    zzwt.zzOz((zzWU.zzV(zzwt) - zzwt.zz5W()) - zzI(zzwt).zzYjI());
                    zzwt.setHeight(Integer.MIN_VALUE);
                }
            }
        }
        zzv(zzyia);
    }

    private static zzYIA zzy(zzYIA zzyia) throws Exception {
        zzYIA zzyia2 = null;
        for (zzYIA zzyiaZzYjT = zzyia.zzYjT(); zzyiaZzYjT != null; zzyiaZzYjT = zzyiaZzYjT.zzYjS()) {
            zzx(zzyiaZzYjT);
            zzyia2 = zzyiaZzYjT;
        }
        return zzyia2;
    }

    private static void zzz(zzYIA zzyia) throws Exception {
        zzyia.zzYjE();
        zzyia.setWidth(zzYIB.zzW((zzYIC) zzyia.zza9()));
    }

    public final int zzYjw() {
        return this.zzXwZ;
    }

    public final boolean zzYjx() {
        return this.zzXx0;
    }

    private static void zzZ(zzWT zzwt, Object[] objArr) throws Exception {
        int height;
        zzYIA zzyia = (zzYIA) zzwt.zzZZJ();
        if (((zzWV) zzwt.zza9()).zz6m() != 0) {
            if (((zzWV) zzwt.zza9()).zz6m() != 3 && !zzyia.zzYjG()) {
                objArr[0] = null;
                objArr[1] = 0;
                objArr[2] = 0;
                return;
            } else {
                Ref ref = new Ref(null);
                Ref ref2 = new Ref(null);
                zzWK.zzZ(zzwt, (Ref<zzWT>) ref, (Ref<zzWT>) ref2);
                zzwt = (zzWT) ref.get();
                zzWT zzwt2 = (zzWT) ref2.get();
                height = ((zzyia.getBottom() - ((zzYIA) zzwt2.zzZZJ()).getY()) - ((zzYIA) zzwt2.zzZZJ()).zzYjN()) - zzyia.zzYjL();
            }
        } else {
            height = (zzyia.getHeight() - zzyia.zzYjN()) - zzyia.zzYjL();
        }
        zzwt.getY();
        int iMax = Math.max(Math.max(zzwt.getContentHeight(), zzwt.zzM(new com.aspose.words.internal.zzZQ5(0, ((zzYIA) zzwt.zzZZJ()).zzYjN(), zzwt.getWidth(), height))), zzwt.zz5L());
        objArr[0] = zzwt;
        objArr[1] = Integer.valueOf(iMax);
        objArr[2] = Integer.valueOf(height);
    }

    private static void zzX(zzYIA zzyia, int i, boolean z) throws Exception {
        zzWT zzwtZzO;
        for (zzWT zzwt = (zzWT) zzyia.zz6x(); zzwt != null && !zzwt.isVirtual(); zzwt = (zzWT) zzwt.zz5Z()) {
            int iZz6m = ((zzWV) zzwt.zza9()).zz6m();
            int y = 0;
            if (z == (iZz6m == 0 || iZz6m == 3)) {
                if (((zzWV) zzwt.zza9()).zz6m() != 0) {
                    zzwtZzO = zzWK.zzO(zzwt);
                    y = zzyia.getY() - ((zzYIA) zzwtZzO.zzZZJ()).getY();
                } else {
                    zzwtZzO = zzwt;
                }
                zzTC zztc = (zzTC) zzwtZzO.zz6w();
                if (zztc != null && zztc.zz60() == 8) {
                    zzW((zzYIA) zztc, y + i);
                }
            }
        }
    }

    private static void zzY(zzYIA zzyia, int i, boolean z) throws Exception {
        zzYIA zzyia2 = (zzYIA) com.aspose.words.internal.zzZKW.zzZ(zzyia.zzZXK(), zzYIA.class);
        if (zzyia2 != null && ((zzY6N) ((zzYIC) zzyia.zza9()).zza9()) == ((zzY6N) ((zzYIC) zzyia2.zza9()).zza9())) {
            zzWT zzwt = (zzWT) zzyia2.zz6x();
            while (zzwt != null && !zzwt.isVirtual()) {
                zzWT zzwt2 = (zzWT) zzwt.zz5Z();
                int iZz6m = ((zzWV) zzwt.zza9()).zz6m();
                if (iZz6m != 0) {
                    boolean z2 = false;
                    boolean z3 = ((zzYIC) zzyia.zza9()) == ((zzYIC) ((zzYIA) zzwt.zzZZJ()).zza9());
                    if (z3) {
                        ((zzYIC) zzyia.zza9()).zzYk1().getHeightRule();
                    }
                    if (z3 || iZz6m != 1) {
                        if (z3 && iZz6m == 3) {
                            z2 = true;
                        }
                        if (z == z2) {
                            zzWK.zzX(zzwt, i);
                        }
                    }
                }
                zzwt = zzwt2;
            }
        }
    }
}
