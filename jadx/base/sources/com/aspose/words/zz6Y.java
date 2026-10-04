package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz6Y {
    private static ShapeBase zzP(ShapeBase shapeBase) {
        while (!shapeBase.isTopLevel()) {
            if (shapeBase.getParentNode().getNodeType() != 18 && shapeBase.getParentNode().getNodeType() != 17) {
                return null;
            }
            shapeBase = (ShapeBase) shapeBase.getParentNode();
        }
        return shapeBase;
    }

    public static void zzZ(ShapeBase shapeBase, zzZXR zzzxr) throws Exception {
        String str;
        String str2;
        zz53 zz53VarZzY9i = shapeBase.zzY9i();
        int iZzZHY = zz53VarZzY9i.zzZHY();
        if (iZzZHY != 3 && iZzZHY != 9) {
            throw new IllegalArgumentException("Unexpected group shape type.");
        }
        boolean z = zzzxr.getCompliance() == 2;
        ShapeBase shapeBaseZzP = zzP(shapeBase);
        int iZzZHY2 = shapeBaseZzP != null ? shapeBaseZzP.zzY9i().zzZHY() : iZzZHY;
        if (iZzZHY != 3) {
            str = z ? "wp" : "wpg";
            str2 = "wgp";
        } else {
            str = "a";
            str2 = "grpSp";
        }
        if (iZzZHY2 == 10 || iZzZHY2 == 9) {
            str = z ? "wp" : "wpg";
        }
        String str3 = com.aspose.words.internal.zzZKN.format("{0}:{1}", str, str2);
        zz6Z zz6z = (zz6Z) zz53VarZzY9i;
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(str3);
        if (iZzZHY == 9) {
            zzzydZzZlV.zz0("xmlns:wpg", zz56.zz9(9, z));
        }
        zz4Y.zzZ(str, zz6z, zzzxr);
        zzZ(str, zz6z, zzzxr);
    }

    public static void zzZ(String str, zzBK zzbk, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(com.aspose.words.internal.zzZKN.format("{0}:grpSpPr", str));
        if (zzbk.zzZHY() == 9 || zzbk.zzZHY() == 3) {
            zzzydZzZlV.zzA("bwMode", zz84.zzIT(((zz6Z) zzbk).zzZTg()), zz84.zzIT(1));
        }
        zzZZS.zzZ("a:xfrm", zzbk.zzZFj(), zzzxr);
        zz7T.zzZ(zzbk.getFill(), zzzxr, false);
        zz2A.zzZ(zzbk.zzZTe(), zzzxr, false);
        zzJN.zzZ(zzbk.zzZTd(), zzzxr, false);
        zz7Z.zzZ(zzbk.getExtensions(), zzzxr);
        zzzydZzZlV.zzo();
    }
}
