package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYRB {
    public static void zzZ(zzYQ7 zzyq7, CompositeNode compositeNode, zzYEF zzyef, String str) {
        String localName = zzyq7.zzYuT().getLocalName();
        Shape shape = new Shape(zzyq7.getDocument());
        if (zzyef != null) {
            zzyef.zzY(shape.zzZYh());
        }
        zzYC3 zzyc3 = new zzYC3();
        zzYC3 zzyc32 = new zzYC3();
        zzyc32.zzQ(EditingLanguage.LULE_SAMI_NORWAY, 20);
        zzZ(zzyq7, zzyc32, str);
        zzYRR.zzX(zzyq7, zzyc3);
        shape.zzS(zzyc3);
        zzyc32.zzY(shape.zzYvW());
        zzyq7.zzX(zzyq7, localName, zzyc32);
        if (compositeNode.zzT(shape)) {
            compositeNode.appendChild(shape);
        }
    }

    private static void zzZ(zzYQ7 zzyq7, zzYC3 zzyc3, String str) {
        zzyq7.zzE5(null);
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        double[] dArr = new double[4];
        zzyq7.zzZ(zzyq9ZzYuT, zzyc3, str);
        while (zzyq9ZzYuT.zzi()) {
            if (!zzyq7.zzV(zzyq7, zzyc3, str)) {
                zzZ(zzyq9ZzYuT, dArr);
            }
        }
        zzZ(zzyc3, dArr);
    }

    public static void zzZ(zzYQ9 zzyq9, double[] dArr) {
        double dZzFV = zzYSF.zzFV(zzyq9.getValue());
        if ("x1".equals(zzyq9.getLocalName())) {
            dArr[0] = dZzFV;
            return;
        }
        if ("y1".equals(zzyq9.getLocalName())) {
            dArr[1] = dZzFV;
        } else if ("x2".equals(zzyq9.getLocalName())) {
            dArr[2] = dZzFV;
        } else if ("y2".equals(zzyq9.getLocalName())) {
            dArr[3] = dZzFV;
        }
    }

    public static void zzZ(zzYC3 zzyc3, double[] dArr) {
        zzyc3.zzQ(4129, Double.valueOf(Math.min(dArr[0], dArr[2])));
        zzyc3.zzQ(4130, Double.valueOf(Math.min(dArr[1], dArr[3])));
        zzyc3.zzQ(4131, Double.valueOf(Math.abs(dArr[0] - dArr[2])));
        zzyc3.zzQ(4132, Double.valueOf(Math.abs(dArr[1] - dArr[3])));
        boolean z = dArr[0] > dArr[2];
        boolean z2 = dArr[1] > dArr[3];
        if (z && z2) {
            zzyc3.zzQ(4096, 3);
        } else if (z) {
            zzyc3.zzQ(4096, 1);
        } else if (z2) {
            zzyc3.zzQ(4096, 2);
        }
    }
}
