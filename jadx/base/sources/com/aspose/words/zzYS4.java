package com.aspose.words;

import com.google.logging.type.LogSeverity;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes6.dex */
final class zzYS4 {
    private zzYTG zzXQU;
    private int[] zzXQt;
    private zzZLU[] zzXQu = null;
    private zzYOR zzXRT;

    public zzYS4(zzYOR zzyor) {
        this.zzXRT = zzyor;
        this.zzXQU = zzyor.zzYsG();
    }

    private static boolean zz5(int i, int i2, int i3) {
        return (i == 162 || i == 161) && ((i2 - i3) + 1) % 3 == 0;
    }

    private void zz7(Shape shape) {
        zzYTG zzytg = this.zzXQU;
        zzytg.zz0("draw:type", "non-primitive");
        Object objZzPk = shape.zzYvW().zzPk(StyleIdentifier.LIST_TABLE_6_COLORFUL);
        int iZzR = objZzPk == null ? 0 : zzYOU.zzR(((Integer) objZzPk).intValue(), this.zzXRT.zzYuu());
        int iZzR2 = zzYOU.zzR(21600, this.zzXRT.zzYuu());
        String str = com.aspose.words.internal.zzZKN.format("M {0} 0 X 0 {0} L 0 {1} Y {0} {2} L {1} {2} X {2} {1} L {2} {0} Y {1} 0 Z N", Integer.valueOf(iZzR), Integer.valueOf(iZzR2 - iZzR), Integer.valueOf(iZzR2));
        zzytg.zzZj("draw:modifiers", iZzR);
        zzytg.zz0("svg:viewBox", com.aspose.words.internal.zzZKN.format("0 0 {0} {0}", Integer.valueOf(iZzR2)));
        zzytg.zz0("draw:enhanced-path", str);
        zza(shape);
    }

    private void zz8(Shape shape) {
        int i;
        zzYM5[] zzym5ArrZzYbp = shape.zzYbp();
        if (zzym5ArrZzYbp == null) {
            return;
        }
        String str = "";
        String str2 = str;
        int i2 = 0;
        for (zzYM6 zzym6 : shape.zzYbq()) {
            int iZzYnL = zzym6.zzYnL();
            if (iZzYnL != -1) {
                String strZzsw = zzYS3.zzsw(iZzYnL);
                if (com.aspose.words.internal.zzZYD.zzXk(strZzsw)) {
                    int iZzYnJ = zzym6.zzYnJ();
                    if (!com.aspose.words.internal.zzZKN.equals(str2, strZzsw) && !zzYn(strZzsw, str2)) {
                        str = com.aspose.words.internal.zzZKN.format("{0} {1}", str, strZzsw);
                    }
                    int i3 = i2;
                    while (true) {
                        i = i2 + iZzYnJ;
                        if (i3 >= i) {
                            break;
                        }
                        zzYM5 zzym5 = zzym5ArrZzYbp[i3];
                        boolean zZz5 = zz5(iZzYnL, i3, i2);
                        str = com.aspose.words.internal.zzZKN.format("{0} {1} {2}", str, zzZ(zzym5.zzYnG(), zZz5), zzZ(zzym5.zzYnF(), zZz5));
                        i3++;
                    }
                    str2 = strZzsw;
                    i2 = i;
                }
            }
        }
        this.zzXQU.zz0("draw:enhanced-path", com.aspose.words.internal.zzZKN.zzTX(str));
    }

    private void zz9(Shape shape) {
        zzYC3 zzyc3Zzm2;
        String str = "";
        for (int i = 0; i < 10; i++) {
            zzYC3 zzyc3ZzYvW = shape.zzYvW();
            int i2 = i + StyleIdentifier.LIST_TABLE_6_COLORFUL;
            Object objZzPk = zzyc3ZzYvW.zzPk(i2);
            if (objZzPk == null && (zzyc3Zzm2 = zzYBW.zzm2(shape.getShapeType())) != null) {
                objZzPk = zzyc3Zzm2.zzPk(i2);
            }
            if (objZzPk != null) {
                str = com.aspose.words.internal.zzZKN.format("{0} {1}", str, com.aspose.words.internal.zzJB.zzWF(zzYOU.zzR(((Integer) objZzPk).intValue(), this.zzXRT.zzYuu())));
            }
        }
        this.zzXQU.zz0("draw:modifiers", com.aspose.words.internal.zzZKN.zzTX(str));
    }

    private void zzS(int i, int i2, String str) {
        if (i == i2 || i == 3) {
            this.zzXQU.zz0(str, TelemetryEventStrings.Value.TRUE);
        }
    }

    private void zzT(String str, String str2, String str3, String str4) {
        this.zzXQU.zz0(str, com.aspose.words.internal.zzZKN.format("({0} {1} {2})", str2, str3, str4));
    }

    private void zzU(zzYS2 zzys2) {
        zzYTG zzytg = this.zzXQU;
        boolean z = zzys2.zzXPP;
        String str = TelemetryEventStrings.Value.FALSE;
        zzytg.zz0("draw:extrusion-light-face", z ? "" : TelemetryEventStrings.Value.FALSE);
        this.zzXQU.zz0("draw:extrusion-first-light-harsh", zzys2.zzXPO ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        this.zzXQU.zz0("draw:extrusion-first-light-level", zzYOU.zzrr(zzys2.zzXQ3));
        zzT("draw:extrusion-first-light-direction", zzYOU.zzrr(zzys2.zzXQ2), zzYOU.zzrr(zzys2.zzXQ1), zzYOU.zzrr(zzys2.zzXQ0));
        zzYTG zzytg2 = this.zzXQU;
        if (zzys2.zzXPN) {
            str = TelemetryEventStrings.Value.TRUE;
        }
        zzytg2.zz0("draw:extrusion-second-light-harsh", str);
        this.zzXQU.zz0("draw:extrusion-second-light-level", zzYOU.zzrr(zzys2.zzXPZ));
        zzT("draw:extrusion-second-light-direction", zzYOU.zzrr(zzys2.zzXPY), zzYOU.zzrr(zzys2.zzXPX), zzYOU.zzrr(zzys2.zzXPW));
    }

    private static boolean zzV(zzYS2 zzys2) {
        return zzys2.zzXQ5 == 32768 && zzys2.zzXQ4 == -32768;
    }

    private void zzW(zzYC3 zzyc3) {
        Object objZzPk = zzyc3.zzPk(LogSeverity.ALERT_VALUE);
        if (objZzPk == null || !((Boolean) objZzPk).booleanValue()) {
            return;
        }
        zzYS2 zzys2ZzV = zzV(zzyc3);
        zzYTG zzytg = this.zzXQU;
        String str = TelemetryEventStrings.Value.TRUE;
        zzytg.zz0("draw:extrusion", TelemetryEventStrings.Value.TRUE);
        zzT(zzys2ZzV);
        zzU(zzys2ZzV);
        zzW(zzys2ZzV);
        zzT("draw:extrusion-viewpoint", this.zzXRT.zzr1(zzys2ZzV.zzXQ8), this.zzXRT.zzr1(zzys2ZzV.zzXQ7), this.zzXRT.zzr1(zzys2ZzV.zzXQ6));
        this.zzXQU.zz0("dr3d:shade-mode", zzys2ZzV.zzYIR == 1 ? "draft" : "");
        this.zzXQU.zz0("dr3d:projection", zzys2ZzV.zzXPQ ? "" : "perspective");
        zzX(zzys2ZzV);
        zzx("draw:extrusion-skew", com.aspose.words.internal.zzJB.zzWF(zzys2ZzV.zzXQi), zzYOU.zzrr(zzys2ZzV.zzXQh));
        zzY(zzys2ZzV);
        this.zzXQU.zz0("draw:extrusion-color", zzys2ZzV.zzXPR ? TelemetryEventStrings.Value.TRUE : "");
        zzYTG zzytg2 = this.zzXQU;
        int i = zzys2ZzV.zzXQa;
        zzytg2.zz0("draw:extrusion-specularity", i == 0 ? "" : zzYOU.zzro(i));
        zzYTG zzytg3 = this.zzXQU;
        int i2 = zzys2ZzV.zzXQ9;
        zzytg3.zz0("draw:extrusion-diffusion", i2 == 1 ? "" : zzYOU.zzro(i2));
        zzYTG zzytg4 = this.zzXQU;
        if (!zzys2ZzV.zzXPS) {
            str = "";
        }
        zzytg4.zz0("draw:extrusion-metal", str);
        this.zzXQU.zz0("draw:extrusion-brightness", zzYOU.zzro(zzys2ZzV.zzXQb));
        zzZ(zzys2ZzV);
    }

    private void zzX(zzYS2 zzys2) {
        int i = zzys2.zzXQg;
        if (i == 0 && zzys2.zzXQf == 0) {
            return;
        }
        zzx("draw:extrusion-rotation-angle", zzYOU.zzrr(i), zzYOU.zzrr(zzys2.zzXQf));
    }

    private void zzY(zzYS2 zzys2) {
        int i = zzys2.zzXQd;
        if (i == 457200 && zzys2.zzXQc == 0) {
            return;
        }
        String strZzr1 = this.zzXRT.zzr1(i);
        int i2 = zzys2.zzXQc;
        zzx("draw:extrusion-depth", strZzr1, i2 > zzys2.zzXQd ? "0.5" : com.aspose.words.internal.zzJB.zzZT(((double) i2) / 12700.0d));
    }

    private static boolean zzYn(String str, String str2) {
        if ("X".equals(str) || "Y".equals(str)) {
            return "X".equals(str2) || "Y".equals(str2);
        }
        return false;
    }

    private void zzZ(zzYS2 zzys2) {
        int i = zzys2.zzXQe;
        if (i == 5) {
            return;
        }
        this.zzXQU.zz0("draw:extrusion-shininess", com.aspose.words.internal.zzZKN.format("{0}%", com.aspose.words.internal.zzJB.zzWF(i * 10)));
    }

    private void zzZO(ShapeBase shapeBase) {
        this.zzXQU.zz0("svg:viewBox", com.aspose.words.internal.zzZKN.format("{0} {1} {2} {3}", 0, 0, Integer.valueOf(zzYOU.zzR(shapeBase.zzY9h().zzZyj(), this.zzXRT.zzYuu())), Integer.valueOf(zzYOU.zzR(shapeBase.zzY9h().zzZyi(), this.zzXRT.zzYuu()))));
    }

    private void zzZh(Object obj) {
        if (obj == null) {
            return;
        }
        String str = "";
        for (int i : (int[]) obj) {
            str = com.aspose.words.internal.zzZKN.format("{0}, {1}", str, zzYOU.zzrr(i));
        }
        this.zzXQU.zz0("draw:glue-point-leaving-directions", com.aspose.words.internal.zzZKN.zzV(str, ", ".toCharArray()));
    }

    private void zzZi(Object obj) {
        if (obj == null) {
            return;
        }
        String str = "";
        for (zzYM5 zzym5 : (zzYM5[]) obj) {
            str = com.aspose.words.internal.zzZKN.format("{0} {1} {2}", str, zzZ(zzym5.zzYnG(), false), zzZ(zzym5.zzYnF(), false));
        }
        this.zzXQU.zz0("draw:glue-points", com.aspose.words.internal.zzZKN.zzS(str, ControlChar.SPACE_CHAR));
    }

    private void zza(Shape shape) {
        zzYM4[] zzym4ArrZzYaD = shape.zzYaD();
        if (zzym4ArrZzYaD.length <= 0) {
            return;
        }
        zzYM4 zzym4 = zzym4ArrZzYaD[zzym4ArrZzYaD.length == 1 ? (char) 0 : (char) 1];
        this.zzXQU.zz0("draw:text-areas", com.aspose.words.internal.zzZKN.format("{0} {1} {2} {3}", zzZ(zzym4.zzXFj, false), zzZ(zzym4.zzXFi, false), zzZ(zzym4.zzXFh, false), zzZ(zzym4.zzXFg, false)));
    }

    private void zzb(Shape shape) {
        zzZL3[] zzzl3ArrZzYaE = shape.zzYaE();
        if (zzzl3ArrZzYaE == null) {
            return;
        }
        zzYTG zzytg = this.zzXQU;
        for (zzZL3 zzzl3 : zzzl3ArrZzYaE) {
            zzytg.zzY("draw:handle");
            this.zzXQU.zz0("draw:handle-position", zzZ(shape, zzzl3.zzYu1, zzzl3.zzYu0));
            boolean z = zzzl3.zzYu3;
            if (z) {
                this.zzXQU.zzx("draw:handle-mirror-horizontal", z);
            }
            boolean z2 = zzzl3.zzYu2;
            if (z2) {
                this.zzXQU.zzx("draw:handle-mirror-vertical", z2);
            }
            boolean z3 = zzzl3.zzYu4;
            if (z3) {
                this.zzXQU.zzx("draw:handle-switched", z3);
            }
            if (zzzl3.zzYu7) {
                if (zzzl3.zzYtX.getValue() != Integer.MIN_VALUE) {
                    zzZ("draw:handle-range-x-minimum", shape, zzzl3.zzYtX, true);
                }
                if (zzzl3.zzYtW.getValue() != Integer.MAX_VALUE) {
                    zzZ("draw:handle-range-x-maximum", shape, zzzl3.zzYtW, true);
                }
                if (zzzl3.zzYtV.getValue() != Integer.MIN_VALUE) {
                    zzZ("draw:handle-range-y-minimum", shape, zzzl3.zzYtV, false);
                }
                if (zzzl3.zzYtU.getValue() != Integer.MAX_VALUE) {
                    zzZ("draw:handle-range-y-maximum", shape, zzzl3.zzYtU, false);
                }
            }
            zzytg.zzo();
        }
    }

    private void zzc(Shape shape) {
        Object objZzPk = shape.zzYvW().zzPk(241);
        if (objZzPk == null || !((Boolean) objZzPk).booleanValue()) {
            return;
        }
        this.zzXQU.zz0("draw:text-path", TelemetryEventStrings.Value.TRUE);
    }

    private void zzd(Shape shape) {
        Object objZzPk = shape.zzYvW().zzPk(StyleIdentifier.LIST_TABLE_2_ACCENT_3);
        if (objZzPk == null) {
            return;
        }
        this.zzXQU.zz0("draw:glue-point-type", zzYS3.zzsx(((Integer) objZzPk).intValue()));
    }

    private void zze(Shape shape) {
        this.zzXQU.zz0("draw:type", "non-primitive");
        zzc(shape);
        zz9(shape);
        zzZO(shape);
        zz8(shape);
        zza(shape);
        zzS(shape.getFlipOrientation(), 1, "draw:mirror-horizontal");
        zzS(shape.getFlipOrientation(), 2, "draw:mirror-vertical");
        zzW(shape.zzYvW());
        zzd(shape);
        zzZi(shape.fetchShapeAttr(StyleIdentifier.LIST_TABLE_2_ACCENT_2));
        zzZh(shape.fetchShapeAttr(StyleIdentifier.LIST_TABLE_3_ACCENT_2));
    }

    private void zzx(String str, String str2, String str3) {
        this.zzXQU.zz0(str, com.aspose.words.internal.zzZKN.format("{0} {1}", str2, str3));
    }

    public final void zzf(Shape shape) {
        this.zzXRT.zzWz(zzYOU.zzWt(shape.zzY9h().zzZyj(), shape.zzY9h().zzZyi()));
        zzYTG zzytg = this.zzXQU;
        zzytg.zzY("draw:enhanced-geometry");
        if (shape.getShapeType() == 2) {
            zz7(shape);
        } else {
            this.zzXQt = zzZLG.zzA(shape);
            zze(shape);
            zzb(shape);
        }
        zzytg.zzo();
    }

    private static boolean zzS(zzYS2 zzys2) {
        if (zzys2.zzXPM) {
            return false;
        }
        return (zzys2.zzXPV == 0 && zzys2.zzXPU == 0 && zzys2.zzXPT == 0) ? false : true;
    }

    private static zzYS2 zzV(zzYC3 zzyc3) {
        zzYS2 zzys2 = new zzYS2();
        for (int i = 0; i < zzyc3.getCount(); i++) {
            int iZzT3 = zzyc3.zzT3(i);
            Object objZzVY = zzyc3.zzVY(i);
            if (objZzVY != null && !zzX(zzys2, iZzT3, objZzVY) && !zzY(zzys2, iZzT3, objZzVY) && !zzZ(zzys2, iZzT3, objZzVY)) {
                if (iZzT3 == 644) {
                    zzys2.zzXQc = ((Integer) objZzVY).intValue();
                } else if (iZzT3 == 645) {
                    zzys2.zzXQd = ((Integer) objZzVY).intValue();
                } else if (iZzT3 == 647) {
                    zzys2.zzXPR = true;
                } else if (iZzT3 == 701) {
                    zzys2.zzXPS = ((Boolean) objZzVY).booleanValue();
                } else if (iZzT3 == 713) {
                    zzys2.zzYIR = ((Integer) objZzVY).intValue();
                } else if (iZzT3 == 765) {
                    zzys2.zzXPQ = ((Boolean) objZzVY).booleanValue();
                } else if (iZzT3 == 704) {
                    zzys2.zzXQf = ((Integer) objZzVY).intValue();
                } else if (iZzT3 != 705) {
                    switch (iZzT3) {
                        case 640:
                            zzys2.zzXQa = ((Integer) objZzVY).intValue();
                            break;
                        case 641:
                            zzys2.zzXQ9 = ((Integer) objZzVY).intValue();
                            break;
                        case 642:
                            zzys2.zzXQe = ((Integer) objZzVY).intValue();
                            break;
                        default:
                            switch (iZzT3) {
                                case 715:
                                    zzys2.zzXQ8 = ((Integer) objZzVY).intValue();
                                    break;
                                case 716:
                                    zzys2.zzXQ7 = ((Integer) objZzVY).intValue();
                                    break;
                                case 717:
                                    zzys2.zzXQ6 = ((Integer) objZzVY).intValue();
                                    break;
                                case 718:
                                    zzys2.zzXQ5 = ((Integer) objZzVY).intValue();
                                    break;
                                case 719:
                                    zzys2.zzXQ4 = ((Integer) objZzVY).intValue();
                                    break;
                                case 720:
                                    zzys2.zzXQh = ((Integer) objZzVY).intValue();
                                    break;
                                case 721:
                                    zzys2.zzXQi = ((Integer) objZzVY).intValue();
                                    break;
                                case 722:
                                    zzys2.zzXQb = ((Integer) objZzVY).intValue();
                                    break;
                            }
                            break;
                    }
                } else {
                    zzys2.zzXQg = ((Integer) objZzVY).intValue();
                }
            }
        }
        return zzys2;
    }

    private void zzT(zzYS2 zzys2) {
        if (zzS(zzys2)) {
            zzT("draw:extrusion-rotation-center", zzYOU.zzrr(zzys2.zzXPV), zzYOU.zzrr(zzys2.zzXPU), zzYOU.zzrr(zzys2.zzXPT));
        }
    }

    private static boolean zzX(zzYS2 zzys2, int i, Object obj) {
        if (i != 764) {
            switch (i) {
                case 710:
                    zzys2.zzXPV = ((Integer) obj).intValue();
                    break;
                case 711:
                    zzys2.zzXPU = ((Integer) obj).intValue();
                    break;
                case 712:
                    zzys2.zzXPT = ((Integer) obj).intValue();
                    break;
            }
            return true;
        }
        zzys2.zzXPM = ((Boolean) obj).booleanValue();
        return true;
    }

    private static boolean zzZ(zzYS2 zzys2, int i, Object obj) {
        if (i != 767) {
            switch (i) {
                case 727:
                    zzys2.zzXPY = ((Integer) obj).intValue();
                    break;
                case 728:
                    zzys2.zzXPX = ((Integer) obj).intValue();
                    break;
                case 729:
                    zzys2.zzXPW = ((Integer) obj).intValue();
                    break;
                case 730:
                    zzys2.zzXPZ = ((Integer) obj).intValue();
                    break;
            }
            return true;
        }
        zzys2.zzXPN = ((Boolean) obj).booleanValue();
        return true;
    }

    private static boolean zzY(zzYS2 zzys2, int i, Object obj) {
        if (i == 703) {
            zzys2.zzXPP = ((Boolean) obj).booleanValue();
            return true;
        }
        if (i != 766) {
            switch (i) {
                case 723:
                    zzys2.zzXQ2 = ((Integer) obj).intValue();
                    break;
                case 724:
                    zzys2.zzXQ1 = ((Integer) obj).intValue();
                    break;
                case 725:
                    zzys2.zzXQ0 = ((Integer) obj).intValue();
                    break;
                case 726:
                    zzys2.zzXQ3 = ((Integer) obj).intValue();
                    break;
            }
            return true;
        }
        zzys2.zzXPO = ((Boolean) obj).booleanValue();
        return true;
    }

    private void zzZ(String str, Shape shape, zzYM2 zzym2, boolean z) {
        this.zzXQU.zz0(str, zzZ(shape, zzym2, z));
    }

    private String zzZ(Shape shape, zzZL1 zzzl1, zzZL1 zzzl12) {
        return com.aspose.words.internal.zzZKN.format("{0} {1}", zzZ(shape, zzzl1, true), zzZ(shape, zzzl12, false));
    }

    private String zzZ(Shape shape, zzYM2 zzym2, boolean z) {
        int iZzZyg;
        int iZzZyi;
        int value = zzym2.getValue();
        if (!zzym2.zzYnC()) {
            return com.aspose.words.internal.zzJB.zzWF(value);
        }
        if (value == 0) {
            return z ? "left" : "top";
        }
        if (value == 1) {
            return z ? "right" : "bottom";
        }
        if (value == 2) {
            if (z) {
                iZzZyg = shape.zzY9h().zzZyh();
                iZzZyi = shape.zzY9h().zzZyj() / 2;
            } else {
                iZzZyg = shape.zzY9h().zzZyg();
                iZzZyi = shape.zzY9h().zzZyi() / 2;
            }
            return com.aspose.words.internal.zzJB.zzWF(iZzZyi + iZzZyg);
        }
        if (value >= 256) {
            return com.aspose.words.internal.zzZKN.format("${0}", com.aspose.words.internal.zzJB.zzWF(value - 256));
        }
        zzZLU[] zzzluArr = this.zzXQu;
        int length = zzzluArr == null ? 0 : zzzluArr.length;
        if (shape.zzYbo() == null) {
            return null;
        }
        int i = value - 3;
        if (i < length + shape.zzYbo().length) {
            value = this.zzXQt[i];
        }
        return com.aspose.words.internal.zzJB.zzWF(value);
    }

    private String zzZ(Shape shape, zzZL1 zzzl1, boolean z) {
        int iZzZyg;
        int iZzZyi;
        int type = zzzl1.getType();
        if (type == 1) {
            return z ? "left" : "top";
        }
        if (type == 2) {
            return z ? "right" : "bottom";
        }
        if (type != 3) {
            if (type == 4) {
                return com.aspose.words.internal.zzJB.zzWF(this.zzXQt[zzzl1.getValue()]);
            }
            if (type != 5) {
                return com.aspose.words.internal.zzJB.zzWF(zzzl1.getValue());
            }
            return com.aspose.words.internal.zzZKN.format("${0}", com.aspose.words.internal.zzJB.zzWF(zzzl1.getValue()));
        }
        if (z) {
            iZzZyg = shape.zzY9h().zzZyh();
            iZzZyi = shape.zzY9h().zzZyj() / 2;
        } else {
            iZzZyg = shape.zzY9h().zzZyg();
            iZzZyi = shape.zzY9h().zzZyi() / 2;
        }
        return com.aspose.words.internal.zzJB.zzWF(iZzZyi + iZzZyg);
    }

    private void zzW(zzYS2 zzys2) {
        if (zzV(zzys2)) {
            return;
        }
        zzx("draw:extrusion-origin", zzYOU.zzrr(zzys2.zzXQ5), zzYOU.zzrr(zzys2.zzXQ4));
    }

    private String zzZ(zzYM2 zzym2, boolean z) {
        int iZzR;
        int value = zzym2.zzYnC() ? this.zzXQt[zzym2.getValue()] : zzym2.getValue();
        if (z) {
            iZzR = value / 65536;
        } else {
            iZzR = zzYOU.zzR(value, this.zzXRT.zzYuu());
        }
        return com.aspose.words.internal.zzJB.zzWF(iZzR);
    }
}
