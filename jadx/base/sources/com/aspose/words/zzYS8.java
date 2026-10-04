package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: loaded from: classes6.dex */
final class zzYS8 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("r", "end-angle", "kind", "start-angle", "cx", TranslateLanguage.WELSH, "rx", "ry");

    public static void zzZ(zzYQ7 zzyq7, CompositeNode compositeNode, zzYEF zzyef, String str) throws Exception {
        zzyq7.zzS8(true);
        String localName = zzyq7.zzYuT().getLocalName();
        Shape shape = new Shape(zzyq7.getDocument());
        if (zzyef != null) {
            zzyef.zzY(shape.zzZYh());
        }
        zzYC3 zzyc3 = new zzYC3();
        zzYC3 zzyc32 = new zzYC3();
        zzyc32.zzQ(EditingLanguage.LULE_SAMI_NORWAY, 3);
        zzZ(zzyq7, zzyc32, str);
        zzYRR.zzX(zzyq7, zzyc3);
        zzZ(zzyq7, localName, shape, zzyc32);
        shape.zzS(zzyc3);
        zzyc32.zzY(shape.zzYvW());
        compositeNode.appendChild(shape);
        zzyq7.zzS8(false);
    }

    private static void zzZ(zzYQ7 zzyq7, String str, Shape shape, zzYC3 zzyc3) throws Exception {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ(str)) {
            if (!zzYQ7.zzZ(zzyq7, shape) && !zzyq7.zzR(zzyc3) && zzYQ7.zzE8(zzyq9ZzYuT.getLocalName())) {
                zzyq7.zzZ(1, true, str);
            }
        }
    }

    private static void zzZ(zzYQ7 zzyq7, zzYC3 zzyc3, String str) {
        zzyq7.zzE5(null);
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        zzyq7.zzZ(zzyq9ZzYuT, zzyc3, str);
        while (zzyq9ZzYuT.zzi()) {
            if (!zzyq7.zzV(zzyq7, zzyc3, str)) {
                switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                    case 0:
                        if ("circle".equals(str)) {
                            zzyq7.zzZ(1, false, str);
                        }
                        break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        zzyq7.zzZ(256, false, str);
                        break;
                    default:
                        zzyq7.zzYi(str, zzyq9ZzYuT.getLocalName());
                        break;
                }
            }
        }
    }
}
