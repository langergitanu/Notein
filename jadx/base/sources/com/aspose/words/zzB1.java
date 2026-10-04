package com.aspose.words;

import com.aspose.words.ref.Ref;

/* JADX INFO: loaded from: classes6.dex */
final class zzB1 {
    public static void zzY(ShapeBase shapeBase, zzZXR zzzxr) throws Exception {
        zzB4 zzb4 = (zzB4) shapeBase.zzY9i();
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        boolean z = zzzxr.getCompliance() == 2;
        zzzydZzZlV.zzY("w14:contentPart");
        zzzydZzZlV.zz0("bwMode", zz84.zzIT(zzb4.zzZTg()));
        zzzydZzZlV.zz0("r:id", zzZ(zzb4, zzzxr));
        zzzydZzZlV.zz0("xmlns:r", zzZX5.zz9(0, z));
        zzzydZzZlV.zz0("xmlns:w14", zzZX5.zz9(20, z));
        zz4Y.zzZ("w14", zzb4, zzzxr);
        zzZZS.zzZ("w14:xfrm", zzb4.zzZTh(), zzzxr);
        zz7Z.zzZ("w14", zzb4.getExtensions(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static String zzZ(zzB4 zzb4, zzZXR zzzxr) throws Exception {
        String contentType = zzb4.zzZF0().getContentType();
        String strZz0 = zzZWV.zz0(21, zzzxr.getCompliance() == 2);
        String str = com.aspose.words.internal.zzZKN.format("ink/ink{0}.xml", Integer.valueOf(zzzxr.zzNG(strZz0)));
        Ref<String> ref = new Ref<>(null);
        com.aspose.words.internal.zz77 zz77VarZzZ = zzzxr.zzZmf().zzZ(zzzxr.zzZlV().zzZmN(), str, contentType, strZz0, ref);
        String str2 = ref.get();
        zz77VarZzZ.zz5(zzb4.zzZF0().zzR1());
        zzZXR.zzZ(zzb4.zzZF0(), zzb4.zzZEZ(), zz77VarZzZ, zzzxr);
        return str2;
    }
}
