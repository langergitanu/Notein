package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes6.dex */
final class zzYSJ {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW(C18437z2.f56754h, "end-glue-point", "end-shape", "line-skew", "start-glue-point", "start-shape", "d", "viewBox");

    private static void zzY(zzYQ7 zzyq7, zzYC3 zzyc3) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ("connector")) {
            if (!zzyq7.zzR(zzyc3)) {
                String localName = zzyq9ZzYuT.getLocalName();
                if (zzYQ7.zzE8(localName) || "list".equals(localName) || ContextChain.TAG_PRODUCT.equals(localName)) {
                    zzyq7.zzZ(1, true, "connector");
                }
            }
        }
    }

    public static void zzZ(zzYQ7 zzyq7, CompositeNode compositeNode, zzYEF zzyef) {
        Shape shape = new Shape(zzyq7.getDocument());
        if (zzyef != null) {
            zzyef.zzY(shape.zzZYh());
        }
        zzYC3 zzyc3 = new zzYC3();
        zzYC3 zzyc32 = new zzYC3();
        zzyc32.zzQ(EditingLanguage.LULE_SAMI_NORWAY, 32);
        zzZ(zzyq7, zzyc32);
        zzYRR.zzX(zzyq7, zzyc3);
        zzY(zzyq7, zzyc32);
        shape.zzS(zzyc3);
        zzyc32.zzY(shape.zzYvW());
        compositeNode.appendChild(shape);
    }

    private static void zzZ(zzYQ7 zzyq7, zzYC3 zzyc3) {
        zzyq7.zzE5(null);
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        double[] dArr = new double[4];
        zzyq7.zzZ(zzyq9ZzYuT, zzyc3, "connector");
        while (zzyq9ZzYuT.zzi()) {
            if (!zzyq7.zzV(zzyq7, zzyc3, "connector")) {
                switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                    case 0:
                        zzyc3.zzQ(771, Integer.valueOf(zzYS3.zzFi(zzyq9ZzYuT.getValue())));
                        break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        zzyq7.zzZ(256, false, "connector");
                        break;
                    default:
                        zzyq7.zzYi("connector", zzyq9ZzYuT.getLocalName());
                        break;
                }
                zzYRB.zzZ(zzyq9ZzYuT, dArr);
            }
        }
        zzYRB.zzZ(zzyc3, dArr);
    }
}
