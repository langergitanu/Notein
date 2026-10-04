package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzA0 {
    public static void zzY(ShapeBase shapeBase, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        boolean z = zzzxr.getCompliance() == 2;
        zzzydZzZlV.zzZ("dsp:drawing");
        zzzydZzZlV.zz0("xmlns:dgm", zzZX5.zz9(8, z));
        zzzydZzZlV.zz0("xmlns:dsp", zzZX5.zz9(24, z));
        zzzydZzZlV.zz0("xmlns:a", zzZX5.zz9(6, z));
        zzZ("dsp:spTree", shapeBase, zzzxr);
        zzzydZzZlV.endDocument();
    }

    private static void zzZ(String str, ShapeBase shapeBase, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(str);
        zz4Y.zzZ("dsp", shapeBase.zzY9i(), zzzxr);
        zz6Y.zzZ("dsp", (zzBK) shapeBase.zzY9i(), zzzxr);
        for (Shape shape : shapeBase.getChildNodes(0, false)) {
            int iZzZHY = shape.zzY9i().zzZHY();
            if (iZzZHY == 0) {
                zzY((zz2O) shape.zzY9i(), zzzxr);
            } else if (iZzZHY == 3) {
                zzZ("dsp:grpSp", shapeBase, zzzxr);
            }
        }
        zzzydZzZlV.zzo();
    }

    private static void zzY(zz2O zz2o, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("dsp:sp");
        zzzydZzZlV.zz0("modelId", zz9Z.zzQ(zz2o.zzZEC()));
        zz4Y.zzZ("dsp", zz2o, zzzxr);
        zz1T.zzZ("dsp", zz2o, zzzxr);
        zz1I.zzZ("dsp", zz2o.zzZTj(), zzzxr);
        if (zz2o.zzZAk() != null) {
            zz0F.zzZ("dsp:txBody", zz2o.zzZAk().zzZCZ(), zzzxr);
            zzZZS.zzZ("dsp:txXfrm", zz2o.zzZAk().zzZTh(), zzzxr);
        }
        zzzydZzZlV.zzo();
    }
}
