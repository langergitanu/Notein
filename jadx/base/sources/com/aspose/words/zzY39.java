package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY39 {
    private static boolean zzC(zzWT zzwt) throws Exception {
        while (true) {
            for (zzYMD zzymdZz6x = zzwt.zz6x(); zzymdZz6x != null; zzymdZz6x = zzymdZz6x.zz5Z()) {
                if (zzymdZz6x instanceof zzZ55) {
                    if (!zzZM((zzZ55) com.aspose.words.internal.zzZKW.zzZ(zzymdZz6x, zzZ55.class))) {
                        return false;
                    }
                } else if (!zzq((zzYIA) com.aspose.words.internal.zzZKW.zzZ(zzymdZz6x, zzYIA.class))) {
                    return false;
                }
            }
            if (((zzWV) zzwt.zza9()).zz6o() == null) {
                return true;
            }
            ((zzZ3B) ((zzWV) zzwt.zza9()).zzYTt()).zzYMY();
            zzwt = zzWK.zzO(zzwt);
        }
    }

    public static zzTC zzJ(zzTF zztf) throws Exception {
        zzYMD zzymdZz6w = zztf.zz6w();
        while (zzymdZz6w != null && zzymdZz6w.zzZZJ() == zztf) {
            int iZz60 = zzymdZz6w.zz60();
            if (iZz60 == 8) {
                zzYIA zzyia = (zzYIA) zzymdZz6w;
                if (!zzyia.zzYol()) {
                    return zzyia;
                }
            } else {
                if (iZz60 != 32) {
                    throw new IllegalStateException("Unexpected part type.");
                }
                zzZ55 zzz55 = (zzZ55) zzymdZz6w;
                if (!((zzYMM) zzz55.zza9()).zzYoi()) {
                    return zzz55;
                }
                zzymdZz6w = ((zzYMM) zzz55.zza9()).zzYos();
            }
            zzymdZz6w = zzymdZz6w.zz5Y();
        }
        return null;
    }

    public static boolean zzO(zzYIC zzyic) {
        return !zzyic.zz69().zzYol();
    }

    private static boolean zzP(zzYIC zzyic) throws Exception {
        for (zzWV zzwv = (zzWV) zzyic.zzZXZ(); zzwv != null && !zzwv.zzYTn(); zzwv = (zzWV) zzwv.zzYTp()) {
            if (zzQ(zzwv)) {
                return true;
            }
        }
        return false;
    }

    public static boolean zzQ(zzYIC zzyic) throws Exception {
        return (zzyic.zzYk1().isHidden() || zzyic.zz69().zzY6i()) && !zzP(zzyic);
    }

    private static boolean zzZM(zzZ55 zzz55) throws Exception {
        if (((zzYMM) zzz55.zza9()).zzYol()) {
            return true;
        }
        for (zzYAU zzyauZzY6R = (zzYAU) zzz55.zz6x(); zzyauZzY6R != null; zzyauZzY6R = zzyauZzY6R.zzY6R()) {
            if (!zzyauZzY6R.zzYol()) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzq(zzYIA zzyia) throws Exception {
        for (zzWT zzwt = (zzWT) zzyia.zz6x(); zzwt != null && !zzwt.isVirtual(); zzwt = (zzWT) com.aspose.words.internal.zzZKW.zzZ(zzwt.zz5Z(), zzWT.class)) {
            if (!zzC(zzwt)) {
                return false;
            }
        }
        return true;
    }

    public static boolean zzr(zzYIA zzyia) throws Exception {
        boolean z = false;
        while (!z) {
            if (((zzYIC) zzyia.zza9()).zzYol()) {
                return true;
            }
            if (zzyia.zzYo0() == null || !zzq(zzyia)) {
                break;
            }
            z = true;
        }
        return z;
    }

    private static boolean zzO(zzY6N zzy6n) throws Exception {
        for (zzYIC zzyic = (zzYIC) zzy6n.zzZXZ(); zzyic != null; zzyic = (zzYIC) zzyic.zzYTp()) {
            if (!zzyic.zzYok()) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzQ(zzWV zzwv) throws Exception {
        for (zzZ6T zzz6tZzZXZ = zzwv.zzZXZ(); zzz6tZzZXZ != null; zzz6tZzZXZ = zzz6tZzZXZ.zzYTp()) {
            if (zzz6tZzZXZ instanceof zzYMM) {
                zzYMM zzymm = (zzYMM) com.aspose.words.internal.zzZKW.zzZ(zzz6tZzZXZ, zzYMM.class);
                if (!zzymm.zzYok() && !zzymm.zzYoh()) {
                    return true;
                }
            } else if ((zzz6tZzZXZ instanceof zzY6N) && !zzO((zzY6N) com.aspose.words.internal.zzZKW.zzZ(zzz6tZzZXZ, zzY6N.class))) {
                return true;
            }
        }
        return false;
    }

    public static boolean zzJ(zzTC zztc) throws Exception {
        int iZz60 = zztc.zz60();
        if (iZz60 == 8) {
            return !((zzYIA) zztc).zzYol();
        }
        if (iZz60 == 32) {
            return !((zzYMM) ((zzZ55) zztc).zza9()).zzYoi();
        }
        throw new IllegalStateException("Unexpected part type.");
    }
}
