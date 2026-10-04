package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz1T {
    public static void zzZ(zz2J zz2j, zzZXR zzzxr) throws Exception {
        String str;
        boolean z = zzzxr.getCompliance() == 2;
        int iZzZHY = zz2j.zzZHY();
        if (iZzZHY == 0 || iZzZHY == 1) {
            str = "a";
        } else if (iZzZHY == 2) {
            str = "pic";
        } else {
            if (iZzZHY != 8) {
                throw new IllegalArgumentException("Unexpected Dml node type.");
            }
            str = z ? "wp" : "wps";
        }
        zzZ(str, zz2j, zzzxr);
    }

    public static void zzZ(String str, zzZC0 zzzc0, zzZXR zzzxr) throws Exception {
        if (zzzc0 == null) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(com.aspose.words.internal.zzZKN.format("{0}:spPr", str));
        zzzydZzZlV.zz0("bwMode", zz84.zzIT(zzzc0.zzZTg()));
        zzZZS.zzZ("a:xfrm", zzzc0.zzZTh(), zzzxr);
        zz7I.zzZ(zzzc0.zzZTf(), zzzxr);
        zzZCL zzzcl = (zzZCL) zzzc0;
        zz7T.zzZ(zzzcl.getFill(), zzzxr, false);
        zz4B.zzZ("a:ln", zzzcl.getOutline(), zzzxr);
        zz2A.zzZ(zzzc0.zzZTe(), zzzxr, false);
        zzJN.zzZ(zzzc0.zzZTd(), zzzxr, false);
        zzJN.zzZ(zzzc0.zzZTc(), zzzxr, false);
        zz7Z.zzZ(zzzc0.zzZTb(), zzzxr);
        zzzydZzZlV.zzo();
    }
}
