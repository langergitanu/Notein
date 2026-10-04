package com.aspose.words;

import androidx.core.text.util.LocalePreferences;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzBR extends zz39 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("hslClr", "prstClr", "schemeClr", "scrgbClr", "srgbClr", "sysClr", "alpha", "alphaMod", "alphaOff", "blue", "blueMod", "blueOff", "comp", "gamma", "gray", "green", "greenMod", "greenOff", "hue", "hueMod", "hueOff", "inv", "invGamma", "lum", "lumMod", "lumOff", "red", "redMod", "redOff", LocalePreferences.FirstDayOfWeek.SATURDAY, "satMod", "satOff", "shade", "tint");
    private zzYO3 zzZ88;
    private zzYU4 zzZ89;

    private zzBR(zzYU4 zzyu4, zzYO3 zzyo3) {
        this.zzZ89 = zzyu4;
        this.zzZ88 = zzyo3;
    }

    public static ArrayList<zzZCM> zzV(zzYU4 zzyu4, zzYO3 zzyo3) {
        return new zzBR(zzyu4, zzyo3).zzZFz();
    }

    public static zzBW zzW(zzYU4 zzyu4, zzYO3 zzyo3) {
        return new zzBR(zzyu4, zzyo3).zzZFB();
    }

    public static zzBW zzX(zzYU4 zzyu4, zzYO3 zzyo3) {
        String localName = zzyu4.getLocalName();
        zzBW zzbw = null;
        while (zzyu4.zzQ(localName)) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 0 || iZzTP == 1 || iZzTP == 2 || iZzTP == 3 || iZzTP == 4 || iZzTP == 5) {
                zzBW zzbwZzW = zzW(zzyu4, zzyo3);
                if (zzbwZzW != null) {
                    zzbw = zzbwZzW;
                }
            } else {
                zz39.zzK(zzyu4);
            }
        }
        return zzbw;
    }

    private zz40 zzZ(zz40 zz40Var) {
        zz40Var.setValue(zz3W.zzZ(this.zzZ89.zzV("val", ""), this.zzZ88));
        return zz40Var;
    }

    private zzBW zzZFA() {
        zz13 zz13Var = new zz13();
        zz13Var.setValue(this.zzZ89.zzV("val", ""));
        zz13Var.zzOk(this.zzZ89.zzV("lastClr", ""));
        zz13Var.zze(zzZFz());
        return zz13Var;
    }

    private zzBW zzZFB() {
        int iZzTP = zzUR.zzTP(this.zzZ89.getLocalName());
        if (iZzTP == 0) {
            return zzZFu();
        }
        if (iZzTP == 1) {
            return zzZFv();
        }
        if (iZzTP == 2) {
            return zzZFw();
        }
        if (iZzTP == 3) {
            return zzZFx();
        }
        if (iZzTP == 4) {
            return zzZFy();
        }
        if (iZzTP == 5) {
            return zzZFA();
        }
        zz39.zzK(this.zzZ89);
        return null;
    }

    private zzBW zzZFu() {
        zz6M zz6m = new zz6M();
        zz6m.zzW(new zzHK(this.zzZ89.zzX("hue", 0)));
        zz6m.zzXO(zz3W.zzZ(this.zzZ89.zzV("lum", ""), this.zzZ88));
        zz6m.zzXP(zz3W.zzZ(this.zzZ89.zzV(LocalePreferences.FirstDayOfWeek.SATURDAY, ""), this.zzZ88));
        zz6m.zze(zzZFz());
        return zz6m;
    }

    private zzBW zzZFv() {
        zz3H zz3h = new zz3H();
        zz3h.setValue(this.zzZ89.zzV("val", ""));
        zz3h.zze(zzZFz());
        return zz3h;
    }

    private zzBW zzZFw() {
        String strZzV = this.zzZ89.zzV("val", "");
        if ("phClr".equals(strZzV)) {
            zz3M zz3m = new zz3M();
            zz3m.zze(zzZFz());
            return zz3m;
        }
        zz2Q zz2q = new zz2Q();
        zz2q.setValue(zzY5L.zzAg(strZzV));
        zz2q.zze(zzZFz());
        return zz2q;
    }

    private zzBW zzZFx() {
        zz3Y zz3y = new zz3Y();
        zz3y.zzXD(zz3W.zzZ(this.zzZ89.zzV("r", ""), this.zzZ88));
        zz3y.zzXC(zz3W.zzZ(this.zzZ89.zzV("g", ""), this.zzZ88));
        zz3y.zzXB(zz3W.zzZ(this.zzZ89.zzV("b", ""), this.zzZ88));
        zz3y.zze(zzZFz());
        return zz3y;
    }

    private zzBW zzZFy() {
        zz6S zz6s = new zz6S();
        zz6s.setValue(this.zzZ89.zzV("val", ""));
        zz6s.zzOw(this.zzZ89.zzV("legacySpreadsheetColorIndex", null));
        zz6s.zze(zzZFz());
        return zz6s;
    }

    private ArrayList<zzZCM> zzZFz() {
        ArrayList<zzZCM> arrayList = new ArrayList<>();
        String localName = this.zzZ89.getLocalName();
        while (this.zzZ89.zzQ(localName)) {
            switch (zzUR.zzTP(this.zzZ89.getLocalName())) {
                case 6:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz40>) arrayList, zzZ(new zzHV()));
                    break;
                case 7:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz40>) arrayList, zzZ(new zzHN()));
                    break;
                case 8:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz40>) arrayList, zzZ(new zzHM()));
                    break;
                case 9:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz40>) arrayList, zzZ(new zzGX()));
                    break;
                case 10:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz40>) arrayList, zzZ(new zzGW()));
                    break;
                case 11:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz40>) arrayList, zzZ(new zzGV()));
                    break;
                case 12:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzBM>) arrayList, new zzBM());
                    break;
                case 13:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz7J>) arrayList, new zz7J());
                    break;
                case 14:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz76>) arrayList, new zz76());
                    break;
                case 15:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz40>) arrayList, zzZ(new zz73()));
                    break;
                case 16:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz40>) arrayList, zzZ(new zz72()));
                    break;
                case 17:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz40>) arrayList, zzZ(new zz71()));
                    break;
                case 18:
                    zza(arrayList);
                    break;
                case 19:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz40>) arrayList, zzZ(new zz6K()));
                    break;
                case 20:
                    zzb(arrayList);
                    break;
                case 21:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz6F>) arrayList, new zz6F());
                    break;
                case 22:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz6E>) arrayList, new zz6E());
                    break;
                case 23:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz40>) arrayList, zzZ(new zz5F()));
                    break;
                case 24:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz40>) arrayList, zzZ(new zz5C()));
                    break;
                case 25:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz40>) arrayList, zzZ(new zz5B()));
                    break;
                case 26:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz40>) arrayList, zzZ(new zz38()));
                    break;
                case 27:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz40>) arrayList, zzZ(new zz37()));
                    break;
                case 28:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz40>) arrayList, zzZ(new zz36()));
                    break;
                case 29:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz40>) arrayList, zzZ(new zz2X()));
                    break;
                case 30:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz40>) arrayList, zzZ(new zz2W()));
                    break;
                case 31:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz40>) arrayList, zzZ(new zz2V()));
                    break;
                case 32:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz40>) arrayList, zzZ(new zz2P()));
                    break;
                case 33:
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz40>) arrayList, zzZ(new zz0C()));
                    break;
                default:
                    zz39.zzK(this.zzZ89);
                    break;
            }
        }
        return arrayList;
    }

    private void zza(ArrayList<zzZCM> arrayList) {
        zz6L zz6l = new zz6L();
        zz6l.zzV(new zzHK(this.zzZ89.zzZ("val", 0.0d)));
        arrayList.add(zz6l);
    }

    private void zzb(ArrayList<zzZCM> arrayList) {
        zz6J zz6j = new zz6J();
        zz6j.zzV(new zzHK(this.zzZ89.zzZ("val", 0.0d)));
        arrayList.add(zz6j);
    }
}
