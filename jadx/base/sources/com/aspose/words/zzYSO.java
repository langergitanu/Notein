package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYSO {
    private static int zzW(int i, int i2, IWarningCallback iWarningCallback) {
        switch (i2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 15:
                return zzsG(i);
            case 5:
            case 13:
            case 14:
            default:
                zzZ(iWarningCallback, 65536, "Data labels position is reset to default.");
                return 0;
            case 7:
            case 8:
            case 9:
            case 12:
                return zzsH(i);
            case 10:
            case 11:
                return zzsF(i);
        }
    }

    public static int zzX(int i, int i2, IWarningCallback iWarningCallback) {
        int i3;
        switch (i) {
            case 1:
                i3 = 2;
                break;
            case 2:
                i3 = 3;
                break;
            case 3:
                i3 = 9;
                break;
            case 4:
            case 5:
            case 10:
                i3 = 8;
                break;
            case 6:
            case 7:
            case 8:
                i3 = 1;
                break;
            case 9:
                i3 = 6;
                break;
            case 11:
                i3 = 5;
                break;
            case 12:
                i3 = 7;
                break;
            case 13:
                i3 = 4;
                break;
            default:
                i3 = 0;
                break;
        }
        return zzW(i3, i2, iWarningCallback);
    }

    private static boolean zzY(zzYRL zzyrl) {
        zzYC3 zzyc3ZzYvW = zzyrl.zzYvW();
        return zzyc3ZzYvW != null && zzyc3ZzYvW.zzS(459, 448, 449, 462, 471);
    }

    private static zz4G zzYx0() {
        zz4G zz4g = new zz4G();
        zz4g.setFill(new zz54());
        return zz4g;
    }

    private static void zzZ(IWarningCallback iWarningCallback, int i, String str) {
        if (iWarningCallback == null) {
            return;
        }
        OooO00o.OooO0O0(iWarningCallback, i, 15, str);
    }

    public static Shape zzg(Shape shape) {
        Shape shape2 = new Shape(shape.getDocument(), (byte) 0);
        for (int i = 0; i < shape.zzYvW().getCount(); i++) {
            int iZzT3 = shape.zzYvW().zzT3(i);
            shape2.setShapeAttr(iZzT3, shape.zzYvW().get(iZzT3));
        }
        zzYC3 zzyc3ZzYvW = shape2.zzYvW();
        zzyc3ZzYvW.remove(4116);
        zzyc3ZzYvW.remove(4119);
        zzyc3ZzYvW.remove(826);
        zzyc3ZzYvW.remove(4118);
        zzyc3ZzYvW.remove(4117);
        zzyc3ZzYvW.remove(4112);
        zzyc3ZzYvW.remove(4113);
        zzyc3ZzYvW.remove(4114);
        zzyc3ZzYvW.remove(4115);
        zzyc3ZzYvW.remove(StyleIdentifier.PLAIN_TABLE_1);
        zzyc3ZzYvW.remove(EditingLanguage.LULE_SAMI_NORWAY);
        return shape2;
    }

    private static int zzsF(int i) {
        if (i == 3 || i == 4 || i == 5 || i == 7) {
            return i;
        }
        return 0;
    }

    private static int zzsG(int i) {
        if (i == 1 || i == 3 || i == 6 || i == 8 || i == 9) {
            return i;
        }
        return 0;
    }

    private static int zzsH(int i) {
        if (i == 2 || i == 3 || i == 5 || i == 7) {
            return i;
        }
        return 0;
    }

    public static int zzsI(int i) {
        switch (i) {
        }
        return 0;
    }

    public static int zzsJ(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static boolean zzsK(int i) {
        return (i == 6 || i == 7 || i == 9) ? false : true;
    }

    public static zzYT7 zzZ(Shape shape, Document document) throws Exception {
        if (shape.getOleFormat() != null && "opendocument.ChartDocument.1".equals(shape.getOleFormat().getProgId())) {
            return zzYT0.zzY(new com.aspose.words.internal.zzKD(shape.getOleFormat().getOleObject().zzYrr()).zzIf().zzYu("EmbeddedOdf"), document);
        }
        return null;
    }

    public static ChartAxis zzZ(zzGK zzgk, int i) {
        if (zzgk.zzZPg().zzLv(i) != null) {
            return zzgk.zz45().zzKE(((Integer) zzgk.zzZPg().zzLv(i)).intValue());
        }
        return null;
    }

    public static void zzZ(zzYEF zzyef, zz30 zz30Var) {
        if (zzyef == null || zz30Var == null) {
            return;
        }
        zz30Var.zzZ(new zz7P());
        zz30Var.zzZvQ().zzOH(zzyef.getNameAscii());
        zz30Var.setBold(zzyef.zzYe1().toBool());
        zz30Var.zzWO(zzyef.zzYe0().toBool());
        zz30Var.setUnderline(zzyef.getUnderline());
        if (!com.aspose.words.internal.zzPV.zzZ(zzyef.zzYKP(), com.aspose.words.internal.zzPV.zzHZ)) {
            zz30Var.zzL(zzBW.zzj(zzyef.zzYKP()));
        }
        zz30Var.setFill(new zz1C(zzBW.zzj(zzyef.zzZy().isEmpty() ? com.aspose.words.internal.zzPV.zzKa : zzyef.zzZy())));
        zz30Var.zzX(new zz0K(zzyef.getSize() * 50));
    }

    public static void zzZ(zzYRL zzyrl, zzD9 zzd9, boolean z) {
        if (zzyrl == null) {
            return;
        }
        zzd9.setFill(zzZ(zzyrl));
        zzd9.setOutline(zzZ(zzyrl, z));
    }

    public static int zzZ(zzYT6 zzyt6, IWarningCallback iWarningCallback) {
        if (!zzyt6.zzYxM().zzYxJ()) {
            return 3;
        }
        zzyt6.zzYxM().zzYxL();
        zzZ(iWarningCallback, 65536, "Position of axis labels is set to default.");
        return 2;
    }

    public static int zzZ(int i, zzYSV zzysv, IWarningCallback iWarningCallback) {
        switch (i) {
            case 0:
                return zzysv.zzYx8() ? 3 : 0;
            case 1:
                if (zzysv.zzZh5()) {
                    return zzysv.zzYx8() ? 9 : 6;
                }
                if (zzysv.zzYx8()) {
                    return zzysv.zzYxd() ? 17 : 20;
                }
                return 14;
            case 2:
                return 12;
            case 3:
                return zzysv.zzYx8() ? 27 : 26;
            case 4:
            case 7:
                return 30;
            case 5:
                zzZ(iWarningCallback, 256, "Gantt chart type is unexpected, chart will be rendered as Column chart.");
                return 14;
            case 6:
                return zzysv.zzYx8() ? 25 : 22;
            case 8:
                return 21;
            case 9:
                return 31;
            case 10:
                return 32;
            case 11:
                return zzysv.zzYx8() ? 34 : 33;
            default:
                throw new IllegalArgumentException("Unexpected chart type.");
        }
    }

    public static int zzZ(int i, IWarningCallback iWarningCallback) {
        if (i == 0) {
            return 3;
        }
        if (i == 3) {
            return 5;
        }
        if (i != 4) {
            if (i == 6) {
                return 3;
            }
            if (i == 7) {
                return 2;
            }
            if (i != 8) {
                zzZ(iWarningCallback, 65536, "Not supported legend position, legend will be rendered with default position.");
                return 1;
            }
        }
        return 4;
    }

    private static zz7X zzZ(zzYRL zzyrl) {
        if (zzyrl.zzYvW() == null) {
            return null;
        }
        if (!((Boolean) zzyrl.zzYvW().zzPj(443)).booleanValue()) {
            return new zz54();
        }
        com.aspose.words.internal.zzPV zzpv = (com.aspose.words.internal.zzPV) zzyrl.zzYvW().zzPk(385);
        if (zzpv == null) {
            return null;
        }
        return new zz1C(zzBW.zzj(zzpv));
    }

    private static zz4G zzZ(zzYRL zzyrl, boolean z) {
        if (zzyrl.zzYvW() == null) {
            return zzYx0();
        }
        if (!((Boolean) zzyrl.zzYvW().zzPj(508)).booleanValue()) {
            return zzYx0();
        }
        if (!zzY(zzyrl) && !z) {
            return zzYx0();
        }
        zzBW zzbwZzj = zzBW.zzj((com.aspose.words.internal.zzPV) zzyrl.zzYvW().zzPj(448));
        Object objZzPk = zzyrl.zzYvW().zzPk(449);
        if (objZzPk != null) {
            double dIntValue = ((double) ((Integer) objZzPk).intValue()) / 65536.0d;
            if (!com.aspose.words.internal.zzAN.zzL(dIntValue, 1.0d)) {
                zzBW.zzZ(zzbwZzj, dIntValue);
            }
        }
        zz4G zz4g = new zz4G();
        zz4g.setFill(new zz1C(zzbwZzj));
        zz4g.zzXK(((Integer) zzyrl.zzYvW().zzPj(459)).intValue());
        zz4g.setLineStyle(((Integer) zzyrl.zzYvW().zzPj(461)).intValue());
        return zz4g;
    }
}
