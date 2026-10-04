package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz3R {
    public static void zzY(ShapeBase shapeBase, zzZXR zzzxr) throws Exception {
        zz53 zz53VarZzY9i = shapeBase.zzY9i();
        if (zz53VarZzY9i.zzZHY() != 2) {
            throw new IllegalArgumentException("Unexpected Dml node type.");
        }
        ShapeBase shapeBaseZzYa6 = shapeBase.zzYa6();
        String str = (shapeBaseZzYa6 == null || shapeBaseZzYa6.zzY9i().zzZHY() != 5) ? "pic" : "a";
        String str2 = com.aspose.words.internal.zzZKN.format("{0}:pic", str);
        zz3V zz3v = (zz3V) zz53VarZzY9i;
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        boolean z = zzzxr.getCompliance() == 2;
        zzzydZzZlV.zzY(str2);
        zzzydZzZlV.zz0("xmlns:pic", zz56.zz9(zz3v.zzZHY(), z));
        zz4Y.zzZ(str, zz3v, zzzxr);
        zz7T.zzZ(str, zz3v.zzZwy(), zzzxr);
        zz1T.zzZ(str, zz3v, zzzxr);
        zz7Z.zzZ(zz3v.getExtensions(), zzzxr);
        zz1I.zzZ(zz3v, zzzxr);
        zzzydZzZlV.zzo();
    }
}
