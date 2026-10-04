package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzGN {
    private static void zzY(zz5H zz5h, zzZXR zzzxr) throws Exception {
        if (zz5h.getOutline() == null) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(zzzxr.getCompliance() == 2 ? "wp:whole" : "wpc:whole");
        zz4B.zzZ("a:ln", zz5h.getOutline(), zzzxr);
        zzzydZzZlV.zzo();
    }

    public static void zzZ(ShapeBase shapeBase, zzZXR zzzxr) throws Exception {
        zz53 zz53VarZzY9i = shapeBase.zzY9i();
        int iZzZHY = zz53VarZzY9i.zzZHY();
        boolean z = zzzxr.getCompliance() == 2;
        if (iZzZHY != 5 && iZzZHY != 10) {
            throw new IllegalArgumentException("Unexpected canvas shape type.");
        }
        String str = z ? "wp" : "wpc";
        String str2 = z ? "wp:wpc" : "wpc:wpc";
        if (iZzZHY == 5) {
            str = "a";
            str2 = "lc:lockedCanvas";
        }
        zz5H zz5h = (zz5H) zz53VarZzY9i;
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(str2);
        if (iZzZHY == 5) {
            zzzydZzZlV.zzX("xmlns:lc", zz56.zz9(5, z));
        }
        if (iZzZHY == 10) {
            zzZ(zz5h, zzzxr);
            zzY(zz5h, zzzxr);
        }
        zz4Y.zzZ(str, zz5h, zzzxr);
        if (iZzZHY != 10) {
            zz6Y.zzZ(str, zz5h, zzzxr);
        }
    }

    private static void zzZ(zz5H zz5h, zzZXR zzzxr) throws Exception {
        if (zz5h.getFill().zzZQ4() == 6) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(zzzxr.getCompliance() == 2 ? "wp:bg" : "wpc:bg");
        zz7T.zzZ(zz5h.getFill(), zzzxr, false);
        zzzydZzZlV.zzo();
    }
}
