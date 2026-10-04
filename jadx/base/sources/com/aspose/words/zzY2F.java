package com.aspose.words;

import androidx.core.view.InputDeviceCompat;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes6.dex */
final class zzY2F extends zzY2C {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("on", C18437z2.f56754h, "color", "color2", "opacity", "origin", "offset", "offset2", "matrix", "obscured");

    private static void zzT(ShapeBase shapeBase, String str) {
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(str, ',');
        int length = strArrZzR.length - 1;
        int i = 0;
        for (int i2 = 521; i2 <= 524; i2++) {
            zzY2C.zzX(shapeBase, i2, strArrZzR[i]);
            i++;
            if (i > length) {
                return;
            }
        }
        for (int i3 = 525; i3 <= 526; i3++) {
            String str2 = strArrZzR[i];
            if (!"".equals(str2)) {
                shapeBase.setShapeAttr(i3, Integer.valueOf(zzY23.zzyX(str2)));
            }
            i++;
            if (i > length) {
                return;
            }
        }
    }

    public static void zzW(ShapeBase shapeBase, zzYU4 zzyu4) {
        while (zzyu4.zzi()) {
            String value = zzyu4.getValue();
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 0:
                    zzY2C.zzZ(shapeBase, 574, value, true);
                    break;
                case 1:
                    shapeBase.setShapeAttr(512, Integer.valueOf(zzY30.zzzy(value)));
                    break;
                case 2:
                    shapeBase.setShapeAttr(InputDeviceCompat.SOURCE_DPAD, zzY35.zzzY(value));
                    break;
                case 3:
                    shapeBase.setShapeAttr(514, zzY35.zzzY(value));
                    break;
                case 4:
                    zzY2C.zzX(shapeBase, 516, value);
                    break;
                case 5:
                    zzY2C.zzY(shapeBase, 528, 529, value);
                    break;
                case 6:
                    zzZ(shapeBase, 517, 518, value);
                    break;
                case 7:
                    zzZ(shapeBase, 519, 520, value);
                    break;
                case 8:
                    zzT(shapeBase, value);
                    break;
                case 9:
                    zzY2C.zzU(shapeBase, 575, value);
                    break;
                default:
                    zzyu4.zzZ(65536, 4, com.aspose.words.internal.zzZKN.format("Import of element '{0}' is not supported upon VML import by Aspose.Words.", zzyu4.getLocalName()));
                    break;
            }
        }
    }

    private static void zzZ(ShapeBase shapeBase, int i, int i2, String str) {
        zzY2G[] zzy2gArrZzXW = zzY2C.zzXW(str, "");
        zzY2C.zzX(shapeBase, i, zzy2gArrZzXW[0]);
        if (zzy2gArrZzXW.length > 1) {
            zzY2C.zzX(shapeBase, i2, zzy2gArrZzXW[1]);
        }
    }
}
