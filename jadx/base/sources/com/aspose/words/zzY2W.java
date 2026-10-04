package com.aspose.words;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: loaded from: classes6.dex */
final class zzY2W extends zzY2C {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("id", "src", NoteMeta.PROPERTY_TITLE, "opacity", "color", "color2", "opacity2", "aspect", "origin", RequestParameters.POSITION, "size", "recolor", "rotate", "angle", "colors", "focusposition", "focussize", "method", "focus", C18437z2.f56754h, "detectmouseclick", "href", "althref", "on", "gradientCenter", "gradientUnscaled");

    public static void zzZ(ShapeBase shapeBase, zzZ8W zzz8w) {
        zzYU4 zzyu4ZzZsD = zzz8w.zzZsD();
        boolean z = false;
        while (zzyu4ZzZsD.zzi()) {
            String value = zzyu4ZzZsD.getValue();
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 0:
                case 1:
                    zzz8w.zzZsD().zzYyt().put(shapeBase, value);
                    break;
                case 2:
                    if (!shapeBase.zzYvW().contains(391)) {
                        shapeBase.setShapeAttr(391, value);
                    }
                    break;
                case 3:
                    zzY2C.zzX(shapeBase, 386, value);
                    break;
                case 4:
                    shapeBase.setShapeAttr(385, zzY35.zzzY(value));
                    break;
                case 5:
                    shapeBase.setShapeAttr(387, zzY35.zzzY(value));
                    com.aspose.words.internal.zzPV zzpvZzzX = zzY35.zzzX(value);
                    if (zzpvZzzX != null) {
                        shapeBase.setShapeAttr(418, zzpvZzzX);
                    }
                    int iZzzW = zzY35.zzzW(value);
                    if (iZzzW != 0) {
                        shapeBase.setShapeAttr(420, Integer.valueOf(iZzzW));
                    }
                    break;
                case 6:
                    zzY2C.zzX(shapeBase, 388, value);
                    break;
                case 7:
                    shapeBase.setShapeAttr(405, Integer.valueOf(zzY30.zzzr(value)));
                    break;
                case 8:
                    zzY2C.zzY(shapeBase, 408, 409, value);
                    break;
                case 9:
                    zzY2C.zzY(shapeBase, 410, 411, value);
                    break;
                case 10:
                case 16:
                    break;
                case 11:
                    zzY2C.zzV(shapeBase, 441, value);
                    break;
                case 12:
                    zzY2C.zzV(shapeBase, 442, value);
                    break;
                case 13:
                    zzY2C.zzX(shapeBase, 395, value);
                    break;
                case 14:
                    shapeBase.setShapeAttr(407, zzzl(value));
                    break;
                case 15:
                    zzY2C.zzY(shapeBase, 397, 398, value);
                    zzY2C.zzY(shapeBase, 399, 400, value);
                    break;
                case 17:
                    if (!"linear sigma".equals(value)) {
                        shapeBase.setShapeAttr(412, 0);
                    } else {
                        shapeBase.setShapeAttr(412, 1073741835);
                    }
                    break;
                case 18:
                    zzY2C.zzW(shapeBase, 396, value);
                    break;
                case 19:
                    shapeBase.setShapeAttr(384, Integer.valueOf(zzY30.zzzp(value)));
                    if ("gradientRadial".equals(value) || "gradient".equals(value)) {
                        z = true;
                    }
                    break;
                case 20:
                    zzY2C.zzV(shapeBase, 447, value);
                    break;
                case 21:
                    zzyu4ZzZsD.zzZ(1, 4, com.aspose.words.internal.zzZKN.format("Import of element '{0}' is not supported upon VML import by Aspose.Words.", zzyu4ZzZsD.getLocalName()));
                    break;
                case 22:
                    zzyu4ZzZsD.zzZ(1, 4, com.aspose.words.internal.zzZKN.format("Import of element '{0}' is not supported upon VML import by Aspose.Words.", zzyu4ZzZsD.getLocalName()));
                    break;
                case 23:
                    shapeBase.setShapeAttr(443, Boolean.valueOf(zzyu4ZzZsD.zz8()));
                    break;
                default:
                    zzyu4ZzZsD.zzZ(65536, 4, com.aspose.words.internal.zzZKN.format("Import of element '{0}' is not supported upon VML import by Aspose.Words.", zzyu4ZzZsD.getLocalName()));
                    break;
            }
        }
        if (z) {
            while (zzyu4ZzZsD.zzQ("fill")) {
                int iZzTP = zzUR.zzTP(zzyu4ZzZsD.zzV(C18437z2.f56754h, ""));
                if (iZzTP == 24) {
                    shapeBase.setShapeAttr(384, 5);
                } else if (iZzTP == 25) {
                    shapeBase.setShapeAttr(384, 10);
                }
            }
        }
    }

    private static zzZLE[] zzzl(String str) {
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(str, ';');
        zzZLE[] zzzleArr = new zzZLE[strArrZzR.length];
        for (int i = 0; i < strArrZzR.length; i++) {
            String[] strArrZzR2 = com.aspose.words.internal.zzZKN.zzR(strArrZzR[i], ControlChar.SPACE_CHAR);
            zzY2G zzy2g = new zzY2G(strArrZzR2[0]);
            if (!zzy2g.isFixed()) {
                return null;
            }
            zzZLE zzzle = new zzZLE();
            zzzle.zzZfb = zzy2g.zzXT0();
            zzzle.zzYuy = zzY35.zzzY(strArrZzR2[1]);
            zzzleArr[i] = zzzle;
        }
        return zzzleArr;
    }
}
