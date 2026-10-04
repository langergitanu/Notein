package com.aspose.words;

import androidx.core.view.PointerIconCompat;

/* JADX INFO: loaded from: classes6.dex */
final class zzMO {
    private static int zzMk(int i) {
        if (i == 1350) {
            return 3;
        }
        if (i == 1360) {
            return 1;
        }
        if (i == 1370) {
            return 0;
        }
        if (i == 1380) {
            return 2;
        }
        throw new IllegalStateException("Unknown border type.");
    }

    public static zzLU zzZ(zzYMX zzymx, boolean z, boolean z2) {
        zzLU zzlu = new zzLU();
        zzO0 zzo0 = new zzO0();
        boolean zBooleanValue = ((Boolean) zzymx.zzPj(1560)).booleanValue();
        int count = zzymx.getCount();
        int iIntValue = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        for (int i = 0; i < count; i++) {
            int iZzT3 = zzymx.zzT3(i);
            Object obj = zzymx.get(iZzT3);
            switch (iZzT3) {
                case PointerIconCompat.TYPE_GRAB /* 1020 */:
                    int iIntValue2 = ((Integer) obj).intValue();
                    int i2 = (iIntValue2 == 0 && zBooleanValue) ? 2 : iIntValue2;
                    if (i2 != 0 || z) {
                        zzlu.zzZs("text-align", zzZDY.zzyP(i2));
                    }
                    break;
                case EditingLanguage.ITALIAN_ITALY /* 1040 */:
                    boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                    if (zBooleanValue2 || z) {
                        zzlu.zzZs("page-break-inside", zBooleanValue2 ? "avoid" : "auto");
                    }
                    break;
                case 1050:
                    boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                    if (zBooleanValue3 || z) {
                        zzlu.zzZs("page-break-after", zBooleanValue3 ? "avoid" : "auto");
                    }
                    break;
                case EditingLanguage.SLOVENIAN /* 1060 */:
                    boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                    if (zBooleanValue4 || z) {
                        zzlu.zzZs("page-break-before", zBooleanValue4 ? "always" : "auto");
                    }
                    break;
                case EditingLanguage.KASHMIRI_ARABIC /* 1120 */:
                    iIntValue = ((Integer) obj).intValue();
                    break;
                case EditingLanguage.BRETON /* 1150 */:
                    z4 = true;
                    break;
                case 1160:
                    z3 = true;
                    break;
                case EditingLanguage.CENTRAL_KURDISH_IRAQ /* 1170 */:
                    z5 = true;
                    break;
                case 1200:
                    zzo0.setTop(((double) ((Integer) obj).intValue()) / 20.0d);
                    break;
                case 1220:
                    zzo0.zzYX(((double) ((Integer) obj).intValue()) / 20.0d);
                    break;
                case 1350:
                case 1360:
                case 1370:
                case 1380:
                    Border border = (Border) obj;
                    if (!border.isInherited()) {
                        zzQS.zzZ(zzlu, border, zzMk(iZzT3), true, false, z2, false);
                    }
                    break;
                case 1460:
                    Shading shading = (Shading) obj;
                    if (!shading.isInherited()) {
                        zzM9.zzZ(shading, zzlu);
                    }
                    break;
                case 1470:
                    boolean zBooleanValue5 = ((Boolean) obj).booleanValue();
                    if (!zBooleanValue5 || z) {
                        double d = zBooleanValue5 ? 2 : 0;
                        zzlu.zzV("widows", d);
                        zzlu.zzV("orphans", d);
                    }
                    break;
                case 1480:
                    if (FrameFormat.zzY(zzymx)) {
                        String strZzM7 = zzL5.zzM7(((Integer) obj).intValue());
                        if (!"lr-tb".equals(strZzM7) || z) {
                            zzlu.zzZs("writing-mode", strZzM7);
                        }
                    }
                    break;
                case 1650:
                    zzZ52 zzz52 = (zzZ52) obj;
                    int iZzZ4A = zzz52.zzZ4A();
                    if (iZzZ4A == 0) {
                        double value = ((double) zzz52.getValue()) / 20.0d;
                        if (value != 0.0d) {
                            zzlu.zzZ("line-height", value, 4);
                        }
                    } else if (iZzZ4A != 1) {
                        if (iZzZ4A != 2) {
                            throw new IllegalStateException("Unknown line spacing rule.");
                        }
                        double value2 = ((double) zzz52.getValue()) / 240.0d;
                        if (value2 != 1.0d || z) {
                            zzZ(zzlu, value2);
                        }
                    } else {
                        zzlu.zzZ("line-height", ((double) zzz52.getValue()) / 20.0d, 4);
                    }
                    break;
            }
        }
        double dIntValue = ((double) ((Integer) zzymx.zzPj(1160)).intValue()) / 20.0d;
        double dIntValue2 = ((double) ((Integer) zzymx.zzPj(EditingLanguage.BRETON)).intValue()) / 20.0d;
        double dIntValue3 = ((double) ((Integer) zzymx.zzPj(EditingLanguage.CENTRAL_KURDISH_IRAQ)).intValue()) / 20.0d;
        if (iIntValue != 0) {
            if (dIntValue != 0.0d) {
                z3 = true;
            }
            if (dIntValue2 != 0.0d) {
                z4 = true;
            }
            if (dIntValue3 != 0.0d) {
                z5 = true;
            }
        }
        if (z5 && (dIntValue3 != 0.0d || z)) {
            zzlu.zzZ("text-indent", dIntValue3, 4);
        }
        zzo0.setLeft(dIntValue);
        zzo0.zzYd(z3);
        zzo0.zzYY(dIntValue2);
        zzo0.zzYf(z4);
        zzO0 zzo0Zzl = zzo0.zzl(0, zBooleanValue);
        if (zzo0Zzl.zzZW4()) {
            zzlu.zzU(zzo0Zzl.getTop(), zzo0Zzl.getRight(), zzo0Zzl.getBottom(), zzo0Zzl.getLeft());
            return zzlu;
        }
        zzo0Zzl.zzZ(zzlu);
        return zzlu;
    }

    private static boolean zzt(byte b) {
        return b == 1;
    }

    private static boolean zzu(byte b) {
        return b != -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void zzZ(zzYEF zzyef, zzLU zzlu, boolean z, zzZHR zzzhr, zzZN8 zzzn8, Theme theme, boolean z2) throws Exception {
        String str;
        boolean z3;
        byte b;
        int count = zzyef.getCount();
        byte bZzZ = -1;
        byte b2 = -1;
        byte bZzZ2 = -1;
        byte bZzZ3 = -1;
        byte bZzZ4 = -1;
        byte bZzZ5 = -1;
        byte bZzZ6 = -1;
        com.aspose.words.internal.zzPV zzpv = null;
        Shading shading = null;
        String strZzZ = null;
        com.aspose.words.internal.zzPV zzpv2 = null;
        int i = 0;
        int iIntValue = 0;
        double dIntValue = 0.0d;
        boolean z4 = false;
        boolean z5 = false;
        double dIntValue2 = 0.0d;
        boolean z6 = false;
        int iIntValue2 = 0;
        boolean z7 = false;
        while (true) {
            str = "normal";
            byte b3 = bZzZ;
            if (i < count) {
                int iZzT3 = zzyef.zzT3(i);
                int i2 = count;
                Object objZzVY = zzyef.zzVY(i);
                int i3 = i;
                switch (iZzT3) {
                    case 20:
                        zzpv = (com.aspose.words.internal.zzPV) objZzVY;
                        bZzZ = b3;
                        break;
                    case 60:
                        bZzZ5 = zzZ(objZzVY, zzyef, iZzT3, z);
                        bZzZ = b3;
                        break;
                    case 70:
                        byte bZzZ7 = zzZ(objZzVY, zzyef, iZzT3, z);
                        if (zzu(bZzZ7)) {
                            zzlu.zzZs("font-style", zzt(bZzZ7) ? "italic" : "normal");
                        }
                        b2 = bZzZ7;
                        bZzZ = b3;
                        break;
                    case 80:
                        bZzZ2 = zzZ(objZzVY, zzyef, iZzT3, z);
                        bZzZ = b3;
                        break;
                    case 90:
                        bZzZ6 = zzZ(objZzVY, zzyef, iZzT3, z);
                        bZzZ = b3;
                        break;
                    case 110:
                        b = b2;
                        byte bZzZ8 = zzZ(objZzVY, zzyef, iZzT3, z);
                        if (zzu(bZzZ8)) {
                            zzlu.zzZs("font-variant", zzt(bZzZ8) ? "small-caps" : "normal");
                        }
                        bZzZ = b3;
                        b2 = b;
                        break;
                    case 120:
                        b = b2;
                        byte bZzZ9 = zzZ(objZzVY, zzyef, iZzT3, z);
                        if (zzu(bZzZ9)) {
                            zzlu.zzZs("text-transform", zzt(bZzZ9) ? "uppercase" : "none");
                        }
                        bZzZ = b3;
                        b2 = b;
                        break;
                    case 130:
                        b = b2;
                        if (zzt(zzZ(objZzVY, zzyef, iZzT3, z))) {
                            zzlu.zzZs("display", "none");
                        }
                        bZzZ = b3;
                        b2 = b;
                        break;
                    case 140:
                        iIntValue2 = ((Integer) objZzVY).intValue();
                        bZzZ = b3;
                        z6 = true;
                        break;
                    case 150:
                        b = b2;
                        double dIntValue3 = ((double) ((Integer) objZzVY).intValue()) / 20.0d;
                        if (dIntValue3 != 0.0d || z) {
                            zzlu.zzZ("letter-spacing", dIntValue3, 4);
                        }
                        bZzZ = b3;
                        b2 = b;
                        break;
                    case 160:
                        zzpv2 = (com.aspose.words.internal.zzPV) objZzVY;
                        bZzZ = b3;
                        break;
                    case 170:
                        bZzZ = zzZ(objZzVY, zzyef, iZzT3, z);
                        break;
                    case 180:
                        bZzZ4 = zzZ(objZzVY, zzyef, iZzT3, z);
                        bZzZ = b3;
                        break;
                    case 190:
                        dIntValue2 = ((double) ((Integer) objZzVY).intValue()) / 2.0d;
                        bZzZ = b3;
                        b2 = b2;
                        z4 = true;
                        break;
                    case 200:
                        dIntValue = ((double) ((Integer) objZzVY).intValue()) / 2.0d;
                        bZzZ = b3;
                        z7 = true;
                        break;
                    case 210:
                        iIntValue = ((Integer) objZzVY).intValue();
                        bZzZ = b3;
                        z5 = true;
                        break;
                    case 230:
                        strZzZ = zzU1.zzZ(objZzVY, theme);
                        bZzZ = b3;
                        break;
                    case 300:
                        bZzZ3 = zzZ(objZzVY, zzyef, iZzT3, z);
                        bZzZ = b3;
                        break;
                    case StyleIdentifier.LIST_TABLE_4_ACCENT_5 /* 360 */:
                        Border border = (Border) objZzVY;
                        if (!border.isInherited()) {
                            zzQS.zzZ(border, zzlu, z2);
                        }
                        b = b2;
                        bZzZ = b3;
                        b2 = b;
                        break;
                    case StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_6 /* 370 */:
                        shading = (Shading) objZzVY;
                        bZzZ = b3;
                        break;
                    default:
                        b = b2;
                        bZzZ = b3;
                        b2 = b;
                        break;
                }
                i = i3 + 1;
                count = i2;
            } else {
                byte b4 = b2;
                if (z4) {
                    z3 = iIntValue != 0;
                    if (!z5) {
                        if (((Integer) zzyef.zzPj(210)).intValue() != 0) {
                            z3 = true;
                        }
                    }
                } else {
                    z3 = false;
                }
                if (z4 || z3) {
                    if (!z4) {
                        dIntValue2 = ((double) ((Integer) zzyef.zzPj(190)).intValue()) / 2.0d;
                    }
                    if (z3) {
                        dIntValue2 *= 0.6666666666666666d;
                    }
                    zzlu.zzZ("font-size", dIntValue2, 4);
                }
                if (zzu(bZzZ5) || zzu(bZzZ6) || zzu(b3) || zzu(bZzZ4)) {
                    if (zzt(bZzZ5) || zzt(bZzZ6) || zzt(b3) || zzt(bZzZ4)) {
                        str = "bold";
                        bZzZ5 = 1;
                    }
                    zzlu.zzZs("font-weight", str);
                }
                if (strZzZ != null) {
                    zzlu.zzJ(zzzhr.zzT(strZzZ, zzt(bZzZ5), zzt(b4)));
                }
                boolean z8 = zzu(bZzZ2) || zzu(bZzZ3);
                if (z6 || z8) {
                    zzL2 zzl2 = new zzL2();
                    if (z8 && (zzt(bZzZ2) || zzt(bZzZ3))) {
                        zzl2.zzI(zzL4.zzZn8);
                    }
                    if (iIntValue2 != 0) {
                        zzl2.zzI(zzL4.zzZna);
                    }
                    if (zzl2.getCount() == 0 && z) {
                        zzl2.zzI(zzL4.zzZno);
                    }
                    if (zzl2.getCount() != 0) {
                        zzlu.zzY(zzl2);
                    }
                }
                if (z7) {
                    if (dIntValue != 0.0d || z) {
                        zzlu.zzZ("vertical-align", dIntValue, 4);
                    }
                } else if (z5) {
                    if (iIntValue == 2) {
                        zzlu.zzZs("vertical-align", "sub");
                    } else if (iIntValue == 1) {
                        zzlu.zzZs("vertical-align", "super");
                    } else if (z) {
                        zzlu.zzZs("vertical-align", "baseline");
                    }
                }
                if (zzpv2 != null) {
                    zzZ(zzlu, zzzn8.zz7(zzpv2), z);
                }
                if (zzpv != null && !zzpv.isEmpty()) {
                    if (!com.aspose.words.internal.zzPV.zzZ(zzpv, com.aspose.words.internal.zzPV.zzI5) || z) {
                        zzlu.zzY("background-color", zzpv);
                        return;
                    }
                    return;
                }
                if (shading == null || shading.isInherited()) {
                    return;
                }
                zzM9.zzZ(shading, zzlu);
                return;
            }
        }
    }

    private static void zzZ(zzLU zzlu, com.aspose.words.internal.zzPV zzpv, boolean z) {
        if (!com.aspose.words.internal.zzPV.zzZ(zzpv, com.aspose.words.internal.zzPV.zzKa) || z) {
            zzlu.zzY("color", zzpv);
        }
    }

    private static byte zzZ(Object obj, zzZ9G zzz9g, int i, boolean z) {
        Object objFetchInheritedRunAttr;
        boolean z2 = obj == zzZU.zzZF6;
        boolean z3 = obj == zzZU.zzZF4;
        if (!z2 && !z3 && !z) {
            return (byte) -1;
        }
        if (z3) {
            z2 = zzz9g == null || (objFetchInheritedRunAttr = zzz9g.fetchInheritedRunAttr(i)) == null || objFetchInheritedRunAttr == zzZU.zzZF7;
        }
        return z2 ? (byte) 1 : (byte) 0;
    }

    private static void zzZ(zzLU zzlu, double d) {
        double dZzZa = com.aspose.words.internal.zzZKQ.zzZa(d * 100.0d);
        if (dZzZa == 100.0d) {
            zzlu.zzZs("line-height", "normal");
        } else {
            zzlu.zzU("line-height", dZzZa);
        }
    }
}
