package com.aspose.words;

import com.alibaba.sdk.android.oss.common.RequestParameters;

/* JADX INFO: loaded from: classes6.dex */
final class zzY2R {
    private zzY37 zzWXI;
    private zzZLU[] zzWXM;
    private int[] zzWXf;
    private zzYM5[] zzWXg;
    private zzYM4[] zzWXh;
    private String zzWXi;
    private int zzWXj;
    private int zzWXk;
    private boolean zzWXl;
    private boolean zzWXm;
    private boolean zzWXq;
    private zzZL3[] zzXQP;
    private zzYU6 zzXSu;
    private zzYM5[] zzZ3t;
    private zzYM6[] zzZ3u;
    private ShapeBase zzZBi;
    private boolean zzWXp = true;
    private boolean zzWXo = true;
    private boolean zzWXn = true;
    private boolean zzZ0x = true;
    private String[] zzWXe = new String[10];

    public zzY2R(ShapeBase shapeBase, zzYU6 zzyu6) {
        this.zzXSu = zzyu6;
        this.zzWXI = new zzY37(zzyu6);
        this.zzZBi = shapeBase;
    }

    private static String zzD(String... strArr) {
        StringBuilder sb = new StringBuilder(32);
        com.aspose.words.internal.zzZNH.zzU(sb, strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            sb.append(ControlChar.SPACE_CHAR);
            com.aspose.words.internal.zzZNH.zzU(sb, strArr[i]);
        }
        return sb.toString();
    }

    private static String zzW(zzYM2 zzym2) {
        if (!zzym2.zzYnC()) {
            return Integer.toString(zzym2.getValue());
        }
        int value = zzym2.getValue();
        if (value == 0) {
            return "topLeft";
        }
        if (value == 1) {
            return "bottomRight";
        }
        if (value == 2) {
            return "center";
        }
        if (zzym2.getValue() < 256) {
            StringBuilder sb = new StringBuilder("@");
            sb.append(zzym2.getValue() - 3);
            return sb.toString();
        }
        return "#" + (zzym2.getValue() - 256);
    }

    private static String zzX(zzYM2 zzym2) {
        if (!zzym2.zzYnC()) {
            return com.aspose.words.internal.zzJB.zzWz(zzym2.getValue());
        }
        return "@" + zzym2.getValue();
    }

    private void zzXTp() {
        zzYM4[] zzym4Arr = this.zzWXh;
        if (zzym4Arr != null) {
            this.zzXSu.zz0("textboxrect", zzY(zzym4Arr));
        } else if (this.zzZBi.hasChildNodes() && this.zzZBi.getShapeType() == 202) {
            this.zzXSu.zz0("textboxrect", zzY(((Shape) this.zzZBi).zzYaD()));
        }
    }

    private void zzXTq() {
        int[] iArr = this.zzWXf;
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(32);
        int i = 0;
        while (true) {
            int[] iArr2 = this.zzWXf;
            if (i >= iArr2.length) {
                sb.delete(sb.length() - 1, sb.length());
                this.zzXSu.zz0("o:connectangles", sb.toString());
                return;
            } else {
                com.aspose.words.internal.zzZNH.zzU(sb, zzY23.zzie(iArr2[i]));
                sb.append(',');
                i++;
            }
        }
    }

    private void zzXTr() {
        zzYM5[] zzym5Arr = this.zzWXg;
        if (zzym5Arr == null || zzym5Arr.length <= 0) {
            return;
        }
        this.zzXSu.zz0("o:connectlocs", zzY23.zzZ(zzym5Arr, ',', ';'));
    }

    private boolean zzXTs() {
        return this.zzWXh != null;
    }

    private boolean zzXTt() {
        int[] iArr = this.zzWXf;
        return iArr != null && iArr.length > 0;
    }

    private boolean zzXTu() {
        zzYM5[] zzym5Arr = this.zzWXg;
        return zzym5Arr != null && zzym5Arr.length > 0;
    }

    private boolean zzXTv() {
        String str = this.zzWXi;
        return (str == null || "none".equals(str)) ? false : true;
    }

    private boolean zzXTw() {
        return this.zzWXq || !this.zzWXp || !this.zzWXo || !this.zzWXn || !this.zzZ0x || this.zzWXm || this.zzWXl || zzXTv() || zzXTu() || zzXTt() || zzXTs();
    }

    private static String zzXX(String str, String str2) {
        return com.aspose.words.internal.zzZKN.format("{0},{1}", str, str2);
    }

    private static String zzY(zzYM4[] zzym4Arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < zzym4Arr.length; i++) {
            zzYM4 zzym4 = zzym4Arr[i];
            com.aspose.words.internal.zzZNH.zzU(sb, zzY23.zzX(zzym4.zzXFj));
            sb.append(',');
            com.aspose.words.internal.zzZNH.zzU(sb, zzY23.zzX(zzym4.zzXFi));
            sb.append(',');
            com.aspose.words.internal.zzZNH.zzU(sb, zzY23.zzX(zzym4.zzXFh));
            sb.append(',');
            com.aspose.words.internal.zzZNH.zzU(sb, zzY23.zzX(zzym4.zzXFg));
            if (i < zzym4Arr.length - 1) {
                com.aspose.words.internal.zzZNH.zzU(sb, ";");
            }
        }
        return sb.toString();
    }

    private void zzZ(String str, zzYM2 zzym2, zzYM2 zzym22) {
        this.zzXSu.zzX(str, zzXX(zzW(zzym2), zzW(zzym22)));
    }

    private static String zzZ3(int i, boolean z) {
        if (!z) {
            return com.aspose.words.internal.zzJB.zzWF(i);
        }
        if (i == 339) {
            return "xlimo";
        }
        if (i == 340) {
            return "ylimo";
        }
        if (i == 508) {
            return "lineDrawn";
        }
        switch (i) {
            case StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_6 /* 320 */:
                return "xcenter";
            case StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_6 /* 321 */:
                return "ycenter";
            case StyleIdentifier.LIST_TABLE_1_LIGHT /* 322 */:
                return "width";
            case StyleIdentifier.LIST_TABLE_2 /* 323 */:
                return "height";
            default:
                switch (i) {
                    case 1271:
                        return "pixelLineWidth";
                    case 1272:
                        return "pixelWidth";
                    case 1273:
                        return "pixelHeight";
                    default:
                        switch (i) {
                            case 1276:
                                return "emuWidth";
                            case 1277:
                                return "emuHeight";
                            case 1278:
                                return "emuWidth2";
                            case 1279:
                                return "emuHeight2";
                            default:
                                if (i >= 1024) {
                                    return "@" + (i - 1024);
                                }
                                if (i < 327 || i > 334) {
                                    throw new IllegalStateException("Unrecognized operand value in the formula.");
                                }
                                return "#" + (i - StyleIdentifier.LIST_TABLE_6_COLORFUL);
                        }
                }
        }
    }

    public final void zzXTA() {
        if (this.zzZBi.getShapeType() == 2) {
            return;
        }
        if (this.zzZBi.getShapeType() == 100) {
            String[] strArr = this.zzWXe;
            if (strArr[0] == null) {
                strArr[0] = "-11796480";
            }
            if (strArr[2] == null) {
                strArr[2] = "5400";
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 9; i++) {
            String str = this.zzWXe[i];
            if (str != null) {
                com.aspose.words.internal.zzZNH.zzU(sb, str);
            }
            sb.append(',');
        }
        this.zzWXI.zzN("adj", com.aspose.words.internal.zzZKN.zzT(sb.toString(), ','));
    }

    public final void zzXTo() {
        zzZL3[] zzzl3Arr = this.zzXQP;
        if (zzzl3Arr == null || zzzl3Arr.length <= 0) {
            return;
        }
        this.zzXSu.zzY("v:handles");
        int i = 0;
        while (true) {
            zzZL3[] zzzl3Arr2 = this.zzXQP;
            if (i >= zzzl3Arr2.length) {
                this.zzXSu.zzp();
                return;
            }
            zzZL3 zzzl3 = zzzl3Arr2[i];
            this.zzXSu.zzY("v:h");
            zzZ(RequestParameters.POSITION, new zzYM2(zzzl3.zzYu1.zzZ51(), true), new zzYM2(zzzl3.zzYu0.zzZ51(), true));
            if (zzzl3.zzYu4) {
                this.zzXSu.zzX("switch", "");
            }
            if (zzzl3.zzYu5) {
                zzZ("polar", zzzl3.zzYtZ, zzzl3.zzYtY);
            }
            if (zzzl3.zzYu6) {
                zzZ("map", zzzl3.zzYtZ, zzzl3.zzYtY);
            }
            if (zzzl3.zzYu8) {
                zzZ("radiusrange", zzzl3.zzYtX, zzzl3.zzYtW);
            }
            if (zzzl3.zzYu7) {
                if (zzzl3.zzYtX.getValue() != Integer.MIN_VALUE || zzzl3.zzYtW.getValue() != Integer.MAX_VALUE) {
                    zzZ("xrange", zzzl3.zzYtX, zzzl3.zzYtW);
                }
                if (zzzl3.zzYtV.getValue() != Integer.MIN_VALUE || zzzl3.zzYtU.getValue() != Integer.MAX_VALUE) {
                    zzZ("yrange", zzzl3.zzYtV, zzzl3.zzYtU);
                }
            }
            this.zzXSu.zzp();
            i++;
        }
    }

    public final void zzXTx() {
        if (zzXTw()) {
            this.zzXSu.zzY("v:path");
            this.zzWXI.zzK("arrowok", this.zzWXq, false);
            this.zzWXI.zzK("fillok", this.zzWXp, true);
            this.zzWXI.zzK("strokeok", this.zzWXo, true);
            this.zzWXI.zzK("shadowok", this.zzWXn, true);
            this.zzWXI.zzK("o:extrusionok", this.zzZ0x, true);
            this.zzWXI.zzK("gradientshapeok", this.zzWXm, false);
            this.zzWXI.zzK("textpathok", this.zzWXl, false);
            int i = this.zzWXk;
            if (i != 0 || this.zzWXj != 0) {
                this.zzXSu.zz0("limo", com.aspose.words.internal.zzZKN.format("{0},{1}", Integer.valueOf(i), Integer.valueOf(this.zzWXj)));
            }
            zzYM5[] zzym5Arr = this.zzWXg;
            if (zzym5Arr == null || zzym5Arr.length <= 0 || this.zzWXi != null) {
                this.zzXSu.zzA("o:connecttype", this.zzWXi, "none");
            } else {
                this.zzXSu.zz0("o:connecttype", "custom");
            }
            zzXTr();
            zzXTq();
            zzXTp();
            this.zzXSu.zzp();
        }
    }

    public final void zzXTy() {
        if (this.zzWXM == null) {
            return;
        }
        this.zzXSu.zzY("v:formulas");
        int i = 0;
        while (true) {
            zzZLU[] zzzluArr = this.zzWXM;
            if (i >= zzzluArr.length) {
                this.zzXSu.zzp();
                return;
            }
            zzZLU zzzlu = zzzluArr[i];
            this.zzXSu.zzY("v:f");
            this.zzXSu.zzX("eqn", zzY(zzzlu));
            this.zzXSu.zzp();
            i++;
        }
    }

    public final void zzXTz() {
        zzYM6[] zzym6Arr;
        zzYM5[] zzym5Arr = this.zzZ3t;
        if (zzym5Arr == null || zzym5Arr.length == 0 || (zzym6Arr = this.zzZ3u) == null || zzym6Arr.length == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        while (true) {
            zzYM6[] zzym6Arr2 = this.zzZ3u;
            if (i >= zzym6Arr2.length) {
                this.zzXSu.zz0("path", sb.toString());
                return;
            }
            zzYM6 zzym6 = zzym6Arr2[i];
            com.aspose.words.internal.zzZNH.zzU(sb, zzY30.zziE(zzym6.zzYnL()));
            int iZzYnJ = zzym6.zzYnJ();
            for (int i3 = 0; i3 < iZzYnJ; i3++) {
                zzYM5[] zzym5Arr2 = this.zzZ3t;
                if (i2 >= zzym5Arr2.length) {
                    throw new IllegalStateException("Not enough parameters in geometry path.");
                }
                zzYM5 zzym5 = zzym5Arr2[i2];
                com.aspose.words.internal.zzZNH.zzU(sb, zzX(zzym5.zzYnG()));
                sb.append(',');
                com.aspose.words.internal.zzZNH.zzU(sb, zzX(zzym5.zzYnF()));
                sb.append(',');
                i2++;
            }
            if (iZzYnJ > 0) {
                sb.delete(sb.length() - 1, sb.length());
            }
            i++;
        }
    }

    public final void zzZP(int i, Object obj) {
        if (i == 507) {
            this.zzWXq = ((Boolean) obj).booleanValue();
            return;
        }
        switch (i) {
            case StyleIdentifier.LIST_TABLE_4 /* 325 */:
                this.zzZ3t = (zzYM5[]) obj;
                break;
            case StyleIdentifier.LIST_TABLE_5_DARK /* 326 */:
                this.zzZ3u = (zzYM6[]) obj;
                break;
            case StyleIdentifier.LIST_TABLE_6_COLORFUL /* 327 */:
            case StyleIdentifier.LIST_TABLE_7_COLORFUL /* 328 */:
            case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_1 /* 329 */:
            case StyleIdentifier.LIST_TABLE_2_ACCENT_1 /* 330 */:
            case StyleIdentifier.LIST_TABLE_3_ACCENT_1 /* 331 */:
            case StyleIdentifier.LIST_TABLE_4_ACCENT_1 /* 332 */:
            case StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_1 /* 333 */:
            case StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_1 /* 334 */:
            case StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_1 /* 335 */:
            case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_2 /* 336 */:
                this.zzWXe[i - 327] = com.aspose.words.internal.zzJB.zzWF(((Integer) obj).intValue());
                break;
            case StyleIdentifier.LIST_TABLE_2_ACCENT_2 /* 337 */:
                this.zzWXg = (zzYM5[]) obj;
                break;
            case StyleIdentifier.LIST_TABLE_3_ACCENT_2 /* 338 */:
                this.zzWXf = (int[]) obj;
                break;
            case StyleIdentifier.LIST_TABLE_4_ACCENT_2 /* 339 */:
                this.zzWXk = ((Integer) obj).intValue();
                break;
            case StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2 /* 340 */:
                this.zzWXj = ((Integer) obj).intValue();
                break;
            case StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_2 /* 341 */:
                this.zzXQP = (zzZL3[]) obj;
                break;
            case StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_2 /* 342 */:
                this.zzWXM = (zzZLU[]) obj;
                break;
            case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_3 /* 343 */:
                this.zzWXh = (zzYM4[]) obj;
                break;
            case StyleIdentifier.LIST_TABLE_2_ACCENT_3 /* 344 */:
                this.zzWXi = zzY30.zzj4(((Integer) obj).intValue());
                break;
            default:
                switch (i) {
                    case StyleIdentifier.length /* 378 */:
                        this.zzWXn = ((Boolean) obj).booleanValue();
                        break;
                    case 379:
                        this.zzZ0x = ((Boolean) obj).booleanValue();
                        break;
                    case 380:
                        this.zzWXo = ((Boolean) obj).booleanValue();
                        break;
                    case 381:
                        this.zzWXl = ((Boolean) obj).booleanValue();
                        break;
                    case 382:
                        this.zzWXm = ((Boolean) obj).booleanValue();
                        break;
                    case 383:
                        this.zzWXp = ((Boolean) obj).booleanValue();
                        break;
                }
                break;
        }
    }

    private static String zzY(zzZLU zzzlu) {
        int i = zzzlu.zzYvt;
        if (i == 0 && zzzlu.zzYvr == 0 && zzzlu.zzYvq == 0) {
            return zzD("val", zzZ3(zzzlu.zzYvs, zzzlu.zzZ5H()));
        }
        String strZzj9 = zzY30.zzj9(i);
        int i2 = zzzlu.zzYvt;
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4 && i2 != 5) {
                    if (i2 != 13) {
                        switch (i2) {
                            case 8:
                            case 9:
                            case 10:
                                break;
                            default:
                                return zzD(strZzj9, zzZ3(zzzlu.zzYvs, zzzlu.zzZ5H()), zzZ3(zzzlu.zzYvr, zzzlu.zzZ5G()), zzZ3(zzzlu.zzYvq, zzzlu.zzZ5F()));
                        }
                    }
                }
            }
            return zzD(strZzj9, zzZ3(zzzlu.zzYvs, zzzlu.zzZ5H()));
        }
        return zzD(strZzj9, zzZ3(zzzlu.zzYvs, zzzlu.zzZ5H()), zzZ3(zzzlu.zzYvr, zzzlu.zzZ5G()));
    }
}
