package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYTF {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("caption-point-x", "caption-point-y", "caption-id", "class-names", "corner-radius", "id", "layer", "name", "style-name", "text-style-name", "transform", "z-index", "end-cell-address", "end-x", "end-y", "table-background", "anchor-page-number", "anchor-type");

    public static void zzZ(zzYQ7 zzyq7, CompositeNode compositeNode, zzYEF zzyef) throws Exception {
        zzyq7.zzS8(true);
        Shape shape = new Shape(zzyq7.getDocument());
        if (zzyef != null) {
            zzyef.zzY(shape.zzZYh());
        }
        zzYC3 zzyc3 = new zzYC3();
        zzYC3 zzyc32 = new zzYC3();
        zzyc32.zzQ(EditingLanguage.LULE_SAMI_NORWAY, 48);
        zzZ(zzyq7, zzyc32);
        zzYRR.zzX(zzyq7, zzyc3);
        zzZ(zzyq7, shape, zzyc32);
        zzyc3.zzQ(190, Boolean.FALSE);
        shape.zzS(zzyc3);
        zzyc32.zzY(shape.zzYvW());
        compositeNode.appendChild(shape);
        zzyq7.zzS8(false);
    }

    private static void zzZ(zzYQ7 zzyq7, zzYC3 zzyc3) {
        zzyq7.zzE5(null);
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        Object objZzPk = zzyc3.zzPk(4126);
        int iIntValue = objZzPk != null ? ((Integer) objZzPk).intValue() : 21600;
        zzyc3.zzQ(StyleIdentifier.LIST_TABLE_6_COLORFUL, 0);
        int i = iIntValue / 2;
        zzyc3.zzQ(StyleIdentifier.LIST_TABLE_7_COLORFUL, Integer.valueOf(i));
        zzyc3.zzQ(StyleIdentifier.LIST_TABLE_2_ACCENT_1, Integer.valueOf(i));
        zzyq7.zzZ(zzyq9ZzYuT, zzyc3, "caption");
        while (zzyq9ZzYuT.zzi()) {
            if (!zzyq7.zzV(zzyq7, zzyc3, "caption")) {
                switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                    case 0:
                        Object objZzPk2 = zzyc3.zzPk(4125);
                        int iZzFV = (int) (zzYSF.zzFV(zzyq9ZzYuT.getValue()) * (((double) (objZzPk2 != null ? ((Integer) objZzPk2).intValue() : 21600)) / ((Double) zzyc3.zzPk(4131)).doubleValue()));
                        zzyc3.zzQ(StyleIdentifier.LIST_TABLE_3_ACCENT_1, Integer.valueOf(iZzFV));
                        zzyc3.zzQ(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_1, Integer.valueOf(iZzFV / 2));
                        break;
                    case 1:
                        zzyc3.zzQ(StyleIdentifier.LIST_TABLE_4_ACCENT_1, Integer.valueOf((int) (zzYSF.zzFV(zzyq9ZzYuT.getValue()) * (((double) iIntValue) / ((Double) zzyc3.zzPk(4132)).doubleValue()))));
                        break;
                    case 2:
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
                        zzyq7.zzZ(256, false, "caption");
                        break;
                    default:
                        zzyq7.zzYi("caption", zzyq9ZzYuT.getLocalName());
                        break;
                }
            }
        }
    }

    private static void zzZ(zzYQ7 zzyq7, Shape shape, zzYC3 zzyc3) throws Exception {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ("caption")) {
            if (!zzYQ7.zzZ(zzyq7, shape) && !zzyq7.zzR(zzyc3) && zzYQ7.zzE8(zzyq9ZzYuT.getLocalName())) {
                zzyq7.zzZ(1, true, "caption");
            }
        }
    }
}
