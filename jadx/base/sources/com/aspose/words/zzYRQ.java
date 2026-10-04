package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYRQ {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("z-index", "caption-id", "class-names", "id", "name", "style-name", "y", "end-cell-address", "end-x", "end-y", "table-background", "anchor-page-number");

    public static void zzZ(zzYQ7 zzyq7, CompositeNode compositeNode, zzYEF zzyef) throws Exception {
        GroupShape groupShape = new GroupShape(zzyq7.getDocument());
        zzZ(zzyq7, groupShape);
        zzYRL zzyrl = (zzYRL) zzyq7.zzYuS().zzY(zzyq7.zzYuP(), "graphic", zzyq7.zzYuO(), true);
        if (zzyrl != null && zzyrl.zzYvW() != null) {
            zzyrl.zzYvW().zzY(groupShape.zzYvW());
        }
        if (zzyef != null) {
            zzyef.zzY(groupShape.zzZYh());
        }
        zzZ(zzyq7, (ShapeBase) groupShape, zzyef);
        if (groupShape.getChildNodes(0, false).getCount() > 0 || !(compositeNode instanceof GroupShape)) {
            zzZN(groupShape);
            compositeNode.appendChild(groupShape);
        }
    }

    private static void zzZN(ShapeBase shapeBase) throws Exception {
        if (shapeBase.getChildNodes(0, false).getCount() <= 0) {
            return;
        }
        double dMax = -1.7976931348623157E308d;
        double dMin = Double.MAX_VALUE;
        double dMin2 = Double.MAX_VALUE;
        double dMax2 = -1.7976931348623157E308d;
        for (ShapeBase shapeBase2 : shapeBase.getChildNodes(0, false)) {
            dMin = Math.min(shapeBase2.getLeft(), dMin);
            dMin2 = Math.min(shapeBase2.getTop(), dMin2);
            dMax = Math.max(shapeBase2.getRight(), dMax);
            dMax2 = Math.max(shapeBase2.getBottom(), dMax2);
        }
        long jZzZm = com.aspose.words.internal.zzZPX.zzZm((int) (dMax - dMin), (int) (dMax2 - dMin2));
        int i = (int) (jZzZm >>> 32);
        if (i > 0 || ((int) jZzZm) > 0) {
            shapeBase.zzXi(jZzZm);
            shapeBase.setWidth((int) jZzZm);
            shapeBase.setHeight(i);
        }
        shapeBase.zzHw((int) dMin);
        shapeBase.zzHv((int) dMin2);
        shapeBase.setLeft(shapeBase.zzY9h().zzZyh());
        shapeBase.setTop(shapeBase.zzY9h().zzZyg());
    }

    private static void zzZ(zzYQ7 zzyq7, ShapeBase shapeBase) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            if (!zzyq7.zzV(zzyq9ZzYuT) && !zzyq7.zzX(zzyq7, shapeBase.zzYvW(), "draw:g")) {
                switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                    case 0:
                        shapeBase.zzYvW().zzQ(4154, Integer.valueOf(zzyq9ZzYuT.zzb()));
                        break;
                    case 1:
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
                        zzyq7.zzZ(256, false, "g");
                        break;
                    default:
                        zzyq7.zzYi("g", zzyq9ZzYuT.getLocalName());
                        break;
                }
            }
        }
    }

    private static void zzZ(zzYQ7 zzyq7, ShapeBase shapeBase, zzYEF zzyef) throws Exception {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzY("g", 7)) {
            if (zzYQ7.zzZ(zzyq7, shapeBase, zzyef, null, "g")) {
                zzyq7.zzSa(true);
            } else if (!zzyq7.zzR(shapeBase.zzYvW()) && zzYQ7.zzE8(zzyq9ZzYuT.getLocalName())) {
                zzyq7.zzZ(1, true, "g");
            }
        }
    }
}
