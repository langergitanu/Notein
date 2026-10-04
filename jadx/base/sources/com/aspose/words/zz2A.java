package com.aspose.words;

import com.huawei.hms.network.embedded.C18437z2;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz2A {
    public static void zzZ(zz2C zz2c, zzZXR zzzxr, boolean z) throws Exception {
        if (z || !(zz2c == null || zz2c.zzZvC())) {
            zzZYD zzzydZzZlV = zzzxr.zzZlV();
            zzzydZzZlV.zzY((zz2c == null || !zz2c.zzZuW()) ? "a:effectLst" : "a:effectDag");
            if (zz2c != null && zz2c.zzZuW()) {
                zzzydZzZlV.zz0("name", zz2c.zzZuV());
                zzzydZzZlV.zzA(C18437z2.f56754h, zz84.zzIh(zz2c.zzZuU()), "sib");
            }
            if (zz2c != null) {
                Iterator<zz2F> it = zz2c.iterator();
                while (it.hasNext()) {
                    zzZ(it.next(), zzzxr);
                }
            }
            zzzydZzZlV.zzo();
        }
    }

    private static void zzZ(zz2F zz2f, zzZXR zzzxr) throws Exception {
        switch (zz2f.zzZvh()) {
            case 0:
                zzZ((zz29) zz2f, zzzxr);
                return;
            case 1:
                zzZ((zz25) zz2f, zzzxr);
                return;
            case 2:
                zzZ((zz1W) zz2f, zzzxr);
                return;
            case 3:
                zzZ((zz1M) zz2f, zzzxr);
                return;
            case 4:
                zzZ((zz2I) zz2f, zzzxr);
                return;
            case 5:
                zzZ((zz27) zz2f, zzzxr, false);
                return;
            case 6:
                zzZ((zz21) zz2f, zzzxr, false);
                return;
            case 7:
                zzZ((zz1R) zz2f, zzzxr, false);
                return;
            default:
                throw new IllegalArgumentException("Unexpected Dml shape effect type.");
        }
    }

    private static void zzZ(zz1M zz1m, zzZXR zzzxr) {
        zzzxr.zzZlV().zzX("a:softEdge", "rad", Double.valueOf(zz1m.zzZPS()));
    }

    public static void zzZ(zz1R zz1r, zzZXR zzzxr, boolean z) {
        String str = z ? "w14" : "a";
        String str2 = com.aspose.words.internal.zzZKN.format("{0}:reflection", str);
        boolean z2 = zzzxr.getCompliance() == 2;
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(str2);
        zzzydZzZlV.zzO(zz56.zzZl(str, "blurRad"), zz1r.zzZuN());
        zzzydZzZlV.zz0(zz56.zzZl(str, "stA"), zz3W.zzS(zz1r.zzZuy(), z2));
        zzzydZzZlV.zz0(zz56.zzZl(str, "stPos"), zz3W.zzS(zz1r.zzZuw(), z2));
        zzzydZzZlV.zz0(zz56.zzZl(str, "endA"), zz3W.zzS(zz1r.zzZuz(), z2));
        zzzydZzZlV.zz0(zz56.zzZl(str, "endPos"), zz3W.zzS(zz1r.zzZux(), z2));
        zzzydZzZlV.zzO(zz56.zzZl(str, "dist"), zz1r.zzZuL());
        zzzydZzZlV.zzO(zz56.zzZl(str, "dir"), zz1r.zzZuM().getValue());
        zzzydZzZlV.zzO(zz56.zzZl(str, "fadeDir"), zz1r.zzZuv().getValue());
        zzzydZzZlV.zz0(zz56.zzZl(str, "sx"), zz3W.zzS(zz1r.zzZuH(), z2));
        zzzydZzZlV.zz0(zz56.zzZl(str, "sy"), zz3W.zzS(zz1r.zzZuG(), z2));
        zzzydZzZlV.zzO(zz56.zzZl(str, "kx"), zz1r.zzZuJ().getValue());
        zzzydZzZlV.zzO(zz56.zzZl(str, "ky"), zz1r.zzZuI().getValue());
        zzzydZzZlV.zz0(zz56.zzZl(str, "algn"), zz84.zzIw(zz1r.getAlignment()));
        if (!zz1r.zzZQ5()) {
            zzzydZzZlV.zzx(zz56.zzZl(str, "rotWithShape"), zz1r.zzZQ5());
        }
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zz1W zz1w, zzZXR zzzxr) {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("a:prstShdw");
        zzzydZzZlV.zz0("prst", zz84.zzIs(zz1w.zzZuE()));
        zzzydZzZlV.zzO("dist", zz1w.zzZuL());
        zzzydZzZlV.zzO("dir", com.aspose.words.internal.zzZKQ.zzS(zz1w.zzZuM().getValue(), 0));
        zzBN.zzZ(zz1w.zzZQX(), zzzxr);
        zzzydZzZlV.zzo();
    }

    public static void zzZ(zz21 zz21Var, zzZXR zzzxr, boolean z) {
        String str = z ? "w14" : "a";
        String str2 = z ? "w14:shadow" : "a:outerShdw";
        boolean z2 = zzzxr.getCompliance() == 2;
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(str2);
        zzzydZzZlV.zzO(zz56.zzZl(str, "blurRad"), zz21Var.zzZuN());
        zzzydZzZlV.zzO(zz56.zzZl(str, "dist"), zz21Var.zzZuL());
        zzzydZzZlV.zzO(zz56.zzZl(str, "dir"), com.aspose.words.internal.zzZKQ.zzS(zz21Var.zzZuM().getValue(), 0));
        zzzydZzZlV.zz0(zz56.zzZl(str, "sx"), zz3W.zzS(zz21Var.zzZuH(), z2));
        zzzydZzZlV.zz0(zz56.zzZl(str, "sy"), zz3W.zzS(zz21Var.zzZuG(), z2));
        zzzydZzZlV.zzO(zz56.zzZl(str, "kx"), com.aspose.words.internal.zzZKQ.zzS(zz21Var.zzZuJ().getValue(), 0));
        zzzydZzZlV.zzO(zz56.zzZl(str, "ky"), com.aspose.words.internal.zzZKQ.zzS(zz21Var.zzZuI().getValue(), 0));
        zzzydZzZlV.zz0(zz56.zzZl(str, "algn"), zz84.zzIw(zz21Var.getAlignment()));
        if (!zz21Var.zzZQ5()) {
            zzzydZzZlV.zzx(zz56.zzZl(str, "rotWithShape"), zz21Var.zzZQ5());
        }
        zzBN.zzW(str, zz21Var.zzZQX(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zz29 zz29Var, zzZXR zzzxr) throws Exception {
        zz85.zzZ(zz29Var.zzZuP(), zzzxr);
    }

    private static void zzZ(zz25 zz25Var, zzZXR zzzxr) {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("a:innerShdw");
        zzzydZzZlV.zzO("blurRad", zz25Var.zzZuN());
        zzzydZzZlV.zzO("dist", zz25Var.zzZuL());
        zzzydZzZlV.zzO("dir", zz25Var.zzZuM().getValue());
        zzBN.zzZ(zz25Var.zzZQX(), zzzxr);
        zzzydZzZlV.zzo();
    }

    public static void zzZ(zz27 zz27Var, zzZXR zzzxr, boolean z) {
        String str = z ? "w14" : "a";
        String str2 = com.aspose.words.internal.zzZKN.format("{0}:glow", str);
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(str2);
        zzzydZzZlV.zzO(zz56.zzZl(str, "rad"), zz27Var.zzZPS());
        zzBN.zzW(str, zz27Var.zzZQX(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zz2I zz2i, zzZXR zzzxr) {
        zz85.zzZ(zz2i.zzZvg(), zzzxr);
    }
}
