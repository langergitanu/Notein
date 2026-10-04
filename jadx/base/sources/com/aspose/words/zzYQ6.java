package com.aspose.words;

import com.orion.penkit.tools.DrawToolFactory;

/* JADX INFO: loaded from: classes6.dex */
final class zzYQ6 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("corner-radius", "rx", "ry");

    private static void zz0(Shape shape) {
        Paragraph paragraph;
        NodeCollection childNodes = shape.getChildNodes(0, false);
        if (childNodes.getCount() != 1 || (paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(childNodes.get(0), Paragraph.class)) == null || paragraph.hasChildNodes()) {
            return;
        }
        shape.getChildNodes(0, false).clear();
    }

    public static void zzZ(zzYQ7 zzyq7, CompositeNode compositeNode, zzYEF zzyef) throws Exception {
        zzyq7.zzS8(true);
        Shape shape = new Shape(zzyq7.getDocument());
        if (zzyef != null) {
            zzyef.zzY(shape.zzZYh());
        }
        zzYC3 zzyc3 = new zzYC3();
        zzyc3.zzQ(EditingLanguage.LULE_SAMI_NORWAY, 1);
        zzZ(zzyq7, zzyc3);
        zzYRR.zzX(zzyq7, shape.zzYvW());
        zzZ(zzyq7, DrawToolFactory.LASSO_TYPE_RECT, shape, zzyc3);
        zzyc3.zzY(shape.zzYvW());
        compositeNode.appendChild(shape);
        zzyq7.zzS8(false);
    }

    private static void zzZ(zzYQ7 zzyq7, String str, Shape shape, zzYC3 zzyc3) throws Exception {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzY(str, 7)) {
            if (!zzYQ7.zzZ(zzyq7, shape) && !zzyq7.zzR(zzyc3) && !zzYQ7.zzY(zzyq7, shape) && zzYQ7.zzE8(zzyq9ZzYuT.getLocalName())) {
                zzyq7.zzZ(1, true, str);
            }
        }
        zz0(shape);
    }

    private static void zzZ(zzYQ7 zzyq7, zzYC3 zzyc3) {
        zzyq7.zzE5(null);
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        zzyq7.zzZ(zzyq9ZzYuT, zzyc3, DrawToolFactory.LASSO_TYPE_RECT);
        while (zzyq9ZzYuT.zzi()) {
            if (!zzyq7.zzV(zzyq7, zzyc3, DrawToolFactory.LASSO_TYPE_RECT)) {
                int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
                if (iZzTP != 0 && iZzTP != 1 && iZzTP != 2) {
                    zzyq7.zzYi(DrawToolFactory.LASSO_TYPE_RECT, zzyq9ZzYuT.getLocalName());
                } else {
                    zzyq7.zzZ(256, false, DrawToolFactory.LASSO_TYPE_RECT);
                }
            }
        }
    }
}
