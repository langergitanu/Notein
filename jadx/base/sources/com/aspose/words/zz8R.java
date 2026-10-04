package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz8R {
    public static void zzZ(zz8S zz8s, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        boolean z = zzzxr.getCompliance() == 2;
        zzzydZzZlV.zzZ("dgm:styleDef");
        zzzydZzZlV.zz0("xmlns:dgm", zzZX5.zz9(8, z));
        zzzydZzZlV.zz0("xmlns:a", zzZX5.zz9(6, z));
        zzzydZzZlV.zz0("uniqueId", zz8s.getUniqueId());
        zzzydZzZlV.zz0("minVer", zz8s.zzZEN());
        zzAO.zzZ("dgm:title", zz8s.zzZEK(), zzzxr);
        zzAO.zzZ("dgm:desc", zz8s.zzZEJ(), zzzxr);
        zzAO.zzZ(zz8s.zzZEL(), zzzxr);
        zzJN.zzZ("dgm", zz8s.zzZCu(), zzzxr, false);
        zzZ(zz8s.zzZCt(), zzzxr);
        zz7Z.zzZ("dgm", zz8s.getExtensions(), zzzxr);
        zzzydZzZlV.endDocument();
    }

    private static void zzZ(zz18[] zz18VarArr, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        for (zz18 zz18Var : zz18VarArr) {
            zzzydZzZlV.zzY("dgm:styleLbl");
            zzzydZzZlV.zzX("name", zz18Var.getName());
            zzJN.zzZ("dgm", zz18Var.zzZCu(), zzzxr, false);
            zzJN.zzZ("dgm", zz18Var.zzZtV(), zzzxr, false);
            zzZ(zz18Var.zzZtU(), zzzxr);
            zz1I.zzZ("dgm", zz18Var.zzZTj(), zzzxr);
            zz7Z.zzZ("dgm", zz18Var.getExtensions(), zzzxr);
            zzzydZzZlV.zzo();
        }
    }

    private static void zzZ(zz8M zz8m, zzZXR zzzxr) throws Exception {
        if (zz8m == null) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("dgm:txPr");
        if (zz8m.zzZCo() != null) {
            zzzydZzZlV.zzX("dgm:flatTx", "z", Double.valueOf(zz8m.zzZCo().zzZB2()));
        }
        zzJN.zzZ("a", zz8m.zzZTc(), zzzxr, false);
        zzzydZzZlV.zzo();
    }
}
