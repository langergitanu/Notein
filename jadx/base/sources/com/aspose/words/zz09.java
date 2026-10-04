package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz09 {
    private zzZC3 zzZge;

    private zz09(zz34 zz34Var) {
        this.zzZge = zz34Var;
    }

    public static zzX0 zzZ(ShapeBase shapeBase, zzZC5 zzzc5) {
        if (shapeBase == null) {
            return null;
        }
        return new zz09(new zz34(shapeBase.getDocument(), zzzc5)).zzy(shapeBase);
    }

    private static void zzw(ShapeBase shapeBase) {
        if (shapeBase.isTopLevel()) {
            shapeBase.zzY9i().zzZTh().zzXR(0L);
        }
    }

    private boolean zzx(ShapeBase shapeBase) {
        if (shapeBase.zzY9i() == null) {
            this.zzZge.zzI().zzZ(0, 2, "DrawingML SmartArt is not supported.");
            return true;
        }
        if (shapeBase.zzY9i().zzZHY() != 11 || "application/inkml+xml".equals(((zzB4) shapeBase.zzY9i()).zzZF0().getContentType())) {
            return false;
        }
        this.zzZge.zzI().zzZ(0, 2, "DrawingML ContentPart rendering is not supported.");
        return true;
    }

    private zzX0 zzy(ShapeBase shapeBase) {
        try {
            if (zzx(shapeBase)) {
                return null;
            }
            boolean z = shapeBase.zzY9i().zzZHY() == 5;
            boolean z2 = shapeBase.zzY9i().zzZHY() == 7 || shapeBase.zzY9i().zzZHY() == 6 || shapeBase.zzY9i().zzZHY() == 13;
            if (z && (com.aspose.words.internal.zzAN.zzZD(shapeBase.getWidth()) || com.aspose.words.internal.zzAN.zzZD(shapeBase.getHeight()))) {
                return null;
            }
            zz50 zz50Var = new zz50(this.zzZge);
            long jZzZ = zzZ(shapeBase, zz50Var, z2);
            zzX0 zzx0ZzZ = zzGS.zzZ((com.aspose.words.internal.zzG) zz4Z.zzN(shapeBase).zzZ(zz50Var), shapeBase);
            zzZ(shapeBase, jZzZ);
            return zzx0ZzZ;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static long zzZ(ShapeBase shapeBase, zz50 zz50Var, boolean z) {
        long size;
        if (z && !shapeBase.isTopLevel()) {
            size = ((ShapeBase) shapeBase.getParentNode()).zzYzG().getSize();
        } else {
            size = shapeBase.zzYzG().getSize();
        }
        zz50Var.zzXT(size);
        zzZ(shapeBase, zz50Var);
        long jZzZsb = shapeBase.zzY9i().zzZTh().zzZsb();
        zzw(shapeBase);
        return jZzZsb;
    }

    private static void zzZ(ShapeBase shapeBase, zz50 zz50Var) {
        for (ShapeBase shapeBase2 = (ShapeBase) com.aspose.words.internal.zzZKW.zzZ(shapeBase.getParentNode(), ShapeBase.class); shapeBase2 != null; shapeBase2 = (ShapeBase) com.aspose.words.internal.zzZKW.zzZ(shapeBase2.getParentNode(), ShapeBase.class)) {
            long jZzZsb = shapeBase2.zzY9i().zzZTh().zzZsb();
            zzw(shapeBase2);
            zz50Var.zzZy8().zzO(shapeBase2.zzY9i().zzZTh());
            zzZ(shapeBase2, jZzZsb);
        }
    }

    private static void zzZ(ShapeBase shapeBase, long j) {
        if (shapeBase.isTopLevel()) {
            shapeBase.zzY9i().zzZTh().zzXR(j);
        }
    }
}
