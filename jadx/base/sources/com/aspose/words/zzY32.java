package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzY32 extends zzY2C {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("ext", "dgmstyle", "dgmscalex", "dgmscaley", "dgmfontsize", "constrainbounds", "autoformat", "reverse", "idsrc", "iddest", "idcntr");

    private static void zzY(ShapeBase shapeBase, zzYU4 zzyu4) {
        ArrayList arrayList = new ArrayList();
        while (zzyu4.zzQ("relationtable")) {
            if ("rel".equals(zzyu4.getLocalName())) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzJW>) arrayList, zzw(zzyu4));
            }
        }
        shapeBase.setShapeAttr(1284, (zzJW[]) arrayList.toArray(new zzJW[0]));
    }

    public static void zzZ(ShapeBase shapeBase, zzYU4 zzyu4) {
        while (zzyu4.zzi()) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 0:
                    break;
                case 1:
                    shapeBase.setShapeAttr(1281, Integer.valueOf(zzyu4.zzb()));
                    break;
                case 2:
                    shapeBase.setShapeAttr(1285, Integer.valueOf(zzyu4.zzb()));
                    break;
                case 3:
                    shapeBase.setShapeAttr(1286, Integer.valueOf(zzyu4.zzb()));
                    break;
                case 4:
                    shapeBase.setShapeAttr(1287, Integer.valueOf(zzyu4.zzb()));
                    break;
                case 5:
                    shapeBase.setShapeAttr(1288, zzY23.zzyY(zzyu4.getValue()));
                    break;
                case 6:
                    zzY2C.zzV(shapeBase, 1340, zzyu4.getValue());
                    break;
                case 7:
                    zzY2C.zzV(shapeBase, 1341, zzyu4.getValue());
                    break;
                default:
                    zzyu4.zzZ(65536, 4, com.aspose.words.internal.zzZKN.format("Import of element '{0}' is not supported upon VML import by Aspose.Words.", zzyu4.getLocalName()));
                    break;
            }
        }
        while (zzyu4.zzQ("diagram")) {
            if ("relationtable".equals(zzyu4.getLocalName())) {
                zzY(shapeBase, zzyu4);
            }
        }
    }

    private static zzJW zzw(zzYU4 zzyu4) {
        zzJW zzjw = new zzJW();
        while (zzyu4.zzi()) {
            String value = zzyu4.getValue();
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP != 0) {
                switch (iZzTP) {
                    case 8:
                        zzjw.zzZj2 = zzY23.zzyW(value);
                        break;
                    case 9:
                        zzjw.zzZj1 = zzY23.zzyW(value);
                        break;
                    case 10:
                        zzjw.zzZj0 = zzY23.zzyW(value);
                        break;
                }
            }
        }
        return zzjw;
    }
}
