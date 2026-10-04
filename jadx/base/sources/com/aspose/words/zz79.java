package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz79 {
    public static void zzY(zzZXR zzzxr, ShapeBase shapeBase) throws Exception {
        zz53 zz53VarZzY9i = shapeBase.zzY9i();
        zz6Z zz6z = (zz6Z) zz53VarZzY9i;
        String strZzZ = zzZ(zzzxr, zz53VarZzY9i);
        if (zz6z.zzZ(zz6z)) {
            zzZZS.zzZ(com.aspose.words.internal.zzZKN.format("{0}:xfrm", strZzZ), zz6z.zzZFj(), zzzxr);
        }
        zz7Z.zzZ(((zz6Z) shapeBase.zzY9i()).getExtensions(), zzzxr);
        zzzxr.zzZlV().zzp();
    }

    public static void zzZ(ShapeBase shapeBase, zzZXR zzzxr) throws Exception {
        zz53 zz53VarZzY9i = shapeBase.zzY9i();
        String strZzZ = zzZ(zzzxr, zz53VarZzY9i);
        zzzxr.zzZlV().zzY(com.aspose.words.internal.zzZKN.format("{0}:graphicFrame", strZzZ));
        zz6Z zz6z = (zz6Z) zz53VarZzY9i;
        zz4Y.zzZ(strZzZ, zz6z, zzzxr);
        if (zz6z.zzZ(zz6z)) {
            return;
        }
        zzZZS.zzZ(com.aspose.words.internal.zzZKN.format("{0}:xfrm", strZzZ), zz6z.zzZFj(), zzzxr);
    }

    private static String zzZ(zzZXR zzzxr, zz53 zz53Var) {
        boolean z = zzzxr.getCompliance() == 2;
        zz6Z zz6z = (zz6Z) zz53Var;
        if (zz6z.zzZ(zz6z)) {
            return "a";
        }
        return z ? "wp" : "wpg";
    }
}
