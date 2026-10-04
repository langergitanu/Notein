package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYED {
    private static int[] zzXq0 = {190, 220, 150, 230, 270, 235, 240, 60, 70, 140, 300, 80, 120, 110, 210, 160, 830, 20, 825, 810, 815, 820, StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2, 390, 380};

    private static zz2F zzN(zz30 zz30Var) {
        zz2F zz2fZzH1;
        if (zz30Var.zzZTe() == null || (zz2fZzH1 = zz30Var.zzZTe().zzH1(7)) == null) {
            return null;
        }
        return zz2fZzH1.zzZvi();
    }

    private static Object zzO(zz30 zz30Var) {
        zz2F zz2fZzH1;
        if (zz30Var.zzZTe() == null || (zz2fZzH1 = zz30Var.zzZTe().zzH1(6)) == null) {
            return null;
        }
        zz21 zz21Var = (zz21) zz2fZzH1.zzZvi();
        zz21Var.zzZ(zz0R.zzI(zz21Var.zzZQX()));
        return zz21Var;
    }

    private static Object zzP(zz30 zz30Var) {
        zz2F zz2fZzH1;
        if (zz30Var.zzZTe() == null || (zz2fZzH1 = zz30Var.zzZTe().zzH1(5)) == null) {
            return null;
        }
        zz27 zz27Var = (zz27) zz2fZzH1.zzZvi();
        zz27Var.zzZ(zz0R.zzI(zz27Var.zzZQX()));
        return zz27Var;
    }

    private static Object zzQ(zz30 zz30Var) {
        zz4G zz4gZzY = zz0R.zzY(zz30Var.getOutline(), false);
        if (com.aspose.words.internal.zzAN.zzZD(zz4gZzY.zzZxH())) {
            zz4gZzY.zzXK(9525.0d);
        }
        return zz4gZzY;
    }

    private static Object zzR(zz30 zz30Var) {
        if (com.aspose.words.internal.zzAN.zzL(zz30Var.zzZvY(), 0.0d)) {
            return 0;
        }
        return Integer.valueOf(zz30Var.zzZvY() < 0.0d ? 2 : 1);
    }

    private static Object zzY(zz30 zz30Var, Theme theme) {
        if (zz30Var.getFill() == null || zz30Var.getFill().zzZQ4() != 5) {
            return null;
        }
        zz1C zz1c = (zz1C) zz30Var.getFill();
        com.aspose.words.internal.zzPV zzpvZzZ = zz1c.zzZQX().zzZ(theme, (zzZCM) null);
        return (zzpvZzZ.zzPD() == 0 && zz1c.zzZQX().zzZFG() == null) ? new com.aspose.words.internal.zzPV(255, zzpvZzZ) : zzpvZzZ;
    }

    public static zzYEF zzZ(zz30 zz30Var, Theme theme) {
        zzYEF zzyef = new zzYEF();
        for (int i : zzXq0) {
            Object objZzZ = zzZ(zz30Var, i, theme, false);
            if (objZzZ != null) {
                zzyef.zzQ(i, objZzZ);
            }
        }
        return zzyef;
    }

    private static int zzn7(int i) {
        return zzZ3X.zzwJ(i) ? StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2 : zzZ3X.zzwL(i) ? 390 : 380;
    }

    public static boolean zzn8(int i) {
        switch (i) {
            case 20:
            case 60:
            case 70:
            case 80:
            case 110:
            case 120:
            case 140:
            case 150:
            case 160:
            case 190:
            case 210:
            case 220:
            case 230:
            case 235:
            case 240:
            case 250:
            case StyleIdentifier.SUBTLE_EMPHASIS /* 260 */:
            case 270:
            case 300:
            case StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2 /* 340 */:
            case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4 /* 350 */:
            case 380:
            case 390:
            case 810:
            case 815:
            case 820:
            case 825:
            case 830:
                return true;
            default:
                return false;
        }
    }

    public static boolean zzZ(zz30 zz30Var, int i) {
        switch (i) {
            case 20:
                return zz30Var.zzLh(21);
            case 60:
            case 250:
                return zz30Var.zzLh(1);
            case 70:
            case StyleIdentifier.SUBTLE_EMPHASIS /* 260 */:
                return zz30Var.zzLh(7);
            case 80:
            case 300:
                return zz30Var.zzLh(16);
            case 110:
            case 120:
                return zz30Var.zzLh(4);
            case 140:
                return zz30Var.zzLh(18);
            case 150:
                return zz30Var.zzLh(15);
            case 160:
                return zz30Var.zzLh(19);
            case 190:
            case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4 /* 350 */:
                return zz30Var.zzLh(17);
            case 210:
                return zz30Var.zzLh(2);
            case 220:
                return zz30Var.zzLh(8);
            case 230:
                return zz30Var.zzLh(22);
            case 235:
                return zz30Var.zzLh(23);
            case 240:
                return zz30Var.zzLh(24);
            case 270:
                return zz30Var.zzLh(25);
            case StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2 /* 340 */:
            case 380:
            case 390:
                return zz30Var.zzLh(10);
            case 810:
                return (zz30Var.zzZTe() == null || zz30Var.zzZTe().zzH1(5) == null) ? false : true;
            case 815:
                return (zz30Var.zzZTe() == null || zz30Var.zzZTe().zzH1(6) == null) ? false : true;
            case 820:
                return (zz30Var.zzZTe() == null || zz30Var.zzZTe().zzH1(7) == null) ? false : true;
            case 825:
                return zz30Var.zzLh(20);
            case 830:
                return zz30Var.zzLh(19);
            default:
                return false;
        }
    }

    public static void zzY(zz30 zz30Var, int i) {
        int i2 = 4;
        switch (i) {
            case 20:
                i2 = 21;
                zz30Var.remove(i2);
            case 60:
            case 250:
                i2 = 1;
                zz30Var.remove(i2);
            case 70:
            case StyleIdentifier.SUBTLE_EMPHASIS /* 260 */:
                i2 = 7;
                zz30Var.remove(i2);
            case 80:
                if (zz30Var.zzZvT() != 1) {
                    return;
                }
                break;
            case 110:
                if (zz30Var.zzZvX() != 1) {
                    return;
                }
                zz30Var.remove(i2);
            case 120:
                if (zz30Var.zzZvX() != 2) {
                    return;
                }
                zz30Var.remove(i2);
            case 140:
                i2 = 18;
                zz30Var.remove(i2);
            case 150:
                i2 = 15;
                zz30Var.remove(i2);
            case 160:
                i2 = 19;
                zz30Var.remove(i2);
            case 190:
            case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4 /* 350 */:
                i2 = 17;
                zz30Var.remove(i2);
            case 220:
                i2 = 8;
                zz30Var.remove(i2);
            case 230:
                i2 = 22;
                zz30Var.remove(i2);
            case 235:
                i2 = 23;
                zz30Var.remove(i2);
            case 240:
                i2 = 24;
                zz30Var.remove(i2);
            case 270:
                i2 = 25;
                zz30Var.remove(i2);
            case 300:
                if (zz30Var.zzZvT() != 2) {
                    return;
                }
                break;
            case StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2 /* 340 */:
            case 380:
            case 390:
                i2 = 10;
                zz30Var.remove(i2);
            default:
                return;
        }
        i2 = 16;
        zz30Var.remove(i2);
    }

    public static Object zzZ(zz30 zz30Var, int i, Theme theme, boolean z) {
        switch (i) {
            case 20:
                if (zz30Var.zzZvR() != null) {
                    return zz30Var.zzZvR().zzZ(theme, (zzZCM) null);
                }
                return null;
            case 60:
            case 250:
                return zzZU.zzYW(zz30Var.getBold());
            case 70:
            case StyleIdentifier.SUBTLE_EMPHASIS /* 260 */:
                return zzZU.zzYW(zz30Var.zzZvW());
            case 80:
                return zzZU.zzYW(zz30Var.zzZvT() == 1);
            case 110:
                return zzZU.zzYW(zz30Var.zzZvX() == 1);
            case 120:
                return zzZU.zzYW(zz30Var.zzZvX() == 2);
            case 140:
                return Integer.valueOf(zz30Var.getUnderline());
            case 150:
                return Integer.valueOf(com.aspose.words.internal.zzSA.zzr(zz30Var.zzZvU().zzZsA()));
            case 160:
                return zzY(zz30Var, theme);
            case 190:
            case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4 /* 350 */:
                return Integer.valueOf((int) (zz30Var.zzZvS().zzZsA() * 2.0d));
            case 210:
                return zzR(zz30Var);
            case 220:
                return Integer.valueOf((int) (zz30Var.zzZvV().zzZsA() * 2.0d));
            case 230:
                return zzZ(zz30Var.zzZvQ(), 131076, theme);
            case 235:
                return zzZ(zz30Var.zzZvP(), 131075, theme);
            case 240:
                return zzZ(zz30Var.zzZvO() != null ? zz30Var.zzZvO() : zz30Var.zzZvQ(), 131076, theme);
            case 270:
                return zzZ(zz30Var.zzZvN(), 131074, theme);
            case 300:
                return zzZU.zzYW(zz30Var.zzZvT() == 2);
            case StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2 /* 340 */:
            case 380:
            case 390:
                if (z || zzn7(zz30Var.zzTu()) == i) {
                    return Integer.valueOf(zz30Var.zzTu());
                }
                return null;
            case 810:
                return zzP(zz30Var);
            case 815:
                return zzO(zz30Var);
            case 820:
                return zzN(zz30Var);
            case 825:
                return zzQ(zz30Var);
            case 830:
                if (zz30Var.getFill() == null) {
                    return null;
                }
                zz7X fill = zz30Var.getFill();
                return z ? fill : zz0R.zzV(fill);
            default:
                return null;
        }
    }

    public static void zzZ(zz30 zz30Var, int i, Object obj, Theme theme) {
        switch (i) {
            case 20:
                zz30Var.zzL(zzBW.zzj((com.aspose.words.internal.zzPV) obj));
                break;
            case 60:
            case 250:
                zz30Var.setBold(((zzZU) obj).toBool());
                break;
            case 70:
            case StyleIdentifier.SUBTLE_EMPHASIS /* 260 */:
                zz30Var.zzWO(((zzZU) obj).toBool());
                break;
            case 80:
                boolean bool = ((zzZU) obj).toBool();
                if (bool != (zz30Var.zzZvT() == 1 ? 1 : 0)) {
                    zz30Var.zzH5(bool ? 1 : 0);
                }
                break;
            case 110:
                boolean bool2 = ((zzZU) obj).toBool();
                if (bool2 != (zz30Var.zzZvX() == 1 ? 1 : 0)) {
                    zz30Var.zzH7(bool2 ? 1 : 0);
                }
                break;
            case 120:
                boolean bool3 = ((zzZU) obj).toBool();
                if (bool3 != (zz30Var.zzZvX() == 2)) {
                    zz30Var.zzH7(bool3 ? 2 : 0);
                }
                break;
            case 140:
                zz30Var.setUnderline(((Integer) obj).intValue());
                break;
            case 150:
                zz30Var.zzY(new zz0K(((int) (((double) ((Integer) obj).intValue()) / 20.0d)) * 100));
                break;
            case 160:
                zz30Var.setFill(new zz1C(zz6S.zzh((com.aspose.words.internal.zzPV) obj)));
                break;
            case 190:
            case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4 /* 350 */:
                zz30Var.zzX(new zz0K((((Integer) obj).intValue() / 2) * 100));
                break;
            case 210:
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue == 1) {
                    zz30Var.zzXu(0.3d);
                } else if (iIntValue != 2) {
                    zz30Var.zzXu(0.0d);
                } else {
                    zz30Var.zzXu(-0.25d);
                }
                break;
            case 220:
                zz30Var.zzZ(new zz0K((((Integer) obj).intValue() / 2) * 100));
                break;
            case 230:
                zz30Var.zzZ(new zz7P());
                zz30Var.zzZvQ().zzOH(zzU1.zzZ(obj, theme));
                break;
            case 235:
                zz30Var.zzY(new zz7P());
                zz30Var.zzZvP().zzOH(zzU1.zzZ(obj, theme));
                break;
            case 240:
                zz30Var.zzX(new zz7P());
                zz30Var.zzZvO().zzOH(zzU1.zzZ(obj, theme));
                break;
            case 270:
                zz30Var.zzW(new zz7P());
                zz30Var.zzZvN().zzOH(zzU1.zzZ(obj, theme));
                break;
            case 300:
                boolean bool4 = ((zzZU) obj).toBool();
                if (bool4 != (zz30Var.zzZvT() == 2)) {
                    zz30Var.zzH5(bool4 ? 2 : 0);
                }
                break;
            case StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2 /* 340 */:
            case 380:
            case 390:
                zz30Var.zzRe(((Integer) obj).intValue());
                break;
            case 830:
                zz30Var.setFill((zz7X) obj);
                break;
        }
    }

    private static zzU1 zzZ(zz7P zz7p, int i, Theme theme) {
        String strZzZ = zz7p != null ? zz0O.zzZ(zz7p.zzZAY(), theme) : "";
        if (com.aspose.words.internal.zzZYD.zzXk(strZzZ)) {
            return zzU1.zzSP(strZzZ);
        }
        return zzU1.zzMW(i);
    }
}
