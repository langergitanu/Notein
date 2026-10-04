package com.aspose.words;

import androidx.core.text.util.LocalePreferences;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zz85 {
    public static void zzP(ArrayList<zz8E> arrayList, zzZXR zzzxr) throws Exception {
        for (zz8E zz8e : arrayList) {
            switch (zz8e.getType()) {
                case 0:
                    zzZ((zzHU) zz8e, zzzxr);
                    break;
                case 1:
                    zzZ(zzzxr);
                    break;
                case 2:
                    zzY(zzzxr);
                    break;
                case 3:
                    zzZ((zzHR) zz8e, zzzxr);
                    break;
                case 4:
                    zzZ((zzHQ) zz8e, zzzxr);
                    break;
                case 5:
                    zzZ((zzHP) zz8e, zzzxr);
                    break;
                case 6:
                    zzZ((zzHL) zz8e, zzzxr);
                    break;
                case 7:
                    zzZ((zzH3) zz8e, zzzxr);
                    break;
                case 8:
                    zzZ((zzGU) zz8e, zzzxr);
                    break;
                case 9:
                    zzZ((zzBV) zz8e, zzzxr);
                    break;
                case 10:
                    zzZ((zzBQ) zz8e, zzzxr);
                    break;
                case 11:
                    zzZ((zz8G) zz8e, zzzxr);
                    break;
                case 12:
                    zzZ((zz7W) zz8e, zzzxr);
                    break;
                case 13:
                    zzX(zzzxr);
                    break;
                case 14:
                    zzZ((zz6I) zz8e, zzzxr);
                    break;
                case 15:
                    zzZ((zz5E) zz8e, zzzxr);
                    break;
                case 16:
                    zzZ((zz0B) zz8e, zzzxr);
                    break;
                default:
                    throw new IllegalArgumentException("Unexpected Dml effect type.");
            }
        }
    }

    private static void zzX(zzZXR zzzxr) {
        zzzxr.zzZlV().zzZ("a:grayscl", (String) null);
    }

    private static void zzY(zzZXR zzzxr) {
        zzzxr.zzZlV().zzZ("a:alphaFloor", (String) null);
    }

    private static void zzZ(zzHU zzhu, zzZXR zzzxr) {
        boolean z = zzzxr.getCompliance() == 2;
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("a:alphaBiLevel");
        zzzydZzZlV.zz0("thresh", zz3W.zzS(zzhu.zzZQZ(), z));
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zzZXR zzzxr) {
        zzzxr.zzZlV().zzZ("a:alphaCeiling", (String) null);
    }

    private static void zzZ(zzHR zzhr, zzZXR zzzxr) {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("a:alphaInv");
        zzBN.zzZ(zzhr.zzZQX(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zzHQ zzhq, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("a:alphaMod");
        zzzydZzZlV.zzY("a:cont");
        zzP(zzhq.zzZQW(), zzzxr);
        zzzydZzZlV.zzo();
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zzHP zzhp, zzZXR zzzxr) {
        boolean z = zzzxr.getCompliance() == 2;
        double dZzZQV = zzhp.zzZQV();
        if (z) {
            dZzZQV = com.aspose.words.internal.zzZKQ.zzR(dZzZQV, 2);
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("a:alphaModFix");
        zzzydZzZlV.zz0("amt", zz3W.zzS(dZzZQV, z));
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zzHL zzhl, zzZXR zzzxr) {
        boolean z = zzzxr.getCompliance() == 2;
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("a:alphaRepl");
        zzzydZzZlV.zz0("a", zz3W.zzS(zzhl.zzZQU(), z));
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zzH3 zzh3, zzZXR zzzxr) {
        boolean z = zzzxr.getCompliance() == 2;
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("a:biLevel");
        zzzydZzZlV.zz0("thresh", zz3W.zzS(zzh3.zzZQZ(), z));
        zzzydZzZlV.zzo();
    }

    public static void zzZ(zzGU zzgu, zzZXR zzzxr) {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("a:blur");
        zzzydZzZlV.zzO("rad", zzgu.zzZPS());
        zzzydZzZlV.zzx("grow", zzgu.zzZPT());
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zzBV zzbv, zzZXR zzzxr) {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("a:clrChange");
        if (!zzbv.zzZFC()) {
            zzzydZzZlV.zzx("useA", zzbv.zzZFC());
        }
        zzzydZzZlV.zzY("a:clrFrom");
        zzBN.zzZ(zzbv.zzZFE(), zzzxr);
        zzzydZzZlV.zzo();
        zzzydZzZlV.zzY("a:clrTo");
        zzBN.zzZ(zzbv.zzZFD(), zzzxr);
        zzzydZzZlV.zzo();
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zzBQ zzbq, zzZXR zzzxr) {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("a:clrRepl");
        zzBN.zzZ(zzbq.zzZQX(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zz8G zz8g, zzZXR zzzxr) {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("a:duotone");
        zzBN.zzZ(zz8g.zzZCa(), zzzxr);
        zzBN.zzZ(zz8g.zzZC9(), zzzxr);
        zzzydZzZlV.zzo();
    }

    public static void zzZ(zz7W zz7w, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("a:fillOverlay");
        zzzydZzZlV.zz0("blend", zz84.zzIu(zz7w.zzZBl()));
        zz7T.zzZ(zz7w.getFill(), zzzxr, false);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zz6I zz6i, zzZXR zzzxr) {
        boolean z = zzzxr.getCompliance() == 2;
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("a:hsl");
        zzzydZzZlV.zzO("hue", zz6i.zzZzQ().getValue());
        zzzydZzZlV.zz0("lum", zz3W.zzS(zz6i.zzZzR(), z));
        zzzydZzZlV.zz0(LocalePreferences.FirstDayOfWeek.SATURDAY, zz3W.zzS(zz6i.zzZzS(), z));
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zz5E zz5e, zzZXR zzzxr) {
        boolean z = zzzxr.getCompliance() == 2;
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("a:lum");
        double brightness = (zz5e.getBrightness() * 2.0d) - 1.0d;
        if (com.aspose.words.internal.zzAN.zzZG(zz3W.zzXy(brightness)) != 0) {
            zzzydZzZlV.zz0("bright", zz3W.zzS(brightness, z));
        }
        double contrast = (zz5e.getContrast() * 2.0d) - 1.0d;
        if (com.aspose.words.internal.zzAN.zzZG(zz3W.zzXy(contrast)) != 0) {
            zzzydZzZlV.zz0("contrast", zz3W.zzS(contrast, z));
        }
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zz0B zz0b, zzZXR zzzxr) {
        boolean z = zzzxr.getCompliance() == 2;
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("a:tint");
        zzzydZzZlV.zz0("amt", zz3W.zzS(zz0b.zzZQV(), z));
        zzzydZzZlV.zz0("hue", zz3W.zzS(zz0b.zzGw(), z));
        zzzydZzZlV.zzo();
    }
}
