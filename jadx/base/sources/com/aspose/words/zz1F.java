package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz1F {
    public static void zzS(ShapeBase shapeBase, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzxr.getCompliance();
        if (shapeBase.hasChildNodes()) {
            zzzydZzZlV.zzo();
            zzzydZzZlV.zzo();
        }
        if (shapeBase.zzY9i().zzZHY() == 8) {
            zz0F.zzX((zz2O) shapeBase.zzY9i(), zzzxr);
        }
        zzzydZzZlV.zzp();
    }

    public static void zzZ(ShapeBase shapeBase, zzZXR zzzxr) throws Exception {
        String str;
        zz53 zz53VarZzY9i = shapeBase.zzY9i();
        if (zz53VarZzY9i.zzZHY() != 0 && zz53VarZzY9i.zzZHY() != 8 && zz53VarZzY9i.zzZHY() != 1) {
            throw new IllegalArgumentException("Unexpected Dml node type.");
        }
        zz2O zz2o = (zz2O) zz53VarZzY9i;
        boolean z = zzzxr.getCompliance() == 2;
        int iZzZHY = zz2o.zzZHY();
        String str2 = "a";
        if (iZzZHY == 0) {
            str = "a:sp";
        } else if (iZzZHY == 1) {
            str = "a:cxnSp";
        } else {
            if (iZzZHY != 8) {
                throw new IllegalArgumentException("Unexpected Dml node type.");
            }
            str2 = z ? "wp" : "wps";
            str = com.aspose.words.internal.zzZKN.format("{0}:wsp", str2);
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(str);
        if (zz2o.zzZHY() == 8 && !z) {
            zzzydZzZlV.zz0("xmlns:wps", zz56.zz9(8, false));
        }
        zz4Y.zzZ(str2, zz2o, zzzxr);
        zz1T.zzZ(zz2o, zzzxr);
        if (shapeBase.zzY9i().zzZHY() == 0) {
            zz0F.zzX((zz2O) shapeBase.zzY9i(), zzzxr);
        }
        zz1I.zzZ(zz2o, zzzxr);
        if (shapeBase.hasChildNodes()) {
            zzzydZzZlV.zzY(z ? "wp:txbx" : "wps:txbx");
            zzzydZzZlV.zzZh("id", shapeBase.zzY9r());
            zzzydZzZlV.zzY(z ? "wne:txbxContent" : "w:txbxContent");
        } else if (shapeBase.zzY9q() > 0) {
            zzzydZzZlV.zzY(z ? "wp:linkedTxbx" : "wps:linkedTxbx");
            zzzydZzZlV.zzZh("id", shapeBase.zzY9q());
            zzzydZzZlV.zzZh("seq", shapeBase.zzY9p());
            zzzydZzZlV.zzo();
        }
    }
}
