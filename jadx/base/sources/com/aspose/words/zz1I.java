package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz1I {
    public static void zzZ(zz2J zz2j, zzZXR zzzxr) {
        String str;
        int iZzZHY = zz2j.zzZHY();
        if (iZzZHY == 0 || iZzZHY == 1) {
            str = "a";
        } else if (iZzZHY == 2) {
            str = "pic";
        } else {
            if (iZzZHY != 8) {
                throw new IllegalArgumentException("Unexpected Dml node type.");
            }
            str = "wps";
        }
        zzZ(str, zz2j.zzZTj(), zzzxr);
    }

    public static void zzZ(String str, zz1K zz1k, zzZXR zzzxr) {
        if (zz1k == null || zz1k.isEmpty()) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(com.aspose.words.internal.zzZKN.format("{0}:style", str));
        zzZ(zz1k.zzZu4(), zzzxr);
        zzZ(zz1k.zzZu6(), zzzxr);
        zzZ(zz1k.zzZu7(), zzzxr);
        zzZ(zz1k.zzZu5(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zz7O zz7o, zzZXR zzzxr) {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("a:fontRef");
        zzzydZzZlV.zzY("idx", (Object) zz84.zzIr(zz7o.zzZAU()), (Object) 0);
        zzBN.zzZ(zz7o.zzZQX(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zz7U zz7u, zzZXR zzzxr) {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("a:fillRef");
        zzzydZzZlV.zzY("idx", (Object) Integer.valueOf(zz7u.zzZC7()), (Object) 0);
        zzBN.zzZ(zz7u.zzZQX(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zz5U zz5u, zzZXR zzzxr) {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("a:lnRef");
        zzzydZzZlV.zzY("idx", (Object) Integer.valueOf(zz5u.zzZC7()), (Object) 0);
        zzBN.zzZ(zz5u.zzZQX(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zz8A zz8a, zzZXR zzzxr) {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("a:effectRef");
        zzzydZzZlV.zzY("idx", (Object) Integer.valueOf(zz8a.zzZC7()), (Object) 0);
        zzBN.zzZ(zz8a.zzZQX(), zzzxr);
        zzzydZzZlV.zzo();
    }
}
