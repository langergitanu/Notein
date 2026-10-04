package com.aspose.words;

import com.google.logging.type.LogSeverity;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes6.dex */
final class zzY2Z extends zzY2C {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("ext", "specularity", "diffusity", "shininess", "edge", "foredepth", "backdepth", "plane", "color", "on", "metal", "lightface", "rotationangle", "orientation", "orientationangle", "rotationcenter", "render", "facet", "viewpoint", "viewpointorigin", "skewangle", "skewamt", "brightness", "lightposition", "lightlevel", "lightposition2", "lightlevel2", "colormode", "lockrotationcenter", "autorotationcenter", C18437z2.f56754h, "lightharsh", "lightharsh2");

    private static void zzU(ShapeBase shapeBase, String str) {
        zzY2G[] zzy2gArrZzXW = zzY2C.zzXW(str, "");
        zzY2C.zzX(shapeBase, 715, zzy2gArrZzXW[0]);
        if (zzy2gArrZzXW.length > 1) {
            zzY2C.zzX(shapeBase, 716, zzy2gArrZzXW[1]);
        }
        if (zzy2gArrZzXW.length > 2) {
            zzY2C.zzX(shapeBase, 717, zzy2gArrZzXW[2]);
        }
    }

    private static void zzV(ShapeBase shapeBase, String str) {
        zzY2G[] zzy2gArrZzXW = zzY2C.zzXW(str, "");
        zzY2C.zzY(shapeBase, 705, zzy2gArrZzXW[0]);
        if (zzy2gArrZzXW.length > 1) {
            zzY2C.zzY(shapeBase, 704, zzy2gArrZzXW[1]);
        }
    }

    private static void zzW(ShapeBase shapeBase, String str) {
        zzY2G[] zzy2gArrZzXW = zzY2C.zzXW(str, "");
        zzY2C.zzZ(shapeBase, 710, zzy2gArrZzXW[0]);
        if (zzy2gArrZzXW.length > 1) {
            zzY2C.zzZ(shapeBase, 711, zzy2gArrZzXW[1]);
        }
        if (zzy2gArrZzXW.length > 2) {
            zzY2C.zzX(shapeBase, 712, zzy2gArrZzXW[2]);
        }
    }

    public static void zzX(ShapeBase shapeBase, zzYU4 zzyu4) {
        while (zzyu4.zzi()) {
            String value = zzyu4.getValue();
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 0:
                case 27:
                    break;
                case 1:
                    zzY2C.zzX(shapeBase, 640, value);
                    break;
                case 2:
                    zzY2C.zzX(shapeBase, 641, value);
                    break;
                case 3:
                    shapeBase.setShapeAttr(642, Integer.valueOf(zzyu4.zzb()));
                    break;
                case 4:
                    zzY2C.zzT(shapeBase, 643, value);
                    break;
                case 5:
                    zzY2C.zzT(shapeBase, 644, value);
                    break;
                case 6:
                    zzY2C.zzT(shapeBase, 645, value);
                    break;
                case 7:
                    shapeBase.setShapeAttr(646, Integer.valueOf(zzY30.zzzA(value)));
                    break;
                case 8:
                    shapeBase.setShapeAttr(647, zzY35.zzzY(value));
                    break;
                case 9:
                    zzY2C.zzV(shapeBase, LogSeverity.ALERT_VALUE, value);
                    break;
                case 10:
                    zzY2C.zzV(shapeBase, 701, value);
                    break;
                case 11:
                    zzY2C.zzV(shapeBase, 703, value);
                    break;
                case 12:
                    zzV(shapeBase, value);
                    break;
                case 13:
                    zzZ(shapeBase, 706, 707, 708, value);
                    break;
                case 14:
                    zzY2C.zzY(shapeBase, 709, new zzY2G(value));
                    break;
                case 15:
                    zzW(shapeBase, value);
                    break;
                case 16:
                    shapeBase.setShapeAttr(713, Integer.valueOf(zzY30.zzzz(value)));
                    break;
                case 17:
                    zzY2C.zzX(shapeBase, 714, value);
                    break;
                case 18:
                    zzU(shapeBase, value);
                    break;
                case 19:
                    zzY2C.zzY(shapeBase, 718, 719, value);
                    break;
                case 20:
                    zzY2C.zzY(shapeBase, 720, new zzY2G(value));
                    break;
                case 21:
                    zzY2C.zzW(shapeBase, 721, value);
                    break;
                case 22:
                    zzY2C.zzX(shapeBase, 722, value);
                    break;
                case 23:
                    zzZ(shapeBase, 723, 724, 725, value);
                    break;
                case 24:
                    zzY2C.zzX(shapeBase, 726, value);
                    break;
                case 25:
                    zzZ(shapeBase, 727, 728, 729, value);
                    break;
                case 26:
                    zzY2C.zzX(shapeBase, 730, value);
                    break;
                case 28:
                    zzY2C.zzV(shapeBase, 763, value);
                    break;
                case 29:
                    zzY2C.zzV(shapeBase, 764, value);
                    break;
                case 30:
                    if ("perspective".equals(value)) {
                        shapeBase.setShapeAttr(765, Boolean.FALSE);
                    }
                    break;
                case 31:
                    zzY2C.zzV(shapeBase, 766, value);
                    break;
                case 32:
                    zzY2C.zzU(shapeBase, 767, value);
                    break;
                default:
                    zzyu4.zzZ(65536, 4, com.aspose.words.internal.zzZKN.format("Import of element '{0}' is not supported upon VML import by Aspose.Words.", zzyu4.getLocalName()));
                    break;
            }
        }
    }

    private static void zzZ(ShapeBase shapeBase, int i, int i2, int i3, String str) {
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(str, ',');
        zzY2C.zzS(shapeBase, i, strArrZzR[0]);
        if (strArrZzR.length > 1) {
            zzY2C.zzS(shapeBase, i2, strArrZzR[1]);
        }
        if (strArrZzR.length > 2) {
            zzY2C.zzS(shapeBase, i3, strArrZzR[2]);
        }
    }
}
