package com.aspose.words;

import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: loaded from: classes6.dex */
final class zzYSG {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("control", "width", "height", "style-name", "caption-id", "class-names", "id", "layer", "name", "text-style-name", "transform", "z-index", "x", "y", "end-cell-address", "end-x", "end-y", "table-background", "anchor-page-number", "anchor-type");

    public static void zzZ(zzYQ7 zzyq7, CompositeNode compositeNode, zzYEF zzyef, Style style) {
        zzyq7.zzE5(null);
        zzYRU zzyruZzz = zzz(zzyq7);
        zzy(zzyq7);
        if (zzyruZzz instanceof zzYSM) {
            zzYS1.zzZ(zzyq7, compositeNode, (zzYSM) com.aspose.words.internal.zzZKW.zzZ(zzyruZzz, zzYSM.class), zzyef, style);
        }
    }

    private static void zzy(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ("control")) {
            String localName = zzyq9ZzYuT.getLocalName();
            if ("glue-point".equals(localName) || "desc".equals(localName) || NoteMeta.PROPERTY_TITLE.equals(localName)) {
                zzyq7.zzZ(1, true, "control");
            } else {
                zzyq9ZzYuT.zzk();
            }
        }
    }

    private static zzYRU zzz(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        zzYRU zzyruZzEJ = zzyq7.zzYuQ().zzEJ(zzyq9ZzYuT.zzV("control", ""));
        if (zzyruZzEJ == null) {
            return null;
        }
        zzyq9ZzYuT.zzj();
        while (zzyq9ZzYuT.zzi()) {
            if (!zzyq7.zzV(zzyq9ZzYuT)) {
                switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                    case 0:
                        break;
                    case 1:
                        zzyruZzEJ.setWidth(zzYSF.zzFV(zzyq9ZzYuT.getValue()));
                        break;
                    case 2:
                        zzyruZzEJ.setHeight(zzYSF.zzFV(zzyq9ZzYuT.getValue()));
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        zzyq7.zzZ(256, false, "control");
                        break;
                    default:
                        zzyq7.zzYi("control", zzyq9ZzYuT.getLocalName());
                        break;
                }
            }
        }
        return zzyruZzEJ;
    }
}
