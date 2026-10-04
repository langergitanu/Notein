package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ7C extends zzYMJ {
    private static zzTC zzP(zzTC zztc) {
        zzZ6T zzz6tZzYTo = zztc.zza9().zzYTo();
        if (zzz6tZzYTo == null && zztc.zz60() == 8) {
            zzz6tZzYTo = ((zzY6N) ((zzYIC) ((zzYIA) zztc).zza9()).zza9()).zzYTo();
        }
        if (zzz6tZzYTo == null) {
            return null;
        }
        int iZz6y = zzz6tZzYTo.zz6y();
        if (iZz6y == 4) {
            return (zzTC) ((zzYIC) ((zzY6N) zzz6tZzYTo).zzZXY()).zz6w();
        }
        if (iZz6y == 8 || iZz6y == 32) {
            return (zzTC) zzz6tZzYTo.zz6w();
        }
        throw new IllegalStateException("Unexpected layout type.");
    }

    public static boolean zzQ(zzTC zztc) throws Exception {
        return zzZ(zztc, zztc.zzZZJ());
    }

    private static boolean zzR(zzTC zztc) throws Exception {
        if (zztc.zz60() != 32) {
            return true;
        }
        return zzQ(zztc) || !((zzYMM) zztc.zza9()).zzYoi();
    }

    private boolean zzT(zzYMM zzymm) {
        zzymm.zza7();
        if (zzymm.zzYos() == zzymm.zzYSj()) {
            return false;
        }
        if ((zzymm.zzYos().zzZZJ() != zzymm.zzYSj().zzZZJ() && ((zzUZ) ((zzUZ) com.aspose.words.internal.zzZKW.zzZ(this.zzXGb, zzUZ.class)).zzYo0()).zzY8m()) || ((zzZ37) zzymm.zzYTt()).zzYLX()) {
            return false;
        }
        if (!((zzZ37) zzymm.zzYTt()).zzYLU()) {
            return true;
        }
        int i = 0;
        for (zzZ55 zzz55ZzYos = zzymm.zzYos(); zzz55ZzYos != null && zzz55ZzYos.zza9() == zzymm; zzz55ZzYos = (zzZ55) zzz55ZzYos.zzYo1()) {
            i++;
            if (i > 3) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.words.zzYMJ
    public final boolean zzS(zzTC zztc) {
        if (zztc.zz60() == 8 && zztc.zzZZJ().zz60() == 2) {
            zzYIA zzyia = (zzYIA) zztc;
            if (zzyia.zza7().zzZYM() && ((zzY6N) ((zzYIC) zzyia.zza9()).zza9()).zzXYk() && !zzyia.zzYnZ() && !zzyia.zzYjE()) {
                zzyia.zzYTm();
                if (((zzYIC) ((zzYIC) zzyia.zza9()).zzYTo()).zzYk1().zzBz()) {
                    return ((zzYIA) ((zzYIC) ((zzY6N) ((zzYIC) zzyia.zza9()).zza9()).zzZXZ()).zz6x()).zzYnZ();
                }
            }
        }
        return super.zzS(zztc);
    }

    @Override // com.aspose.words.zzYMJ
    public final boolean zzV(zzTC zztc, boolean z) throws Exception {
        return zzQ(zztc) ? zzW(zztc, z) : super.zzV(zztc, z);
    }

    @Override // com.aspose.words.zzYMJ
    public final boolean zzW(zzTC zztc, boolean z) throws Exception {
        zzTC zztcZzZXK = zztc.zzZXK();
        if (!zzZ(zztc, zztcZzZXK)) {
            return false;
        }
        zzTC zztcZzZ = zzZ(zztc, (zzYBL) zztc.zzqh(2));
        if (zzZ(zztcZzZ, zztcZzZXK, zztc)) {
            return zzZ(zztcZzZ, zztcZzZXK, z);
        }
        return false;
    }

    @Override // com.aspose.words.zzYMJ
    public final boolean zzY(zzYBL zzybl) {
        return zzybl.zz60() == 2;
    }

    @Override // com.aspose.words.zzYMJ
    public final boolean zzZ(zzYIA zzyia, boolean z) throws Exception {
        if (zzyia.zzYTn()) {
            return false;
        }
        return super.zzZ(zzyia, z);
    }

    private static boolean zzY(zzYIA zzyia) throws Exception {
        zzyia.zzZZJ();
        zzUZ zzuz = (zzUZ) zzyia.zzZZJ();
        if (!zzQ((zzTC) zzuz.zz6x())) {
            return false;
        }
        zzTC zztcZzP = zzP(zzyia);
        if (zztcZzP == null) {
            return true;
        }
        while (zztcZzP != null && zztcZzP.zzZZJ() == zzuz) {
            if (!zzQ(zztcZzP)) {
                int iZz60 = zztcZzP.zz60();
                if (iZz60 != 8) {
                    if (iZz60 == 32) {
                        return false;
                    }
                } else if (zztcZzP.zza9().zzYTn()) {
                    return false;
                }
            }
            zztcZzP = zzP(zztcZzP);
        }
        return true;
    }

    @Override // com.aspose.words.zzYMJ
    public final boolean zzZ(zzWT zzwt, zzTC zztc, boolean z) throws Exception {
        zzTC zztcZzZXK = zztc.zzZXK();
        if (!zzZ(zztc, zztcZzZXK) || zzY9R.zzmN(((zzZ55) zztc).zzYQc().zzZo6())) {
            return false;
        }
        zzTC zztcZzZ = zzZ(zztc, (zzYBL) zzwt);
        if (zztcZzZ.zz60() == 8) {
            zztcZzZ = ((zzYIA) zztcZzZ).zzYjT();
        }
        if (zztcZzZ.zzYnZ() && z) {
            zztcZzZXK = (zzYIA) ((zzWT) zzwt.zzYo1()).zzZZJ();
        }
        return zzZ(zztcZzZ, zztcZzZXK, z);
    }

    private static boolean zzV(zzZ55 zzz55) throws Exception {
        return ((zzZ37) ((zzYMM) zzz55.zza9()).zzYTt()).zzYLW() && !zzYMJ.zz0(zzz55);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzTC zzZ(zzTC zztc, zzYBL zzybl) throws Exception {
        while (true) {
            if (zztc.zz60() == 32) {
                zzZ55 zzz55 = (zzZ55) zztc;
                if (zzz55.zza7().zzZYM() && zzT((zzYMM) zzz55.zza9())) {
                    return zzz55;
                }
                zztc = ((zzYMM) zzz55.zza9()).zzYos();
                if (zztc.zzZZJ() != zzybl) {
                    zztc = (zzTC) zzybl.zz6x();
                }
            } else {
                zzYIA zzyia = (zzYIA) zztc;
                if (zzyia.zzab().zza7().zzZYM() && zzybl.zz60() == 2) {
                    boolean z = zzyia.zzYjE() && ((zzYIC) ((zzY6N) ((zzYIC) zzyia.zza9()).zza9()).zzZXY()).zz6w().zzZZJ() != zzybl;
                    if (!zzyia.zzYTn() || z) {
                        break;
                    }
                }
            }
            zzTC zztcZzP = zzP(zztc);
            if (zztcZzP == null || zztcZzP.zzZZJ() != zzybl || !zzQ(zztcZzP)) {
                break;
            }
            zztc = zztcZzP;
        }
        return zztc;
    }

    private static boolean zzZ(zzTC zztc, zzTC zztc2, zzTC zztc3) throws Exception {
        if (zztc.zza7().zzZYM()) {
            return true;
        }
        if (zztc.zz60() == 32) {
            return (zztc2.zz60() == 32 && ((zzZ55) zztc2).zzYPW()) ? false : true;
        }
        if (zztc2.zz60() == 8 && zztc3.zz60() == 8 && zztc.zza9().zza9() != zztc2.zza9().zza9() && zztc.zza9().zza9() != zztc3.zza9().zza9()) {
            return !zzY((zzYIA) zztc);
        }
        if (zztc2.zz60() == 8) {
            return true;
        }
        zzYIA zzyia = (zzYIA) zztc;
        zzY6N zzy6n = (zzY6N) ((zzYIC) zzyia.zza9()).zza9();
        return (zzy6n == zzyia.zzZZJ().zz6x().zza9().zza9() && ((zzYIA) ((zzYIC) zzy6n.zzZXY()).zz6w()).zzYnY() && ((zzUZ) zzyia.zzqh(2)).zz0h()) ? false : true;
    }

    private static boolean zzZ(zzTC zztc, zzTC zztc2) throws Exception {
        if (zzQ(zztc)) {
            return (zztc.zz60() != 32 || zztc.zzYTn()) && zztc2 != null && zzR(zztc2) && !zztc2.zzX((zzTF) null);
        }
        return false;
    }

    private static boolean zzZ(zzTC zztc, zzTF zztf) throws Exception {
        int iZz60 = zztc.zz60();
        if (iZz60 == 8) {
            return zzZ((zzYIA) zztc, zztf);
        }
        if (iZz60 == 32) {
            return zzV((zzZ55) zztc);
        }
        throw new IllegalStateException("Unexpected part type.");
    }

    private static boolean zzZ(zzYIA zzyia, zzTF zztf) throws Exception {
        if (((zzY6N) ((zzYIC) zzyia.zza9()).zza9()).zzY6a().isFloating()) {
            if (zztf.zz60() == 16) {
                return false;
            }
            if (!((zzY6N) ((zzYIC) zzyia.zza9()).zza9()).zzhk() && zztf.zz60() == 2) {
                return false;
            }
        }
        zzYIA zzyia2 = (zzYIA) ((zzYIC) zzyia.zza9()).zz6x();
        if (!((zzYIC) zzyia.zza9()).zzYTn()) {
            zzYN8 zzyn8ZzZ8m = zzyia.zzZ8m();
            while (zzyia2.zzZ8m() != zzyn8ZzZ8m) {
                zzyia2.zza9();
                ((zzYIA) zzyia2.zzYo1()).zza9();
                zzyia2 = (zzYIA) zzyia2.zzYo1();
            }
        }
        zzWT zzwt = (zzWT) zzyia2.zz6x();
        while (zzwt != null && zzwt.isEmpty()) {
            zzwt = (zzWT) zzwt.zz5Z();
        }
        if (zzwt == null) {
            return false;
        }
        return zzZ((zzTC) zzwt.zz6x(), zztf);
    }
}
