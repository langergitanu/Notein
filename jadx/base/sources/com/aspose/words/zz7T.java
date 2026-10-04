package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz7T {
    private static void zzV(zzZXR zzzxr) {
        zzzxr.zzZlV().zzZ("a:grpFill", (String) null);
    }

    private static void zzY(zz7C zz7c, zzZXR zzzxr, boolean z) {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(z ? "w14:gsLst" : "a:gsLst");
        Iterator<zz7B> it = zz7c.zzZAA().iterator();
        while (it.hasNext()) {
            zzZ(it.next(), zzzxr, z);
        }
        zzzydZzZlV.zzo();
    }

    public static void zzZ(zz7X zz7x, zzZXR zzzxr, boolean z) throws Exception {
        if (zz7x == null) {
            return;
        }
        switch (zz7x.zzZQ4()) {
            case 0:
                zzZ("a", (zzH0) zz7x, zzzxr);
                return;
            case 1:
                zzZ((zz7C) zz7x, zzzxr, z);
                return;
            case 2:
                zzV(zzzxr);
                return;
            case 3:
                zzZ(zzzxr, z);
                return;
            case 4:
                zzZ((zz41) zz7x, zzzxr);
                return;
            case 5:
                zzZ((zz1C) zz7x, zzzxr, z);
                return;
            case 6:
                return;
            default:
                throw new IllegalArgumentException("Unexpected Dml fill type.");
        }
    }

    public static void zzZ(String str, zzH0 zzh0, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(com.aspose.words.internal.zzZKN.format("{0}:blipFill", str));
        if ((((long) zzh0.zzZQ0()) & 4294967295L) > 0) {
            zzzydZzZlV.zzZi("dpi", zzh0.zzZQ0());
        }
        if ((zzh0.zzZPY() instanceof zzGY) || !zzh0.zzZQ5()) {
            zzzydZzZlV.zzx("rotWithShape", zzh0.zzZQ5());
        }
        zzZ(zzh0.zzZQ1(), zzzxr, "a:blip");
        zzzydZzZlV.zzZ(zzh0.zzZPZ(), "a", "srcRect", false);
        zzh0.zzZPY().zzZ(zzzydZzZlV);
        zzzydZzZlV.zzo();
    }

    public static void zzZ(zzH1 zzh1, zzZXR zzzxr, String str) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        boolean z = zzzxr.getCompliance() == 2;
        zzzydZzZlV.zzY(str);
        zzZ(zzh1, zzzxr);
        if (zzh1.zzZQ8() != 0) {
            zzzydZzZlV.zz0("cstate", zz84.zzIv(zzh1.zzZQ8()));
        }
        zzzydZzZlV.zz0("xmlns:r", zzZX5.zz9(0, z));
        zz85.zzP(zzh1.zzZQ7(), zzzxr);
        zz7Z.zzZ(zzh1.getExtensions(), zzzxr);
        zzzydZzZlV.zzo();
    }

    public static void zzZ(zzH1 zzh1, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        if (zzh1.zzZQb()) {
            zzzydZzZlV.zz0("r:embed", zzzxr.zzYn(zzh1.zzZQa()));
        }
        if (com.aspose.words.internal.zzZYD.zzXk(zzh1.zzZQ9())) {
            zzzydZzZlV.zz0("r:link", zzzxr.zzNH(zzh1.zzZQ9()));
        }
    }

    private static void zzZ(zz41 zz41Var, zzZXR zzzxr) {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("a:pattFill");
        zzzydZzZlV.zz0("prst", zz84.zzIx(zz41Var.zzZwL()));
        if (!zz41Var.zzZwJ().isEmpty()) {
            zzzydZzZlV.zzY("a:fgClr");
            zzBN.zzZ(zz41Var.zzZwJ(), zzzxr);
            zzzydZzZlV.zzo();
        }
        if (!zz41Var.zzZwK().isEmpty()) {
            zzzydZzZlV.zzY("a:bgClr");
            zzBN.zzZ(zz41Var.zzZwK(), zzzxr);
            zzzydZzZlV.zzo();
        }
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zz7C zz7c, zzZXR zzzxr, boolean z) {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        String str = z ? "w14" : "a";
        zzzydZzZlV.zzY(com.aspose.words.internal.zzZKN.format("{0}:gradFill", str));
        zzzydZzZlV.zzA("flip", zz84.zzIO(zz7c.zzZAB()), "none");
        zzzydZzZlV.zzx("rotWithShape", zz7c.zzZQ5());
        zzY(zz7c, zzzxr, z);
        zz7c.zzZAz().zzZ(zzzydZzZlV, z);
        zzzydZzZlV.zzZ(zz7c.zzZAy(), str, "tileRect", false);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zz7B zz7b, zzZXR zzzxr, boolean z) {
        boolean z2 = zzzxr.getCompliance() == 2;
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        String str = z ? "w14" : "a";
        zzzydZzZlV.zzY(com.aspose.words.internal.zzZKN.format("{0}:gs", str));
        if (z2) {
            zz7b.setPosition(zz3W.zzXv(zz7b.getPosition()));
        }
        zzzydZzZlV.zz0(z ? "w14:pos" : "pos", zz3W.zzS(zz7b.getPosition(), z2));
        zzBN.zzW(str, zz7b.zzZQX(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zz1C zz1c, zzZXR zzzxr, boolean z) {
        zzBW zzbwZzZQX;
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        String str = z ? "w14" : "a";
        String str2 = com.aspose.words.internal.zzZKN.format("{0}:solidFill", str);
        if (zz1c.zzZQX().isEmpty() && zz1c.zzZQX().zzZHs() != 3) {
            zzbwZzZQX = zzBW.zzj(com.aspose.words.internal.zzPV.zzHZ);
            zzbwZzZQX.zze(zz1c.zzZQX().zzZNX());
        } else {
            zzbwZzZQX = zz1c.zzZQX();
        }
        zzzydZzZlV.zzY(str2);
        zzBN.zzW(str, zzbwZzZQX, zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zzZXR zzzxr, boolean z) {
        zzzxr.zzZlV().zzZ(z ? "w14:noFill" : "a:noFill", (String) null);
    }
}
