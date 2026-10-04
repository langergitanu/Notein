package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYJP {
    private static zzYMM zzL(zzYMM zzymm) {
        zzZ6T zzz6tZza9;
        if (((zzZ37) zzymm.zzYTt()).zzYLV()) {
            return null;
        }
        if (zzymm.zza9().zz6y() == 16) {
            zzZ6T zzz6tZza92 = zzymm;
            while (zzz6tZza92.zza9().zz6y() == 16) {
                zzz6tZza92 = zzz6tZza92.zza9().zza9();
            }
            zzz6tZza9 = zzz6tZza92.zza9();
        } else {
            zzz6tZza9 = zzymm;
        }
        if (zzz6tZza9.zzYTo() == null) {
            return null;
        }
        zzYMM zzymmZzQ = zzz6tZza9.zzYTo() instanceof zzYMM ? (zzYMM) zzz6tZza9.zzYTo() : zzQ((zzY6N) zzz6tZza9.zzYTo());
        if (com.aspose.words.internal.zzZKO.zzA(((zzZ37) zzymmZzQ.zzYTt()).zzYLJ(), ((zzZ37) zzymm.zzYTt()).zzYLJ())) {
            return zzymmZzQ;
        }
        return null;
    }

    public static zzYMD zzM(zzTF zztf) {
        while (zztf != null && zztf.zz6x() == null) {
            zztf = (zzTF) zztf.zzYo1();
        }
        if (zztf == null) {
            return null;
        }
        return zztf.zz6x();
    }

    public static zzYMD zzN(zzYMM zzymm) {
        ((zzZ37) zzymm.zzYTt()).zzYLJ();
        zzYMM zzymm2 = zzymm;
        while (zzymm != null) {
            zzymm2 = zzymm;
            zzymm = zzM(zzymm);
        }
        return zzymm2.zza9().zz6y() == 16 ? ((zzYIC) zzQ(zzymm2).zzZXY()).zz6w() : zzymm2.zz6w();
    }

    public static zzYMD zzO(zzYMM zzymm) {
        ((zzZ37) zzymm.zzYTt()).zzYLJ();
        zzYMM zzymm2 = zzymm;
        while (zzymm != null) {
            zzymm2 = zzymm;
            zzymm = zzL(zzymm);
        }
        return zzymm2.zza9().zz6y() == 16 ? ((zzYIC) zzQ(zzymm2).zzZXZ()).zz6x() : zzymm2.zz6x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.aspose.words.zzY6N] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.aspose.words.zzZ6T] */
    public static zzYMM zzQ(zzY6N zzy6n) {
        while (zzy6n != 0) {
            zzy6n = ((zzWV) ((zzYIC) ((zzY6N) zzy6n).zzZXZ()).zzZXZ()).zzZXZ();
            if (zzy6n.zz6y() == 32) {
                return (zzYMM) zzy6n;
            }
        }
        return null;
    }

    public static zzTC zzY(zzTC zztc, zzTF zztf) {
        zzYMD zzymdZzZXK = zztc != null ? zztc.zzZXK() : zzM(zztf);
        if (zzymdZzZXK == null) {
            return null;
        }
        for (zzZ6T zzz6tZza9 = zzymdZzZXK.zz60() == 8 ? (zzY6N) ((zzYIC) ((zzYIA) zzymdZzZXK).zza9()).zza9() : zzymdZzZXK.zza9(); zzz6tZza9 != null; zzz6tZza9 = zzz6tZza9.zzYTp()) {
            int iZz6y = zzz6tZza9.zz6y();
            if (iZz6y == 4) {
                zzY6N zzy6n = (zzY6N) zzz6tZza9;
                if (zzy6n.zzY6a().zzYLJ().isFloating()) {
                    continue;
                } else {
                    zzYMM zzymmZzQ = zzQ(zzy6n);
                    if (!((zzZ37) zzymmZzQ.zzYTt()).zzYLJ().isFloating()) {
                        return zzymmZzQ.zzYos();
                    }
                }
            } else if (iZz6y != 32) {
                continue;
            } else {
                zzYMM zzymm = (zzYMM) zzz6tZza9;
                if (!((zzZ37) zzymm.zzYTt()).zzYLJ().isFloating()) {
                    return zzymm.zzYos();
                }
            }
        }
        return null;
    }

    public static boolean zzZ(zzYS zzys) {
        zzYMM zzymm = null;
        zzY6N zzy6n = null;
        for (zzZ6T zzz6tZza9 = zzys.zza9(); zzz6tZza9 != null; zzz6tZza9 = zzz6tZza9.zza9()) {
            int iZz6y = zzz6tZza9.zz6y();
            if (iZz6y == 4) {
                zzy6n = (zzY6N) zzz6tZza9;
            } else if (iZz6y == 32) {
                zzymm = (zzYMM) zzz6tZza9;
            }
        }
        boolean zIsFloating = zzymm != null ? ((zzZ37) zzymm.zzYTt()).zzYLJ().isFloating() : false;
        return zzy6n != null ? zIsFloating || zzy6n.zzY6a().zzYLJ().isFloating() : zIsFloating;
    }

    public static int zzZ1(Object obj) {
        boolean zZzY57;
        zzZ39 zzz39ZzZo = zzZ39.zzZo(obj);
        zzY9X zzy9x = (zzY9X) com.aspose.words.internal.zzZKW.zzZ(obj, zzY9X.class);
        if (zzy9x != null) {
            zzy9x.zzY6X();
            zZzY57 = zzy9x.zzY57();
        } else {
            ((zzYS) obj).zza9();
            zzY6N zzy6n = (zzY6N) com.aspose.words.internal.zzZKW.zzZ(obj, zzY6N.class);
            zZzY57 = zzy6n != null && ((zzYIA) ((zzYIC) zzy6n.zzZXZ()).zz6x()).zzZZJ().zz60() == 16;
        }
        return zZzY57 ? zzz39ZzZo.zzYMb() ? 4 : 2 : (!zzz39ZzZo.zzYMb() || zzZ((zzYS) obj)) ? 1 : 3;
    }

    public static int zzZZ(zzZ55 zzz55) throws Exception {
        zzZ55 zzz552 = zzz55;
        do {
            zzz552 = (zzZ55) com.aspose.words.internal.zzZKW.zzZ(zzz552.zz5Y(), zzZ55.class);
            if (zzz552 == null) {
                break;
            }
        } while (zzz55.zzZXN() != zzz552.zzZXN());
        if (zzz552 != null) {
            zzz55.zzZZJ();
            zzz552.zzZZJ();
        }
        if (zzz552 != null) {
            zzz55.zzZXN();
            zzz552.zzZXN();
        }
        int iZzYQv = zzz55.zzYQv();
        return (zzz552 == null || zzz552.getBottom() >= iZzYQv) ? iZzYQv : zzz552.zzYPL();
    }

    public static int zzk(zzYMD zzymd) {
        if (zzymd != null) {
            zzymd.isActive();
        }
        int iZz60 = zzymd.zz60();
        if (iZz60 != 8) {
            if (iZz60 != 32) {
                return 0;
            }
            zzZ55 zzz55 = (zzZ55) zzymd;
            return (((zzZ37) ((zzYMM) zzz55.zza9()).zzYTt()).zzYLJ().isFloating() && zzz55.zzqh(16) == null) ? 1 : 0;
        }
        zzYIA zzyia = (zzYIA) zzymd;
        if (zzyia.zzaa().getStoryType() == 5) {
            return 0;
        }
        int i = 0;
        for (zzTF zztfZzZZJ = zzyia; zztfZzZZJ != null && zztfZzZZJ.zzZZJ().zz60() == 16; zztfZzZZJ = zztfZzZZJ.zzZZJ().zzZZJ()) {
            i++;
        }
        return ((zzY6N) ((zzYIC) zzyia.zza9()).zza9()).zzY6a().zzYLJ().isFloating() ? (-1) - i : (i == 0 && ((zzZ37) zzQ((zzY6N) ((zzYIC) zzyia.zza9()).zza9()).zzYTt()).zzYLJ().isFloating()) ? 1 : 0;
    }

    public static boolean zzl(zzYMD zzymd) {
        return zzk(zzymd) != 0;
    }

    public static boolean zzm(zzYMD zzymd) {
        if (!zzymd.zzaa().zzbD()) {
            zzymd.zzaa();
        }
        return zzk(zzymd) > 0;
    }

    public static zzTC zzn(zzYMD zzymd) {
        zzYMD zzymd2 = null;
        while (true) {
            int iZz60 = zzymd.zz60();
            if (iZz60 != 8) {
                if (iZz60 != 16) {
                    if (iZz60 != 32) {
                        if (iZz60 != 64) {
                            return (zzTC) zzymd2;
                        }
                    }
                }
                zzymd = zzymd.zzZZJ();
            }
            zzymd2 = zzymd;
            zzymd = zzymd.zzZZJ();
        }
    }

    public static int zzo(zzYMD zzymd) throws Exception {
        zzYMD zzymdZzp = zzp(zzymd);
        if (zzymdZzp != null) {
            return zzymdZzp.zz60() == 32 ? ((zzZ55) zzymdZzp).zzYPL() : zzymdZzp.getBottom();
        }
        return Integer.MIN_VALUE;
    }

    private static zzYMD zzp(zzYMD zzymd) {
        if (zzymd.zzYnZ()) {
            return null;
        }
        if ((zzymd.zz60() == 32 && !zzymd.zzYTm()) || (zzymd.zz60() == 8 && !zzymd.zza9().zzYTm())) {
            return zzymd.zz5Y();
        }
        if ((zzymd.zz60() != 32 || !zzymd.zzYTm()) && zzymd.zz60() == 8) {
            zzymd.zza9().zzYTm();
        }
        int iZzk = zzk(zzymd);
        if (iZzk == 0) {
            return ((zzYBL) ((zzTC) zzymd).zzZZJ()).zzh(zzymd);
        }
        if (iZzk < 0) {
            return null;
        }
        zzymd.zzZZJ();
        if (zzL(zzymd.zz60() == 32 ? (zzYMM) zzymd.zza9() : zzQ((zzY6N) zzymd.zza9().zza9())) == null) {
            return null;
        }
        return zzymd.zz5Y();
    }

    public static zzYMM zzM(zzYMM zzymm) {
        zzZ6T zzz6tZza9;
        zzYMM zzymmZzQ;
        if (zzymm.zza9().zz6y() == 16) {
            zzZ6T zzz6tZza92 = zzymm;
            while (zzz6tZza92.zza9().zz6y() == 16) {
                zzz6tZza92 = zzz6tZza92.zza9().zza9();
            }
            zzz6tZza9 = zzz6tZza92.zza9();
        } else {
            zzz6tZza9 = zzymm;
        }
        if (zzz6tZza9.zzYTp() == null) {
            return null;
        }
        if (zzz6tZza9.zzYTp() instanceof zzYMM) {
            zzymmZzQ = (zzYMM) zzz6tZza9.zzYTp();
        } else {
            zzymmZzQ = zzQ((zzY6N) zzz6tZza9.zzYTp());
        }
        if (com.aspose.words.internal.zzZKO.zzA(((zzZ37) zzymmZzQ.zzYTt()).zzYLJ(), ((zzZ37) zzymm.zzYTt()).zzYLJ()) && !((zzZ37) zzymmZzQ.zzYTt()).zzYLV()) {
            return zzymmZzQ;
        }
        return null;
    }

    private static zzY6N zzQ(zzZ6T zzz6t) {
        while (zzz6t != null) {
            if (zzz6t.zz6y() == 4 && !(zzz6t.zza9() instanceof zzWV)) {
                return (zzY6N) zzz6t;
            }
            zzz6t = zzz6t.zza9();
        }
        return null;
    }
}
