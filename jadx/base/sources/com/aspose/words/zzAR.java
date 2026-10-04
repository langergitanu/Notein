package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzAR {
    public static void zzZ(zzAT zzat, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        boolean z = zzzxr.getCompliance() == 2;
        zzzydZzZlV.zzZ("dgm:colorsDef");
        zzzydZzZlV.zz0("xmlns:dgm", zzZX5.zz9(8, z));
        zzzydZzZlV.zz0("xmlns:a", zzZX5.zz9(6, z));
        zzzydZzZlV.zzA("uniqueId", zzat.getUniqueId(), "");
        zzzydZzZlV.zzA("minVer", zzat.zzZEN(), "");
        zzAO.zzZ("dgm:title", zzat.zzZEK(), zzzxr);
        zzAO.zzZ("dgm:desc", zzat.zzZEJ(), zzzxr);
        zzAO.zzZ(zzat.zzZEL(), zzzxr);
        zzZ(zzat.zzZEM(), zzzxr);
        zz7Z.zzZ("dgm", zzat.getExtensions(), zzzxr);
        zzzydZzZlV.endDocument();
    }

    private static void zzZ(zzBO[] zzboArr, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        for (zzBO zzbo : zzboArr) {
            zzzydZzZlV.zzY("dgm:styleLbl");
            zzzydZzZlV.zz0("name", zzbo.getName());
            zzZ("dgm:fillClrLst", zzbo.zzZFs(), zzzxr);
            zzZ("dgm:linClrLst", zzbo.zzZFr(), zzzxr);
            zzZ("dgm:effectClrLst", zzbo.zzZFq(), zzzxr);
            zzZ("dgm:txLinClrLst", zzbo.zzZFp(), zzzxr);
            zzZ("dgm:txFillClrLst", zzbo.zzZFo(), zzzxr);
            zzZ("dgm:txEffectClrLst", zzbo.zzZFn(), zzzxr);
            zz7Z.zzZ("dgm", zzbo.getExtensions(), zzzxr);
            zzzydZzZlV.zzo();
        }
    }

    private static void zzZ(String str, zzAQ zzaq, zzZXR zzzxr) {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(str);
        zzzydZzZlV.zzA("meth", zz9Z.zzJ6(zzaq.zzZEE()), "span");
        zzzydZzZlV.zzA("hueDir", zz9Z.zzJ5(zzaq.zzZEF()), "cw");
        for (zzBW zzbw : zzaq.zzZO0()) {
            zzBN.zzZ(zzbw, zzzxr);
        }
        zzzydZzZlV.zzo();
    }
}
