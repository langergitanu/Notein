package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ51 {
    private static int zz4(zzZ55 zzz55) throws Exception {
        zzZ55 zzz552 = (zzZ55) com.aspose.words.internal.zzZKW.zzZ(zzz55.zzZXK(), zzZ55.class);
        if (zzz552 == null || zzz55.zzYQ6()) {
            return 1;
        }
        if (zzz552.zzYQ9()) {
            return 7;
        }
        return zzz552.zzYQ6() ? 8 : 1;
    }

    private static int zz5(zzZ55 zzz55) throws Exception {
        int iZzZo6 = zzz55.zzYQc().zzZo6();
        if (iZzZo6 == 10528) {
            throw new IllegalStateException();
        }
        if (iZzZo6 == 21537) {
            if (!zzz55.zzYQ4() || !zzz55.zzaa().zzbD()) {
                return 1;
            }
            zzZ55 zzz552 = (zzZ55) com.aspose.words.internal.zzZKW.zzZ(zzz55.zzZXK(), zzZ55.class);
            return (zzz552 == null || !zzz552.zzYQ9()) ? 4 : 7;
        }
        if (iZzZo6 == 21577 || iZzZo6 == 21586 || iZzZo6 == 21595 || iZzZo6 == 21639) {
            return 2;
        }
        if (iZzZo6 == 21779) {
            return zzz55.zzaa().zzbD() ? 3 : 1;
        }
        if (iZzZo6 == 21788) {
            return zzz55.zzaa().zzbD() ? 4 : 1;
        }
        switch (iZzZo6) {
            case 21857:
            case 21858:
            case 21859:
            case 21860:
            case 21861:
                return (zzz55.zzaa().zzbD() || zzz55.zzYQq()) ? 2 : 1;
            default:
                return 1;
        }
    }

    private static zzZ39 zz6(zzZ55 zzz55) throws Exception {
        ((zzYAU) zzz55.zz6w()).zzZo6();
        zzZ39 zzz39ZzYLJ = null;
        for (zzYAU zzyau = (zzYAU) zzz55.zz6x(); zzyau != ((zzYAU) zzz55.zz6w()); zzyau = (zzYAU) zzyau.zzYo1()) {
            if (zzyau.zzZo6() == 25604 && zzyau.zzY6M().zzYLJ().isFloating()) {
                zzz39ZzYLJ = zzyau.zzY6M().zzYLJ();
                if (zzZ39.zzwc(zzz39ZzYLJ.getWrapType())) {
                    return zzz39ZzYLJ;
                }
            }
        }
        return zzz39ZzYLJ;
    }

    public static boolean zz7(zzZ55 zzz55) throws Exception {
        zzZ39 zzz39Zz6 = zz6(zzz55);
        if (zzz39Zz6 != null) {
            return zzZ39.zzwc(zzz39Zz6.getWrapType()) || zzR(zzz55.zzZ8m());
        }
        return false;
    }

    private static boolean zzR(zzYN8 zzyn8) {
        zzZNL zzznlZzYF = zzyn8.zzYF(false);
        return zzznlZzYF != null && zzznlZzYF.getCount() > 0;
    }

    private static int zzW(zzYMD zzymd, boolean z) throws Exception {
        if (zzymd.zz60() == 32) {
            zzymd = ((zzZ55) zzymd).zzYQo();
        }
        if (!zzymd.zzYnZ()) {
            return 0;
        }
        if (zzymd.zzZZJ().zz60() == 2) {
            zzUZ zzuz = (zzUZ) zzymd.zzZZJ();
            if (!zzuz.zz0h()) {
                return 0;
            }
            if (zzuz.zz0o()) {
                for (zzUZ zzuzZz0H = zzuz.zz0H(); zzuzZz0H != zzuz; zzuzZz0H = (zzUZ) zzuzZz0H.zzYo1()) {
                    if (zzuzZz0H.isEmpty()) {
                    }
                }
                return 1;
            }
            if (zzuz.zzYnZ() && ((zzTC) zzuz.zz6x()) == zzymd && (zzymd instanceof zzZ55)) {
                zzZ55 zzz55 = (zzZ55) com.aspose.words.internal.zzZKW.zzZ(zzymd, zzZ55.class);
                zzYN8 zzyn8ZzZ8m = zzz55.zzZ8m();
                int iZzYqn = zzyn8ZzZ8m.zzYqn() - zzyn8ZzZ8m.zzYqo();
                for (zzYAU zzyau = (zzYAU) zzz55.zz6x(); zzyau != null; zzyau = (zzYAU) zzyau.zz5Z()) {
                    zzY9X zzy9x = (zzY9X) com.aspose.words.internal.zzZKW.zzZ(zzyau, zzY9X.class);
                    if (zzy9x != null && zzy9x.zzYjN() + zzy9x.zzYjL() > iZzYqn) {
                        return 2;
                    }
                }
            }
            return 0;
        }
        return z ? 1 : 0;
    }

    public static int zzX(zzZ55 zzz55, int i, boolean z) throws Exception {
        int iZz4;
        if (zzz55 != null) {
            zzz55.isActive();
        }
        if (zzz55.zzZZJ().zz60() != 16 && zzz55.zzX(zzz55.zzZZJ())) {
            return 6;
        }
        if (zzz55.zz0t() <= i) {
            return (zzz55.getHeight() < i || (iZz4 = zz4(zzz55)) == 1) ? zz5(zzz55) : iZz4;
        }
        if (zzz55.zzYQ9()) {
            return 3;
        }
        int iZzW = zzW(zzz55, z);
        if (zzz55.zzYQ6()) {
            if (i <= 0 && iZzW == 0 && zz7(zzz55)) {
                return 5;
            }
            return 21779 == zzz55.zzI(true, true).zzZo6() ? 3 : 4;
        }
        if (iZzW == 0) {
            return 5;
        }
        if (iZzW == 2) {
            return 4;
        }
        int iZz42 = zz4(zzz55);
        return iZz42 != 1 ? iZz42 : zzz55.zzYQ4() ? 4 : 3;
    }

    public static boolean zzX(zzYMD zzymd, boolean z) throws Exception {
        return zzW(zzymd, z) == 0;
    }
}
