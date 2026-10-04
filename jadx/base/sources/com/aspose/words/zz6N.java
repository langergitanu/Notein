package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz6N {
    public static void zzZ(String str, String str2, String str3, String str4, com.aspose.words.internal.zzZYG<zz82> zzzyg, zzZXR zzzxr) throws Exception {
        if (str2 == null) {
            return;
        }
        boolean z = zzzxr.getCompliance() == 2;
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(str);
        zzzydZzZlV.zz0("xmlns:a", zzZX5.zz9(6, z));
        if (com.aspose.words.internal.zzZVR.zzWv(com.aspose.words.internal.zzZVR.zzWt(str2)).length() > 2235) {
            str2 = "";
        }
        zzzydZzZlV.zzX("r:id", com.aspose.words.internal.zzZYD.zzXk(str2) ? zzzxr.zzNF(str2) : "");
        zzzydZzZlV.zz0("xmlns:r", zzZX5.zz9(0, z));
        zzzydZzZlV.zz0("tgtFrame", str3);
        zzzydZzZlV.zz0("tooltip", str4);
        zz7Z.zzZ(zzzyg, zzzxr);
        zzzydZzZlV.zzp();
    }
}
