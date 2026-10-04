package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY2T {
    private int zzWXJ;
    private int zzWXK;
    private Shape zzWXL;
    private zzZLU[] zzWXM;
    private com.aspose.words.internal.zzD4 zzWXO = new com.aspose.words.internal.zzD4();
    private com.aspose.words.internal.zzD3<zzZLU> zzWXN = new com.aspose.words.internal.zzD3<>();

    public zzY2T(Shape shape, int i) {
        this.zzWXJ = i;
        this.zzWXM = shape.zzYbo();
        this.zzWXL = shape;
        zzZLU[] zzzluArr = this.zzWXM;
        this.zzWXK = zzzluArr != null ? zzzluArr.length : 0;
    }

    private static boolean zzW(zzZLU zzzlu, int i) {
        if (i == 1) {
            return zzzlu == null || zzzlu.zzZ5H();
        }
        if (i == 2) {
            return zzzlu == null || zzzlu.zzZ5G();
        }
        if (i != 3) {
            return false;
        }
        return zzzlu == null || zzzlu.zzZ5F();
    }

    private int[] zzX(zzZLU zzzlu, int i) {
        int i2 = zzzlu.zzYvr;
        zzZLU zzzluZzy = zzy(1, i2, i2, 1);
        zzZ(zzzlu, 2, zzzluZzy, 1);
        zzZ(zzzlu, 2, zzzluZzy, 2);
        this.zzWXN.set(this.zzWXK, zzzluZzy);
        int i3 = this.zzWXK;
        this.zzWXK = i3 + 1;
        int i4 = zzzlu.zzYvs;
        zzZLU zzzluZzy2 = zzy(1, i4, i4, 1);
        zzZ(zzzlu, 1, zzzluZzy2, 1);
        zzZ(zzzlu, 1, zzzluZzy2, 2);
        this.zzWXN.set(this.zzWXK, zzzluZzy2);
        int i5 = this.zzWXK;
        this.zzWXK = i5 + 1;
        zzZLU zzzluZzy3 = zzy(0, 0, i5 + 1023, i5 + 1024);
        zzZ((zzZLU) null, 1, zzzluZzy3, 2);
        zzZ((zzZLU) null, 1, zzzluZzy3, 3);
        this.zzWXN.set(this.zzWXK, zzzluZzy3);
        int i6 = this.zzWXK;
        this.zzWXK = i6 + 1;
        zzZLU zzzluZzy4 = zzy(13, i6 + 1024, 0, 0);
        zzZ((zzZLU) null, 1, zzzluZzy4, 1);
        this.zzWXN.set(this.zzWXK, zzzluZzy4);
        int i7 = this.zzWXK;
        this.zzWXK = i7 + 1;
        zzZLU zzzluZzy5 = zzy(1, zzzlu.zzYvq, i7 + 1024, zzzlu.zzYvr);
        zzZ(zzzlu, 3, zzzluZzy5, 1);
        zzZ((zzZLU) null, 1, zzzluZzy5, 2);
        zzZ(zzzlu, 2, zzzluZzy5, 3);
        this.zzWXN.set(i, zzzluZzy5);
        return new int[]{i3, i5, i6, i7, i};
    }

    private zz7M zzY(int i, String str, String str2, String str3) {
        if (i == 16) {
            return new zz02(zzq(str, str2, null), new zzY68(), "tan {0} {1}");
        }
        switch (i) {
            case 0:
                return new zz0D(zzq(str, str2, str3), new zzU(), "+- {0} {1} {2}");
            case 1:
                String[] strArrZzq = zzq(str, str2, str3);
                if (com.aspose.words.internal.zzJB.parseInt(str3) == 0) {
                    strArrZzq[2] = "0";
                    strArrZzq[3] = "1";
                }
                return new zz0D(strArrZzq, new zzYWV(), "*/ {0} {1} {2}");
            case 2:
                return new zz0D(zzq(str, str2, "2"), new zzV(), "+/ {0} {1} {2}");
            case 3:
                return new zz4J(zzq(str, null, null), new zzX(), "abs {0}");
            case 4:
                return new zz02(zzq(str, str2, null), new zzYYN(), "min {0} {1}");
            case 5:
                return new zz02(zzq(str, str2, null), new zzYZM(), "max {0} {1}");
            case 6:
                return new zz0D(zzq(str, str2, str3), new zzZ8P(), "?: {0} {1} {2}");
            case 7:
                return new zz0D(zzq(str, str2, str3), new zzYXG(), "mod {0} {1} {2}");
            case 8:
                return new zz02(zzq(str, str2, null), new zz1(), "at2 {0} {1}");
            case 9:
                return new zz02(zzq(str, str2, null), new zzYB7(), "sin {0} {1}");
            case 10:
                return new zz02(zzq(str, str2, null), new zzT5(), "cos {0} {1}");
            case 11:
                return new zz0D(zzq(str, str2, str3), new zzT6(), "cat2 {0} {1} {2}");
            case 12:
                return new zz0D(zzq(str, str2, str3), new zzYB8(), "sat2 {0} {1} {2}");
            case 13:
                return new zz4J(zzq(str, null, null), new zzY9H(), "sqrt {0}");
            default:
                String[] strArrZzq2 = zzq("0", null, null);
                zzY1Z.zzZ(this.zzWXL.getDocument().getWarningCallback(), 65536, 4, "Formula of an unexpected type was replaced to value.");
                return new zz4J(strArrZzq2, new zzZ41(), "val {0}");
        }
    }

    public static int zzZ(zz6U zz6u) {
        int iZzO;
        int i = 0;
        for (zz6W zz6w : zz6u.zzZA1()) {
            if (com.aspose.words.internal.zzZYD.zzg(zz6w.getName(), "T")) {
                int length = zz6w.getName().length();
                String strSubstring = 1 < length ? zz6w.getName().substring(1, length) : "";
                if (com.aspose.words.internal.zzZYD.zzXk(strSubstring)) {
                    double dZzZs = com.aspose.words.internal.zzJB.zzZs(strSubstring);
                    if (!Double.isNaN(dZzZs) && i < (iZzO = com.aspose.words.internal.zzAN.zzO((long) dZzZs, 1))) {
                        i = iZzO;
                    }
                }
            }
        }
        return i;
    }

    private int zzZ4(int i, boolean z) {
        int iZzZyh;
        int iZzZyj;
        if (z) {
            return i - 1024;
        }
        if (i == 339) {
            return this.zzWXL.zzYbm();
        }
        if (i == 340) {
            return this.zzWXL.zzYbl();
        }
        if (i == 508) {
            return this.zzWXL.getStroked() ? 1 : 0;
        }
        switch (i) {
            case StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_6 /* 320 */:
                iZzZyh = this.zzWXL.zzZyh();
                iZzZyj = this.zzWXL.zzZyj() / 2;
                break;
            case StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_6 /* 321 */:
                iZzZyh = this.zzWXL.zzZyg();
                iZzZyj = this.zzWXL.zzZyi() / 2;
                break;
            case StyleIdentifier.LIST_TABLE_1_LIGHT /* 322 */:
                return this.zzWXL.zzZyj();
            case StyleIdentifier.LIST_TABLE_2 /* 323 */:
                return this.zzWXL.zzZyi();
            default:
                switch (i) {
                    case StyleIdentifier.LIST_TABLE_6_COLORFUL /* 327 */:
                        return this.zzWXL.zzmi(1);
                    case StyleIdentifier.LIST_TABLE_7_COLORFUL /* 328 */:
                        return this.zzWXL.zzmi(2);
                    case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_1 /* 329 */:
                        return this.zzWXL.zzmi(3);
                    case StyleIdentifier.LIST_TABLE_2_ACCENT_1 /* 330 */:
                        return this.zzWXL.zzmi(4);
                    case StyleIdentifier.LIST_TABLE_3_ACCENT_1 /* 331 */:
                        return this.zzWXL.zzmi(5);
                    case StyleIdentifier.LIST_TABLE_4_ACCENT_1 /* 332 */:
                        return this.zzWXL.zzmi(6);
                    case StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_1 /* 333 */:
                        return this.zzWXL.zzmi(7);
                    case StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_1 /* 334 */:
                        return this.zzWXL.zzmi(8);
                    default:
                        switch (i) {
                            case 1271:
                                return (int) com.aspose.words.internal.zzSA.zzYz((int) this.zzWXL.getStrokeWeight());
                            case 1272:
                                return (int) ConvertUtil.pointToPixel(this.zzWXL.getWidth());
                            case 1273:
                                return (int) ConvertUtil.pointToPixel(this.zzWXL.getHeight());
                            default:
                                switch (i) {
                                    case 1276:
                                        return com.aspose.words.internal.zzSA.zzp(this.zzWXL.getWidth());
                                    case 1277:
                                        return com.aspose.words.internal.zzSA.zzp(this.zzWXL.getHeight());
                                    case 1278:
                                        return com.aspose.words.internal.zzSA.zzp(this.zzWXL.getWidth() * 0.5d);
                                    case 1279:
                                        return com.aspose.words.internal.zzSA.zzp(this.zzWXL.getHeight() * 0.5d);
                                    default:
                                        zzY1Z.zzZ(this.zzWXL.getDocument().getWarningCallback(), 65536, 4, "Calculated parameter of an unexpected type was replaced with value.");
                                        return 0;
                                }
                        }
                }
        }
        return iZzZyj + iZzZyh;
    }

    private static boolean zziu(int i) {
        return i < 1024 || i > 1151;
    }

    private static int zziv(int i) {
        int iAbs = Math.abs(i) % 65536;
        return i >= 0 ? iAbs : 65536 - iAbs;
    }

    private zzZLU zziw(int i) {
        return this.zzWXN.zzVE(i) ? this.zzWXN.get(i) : this.zzWXM[i];
    }

    public static String zzix(int i) {
        return com.aspose.words.internal.zzZKN.format("T{0}", Integer.valueOf(i));
    }

    private static String[] zzq(String str, String str2, String str3) {
        if (str != null && str2 == null && str3 == null) {
            String[] strArr = new String[2];
            strArr[1] = str;
            return strArr;
        }
        if (str != null && str2 != null && str3 == null) {
            String[] strArr2 = new String[3];
            strArr2[1] = str;
            strArr2[2] = str2;
            return strArr2;
        }
        String[] strArr3 = new String[4];
        strArr3[1] = str;
        strArr3[2] = str2;
        strArr3[3] = str3;
        return strArr3;
    }

    private static zzZLU zzy(int i, int i2, int i3, int i4) {
        zzZLU zzzlu = new zzZLU();
        zzzlu.zzYvt = i;
        zzzlu.zzYvs = i2;
        zzzlu.zzYvr = i3;
        zzzlu.zzYvq = i4;
        return zzzlu;
    }

    public final com.aspose.words.internal.zzD4 zzXTB() {
        return this.zzWXO;
    }

    public final int zzXTC() {
        int i = this.zzWXJ;
        this.zzWXJ = i + 1;
        return i;
    }

    public final com.aspose.words.internal.zzZYV<zz7M> zziy(int i) {
        com.aspose.words.internal.zzZYV<zz7M> zzzyv = new com.aspose.words.internal.zzZYV<>();
        if (this.zzWXM != null && i >= 0 && i <= r1.length - 1) {
            zzZ((zz7M) null, zzzyv, i, 0);
        }
        return zzzyv;
    }

    private void zzZ(zz7M zz7m, com.aspose.words.internal.zzZYV<zz7M> zzzyv, int i, int i2) {
        for (int i3 : zzZ(zziw(i), i)) {
            if (this.zzWXO.zzVE(i3)) {
                zzZ(zz7m, i3, i2);
            } else {
                zzZLU zzzluZziw = zziw(i3);
                zz7M zz7mZzZ = zzZ(zzzluZziw);
                this.zzWXO.set(i3, -1);
                if (zzzluZziw.zzZ5H() && !zziu(zzzluZziw.zzYvs)) {
                    zzZ(zz7mZzZ, zzzyv, zzZ4(zzzluZziw.zzYvs, true), 1);
                }
                if (zzzluZziw.zzZ5G() && !zziu(zzzluZziw.zzYvr)) {
                    zzZ(zz7mZzZ, zzzyv, zzZ4(zzzluZziw.zzYvr, true), 2);
                }
                if (zzzluZziw.zzZ5F() && !zziu(zzzluZziw.zzYvq)) {
                    zzZ(zz7mZzZ, zzzyv, zzZ4(zzzluZziw.zzYvq, true), 3);
                }
                int i4 = this.zzWXO.get(i3);
                if (i4 < 0) {
                    i4 = this.zzWXJ;
                    this.zzWXJ = i4 + 1;
                }
                zzzyv.add(i4, zz7mZzZ);
                this.zzWXO.set(i3, i4);
                zzZ(zz7m, i3, i2);
                zzZ(zz7mZzZ);
            }
        }
    }

    private static void zzZ(zz7M zz7m) {
        zz4J zz4j = (zz4J) com.aspose.words.internal.zzZKW.zzZ(zz7m, zz4J.class);
        if (zz4j != null) {
            zz7m.zzOE(com.aspose.words.internal.zzZKN.format(zz7m.getSource(), zz4j.zzZxO()));
        }
        zz02 zz02Var = (zz02) com.aspose.words.internal.zzZKW.zzZ(zz7m, zz02.class);
        if (zz02Var != null) {
            zz7m.zzOE(com.aspose.words.internal.zzZKN.format(zz7m.getSource(), zz02Var.zzZxO(), zz02Var.zzZsm()));
        }
        zz0D zz0d = (zz0D) com.aspose.words.internal.zzZKW.zzZ(zz7m, zz0D.class);
        if (zz0d != null) {
            zz7m.zzOE(com.aspose.words.internal.zzZKN.format(zz7m.getSource(), zz0d.zzZxO(), zz0d.zzZsm(), zz0d.zzZsl()));
        }
    }

    private void zzZ(zz7M zz7m, int i, int i2) {
        if (i2 > 3 || i2 <= 0 || zz7m == null) {
            return;
        }
        int i3 = this.zzWXO.get(i);
        if (i3 < 0) {
            this.zzWXO.set(i, this.zzWXJ);
            i3 = this.zzWXJ;
            this.zzWXJ = i3 + 1;
        }
        String strZzix = zzix(i3);
        zz4J zz4j = (zz4J) com.aspose.words.internal.zzZKW.zzZ(zz7m, zz4J.class);
        if (zz4j != null && i2 == 1) {
            zz4j.zzOs(strZzix);
        }
        zz02 zz02Var = (zz02) com.aspose.words.internal.zzZKW.zzZ(zz7m, zz02.class);
        if (zz02Var != null) {
            if (i2 == 1) {
                zz02Var.zzOs(strZzix);
            } else if (i2 == 2) {
                zz02Var.zzOh(strZzix);
            }
        }
        zz0D zz0d = (zz0D) com.aspose.words.internal.zzZKW.zzZ(zz7m, zz0D.class);
        if (zz0d != null) {
            if (i2 == 1) {
                zz0d.zzOs(strZzix);
            } else if (i2 == 2) {
                zz0d.zzOh(strZzix);
            } else if (i2 == 3) {
                zz0d.zzOg(strZzix);
            }
        }
    }

    private int[] zzY(zzZLU zzzlu, int i) {
        zzZLU zzzluZzy = zzy(1, zzzlu.zzYvr, 255, 1);
        zzZ(zzzlu, 2, zzzluZzy, 1);
        this.zzWXN.set(this.zzWXK, zzzluZzy);
        int i2 = this.zzWXK;
        this.zzWXK = i2 + 1;
        zzZLU zzzluZzy2 = zzy(1, zzzlu.zzYvq, 255, 1);
        zzZ(zzzlu, 3, zzzluZzy2, 1);
        this.zzWXN.set(this.zzWXK, zzzluZzy2);
        int i3 = this.zzWXK;
        this.zzWXK = i3 + 1;
        zzZLU zzzluZzy3 = zzy(0, zzzlu.zzYvs, i3 + 1023, i3 + 1024);
        zzZ(zzzlu, 1, zzzluZzy3, 1);
        zzZ((zzZLU) null, 1, zzzluZzy3, 2);
        zzZ((zzZLU) null, 1, zzzluZzy3, 3);
        this.zzWXN.set(i, zzzluZzy3);
        return new int[]{i2, i3, i};
    }

    private zz7M zzZ(zzZLU zzzlu) {
        int iZziv = zzzlu.zzYvs;
        int iZziv2 = zzzlu.zzYvr;
        int iZziv3 = zzzlu.zzYvq;
        if (zzzlu.zzZ5H() && zziu(zzzlu.zzYvs)) {
            iZziv = zzZ4(zzzlu.zzYvs, false);
        }
        if (zzzlu.zzZ5G() && zziu(zzzlu.zzYvr)) {
            iZziv2 = zzZ4(zzzlu.zzYvr, false);
        }
        if (zzzlu.zzZ5F() && zziu(zzzlu.zzYvq)) {
            iZziv3 = zzZ4(zzzlu.zzYvq, false);
        }
        if (!zzzlu.zzZ5H()) {
            iZziv = zziv(iZziv);
        }
        if (!zzzlu.zzZ5G()) {
            iZziv2 = zziv(iZziv2);
        }
        if (!zzzlu.zzZ5F()) {
            iZziv3 = zziv(iZziv3);
        }
        return zzY(zzzlu.zzYvt, com.aspose.words.internal.zzJB.zzWD(iZziv), com.aspose.words.internal.zzJB.zzWD(iZziv2), com.aspose.words.internal.zzJB.zzWD(iZziv3));
    }

    private int[] zzZ(zzZLU zzzlu, int i) {
        int i2 = zzzlu.zzYvt;
        if (i2 == 15) {
            return zzX(zzzlu, i);
        }
        if (i2 == 14) {
            return zzY(zzzlu, i);
        }
        return new int[]{i};
    }

    private static void zzZ(zzZLU zzzlu, int i, zzZLU zzzlu2, int i2) {
        if (i2 == 1) {
            zzzlu2.zzZjA |= zzW(zzzlu, i) ? 32 : 0;
        } else if (i2 == 2) {
            zzzlu2.zzZjA |= zzW(zzzlu, i) ? 64 : 0;
        } else {
            if (i2 != 3) {
                return;
            }
            zzzlu2.zzZjA |= zzW(zzzlu, i) ? 128 : 0;
        }
    }
}
