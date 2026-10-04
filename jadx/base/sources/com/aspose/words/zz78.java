package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz78 {
    private static void zzP(ShapeBase shapeBase, zzZXR zzzxr) throws Exception {
        switch (shapeBase.zzY9i().zzZHY()) {
            case 0:
            case 1:
            case 8:
                zz1F.zzS(shapeBase, zzzxr);
                return;
            case 2:
            case 6:
            case 7:
            case 11:
            case 13:
                return;
            case 3:
            case 9:
                zzzxr.zzZlV().zzp();
                return;
            case 4:
            default:
                throw new IllegalArgumentException("Unexpected DrawingML type.");
            case 5:
            case 10:
                zzzxr.zzZlV().zzp();
                return;
            case 12:
                zz79.zzY(zzzxr, shapeBase);
                return;
        }
    }

    private static boolean zzQ(ShapeBase shapeBase) {
        if (shapeBase.isTopLevel()) {
            return true;
        }
        CompositeNode parentNode = shapeBase.getParentNode();
        if (parentNode.getNodeType() != 17) {
            return false;
        }
        ShapeBase shapeBase2 = (ShapeBase) parentNode;
        return shapeBase2.zzY9i() != null && shapeBase2.zzY9i().zzZHY() == 12;
    }

    public static void zzS(ShapeBase shapeBase, zzZXR zzzxr) throws Exception {
        zzP(shapeBase, zzzxr);
        if (zzQ(shapeBase)) {
            zzzxr.zzZlV().zzo();
            zzzxr.zzZlV().zzo();
        }
    }

    public static void zzZ(ShapeBase shapeBase, zzZXR zzzxr) throws Exception {
        if (zzQ(shapeBase)) {
            zzZYD zzzydZzZlV = zzzxr.zzZlV();
            boolean z = zzzxr.getCompliance() == 2;
            zzzydZzZlV.zzY("a:graphic");
            zzzydZzZlV.zz0("xmlns:a", zzZX5.zz9(6, z));
            zzzydZzZlV.zzY("a:graphicData");
            zzzydZzZlV.zz0("uri", zz56.zz9(shapeBase.zzY9i().zzZHY(), z));
        }
        zzQ(shapeBase, zzzxr);
    }

    private static void zzQ(ShapeBase shapeBase, zzZXR zzzxr) throws Exception {
        switch (shapeBase.zzY9i().zzZHY()) {
            case 0:
            case 1:
            case 8:
                zz1F.zzZ(shapeBase, zzzxr);
                return;
            case 2:
                zz3R.zzY(shapeBase, zzzxr);
                return;
            case 3:
            case 9:
                zz6Y.zzZ(shapeBase, zzzxr);
                return;
            case 4:
            default:
                throw new IllegalArgumentException("Unexpected DrawingML type.");
            case 5:
            case 10:
                zzGN.zzZ(shapeBase, zzzxr);
                return;
            case 6:
            case 13:
                zzC7.zzY(shapeBase, zzzxr);
                return;
            case 7:
                zz8K.zzZ(shapeBase.zzY9i(), zzzxr);
                return;
            case 11:
                zzB1.zzY(shapeBase, zzzxr);
                return;
            case 12:
                zz79.zzZ(shapeBase, zzzxr);
                return;
        }
    }
}
